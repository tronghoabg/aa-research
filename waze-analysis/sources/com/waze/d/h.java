package com.waze.d;

import com.waze.ak;
import com.waze.al;
import com.waze.am;
import com.waze.an;
import com.waze.ao;
import com.waze.cf;
import com.waze.gi;
import com.waze.p;
import h.g.b.x;
import h.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements org.a.d.a.a, com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final ao f23271a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f23272b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f23273c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f23274d;

    public h(ao aoVar) {
        x.f(aoVar, "carManager");
        this.f23271a = aoVar;
        this.f23272b = h.g.a(new com.waze.ads.b(this, 4));
        this.f23273c = h.g.a(new com.waze.ads.b(this, 5));
    }

    static final void d(h hVar, boolean z) {
        ((gi) hVar.f23272b.getValue()).SetExternalDisplay(true != z ? 0 : 4);
    }

    public static final /* synthetic */ void e(h hVar, cf cfVar) {
        if ((cfVar instanceof an) || (cfVar instanceof ak)) {
            return;
        }
        if (cfVar instanceof al) {
            if (hVar.f23274d) {
                hVar.f().b();
            }
        } else {
            if (!(cfVar instanceof am)) {
                throw new i();
            }
            hVar.f23274d = true;
            hVar.f().a();
        }
    }

    private final p f() {
        return (p) this.f23273c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.shared_infra.a.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.d.f
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.d.f r0 = (com.waze.d.f) r0
            int r1 = r0.f23269c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23269c = r1
            goto L18
        L13:
            com.waze.d.f r0 = new com.waze.d.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f23267a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23269c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r5)
            goto L48
        L2f:
            e.b.c.b(r5)
            com.waze.ao r5 = r4.f23271a
            kotlinx.coroutines.b.ch r5 = r5.a()
            com.waze.d.g r2 = new com.waze.d.g
            r2.<init>(r4)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f23269c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.d.h.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return "CarConnectionAnalyticsSender";
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
