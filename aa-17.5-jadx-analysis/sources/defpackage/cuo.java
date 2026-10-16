package defpackage;

import androidx.car.app.model.Alert;

/* loaded from: classes.dex */
public abstract class cuo implements ctt {
    public int a;
    public int b;
    public long c = 0;
    public long d = dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, Alert.DURATION_SHOW_INDEFINITELY);
    public long e = 0;

    private final void eN() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = afpt.g((int) j, dle.d(j2), dle.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = afpt.g((int) j3, dle.c(j4), dle.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j5 & 4294967295L))) / 2));
    }

    protected final void A(long j) {
        if (this.d == j) {
            return;
        }
        this.d = j;
        eN();
    }

    @Override // defpackage.ctt
    public int eC() {
        return (int) (this.c & 4294967295L);
    }

    public abstract void ev(long j, float f, afec afecVar);

    public /* synthetic */ Object g() {
        return null;
    }

    public int x() {
        return (int) (this.c >> 32);
    }

    public void y(long j, float f, cmi cmiVar) {
        ev(j, f, null);
    }

    protected final void z(long j) {
        if (this.c == j) {
            return;
        }
        this.c = j;
        eN();
    }
}
