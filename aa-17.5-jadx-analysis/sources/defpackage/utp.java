package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.PrintWriter;

/* loaded from: classes3.dex */
public final class utp extends TextureView implements TextureView.SurfaceTextureListener, uts {
    private final vky a;
    private utt b;
    private boolean c;
    private boolean d;
    private utr e;
    private uty f;
    private final ykd g;
    private ykd h;

    public utp(Context context, ykd ykdVar, vky vkyVar) {
        super(context);
        this.g = ykdVar;
        this.a = vkyVar;
    }

    @Override // defpackage.uts
    public final void b(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("GLTextureView:"));
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
        if (this.f != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
        this.b = uttVar;
        this.f = new uty(uttVar, this.a);
        setSurfaceTextureListener(this);
    }

    @Override // defpackage.uts
    public final void i(boolean z) {
        if (z) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
            setOpaque(false);
        } else {
            setAlpha(1.0f);
            setOpaque(true);
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

    @Override // android.view.TextureView, android.view.View
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

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        this.c = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        utr utrVar = this.e;
        return utrVar != null ? utrVar.a(motionEvent, new uto(this, 0)) : super.onHoverEvent(motionEvent);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.j(surfaceTexture);
            this.f.l(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uty utyVar = this.f;
        if (utyVar == null) {
            return true;
        }
        utyVar.k();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        uty utyVar = this.f;
        if (utyVar != null) {
            utyVar.l(i, i2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        utr utrVar = this.e;
        return utrVar != null ? utrVar.b(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (getVisibility() != i) {
            super.setVisibility(i);
            ykd ykdVar = this.g;
            if (ykdVar != null) {
                ykdVar.s(i);
            }
        }
    }

    @Override // defpackage.uts
    public final View a() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
