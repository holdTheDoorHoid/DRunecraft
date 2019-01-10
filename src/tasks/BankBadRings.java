package tasks;

import org.rspeer.runetek.api.commons.Time;
import org.rspeer.runetek.api.component.Bank;
import org.rspeer.runetek.api.component.tab.Inventory;
import task_structure.TreeTask;

public class BankBadRings extends TreeTask {
    public BankBadRings() {
        super(true);
    }

    @Override
    public boolean validate() {
        return false;
    }

    @Override
    public int execute() {
        Bank.depositAll("Ring of dueling(1)");
        Time.sleepUntil(() -> !Inventory.contains("Ring of dueling(1)"), 4000);
        return super.execute();
    }
}
