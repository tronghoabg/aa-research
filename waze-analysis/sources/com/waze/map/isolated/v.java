package com.waze.map.isolated;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.waze.R;
import com.waze.map.dp;
import com.waze.map.dq;
import com.waze.map.eb;
import com.waze.map.ec;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class v extends com.waze.map.opengl.aa implements com.waze.shared_infra.s.a, org.a.d.a.a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f29256b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final ec f29257a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29258c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f29259d;

    /* renamed from: e, reason: collision with root package name */
    private final dp f29260e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29261f;

    /* renamed from: g, reason: collision with root package name */
    private final dq f29262g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, ec ecVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        super(context, attributeSet);
        h.g.b.x.f(context, "context");
        h.g.b.x.f(ecVar, "_touchNotifier");
        this.f29257a = ecVar;
        v vVar = this;
        boolean z = vVar instanceof org.a.d.a.b;
        if (z) {
            bVarC = ((org.a.d.a.b) vVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(dp.class);
        } else {
            bVarC = vVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(dp.class);
        }
        this.f29260e = (dp) bVarC.a(mVar, null, null);
        this.f29262g = ecVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MapView);
        h.g.b.x.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        q(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MapView_handleTouch, true));
        typedArrayObtainStyledAttributes.recycle();
        Runnable runnable = new Runnable() { // from class: com.waze.map.isolated.u
            @Override // java.lang.Runnable
            public final void run() {
                v.n(this.f29255a);
            }
        };
        if (z) {
            bVarC2 = ((org.a.d.a.b) vVar).l();
            mVar2 = new h.g.b.m(com.waze.native_managers.i.class);
        } else {
            bVarC2 = vVar.getKoin().a().c();
            mVar2 = new h.g.b.m(com.waze.native_managers.i.class);
        }
        ((com.waze.native_managers.i) bVarC2.a(mVar2, null, null)).post(com.waze.native_managers.h.f30693c, new com.waze.ads.f(runnable, 1));
    }

    static final void n(v vVar) {
        vVar.f29258c = true;
        vVar.r();
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public void h(MotionEvent motionEvent) {
        throw null;
    }

    public void i() {
        this.f29263h = false;
        t();
    }

    public void k() {
        throw null;
    }

    public final dq m() {
        return this.f29262g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o() {
        this.f29261f = false;
        t();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f29263h = true;
        r();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        this.f29263h = false;
        t();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h.g.b.x.f(motionEvent, "aEvent");
        if (!this.f29259d) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.f29257a.b(eb.f28816a);
        }
        dp dpVar = this.f29260e;
        if (!dpVar.b(motionEvent, this)) {
            dpVar.a();
            this.f29257a.b(eb.f28817b);
            return false;
        }
        h(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f29257a.b(eb.f28817b);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p() {
        this.f29261f = true;
        r();
    }

    public final void q(boolean z) {
        this.f29259d = z;
        setFocusableInTouchMode(z);
    }

    public final void r() {
        if (this.f29261f && this.f29263h && this.f29258c) {
            k();
        }
    }
}
