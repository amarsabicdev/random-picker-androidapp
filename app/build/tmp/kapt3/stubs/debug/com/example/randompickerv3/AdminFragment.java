package com.example.randompickerv3;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u001cH\u0002J \u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u001eH\u0002J&\u0010\'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/example/randompickerv3/AdminFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/randompickerv3/test/CommunicationInterface;", "()V", "_binding", "Lcom/example/randompickerv3/databinding/FragmentAdminBinding;", "adapter", "Lcom/example/randompickerv3/RecycleViewAdapter/UserRecyclerViewAdapter;", "binding", "getBinding", "()Lcom/example/randompickerv3/databinding/FragmentAdminBinding;", "lIButton", "Landroid/widget/Button;", "getLIButton", "()Landroid/widget/Button;", "setLIButton", "(Landroid/widget/Button;)V", "userList", "Ljava/util/ArrayList;", "Lcom/example/randompicker/Users/User;", "Lkotlin/collections/ArrayList;", "getUserList", "()Ljava/util/ArrayList;", "setUserList", "(Ljava/util/ArrayList;)V", "userViewModel", "Lcom/example/randompickerv3/Users/UserViewModel;", "adminFandRVAdapterComm", "", "viewT", "Landroid/view/View;", "user", "displayStudentsList", "itemGestigure", "viewCG", "userCG", "userViewModelCG", "listItemDelete", "view", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class AdminFragment extends androidx.fragment.app.Fragment implements com.example.randompickerv3.test.CommunicationInterface {
    @org.jetbrains.annotations.Nullable
    private com.example.randompickerv3.databinding.FragmentAdminBinding _binding;
    private com.example.randompickerv3.Users.UserViewModel userViewModel;
    private com.example.randompickerv3.RecycleViewAdapter.UserRecyclerViewAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.randompicker.Users.User> userList;
    public android.widget.Button lIButton;
    
    public AdminFragment() {
        super();
    }
    
    private final com.example.randompickerv3.databinding.FragmentAdminBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.randompicker.Users.User> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.randompicker.Users.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getLIButton() {
        return null;
    }
    
    public final void setLIButton(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void itemGestigure(android.view.View viewCG, com.example.randompicker.Users.User userCG, com.example.randompickerv3.Users.UserViewModel userViewModelCG) {
    }
    
    private final void listItemDelete(com.example.randompicker.Users.User user, android.view.View view) {
    }
    
    private final void displayStudentsList() {
    }
    
    @java.lang.Override
    public void adminFandRVAdapterComm(@org.jetbrains.annotations.NotNull
    android.view.View viewT, @org.jetbrains.annotations.NotNull
    com.example.randompicker.Users.User user) {
    }
}