package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes3.dex */
public final class ajhg {
    public static final ajhg a;
    public static final ajhg b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public String o;

    static {
        ajhf ajhfVar = new ajhf();
        ajhfVar.a();
        a = ahdw.i(ajhfVar);
        ajhf ajhfVar2 = new ajhf();
        ajhfVar2.b();
        long j = aisq.a;
        aiss aissVar = aiss.d;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        long jF = aisq.f(afzc.c(Alert.DURATION_SHOW_INDEFINITELY, aissVar));
        if (jF < 0) {
            throw new IllegalArgumentException(a.bN(jF, "maxStale < 0: "));
        }
        if (jF <= 2147483647L) {
            i = (int) jF;
        }
        ajhfVar2.c = i;
        b = ahdw.i(ajhfVar2);
    }

    public ajhg(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i3;
        this.k = i4;
        this.l = z6;
        this.m = z7;
        this.n = z8;
        this.o = str;
    }

    public final String toString() {
        return ahdw.h(this);
    }
}
