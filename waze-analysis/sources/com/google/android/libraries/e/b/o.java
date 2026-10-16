package com.google.android.libraries.e.b;

import com.google.android.libraries.phenotype.client.stable.am;
import com.google.b.d.b.ah;
import com.google.d.m.a.af;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements af {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5887a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f5888b;

    public /* synthetic */ o(Object obj, int i2) {
        this.f5888b = i2;
        this.f5887a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.d.m.a.bm, java.lang.Object] */
    @Override // com.google.d.m.a.af
    public final bm a() {
        int i2 = this.f5888b;
        if (i2 == 0) {
            r rVar = (r) this.f5887a;
            return bd.j(bd.n(rVar.f5892b, ah.b(new am(rVar, 6)), rVar.f5894d));
        }
        if (i2 != 1) {
            ?? r2 = this.f5887a;
            return i2 != 2 ? r2 : r.d((r) r2);
        }
        ?? r22 = this.f5887a;
        int i3 = com.google.android.libraries.a.c.f5792a;
        return bd.k(r22, cf.y());
    }
}
