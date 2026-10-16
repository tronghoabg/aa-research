package com.waze.car_lib.n;

import com.waze.car_lib.r.co;
import com.waze.sdk.bq;
import com.waze.search.bb;
import com.waze.search.bc;
import com.waze.search.bd;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac implements z {

    /* renamed from: a, reason: collision with root package name */
    private final bd f20352a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ev.n f20353b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.search.stats.s f20354c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f20355d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.z f20356e;

    public ac(bd bdVar, com.waze.ev.n nVar, com.waze.search.v2.p pVar, com.waze.search.stats.s sVar, com.waze.shared_infra.q.e eVar, com.waze.z zVar) {
        h.g.b.x.f(bdVar, "searchOperation");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(pVar, "searchConfig");
        h.g.b.x.f(sVar, "searchStatsSender");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(zVar, "appType");
        this.f20352a = bdVar;
        this.f20353b = nVar;
        this.f20354c = sVar;
        this.f20355d = eVar;
        this.f20356e = zVar;
    }

    private static final co c(bq bqVar, v vVar) {
        t tVar;
        s sVarA;
        s sVarA2;
        if (!(bqVar instanceof bc)) {
            if (!(bqVar instanceof bb)) {
                throw new h.i();
            }
            bb bbVar = (bb) bqVar;
            return new x(bbVar.f(), Integer.valueOf(bbVar.e()));
        }
        bc bcVar = (bc) bqVar;
        String strB = bcVar.e().b();
        String strA = bcVar.e().a();
        String str = strA;
        if (str == null || str.length() == 0) {
            String str2 = strB;
            if (str2 != null && str2.length() != 0) {
                tVar = vVar instanceof t ? (t) vVar : null;
                if (tVar == null || (sVarA = tVar.a()) == null) {
                    sVarA = s.f20434c;
                }
                vVar = new t(strB, false, sVarA, vVar.c());
            }
        } else {
            tVar = vVar instanceof t ? (t) vVar : null;
            if (tVar == null || (sVarA2 = tVar.a()) == null) {
                sVarA2 = s.f20434c;
            }
            vVar = new t(strA, true, sVarA2, vVar.c());
        }
        return new y(bcVar.e().c(), vVar, bcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.car_lib.n.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.search.bc r5, com.waze.car_lib.n.v r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.car_lib.n.aa
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.car_lib.n.aa r0 = (com.waze.car_lib.n.aa) r0
            int r1 = r0.f20344d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20344d = r1
            goto L18
        L13:
            com.waze.car_lib.n.aa r0 = new com.waze.car_lib.n.aa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20342b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20344d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.waze.car_lib.n.ac r4 = r0.f20345e
            com.waze.car_lib.n.ac r4 = (com.waze.car_lib.n.ac) r4
            java.lang.Object r4 = r0.f20341a
            r6 = r4
            com.waze.car_lib.n.v r6 = (com.waze.car_lib.n.v) r6
            e.b.c.b(r7)
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            e.b.c.b(r7)
            com.waze.search.bd r7 = r4.f20352a
            r0.f20341a = r6
            r0.f20345e = r4
            r0.f20344d = r3
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            com.waze.sdk.bq r7 = (com.waze.sdk.bq) r7
            com.waze.car_lib.r.co r4 = c(r7, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.ac.a(com.waze.search.bc, com.waze.car_lib.n.v, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.waze.car_lib.n.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.waze.car_lib.n.v r28, h.c.e r29) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.ac.b(com.waze.car_lib.n.v, h.c.e):java.lang.Object");
    }
}
