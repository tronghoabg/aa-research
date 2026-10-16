package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class xum extends defpackage.zga {
    private defpackage.xuo a;
    private final int b;

    public xum(defpackage.xuo xuoVar, int i) {
        this.a = xuoVar;
        this.b = i;
    }

    @Override // defpackage.zga
    protected final void b() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.xun xunVar;
        defpackage.xuo xuoVar = this.a;
        this.a = null;
        if (xuoVar == null) {
            return;
        }
        do {
            atomicLong = xuoVar.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                throw new java.lang.AssertionError(defpackage.a.bM(j, "Refcount is: "));
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (((long) (i - 1)) & 4294967295L)));
        if (z) {
            do {
                atomicReference = xuoVar.c;
                xunVar = (defpackage.xun) atomicReference.get();
                if (xunVar == null) {
                    return;
                }
                if (xunVar.a > this.b) {
                    return;
                } else {
                    xunVar.cancel(true);
                }
            } while (!defpackage.a.p(atomicReference, xunVar));
        }
    }

    @Override // defpackage.zga
    protected final java.lang.String eW() {
        defpackage.zgm zgmVar;
        defpackage.xuo xuoVar = this.a;
        if (xuoVar == null || (zgmVar = xuoVar.a.a) == null) {
            return null;
        }
        java.lang.String strBV = defpackage.a.bV(zgmVar, "callable=[", "]");
        defpackage.xun xunVar = (defpackage.xun) this.a.c.get();
        if (xunVar == null) {
            return strBV;
        }
        return strBV + ", trial=[" + xunVar.toString() + "]";
    }
}
