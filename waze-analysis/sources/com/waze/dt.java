package com.waze;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dt extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.a.bl f23584a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.a.y f23585b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.a.ac f23586c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.y.a f23587d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.app_nav.w f23588e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.copilot.a.ao f23589f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f23590g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.copilot.a.s f23591h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f23592i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f23593j;

    public dt(com.waze.copilot.a.bl blVar, com.waze.copilot.a.y yVar, com.waze.copilot.a.ac acVar, com.waze.y.a aVar, com.waze.app_nav.w wVar, com.waze.copilot.a.ao aoVar, kotlinx.coroutines.b.k kVar, com.waze.config.a aVar2, com.waze.copilot.a.s sVar) {
        h.g.b.x.f(blVar, "setSelectedCarUseCase");
        h.g.b.x.f(yVar, "downloadAndSetTempCarAssetUseCase");
        h.g.b.x.f(acVar, "downloadCopilotMetadataAndAssetsUseCase");
        h.g.b.x.f(aVar, "copilotDeepLinksNotifier");
        h.g.b.x.f(wVar, "flowController");
        h.g.b.x.f(aoVar, "getTransportSdkCustomizedCarIDUseCase");
        h.g.b.x.f(kVar, "userProfileFlow");
        h.g.b.x.f(aVar2, "awaitConfigsSyncedUseCase");
        h.g.b.x.f(sVar, "deleteUnselectedCarsUseCase");
        this.f23584a = blVar;
        this.f23585b = yVar;
        this.f23586c = acVar;
        this.f23587d = aVar;
        this.f23588e = wVar;
        this.f23589f = aoVar;
        this.f23590g = kVar;
        this.f23591h = sVar;
        this.f23592i = true;
        this.f23593j = kotlinx.coroutines.b.ck.b(Cdo.f23571a);
        dt dtVar = this;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(dtVar), null, null, new ck(this, (h.c.e) null, 2), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(dtVar), null, null, new ck(this, (h.c.e) null, 3, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(dtVar), null, null, new ck(this, (h.c.e) null, 4, (char[]) null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r6.a(r3, r8) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object e(com.waze.dt r6, java.lang.String r7, com.waze.mywaze.ag r8, h.c.e r9) {
        /*
            boolean r0 = r9 instanceof com.waze.dp
            if (r0 == 0) goto L13
            r0 = r9
            com.waze.dp r0 = (com.waze.dp) r0
            int r1 = r0.f23576d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23576d = r1
            goto L18
        L13:
            com.waze.dp r0 = new com.waze.dp
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f23574b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23576d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.f23573a
            e.b.c.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r7 = r0.f23573a
            r8 = r7
            com.waze.mywaze.ag r8 = (com.waze.mywaze.ag) r8
            e.b.c.b(r9)
            h.m r9 = (h.m) r9
            java.lang.Object r7 = r9.b()
            goto L55
        L44:
            e.b.c.b(r9)
            com.waze.copilot.a.ac r9 = r6.f23586c
            r0.f23573a = r8
            r0.f23576d = r5
            r2 = 6
            java.lang.Object r7 = com.waze.copilot.a.ac.b(r9, r7, r3, r0, r2)
            if (r7 != r1) goto L55
            goto L82
        L55:
            boolean r9 = h.m.e(r7)
            if (r9 == 0) goto L83
            r9 = r7
            com.waze.copilot.a.aa r9 = (com.waze.copilot.a.aa) r9
            com.waze.copilot.data.a.g r9 = r9.d()
            h.m r9 = r9.a()
            if (r9 == 0) goto L83
            java.lang.Object r9 = r9.b()
            boolean r2 = r9 instanceof h.l
            if (r5 != r2) goto L71
            goto L72
        L71:
            r3 = r9
        L72:
            com.waze.copilot.data.c r3 = (com.waze.copilot.data.c) r3
            if (r3 == 0) goto L83
            com.waze.copilot.a.bl r6 = r6.f23584a
            r0.f23573a = r7
            r0.f23576d = r4
            java.lang.Object r6 = r6.a(r3, r8)
            if (r6 != r1) goto L83
        L82:
            return r1
        L83:
            r6 = r7
        L84:
            h.m.c(r6)
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.dt.e(com.waze.dt, java.lang.String, com.waze.mywaze.ag, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ void j(dt dtVar, com.waze.z.a.b.n nVar) {
        com.waze.copilot.aw awVar = com.waze.copilot.aw.f22909a;
        com.waze.copilot.av avVar = new com.waze.copilot.av();
        com.waze.copilot.a.j hVar = nVar instanceof com.waze.y.d ? new com.waze.copilot.a.h(((com.waze.y.d) nVar).a()) : nVar instanceof com.waze.y.e ? new com.waze.copilot.a.i(((com.waze.y.e) nVar).a()) : com.waze.copilot.a.j.f22838a;
        com.waze.app_nav.w wVar = dtVar.f23588e;
        avVar.b(hVar);
        wVar.a(new com.waze.app_nav.m(avVar.a(), new com.waze.app_nav.ah(false, com.waze.app_nav.c.f15197a, null, 4)));
    }
}
