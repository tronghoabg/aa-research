package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class iom extends jhd {
    final /* synthetic */ jkk a;
    public final /* synthetic */ ioq b;

    public iom(ioq ioqVar, jkk jkkVar) {
        this.a = jkkVar;
        this.b = ioqVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return "native_app_splash_window_listener";
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        this.a.K(jhfVar, true);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        jkk jkkVar = this.a;
        jkkVar.M(new ae((Object) this, (Object) jhfVar, (Object) jkkVar, 20, (byte[]) null));
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        ((ype) ((ype) ioq.E.h()).ai((char) 828)).y("Key event on native app splash screen: %s", keyEvent);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        ((ype) ((ype) ioq.E.h()).ai((char) 829)).y("Motion event on native app splash screen: %s", motionEvent);
    }
}
