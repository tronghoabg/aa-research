package com.waze.asks;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.ar f15492a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f15493b;

    public ag(android.support.v4.app.ar arVar, h.g.a.a aVar) {
        this.f15492a = arVar;
        this.f15493b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f15493b.invoke()).getViewModelStore();
        android.support.v4.app.ar arVar = this.f15492a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(bj.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
