/*Description: Bacis calcuations to determine the production of a firm 
 */
package Econ;

/**
 *
 * @author dominque
 */
public class ProductionCost 
{
    /**
     * 
     * @param cost 
     * @param revenue 
     * @return cost - revenue
     */
    public static float Profit(float cost, float revenue)
    {
        return cost - revenue;
    }
    /**
     * 
     * @param InterestPaid The Interest Paid
     * @param PriceOfBond The price of bond
     * @return  the interest paid / The price of bond
     */
    public static float InterestRate(float InterestPaid, float PriceOfBond)
    {
     
        return InterestPaid / PriceOfBond;
    }
    /**
     * 
     * @param ActualReserves The actual reserves
     * @param RequiredReserves The required reserves
     * @return The actual reserves - The required reserves
     */
    public static float ExcessReserves(float ActualReserves, float RequiredReserves)
    {
        return ActualReserves - RequiredReserves;
    }
    /**
     * 
     * @param FixedCost The fixed cost
     * @param Output The actual output
     * @return The fixed cost / the actual output
     */
    public static float AverageFixedCost(float FixedCost, float Output)
    {
        return FixedCost / Output;
    }
    /**
     * 
     * @param VariableCost The variable cost
     * @param Output The actual output
     * @return The variable cost / The actual output
     */
    public static float AverageVariableCost(float VariableCost, float Output)
    {
        return VariableCost / Output;
    }
    /**
     * 
     * @param TotalCost The total cost
     * @param Output The actual output
     * @return The total cost / The actual output
     */
    public static float AverageTotalCost(float TotalCost, float Output)
    {
        return TotalCost / Output;
    }
    
    
    
    
    
}
