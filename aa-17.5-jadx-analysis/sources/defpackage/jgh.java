package defpackage;

import j$.time.Duration;
import java.util.Random;

/* loaded from: classes.dex */
final class jgh implements jgf {
    final /* synthetic */ jgi a;
    private final yzy b;
    private final Random c = new Random();
    private final float d;

    public jgh(jgi jgiVar, yzy yzyVar, float f) {
        this.a = jgiVar;
        this.b = yzyVar;
        this.d = f;
    }

    @Override // defpackage.jgf
    public final void a(Duration duration) {
        if (this.c.nextFloat() * 100.0d < this.d) {
            jgi jgiVar = this.a;
            jgiVar.c.f(yzz.PROJECTION_WINDOW_MANAGER, this.b, duration.toMillis());
        }
    }
}
