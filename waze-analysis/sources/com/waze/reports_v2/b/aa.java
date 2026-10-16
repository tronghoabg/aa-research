package com.waze.reports_v2.b;

import com.google.v.gb;
import com.google.v.gc;
import i.b.l.cc;
import i.b.l.cd;
import j$.time.Instant;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34007a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34008b;

    public /* synthetic */ aa() {
        h.g.b.x.e(com.waze.shared_infra.i.a.d("ConversationalReportingFteTooltipStateHolder"), "create(...)");
        bn bnVarB = ck.b(null);
        this.f34008b = bnVarB;
        this.f34007a = kotlinx.coroutines.b.ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0284 A[Catch: all -> 0x034b, TryCatch #0 {all -> 0x034b, blocks: (B:12:0x002a, B:20:0x0049, B:22:0x004f, B:24:0x006c, B:26:0x0089, B:28:0x0099, B:30:0x00a8, B:33:0x00b3, B:35:0x00cf, B:161:0x02f8, B:34:0x00c6, B:36:0x00d3, B:38:0x00da, B:40:0x00e9, B:42:0x00f3, B:45:0x0103, B:48:0x011e, B:54:0x0139, B:133:0x0266, B:137:0x0284, B:139:0x028e, B:143:0x029f, B:144:0x02a3, B:146:0x02b3, B:55:0x013d, B:56:0x0142, B:57:0x0143, B:58:0x0147, B:59:0x014b, B:61:0x0152, B:63:0x0158, B:69:0x0173, B:70:0x0177, B:71:0x017c, B:72:0x017d, B:73:0x0181, B:74:0x0185, B:75:0x0189, B:77:0x018f, B:82:0x01a8, B:83:0x01ac, B:84:0x01b1, B:85:0x01b2, B:86:0x01b6, B:87:0x01ba, B:89:0x01c0, B:97:0x01de, B:98:0x01e2, B:99:0x01e7, B:100:0x01e8, B:101:0x01ec, B:102:0x01f0, B:103:0x01f4, B:105:0x01fa, B:106:0x020b, B:107:0x020e, B:114:0x0223, B:115:0x0226, B:108:0x0211, B:109:0x0214, B:110:0x0217, B:111:0x021a, B:112:0x021d, B:113:0x0220, B:116:0x0227, B:118:0x022d, B:119:0x023e, B:120:0x0241, B:131:0x0262, B:132:0x0265, B:121:0x0244, B:122:0x0247, B:123:0x024a, B:124:0x024d, B:125:0x0250, B:126:0x0253, B:127:0x0256, B:128:0x0259, B:129:0x025c, B:130:0x025f, B:145:0x02aa, B:147:0x02b6, B:149:0x02bc, B:153:0x02d7, B:158:0x02e5, B:154:0x02da, B:155:0x02df, B:156:0x02e0, B:157:0x02e3, B:159:0x02ec, B:164:0x0303, B:166:0x0307, B:168:0x0344, B:169:0x0349, B:17:0x0039), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x029f A[Catch: all -> 0x034b, TryCatch #0 {all -> 0x034b, blocks: (B:12:0x002a, B:20:0x0049, B:22:0x004f, B:24:0x006c, B:26:0x0089, B:28:0x0099, B:30:0x00a8, B:33:0x00b3, B:35:0x00cf, B:161:0x02f8, B:34:0x00c6, B:36:0x00d3, B:38:0x00da, B:40:0x00e9, B:42:0x00f3, B:45:0x0103, B:48:0x011e, B:54:0x0139, B:133:0x0266, B:137:0x0284, B:139:0x028e, B:143:0x029f, B:144:0x02a3, B:146:0x02b3, B:55:0x013d, B:56:0x0142, B:57:0x0143, B:58:0x0147, B:59:0x014b, B:61:0x0152, B:63:0x0158, B:69:0x0173, B:70:0x0177, B:71:0x017c, B:72:0x017d, B:73:0x0181, B:74:0x0185, B:75:0x0189, B:77:0x018f, B:82:0x01a8, B:83:0x01ac, B:84:0x01b1, B:85:0x01b2, B:86:0x01b6, B:87:0x01ba, B:89:0x01c0, B:97:0x01de, B:98:0x01e2, B:99:0x01e7, B:100:0x01e8, B:101:0x01ec, B:102:0x01f0, B:103:0x01f4, B:105:0x01fa, B:106:0x020b, B:107:0x020e, B:114:0x0223, B:115:0x0226, B:108:0x0211, B:109:0x0214, B:110:0x0217, B:111:0x021a, B:112:0x021d, B:113:0x0220, B:116:0x0227, B:118:0x022d, B:119:0x023e, B:120:0x0241, B:131:0x0262, B:132:0x0265, B:121:0x0244, B:122:0x0247, B:123:0x024a, B:124:0x024d, B:125:0x0250, B:126:0x0253, B:127:0x0256, B:128:0x0259, B:129:0x025c, B:130:0x025f, B:145:0x02aa, B:147:0x02b6, B:149:0x02bc, B:153:0x02d7, B:158:0x02e5, B:154:0x02da, B:155:0x02df, B:156:0x02e0, B:157:0x02e3, B:159:0x02ec, B:164:0x0303, B:166:0x0307, B:168:0x0344, B:169:0x0349, B:17:0x0039), top: B:177:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v81, types: [com.waze.shared_infra.i.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.waze.sharedui.f.k, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(i.b.l.cd r7, com.waze.sharedui.f.d r8, h.c.e r9) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.reports_v2.b.aa.e(i.b.l.cd, com.waze.sharedui.f.d, h.c.e):java.lang.Object");
    }

    public final Object a(String str, com.waze.sharedui.e.c cVar, Instant instant, String str2, String str3, ac acVar, h.c.e eVar) {
        com.waze.bg.a.b.q qVarNewBuilder = com.waze.bg.a.b.s.newBuilder();
        qVarNewBuilder.f(com.waze.bm.a.a.ad.f(str));
        qVarNewBuilder.a(str2);
        gb gbVarNewBuilder = gc.newBuilder();
        gbVarNewBuilder.b(instant.getEpochSecond());
        qVarNewBuilder.b(gbVarNewBuilder.build());
        com.waze.bg.a.b.a.c cVarNewBuilder = com.waze.bg.a.b.a.d.newBuilder();
        cVarNewBuilder.b(com.waze.shared_infra.l.b.f(cVar));
        cVarNewBuilder.a(h.h.a.b(cVar.a()));
        qVarNewBuilder.c(cVarNewBuilder.build());
        qVarNewBuilder.e(str3);
        qVarNewBuilder.d(com.waze.bm.a.a.ad.e(acVar));
        com.waze.bg.a.b.s sVarBuild = qVarNewBuilder.build();
        h.g.b.x.e(sVarBuild, "build(...)");
        cc ccVarNewBuilder = cd.newBuilder();
        ccVarNewBuilder.w(sVarBuild);
        cd cdVarBuild = ccVarNewBuilder.build();
        h.g.b.x.e(cdVarBuild, "build(...)");
        int i2 = com.waze.sharedui.api.a.f38785a;
        return e(cdVarBuild, com.waze.sharedui.api.a.s(), eVar);
    }

    public final Object b(String str, String str2, String str3, ac acVar, h.c.e eVar) {
        com.waze.bg.a.b.u uVarNewBuilder = com.waze.bg.a.b.v.newBuilder();
        uVarNewBuilder.a(str);
        uVarNewBuilder.d(com.waze.bm.a.a.ad.f(str2));
        uVarNewBuilder.c(str3);
        uVarNewBuilder.b(com.waze.bm.a.a.ad.e(acVar));
        com.waze.bg.a.b.v vVarBuild = uVarNewBuilder.build();
        h.g.b.x.e(vVarBuild, "build(...)");
        cc ccVarNewBuilder = cd.newBuilder();
        ccVarNewBuilder.R(vVarBuild);
        cd cdVarBuild = ccVarNewBuilder.build();
        h.g.b.x.e(cdVarBuild, "build(...)");
        int i2 = com.waze.sharedui.api.a.f38785a;
        return e(cdVarBuild, com.waze.sharedui.api.a.F(), eVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final ch d() {
        return this.f34007a;
    }

    public aa(com.waze.sharedui.f.k kVar) {
        h.g.b.x.f(kVar, "networkGateway");
        this.f34007a = kVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("ConversationalReportingApi");
        h.g.b.x.e(eVarD, "create(...)");
        this.f34008b = eVarD;
    }
}
