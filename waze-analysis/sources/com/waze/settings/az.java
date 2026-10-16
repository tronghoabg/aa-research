package com.waze.settings;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.support.v4.app.ar f36808a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f36809b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f36810c;

    public az(android.support.v4.app.ar arVar, h.g.a.a aVar, int i2) {
        this.f36810c = i2;
        this.f36808a = arVar;
        this.f36809b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f36810c;
        if (i2 == 0) {
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) this.f36809b.invoke()).getViewModelStore();
            android.support.v4.app.ar arVar = this.f36808a;
            CreationExtras defaultViewModelCreationExtras = arVar.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(arVar);
            int i3 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(gy.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
        }
        if (i2 == 1) {
            ViewModelStore viewModelStore2 = ((ViewModelStoreOwner) this.f36809b.invoke()).getViewModelStore();
            android.support.v4.app.ar arVar2 = this.f36808a;
            CreationExtras defaultViewModelCreationExtras2 = arVar2.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(arVar2);
            int i4 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(bb.class), viewModelStore2, defaultViewModelCreationExtras2, bVarD2, null);
        }
        h.g.a.a aVar = this.f36809b;
        if (i2 != 2) {
            ViewModelStore viewModelStore3 = ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
            android.support.v4.app.ar arVar3 = this.f36808a;
            CreationExtras defaultViewModelCreationExtras3 = arVar3.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(arVar3);
            int i5 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(gy.class), viewModelStore3, defaultViewModelCreationExtras3, bVarD3, null);
        }
        ViewModelStore viewModelStore4 = ((ViewModelStoreOwner) aVar.invoke()).getViewModelStore();
        android.support.v4.app.ar arVar4 = this.f36808a;
        CreationExtras defaultViewModelCreationExtras4 = arVar4.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD4 = org.chromium.support_lib_boundary.a.b.d(arVar4);
        int i6 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(gy.class), viewModelStore4, defaultViewModelCreationExtras4, bVarD4, null);
    }
}
