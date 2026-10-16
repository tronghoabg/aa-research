package com.waze.copilot.data.b;

import android.content.Context;
import com.waze.copilot.data.CopilotNativeManager;
import com.waze.copilot.data.ac;
import com.waze.copilot.data.ad;
import com.waze.copilot.data.ae;
import com.waze.copilot.data.z;
import com.waze.jni.protos.copilot.data.CarRenderingInfo;
import com.waze.jni.protos.copilot.data.LightingRenderingInfo;
import com.waze.mywaze.ag;
import com.waze.mywaze.ah;
import h.ab;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f22980a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22981b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.copilot.data.a.q f22982c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.copilot.data.a.a f22983d;

    /* renamed from: e, reason: collision with root package name */
    private final z f22984e;

    /* renamed from: f, reason: collision with root package name */
    private final CopilotNativeManager f22985f;

    /* renamed from: g, reason: collision with root package name */
    private final ah f22986g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.copilot.data.c f22987h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.copilot.data.c f22988i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f22989j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f22990k;

    public f(Context context, com.waze.shared_infra.i.e eVar, com.waze.copilot.data.a.q qVar, com.waze.copilot.data.a.a aVar, z zVar, CopilotNativeManager copilotNativeManager, ah ahVar) {
        x.f(context, "appContext");
        x.f(eVar, "logger");
        x.f(qVar, "selectedCarDataSource");
        x.f(aVar, "carsDataSource");
        x.f(zVar, "copilotCarProtoCache");
        x.f(copilotNativeManager, "copilotNativeManager");
        x.f(ahVar, "userProfileStatsSender");
        this.f22980a = context;
        this.f22981b = eVar;
        this.f22982c = qVar;
        this.f22983d = aVar;
        this.f22984e = zVar;
        this.f22985f = copilotNativeManager;
        this.f22986g = ahVar;
        com.waze.copilot.data.c cVar = new com.waze.copilot.data.c(1L, "MAP_CAR_Arrow", new ad(true, true, true, 1.0f, new ae(1.0f, Float.valueOf(0.0f))), new com.waze.copilot.data.a(1L, ""), new com.waze.copilot.data.b(null));
        this.f22987h = cVar;
        bn bnVarB = ck.b(cVar);
        this.f22989j = bnVarB;
        this.f22990k = ai.U(bnVarB);
    }

    private final void n(com.waze.copilot.data.c cVar) {
        CopilotNativeManager copilotNativeManager = this.f22985f;
        String strE = (x.n(cVar.e(), "Arrow") || x.n(cVar.e(), "MAP_CAR_Arrow")) ? "arrow" : cVar.e();
        ad adVarD = cVar.d();
        ae aeVarB = adVarD != null ? adVarD.b() : null;
        ad adVarD2 = cVar.d();
        float fA = adVarD2 != null ? adVarD2.a() : 1.0f;
        ad adVarD3 = cVar.d();
        boolean zE = adVarD3 != null ? adVarD3.e() : false;
        ad adVarD4 = cVar.d();
        boolean zD = adVarD4 != null ? adVarD4.d() : false;
        CarRenderingInfo.Builder builderNewBuilder = CarRenderingInfo.newBuilder();
        builderNewBuilder.setCarName(strE);
        if (cVar.d() != null) {
            String strConcat = "cars/".concat(String.valueOf(strE));
            builderNewBuilder.setModelFileName(strConcat.concat("_model.obj"));
            builderNewBuilder.setNormalTextureFilePath(strConcat.concat("_texture_normal"));
            if (zE) {
                builderNewBuilder.setTaxiTextureFilePath(strConcat.concat("_texture_taxi"));
            }
            if (zD) {
                builderNewBuilder.setShareTextureFilePath(strConcat.concat("_texture_share"));
            }
            builderNewBuilder.setScale(fA);
            LightingRenderingInfo.Builder builderNewBuilder2 = LightingRenderingInfo.newBuilder();
            builderNewBuilder2.setAmbientIntensity(aeVarB != null ? aeVarB.a() : 1.0f);
            if ((aeVarB != null ? aeVarB.b() : null) != null) {
                builderNewBuilder2.setDiffuseIntensity(aeVarB.b().floatValue());
            }
            builderNewBuilder.setLightingInfo(builderNewBuilder2.build());
        }
        CarRenderingInfo carRenderingInfoBuild = builderNewBuilder.build();
        x.e(carRenderingInfoBuild, "build(...)");
        ac.setSelectedCar$default(copilotNativeManager, carRenderingInfoBuild, null, 2, null);
    }

    @Override // com.waze.copilot.data.b.a
    public final com.waze.copilot.data.c a() {
        return this.f22988i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h.c.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.waze.copilot.data.b.b
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.copilot.data.b.b r0 = (com.waze.copilot.data.b.b) r0
            int r1 = r0.f22971c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22971c = r1
            goto L18
        L13:
            com.waze.copilot.data.b.b r0 = new com.waze.copilot.data.b.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22969a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22971c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            kotlinx.coroutines.ab r6 = kotlinx.coroutines.av.b()
            h.c.j r6 = (h.c.j) r6
            com.waze.copilot.data.b.c r2 = new com.waze.copilot.data.b.c
            r4 = 0
            r2.<init>(r5, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f22971c = r3
            java.lang.Object r6 = kotlinx.coroutines.aj.v(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            h.m r6 = (h.m) r6
            java.lang.Object r5 = r6.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.f.b(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.copilot.data.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(h.c.e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.copilot.data.b.d
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.copilot.data.b.d r0 = (com.waze.copilot.data.b.d) r0
            int r1 = r0.f22976c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22976c = r1
            goto L18
        L13:
            com.waze.copilot.data.b.d r0 = new com.waze.copilot.data.b.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f22974a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22976c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            h.g.b.aq r0 = r0.f22977d
            r1 = r0
            h.g.b.aq r1 = (h.g.b.aq) r1
            e.b.c.b(r7)
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            e.b.c.b(r7)
            h.g.b.aq r7 = new h.g.b.aq
            r7.<init>()
            com.waze.shared_infra.i.e r2 = r6.f22981b
            java.lang.String r4 = "loadCarFromCache called"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r2.a(r4)
            kotlinx.coroutines.ab r2 = kotlinx.coroutines.av.b()
            h.c.j r2 = (h.c.j) r2
            com.waze.copilot.data.b.e r4 = new com.waze.copilot.data.b.e
            r5 = 0
            r4.<init>(r7, r6, r5)
            h.g.a.p r4 = (h.g.a.p) r4
            r0.f22977d = r7
            r0.f22976c = r3
            java.lang.Object r0 = kotlinx.coroutines.aj.v(r2, r4, r0)
            if (r0 == r1) goto L77
            r0 = r7
        L5e:
            com.waze.shared_infra.i.e r6 = r6.f22981b
            java.lang.Object r7 = r0.f48105a
            java.util.Objects.toString(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "loaded car: "
            java.lang.String r7 = r1.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r6.a(r7)
            java.lang.Object r6 = r0.f48105a
            return r6
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.data.b.f.c(h.c.e):java.lang.Object");
    }

    @Override // com.waze.copilot.data.b.a
    public final String d() {
        return this.f22982c.a();
    }

    @Override // com.waze.copilot.data.b.a
    public final ch e() {
        return this.f22990k;
    }

    @Override // com.waze.copilot.data.b.a
    public final Object f() {
        this.f22984e.c();
        com.waze.copilot.data.c cVar = this.f22987h;
        n(cVar);
        this.f22989j.e(cVar);
        return ab.f48028a;
    }

    @Override // com.waze.copilot.data.b.a
    public final Object g(String str) {
        return Boolean.valueOf(this.f22984e.d(str));
    }

    @Override // com.waze.copilot.data.b.a
    public final Object h(com.waze.copilot.data.c cVar, boolean z, ag agVar, boolean z2) {
        Objects.toString(cVar);
        this.f22981b.a("setSelectedCar called with car: ".concat(String.valueOf(cVar)));
        if (z) {
            this.f22986g.b(((com.waze.copilot.data.c) this.f22990k.d()).e(), cVar.e(), agVar);
        }
        this.f22982c.b(cVar.e());
        if (!x.n(cVar.e(), "MAP_CAR_Arrow") && !x.n(cVar.e(), "Arrow") && z2) {
            this.f22984e.b(cVar);
        }
        this.f22989j.e(cVar);
        if (this.f22988i == null) {
            n(cVar);
        }
        return ab.f48028a;
    }

    @Override // com.waze.copilot.data.b.a
    public final Object i(com.waze.copilot.data.c cVar) {
        this.f22988i = cVar;
        this.f22989j.e(cVar);
        n(cVar);
        return ab.f48028a;
    }

    @Override // com.waze.copilot.data.b.a
    public final Object j(boolean z, ag agVar) {
        Object objH = h(this.f22987h, z, agVar, true);
        return objH == h.c.a.a.f48038a ? objH : ab.f48028a;
    }
}
