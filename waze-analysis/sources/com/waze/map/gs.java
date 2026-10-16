package com.waze.map;

import android.content.Context;
import android.view.MotionEvent;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleObserver;
import com.waze.R;
import com.waze.ig;
import com.waze.map.opengl.WazeMapRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gs extends com.waze.map.isolated.v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29171a = 0;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f29172c;

    /* renamed from: d, reason: collision with root package name */
    private com.waze.map.isolated.c f29173d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.map.opengl.l f29174e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f29175f;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f29176g;

    /* renamed from: h, reason: collision with root package name */
    private dr f29177h;

    /* renamed from: i, reason: collision with root package name */
    private com.waze.bk.h f29178i;

    /* renamed from: j, reason: collision with root package name */
    private final DefaultLifecycleObserver f29179j;

    /* renamed from: k, reason: collision with root package name */
    private final List f29180k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs(Context context, ec ecVar, kotlinx.coroutines.b.bn bnVar) {
        super(context, null, ecVar);
        h.g.b.x.f(context, "context");
        h.g.b.x.f(ecVar, "_touchNotifier");
        h.g.b.x.f(bnVar, "_mapState");
        this.f29172c = bnVar;
        setId(R.id.wazeMapAndroidView);
        this.f29174e = new com.waze.map.opengl.l();
        this.f29175f = h.g.a(new com.waze.car_lib.b.m((Object) this, 17));
        this.f29176g = h.g.b(h.h.f48130a, new df(this, 2));
        this.f29179j = new gr(this);
        this.f29180k = new ArrayList();
    }

    public static /* synthetic */ h.ab c(gs gsVar, String str) {
        h.g.b.x.f(str, "mapId");
        com.waze.bk.e eVarJ = gsVar.j();
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(eVarJ, "renderThread");
        ((com.waze.map.f.f) gsVar.f29176g.getValue()).c();
        gsVar.f29173d = new NativeMapTouchController(str, eVarJ);
        gsVar.f29172c.e(new Cdo(new ac(str)));
        Iterator it = h.a.i.ao(gsVar.f29180k).iterator();
        while (it.hasNext()) {
            ((com.google.firebase.messaging.l) it.next()).c();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ void d(gs gsVar) {
        gsVar.f29172c.e(dn.f28759a);
        gsVar.f29173d = null;
        for (com.google.firebase.messaging.l lVar : h.a.i.ao(gsVar.f29180k)) {
        }
    }

    private final com.waze.bk.e j() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        gs gsVar = this;
        if (gsVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) gsVar).l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.opengl.g.class);
        } else {
            bVarC = gsVar.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.opengl.g.class);
        }
        return ((com.waze.map.opengl.g) bVarC.a(mVar, null, null)).c();
    }

    private final void l(com.waze.bk.h hVar) {
        if (hVar == null) {
            return;
        }
        j().execute(new ig(hVar, 19));
    }

    @Override // com.waze.shared_infra.s.a
    public final /* synthetic */ LifecycleObserver a() {
        return this.f29179j;
    }

    public final DefaultLifecycleObserver b() {
        return this.f29179j;
    }

    public final void g(dr drVar) {
        this.f29177h = drVar;
    }

    @Override // com.waze.map.isolated.v
    public final void h(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "motionEvent");
        this.f29174e.a();
        com.waze.map.isolated.c cVar = this.f29173d;
        if (cVar != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            h.g.b.x.e(motionEventObtain, "obtain(...)");
            cVar.onTouchEvent(motionEventObtain);
        }
    }

    @Override // com.waze.map.isolated.v
    public final void i() {
        super.i();
        l(this.f29178i);
        this.f29178i = null;
    }

    @Override // com.waze.map.isolated.v
    public final void k() {
        com.waze.bk.e eVarJ = j();
        WazeMapRenderer wazeMapRenderer = this.f29178i;
        if (wazeMapRenderer == null) {
            WazeMapRenderer wazeMapRenderer2 = new WazeMapRenderer(this.f29177h);
            wazeMapRenderer2.b(new com.waze.beacons.a.b(this, 20));
            wazeMapRenderer2.a(new ig(this, 18));
            wazeMapRenderer = wazeMapRenderer2;
        }
        com.waze.bk.h hVar = wazeMapRenderer;
        this.f29178i = hVar;
        s(eVarJ, new com.waze.map.opengl.x(com.waze.map.opengl.f.f29546b, this.f29174e, hVar, ((com.waze.map.opengl.d) this.f29175f.getValue()).b(), false));
    }

    @Override // com.waze.map.isolated.v, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l(this.f29178i);
        this.f29178i = null;
    }
}
