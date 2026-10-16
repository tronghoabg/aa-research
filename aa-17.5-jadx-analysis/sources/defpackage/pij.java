package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class pij implements AutoCloseable {
    public final byte[] a;
    public final int[] b = new int[1];
    final /* synthetic */ pik c;

    public pij(pik pikVar, int i) {
        this.c = pikVar;
        this.a = i == 0 ? null : new byte[i];
    }

    public final int a() {
        return this.b[0];
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        pik pikVar = this.c;
        int i = pikVar.b;
        if (i == 0) {
            ArrayDeque arrayDeque = pikVar.a;
            synchronized (arrayDeque) {
                arrayDeque.add(this);
            }
            return;
        }
        byte[] bArr = this.a;
        if (bArr != null && bArr.length != i) {
            pikVar.f.incrementAndGet();
            return;
        }
        boolean z = a() <= i;
        if (!z) {
            pikVar.e.incrementAndGet();
        }
        this.b[0] = 0;
        ArrayDeque arrayDeque2 = pikVar.a;
        synchronized (arrayDeque2) {
            if (arrayDeque2.size() < 3) {
                if (z) {
                    pikVar.c.incrementAndGet();
                }
                arrayDeque2.add(this);
            } else {
                pikVar.d.incrementAndGet();
            }
        }
    }
}
