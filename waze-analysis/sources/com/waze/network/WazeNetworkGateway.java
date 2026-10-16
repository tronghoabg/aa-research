package com.waze.network;

import androidx.core.app.NotificationCompat;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.ResultStruct;
import com.waze.gj;
import i.b.l.cd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class WazeNetworkGateway implements com.waze.sharedui.f.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.network.b.ab f31846a;

    /* renamed from: b, reason: collision with root package name */
    private final bj f31847b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sharedui.h.j f31848c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f31849d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f31850e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f31851f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.ab f31852g;

    public WazeNetworkGateway(kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2, gj gjVar, com.waze.network.b.ab abVar3, bj bjVar, com.waze.sharedui.h.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(abVar, "processingDispatcher");
        h.g.b.x.f(abVar2, "handlerDispatcher");
        h.g.b.x.f(gjVar, "nativeDispatcherProvider");
        h.g.b.x.f(abVar3, "networkQueueDispatcher");
        h.g.b.x.f(bjVar, "config");
        h.g.b.x.f(jVar, "sessionStatsSender");
        h.g.b.x.f(eVar, "logger");
        this.f31846a = abVar3;
        this.f31847b = bjVar;
        this.f31848c = jVar;
        this.f31849d = eVar;
        this.f31850e = kotlinx.coroutines.aj.e(abVar.plus(kotlinx.coroutines.aj.Q()));
        this.f31851f = kotlinx.coroutines.aj.e(abVar2.plus(kotlinx.coroutines.aj.Q()));
        this.f31852g = gjVar.getNativeDispatcher();
    }

    public static final native String batchDebugString(byte[] bArr);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.network.WazeNetworkGateway r16, com.waze.sharedui.f.d r17, com.waze.network.g.a r18, byte[] r19, com.waze.sharedui.f.l r20, h.c.e r21) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.WazeNetworkGateway.d(com.waze.network.WazeNetworkGateway, com.waze.sharedui.f.d, com.waze.network.g.a, byte[], com.waze.sharedui.f.l, h.c.e):java.lang.Object");
    }

    static final void f(WazeNetworkGateway wazeNetworkGateway, com.waze.sharedui.f.l lVar, com.waze.sharedui.f.d dVar, com.waze.network.g.a aVar, com.waze.network.b.bf bfVar) {
        ResultStruct resultStruct;
        h.g.b.x.f(aVar, NotificationCompat.CATEGORY_MESSAGE);
        h.g.b.x.f(bfVar, "result");
        if (bfVar instanceof com.waze.network.b.be) {
            kotlinx.coroutines.aj.z(wazeNetworkGateway.f31850e, null, null, new bc(wazeNetworkGateway, dVar, aVar, bfVar, lVar, null), 3);
            return;
        }
        if (!(bfVar instanceof com.waze.network.b.bd)) {
            throw new h.i();
        }
        com.waze.network.b.bd bdVar = (com.waze.network.b.bd) bfVar;
        if (bdVar.d()) {
            resultStruct = new ResultStruct(511, com.waze.shared_infra.o.b.a().c(R.string.AUTHENTICATION_ERROR_FAILURE_REASON, new Object[0]), null, null, false, false);
        } else if (bdVar.e() || bdVar.f()) {
            resultStruct = new ResultStruct(bdVar.a(), bdVar.c(), com.waze.shared_infra.o.b.a().c(R.string.NO_CONNECTION_ERROR, new Object[0]), null, null, false, false);
        } else {
            resultStruct = com.waze.realtime_report_feedback.c.j();
        }
        l(resultStruct, aVar, lVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object i(final com.waze.network.WazeNetworkGateway r12, final com.waze.sharedui.f.d r13, i.b.l.cd r14, final com.waze.sharedui.f.l r15) {
        /*
            i.b.l.ca r0 = i.b.l.cb.newBuilder()
            r0.b(r14)
            com.google.v.du r14 = r0.build()
            java.lang.String r0 = "build(...)"
            h.g.b.x.e(r14, r0)
            i.b.l.cb r14 = (i.b.l.cb) r14
            com.waze.sharedui.f.c r0 = r13.d()
            com.waze.sharedui.f.c r1 = com.waze.sharedui.f.c.f38889c
            if (r0 == r1) goto L21
            com.waze.network.bj r0 = r12.f31847b
            java.lang.String r0 = r0.a()
            goto L27
        L21:
            com.waze.network.bj r0 = r12.f31847b
            java.lang.String r0 = r0.b()
        L27:
            r3 = r0
            java.lang.String r0 = com.waze.nightmode.e.e(r14)
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r2 = "defaultCharset(...)"
            h.g.b.x.e(r1, r2)
            byte[] r5 = r0.getBytes(r1)
            java.lang.String r0 = "getBytes(...)"
            h.g.b.x.e(r5, r0)
            int r6 = com.waze.network.as.a()
            com.waze.sharedui.f.c r7 = r13.d()
            com.waze.sharedui.f.q r8 = r13.g()
            com.waze.sharedui.f.g r4 = r13.e()
            com.waze.sharedui.f.p r0 = r13.f()
            r1 = 0
            r11 = 1
            if (r0 != 0) goto L58
        L56:
            r9 = r1
            goto L98
        L58:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L7f
            if (r0 != r11) goto L79
            com.waze.config.b r0 = com.waze.config.ConfigValues.CONFIG_VALUE_SIGNUP_ANDROID_ADD_APP_CHECK_TOKEN_TO_REGISTER_CONNECT_REQUEST
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L97
            com.waze.config.b r0 = com.waze.config.ConfigValues.CONFIG_VALUE_APP_CHECK_ANDROID_ADD_TOKEN_TO_REGISTER_CONNECT_REQUEST
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
            goto L97
        L79:
            h.i r12 = new h.i
            r12.<init>()
            throw r12
        L7f:
            com.waze.config.b r0 = com.waze.config.ConfigValues.CONFIG_VALUE_SIGNUP_ANDROID_ADD_APP_CHECK_TOKEN_TO_REGISTER_REQUEST
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L97
            com.waze.config.b r0 = com.waze.config.ConfigValues.CONFIG_VALUE_APP_CHECK_ANDROID_ADD_TOKEN_TO_REGISTER_REQUEST
            java.lang.Boolean r0 = r0.b()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
        L97:
            r9 = r11
        L98:
            com.waze.network.g.a r1 = new com.waze.network.g.a
            r2 = 0
            r10 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = com.waze.log.g.k()
            if (r11 == r0) goto La6
            r14 = r2
        La6:
            if (r14 == 0) goto Lb0
            byte[] r14 = r14.toByteArray()
            java.lang.String r2 = batchDebugString(r14)
        Lb0:
            if (r2 == 0) goto Ld3
            com.waze.shared_infra.i.e r14 = r12.f31849d
            int r0 = r1.b()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "enqueuing request [tid="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "]: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r14.a(r0)
        Ld3:
            com.waze.network.b.ab r14 = r12.f31846a
            com.waze.network.bb r0 = new com.waze.network.bb
            r0.<init>()
            r14.a(r1, r0)
            h.ab r12 = h.ab.f48028a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.WazeNetworkGateway.i(com.waze.network.WazeNetworkGateway, com.waze.sharedui.f.d, i.b.l.cd, com.waze.sharedui.f.l):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(byte[] r5, java.lang.String r6, h.c.e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.waze.network.be
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.network.be r0 = (com.waze.network.be) r0
            int r1 = r0.f32134c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32134c = r1
            goto L18
        L13:
            com.waze.network.be r0 = new com.waze.network.be
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f32132a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f32134c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            com.waze.NativeManager r7 = com.waze.NativeManager.getInstance()
            boolean r7 = r7.isOfflineMode()
            if (r7 == 0) goto L43
            com.waze.ResultStruct r4 = new com.waze.ResultStruct
            r5 = 0
            r4.<init>(r5)
            return r4
        L43:
            kotlinx.coroutines.ab r4 = r4.f31852g
            h.c.j r4 = (h.c.j) r4
            com.waze.network.bf r7 = new com.waze.network.bf
            r2 = 0
            r7.<init>(r5, r6, r2)
            h.g.a.p r7 = (h.g.a.p) r7
            r0.f32134c = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r4, r7, r0)
            if (r7 == r1) goto L61
        L57:
            com.waze.ResultStruct r7 = (com.waze.ResultStruct) r7
            if (r7 != 0) goto L60
            com.waze.ResultStruct r4 = com.waze.realtime_report_feedback.c.j()
            return r4
        L60:
            return r7
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.WazeNetworkGateway.k(byte[], java.lang.String, h.c.e):java.lang.Object");
    }

    private static final void l(ResultStruct resultStruct, com.waze.network.g.a aVar, com.waze.sharedui.f.l lVar) {
        resultStruct.setTransactionStats(aVar.h());
        lVar.a(resultStruct, null);
    }

    public static final native ResultStruct runGlobalParserNTV(byte[] bArr, String str);

    @Override // com.waze.sharedui.f.k
    public final com.waze.shared_infra.i.e a() {
        return this.f31849d;
    }

    @Override // com.waze.sharedui.f.k
    public final com.waze.sharedui.b b(int i2, String str) {
        h.g.b.x.f(str, "error");
        h.g.b.x.f(str, "error");
        return new ResultStruct(i2, str, null, null, false, true);
    }

    @Override // com.waze.sharedui.f.k
    public final com.waze.sharedui.b c() {
        return com.waze.realtime_report_feedback.c.j();
    }

    @Override // com.waze.sharedui.f.a
    public final void g(com.waze.sharedui.f.d dVar, cd cdVar, com.waze.sharedui.f.l lVar) {
        h.g.b.x.f(dVar, "elementMeta");
        h.g.b.x.f(cdVar, "element");
        h.g.b.x.f(lVar, "handler");
        kotlinx.coroutines.aj.z(this.f31850e, null, null, new bi(this, dVar, cdVar, new com.waze.sharedui.f.o(lVar, dVar, this.f31848c), null), 3);
    }

    @Override // com.waze.sharedui.f.k
    public final void h(com.waze.sharedui.f.h hVar) {
        h.g.b.x.f(hVar, "data");
        NativeManager.Post(new com.waze.ads.f(hVar, 13));
    }
}
