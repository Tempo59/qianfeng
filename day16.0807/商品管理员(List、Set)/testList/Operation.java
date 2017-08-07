package testList;
import java.util.List;

public interface Operation {
	//添加商品
	public abstract void addGood(List<Good> list, Good good);
	//按编号删除商品
	public abstract void deleteById(List<Good> list, int id);
	//按名称删除商品
	public abstract void deleteByName(List<Good> list, String name);
	//按商品销量修改商品的零售价
	public abstract void setPriceBySales(List<Good> list, int sales, double newPrice);
	//按商品进价修改商品的批发价
	public abstract void setPriceByCost(List<Good> list, double cost, double newPriceAll);
	//按零售价查询商品
	public abstract List<Good> queryByPriceOne(List<Good> list, double priceOne);
	//按批发价查询商品
	public abstract List<Good> queryByPriceAll(List<Good> list, double priceAll);
	//查询所有商品
	public abstract void queryAll(List<Good> list);
}
