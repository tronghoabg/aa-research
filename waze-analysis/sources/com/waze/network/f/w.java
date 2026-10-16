package com.waze.network.f;

import com.waze.network.ax;
import com.waze.network.b.bj;
import com.waze.network.b.bl;
import i.b.l.cc;
import i.b.l.ec;
import i.b.l.ee;
import i.b.l.ef;
import i.b.l.eg;
import i.b.l.eo;
import i.b.l.ep;
import i.b.l.es;
import i.b.l.et;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements com.waze.authentication.w {

    /* renamed from: a, reason: collision with root package name */
    private final e f32355a;

    /* renamed from: b, reason: collision with root package name */
    private final ax f32356b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.network.a.a f32357c;

    /* renamed from: d, reason: collision with root package name */
    private final x f32358d;

    /* renamed from: e, reason: collision with root package name */
    private final bl f32359e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedui.h.j f32360f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.install.a.a f32361g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.ac f32362h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32363i;

    /* renamed from: j, reason: collision with root package name */
    private final n f32364j;

    /* renamed from: k, reason: collision with root package name */
    private final okhttp3.ai f32365k;

    public w(e eVar, ax axVar, com.waze.network.a.a aVar, x xVar, bj bjVar, bl blVar, com.waze.sharedui.h.j jVar, com.waze.install.a.a aVar2, com.waze.ac acVar, com.waze.shared_infra.i.e eVar2, n nVar) {
        h.g.b.x.f(eVar, "sessionConfig");
        h.g.b.x.f(axVar, "httpConfig");
        h.g.b.x.f(aVar, "clientInfoProvider");
        h.g.b.x.f(xVar, "sessionRealtimeAdapter");
        h.g.b.x.f(bjVar, "okHttpClientFactory");
        h.g.b.x.f(blVar, "authenticator");
        h.g.b.x.f(jVar, "sessionStatsSender");
        h.g.b.x.f(aVar2, "forceUpgradeStatsSender");
        h.g.b.x.f(acVar, "backgroundStateProvider");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(nVar, "configuration");
        this.f32355a = eVar;
        this.f32356b = axVar;
        this.f32357c = aVar;
        this.f32358d = xVar;
        this.f32359e = blVar;
        this.f32360f = jVar;
        this.f32361g = aVar2;
        this.f32362h = acVar;
        this.f32363i = eVar2;
        this.f32364j = nVar;
        this.f32365k = bjVar.d().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(com.waze.network.f.w r16, com.waze.network.g.a r17, com.waze.shared_infra.q.n r18, h.c.e r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.w.i(com.waze.network.f.w, com.waze.network.g.a, com.waze.shared_infra.q.n, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object m(final com.waze.network.f.w r5, final com.waze.authentication.ax r6, final com.waze.authentication.x r7, h.c.e r8) {
        /*
            boolean r0 = r8 instanceof com.waze.network.f.s
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.network.f.s r0 = (com.waze.network.f.s) r0
            int r1 = r0.f32339c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32339c = r1
            goto L18
        L13:
            com.waze.network.f.s r0 = new com.waze.network.f.s
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f32337a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32339c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r8)
            goto L57
        L36:
            e.b.c.b(r8)
            com.waze.shared_infra.i.e r8 = r5.f32363i
            java.lang.String r2 = "preparing login_request"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.a(r2)
            com.waze.network.f.m r8 = new com.waze.network.f.m
            r8.<init>()
            i.b.l.cb r6 = com.waze.nightmode.e.f(r8)
            java.lang.String r6 = com.waze.nightmode.e.e(r6)
            r0.f32339c = r4
            java.lang.Object r8 = r5.o(r6, r0)
            if (r8 == r1) goto L74
        L57:
            com.waze.network.f.e r6 = r5.f32355a
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = "<this>"
            h.g.b.x.f(r6, r7)
            java.lang.String r6 = r6.f()
            r0.f32339c = r3
            java.lang.String r7 = "/login"
            java.lang.String r6 = r6.concat(r7)
            java.lang.Object r5 = r5.p(r6, r8)
            if (r5 != r1) goto L73
            goto L74
        L73:
            return r5
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.w.m(com.waze.network.f.w, com.waze.authentication.ax, com.waze.authentication.x, h.c.e):java.lang.Object");
    }

    static final h.ab n(com.waze.authentication.ax axVar, com.waze.authentication.x xVar, w wVar, cc ccVar) {
        h.g.b.x.f(ccVar, "$this$batch");
        boolean z = axVar instanceof com.waze.authentication.j;
        ec ecVarNewBuilder = eg.newBuilder();
        if (z) {
            es esVarNewBuilder = et.newBuilder();
            esVarNewBuilder.a(((com.waze.authentication.j) axVar).a());
            ecVarNewBuilder.e(esVarNewBuilder.build());
        } else {
            if (!(axVar instanceof com.waze.authentication.k)) {
                throw new h.i();
            }
            eo eoVarNewBuilder = ep.newBuilder();
            com.waze.authentication.k kVar = (com.waze.authentication.k) axVar;
            eoVarNewBuilder.b(kVar.b());
            eoVarNewBuilder.a(kVar.a());
            ecVarNewBuilder.c(eoVarNewBuilder.build());
        }
        ecVarNewBuilder.d(ef.NORMAL);
        ecVarNewBuilder.b(xVar.a());
        ee[] eeVarArr = new ee[3];
        eeVarArr[0] = ee.USER_PROFILE;
        n nVar = wVar.f32364j;
        eeVarArr[1] = nVar.a() ? ee.CONSENT : null;
        eeVarArr[2] = nVar.b() ? ee.GET_MEETINGS : null;
        ecVarNewBuilder.a(h.a.i.k(eeVarArr));
        ccVar.C(ecVarNewBuilder.build());
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.waze.network.f.r
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.network.f.r r0 = (com.waze.network.f.r) r0
            int r1 = r0.f32332c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32332c = r1
            goto L18
        L13:
            com.waze.network.f.r r0 = new com.waze.network.f.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f32330a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32332c
            java.lang.String r3 = "\n"
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 != r4) goto L3d
            i.b.l.lb r8 = r0.f32336g
            r1 = r8
            i.b.l.lb r1 = (i.b.l.lb) r1
            i.b.l.lb r1 = r0.f32335f
            r2 = r1
            i.b.l.lb r2 = (i.b.l.lb) r2
            java.lang.StringBuilder r2 = r0.f32334e
            r5 = r2
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            java.lang.StringBuilder r0 = r0.f32333d
            r5 = r0
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            e.b.c.b(r9)
            goto L9c
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            e.b.c.b(r9)
            com.waze.network.a.a r9 = r7.f32357c
            i.b.l.ao r9 = r9.a(r4)
            com.waze.shared_infra.i.e r2 = r7.f32363i
            java.util.Objects.toString(r9)
            java.lang.String r5 = java.lang.String.valueOf(r9)
            java.lang.String r6 = "client_info: "
            java.lang.String r5 = r6.concat(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.a(r5)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.waze.car_lib.login.b r5 = new com.waze.car_lib.login.b
            r6 = 11
            r5.<init>(r9, r6)
            i.b.l.cb r9 = com.waze.nightmode.e.f(r5)
            java.lang.String r9 = com.waze.nightmode.e.e(r9)
            r2.append(r9)
            r2.append(r3)
            r2.append(r8)
            r2.append(r3)
            com.waze.network.f.e r8 = r7.f32355a
            i.b.l.lb r9 = i.b.l.lc.newBuilder()
            r0.f32333d = r2
            r0.f32334e = r2
            r0.f32335f = r9
            r0.f32336g = r9
            r0.f32332c = r4
            java.lang.Object r8 = r8.e(r0)
            if (r8 == r1) goto Le2
            r1 = r9
            r0 = r2
            r9 = r8
            r8 = r1
        L9c:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto La3
            r8.a(r9)
        La3:
            com.waze.network.f.e r7 = r7.f32355a
            boolean r7 = r7.p()
            r7 = r7 ^ r4
            r8.b(r7)
            com.google.v.du r7 = r1.build()
            java.lang.String r8 = "build(...)"
            h.g.b.x.e(r7, r8)
            i.b.l.lc r7 = (i.b.l.lc) r7
            com.waze.car_lib.login.b r8 = new com.waze.car_lib.login.b
            r9 = 12
            r8.<init>(r7, r9)
            i.b.l.cb r7 = com.waze.nightmode.e.f(r8)
            java.lang.String r7 = com.waze.nightmode.e.e(r7)
            r2.append(r7)
            r2.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.String r8 = "toString(...)"
            h.g.b.x.e(r7, r8)
            java.nio.charset.Charset r8 = h.n.a.f48221b
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "getBytes(...)"
            h.g.b.x.e(r7, r8)
            return r7
        Le2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.f.w.o(java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(String str, byte[] bArr) {
        int iB = this.f32358d.b();
        com.waze.shared_infra.q.n nVar = com.waze.network.g.a.f32372a;
        return new com.waze.network.g.a(nVar, str, com.waze.sharedui.f.g.f38898a, bArr, iB, com.waze.sharedui.f.c.f38889c, null, false, 512);
    }

    @Override // com.waze.authentication.w
    public final /* bridge */ /* synthetic */ Object a(Object obj, h.c.e eVar) {
        Object objV = kotlinx.coroutines.aj.v(av.b(), new v(this, (af) obj, null), eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }

    @Override // com.waze.authentication.w
    public final Object b(com.waze.authentication.ax axVar, com.waze.authentication.x xVar, h.c.e eVar) {
        return kotlinx.coroutines.aj.v(av.b(), new u(this, axVar, xVar, null), eVar);
    }
}
