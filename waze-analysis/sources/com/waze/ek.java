package com.waze;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ek implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f23654a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23655b;

    public ek(ComponentActivity componentActivity, int i2) {
        this.f23655b = i2;
        this.f23654a = componentActivity;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f23655b;
        if (i2 == 0) {
            ComponentActivity componentActivity = this.f23654a;
            ViewModelStore viewModelStore = componentActivity.getViewModelStore();
            CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentActivity);
            int i3 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(ez.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
        }
        ComponentActivity componentActivity2 = this.f23654a;
        if (i2 != 1) {
            ViewModelStore viewModelStore2 = componentActivity2.getViewModelStore();
            CreationExtras defaultViewModelCreationExtras2 = componentActivity2.getDefaultViewModelCreationExtras();
            org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(componentActivity2);
            int i4 = h.g.b.ar.f48106a;
            return org.a.b.c.a.a(new h.g.b.m(co.class), viewModelStore2, defaultViewModelCreationExtras2, bVarD2, null);
        }
        ViewModelStore viewModelStore3 = componentActivity2.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras3 = componentActivity2.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(componentActivity2);
        int i5 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(dt.class), viewModelStore3, defaultViewModelCreationExtras3, bVarD3, null);
    }
}
