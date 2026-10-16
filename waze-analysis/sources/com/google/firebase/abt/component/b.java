package com.google.firebase.abt.component;

import com.google.firebase.components.d;
import com.google.firebase.components.g;
import com.google.firebase.concurrent.z;
import com.google.firebase.perf.FirebasePerfRegistrar;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f8833a;

    public /* synthetic */ b(int i2) {
        this.f8833a = i2;
    }

    @Override // com.google.firebase.components.g
    public final Object a(d dVar) {
        int i2 = this.f8833a;
        return i2 != 0 ? i2 != 1 ? FirebasePerfRegistrar.providesFirebasePerformance(dVar) : z.f9048a : AbtRegistrar.lambda$getComponents$0(dVar);
    }
}
