package com.google.android.libraries.e.b;

import com.google.android.libraries.phenotype.client.stable.am;
import com.google.b.d.b.ah;
import com.google.b.d.b.aj;
import com.google.d.b.ai;
import com.google.d.m.a.ag;
import com.google.d.m.a.as;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f5912a;

    /* renamed from: b, reason: collision with root package name */
    private final bm f5913b;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.b.d.a.g f5915d;

    /* renamed from: h, reason: collision with root package name */
    private final r f5919h;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.b.d.a.g f5916e = new com.google.b.d.a.g(new u(this), cf.y());

    /* renamed from: f, reason: collision with root package name */
    private final Object f5917f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private List f5918g = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final as f5914c = as.b();

    x(r rVar, bm bmVar) {
        this.f5919h = rVar;
        this.f5913b = bmVar;
        this.f5912a = rVar.i();
        this.f5915d = new com.google.b.d.a.g(new o(rVar, 0), cf.y());
        h(new am(this, 9));
    }

    public final bm b() {
        bm bmVarN;
        ai.g(com.google.d.a.a.c.a());
        com.google.b.d.a.g gVar = this.f5916e;
        if (gVar.g()) {
            bmVarN = this.f5919h.l();
        } else {
            com.google.b.d.b.p pVarD = com.google.b.d.b.ai.d("Get ".concat(String.valueOf(this.f5912a)), aj.f7088a);
            try {
                bmVarN = bd.n(gVar.c(), ah.b(new am(this, 10)), cf.y());
                pVarD.a(bmVarN);
                pVarD.close();
            } catch (Throwable th) {
                try {
                    pVarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bd.j(this.f5913b);
        return bd.j(bmVarN);
    }

    public final bm c(com.google.d.b.t tVar, Executor executor) {
        ag agVarB = ah.b(new am(tVar, 8));
        ai.g(com.google.d.a.a.c.a());
        com.google.b.d.b.p pVarD = com.google.b.d.b.ai.d("Update ".concat(String.valueOf(this.f5912a)), aj.f7088a);
        try {
            bm bmVarC = this.f5916e.c();
            as asVar = this.f5914c;
            asVar.c(new o(bmVarC, 3), cf.y());
            bm bmVarC2 = asVar.c(ah.a(new s(this, bmVarC, agVarB, executor, 0)), cf.y());
            bd.r(bmVarC2, bmVarC);
            bd.j(this.f5913b);
            bm bmVarI = com.google.android.material.focus.d.i(bmVarC2);
            pVarD.a(bmVarI);
            pVarD.close();
            return bmVarI;
        } finally {
        }
    }

    public final void h(ag agVar) {
        synchronized (this.f5917f) {
            this.f5918g.add(agVar);
        }
    }
}
