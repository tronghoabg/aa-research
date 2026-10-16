package com.waze.navigate.location_preview;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ap implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f31562a;

    public ap(ComponentActivity componentActivity) {
        this.f31562a = componentActivity;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ComponentActivity componentActivity = this.f31562a;
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentActivity);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(bn.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
