/*
 * Description: The ElasticDemand class, holds methods to perform different computations to determine different measures of elastice demand
 * 
 */
package Econ;

/**
 *
 * @author dominque
 */
public class ElasticDemand 
{
    /**
     * 
     * @param ChgQuantityDemand change in quantity demanded
     * @param ChgPrice change in price
     * @return change in quantity demanded / change in price
     */
    public static float PriceElasticDemand(float ChgQuantityDemand, float ChgPrice)
    {
        return ChgQuantityDemand / ChgPrice;
    }
    /**
     * 
     * @param ChgQuantityDemand change in quantity demanded
     * @param ChgIncome change in income
     * @return change in quantity demanded / change in income
     */
    public static float IncomeElasticDemand(float ChgQuantityDemand, float ChgIncome)
    {
        return ChgQuantityDemand / ChgIncome;
    }
    /**
     * 
     * @param ChgQuantityDemand change in quantity demanded
     * @param ChgPrice change in price
     * @return change in quantity demanded / change in price
     */
    public static float CrossElasticDemand(float ChgQuantityDemand, float ChgPrice)
    {
        return ChgQuantityDemand / ChgPrice;
    }
    
    
}
