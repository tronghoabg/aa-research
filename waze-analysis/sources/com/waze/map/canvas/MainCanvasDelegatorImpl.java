package com.waze.map.canvas;

import com.waze.config.ConfigValues;
import com.waze.jni.protos.main_canvas.CenterOnPositionRequest;
import com.waze.map.MapNativeManager;
import com.waze.map.b.ed;
import com.waze.map.bv;
import com.waze.map.cd;
import com.waze.map.dq;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.Executor;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MainCanvasDelegatorImpl extends CanvasDelegatorImpl implements br {

    /* renamed from: a, reason: collision with root package name */
    private final MapNativeManager f28480a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f28481b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f28482c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f28483d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f28484e;

    /* renamed from: f, reason: collision with root package name */
    private final cd f28485f;

    /* renamed from: g, reason: collision with root package name */
    private final dq f28486g;

    /* renamed from: h, reason: collision with root package name */
    private final CanvasNativeCallbacksBridge f28487h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28488i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28489j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28490k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f28491l;
    private final aw m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCanvasDelegatorImpl(MapNativeManager mapNativeManager, ch chVar, kotlinx.coroutines.b.k kVar, Executor executor, kotlinx.coroutines.af afVar, com.waze.shared_infra.q.e eVar, cd cdVar, com.waze.shared_infra.i.e eVar2, aw awVar, dq dqVar, com.waze.location.q qVar) {
        super(chVar, executor, eVar2);
        h.g.b.x.f(mapNativeManager, "mapNativeManager");
        h.g.b.x.f(chVar, "canvasState");
        h.g.b.x.f(kVar, "mainMapGeometry");
        h.g.b.x.f(executor, "nativeThreadExecutor");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(awVar, "swapFactory");
        h.g.b.x.f(dqVar, "touchNotifier");
        h.g.b.x.f(qVar, "config");
        this.f28480a = mapNativeManager;
        this.f28481b = chVar;
        this.f28482c = kVar;
        this.f28483d = afVar;
        this.f28484e = eVar;
        this.f28485f = cdVar;
        this.m = awVar;
        this.f28486g = dqVar;
        this.f28487h = CanvasNativeCallbacksBridge.INSTANCE;
        this.f28488i = ck.b(null);
        this.f28489j = ck.b(null);
        this.f28490k = ck.b(null);
        this.f28491l = bu.e(0, 16, kotlinx.coroutines.a.a.f51272b, 1);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 1, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 2, (char[]) null), 3);
    }

    static final h.ab A(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        mainCanvasDelegatorImpl.nativeShowOverview(str);
        return h.ab.f48028a;
    }

    static final void T(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, au auVar, kotlinx.coroutines.s sVar) {
        mainCanvasDelegatorImpl.f28480a.removeMainMapListener(auVar);
        sVar.s(null);
    }

    static final h.ab U(MainCanvasDelegatorImpl mainCanvasDelegatorImpl) {
        mainCanvasDelegatorImpl.nativeClearClosurePreview();
        return h.ab.f48028a;
    }

    static final h.ab V(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.l.a aVar) {
        byte[] byteArray = bv.b(aVar).toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        mainCanvasDelegatorImpl.nativeDrawClosurePreview(byteArray);
        return h.ab.f48028a;
    }

    static final h.ab W(MainCanvasDelegatorImpl mainCanvasDelegatorImpl) {
        mainCanvasDelegatorImpl.nativeHideDarkOverlay();
        return h.ab.f48028a;
    }

    static final h.ab X(MainCanvasDelegatorImpl mainCanvasDelegatorImpl) {
        mainCanvasDelegatorImpl.nativeShowDarkOverlay();
        return h.ab.f48028a;
    }

    static final h.ab Y(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.h.c cVar) {
        mainCanvasDelegatorImpl.nativeShowDarkOverlayWithHighlight(cVar.c(), cVar.d());
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void Z(final MainCanvasDelegatorImpl mainCanvasDelegatorImpl, ed edVar, final com.waze.shared_infra.n.c cVar) {
        cVar.g(com.waze.map.b.d.f28176b);
        kotlinx.coroutines.s sVarQ = kotlinx.coroutines.aj.Q();
        kotlinx.coroutines.af afVar = mainCanvasDelegatorImpl.f28483d;
        kotlinx.coroutines.af afVarG = kotlinx.coroutines.aj.g(afVar, sVarQ);
        aw awVar = mainCanvasDelegatorImpl.m;
        ax axVar = awVar.f28565b;
        final bi biVar = new bi(awVar.f28564a, axVar.c(), axVar.f28568b, awVar.f28566c);
        kotlinx.coroutines.aj.z(afVar, null, null, new as(biVar, sVarQ, edVar, biVar.e(afVarG), mainCanvasDelegatorImpl, cVar, null), 3);
        sVarQ.bY(new h.g.a.l() { // from class: com.waze.map.canvas.y
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return MainCanvasDelegatorImpl.aa(this.f28668a, cVar, biVar);
            }
        });
        cVar.h(new com.waze.car_lib.b.m(sVarQ, 18));
    }

    static final h.ab aa(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, com.waze.shared_infra.n.c cVar, bi biVar) {
        kotlinx.coroutines.aj.z(mainCanvasDelegatorImpl.f28483d, null, null, new at(mainCanvasDelegatorImpl, cVar, biVar, null), 3);
        return h.ab.f48028a;
    }

    private final native void nativeCenterOnMe(String str);

    private final native void nativeCenterOnPosition(String str, byte[] bArr);

    private final native void nativeClearClosurePreview();

    private final native void nativeDrawClosurePreview(byte[] bArr);

    private final native void nativeHideDarkOverlay();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeSetCompassFixed(String str, boolean z);

    private final native void nativeShowDarkOverlay();

    private final native void nativeShowDarkOverlayWithHighlight(int i2, int i3);

    private final native void nativeShowNavigationArrowOnSegment(String str, int i2);

    private final native void nativeShowOverview(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeUpdateMarginsPixels(int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativeUpdateUserLocationInsets(int i2);

    public static final /* synthetic */ long s(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, Instant instant) {
        if (instant == null) {
            return 0L;
        }
        return h.k.n.k(Duration.between(mainCanvasDelegatorImpl.f28484e.b(), instant).toMillis(), 0L);
    }

    static final h.ab x(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, String str) {
        h.g.b.x.f(str, "it");
        mainCanvasDelegatorImpl.nativeCenterOnMe(str);
        return h.ab.f48028a;
    }

    static final h.ab y(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, CenterOnPositionRequest centerOnPositionRequest, String str) {
        h.g.b.x.f(str, "it");
        byte[] byteArray = centerOnPositionRequest.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        mainCanvasDelegatorImpl.nativeCenterOnPosition(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab z(MainCanvasDelegatorImpl mainCanvasDelegatorImpl, int i2, String str) {
        h.g.b.x.f(str, "it");
        mainCanvasDelegatorImpl.nativeShowNavigationArrowOnSegment(str, i2);
        return h.ab.f48028a;
    }

    @Override // com.waze.map.canvas.br
    public final kotlinx.coroutines.b.k C() {
        return this.f28488i;
    }

    @Override // com.waze.map.canvas.br
    public final kotlinx.coroutines.b.k D() {
        kotlinx.coroutines.b.bn bnVar = this.f28489j;
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_MAP_NORTH_LOCK.k();
        h.g.b.x.e(kVarK, "getFlow(...)");
        return kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.q(bnVar, kVarK, new av(null)));
    }

    @Override // com.waze.map.canvas.br
    public final /* synthetic */ ch J() {
        return this.f28490k;
    }

    @Override // com.waze.map.canvas.br
    public final void N(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ap(kVar, this, null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void O(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ao(kVar, this, (h.c.e) null, 2, (char[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void P(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ao(kVar, this, (h.c.e) null, 3, (short[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void Q(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ao(kVar, this, (h.c.e) null, 4, (int[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void R(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ao(kVar, this, (h.c.e) null, 5, (boolean[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final void S(kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(kVar, "requests");
        kotlinx.coroutines.aj.z(this.f28483d, null, null, new ao(kVar, this, (h.c.e) null, 6, (float[]) null), 3);
    }

    @Override // com.waze.map.canvas.br
    public final com.waze.shared_infra.s.d w(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "onEvent");
        final au auVar = new au(lVar);
        final kotlinx.coroutines.s sVarI = h.g.b.o.i();
        kotlinx.coroutines.s sVar = sVarI;
        ao aoVar = new ao(this, lVar, (h.c.e) null, 7);
        kotlinx.coroutines.af afVar = this.f28483d;
        kotlinx.coroutines.bo.c(afVar, sVar, aoVar);
        kotlinx.coroutines.bo.c(afVar, sVar, new ao(this, lVar, (h.c.e) null, 8, (byte[]) null));
        this.f28480a.addMainMapListener(auVar);
        return new com.waze.shared_infra.s.d() { // from class: com.waze.map.canvas.x
            @Override // com.waze.shared_infra.s.d
            public final void a() {
                MainCanvasDelegatorImpl.T(this.f28665a, auVar, sVarI);
            }
        };
    }
}
