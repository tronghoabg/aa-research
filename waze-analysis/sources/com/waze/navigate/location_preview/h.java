package com.waze.navigate.location_preview;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f31727a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f31728b;

    public h(ComponentActivity componentActivity, h.g.a.a aVar) {
        this.f31727a = componentActivity;
        this.f31728b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ComponentActivity componentActivity = this.f31727a;
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentActivity);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(bn.class), viewModelStore, defaultViewModelCreationExtras, bVarD, this.f31728b);
    }
}
