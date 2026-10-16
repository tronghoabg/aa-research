package com.waze.planned_drive;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.ar f33179a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f33180b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f33181c;

    public ab(android.support.v4.app.ar arVar, h.g.a.a aVar, h.g.a.a aVar2) {
        this.f33179a = arVar;
        this.f33180b = aVar;
        this.f33181c = aVar2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f33180b.invoke()).getViewModelStore();
        android.support.v4.app.ar arVar = this.f33179a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(ch.class), viewModelStore, defaultViewModelCreationExtras, bVarD, this.f33181c);
    }
}
