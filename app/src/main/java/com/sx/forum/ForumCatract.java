package com.sx.forum;

public interface ForumCatract {
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
