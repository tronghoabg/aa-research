package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aeol {
    int b;
    int c = -1;
    int d;
    boolean e;
    aeou f;
    final /* synthetic */ aeop g;

    public aeol(aeop aeopVar) {
        this.g = aeopVar;
        this.b = aeopVar.e;
        this.d = aeopVar.h;
        this.e = aeopVar.d;
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
        aeop aeopVar = this.g;
        long[] jArr = aeopVar.a;
        do {
            i = this.b - 1;
            this.b = i;
            if (i < 0) {
                this.c = Integer.MIN_VALUE;
                long jM = this.f.m((-i) - 1);
                long j = (-7046029254386353131L) * jM;
                int i3 = aeopVar.c;
                long j2 = j ^ (j >>> 32);
                int i4 = (int) (j2 ^ (j2 >>> 16));
                while (true) {
                    int i5 = i3 & i4;
                    if (jM == jArr[i5]) {
                        return i5;
                    }
                    i3 = i5 + 1;
                    i4 = aeopVar.c;
                }
            }
        } while (jArr[i] == 0);
        this.c = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        if (this.e) {
            this.e = false;
            int i = this.g.e;
            this.c = i;
            a(obj, i);
            this.d--;
        }
        aeop aeopVar = this.g;
        long[] jArr = aeopVar.a;
        while (this.d != 0) {
            int i2 = this.b - 1;
            this.b = i2;
            if (i2 < 0) {
                this.c = Integer.MIN_VALUE;
                long jM = this.f.m((-i2) - 1);
                long j = (-7046029254386353131L) * jM;
                long j2 = j ^ (j >>> 32);
                int i3 = ((int) (j2 ^ (j2 >>> 16))) & aeopVar.c;
                while (jM != jArr[i3]) {
                    i3 = (i3 + 1) & aeopVar.c;
                }
                a(obj, i3);
                this.d--;
            } else if (jArr[i2] != 0) {
                this.c = i2;
                a(obj, i2);
                this.d--;
            }
        }
    }

    public final boolean hasNext() {
        return this.d != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r9 = r14.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r9 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r9 = new defpackage.aeou((byte[]) null);
        r14.f = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9.c(r5[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r14 = this;
            int r0 = r14.c
            r1 = -1
            if (r0 == r1) goto L80
            aeop r2 = r14.g
            int r3 = r2.e
            r4 = 0
            if (r0 != r3) goto L14
            r0 = 0
            r2.d = r0
            java.lang.Object[] r0 = r2.b
            r0[r3] = r4
            goto L2d
        L14:
            int r3 = r14.b
            if (r3 < 0) goto L72
            long[] r5 = r2.a
            java.lang.Object[] r6 = r2.b
        L1c:
            int r3 = r0 + 1
            int r7 = r2.c
            r3 = r3 & r7
        L21:
            r7 = r5[r3]
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L35
            r5[r0] = r9
            r6[r0] = r4
        L2d:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            r14.c = r1
            return
        L35:
            int r9 = r2.c
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
            if (r0 > r3) goto L50
            if (r0 >= r10) goto L54
            if (r10 <= r3) goto L6e
            goto L54
        L50:
            if (r0 < r10) goto L6e
            if (r10 <= r3) goto L6e
        L54:
            if (r3 >= r0) goto L66
            aeou r9 = r14.f
            if (r9 != 0) goto L61
            aeou r9 = new aeou
            r9.<init>(r4)
            r14.f = r9
        L61:
            r10 = r5[r3]
            r9.c(r10)
        L66:
            r5[r0] = r7
            r7 = r6[r3]
            r6[r0] = r7
            r0 = r3
            goto L1c
        L6e:
            int r3 = r3 + 1
            r3 = r3 & r9
            goto L21
        L72:
            aeou r0 = r14.f
            int r3 = -r3
            int r3 = r3 + r1
            long r3 = r0.m(r3)
            r2.b(r3)
            r14.c = r1
            return
        L80:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeol.remove():void");
    }
}
