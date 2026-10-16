package com.google.b.d.b;

import com.google.d.m.a.ay;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class af implements ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f7083a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ay f7084b;

    af(x xVar, ay ayVar) {
        this.f7083a = xVar;
        this.f7084b = ayVar;
    }

    @Override // com.google.d.m.a.ay
    public final void onFailure(Throwable th) {
        h.g.b.x.f(th, "t");
        x xVarC = j.c(j.a(), this.f7083a);
        try {
            this.f7084b.onFailure(th);
        } finally {
        }
    }

    @Override // com.google.d.m.a.ay
    public final void onSuccess(Object obj) {
        x xVarC = j.c(j.a(), this.f7083a);
        try {
            this.f7084b.onSuccess(obj);
        } finally {
        }
    }
}
