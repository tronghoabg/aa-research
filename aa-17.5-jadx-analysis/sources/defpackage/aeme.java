package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class aeme {
    int b;
    int c = -1;
    int d;
    boolean e;
    aeou f;
    final /* synthetic */ aemi g;

    public aeme(aemi aemiVar) {
        this.g = aemiVar;
        this.b = aemiVar.e;
        this.d = aemiVar.h;
        this.e = aemiVar.d;
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
        aemi aemiVar = this.g;
        long[] jArr = aemiVar.a;
        do {
            i = this.b - 1;
            this.b = i;
            if (i < 0) {
                this.c = Integer.MIN_VALUE;
                long jM = this.f.m((-i) - 1);
                long j = (-7046029254386353131L) * jM;
                int i3 = aemiVar.c;
                long j2 = j ^ (j >>> 32);
                int i4 = (int) (j2 ^ (j2 >>> 16));
                while (true) {
                    int i5 = i3 & i4;
                    if (jM == jArr[i5]) {
                        return i5;
                    }
                    i3 = i5 + 1;
                    i4 = aemiVar.c;
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
        aemi aemiVar = this.g;
        long[] jArr = aemiVar.a;
        while (this.d != 0) {
            int i2 = this.b - 1;
            this.b = i2;
            if (i2 < 0) {
                this.c = Integer.MIN_VALUE;
                long jM = this.f.m((-i2) - 1);
                long j = (-7046029254386353131L) * jM;
                long j2 = j ^ (j >>> 32);
                int i3 = ((int) (j2 ^ (j2 >>> 16))) & aemiVar.c;
                while (jM != jArr[i3]) {
                    i3 = (i3 + 1) & aemiVar.c;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r8 = r13.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r8 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        r8 = new defpackage.aeou((byte[]) null);
        r13.f = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r8.c(r4[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r13 = this;
            int r0 = r13.c
            r1 = -1
            if (r0 == r1) goto L7a
            aemi r2 = r13.g
            int r3 = r2.e
            if (r0 != r3) goto Lf
            r0 = 0
            r2.d = r0
            goto L26
        Lf:
            int r3 = r13.b
            if (r3 < 0) goto L6c
            long[] r4 = r2.a
            int[] r5 = r2.b
        L17:
            int r3 = r0 + 1
            int r6 = r2.c
            r3 = r3 & r6
        L1c:
            r6 = r4[r3]
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L2e
            r4[r0] = r8
        L26:
            int r0 = r2.h
            int r0 = r0 + r1
            r2.h = r0
            r13.c = r1
            return
        L2e:
            int r8 = r2.c
            r9 = -7046029254386353131(0x9e3779b97f4a7c15, double:-4.0765893351549374E-163)
            long r9 = r9 * r6
            r11 = 32
            long r11 = r9 >>> r11
            long r9 = r9 ^ r11
            r11 = 16
            long r11 = r9 >>> r11
            long r9 = r9 ^ r11
            int r9 = (int) r9
            r9 = r9 & r8
            if (r0 > r3) goto L49
            if (r0 >= r9) goto L4d
            if (r9 <= r3) goto L68
            goto L4d
        L49:
            if (r0 < r9) goto L68
            if (r9 <= r3) goto L68
        L4d:
            if (r3 >= r0) goto L60
            aeou r8 = r13.f
            if (r8 != 0) goto L5b
            aeou r8 = new aeou
            r9 = 0
            r8.<init>(r9)
            r13.f = r8
        L5b:
            r9 = r4[r3]
            r8.c(r9)
        L60:
            r4[r0] = r6
            r6 = r5[r3]
            r5[r0] = r6
            r0 = r3
            goto L17
        L68:
            int r3 = r3 + 1
            r3 = r3 & r8
            goto L1c
        L6c:
            aeou r0 = r13.f
            int r3 = -r3
            int r3 = r3 + r1
            long r3 = r0.m(r3)
            r2.b(r3)
            r13.c = r1
            return
        L7a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeme.remove():void");
    }
}
