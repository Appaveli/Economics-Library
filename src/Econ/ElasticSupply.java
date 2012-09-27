/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Econ;

/**
 *
 * @author dominque
 */

public class ElasticSupply 
{
    /**
     * 
     * @param ChgQuantitySupply change in quantity supply
     * @param ChgPrice change in price
     * @return change in quantity supply  / change in price
     */
    public static float PriceElasticSupply(float ChgQuantitySupply, float ChgPrice)
    {
        return ChgQuantitySupply / ChgPrice;
    }
    
}
