package com.waze.settings.i.a;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f37411a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f37412b;

    public l(ar arVar, h.g.a.a aVar) {
        this.f37411a = arVar;
        this.f37412b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f37412b.invoke()).getViewModelStore();
        ar arVar = this.f37411a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(q.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
