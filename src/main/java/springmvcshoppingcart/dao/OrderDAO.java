package springmvcshoppingcart.dao;


import java.util.List;

import springmvcshoppingcart.model.CartInfo;
import springmvcshoppingcart.model.OrderDetailInfo;
import springmvcshoppingcart.model.OrderInfo;
import springmvcshoppingcart.model.PaginationResult;

public interface OrderDAO {

   public void saveOrder(CartInfo cartInfo);

   public PaginationResult<OrderInfo> listOrderInfo(int page,
           int maxResult, int maxNavigationPage);
   
   public OrderInfo getOrderInfo(String orderId);
   
   public List<OrderDetailInfo> listOrderDetailInfos(String orderId);

}