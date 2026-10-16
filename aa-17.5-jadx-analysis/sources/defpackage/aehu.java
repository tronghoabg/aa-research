package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aehu {
    int b;
    int c = -1;
    int d;
    boolean e;
    aeiy f;
    final /* synthetic */ aehy g;

    public aehu(aehy aehyVar) {
        this.g = aehyVar;
        this.b = aehyVar.e;
        this.d = aehyVar.h;
        this.e = aehyVar.d;
    }

    public abstract void a(Object obj, int i);

    public final int b() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.d--;
        if (this.e) {
            this.e = false;
            int i2 = this.g.e;
            this.c = i2;
            return i2;
        }
        aehy aehyVar = this.g;
        int[] iArr = aehyVar.a;
        do {
            i = this.b - 1;
            this.b = i;
            if (i < 0) {
                this.c = Integer.MIN_VALUE;
                int iM = this.f.m((-i) - 1);
                int i3 = (-1640531527) * iM;
                int i4 = aehyVar.c;
                int i5 = i3 ^ (i3 >>> 16);
                while (true) {
                    int i6 = i5 & i4;
                    if (iM == iArr[i6]) {
                        return i6;
                    }
                    i5 = i6 + 1;
                    i4 = aehyVar.c;
                }
            }
        } while (iArr[i] == 0);
        this.c = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        if (this.e) {
            this.e = false;
            int i2 = this.g.e;
            this.c = i2;
            a(obj, i2);
            this.d--;
        }
        aehy aehyVar = this.g;
        int[] iArr = aehyVar.a;
        while (this.d != 0) {
            int i3 = this.b - 1;
            this.b = i3;
            if (i3 < 0) {
                this.c = Integer.MIN_VALUE;
                int iM = this.f.m((-i3) - 1);
                int i4 = (-1640531527) * iM;
                int i5 = aehyVar.c;
                int i6 = i4 ^ (i4 >>> 16);
                while (true) {
                    i = i6 & i5;
                    if (iM == iArr[i]) {
                        break;
                    }
                    i6 = i + 1;
                    i5 = aehyVar.c;
                }
                a(obj, i);
                this.d--;
            } else if (iArr[i3] != 0) {
                this.c = i3;
                a(obj, i3);
                this.d--;
            }
        }
    }

    public final boolean hasNext() {
        return this.d != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r9 = r12.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r9 = new defpackage.aeiy(2);
        r12.f = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r9.c(r6[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r12 = this;
            int r0 = r12.c
            r1 = -1
            if (r0 == r1) goto L73
            aehy r2 = r12.g
            int r3 = r2.e
            r4 = 0
            r5 = 0
            if (r0 != r3) goto L14
            r2.d = r5
            java.lang.Object[] r0 = r2.b
            r0[r3] = r4
            goto L29
        L14:
            int r3 = r12.b
            if (r3 < 0) goto L65
            int[] r6 = r2.a
            java.lang.Object[] r7 = r2.b
        L1c:
            int r3 = r0 + 1
            int r8 = r2.c
            r3 = r3 & r8
        L21:
            r8 = r6[r3]
            if (r8 != 0) goto L31
            r6[r0] = r5
            r7[r0] = r4
        L29:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            r12.c = r1
            return
        L31:
            int r9 = r2.c
            r10 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r10 = r10 * r8
            int r11 = r10 >>> 16
            r10 = r10 ^ r11
            r10 = r10 & r9
            if (r0 > r3) goto L42
            if (r0 >= r10) goto L46
            if (r10 <= r3) goto L61
            goto L46
        L42:
            if (r0 < r10) goto L61
            if (r10 <= r3) goto L61
        L46:
            if (r3 >= r0) goto L59
            aeiy r9 = r12.f
            if (r9 != 0) goto L54
            aeiy r9 = new aeiy
            r10 = 2
            r9.<init>(r10)
            r12.f = r9
        L54:
            r10 = r6[r3]
            r9.c(r10)
        L59:
            r6[r0] = r8
            r8 = r7[r3]
            r7[r0] = r8
            r0 = r3
            goto L1c
        L61:
            int r3 = r3 + 1
            r3 = r3 & r9
            goto L21
        L65:
            aeiy r0 = r12.f
            int r3 = -r3
            int r3 = r3 + r1
            int r0 = r0.m(r3)
            r2.b(r0)
            r12.c = r1
            return
        L73:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehu.remove():void");
    }
}
