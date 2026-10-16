package com.waze.map;

import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleObserver;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dw extends GLSurfaceView implements com.waze.map.isolated.d, com.waze.shared_infra.s.a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f28772a;

    /* renamed from: b, reason: collision with root package name */
    private String f28773b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28774c;

    /* renamed from: d, reason: collision with root package name */
    private com.waze.map.isolated.c f28775d;

    /* renamed from: e, reason: collision with root package name */
    private dp f28776e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28777f;

    /* renamed from: g, reason: collision with root package name */
    private final List f28778g;

    /* renamed from: h, reason: collision with root package name */
    private final ec f28779h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.map.f.f f28780i;

    /* renamed from: j, reason: collision with root package name */
    private final DefaultLifecycleObserver f28781j;

    /* renamed from: k, reason: collision with root package name */
    private com.waze.map.isolated.ab f28782k;

    public dw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28774c = false;
        this.f28775d = null;
        this.f28777f = kotlinx.coroutines.b.ck.b(dn.f28759a);
        this.f28778g = new ArrayList();
        this.f28779h = new ec();
        this.f28780i = com.waze.map.g.t.b();
        this.f28781j = new du(this);
        this.f28782k = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MapView);
        this.f28772a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapView_handleTouch, true);
        this.f28773b = typedArrayObtainStyledAttributes.getString(1);
        if (isInEditMode()) {
            return;
        }
        l();
    }

    private final void l() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        if (!isInEditMode()) {
            this.f28776e = (dp) com.waze.web.r.h(dp.class);
            if (this.f28782k == null) {
                if (this.f28773b != null) {
                    org.a.d.a.a aVar = com.waze.map.isolated.ad.f29214a;
                    if (aVar instanceof org.a.d.a.b) {
                        bVarC = ((org.a.d.a.b) aVar).l();
                        int i2 = h.g.b.ar.f48106a;
                        mVar = new h.g.b.m(com.waze.map.isolated.ad.class);
                    } else {
                        bVarC = aVar.getKoin().a().c();
                        int i3 = h.g.b.ar.f48106a;
                        mVar = new h.g.b.m(com.waze.map.isolated.ad.class);
                    }
                    this.f28782k = ((com.waze.map.isolated.ad) bVarC.a(mVar, null, null)).a(this.f28773b, this);
                    setEGLContextClientVersion(2);
                    setEGLConfigChooser(new dv());
                    setRenderer(this.f28782k);
                    setRenderMode(0);
                } else {
                    com.waze.shared_infra.i.a.b().g("Unable to create renderer - the TAG is null");
                }
            }
        }
        setFocusableInTouchMode(true);
    }

    @Override // com.waze.shared_infra.s.a
    public final /* synthetic */ LifecycleObserver a() {
        return this.f28781j;
    }

    public final dq b() {
        return this.f28779h;
    }

    final kotlinx.coroutines.b.ch c() {
        return this.f28777f;
    }

    public final void d() {
        com.waze.map.isolated.ab abVar = this.f28782k;
        if (abVar != null) {
            abVar.q();
        }
    }

    @Override // com.waze.map.isolated.d
    public final void e() {
        kotlinx.coroutines.b.bn bnVar = this.f28777f;
        com.waze.an.a.a.bd bdVar = (com.waze.an.a.a.bd) bnVar.d();
        com.waze.shared_infra.i.h.a("onNativeCanvasCleared(state: " + String.valueOf(bdVar) + ")");
        bnVar.e(dn.f28759a);
        if (bdVar instanceof Cdo) {
            ArrayList arrayList = new ArrayList(this.f28778g);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
            }
        }
    }

    @Override // com.waze.map.isolated.d
    public final void f(String str) {
        com.waze.shared_infra.i.h.a("onNativeCanvasReady - newCanvasId(" + str + ")");
        this.f28780i.c();
        kotlinx.coroutines.b.bn bnVar = this.f28777f;
        com.waze.an.a.a.bd bdVar = (com.waze.an.a.a.bd) bnVar.d();
        bnVar.e(new Cdo(new ab(str)));
        this.f28775d = ((com.waze.map.isolated.b) com.waze.web.r.h(com.waze.map.isolated.b.class)).a(str);
        if (bdVar instanceof dn) {
            ArrayList arrayList = new ArrayList(this.f28778g);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((com.google.firebase.messaging.l) arrayList.get(i2)).c();
            }
        }
    }

    public final void g(String str) {
        this.f28773b = str;
        l();
    }

    public final void h() {
        this.f28772a = true;
        setFocusableInTouchMode(true);
    }

    public final void i() {
        com.waze.map.isolated.ab abVar = this.f28782k;
        if (abVar != null) {
            abVar.A();
        }
    }

    final com.waze.shared_infra.s.d j(com.google.firebase.messaging.l lVar) {
        if (this.f28777f.d() instanceof Cdo) {
            lVar.c();
        }
        this.f28778g.add(lVar);
        return new com.waze.car_lib.i.a.d(this, lVar, 2, null);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        Log.i("MapView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        com.waze.map.isolated.ab abVar = this.f28782k;
        if (abVar != null) {
            abVar.s();
        }
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        Log.w("WAZE", "MapView onPause");
        com.waze.map.isolated.ab abVar = this.f28782k;
        if (abVar != null) {
            abVar.v();
        }
        this.f28774c = false;
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        Log.w("WAZE", "MapView onResume");
        if (this.f28774c) {
            onPause();
        }
        this.f28782k.u();
        super.onResume();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f28772a) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f28779h.b(eb.f28816a);
        }
        if (!this.f28776e.b(motionEvent, this)) {
            this.f28776e.a();
            this.f28779h.b(eb.f28817b);
            return false;
        }
        this.f28782k.r(MotionEvent.obtain(motionEvent));
        com.waze.map.isolated.c cVar = this.f28775d;
        if (cVar != null) {
            cVar.onTouchEvent(MotionEvent.obtain(motionEvent));
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f28779h.b(eb.f28817b);
        }
        return true;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.f28782k.t();
        super.surfaceChanged(surfaceHolder, i2, i3, i4);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        super.surfaceCreated(surfaceHolder);
        this.f28782k.u();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f28774c = true;
        this.f28782k.v();
        super.surfaceDestroyed(surfaceHolder);
    }
}
