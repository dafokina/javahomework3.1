public class BonusMilesService {
    public int calculate(int cost) {
        int percent = 20;
        int bonus = cost / percent;

        return bonus;
    }
}
