package com.waze.copilot.data.b;

import com.waze.MoodManager;
import com.waze.copilot.data.af;
import com.waze.gh;
import com.waze.jni.protos.CopilotMarketplaceMood;
import com.waze.settings.SettingsNativeManager;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.copilot.data.a.s f23004a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.copilot.data.a.n f23005b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.data.a.d f23006c;

    /* renamed from: d, reason: collision with root package name */
    private final SettingsNativeManager f23007d;

    /* renamed from: e, reason: collision with root package name */
    private final MoodManager f23008e;

    public n(com.waze.copilot.data.a.s sVar, com.waze.copilot.data.a.n nVar, com.waze.copilot.data.a.d dVar, SettingsNativeManager settingsNativeManager, MoodManager moodManager) {
        x.f(sVar, "selectedMoodDataSource");
        x.f(nVar, "marketplaceNewContentAvailableDataSource");
        x.f(dVar, "copilotAssetsDataSource");
        x.f(settingsNativeManager, "settingsNativeManager");
        x.f(moodManager, "moodManager");
        this.f23004a = sVar;
        this.f23005b = nVar;
        this.f23006c = dVar;
        this.f23007d = settingsNativeManager;
        this.f23008e = moodManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, java.lang.String r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.copilot.data.b.l
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.copilot.data.b.l r0 = (com.waze.copilot.data.b.l) r0
            int r1 = r0.f23000c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23000c = r1
            goto L18
        L13:
            com.waze.copilot.data.b.l r0 = new com.waze.copilot.data.b.l
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f22998a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23000c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r8)
            h.m r8 = (h.m) r8
            java.lang.Object r4 = r8.b()
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r8)
            com.waze.copilot.data.a.d r4 = r4.f23006c
            r0.f23000c = r3
            java.lang.Object r4 = r4.a(r5, r6, r7, r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.n.a(java.lang.String, java.lang.String, java.lang.String, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.b.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.waze.copilot.data.b.m
            if (r0 == 0) goto L13
            r0 = r5
            com.waze.copilot.data.b.m r0 = (com.waze.copilot.data.b.m) r0
            int r1 = r0.f23003c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23003c = r1
            goto L18
        L13:
            com.waze.copilot.data.b.m r0 = new com.waze.copilot.data.b.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f23001a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f23003c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e.b.c.b(r5)
            h.m r5 = (h.m) r5
            java.lang.Object r4 = r5.b()
            return r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r5)
            com.waze.copilot.data.a.n r4 = r4.f23005b
            r0.f23003c = r3
            java.lang.Object r4 = r4.a(r0)
            if (r4 != r1) goto L43
            return r1
        L43:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.n.b(h.c.e):java.lang.Object");
    }

    @Override // com.waze.copilot.data.b.h
    public final Object c(h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        this.f23007d.isMarketplaceMoodCached(new com.waze.c.e.a.a(completableDeferredJ, 17));
        return completableDeferredJ.c(eVar);
    }

    @Override // com.waze.copilot.data.b.h
    public final Object d(String str, h.c.e eVar) {
        CompletableDeferred completableDeferredJ = bo.j();
        this.f23008e.isMoodInConfig(str, new com.waze.c.e.a.a(completableDeferredJ, 16));
        return completableDeferredJ.c(eVar);
    }

    @Override // com.waze.copilot.data.b.h
    public final void e(boolean z) {
        this.f23004a.b(z);
    }

    @Override // com.waze.copilot.data.b.h
    public final void f(String str, boolean z) {
        if (str != null) {
            this.f23004a.c(str, z);
        }
    }

    @Override // com.waze.copilot.data.b.h
    public final Object g(af afVar) {
        CopilotMarketplaceMood.Builder builderNewBuilder = CopilotMarketplaceMood.newBuilder();
        builderNewBuilder.setId(afVar.a());
        builderNewBuilder.setName(afVar.c());
        builderNewBuilder.setIsAds(afVar.d());
        builderNewBuilder.setIsHidden(afVar.e());
        CopilotMarketplaceMood copilotMarketplaceMoodBuild = builderNewBuilder.build();
        x.e(copilotMarketplaceMoodBuild, "build(...)");
        gh.setMarketplaceMoodProto$default(this.f23008e, copilotMarketplaceMoodBuild, null, 2, null);
        return ab.f48028a;
    }
}
