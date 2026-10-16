package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uuj extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, defpackage.uuo {
    private final defpackage.vlu a;
    private defpackage.uup b;
    private boolean c;
    private boolean d;
    private defpackage.uun e;
    private defpackage.uuu f;
    private final defpackage.xei g;
    private defpackage.xei h;

    public uuj(android.content.Context context, defpackage.xei xeiVar, defpackage.vlu vluVar) {
        super(context);
        this.g = xeiVar;
        this.a = vluVar;
    }

    @Override // defpackage.uuo
    public final void b(java.lang.String str, java.io.PrintWriter printWriter) {
        printWriter.println(str.concat("GLSurfaceView:"));
        boolean z = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("detached: ");
        sb.append(z);
        printWriter.println(sb.toString());
        printWriter.println(strConcat + "destroyed: " + this.d);
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.fB(strConcat, printWriter);
        }
    }

    @Override // defpackage.uuo
    public final void c() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.d();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        defpackage.xei xeiVar = this.h;
        return xeiVar == null ? super.canScrollHorizontally(i) : xeiVar.t();
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        defpackage.xei xeiVar = this.h;
        return xeiVar == null ? super.canScrollVertically(i) : xeiVar.t();
    }

    @Override // defpackage.uuo
    public final void d() {
        this.d = true;
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.e();
            this.f = null;
        }
    }

    @Override // defpackage.uuo
    public final void e() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.f();
        }
    }

    @Override // defpackage.uuo
    public final void f() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.g();
        }
    }

    protected final void finalize() throws java.lang.Throwable {
        try {
            defpackage.uuu uuuVar = this.f;
            if (uuuVar != null) {
                uuuVar.e();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.uuo
    public final void g(defpackage.uun uunVar) {
        this.e = uunVar;
    }

    @Override // defpackage.uuo
    public final void h(defpackage.uup uupVar) {
        this.f = new defpackage.uuu(uupVar, this.a);
        this.b = uupVar;
        getHolder().addCallback(this);
    }

    @Override // defpackage.uuo
    public final void i(boolean z) {
        if (z) {
            setAlpha(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        } else {
            setAlpha(1.0f);
        }
    }

    @Override // defpackage.uuo
    public final void j() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.h();
        }
    }

    @Override // defpackage.uuo
    public final void k() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.i();
        }
    }

    @Override // defpackage.uuo
    public final boolean m() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            return uuuVar.o();
        }
        return false;
    }

    @Override // defpackage.uuo
    public final void n() {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.q();
        }
    }

    @Override // defpackage.uuo
    public final void o(defpackage.xei xeiVar) {
        this.h = xeiVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        defpackage.uuu uuuVar;
        super.onAttachedToWindow();
        if (this.d) {
            return;
        }
        defpackage.uup uupVar = this.b;
        if (this.c && uupVar != null && ((uuuVar = this.f) == null || uuuVar.n())) {
            defpackage.uuu uuuVar2 = new defpackage.uuu(uupVar, this.a);
            this.f = uuuVar2;
            uuuVar2.f();
        }
        this.c = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        this.c = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        defpackage.uun uunVar = this.e;
        return uunVar != null ? uunVar.a(motionEvent, new defpackage.uuk(this, 1)) : super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        defpackage.uun uunVar = this.e;
        return uunVar != null ? uunVar.b(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            defpackage.xei xeiVar = this.g;
            if (xeiVar != null) {
                xeiVar.r(i);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.l(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.j(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        defpackage.uuu uuuVar = this.f;
        if (uuuVar != null) {
            uuuVar.k();
        }
    }

    @Override // defpackage.uuo
    public final android.view.View a() {
        return this;
    }
}
