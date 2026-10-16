package com.waze.location;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aj implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f25255a;

    public aj(ComponentActivity componentActivity) {
        this.f25255a = componentActivity;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ComponentActivity componentActivity = this.f25255a;
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentActivity);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(ax.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
    }
}
