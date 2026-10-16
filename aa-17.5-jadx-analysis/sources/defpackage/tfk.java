package defpackage;

import j$.time.Duration;

/* loaded from: classes.dex */
public final class tfk {
    public static final tfk a;
    public final spu b;

    static {
        yph.c("GH.LatencyLogger");
        a = new tfk(new spu());
    }

    public tfk(spu spuVar) {
        this.b = spuVar;
    }

    public static int c(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 4 : 3;
        }
        return 2;
    }

    public final void a(tfj tfjVar, Duration duration, Duration duration2) {
        vla.a().c(tfjVar.cK, duration.toMillis(), duration2.toMillis());
        duration.toMillis();
        duration2.toMillis();
    }

    public final void b(tfj tfjVar) {
        vla.a().e(tfjVar.cK);
    }

    public final void d(tfj tfjVar, int i) {
        vla.a().a.k(tfjVar.cK, null, c(i));
    }
}
