package com.waze.copilot.a;

import com.waze.sound.em;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final ae f22675a;

    /* renamed from: b, reason: collision with root package name */
    private final z f22676b;

    public ac(ae aeVar, z zVar, em emVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aeVar, "downloadCopilotMetadataUseCase");
        h.g.b.x.f(zVar, "downloadCopilotAssetsUseCase");
        h.g.b.x.f(emVar, "soundConfig");
        h.g.b.x.f(eVar, "logger");
        this.f22675a = aeVar;
        this.f22676b = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object a(com.waze.copilot.a.ac r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, h.c.e r10) {
        /*
            boolean r0 = r10 instanceof com.waze.copilot.a.ab
            if (r0 == 0) goto L13
            r0 = r10
            com.waze.copilot.a.ab r0 = (com.waze.copilot.a.ab) r0
            int r1 = r0.f22674d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22674d = r1
            goto L18
        L13:
            com.waze.copilot.a.ab r0 = new com.waze.copilot.a.ab
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f22672b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22674d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f22671a
            com.waze.copilot.data.a.g r6 = (com.waze.copilot.data.a.g) r6
            e.b.c.b(r10)
            goto La6
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.f22671a
            com.waze.copilot.a.ac r6 = (com.waze.copilot.a.ac) r6
            e.b.c.b(r10)
            h.m r10 = (h.m) r10
            java.lang.Object r7 = r10.b()
            goto L54
        L45:
            e.b.c.b(r10)
            com.waze.copilot.a.ae r10 = r6.f22675a
            r0.f22671a = r6
            r0.f22674d = r4
            java.lang.Object r7 = r10.a(r7, r8, r9, r0)
            if (r7 == r1) goto Lbc
        L54:
            boolean r8 = r7 instanceof h.l
            r9 = 0
            if (r4 != r8) goto L5a
            r7 = r9
        L5a:
            com.waze.copilot.data.a.g r7 = (com.waze.copilot.data.a.g) r7
            if (r8 != 0) goto Lae
            if (r7 != 0) goto L61
            goto Lae
        L61:
            h.m r8 = r7.c()
            if (r8 == 0) goto L73
            java.lang.Object r8 = r8.b()
            boolean r10 = r8 instanceof h.l
            if (r4 != r10) goto L70
            r8 = r9
        L70:
            com.waze.copilot.data.ag r8 = (com.waze.copilot.data.ag) r8
            goto L74
        L73:
            r8 = r9
        L74:
            com.waze.copilot.a.z r6 = r6.f22676b
            h.m r10 = r7.a()
            if (r10 == 0) goto L88
            java.lang.Object r10 = r10.b()
            boolean r2 = r10 instanceof h.l
            if (r4 != r2) goto L85
            r10 = r9
        L85:
            com.waze.copilot.data.c r10 = (com.waze.copilot.data.c) r10
            goto L89
        L88:
            r10 = r9
        L89:
            h.m r2 = r7.b()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r2.b()
            boolean r5 = r2 instanceof h.l
            if (r4 != r5) goto L98
            goto L99
        L98:
            r9 = r2
        L99:
            com.waze.copilot.data.af r9 = (com.waze.copilot.data.af) r9
        L9b:
            r0.f22671a = r7
            r0.f22674d = r3
            java.lang.Object r10 = r6.a(r10, r9, r8, r0)
            if (r10 == r1) goto Lbc
            r6 = r7
        La6:
            com.waze.copilot.data.o r10 = (com.waze.copilot.data.o) r10
            com.waze.copilot.a.aa r7 = new com.waze.copilot.a.aa
            r7.<init>(r6, r10)
            return r7
        Lae:
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r7 = "FailedToFetchMetaData"
            r6.<init>(r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            java.lang.Object r6 = e.b.c.a(r6)
            return r6
        Lbc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.a.ac.a(com.waze.copilot.a.ac, java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object b(ac acVar, String str, String str2, h.c.e eVar, int i2) {
        if (1 == (i2 & 1)) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return a(acVar, str, null, str2, eVar);
    }
}
