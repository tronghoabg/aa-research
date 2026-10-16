package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class adsr extends adri {
    private static final adsp b = new adsn(1);
    private static final adsp c = new adsn(0);
    private static final adsp d = new adsn(2);
    private static final adsq e = new adso();
    public int a;
    private final Deque f;
    private Deque g;
    private boolean h;
    private int i;

    public adsr() {
        this.i = 0;
        this.f = new ArrayDeque();
    }

    private final int l(adsq adsqVar, int i, Object obj, int i2) throws IOException {
        a(i);
        Deque deque = this.f;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0 && !deque.isEmpty()) {
            adxi adxiVar = (adxi) deque.peek();
            int iMin = Math.min(i, adxiVar.f());
            i2 = adsqVar.a(adxiVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int m(adsp adspVar, int i, Object obj, int i2) {
        try {
            return l(adspVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void n() {
        Deque deque = this.f;
        if (this.i > deque.size()) {
            this.i = deque.size();
        }
    }

    private final void o() {
        if (this.h) {
            Deque deque = this.g;
            Deque deque2 = this.f;
            deque.add((adxi) deque2.remove());
            adxi adxiVar = (adxi) deque2.peek();
            if (adxiVar != null) {
                adxiVar.b();
            }
        } else {
            ((adxi) this.f.remove()).close();
        }
        n();
    }

    private final void p() {
        if (((adxi) this.f.peek()).f() == 0) {
            o();
        }
    }

    private final void q(int i) {
        if (this.h) {
            return;
        }
        adxi[] adxiVarArr = new adxi[i];
        int iF = 0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            adxi adxiVar = (adxi) this.f.pollLast();
            adxiVarArr[i2] = adxiVar;
            iF += adxiVar.f();
        }
        byte[] bArr = new byte[iF];
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            adxi adxiVar2 = adxiVarArr[i4];
            int iF2 = adxiVar2.f();
            adxiVar2.j(bArr, i3, iF2);
            i3 += iF2;
            adxiVar2.close();
        }
        adxi adxiVar3 = adxm.a;
        this.f.add(new adxk(bArr, 0, iF));
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void b() {
        if (this.g == null) {
            this.g = new ArrayDeque(Math.min(this.f.size(), 16));
        }
        while (!this.g.isEmpty()) {
            ((adxi) this.g.remove()).close();
        }
        this.h = true;
        adxi adxiVar = (adxi) this.f.peek();
        if (adxiVar != null) {
            adxiVar.b();
        }
    }

    @Override // defpackage.adri, defpackage.adxi
    public final void c() {
        if (!this.h) {
            throw new InvalidMarkException();
        }
        Deque deque = this.f;
        adxi adxiVar = (adxi) deque.peek();
        if (adxiVar != null) {
            int iF = adxiVar.f();
            adxiVar.c();
            this.a += adxiVar.f() - iF;
        }
        while (true) {
            adxi adxiVar2 = (adxi) this.g.pollLast();
            if (adxiVar2 == null) {
                return;
            }
            adxiVar2.c();
            deque.addFirst(adxiVar2);
            this.a += adxiVar2.f();
        }
    }

    @Override // defpackage.adri, defpackage.adxi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.f;
            if (deque.isEmpty()) {
                break;
            } else {
                ((adxi) deque.remove()).close();
            }
        }
        if (this.g != null) {
            while (!this.g.isEmpty()) {
                ((adxi) this.g.remove()).close();
            }
        }
        this.i = 0;
    }

    @Override // defpackage.adri, defpackage.adxi
    public final boolean d() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            if (!((adxi) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.adxi
    public final int e() {
        return m(b, 1, null, 0);
    }

    @Override // defpackage.adxi
    public final int f() {
        return this.a;
    }

    @Override // defpackage.adxi
    public final adxi g(int i) {
        adxi adxiVarG;
        int i2;
        adxi adxiVarG2;
        if (i <= 0) {
            return adxm.a;
        }
        a(i);
        this.a -= i;
        adxi adxiVar = null;
        adsr adsrVar = null;
        while (true) {
            Deque deque = this.f;
            adxi adxiVar2 = (adxi) deque.peek();
            int iF = adxiVar2.f();
            if (iF > i) {
                adxiVarG2 = adxiVar2.g(i);
                i2 = 0;
            } else {
                if (this.h) {
                    adxiVarG = adxiVar2.g(iF);
                    o();
                } else {
                    adxiVarG = (adxi) deque.poll();
                    n();
                }
                adxi adxiVar3 = adxiVarG;
                i2 = i - iF;
                adxiVarG2 = adxiVar3;
            }
            if (adxiVar == null) {
                adxiVar = adxiVarG2;
            } else {
                if (adsrVar == null) {
                    adsrVar = new adsr(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    adsrVar.h(adxiVar);
                    adxiVar = adsrVar;
                }
                adsrVar.h(adxiVarG2);
            }
            if (i2 <= 0) {
                return adxiVar;
            }
            i = i2;
        }
    }

    public final void h(adxi adxiVar) {
        boolean z = this.h && this.f.isEmpty();
        int iF = adxiVar.f();
        if (iF >= 1024) {
            int i = this.i;
            if (i > 1) {
                q(i);
            }
            this.i = 0;
            this.f.add(adxiVar);
            this.a += iF;
        } else {
            this.f.add(adxiVar);
            this.a += iF;
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= 1000) {
                q(i2);
                this.i = 0;
            }
        }
        if (z) {
            ((adxi) this.f.peek()).b();
        }
    }

    @Override // defpackage.adxi
    public final void i(OutputStream outputStream, int i) throws IOException {
        l(e, i, outputStream, 0);
    }

    @Override // defpackage.adxi
    public final void j(byte[] bArr, int i, int i2) {
        m(d, i2, bArr, i);
    }

    @Override // defpackage.adxi
    public final void k(int i) {
        m(c, i, null, 0);
    }

    public adsr(int i) {
        this.i = 0;
        this.f = new ArrayDeque(i);
    }
}
