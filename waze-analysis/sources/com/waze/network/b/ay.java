package com.waze.network.b;

import kotlinx.coroutines.b.ch;
import l.a.awx;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ay {
    public /* synthetic */ ay(byte[] bArr) {
    }

    /* JADX WARN: Path cross not found for [B:79:0x0262, B:85:0x026d], limit reached: 115 */
    /* JADX WARN: Path cross not found for [B:85:0x026d, B:79:0x0262], limit reached: 115 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01d2 -> B:105:0x01e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0245 -> B:77:0x025a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(okhttp3.ai r29, com.waze.shared_infra.i.e r30, com.waze.network.g.a r31, java.lang.String r32, int r33, long r34, long r36, long r38, h.g.a.l r40, h.c.e r41) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.b.ay.a(okhttp3.ai, com.waze.shared_infra.i.e, com.waze.network.g.a, java.lang.String, int, long, long, long, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static kotlinx.coroutines.b.k d(ch chVar, y yVar) {
        h.g.b.x.f(chVar, "<this>");
        h.g.b.x.f(yVar, "statsReporter");
        return kotlinx.coroutines.b.ai.K(chVar, new z(yVar, null));
    }

    public static boolean e(ay ayVar) {
        h.g.b.x.f(ayVar, "<this>");
        if (h.g.b.x.n(ayVar, ai.f31939a)) {
            return true;
        }
        if (h.g.b.x.n(ayVar, aj.f31940a) || h.g.b.x.n(ayVar, ak.f31941a)) {
            return false;
        }
        throw new h.i();
    }

    public static String f(com.waze.network.f.e eVar) {
        h.g.b.x.f(eVar, "<this>");
        return eVar.f().concat("/command");
    }

    public static void g(com.waze.stats.ax axVar, com.waze.sharedui.h.i iVar, com.waze.sharedui.h.h hVar, com.waze.sharedui.f.r rVar) {
        awx awxVarC;
        Integer numB;
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(hVar, "requestResult");
        l.b.s sVarNewBuilder = l.b.u.newBuilder();
        h.g.b.x.f(sVarNewBuilder, "builder");
        if (iVar == null || (awxVarC = com.waze.network.f.ak.c(iVar)) == null) {
            awxVarC = awx.USE_CASE_UNSPECIFIED;
        }
        h.g.b.x.f(awxVarC, "value");
        sVarNewBuilder.d(awxVarC);
        l.b.t tVar = hVar.d() ? l.b.t.SUCCESS : l.b.t.FAILURE;
        h.g.b.x.f(tVar, "value");
        sVarNewBuilder.c(tVar);
        com.waze.sharedui.h.f fVar = hVar instanceof com.waze.sharedui.h.f ? (com.waze.sharedui.h.f) hVar : null;
        if (fVar != null && (numB = fVar.b()) != null) {
            sVarNewBuilder.b(numB.intValue());
        }
        if (rVar != null) {
            sVarNewBuilder.a(rVar.c());
        }
        l.b.u uVarBuild = sVarNewBuilder.build();
        h.g.b.x.e(uVarBuild, "build(...)");
        com.waze.sharedui.d.a.b bVarH = h.d.b.h(l.b.c.newBuilder());
        bVarH.Z(uVarBuild);
        axVar.d(new com.waze.stats.aq(bVarH.V()));
    }

    public static /* synthetic */ okhttp3.al h(okhttp3.al alVar, String str, long j2) {
        okhttp3.ak akVarC = new okhttp3.ak(alVar).c("X-Firebase-AppCheck", str);
        com.waze.network.g.a aVar = (com.waze.network.g.a) alVar.a(com.waze.network.g.a.class);
        if (aVar != null) {
            aVar.l((int) j2);
            akVarC.h(com.waze.network.g.a.class, aVar);
        }
        return akVarC.k();
    }

    public static boolean i(okhttp3.aq aqVar) {
        h.g.b.x.f(aqVar, "<this>");
        String strP = okhttp3.aq.p(aqVar, "X-Waze-Error-Code");
        return strP != null && Integer.parseInt(strP) == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.f] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, okhttp3.f] */
    /* JADX WARN: Type inference failed for: r4v9, types: [okhttp3.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j(okhttp3.ai r4, okhttp3.al r5, long r6, h.c.e r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.waze.network.b.av
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.network.b.av r0 = (com.waze.network.b.av) r0
            int r1 = r0.f31967c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31967c = r1
            goto L18
        L13:
            com.waze.network.b.av r0 = new com.waze.network.b.av
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31966b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f31967c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f31965a
            okhttp3.f r4 = (okhttp3.f) r4
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L64
        L2b:
            r5 = move-exception
            goto L68
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r8)
            kotlinx.coroutines.CompletableDeferred r8 = kotlinx.coroutines.bo.j()
            okhttp3.ah r2 = new okhttp3.ah
            r2.<init>(r4)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            okhttp3.ah r4 = r2.s(r6, r4)
            okhttp3.ai r6 = new okhttp3.ai
            r6.<init>(r4)
            okhttp3.f r4 = r6.r(r5)
            com.waze.network.b.aw r5 = new com.waze.network.b.aw
            r5.<init>(r8)
            okhttp3.g r5 = (okhttp3.g) r5
            r4.d(r5)
            r0.f31965a = r4     // Catch: java.lang.Throwable -> L2b
            r0.f31967c = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.c(r0)     // Catch: java.lang.Throwable -> L2b
            if (r8 == r1) goto L67
        L64:
            okhttp3.aq r8 = (okhttp3.aq) r8     // Catch: java.lang.Throwable -> L2b
            goto L6c
        L67:
            return r1
        L68:
            java.lang.Object r8 = e.b.c.a(r5)
        L6c:
            java.lang.Throwable r5 = h.m.c(r8)
            if (r5 != 0) goto L73
            return r8
        L73:
            r4.c()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.b.ay.j(okhttp3.ai, okhttp3.al, long, h.c.e):java.lang.Object");
    }

    private ay() {
        throw null;
    }
}
