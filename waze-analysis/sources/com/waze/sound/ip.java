package com.waze.sound;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ip implements ik {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40257a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.f.k f40258b;

    /* renamed from: c, reason: collision with root package name */
    private final jt f40259c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedui.e.g f40260d;

    /* renamed from: e, reason: collision with root package name */
    private final em f40261e;

    public ip(com.waze.shared_infra.i.e eVar, com.waze.sharedui.f.k kVar, jt jtVar, com.waze.sharedui.e.g gVar, em emVar) {
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(kVar, "networkGateway");
        h.g.b.x.f(jtVar, "voiceService");
        h.g.b.x.f(gVar, "wazeLocationService");
        h.g.b.x.f(emVar, "soundConfig");
        this.f40257a = eVar;
        this.f40258b = kVar;
        this.f40259c = jtVar;
        this.f40260d = gVar;
        this.f40261e = emVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.ak.q r20, h.c.e r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ip.f(com.waze.ak.q, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.sound.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, int r8, java.lang.String r9, h.c.e r10) throws java.lang.Exception {
        /*
            r6 = this;
            java.lang.String r0 = "sendGenerateFreeTextVoiceAssetRequest "
            java.lang.String r1 = "sendGenerateFreeTextVoiceAssetRequest response: "
            boolean r2 = r10 instanceof com.waze.sound.im
            if (r2 == 0) goto L17
            r2 = r10
            com.waze.sound.im r2 = (com.waze.sound.im) r2
            int r3 = r2.f40245c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f40245c = r3
            goto L1c
        L17:
            com.waze.sound.im r2 = new com.waze.sound.im
            r2.<init>(r6, r10)
        L1c:
            java.lang.Object r10 = r2.f40243a
            h.c.a.a r3 = h.c.a.a.f48038a
            int r4 = r2.f40245c
            r5 = 1
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            e.b.c.b(r10)     // Catch: java.lang.Exception -> L2c
            goto La8
        L2c:
            r7 = move-exception
            goto Ld5
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            e.b.c.b(r10)
            com.waze.ce.m r10 = com.waze.ce.n.newBuilder()     // Catch: java.lang.Exception -> L2c
            com.waze.ce.q r4 = com.waze.ce.r.newBuilder()     // Catch: java.lang.Exception -> L2c
            r4.a(r7)     // Catch: java.lang.Exception -> L2c
            r4.b(r8)     // Catch: java.lang.Exception -> L2c
            com.google.v.du r7 = r4.build()     // Catch: java.lang.Exception -> L2c
            com.waze.ce.r r7 = (com.waze.ce.r) r7     // Catch: java.lang.Exception -> L2c
            r10.c(r7)     // Catch: java.lang.Exception -> L2c
            r10.b(r9)     // Catch: java.lang.Exception -> L2c
            com.waze.sharedui.e.g r7 = r6.f40260d     // Catch: java.lang.Exception -> L2c
            com.waze.sharedui.e.c r7 = r7.a()     // Catch: java.lang.Exception -> L2c
            if (r7 == 0) goto L7f
            i.b.p r8 = i.b.s.newBuilder()     // Catch: java.lang.Exception -> L2c
            com.waze.shared_infra.h.c r9 = r7.f()     // Catch: java.lang.Exception -> L2c
            int r9 = r9.c()     // Catch: java.lang.Exception -> L2c
            r8.a(r9)     // Catch: java.lang.Exception -> L2c
            com.waze.shared_infra.h.c r7 = r7.f()     // Catch: java.lang.Exception -> L2c
            int r7 = r7.d()     // Catch: java.lang.Exception -> L2c
            r8.b(r7)     // Catch: java.lang.Exception -> L2c
            com.google.v.du r7 = r8.build()     // Catch: java.lang.Exception -> L2c
            i.b.s r7 = (i.b.s) r7     // Catch: java.lang.Exception -> L2c
            r10.a(r7)     // Catch: java.lang.Exception -> L2c
        L7f:
            com.google.v.du r7 = r10.build()     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = "build(...)"
            h.g.b.x.e(r7, r8)     // Catch: java.lang.Exception -> L2c
            com.waze.ce.n r7 = (com.waze.ce.n) r7     // Catch: java.lang.Exception -> L2c
            com.waze.shared_infra.i.e r8 = r6.f40257a     // Catch: java.lang.Exception -> L2c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2c
            r9.append(r7)     // Catch: java.lang.Exception -> L2c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L2c
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch: java.lang.Exception -> L2c
            r8.a(r9)     // Catch: java.lang.Exception -> L2c
            com.waze.sound.jt r8 = r6.f40259c     // Catch: java.lang.Exception -> L2c
            r2.f40245c = r5     // Catch: java.lang.Exception -> L2c
            java.lang.Object r10 = r8.c(r7, r2)     // Catch: java.lang.Exception -> L2c
            if (r10 != r3) goto La8
            return r3
        La8:
            com.waze.ce.p r10 = (com.waze.ce.p) r10     // Catch: java.lang.Exception -> L2c
            com.waze.shared_infra.i.e r7 = r6.f40257a     // Catch: java.lang.Exception -> L2c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c
            r8.<init>(r1)     // Catch: java.lang.Exception -> L2c
            r8.append(r10)     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L2c
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L2c
            r7.a(r8)     // Catch: java.lang.Exception -> L2c
            if (r10 == 0) goto Lcd
            com.waze.ce.u r7 = r10.getVoiceAsset()     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = "getVoiceAsset(...)"
            h.g.b.x.e(r7, r8)     // Catch: java.lang.Exception -> L2c
            com.waze.sound.ak r6 = com.waze.sound.e.h.l(r7)     // Catch: java.lang.Exception -> L2c
            return r6
        Lcd:
            java.lang.Exception r7 = new java.lang.Exception     // Catch: java.lang.Exception -> L2c
            java.lang.String r8 = "VoiceService is null"
            r7.<init>(r8)     // Catch: java.lang.Exception -> L2c
            throw r7     // Catch: java.lang.Exception -> L2c
        Ld5:
            com.waze.shared_infra.i.e r6 = r6.f40257a
            java.lang.String r8 = "sendGenerateFreeTextVoiceAssetRequest failed"
            r9 = r7
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            r6.c(r8, r9)
            boolean r6 = r7 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto Le5
            r6 = 0
            return r6
        Le5:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ip.a(java.lang.String, int, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0121 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:25:0x0105, B:27:0x0121, B:28:0x013d, B:30:0x0143), top: B:55:0x0105 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ae A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:32:0x0153, B:33:0x017f, B:35:0x0185, B:36:0x0196, B:37:0x01a9, B:39:0x01ae, B:40:0x01b7), top: B:57:0x0153 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0102 -> B:55:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01c5 -> B:49:0x01c8). Please report as a decompilation issue!!! */
    @Override // com.waze.sound.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, int r19, com.google.v.v r20, h.g.a.a r21, h.c.e r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ip.b(java.lang.String, int, com.google.v.v, h.g.a.a, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.waze.sound.ik
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, int r9, com.google.v.v r10, com.waze.sound.ij r11, h.c.e r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.ip.c(java.lang.String, int, com.google.v.v, com.waze.sound.ij, h.c.e):java.lang.Object");
    }

    @Override // com.waze.sound.ik
    public final Object d(String str, bk bkVar, bp bpVar, com.waze.copilot.data.ah ahVar, com.waze.av.b.n nVar, h.c.e eVar) {
        com.waze.ak.l lVar;
        com.waze.ak.y yVar;
        com.waze.ak.af afVar;
        com.waze.ak.p pVarNewBuilder = com.waze.ak.q.newBuilder();
        pVarNewBuilder.a(str);
        h.g.b.x.f(bkVar, "<this>");
        bk bkVar2 = bk.f39540a;
        com.waze.copilot.data.ah ahVar2 = com.waze.copilot.data.ah.f22965a;
        int iOrdinal = bkVar.ordinal();
        if (iOrdinal == 0) {
            lVar = com.waze.ak.l.METER;
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            lVar = com.waze.ak.l.FOOT;
        }
        pVarNewBuilder.c(lVar);
        ij ijVar = ij.f40237a;
        com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
        bp bpVar2 = bp.f39554a;
        int iOrdinal2 = bpVar.ordinal();
        if (iOrdinal2 == 0) {
            yVar = com.waze.ak.y.FULL;
        } else if (iOrdinal2 == 1) {
            yVar = com.waze.ak.y.BRIEF;
        } else if (iOrdinal2 == 2) {
            yVar = com.waze.ak.y.PERSONALIZED;
        } else {
            if (iOrdinal2 != 3 && iOrdinal2 != 4) {
                throw new h.i();
            }
            this.f40257a.b("Unexpected Guidance Mode: " + bpVar.a() + ". Returning FULL.");
            yVar = com.waze.ak.y.FULL;
        }
        pVarNewBuilder.d(yVar);
        if (nVar != null) {
            com.waze.ak.i iVarNewBuilder = com.waze.ak.j.newBuilder();
            String strE = nVar.e().c().e();
            if (strE != null) {
                com.waze.ak.ad adVarNewBuilder = com.waze.ak.ae.newBuilder();
                h.g.b.x.f(adVarNewBuilder, "builder");
                h.g.b.x.f(strE, "value");
                adVarNewBuilder.a(strE);
                com.waze.ak.ae aeVarBuild = adVarNewBuilder.build();
                h.g.b.x.e(aeVarBuild, "build(...)");
                iVarNewBuilder.b(aeVarBuild);
            }
            if (nVar instanceof com.waze.av.b.k) {
                com.waze.av.b.k kVar = (com.waze.av.b.k) nVar;
                int iOrdinal3 = kVar.f().ordinal();
                if (iOrdinal3 == 0) {
                    com.waze.car_lib.r.aw awVarE = com.waze.destination_cell.b.e.e(com.waze.ak.o.newBuilder());
                    com.waze.ak.e eVarNewBuilder = com.waze.ak.f.newBuilder();
                    h.g.b.x.f(eVarNewBuilder, "builder");
                    String strH = kVar.h();
                    h.g.b.x.f(strH, "value");
                    eVarNewBuilder.a(strH);
                    com.waze.ak.f fVarBuild = eVarNewBuilder.build();
                    h.g.b.x.e(fVarBuild, "build(...)");
                    awVarE.d(fVarBuild);
                    iVarNewBuilder.a(awVarE.c());
                } else if (iOrdinal3 == 1) {
                    com.waze.car_lib.r.aw awVarE2 = com.waze.destination_cell.b.e.e(com.waze.ak.o.newBuilder());
                    com.waze.ak.t tVarNewBuilder = com.waze.ak.u.newBuilder();
                    h.g.b.x.f(tVarNewBuilder, "builder");
                    com.waze.ak.u uVarBuild = tVarNewBuilder.build();
                    h.g.b.x.e(uVarBuild, "build(...)");
                    awVarE2.e(uVarBuild);
                    iVarNewBuilder.a(awVarE2.c());
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        throw new h.i();
                    }
                    com.waze.car_lib.r.aw awVarE3 = com.waze.destination_cell.b.e.e(com.waze.ak.o.newBuilder());
                    com.waze.ak.e eVarNewBuilder2 = com.waze.ak.f.newBuilder();
                    h.g.b.x.f(eVarNewBuilder2, "builder");
                    String strH2 = kVar.h();
                    h.g.b.x.f(strH2, "value");
                    eVarNewBuilder2.a(strH2);
                    com.waze.ak.f fVarBuild2 = eVarNewBuilder2.build();
                    h.g.b.x.e(fVarBuild2, "build(...)");
                    awVarE3.d(fVarBuild2);
                    iVarNewBuilder.a(awVarE3.c());
                } else {
                    com.waze.car_lib.r.aw awVarE4 = com.waze.destination_cell.b.e.e(com.waze.ak.o.newBuilder());
                    com.waze.ak.aj ajVarNewBuilder = com.waze.ak.ak.newBuilder();
                    h.g.b.x.f(ajVarNewBuilder, "builder");
                    com.waze.ak.ak akVarBuild = ajVarNewBuilder.build();
                    h.g.b.x.e(akVarBuild, "build(...)");
                    awVarE4.f(akVarBuild);
                    iVarNewBuilder.a(awVarE4.c());
                }
            }
            com.waze.ak.j jVarBuild = iVarNewBuilder.build();
            h.g.b.x.e(jVarBuild, "build(...)");
            pVarNewBuilder.b(jVarBuild);
        }
        h.g.b.x.f(ahVar, "<this>");
        int iOrdinal4 = ahVar.ordinal();
        if (iOrdinal4 == 0) {
            afVar = com.waze.ak.af.TTS;
        } else {
            if (iOrdinal4 != 1) {
                throw new h.i();
            }
            afVar = com.waze.ak.af.PROMPT;
        }
        pVarNewBuilder.e(afVar);
        com.waze.ak.q qVarBuild = pVarNewBuilder.build();
        h.g.b.x.e(qVarBuild, "build(...)");
        com.waze.ak.q qVar = qVarBuild;
        com.waze.shared_infra.i.e eVar2 = this.f40257a;
        Objects.toString(qVar);
        eVar2.a("sendGetVoiceInstructionsRequestUsingGuidanceMode ".concat(String.valueOf(qVar)));
        return f(qVar, eVar);
    }
}
