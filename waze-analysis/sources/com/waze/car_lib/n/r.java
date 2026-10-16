package com.waze.car_lib.n;

import com.waze.navigate.DriveToNativeManager;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final z f20426a;

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f20427b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.j.a f20428c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20429d;

    /* renamed from: e, reason: collision with root package name */
    private br f20430e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f20431f;

    public r(z zVar, DriveToNativeManager driveToNativeManager, com.waze.car_lib.j.a aVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(zVar, "searchRepository");
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        h.g.b.x.f(aVar, "drivingStatusProvider");
        h.g.b.x.f(eVar, "logger");
        this.f20426a = zVar;
        this.f20427b = driveToNativeManager;
        this.f20428c = aVar;
        this.f20429d = eVar;
        k kVar = k.f20412a;
        bn bnVarB = ck.b(kVar);
        this.f20431f = bnVarB;
        bnVarB.e(kVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r8.f(r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object a(com.waze.car_lib.n.r r8, com.waze.car_lib.n.v r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.car_lib.n.p
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.car_lib.n.p r0 = (com.waze.car_lib.n.p) r0
            int r1 = r0.f20422d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20422d = r1
            goto L18
        L13:
            com.waze.car_lib.n.p r0 = new com.waze.car_lib.n.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f20420b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20422d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r10)
            goto Ld6
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r9 = r0.f20419a
            com.waze.car_lib.n.v r9 = (com.waze.car_lib.n.v) r9
            e.b.c.b(r10)
            goto L4a
        L3b:
            e.b.c.b(r10)
            com.waze.car_lib.n.z r10 = r8.f20426a
            r0.f20419a = r9
            r0.f20422d = r4
            java.lang.Object r10 = r10.b(r9, r0)
            if (r10 == r1) goto Ldf
        L4a:
            com.waze.car_lib.r.co r10 = (com.waze.car_lib.r.co) r10
            boolean r2 = r10 instanceof com.waze.car_lib.n.y
            if (r2 == 0) goto Lb1
            com.waze.navigate.DriveToNativeManager r9 = r8.f20427b
            com.waze.car_lib.j.a r2 = r8.f20428c
            com.waze.navigate.bt r9 = (com.waze.navigate.bt) r9
            boolean r5 = r2.a()
            r6 = 0
            com.waze.navigate.bt.setStopPoint$default(r9, r5, r6, r3, r6)
            com.waze.car_lib.n.y r10 = (com.waze.car_lib.n.y) r10
            java.util.List r9 = r10.c()
            com.waze.search.bc r5 = r10.b()
            if (r5 == 0) goto L92
            com.waze.av.c.l r5 = r5.e()
            boolean r5 = r5.f()
            if (r5 != r4) goto L92
            r4 = r9
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L92
            kotlinx.coroutines.b.bn r8 = r8.f20431f
            com.waze.car_lib.n.o r0 = new com.waze.car_lib.n.o
            com.waze.car_lib.n.v r10 = r10.a()
            java.lang.Object r9 = h.a.i.P(r9)
            com.waze.av.d.k r9 = (com.waze.av.d.k) r9
            r0.<init>(r10, r9)
            r8.e(r0)
            goto Ld6
        L92:
            kotlinx.coroutines.b.bn r4 = r8.f20431f
            com.waze.car_lib.n.n r5 = new com.waze.car_lib.n.n
            com.waze.car_lib.n.v r7 = r10.a()
            r5.<init>(r7, r9)
            r4.e(r5)
            boolean r9 = r2.a()
            if (r9 == 0) goto Ld6
            r0.f20419a = r6
            r0.f20422d = r3
            java.lang.Object r8 = r8.f(r10, r0)
            if (r8 != r1) goto Ld6
            goto Ldf
        Lb1:
            boolean r0 = r10 instanceof com.waze.car_lib.n.x
            if (r0 == 0) goto Ld9
            com.waze.shared_infra.i.e r0 = r8.f20429d
            com.waze.car_lib.n.x r10 = (com.waze.car_lib.n.x) r10
            java.lang.String r10 = r10.b()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Search returned no results, error message: "
            java.lang.String r10 = r1.concat(r10)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r0.g(r10)
            kotlinx.coroutines.b.bn r8 = r8.f20431f
            com.waze.car_lib.n.l r10 = new com.waze.car_lib.n.l
            r10.<init>(r9)
            r8.e(r10)
        Ld6:
            h.ab r8 = h.ab.f48028a
            return r8
        Ld9:
            h.i r8 = new h.i
            r8.<init>()
            throw r8
        Ldf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.r.a(com.waze.car_lib.n.r, com.waze.car_lib.n.v, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.car_lib.n.y r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.car_lib.n.q
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.n.q r0 = (com.waze.car_lib.n.q) r0
            int r1 = r0.f20425c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20425c = r1
            goto L18
        L13:
            com.waze.car_lib.n.q r0 = new com.waze.car_lib.n.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f20423a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20425c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            com.waze.search.bc r6 = r5.b()
            if (r6 == 0) goto L70
            com.waze.av.c.l r2 = r6.e()
            boolean r2 = r2.d()
            if (r2 == 0) goto L70
            com.waze.car_lib.n.z r2 = r4.f20426a
            com.waze.car_lib.n.v r5 = r5.a()
            r0.f20425c = r3
            java.lang.Object r6 = r2.a(r6, r5, r0)
            if (r6 == r1) goto L6f
        L50:
            com.waze.car_lib.r.co r6 = (com.waze.car_lib.r.co) r6
            boolean r5 = r6 instanceof com.waze.car_lib.n.y
            if (r5 == 0) goto L59
            com.waze.car_lib.n.y r6 = (com.waze.car_lib.n.y) r6
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 == 0) goto L70
            kotlinx.coroutines.b.bn r4 = r4.f20431f
            com.waze.car_lib.n.n r5 = new com.waze.car_lib.n.n
            com.waze.car_lib.n.v r0 = r6.a()
            java.util.List r6 = r6.c()
            r5.<init>(r0, r6)
            r4.e(r5)
            goto L70
        L6f:
            return r1
        L70:
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.n.r.f(com.waze.car_lib.n.y, h.c.e):java.lang.Object");
    }

    public final ch b() {
        return kotlinx.coroutines.b.ai.U(this.f20431f);
    }

    public final void c() {
        br brVar = this.f20430e;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f20430e = null;
        this.f20431f.e(k.f20412a);
    }

    public final void d(v vVar, kotlinx.coroutines.af afVar) {
        h.g.b.x.f(vVar, "query");
        h.g.b.x.f(afVar, "scope");
        Objects.toString(vVar);
        this.f20429d.a("starting search for: ".concat(vVar.toString()));
        this.f20431f.e(new m(vVar));
        br brVar = this.f20430e;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f20430e = kotlinx.coroutines.aj.z(afVar, null, null, new aq(this, vVar, (h.c.e) null, 1), 3);
    }
}
