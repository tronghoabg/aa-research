package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436z implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f18570a;

    public C1436z(F f10) {
        this.f18570a = f10;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        View view;
        if (enumC1449m != EnumC1449m.ON_STOP || (view = this.f18570a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
