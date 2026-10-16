package com.waze.map.main;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.ar f29450a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f29451b;

    public o(android.support.v4.app.ar arVar, h.g.a.a aVar) {
        this.f29450a = arVar;
        this.f29451b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f29451b.invoke()).getViewModelStore();
        android.support.v4.app.ar arVar = this.f29450a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(bm.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
