package com.waze.profile;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f33384a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f33385b;

    public f(ar arVar, h.g.a.a aVar) {
        this.f33384a = arVar;
        this.f33385b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f33385b.invoke()).getViewModelStore();
        ar arVar = this.f33384a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(h.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
