package com.waze.map.canvas;

import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequest;
import com.waze.map.b.ff;
import com.waze.map.eb;
import com.waze.map.el;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ak implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f28523a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28524b;

    ak(Object obj, int i2) {
        this.f28524b = i2;
        this.f28523a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v47, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v51, types: [h.g.a.l, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = 2;
        int i3 = 1;
        switch (this.f28524b) {
            case 0:
                com.waze.map.main.aa aaVar = (com.waze.map.main.aa) obj;
                Object obj2 = this.f28523a;
                ((CanvasDelegatorImpl) obj2).o("mainMapGeometry.collect(" + aaVar + ")", new com.waze.authentication.as(obj2, aaVar, i3));
                return h.ab.f48028a;
            case 1:
                kotlinx.coroutines.b.bm bmVar = ((MainCanvasDelegatorImpl) this.f28523a).f28491l;
                h.ab abVar = h.ab.f48028a;
                bmVar.c(abVar);
                return abVar;
            case 2:
                Integer num = (Integer) obj;
                if (num != null) {
                    Object obj3 = this.f28523a;
                    final int iIntValue = num.intValue();
                    final MainCanvasDelegatorImpl mainCanvasDelegatorImpl = (MainCanvasDelegatorImpl) obj3;
                    ((CanvasDelegatorImpl) obj3).q("showNavigationArrowOnSegment(" + iIntValue + ")", new h.g.a.l() { // from class: com.waze.map.canvas.w
                        @Override // h.g.a.l
                        public final Object invoke(Object obj4) {
                            return MainCanvasDelegatorImpl.z(mainCanvasDelegatorImpl, iIntValue, (String) obj4);
                        }
                    });
                }
                return h.ab.f48028a;
            case 3:
                com.waze.shared_infra.l.a aVar = (com.waze.shared_infra.l.a) obj;
                Object obj4 = this.f28523a;
                if (aVar != null) {
                    ((CanvasDelegatorImpl) obj4).o("drawClosurePreview(segment = " + aVar + ")", new f((MainCanvasDelegatorImpl) obj4, (Object) aVar, 6));
                } else {
                    CanvasDelegatorImpl canvasDelegatorImpl = (CanvasDelegatorImpl) obj4;
                    canvasDelegatorImpl.o("clearClosurePreview", new h(canvasDelegatorImpl, 10));
                }
                return h.ab.f48028a;
            case 4:
                com.waze.map.e.a aVar2 = (com.waze.map.e.a) obj;
                MainCanvasDelegatorImpl.Z((MainCanvasDelegatorImpl) this.f28523a, aVar2.c(), aVar2.d());
                return h.ab.f48028a;
            case 5:
                com.waze.an.c.q qVar = (com.waze.an.c.q) obj;
                if (h.g.b.x.n(qVar, com.waze.map.b.g.f28352a)) {
                    CanvasDelegatorImpl canvasDelegatorImpl2 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl2.o("hideDarkOverlay", new h(canvasDelegatorImpl2, 9));
                } else if (h.g.b.x.n(qVar, com.waze.map.b.e.f28236a)) {
                    CanvasDelegatorImpl canvasDelegatorImpl3 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl3.o("showDarkOverlay", new h(canvasDelegatorImpl3, 11));
                } else {
                    if (!(qVar instanceof com.waze.map.b.f)) {
                        throw new h.i();
                    }
                    Object obj5 = this.f28523a;
                    com.waze.shared_infra.h.c cVarD = ((com.waze.map.b.f) qVar).d();
                    ((CanvasDelegatorImpl) obj5).o("showDarkOverlayWithHighlight(" + cVarD + ")", new f((MainCanvasDelegatorImpl) obj5, (Object) cVarD, 7));
                }
                return h.ab.f48028a;
            case 6:
                com.waze.map.b.bf bfVar = (com.waze.map.b.bf) obj;
                if (bfVar instanceof com.waze.map.b.k) {
                    CanvasDelegatorImpl canvasDelegatorImpl4 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl4.q("zoomIn", new h(canvasDelegatorImpl4, 1));
                } else if (bfVar instanceof com.waze.map.b.l) {
                    CanvasDelegatorImpl canvasDelegatorImpl5 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl5.q("zoomOut", new h(canvasDelegatorImpl5, 5));
                } else if (bfVar instanceof com.waze.map.b.m) {
                    Object obj6 = this.f28523a;
                    float fA = ((com.waze.map.b.m) bfVar).a();
                    ((CanvasDelegatorImpl) obj6).q("zoomToRate(" + fA + ")", new g(obj6, fA, 0));
                } else if (h.g.b.x.n(bfVar, com.waze.map.b.j.f28354a)) {
                    CanvasDelegatorImpl canvasDelegatorImpl6 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl6.q("notifyOverlayShown", new h(canvasDelegatorImpl6, 2));
                } else {
                    if (!h.g.b.x.n(bfVar, com.waze.map.b.i.f28353a)) {
                        throw new h.i();
                    }
                    CanvasDelegatorImpl canvasDelegatorImpl7 = (CanvasDelegatorImpl) this.f28523a;
                    canvasDelegatorImpl7.q("notifyOverlayHidden", new h(canvasDelegatorImpl7, 4));
                }
                return h.ab.f48028a;
            case 7:
                com.waze.map.b.ag agVar = (com.waze.map.b.ag) obj;
                Object obj7 = this.f28523a;
                ((CanvasDelegatorImpl) obj7).q("consumeCompassLockedRequests(emit=" + agVar + ")", new com.waze.authentication.as(agVar, obj7, i2, null));
                return h.ab.f48028a;
            case 8:
                bp bpVar = (bp) obj;
                if (bpVar.a() == null) {
                    com.waze.shared_infra.i.h.j("old MainCanvas doesn't support changing camera in a blink. only animated. request (" + bpVar + ") `animation=false` but we will animate anyways");
                }
                Object obj8 = this.f28523a;
                long jS = MainCanvasDelegatorImpl.s((MainCanvasDelegatorImpl) obj8, bpVar.a());
                com.waze.ap.b.o oVarB = bpVar.b();
                if (h.g.b.x.n(oVarB, com.waze.map.b.p.f28363a)) {
                    CanvasDelegatorImpl canvasDelegatorImpl8 = (CanvasDelegatorImpl) obj8;
                    canvasDelegatorImpl8.q("showOverview", new h(canvasDelegatorImpl8, 7));
                } else if (h.g.b.x.n(oVarB, com.waze.map.b.q.f28364a)) {
                    CanvasDelegatorImpl canvasDelegatorImpl9 = (CanvasDelegatorImpl) obj8;
                    canvasDelegatorImpl9.q("centerOnMe", new h(canvasDelegatorImpl9, 8));
                } else {
                    if (!(oVarB instanceof com.waze.map.b.o)) {
                        throw new h.i();
                    }
                    bk bkVarA = el.a((com.waze.map.b.o) oVarB);
                    CenterOnPositionRequest.Builder builderNewBuilder = CenterOnPositionRequest.newBuilder();
                    builderNewBuilder.setPosition(ConversionExtensionsKt.toIntPosition(bkVarA.b()));
                    float fA2 = bkVarA.a();
                    if (fA2 < 0.0f || fA2 > 1.0f) {
                        throw new IllegalArgumentException("MapZoom values should always be between 0-1");
                    }
                    float f2 = 8186.0f * fA2;
                    CanvasDelegatorImpl canvasDelegatorImpl10 = (CanvasDelegatorImpl) obj8;
                    com.waze.shared_infra.i.e eVarA = canvasDelegatorImpl10.a();
                    String strA = ff.a(fA2);
                    StringBuilder sb = new StringBuilder("reversed zoom for ");
                    sb.append(strA);
                    sb.append(" is ");
                    float f3 = f2 + 6.0f;
                    sb.append(f3);
                    eVarA.a(sb.toString());
                    builderNewBuilder.setZoom(m.e(f3));
                    builderNewBuilder.setAnimated(jS > 0);
                    Float fC = bkVarA.c();
                    if (fC != null) {
                        builderNewBuilder.setOrientationDegrees(fC.floatValue());
                    }
                    CenterOnPositionRequest centerOnPositionRequestBuild = builderNewBuilder.build();
                    h.g.b.x.e(centerOnPositionRequestBuild, "build(...)");
                    canvasDelegatorImpl10.q("centerOnPosition(" + bkVarA + ")", new f(canvasDelegatorImpl10, centerOnPositionRequestBuild, 5));
                }
                return h.ab.f48028a;
            case 9:
                eb ebVar = eb.f28816a;
                int iOrdinal = ((eb) obj).ordinal();
                if (iOrdinal == 0) {
                    this.f28523a.invoke(com.waze.map.b.ad.f27992a);
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    this.f28523a.invoke(com.waze.map.b.ac.f27991a);
                }
                return h.ab.f48028a;
            default:
                this.f28523a.invoke(com.waze.map.b.w.f28372a);
                return h.ab.f48028a;
        }
    }
}
