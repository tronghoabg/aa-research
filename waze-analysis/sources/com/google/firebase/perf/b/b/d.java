package com.google.firebase.perf.b.b;

import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final a f10294a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f10295b;

    private d(a aVar, int i2) {
        this.f10295b = i2;
        this.f10294a = aVar;
    }

    public static d b(a aVar) {
        return new d(aVar, 0);
    }

    public static d c(a aVar) {
        return new d(aVar, 1);
    }

    public final com.google.firebase.g.c a() {
        int i2 = this.f10295b;
        a aVar = this.f10294a;
        if (i2 != 0) {
            com.google.firebase.g.c cVarB = aVar.b();
            r.g(cVarB);
            return cVarB;
        }
        com.google.firebase.g.c cVarC = aVar.c();
        r.g(cVarC);
        return cVarC;
    }

    @Override // g.a.a, f.a.a
    public final /* synthetic */ Object get() {
        return this.f10295b != 0 ? a() : a();
    }
}
