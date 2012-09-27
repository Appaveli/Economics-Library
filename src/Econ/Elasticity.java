/*
 * Description: these methods calculates price elasticity, and price elasticity midpoint
 */
package Econ;

/**
 *
 * @author dominque
 */
public class Elasticity 
{
    /**
     * 
     * @param Q1 Quantity 1
     * @param Q2 Quantity 3
     * @param P1 Price 1
     * @param P2 Price 2
     * @return Quantity 1 - Quantity 2 / Quantity 2 / Price 1 - Price 2 / Price 2
     */
    public static float PriceElasticity(float Q1, float Q2, float P1, float P2)
    {
        return (Q1 - Q2) / Q2 / (P1 - P2) / P2;
    }
    /**
     * 
     * @param Q1 Quantity 1
     * @param Q2 Quantity 3
     * @param P1 Price 1
     * @param P2 Price 2
     * @return ((Quantity 1 - Quantity) 2 / (Quantity 1 + Quantity 2)) /2  / ((Price 1 - Price 2) / ((Price 1 + Price 2) / 2)
     */
    public static float PriceElasticityMidpoint(float Q1, float Q2, float P1, float P2)
    {
        return ((Q1 - Q2) / ((Q1 + Q2) /2)) / ((P1 - P2) / ((P1 + P2) /2));
    }
    
    
    
}
