package com.waze.o;

import e.a.cn;
import e.a.cp;
import e.a.cq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ad {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f32626a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f32627b;

    private ad() {
    }

    public static ac h(e.a.i iVar) {
        return (ac) ac.newStub(new ab(), iVar);
    }

    public static cq i() {
        cq cqVarA;
        cq cqVar = f32627b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ad.class) {
            cqVarA = f32627b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("waze.companinio.proto.CompaninioServiceExternal", "Chat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(x.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(aa.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f32627b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq j() {
        cq cqVarA;
        cq cqVar = f32626a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (ad.class) {
            cqVarA = f32626a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46546c);
                cnVarA.b(cq.e("waze.companinio.proto.CompaninioServiceExternal", "StartChat"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(aw.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(ay.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f32626a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static void k(ah ahVar, ag agVar) {
        h.g.b.x.f(ahVar, "value");
        agVar.b(ahVar);
    }

    public static com.waze.t.b.as m(org.a.d.k.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        return new com.waze.t.b.as();
    }

    public /* synthetic */ ad(byte[] bArr, byte[] bArr2) {
    }
}
