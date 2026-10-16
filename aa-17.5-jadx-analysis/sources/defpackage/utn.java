package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class utn extends SurfaceView implements SurfaceHolder.Callback, uts {
    private final vky a;
    private utt b;
    private boolean c;
    private boolean d;
    private utr e;
    private uty f;
    private final ykd g;
    private ykd h;

    public utn(Context context, ykd ykdVar, vky vkyVar) {
        super(context);
        this.g = ykdVar;
        this.a = vkyVar;
    }

    @Override // defpackage.uts
    public final void b(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GLSurfaceView:"));
        boolean z = this.c;
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("detached: ");
        sb.append(z);
        printWriter.println(sb.toString());
        printWriter.println(strConcat + "destroyed: " + this.d);
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.gt(strConcat, printWriter);
        }
    }

    @Override // defpackage.uts
    public final void c() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.d();
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        ykd ykdVar = this.h;
        return ykdVar == null ? super.canScrollHorizontally(i) : ykdVar.u();
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        ykd ykdVar = this.h;
        return ykdVar == null ? super.canScrollVertically(i) : ykdVar.u();
    }

    @Override // defpackage.uts
    public final void d() {
        this.d = true;
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.e();
            this.f = null;
        }
    }

    @Override // defpackage.uts
    public final void e() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.f();
        }
    }

    @Override // defpackage.uts
    public final void f() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.g();
        }
    }

    protected final void finalize() throws Throwable {
        try {
            uty utyVar = this.f;
            if (utyVar != null) {
                utyVar.e();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.uts
    public final void g(utr utrVar) {
        this.e = utrVar;
    }

    @Override // defpackage.uts
    public final void h(utt uttVar) {
        this.f = new uty(uttVar, this.a);
        this.b = uttVar;
        getHolder().addCallback(this);
    }

    @Override // defpackage.uts
    public final void i(boolean z) {
        if (z) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            setAlpha(1.0f);
        }
    }

    @Override // defpackage.uts
    public final void j() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.h();
        }
    }

    @Override // defpackage.uts
    public final void k() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.i();
        }
    }

    @Override // defpackage.uts
    public final boolean m() {
        uty utyVar = this.f;
        if (utyVar != null) {
            return utyVar.o();
        }
        return false;
    }

    @Override // defpackage.uts
    public final void n() {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.q();
        }
    }

    @Override // defpackage.uts
    public final void o(ykd ykdVar) {
        this.h = ykdVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        uty utyVar;
        super.onAttachedToWindow();
        if (this.d) {
            return;
        }
        utt uttVar = this.b;
        if (this.c && uttVar != null && ((utyVar = this.f) == null || utyVar.n())) {
            uty utyVar2 = new uty(uttVar, this.a);
            this.f = utyVar2;
            utyVar2.f();
        }
        this.c = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        this.c = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        utr utrVar = this.e;
        return utrVar != null ? utrVar.a(motionEvent, new uto(this, 1)) : super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        utr utrVar = this.e;
        return utrVar != null ? utrVar.b(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            ykd ykdVar = this.g;
            if (ykdVar != null) {
                ykdVar.s(i);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.l(i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.j(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.k();
        }
    }

    @Override // defpackage.uts
    public final View a() {
        return this;
    }
}
