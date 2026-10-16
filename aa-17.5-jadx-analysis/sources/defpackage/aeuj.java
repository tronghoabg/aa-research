package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class aeuj implements Iterator, aety {
    int a;
    int b = -1;
    int c;
    boolean d;
    aetq e;
    final /* synthetic */ aeul f;

    public aeuj(aeul aeulVar) {
        this.f = aeulVar;
        this.a = aeulVar.d;
        this.c = aeulVar.g;
        this.d = aeulVar.c;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        aeul aeulVar = this.f;
        Object[] objArr = aeulVar.a;
        if (this.d) {
            this.d = false;
            int i = aeulVar.d;
            this.b = i;
            consumer.accept(objArr[i]);
            this.c--;
        }
        while (this.c != 0) {
            int i2 = this.a - 1;
            this.a = i2;
            if (i2 < 0) {
                this.b = Integer.MIN_VALUE;
                consumer.accept(this.e.get((-i2) - 1));
                this.c--;
            } else {
                Object obj = objArr[i2];
                if (obj != null) {
                    this.b = i2;
                    consumer.accept(obj);
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i;
        Object obj;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c--;
        aeul aeulVar = this.f;
        Object[] objArr = aeulVar.a;
        if (this.d) {
            this.d = false;
            int i2 = aeulVar.d;
            this.b = i2;
            return objArr[i2];
        }
        do {
            i = this.a - 1;
            this.a = i;
            if (i < 0) {
                this.b = Integer.MIN_VALUE;
                return this.e.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.b = i;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r7 = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r7 = new defpackage.aetq((byte[]) null);
        r10.e = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r7.add(r5[r3]);
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() {
        /*
            r10 = this;
            int r0 = r10.b
            r1 = -1
            if (r0 == r1) goto L6e
            aeul r2 = r10.f
            int r3 = r2.d
            r4 = 0
            if (r0 != r3) goto L14
            r0 = 0
            r2.c = r0
            java.lang.Object[] r0 = r2.a
            r0[r3] = r4
            goto L25
        L14:
            int r3 = r10.a
            if (r3 < 0) goto L60
            java.lang.Object[] r5 = r2.a
        L1a:
            int r3 = r0 + 1
            int r6 = r2.b
            r3 = r3 & r6
        L1f:
            r6 = r5[r3]
            if (r6 != 0) goto L2d
            r5[r0] = r4
        L25:
            int r0 = r2.g
            int r0 = r0 + r1
            r2.g = r0
            r10.b = r1
            return
        L2d:
            int r7 = r6.hashCode()
            r8 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r7 = r7 * r8
            int r8 = r2.b
            int r9 = r7 >>> 16
            r7 = r7 ^ r9
            r7 = r7 & r8
            if (r0 > r3) goto L42
            if (r0 >= r7) goto L46
            if (r7 <= r3) goto L5c
            goto L46
        L42:
            if (r0 < r7) goto L5c
            if (r7 <= r3) goto L5c
        L46:
            if (r3 >= r0) goto L58
            aetq r7 = r10.e
            if (r7 != 0) goto L53
            aetq r7 = new aetq
            r7.<init>(r4)
            r10.e = r7
        L53:
            r8 = r5[r3]
            r7.add(r8)
        L58:
            r5[r0] = r6
            r0 = r3
            goto L1a
        L5c:
            int r3 = r3 + 1
            r3 = r3 & r8
            goto L1f
        L60:
            aetq r0 = r10.e
            int r3 = -r3
            int r3 = r3 + r1
            java.lang.Object r0 = r0.set(r3, r4)
            r2.remove(r0)
            r10.b = r1
            return
        L6e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeuj.remove():void");
    }
}
