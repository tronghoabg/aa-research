package com.waze.at.b;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f15659a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f15660b;

    public c(ar arVar, h.g.a.a aVar) {
        this.f15659a = arVar;
        this.f15660b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f15660b.invoke()).getViewModelStore();
        ar arVar = this.f15659a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new m(f.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
