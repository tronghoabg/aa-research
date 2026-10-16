package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class xtg extends zeu {
    private xti a;
    private final int b;

    public xtg(xti xtiVar, int i) {
        this.a = xtiVar;
        this.b = i;
    }

    @Override // defpackage.zeu
    protected final void b() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        AtomicReference atomicReference;
        xth xthVar;
        xti xtiVar = this.a;
        this.a = null;
        if (xtiVar == null) {
            return;
        }
        do {
            atomicLong = xtiVar.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError(a.bN(j, "Refcount is: "));
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (i2 << 32) | ((i - 1) & 4294967295L)));
        if (z) {
            do {
                atomicReference = xtiVar.c;
                xthVar = (xth) atomicReference.get();
                if (xthVar == null) {
                    return;
                }
                if (xthVar.a > this.b) {
                    return;
                } else {
                    xthVar.cancel(true);
                }
            } while (!a.q(atomicReference, xthVar));
        }
    }

    @Override // defpackage.zeu
    protected final String fO() {
        zfj zfjVar;
        xti xtiVar = this.a;
        if (xtiVar == null || (zfjVar = xtiVar.a.a) == null) {
            return null;
        }
        String strBW = a.bW(zfjVar, "callable=[", "]");
        xth xthVar = (xth) this.a.c.get();
        if (xthVar == null) {
            return strBW;
        }
        return strBW + ", trial=[" + xthVar.toString() + "]";
    }
}
