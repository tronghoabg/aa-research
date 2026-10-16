package k4;

import Ef.C0502n;
import Va.M6;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import ef.C2515C;

/* loaded from: classes.dex */
public final class c implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0502n f39262a;

    public c(C0502n c0502n) {
        this.f39262a = c0502n;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1457v interfaceC1457v) {
        M6.d(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1457v interfaceC1457v) {
        this.f39262a.resumeWith(C2515C.f34653a);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1457v interfaceC1457v) {
    }
}
