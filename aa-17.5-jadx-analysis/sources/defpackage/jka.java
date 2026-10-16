package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;

/* loaded from: classes.dex */
final class jka extends jhd {
    final /* synthetic */ jkb a;

    public jka(jkb jkbVar) {
        this.a = jkbVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return this.a.d;
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        jkb jkbVar = this.a;
        jkbVar.b.K(jhfVar, false);
        jkbVar.b();
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        jkb jkbVar = this.a;
        jkbVar.b();
        if (jkbVar.e) {
            jkbVar.b.q(jhfVar);
            jkbVar.e = false;
        }
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        jkb.a.l().u("Input events to the loading screen do nothing");
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        jkb.a.l().u("Input events on the loading screen do nothing");
    }
}
