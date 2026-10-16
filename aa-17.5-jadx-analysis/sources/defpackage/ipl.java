package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes2.dex */
final class ipl extends jhd {
    final /* synthetic */ ipn a;

    public ipl(ipn ipnVar) {
        this.a = ipnVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return this.a.i;
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        ipn.a.l().R("onWindowAttached dimensions:%d,%d for window:%s", Integer.valueOf(jhfVar.k()), Integer.valueOf(jhfVar.d()), jhfVar);
        ilb.d();
        this.a.d.K(jhfVar, true);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void c(jhf jhfVar, Rect rect) {
        rect.getClass();
        ipn.a.l().M("onWindowInsetsChanged insets:%s for window:%s", rect, jhfVar.E());
        ilb.d();
        if (!acpf.m() || Build.VERSION.SDK_INT < 37) {
            return;
        }
        this.a.r(rect);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void d(jhf jhfVar) {
        ipn.a.l().y("onWindowRemoved for window:%s", jhfVar.E());
        jhfVar.aT();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        yph yphVar = ipn.a;
        yphVar.l().R("onWindowSurfaceAvailable dimensions:%d,%d for window:%s", Integer.valueOf(i), Integer.valueOf(i2), jhfVar);
        ilb.d();
        DrawingSpec drawingSpecAL = jhfVar.aL();
        if (drawingSpecAL != null) {
            this.a.e(drawingSpecAL);
        } else {
            ((ype) yphVar.g()).y("onWindowSurfaceAvailable with a null drawing spec for %s", this);
            this.a.f();
        }
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        keyEvent.getClass();
        yph yphVar = ipn.a;
        yphVar.l().M("onKeyEvent event:%s for window:%s", keyEvent, jhfVar.E());
        ilb.d();
        if (keyEvent.getKeyCode() == 4 && (keyEvent.getAction() == 1 || keyEvent.getAction() == 0)) {
            this.a.h(keyEvent);
        } else {
            yphVar.l().y("onKeyEvent unsupported event: %s", keyEvent);
        }
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        motionEvent.getClass();
        ((ype) ipn.a.e()).M("onMotionEvent event:%s for window:%s", motionEvent, jhfVar.E());
        ilb.d();
        if (motionEvent.getSource() != 4098) {
            return;
        }
        this.a.d(motionEvent);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void h(int i) {
        ((ype) ipn.a.e()).D("onFrameRateChange(%d) for display:%s", i, a());
        ilb.d();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void i(jhf jhfVar, InputFocusChangedEvent inputFocusChangedEvent) {
        inputFocusChangedEvent.getClass();
        ipn.a.l().M("onInputFocusChange event:%s for window:%s", inputFocusChangedEvent, jhfVar.E());
        ilb.d();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void j(jhf jhfVar) {
        ipn.a.l().y("onWindowAttachFailed for window:%s", jhfVar.E());
        ilb.d();
        ajmd ajmdVar = this.a.j;
        if (ajmdVar != null) {
            ajmdVar.I();
        }
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void k(jhf jhfVar) {
        ipn.a.l().M("onWindowAttributesChanged windowAttributes:%s for window:%s", jhfVar.A(), jhfVar.E());
        ilb.d();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void l(jhf jhfVar) {
        ipn.a.l().y("onWindowDetached for window:%s", jhfVar.E());
        ilb.d();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void m(jhf jhfVar) {
        ipn.a.l().y("onWindowSurfaceInitFailed for window:%s", jhfVar.E());
        ilb.d();
        this.a.f();
    }
}
