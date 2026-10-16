package com.waze.copilot.presentation;

import android.support.v4.app.ar;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f23130a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f23131b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f23132c;

    public m(ar arVar, h.g.a.a aVar, h.g.a.a aVar2) {
        this.f23130a = arVar;
        this.f23131b = aVar;
        this.f23132c = aVar2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f23131b.invoke()).getViewModelStore();
        ar arVar = this.f23130a;
        CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(CopilotMarketplaceViewModel.class), viewModelStore, defaultViewModelCreationExtras, bVarD, this.f23132c);
    }
}
