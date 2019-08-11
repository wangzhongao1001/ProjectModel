package com.sx.shopping;

public interface ShoppingCatract  {
    interface  showView{
        void   onSuccess(String  error);
        void   onError(String  error);
    }
    interface   showModel{
        interface  Callback{
            void   onSuccess(String  error);
            void   onError(String  error);
        }
        void    data(Callback callback);
    }
    interface    showPresenter<T>{
        void   http();
    }
}
