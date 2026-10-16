package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adts extends defpackage.adsj {
    private static final defpackage.adtq b = new defpackage.adto(1);
    private static final defpackage.adtq c = new defpackage.adto(0);
    private static final defpackage.adtq d = new defpackage.adto(2);
    private static final defpackage.adtr e = new defpackage.adtp();
    public int a;
    private final java.util.Deque f;
    private java.util.Deque g;
    private boolean h;
    private int i;

    public adts() {
        this.i = 0;
        this.f = new java.util.ArrayDeque();
    }

    private final int l(defpackage.adtr adtrVar, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        a(i);
        java.util.Deque deque = this.f;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0 && !deque.isEmpty()) {
            defpackage.adyk adykVar = (defpackage.adyk) deque.peek();
            int iMin = java.lang.Math.min(i, adykVar.f());
            i2 = adtrVar.a(adykVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new java.lang.AssertionError("Failed executing read operation");
    }

    private final int m(defpackage.adtq adtqVar, int i, java.lang.Object obj, int i2) {
        try {
            return l(adtqVar, i, obj, i2);
        } catch (java.io.IOException e2) {
            throw new java.lang.AssertionError(e2);
        }
    }

    private final void n() {
        java.util.Deque deque = this.f;
        if (this.i > deque.size()) {
            this.i = deque.size();
        }
    }

    private final void o() {
        if (this.h) {
            java.util.Deque deque = this.g;
            java.util.Deque deque2 = this.f;
            deque.add((defpackage.adyk) deque2.remove());
            defpackage.adyk adykVar = (defpackage.adyk) deque2.peek();
            if (adykVar != null) {
                adykVar.b();
            }
        } else {
            ((defpackage.adyk) this.f.remove()).close();
        }
        n();
    }

    private final void p() {
        if (((defpackage.adyk) this.f.peek()).f() == 0) {
            o();
        }
    }

    private final void q(int i) {
        if (this.h) {
            return;
        }
        defpackage.adyk[] adykVarArr = new defpackage.adyk[i];
        int iF = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            defpackage.adyk adykVar = (defpackage.adyk) this.f.pollLast();
            adykVarArr[i2] = adykVar;
            iF += adykVar.f();
        }
        byte[] bArr = new byte[iF];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            defpackage.adyk adykVar2 = adykVarArr[i4];
            int iF2 = adykVar2.f();
            adykVar2.j(bArr, i3, iF2);
            i3 += iF2;
            adykVar2.close();
        }
        defpackage.adyk adykVar3 = defpackage.adyo.a;
        this.f.add(new defpackage.adym(bArr, 0, iF));
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void b() {
        if (this.g == null) {
            this.g = new java.util.ArrayDeque(java.lang.Math.min(this.f.size(), 16));
        }
        while (!this.g.isEmpty()) {
            ((defpackage.adyk) this.g.remove()).close();
        }
        this.h = true;
        defpackage.adyk adykVar = (defpackage.adyk) this.f.peek();
        if (adykVar != null) {
            adykVar.b();
        }
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final void c() {
        if (!this.h) {
            throw new java.nio.InvalidMarkException();
        }
        java.util.Deque deque = this.f;
        defpackage.adyk adykVar = (defpackage.adyk) deque.peek();
        if (adykVar != null) {
            int iF = adykVar.f();
            adykVar.c();
            this.a += adykVar.f() - iF;
        }
        while (true) {
            defpackage.adyk adykVar2 = (defpackage.adyk) this.g.pollLast();
            if (adykVar2 == null) {
                return;
            }
            adykVar2.c();
            deque.addFirst(adykVar2);
            this.a += adykVar2.f();
        }
    }

    @Override // defpackage.adsj, defpackage.adyk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            java.util.Deque deque = this.f;
            if (deque.isEmpty()) {
                break;
            } else {
                ((defpackage.adyk) deque.remove()).close();
            }
        }
        if (this.g != null) {
            while (!this.g.isEmpty()) {
                ((defpackage.adyk) this.g.remove()).close();
            }
        }
        this.i = 0;
    }

    @Override // defpackage.adsj, defpackage.adyk
    public final boolean d() {
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (!((defpackage.adyk) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.adyk
    public final int e() {
        return m(b, 1, null, 0);
    }

    @Override // defpackage.adyk
    public final int f() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [adyk] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [adyk] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [adts] */
    /* JADX WARN: Type inference failed for: r1v3, types: [adts] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.adyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.adyk g(int r8) {
        /*
            r7 = this;
            if (r8 > 0) goto L5
            adyk r7 = defpackage.adyo.a
            return r7
        L5:
            r7.a(r8)
            int r0 = r7.a
            int r0 = r0 - r8
            r7.a = r0
            r0 = 0
            r1 = r0
        Lf:
            java.util.Deque r2 = r7.f
            java.lang.Object r3 = r2.peek()
            adyk r3 = (defpackage.adyk) r3
            int r4 = r3.f()
            if (r4 <= r8) goto L23
            adyk r8 = r3.g(r8)
            r3 = 0
            goto L3c
        L23:
            boolean r5 = r7.h
            if (r5 == 0) goto L2f
            adyk r3 = r3.g(r4)
            r7.o()
            goto L38
        L2f:
            java.lang.Object r3 = r2.poll()
            adyk r3 = (defpackage.adyk) r3
            r7.n()
        L38:
            int r8 = r8 - r4
            r6 = r3
            r3 = r8
            r8 = r6
        L3c:
            if (r0 != 0) goto L40
            r0 = r8
            goto L5d
        L40:
            if (r1 != 0) goto L5a
            adts r1 = new adts
            r4 = 2
            if (r3 != 0) goto L48
            goto L53
        L48:
            int r2 = r2.size()
            int r2 = r2 + r4
            r4 = 16
            int r4 = java.lang.Math.min(r2, r4)
        L53:
            r1.<init>(r4)
            r1.h(r0)
            r0 = r1
        L5a:
            r1.h(r8)
        L5d:
            if (r3 > 0) goto L60
            return r0
        L60:
            r8 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adts.g(int):adyk");
    }

    public final void h(defpackage.adyk adykVar) {
        boolean z = this.h && this.f.isEmpty();
        int iF = adykVar.f();
        if (iF >= 1024) {
            int i = this.i;
            if (i > 1) {
                q(i);
            }
            this.i = 0;
            this.f.add(adykVar);
            this.a += iF;
        } else {
            this.f.add(adykVar);
            this.a += iF;
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= 1000) {
                q(i2);
                this.i = 0;
            }
        }
        if (z) {
            ((defpackage.adyk) this.f.peek()).b();
        }
    }

    @Override // defpackage.adyk
    public final void i(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        l(e, i, outputStream, 0);
    }

    @Override // defpackage.adyk
    public final void j(byte[] bArr, int i, int i2) {
        m(d, i2, bArr, i);
    }

    @Override // defpackage.adyk
    public final void k(int i) {
        m(c, i, null, 0);
    }

    public adts(int i) {
        this.i = 0;
        this.f = new java.util.ArrayDeque(i);
    }
}
