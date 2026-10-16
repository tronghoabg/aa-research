package com.waze.settings.a.a.b;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f36728a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f36729b;

    public e(ar arVar, h.g.a.a aVar) {
        this.f36728a = arVar;
        this.f36729b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f36729b.invoke()).getViewModelStore();
        ar arVar = this.f36728a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new m(j.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
