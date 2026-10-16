package com.waze.trip_overview.c.a;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f41150a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f41151b;

    public aa(ar arVar, h.g.a.a aVar) {
        this.f41150a = arVar;
        this.f41151b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f41151b.invoke()).getViewModelStore();
        ar arVar = this.f41150a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(ao.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
