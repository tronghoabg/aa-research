package com.google.b.d.b;

import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac implements com.google.d.m.a.af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f7077a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.d.m.a.af f7078b;

    ac(x xVar, com.google.d.m.a.af afVar) {
        this.f7077a = xVar;
        this.f7078b = afVar;
    }

    @Override // com.google.d.m.a.af
    public final bm a() {
        w wVarA = j.a();
        x xVarC = j.c(wVarA, this.f7077a);
        try {
            bm bmVarA = this.f7078b.a();
            j.c(wVarA, xVarC);
            h.g.b.x.e(bmVarA, "wrapInTrace(...)");
            return bmVarA;
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.f7078b + "]";
    }
}
