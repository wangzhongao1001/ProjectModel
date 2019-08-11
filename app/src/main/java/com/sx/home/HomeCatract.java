package com.sx.home;

public interface HomeCatract {
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
