package defpackage;

import j$.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public final class aekc implements Iterator, aejr {
    int a;
    int b = -1;
    int c;
    boolean d;
    aeiy e;
    final /* synthetic */ aeke f;

    public aekc(aeke aekeVar) {
        this.f = aekeVar;
        this.a = aekeVar.d;
        this.c = aekeVar.g;
        this.d = aekeVar.c;
    }

    @Override // j$.util.PrimitiveIterator.OfInt
    /* renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final void forEachRemaining2(IntConsumer intConsumer) {
        aeke aekeVar = this.f;
        int[] iArr = aekeVar.a;
        if (this.d) {
            this.d = false;
            int i = aekeVar.d;
            this.b = i;
            intConsumer.accept(iArr[i]);
            this.c--;
        }
        while (this.c != 0) {
            int i2 = this.a - 1;
            this.a = i2;
            if (i2 < 0) {
                this.b = Integer.MIN_VALUE;
                intConsumer.accept(this.e.m((-i2) - 1));
                this.c--;
            } else {
                int i3 = iArr[i2];
                if (i3 != 0) {
                    this.b = i2;
                    intConsumer.accept(i3);
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0;
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return aeec.Z(this);
    }

    @Override // defpackage.aejr, j$.util.PrimitiveIterator.OfInt
    public final int nextInt() {
        int i;
        int i2;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.c--;
        aeke aekeVar = this.f;
        int[] iArr = aekeVar.a;
        if (this.d) {
            this.d = false;
            int i3 = aekeVar.d;
            this.b = i3;
            return iArr[i3];
        }
        do {
            i = this.a - 1;
            this.a = i;
            if (i < 0) {
                this.b = Integer.MIN_VALUE;
                return this.e.m((-i) - 1);
            }
            i2 = iArr[i];
        } while (i2 == 0);
        this.b = i;
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r7 = r10.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        r7 = new defpackage.aeiy(2);
        r10.e = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r7.c(r5[r3]);
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
            if (r0 == r1) goto L6a
            aeke r2 = r10.f
            int r3 = r2.d
            r4 = 0
            if (r0 != r3) goto L13
            r2.c = r4
            int[] r0 = r2.a
            r0[r3] = r4
            goto L24
        L13:
            int r3 = r10.a
            if (r3 < 0) goto L5c
            int[] r5 = r2.a
        L19:
            int r3 = r0 + 1
            int r6 = r2.b
            r3 = r3 & r6
        L1e:
            r6 = r5[r3]
            if (r6 != 0) goto L2c
            r5[r0] = r4
        L24:
            int r0 = r2.g
            int r0 = r0 + r1
            r2.g = r0
            r10.b = r1
            return
        L2c:
            int r7 = r2.b
            r8 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r8 = r8 * r6
            int r9 = r8 >>> 16
            r8 = r8 ^ r9
            r8 = r8 & r7
            if (r0 > r3) goto L3d
            if (r0 >= r8) goto L41
            if (r8 <= r3) goto L58
            goto L41
        L3d:
            if (r0 < r8) goto L58
            if (r8 <= r3) goto L58
        L41:
            if (r3 >= r0) goto L54
            aeiy r7 = r10.e
            if (r7 != 0) goto L4f
            aeiy r7 = new aeiy
            r8 = 2
            r7.<init>(r8)
            r10.e = r7
        L4f:
            r8 = r5[r3]
            r7.c(r8)
        L54:
            r5[r0] = r6
            r0 = r3
            goto L19
        L58:
            int r3 = r3 + 1
            r3 = r3 & r7
            goto L1e
        L5c:
            aeiy r0 = r10.e
            int r3 = -r3
            int r3 = r3 + r1
            int r0 = r0.m(r3)
            r2.l(r0)
            r10.b = r1
            return
        L6a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekc.remove():void");
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return aeec.Z(this);
    }

    @Override // j$.util.PrimitiveIterator
    public final /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining2(a$$ExternalSyntheticApiModelOutline3.m40m((Object) intConsumer));
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.aa(this, consumer);
    }
}
