package defpackage;

import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* loaded from: classes.dex */
final class jkp extends jhd {
    final /* synthetic */ jkk a;
    final /* synthetic */ jkq b;

    public jkp(jkq jkqVar, jkk jkkVar) {
        this.a = jkkVar;
        this.b = jkqVar;
    }

    @Override // defpackage.jhe
    public final String a() {
        return "WatermarkHandler";
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void b(jhf jhfVar) {
        jkk jkkVar = this.a;
        jkkVar.K(jhfVar, false);
        jkkVar.M(new imp(jhfVar, this.b.c, jkkVar, 6, (short[]) null));
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void e(jhf jhfVar, int i, int i2) {
        Size size = new Size(i, i2);
        jkq jkqVar = this.b;
        jkqVar.c = size;
        Size size2 = jkqVar.c;
        jkk jkkVar = this.a;
        jkkVar.M(new imp(jhfVar, size2, jkkVar, 6, (short[]) null));
        jkkVar.q(jhfVar);
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void f(jhf jhfVar, KeyEvent keyEvent) {
        throw new IllegalStateException("Key event in watermark window");
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void g(jhf jhfVar, MotionEvent motionEvent) {
        throw new IllegalStateException("Motion event in watermark window");
    }

    @Override // defpackage.jhd, defpackage.jhe
    public final void i(jhf jhfVar, InputFocusChangedEvent inputFocusChangedEvent) {
        throw new IllegalStateException("Watermark window received focus");
    }
}
