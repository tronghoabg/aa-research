package defpackage;

import android.widget.Magnifier;

/* loaded from: classes.dex */
public class alb {
    public final Magnifier a;

    public alb(Magnifier magnifier) {
        this.a = magnifier;
    }

    public final long a() {
        Magnifier magnifier = this.a;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
    }

    public final void b() {
        this.a.dismiss();
    }

    public void c(long j, float f) {
        this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
    }
}
