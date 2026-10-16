package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
final class aepu implements Iterator, aepm {
    int a;
    int b = -1;
    int c;
    boolean d;
    aeou e;
    final /* synthetic */ aepw f;

    public aepu(aepw aepwVar) {
        this.f = aepwVar;
        this.a = aepwVar.d;
        this.c = aepwVar.g;
        this.d = aepwVar.c;
    }

    @Override // j$.util.PrimitiveIterator.OfLong
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(LongConsumer longConsumer) {
        aepw aepwVar = this.f;
        long[] jArr = aepwVar.a;
        if (this.d) {
            this.d = false;
            int i = aepwVar.d;
            this.b = i;
            longConsumer.accept(jArr[i]);
            this.c--;
        }
        while (this.c != 0) {
            int i2 = this.a - 1;
            this.a = i2;
            if (i2 < 0) {
                this.b = Integer.MIN_VALUE;
                longConsumer.accept(this.e.m((-i2) - 1));
                this.c--;
            } else {
                long j = jArr[i2];
                if (j != 0) {
                    this.b = i2;
                    longConsumer.accept(j);
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0;
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong, java.util.Iterator
    public final /* synthetic */ Long next() {
        return adqq.an(this);
    }

    @Override // defpackage.aepm, j$.util.PrimitiveIterator.OfLong
    public final long nextLong() {
        int i;
        long j;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c--;
        aepw aepwVar = this.f;
        long[] jArr = aepwVar.a;
        if (this.d) {
            this.d = false;
            int i2 = aepwVar.d;
            this.b = i2;
            return jArr[i2];
        }
        do {
            i = this.a - 1;
            this.a = i;
            if (i < 0) {
                this.b = Integer.MIN_VALUE;
                return this.e.m((-i) - 1);
            }
            j = jArr[i];
        } while (j == 0);
        this.b = i;
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        r9 = r14.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        r9 = new defpackage.aeou((byte[]) null);
        r14.e = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        r9.c(r6[r3]);
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove() {
        /*
            r14 = this;
            int r0 = r14.b
            r1 = -1
            if (r0 == r1) goto L78
            aepw r2 = r14.f
            int r3 = r2.d
            r4 = 0
            if (r0 != r3) goto L15
            r0 = 0
            r2.c = r0
            long[] r0 = r2.a
            r0[r3] = r4
            goto L28
        L15:
            int r3 = r14.a
            if (r3 < 0) goto L6a
            long[] r6 = r2.a
        L1b:
            int r3 = r0 + 1
            int r7 = r2.b
            r3 = r3 & r7
        L20:
            r7 = r6[r3]
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 != 0) goto L30
            r6[r0] = r4
        L28:
            int r0 = r2.g
            int r0 = r0 + r1
            r2.g = r0
            r14.b = r1
            return
        L30:
            int r9 = r2.b
            r10 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r10 = r10 * r7
            r12 = 32
            long r12 = r10 >>> r12
            long r10 = r10 ^ r12
            r12 = 16
            long r12 = r10 >>> r12
            long r10 = r10 ^ r12
            int r10 = (int) r10
            r10 = r10 & r9
            if (r0 > r3) goto L4b
            if (r0 >= r10) goto L4f
            if (r10 <= r3) goto L66
            goto L4f
        L4b:
            if (r0 < r10) goto L66
            if (r10 <= r3) goto L66
        L4f:
            if (r3 >= r0) goto L62
            aeou r9 = r14.e
            if (r9 != 0) goto L5d
            aeou r9 = new aeou
            r10 = 0
            r9.<init>(r10)
            r14.e = r9
        L5d:
            r10 = r6[r3]
            r9.c(r10)
        L62:
            r6[r0] = r7
            r0 = r3
            goto L1b
        L66:
            int r3 = r3 + 1
            r3 = r3 & r9
            goto L20
        L6a:
            aeou r0 = r14.e
            int r3 = -r3
            int r3 = r3 + r1
            long r3 = r0.m(r3)
            r2.l(r3)
            r14.b = r1
            return
        L78:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepu.remove():void");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return adqq.an(this);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m42m((Object) longConsumer));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqq.ao(this, consumer);
    }
}
