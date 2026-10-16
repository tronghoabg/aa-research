package androidx.navigation.fragment;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 12\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u00062"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroid/support/v4/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "navHostController", "Landroidx/navigation/NavHostController;", "getNavHostController$navigation_fragment", "()Landroidx/navigation/NavHostController;", "navHostController$delegate", "Lkotlin/Lazy;", "viewParent", "Landroid/view/View;", "graphId", "", "defaultNavHost", "", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateNavHostController", "onCreateNavController", "createFragmentNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "containerId", "getContainerId", "()I", "onViewCreated", "view", "onInflate", "attrs", "Landroid/util/AttributeSet;", "onSaveInstanceState", "outState", "onDestroyView", "Companion", "navigation-fragment"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, 1, defpackage.abnt.b}, xi = 48)
public class NavHostFragment extends android.support.v4.app.Fragment {
    public int a;
    private final defpackage.afar b = new defpackage.afay(new ewn(this));
    private android.view.View c;
    private boolean d;

    public static final defpackage.eva b(android.support.v4.app.Fragment fragment) {
        for (android.support.v4.app.Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof androidx.navigation.fragment.NavHostFragment) {
                return ((androidx.navigation.fragment.NavHostFragment) parentFragment).c();
            }
            android.support.v4.app.Fragment fragment2 = parentFragment.getParentFragmentManager().p;
            if (fragment2 instanceof androidx.navigation.fragment.NavHostFragment) {
                return ((androidx.navigation.fragment.NavHostFragment) fragment2).c();
            }
        }
        android.view.View view = fragment.getView();
        if (view != null) {
            return defpackage.ebo.l(view);
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(fragment, "Fragment ", " does not have a NavController set"));
    }

    public final int a() {
        int id = getId();
        if (id == 0 || id == -1) {
            return 2131429011;
        }
        return id;
    }

    public final defpackage.eva c() {
        return (defpackage.eva) this.b.a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(android.content.Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.d) {
            defpackage.w wVar = new defpackage.w(getParentFragmentManager());
            wVar.l(this);
            wVar.i(false, true);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        c();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            defpackage.w wVar = new defpackage.w(getParentFragmentManager());
            wVar.l(this);
            wVar.i(false, true);
        }
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        layoutInflater.getClass();
        android.content.Context context = layoutInflater.getContext();
        context.getClass();
        android.support.v4.app.FragmentContainerView fragmentContainerView = new android.support.v4.app.FragmentContainerView(context);
        fragmentContainerView.setId(a());
        return fragmentContainerView;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        android.view.View view = this.c;
        if (view != null && defpackage.ebo.l(view) == c()) {
            view.setTag(2131429009, null);
        }
        this.c = null;
    }

    @Override // android.support.v4.app.Fragment
    public final void onInflate(android.content.Context context, android.util.AttributeSet attributeSet, android.os.Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.evy.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.a = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.ewq.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m16x22bc4f96(android.os.Bundle bundle) {
        bundle.getClass();
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        view.getClass();
        if (!(view instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException(defpackage.a.bl(view, "created host view ", " is not a ViewGroup"));
        }
        view.setTag(2131429009, c());
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.getParent() != null) {
            java.lang.Object parent = viewGroup.getParent();
            parent.getClass();
            android.view.View view2 = (android.view.View) parent;
            this.c = view2;
            view2.getClass();
            if (view2.getId() == getId()) {
                android.view.View view3 = this.c;
                view3.getClass();
                view3.setTag(2131429009, c());
            }
        }
    }
}
