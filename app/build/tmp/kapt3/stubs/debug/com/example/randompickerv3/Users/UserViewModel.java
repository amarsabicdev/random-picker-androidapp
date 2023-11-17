package com.example.randompickerv3.Users;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/randompickerv3/Users/UserViewModel;", "Landroidx/lifecycle/ViewModel;", "userDao", "Lcom/example/randompicker/Users/UserDao;", "(Lcom/example/randompicker/Users/UserDao;)V", "getUsers", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/randompicker/Users/User;", "getGetUsers", "()Landroidx/lifecycle/LiveData;", "deleteUser", "Lkotlinx/coroutines/Job;", "user", "insertUser", "updateUser", "app_debug"})
public final class UserViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.randompicker.Users.UserDao userDao = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.randompicker.Users.User>> getUsers = null;
    
    public UserViewModel(@org.jetbrains.annotations.NotNull
    com.example.randompicker.Users.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.randompicker.Users.User>> getGetUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertUser(@org.jetbrains.annotations.NotNull
    com.example.randompicker.Users.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateUser(@org.jetbrains.annotations.NotNull
    com.example.randompicker.Users.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteUser(@org.jetbrains.annotations.NotNull
    com.example.randompicker.Users.User user) {
        return null;
    }
}