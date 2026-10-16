package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pjf implements java.lang.AutoCloseable {
    public final byte[] a;
    public final int[] b = new int[1];
    final /* synthetic */ defpackage.pjg c;

    public pjf(defpackage.pjg pjgVar, int i) {
        this.c = pjgVar;
        this.a = i == 0 ? null : new byte[i];
    }

    public final int a() {
        return this.b[0];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        defpackage.pjg pjgVar = this.c;
        int i = pjgVar.b;
        if (i == 0) {
            java.util.ArrayDeque arrayDeque = pjgVar.a;
            synchronized (arrayDeque) {
                arrayDeque.add(this);
            }
            return;
        }
        byte[] bArr = this.a;
        if (bArr != null && bArr.length != i) {
            pjgVar.f.incrementAndGet();
            return;
        }
        boolean z = a() <= i;
        if (!z) {
            pjgVar.e.incrementAndGet();
        }
        this.b[0] = 0;
        java.util.ArrayDeque arrayDeque2 = pjgVar.a;
        synchronized (arrayDeque2) {
            if (arrayDeque2.size() < 3) {
                if (z) {
                    pjgVar.c.incrementAndGet();
                }
                arrayDeque2.add(this);
            } else {
                pjgVar.d.incrementAndGet();
            }
        }
    }
}
