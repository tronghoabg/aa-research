package com.waze.ap.b;

import e.a.cn;
import e.a.cp;
import e.a.cq;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static volatile cq f15091a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile cq f15092b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile cq f15093c;

    private o() {
    }

    public static n a(e.a.i iVar) {
        return (n) n.newStub(new m(), iVar);
    }

    public static cq b() {
        cq cqVarA;
        cq cqVar = f15091a;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (o.class) {
            cqVarA = f15091a;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.insightsserving.InsightsServingExternal", "getInsightConfigurations"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(b.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(d.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f15091a = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq c() {
        cq cqVarA;
        cq cqVar = f15093c;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (o.class) {
            cqVarA = f15093c;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.insightsserving.InsightsServingExternal", "getLiveMatches"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(f.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(h.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f15093c = cqVarA;
            }
        }
        return cqVarA;
    }

    public static cq d() {
        cq cqVarA;
        cq cqVar = f15092b;
        if (cqVar != null) {
            return cqVar;
        }
        synchronized (o.class) {
            cqVarA = f15092b;
            if (cqVarA == null) {
                cn cnVarA = cq.a();
                cnVarA.f(cp.f46544a);
                cnVarA.b(cq.e("waze.insightsserving.InsightsServingExternal", "getQuestionByTrigger"));
                cnVarA.e();
                cnVarA.c(e.a.g.a.c.a(j.getDefaultInstance()));
                cnVarA.d(e.a.g.a.c.a(l.getDefaultInstance()));
                cqVarA = cnVarA.a();
                f15092b = cqVarA;
            }
        }
        return cqVarA;
    }

    public static boolean e(String str) {
        if (str != null) {
            return x.n(str, "gps") || x.n(str, "Car-GPS");
        }
        return false;
    }

    public /* synthetic */ o(byte[] bArr, byte[] bArr2) {
    }
}
