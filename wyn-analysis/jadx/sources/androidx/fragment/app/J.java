package androidx.fragment.app;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1451o;
import j1.InterfaceC3073a;
import k1.InterfaceC3123j;
import k1.InterfaceC3127n;
import n3.C3592d;

/* loaded from: classes.dex */
public final class J extends O implements Y0.f, Y0.g, X0.O, X0.P, androidx.lifecycle.f0, androidx.activity.y, g.i, n3.f, i0, InterfaceC3123j {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f18323e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f18323e = fragmentActivity;
    }

    @Override // androidx.fragment.app.i0
    public final void a(F f10) {
        this.f18323e.onAttachFragment(f10);
    }

    @Override // k1.InterfaceC3123j
    public final void addMenuProvider(InterfaceC3127n interfaceC3127n) {
        this.f18323e.addMenuProvider(interfaceC3127n);
    }

    @Override // Y0.f
    public final void addOnConfigurationChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.addOnConfigurationChangedListener(interfaceC3073a);
    }

    @Override // X0.O
    public final void addOnMultiWindowModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.addOnMultiWindowModeChangedListener(interfaceC3073a);
    }

    @Override // X0.P
    public final void addOnPictureInPictureModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.addOnPictureInPictureModeChangedListener(interfaceC3073a);
    }

    @Override // Y0.g
    public final void addOnTrimMemoryListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.addOnTrimMemoryListener(interfaceC3073a);
    }

    @Override // androidx.fragment.app.M
    public final View b(int i5) {
        return this.f18323e.findViewById(i5);
    }

    @Override // androidx.fragment.app.M
    public final boolean c() {
        Window window = this.f18323e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // g.i
    public final g.h getActivityResultRegistry() {
        return this.f18323e.getActivityResultRegistry();
    }

    @Override // androidx.lifecycle.InterfaceC1457v
    public final AbstractC1451o getLifecycle() {
        return this.f18323e.mFragmentLifecycleRegistry;
    }

    @Override // androidx.activity.y
    public final androidx.activity.w getOnBackPressedDispatcher() {
        return this.f18323e.getOnBackPressedDispatcher();
    }

    @Override // n3.f
    public final C3592d getSavedStateRegistry() {
        return this.f18323e.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.f0
    public final androidx.lifecycle.e0 getViewModelStore() {
        return this.f18323e.getViewModelStore();
    }

    @Override // k1.InterfaceC3123j
    public final void removeMenuProvider(InterfaceC3127n interfaceC3127n) {
        this.f18323e.removeMenuProvider(interfaceC3127n);
    }

    @Override // Y0.f
    public final void removeOnConfigurationChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.removeOnConfigurationChangedListener(interfaceC3073a);
    }

    @Override // X0.O
    public final void removeOnMultiWindowModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.removeOnMultiWindowModeChangedListener(interfaceC3073a);
    }

    @Override // X0.P
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.removeOnPictureInPictureModeChangedListener(interfaceC3073a);
    }

    @Override // Y0.g
    public final void removeOnTrimMemoryListener(InterfaceC3073a interfaceC3073a) {
        this.f18323e.removeOnTrimMemoryListener(interfaceC3073a);
    }
}
