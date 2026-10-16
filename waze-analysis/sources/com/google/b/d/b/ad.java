package com.google.b.d.b;

import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad implements com.google.d.m.a.ag {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f7079a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.d.m.a.ag f7080b;

    ad(x xVar, com.google.d.m.a.ag agVar) {
        this.f7079a = xVar;
        this.f7080b = agVar;
    }

    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        x xVarC = j.c(j.a(), this.f7079a);
        try {
            bm bmVarApply = this.f7080b.apply(obj);
            if (bmVarApply != null) {
                return bmVarApply;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.f7080b + "]";
    }
}
