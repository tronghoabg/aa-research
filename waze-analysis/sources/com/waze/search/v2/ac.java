package com.waze.search.v2;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ComponentActivity f36141a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f36142b;

    public ac(ComponentActivity componentActivity, h.g.a.a aVar) {
        this.f36141a = componentActivity;
        this.f36142b = aVar;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        ComponentActivity componentActivity = this.f36141a;
        ViewModelStore viewModelStore = componentActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentActivity);
        int i2 = h.g.b.ar.f48106a;
        return org.a.b.c.a.a(new h.g.b.m(fi.class), viewModelStore, defaultViewModelCreationExtras, bVarD, this.f36142b);
    }
}
