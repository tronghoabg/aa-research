package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes2.dex */
final class jkd extends jhd {
    final /* synthetic */ jkk a;

    public jkd(jkk jkkVar) {
        this.a = jkkVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return "DisplayInfoHandler";
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        this.a.K(jhfVar, true);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        jkk jkkVar = this.a;
        jkkVar.M(new jlj(jkkVar, jhfVar, i, i2, 1));
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        throw new IllegalStateException("Key event in display info window");
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        throw new IllegalStateException("Motion event in display info window");
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void i(jhf jhfVar, InputFocusChangedEvent inputFocusChangedEvent) {
        throw new IllegalStateException("Display Info window received focus");
    }
}
