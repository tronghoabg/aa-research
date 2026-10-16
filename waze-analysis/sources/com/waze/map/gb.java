package com.waze.map;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import com.waze.gw.Gateway;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapDisplayState;
import com.waze.jni.protos.map.NorthLockBehavior;
import com.waze.jni.protos.map.RelativeViewPort;
import com.waze.map.b.Cdo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.canvas.a.d f29128a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.canvas.a.a f29129b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.canvas.a.f f29130c;

    /* renamed from: d, reason: collision with root package name */
    private final ar f29131d;

    /* renamed from: e, reason: collision with root package name */
    private final br f29132e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f29133f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f29134g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.ab f29135h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.ab f29136i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f29137j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f29138k;

    /* renamed from: l, reason: collision with root package name */
    private final de f29139l;
    private final h.g.a.l m;
    private final h.g.a.a n;
    private final dq o;
    private kotlinx.coroutines.s p;
    private int q;
    private final kotlinx.coroutines.b.bn r;
    private final kotlinx.coroutines.b.ch s;
    private final kotlinx.coroutines.b.ch t;

    public gb(com.waze.map.canvas.a.d dVar, com.waze.map.canvas.a.a aVar, com.waze.map.canvas.a.f fVar, ar arVar, br brVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.af afVar, kotlinx.coroutines.ab abVar, kotlinx.coroutines.ab abVar2, kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.b.k kVar, de deVar, h.g.a.l lVar, h.g.a.a aVar2, dq dqVar) {
        h.g.b.x.f(dVar, "mapDelegatorFactory");
        h.g.b.x.f(aVar, "boundsHelper");
        h.g.b.x.f(fVar, "protoHelper");
        h.g.b.x.f(arVar, "markerResolver");
        h.g.b.x.f(brVar, "positionTrackerFactory");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(abVar, "coroutineDispatcher");
        h.g.b.x.f(abVar2, "backgroundDispatcher");
        h.g.b.x.f(chVar, "mapState");
        h.g.b.x.f(kVar, "showLoaderFlow");
        h.g.b.x.f(deVar, "schemaProvider");
        h.g.b.x.f(lVar, "getCanvasViewBounds");
        h.g.b.x.f(aVar2, "getContext");
        h.g.b.x.f(dqVar, "touchNotifier");
        this.f29128a = dVar;
        this.f29129b = aVar;
        this.f29130c = fVar;
        this.f29131d = arVar;
        this.f29132e = brVar;
        this.f29133f = eVar;
        this.f29134g = afVar;
        this.f29135h = abVar;
        this.f29136i = abVar2;
        this.f29137j = chVar;
        this.f29138k = kVar;
        this.f29139l = deVar;
        this.m = lVar;
        this.n = aVar2;
        this.o = dqVar;
        this.p = h.g.b.o.i();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(cy.f28721a);
        this.r = bnVarB;
        kotlinx.coroutines.b.ch chVarU = kotlinx.coroutines.b.ai.U(bnVarB);
        this.s = chVarU;
        fy fyVar = new fy(new fy(chVarU, 2), 0);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.t = kotlinx.coroutines.b.ai.V(fyVar, afVar, kotlinx.coroutines.b.by.b(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapBounds.PositionPercentage A(com.waze.destination_cell.b.e eVar, Rect rect) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context context = (Context) this.n.invoke();
        float f2 = 1.0f;
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f2 = displayMetrics.density;
        }
        return B(eVar, rect, (int) (f2 * 24.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.waze.jni.protos.map.MapBounds.PositionPercentage B(com.waze.destination_cell.b.e r5, android.graphics.Rect r6, int r7) {
        /*
            boolean r0 = r5 instanceof com.waze.map.b.dr
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L33
            r0 = 1062501089(0x3f547ae1, float:0.83)
            if (r6 == 0) goto L2d
            int r4 = r6.height()
            if (r4 <= 0) goto L1a
            int r4 = r6.width()
            if (r4 > 0) goto L1b
        L1a:
            r6 = r2
        L1b:
            if (r6 == 0) goto L2d
            com.waze.map.b.dr r5 = (com.waze.map.b.dr) r5
            int r5 = r5.h()
            int r7 = r7 + r5
            int r5 = r6.height()
            float r5 = (float) r5
            float r6 = (float) r7
            float r6 = r6 / r5
            float r0 = r1 - r6
        L2d:
            android.graphics.PointF r5 = new android.graphics.PointF
            r5.<init>(r3, r0)
            goto L74
        L33:
            boolean r7 = r5 instanceof com.waze.map.b.ds
            if (r7 == 0) goto L3e
            com.waze.map.b.ds r5 = (com.waze.map.b.ds) r5
            android.graphics.PointF r5 = r5.h()
            goto L74
        L3e:
            boolean r7 = r5 instanceof com.waze.map.b.dt
            if (r7 == 0) goto L92
            if (r6 == 0) goto L6d
            int r7 = r6.height()
            if (r7 <= 0) goto L50
            int r7 = r6.width()
            if (r7 > 0) goto L51
        L50:
            r6 = r2
        L51:
            if (r6 == 0) goto L6d
            int r7 = r6.height()
            int r7 = r7 / 2
            com.waze.map.b.dt r5 = (com.waze.map.b.dt) r5
            int r5 = r5.h()
            int r7 = r7 + r5
            int r5 = r6.height()
            float r5 = (float) r5
            float r6 = (float) r7
            float r6 = r6 / r5
            r5 = 0
            float r5 = h.k.n.g(r6, r5, r1)
            goto L6e
        L6d:
            r5 = r3
        L6e:
            android.graphics.PointF r6 = new android.graphics.PointF
            r6.<init>(r3, r5)
            r5 = r6
        L74:
            com.waze.jni.protos.map.MapBounds$PositionPercentage$Builder r6 = com.waze.jni.protos.map.MapBounds.PositionPercentage.newBuilder()
            float r7 = r5.x
            r6.setXPercentage(r7)
            float r5 = r5.y
            float r5 = com.waze.gw.Gateway.raiseLandscapeMapAnchor(r5)
            r6.setYPercentage(r5)
            com.google.v.du r5 = r6.build()
            java.lang.String r6 = "build(...)"
            h.g.b.x.e(r5, r6)
            com.waze.jni.protos.map.MapBounds$PositionPercentage r5 = (com.waze.jni.protos.map.MapBounds.PositionPercentage) r5
            return r5
        L92:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.gb.B(com.waze.destination_cell.b.e, android.graphics.Rect, int):com.waze.jni.protos.map.MapBounds$PositionPercentage");
    }

    public static final /* synthetic */ Rect a(gb gbVar, Rect rect, com.waze.map.b.bs bsVar, Context context) {
        Rect rect2 = new Rect(rect);
        if (!h.g.b.x.n(bsVar, com.waze.map.b.bs.f28105a) && context != null) {
            int iW = w(context, bsVar.b());
            int iW2 = w(context, bsVar.c());
            int iW3 = w(context, bsVar.d());
            int iW4 = w(context, bsVar.a());
            if (rect2.width() > iW + iW2 && rect2.height() > iW3 + iW4) {
                rect2.left += iW;
                rect2.right -= iW2;
                rect2.top += iW3;
                rect2.bottom -= iW4;
                return rect2;
            }
            gbVar.f29133f.b("couldn't apply padding " + bsVar + " on rect " + rect2 + " as it will create a negative-sized rect, ignoring padding");
        }
        return rect2;
    }

    public static final /* synthetic */ MapBounds b(gb gbVar, Rect rect, Rect rect2, boolean z) {
        MapBounds.Builder builderNewBuilder = MapBounds.newBuilder();
        builderNewBuilder.setAnimated(z);
        h.g.b.x.e(builderNewBuilder, "setAnimated(...)");
        gbVar.x(builderNewBuilder, rect, rect2);
        MapBounds mapBoundsBuild = builderNewBuilder.build();
        h.g.b.x.e(mapBoundsBuild, "build(...)");
        return mapBoundsBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0343  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0334 -> B:78:0x0339). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.map.gb r17, com.waze.map.canvas.a.e r18, com.waze.map.cr r19, android.content.Context r20, com.waze.map.dc r21, h.c.e r22) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.gb.g(com.waze.map.gb, com.waze.map.canvas.a.e, com.waze.map.cr, android.content.Context, com.waze.map.dc, h.c.e):java.lang.Object");
    }

    static /* synthetic */ void r(gb gbVar, Boolean bool, Boolean bool2, Boolean bool3, int i2) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        cz czVar;
        do {
            bnVar = gbVar.r;
            int i3 = i2 & 1;
            Boolean bool4 = (i2 & 2) != 0 ? null : bool2;
            boolean zA = true;
            Boolean bool5 = 1 != i3 ? bool : null;
            objD = bnVar.d();
            com.waze.map.canvas.m mVar = (com.waze.map.canvas.m) objD;
            if (mVar instanceof cz) {
                cz czVar2 = (cz) mVar;
                boolean zBooleanValue = bool5 != null ? bool5.booleanValue() : czVar2.c();
                boolean zBooleanValue2 = bool4 != null ? bool4.booleanValue() : czVar2.b();
                Boolean bool6 = (i2 & 4) == 0 ? bool3 : null;
                if (bool6 != null) {
                    bool6.booleanValue();
                } else {
                    zA = czVar2.a();
                }
                czVar = new cz(zBooleanValue, zBooleanValue2, zA);
            } else {
                czVar = new cz(bool5 != null ? bool5.booleanValue() : false, bool4 != null ? bool4.booleanValue() : false, 4);
            }
        } while (!bnVar.f(objD, czVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object s(com.waze.map.gb r4, com.waze.map.canvas.a.e r5, com.waze.google_assistant.ah r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.map.es
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.es r0 = (com.waze.map.es) r0
            int r1 = r0.f28855c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28855c = r1
            goto L18
        L13:
            com.waze.map.es r0 = new com.waze.map.es
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.f28853a
            h.c.a.a r7 = h.c.a.a.f48038a
            int r1 = r0.f28855c
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            com.waze.google_assistant.ah r6 = r0.f28856d
            r5 = r6
            com.waze.google_assistant.ah r5 = (com.waze.google_assistant.ah) r5
            e.b.c.b(r4)
            goto L52
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r4)
            com.waze.map.cn r4 = r6.f()
            java.util.List r4 = r4.b()
            com.waze.map.cn r1 = r6.f()
            java.util.List r1 = r1.a()
            r0.f28856d = r6
            r0.f28855c = r2
            java.lang.Object r4 = r5.generateEtaLabelPositions(r4, r1, r0)
            if (r4 != r7) goto L52
            return r7
        L52:
            java.util.Map r4 = (java.util.Map) r4
            kotlinx.coroutines.CompletableDeferred r5 = r6.g()
            r5.a(r4)
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.gb.s(com.waze.map.gb, com.waze.map.canvas.a.e, com.waze.google_assistant.ah, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ MapBounds t(gb gbVar, Rect rect, Rect rect2, com.waze.google_assistant.an anVar, Cdo cdo, boolean z) {
        NorthLockBehavior northLockBehavior;
        MapBounds.Builder builderNewBuilder = MapBounds.newBuilder();
        builderNewBuilder.setAnimated(z);
        h.g.b.x.e(builderNewBuilder, "setAnimated(...)");
        if (cdo != null) {
            dd ddVar = dd.f28745a;
            com.waze.map.b.ct ctVar = com.waze.map.b.ct.f28165a;
            int iOrdinal = cdo.ordinal();
            if (iOrdinal == 0) {
                northLockBehavior = NorthLockBehavior.UNLOCKED;
            } else if (iOrdinal == 1) {
                northLockBehavior = NorthLockBehavior.STRONG_LOCK;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                northLockBehavior = NorthLockBehavior.WEAK_LOCK_WITH_AUTOMATIC_UNLOCK;
            }
            builderNewBuilder.setNorthLock(northLockBehavior);
        }
        if (!h.g.b.x.n(anVar, ch.f28677a)) {
            if (anVar instanceof cg) {
                MapBounds.MapFitCoordinate.Builder builderNewBuilder2 = MapBounds.MapFitCoordinate.newBuilder();
                cg cgVar = (cg) anVar;
                builderNewBuilder2.setCoordinate(ConversionExtensionsKt.toIntPosition(cgVar.j().j()));
                builderNewBuilder2.setZoom(cgVar.j().h());
                builderNewBuilder2.setOrientation(cgVar.i());
                builderNewBuilder2.setDisplayState(y(cgVar.j().i()));
                builderNewBuilder2.setPositionPercentage(B(cgVar.j().l(), rect2, 0));
                builderNewBuilder.setFitCoordinate(builderNewBuilder2.build());
            } else if (anVar instanceof cf) {
                MapBounds.MapFitContent.Builder builderNewBuilder3 = MapBounds.MapFitContent.newBuilder();
                builderNewBuilder3.setBoundsFactor(1.0f);
                builderNewBuilder.setFitContent(builderNewBuilder3.build());
            } else if (anVar instanceof ci) {
                MapBounds.ContinuouslyTrackUserLocation.Builder builderNewBuilder4 = MapBounds.ContinuouslyTrackUserLocation.newBuilder();
                ci ciVar = (ci) anVar;
                com.waze.z.a.e.b bVarH = ciVar.i().h();
                if (bVarH instanceof com.waze.map.b.ck) {
                    builderNewBuilder4.setDynamicZoom(true);
                } else {
                    if (!(bVarH instanceof com.waze.map.b.cl)) {
                        if (!(bVarH instanceof com.waze.map.b.cm)) {
                            throw new h.i();
                        }
                        throw null;
                    }
                    builderNewBuilder4.setManualZoom(true);
                }
                if (ciVar.i().i() != null) {
                    builderNewBuilder4.setUserLocationPositionPercentage(gbVar.A(ciVar.i().i(), rect2));
                }
                builderNewBuilder.setContinuouslyTrackUserLocation(builderNewBuilder4.build());
            } else {
                if (!(anVar instanceof ce)) {
                    throw new h.i();
                }
                MapBounds.MapFitArea.Builder builderNewBuilder5 = MapBounds.MapFitArea.newBuilder();
                ce ceVar = (ce) anVar;
                List listJ = ceVar.i().j();
                ArrayList arrayList = new ArrayList(h.a.i.q(listJ, 10));
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(ConversionExtensionsKt.toIntPosition((com.waze.shared_infra.h.c) it.next()));
                }
                builderNewBuilder5.addAllCoordinates(arrayList);
                builderNewBuilder5.setBoundsFactor(ceVar.i().h());
                builderNewBuilder5.setDisplayState(y(ceVar.i().i()));
                builderNewBuilder.setFitArea(builderNewBuilder5);
            }
        }
        gbVar.x(builderNewBuilder, rect, rect2);
        MapBounds mapBoundsBuild = builderNewBuilder.build();
        h.g.b.x.e(mapBoundsBuild, "build(...)");
        return mapBoundsBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[PHI: r8 r10 r11 r12
  0x00a5: PHI (r8v2 com.waze.map.gb) = (r8v0 com.waze.map.gb), (r8v0 com.waze.map.gb), (r8v5 com.waze.map.gb) binds: [B:20:0x0069, B:25:0x0076, B:32:0x00a1] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r10v1 com.waze.map.cx) = (r10v0 com.waze.map.cx), (r10v0 com.waze.map.cx), (r10v3 com.waze.map.cx) binds: [B:20:0x0069, B:25:0x0076, B:32:0x00a1] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r11v1 h.g.b.aq) = (r11v0 h.g.b.aq), (r11v0 h.g.b.aq), (r11v2 h.g.b.aq) binds: [B:20:0x0069, B:25:0x0076, B:32:0x00a1] A[DONT_GENERATE, DONT_INLINE]
  0x00a5: PHI (r12v2 com.waze.ae.e) = (r12v0 com.waze.ae.e), (r12v0 com.waze.ae.e), (r12v4 com.waze.ae.e) binds: [B:20:0x0069, B:25:0x0076, B:32:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object u(com.waze.map.gb r8, h.g.b.aq r9, com.waze.map.cx r10, h.g.b.aq r11, com.waze.ae.e r12, com.waze.map.canvas.a.e r13, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.gb.u(com.waze.map.gb, h.g.b.aq, com.waze.map.cx, h.g.b.aq, com.waze.ae.e, com.waze.map.canvas.a.e, h.c.e):java.lang.Object");
    }

    private static final int w(Context context, int i2) {
        return (int) (i2 * context.getResources().getDisplayMetrics().density);
    }

    private final void x(MapBounds.Builder builder, Rect rect, Rect rect2) {
        RelativeViewPort relativeViewPortA = this.f29129b.a(rect, Gateway.centerLandscapeMapViewport(rect, rect2));
        if (relativeViewPortA == null) {
            return;
        }
        builder.setViewPort(relativeViewPortA);
    }

    private static final MapDisplayState y(com.waze.map.b.ct ctVar) {
        dd ddVar = dd.f28745a;
        com.waze.map.b.ct ctVar2 = com.waze.map.b.ct.f28165a;
        Cdo cdo = Cdo.f28213a;
        int iOrdinal = ctVar.ordinal();
        if (iOrdinal == 0) {
            return MapDisplayState.DEFAULT;
        }
        if (iOrdinal == 1) {
            return MapDisplayState.OVERVIEW;
        }
        throw new h.i();
    }

    private final Object z(com.waze.map.canvas.a.e eVar, cx cxVar, h.c.e eVar2) {
        return eVar.addJniAdapter(new fv(cxVar, this), eVar2);
    }

    public final kotlinx.coroutines.b.ch n() {
        return this.s;
    }

    public final kotlinx.coroutines.b.ch o() {
        return this.t;
    }

    public final void p(cw cwVar) {
        h.g.b.x.f(cwVar, "presentation");
        this.f29133f.a("present() called (this is the " + this.q + "st time");
        kotlinx.coroutines.af afVar = this.f29134g;
        com.waze.map.main.v vVarC = cwVar.c();
        cx cxVarA = cwVar.a();
        cx cxVarB = cwVar.b();
        kotlinx.coroutines.s sVarC = h.g.b.o.c(h.g.b.o.d(afVar.getCoroutineContext()));
        this.p.s(null);
        this.p = sVarC;
        int i2 = this.q;
        this.q = i2 + 1;
        h.g.b.aq aqVar = new h.g.b.aq();
        aqVar.f48105a = h.g.b.o.c(sVarC);
        h.g.b.aq aqVar2 = new h.g.b.aq();
        h.g.b.aq aqVar3 = new h.g.b.aq();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        h.g.b.aq aqVar4 = new h.g.b.aq();
        com.waze.ad.c.b.a(afVar, new com.waze.car_lib.b.m(aqVar2, 14));
        com.waze.ad.c.b.a(afVar, new com.waze.car_lib.b.m(aqVar4, 15));
        kotlinx.coroutines.aj.z(afVar, this.f29135h, null, new ft(this, cxVarB, aqVar2, aqVar3, aqVar4, cxVarA, aqVar, sVarC, vVarC, i2 > 0, bnVarB, cwVar, null), 2);
    }
}
