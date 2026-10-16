package com.waze.r;

import android.content.ComponentCallbacks;
import com.waze.b.u;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentCallbacks f33497a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33498b;

    public c(ComponentCallbacks componentCallbacks, int i2) {
        this.f33498b = i2;
        this.f33497a = componentCallbacks;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        int i2 = this.f33498b;
        if (i2 == 0) {
            return h.i((h) this.f33497a);
        }
        if (i2 == 1) {
            return h.e((h) this.f33497a);
        }
        if (i2 == 2) {
            return h.g((h) this.f33497a);
        }
        ComponentCallbacks componentCallbacks = this.f33497a;
        if (i2 == 3) {
            return h.h((h) componentCallbacks);
        }
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(componentCallbacks);
        int i3 = ar.f48106a;
        return bVarD.a(new m(u.class), null, null);
    }

    public /* synthetic */ c(h hVar, int i2) {
        this.f33498b = i2;
        this.f33497a = hVar;
    }
}
