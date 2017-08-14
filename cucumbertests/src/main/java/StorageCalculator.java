
public class StorageCalculator {
    private int currentAmount;

    public StorageCalculator(int amount) { currentAmount = amount; }

    public void takeFilling(int amountTaken) { currentAmount = currentAmount - amountTaken; }

    public int getCurrentAmount() { return currentAmount; }
}
