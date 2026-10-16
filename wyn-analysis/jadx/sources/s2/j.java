package s2;

import N1.AbstractC0774x;
import N1.InterfaceC0758g;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0758g f44896b;

    /* renamed from: c, reason: collision with root package name */
    public final long f44897c;

    /* renamed from: d, reason: collision with root package name */
    public long f44898d;

    /* renamed from: f, reason: collision with root package name */
    public int f44900f;

    /* renamed from: g, reason: collision with root package name */
    public int f44901g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f44899e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f44895a = new byte[4096];

    static {
        AbstractC0774x.a("media3.extractor");
    }

    public j(InterfaceC0758g interfaceC0758g, long j8, long j10) {
        this.f44896b = interfaceC0758g;
        this.f44898d = j8;
        this.f44897c = j10;
    }

    @Override // s2.n, J5.l
    public final void a(int i5, int i10, byte[] bArr) {
        c(bArr, i5, i10, false);
    }

    public final boolean b(int i5, boolean z2) throws EOFException, InterruptedIOException {
        l(i5);
        int iO = this.f44901g - this.f44900f;
        while (iO < i5) {
            int i10 = i5;
            boolean z10 = z2;
            iO = o(this.f44899e, this.f44900f, i10, iO, z10);
            if (iO == -1) {
                return false;
            }
            this.f44901g = this.f44900f + iO;
            i5 = i10;
            z2 = z10;
        }
        this.f44900f += i5;
        return true;
    }

    @Override // s2.n, J5.l
    public final boolean c(byte[] bArr, int i5, int i10, boolean z2) {
        if (!b(i10, z2)) {
            return false;
        }
        System.arraycopy(this.f44899e, this.f44900f - i10, bArr, i5, i10);
        return true;
    }

    @Override // s2.n, J5.l
    public final void e() {
        this.f44900f = 0;
    }

    @Override // s2.n, J5.l
    public final boolean f(byte[] bArr, int i5, int i10, boolean z2) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.f44901g;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f44899e, 0, bArr, i5, iMin);
            r(iMin);
        }
        int iO = iMin;
        while (iO < i10 && iO != -1) {
            iO = o(bArr, i5, i10, iO, z2);
        }
        if (iO != -1) {
            this.f44898d += iO;
        }
        return iO != -1;
    }

    @Override // s2.n, J5.l
    public final long g() {
        return this.f44898d + this.f44900f;
    }

    @Override // s2.n, J5.l
    public final long getPosition() {
        return this.f44898d;
    }

    @Override // s2.n, J5.l
    public final void h(int i5) throws EOFException, InterruptedIOException {
        b(i5, false);
    }

    @Override // s2.n, J5.l
    public final long i() {
        return this.f44897c;
    }

    @Override // s2.n, J5.l
    public final void j(int i5) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f44901g, i5);
        r(iMin);
        int iO = iMin;
        while (iO < i5 && iO != -1) {
            byte[] bArr = this.f44895a;
            iO = o(bArr, -iO, Math.min(i5, bArr.length + iO), iO, false);
        }
        if (iO != -1) {
            this.f44898d += iO;
        }
    }

    public final void l(int i5) {
        int i10 = this.f44900f + i5;
        byte[] bArr = this.f44899e;
        if (i10 > bArr.length) {
            this.f44899e = Arrays.copyOf(this.f44899e, Q1.x.i(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int m(int i5, int i10, byte[] bArr) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin;
        l(i10);
        int i11 = this.f44901g;
        int i12 = this.f44900f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            jVar = this;
            iMin = jVar.o(this.f44899e, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            jVar.f44901g += iMin;
        } else {
            jVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(jVar.f44899e, jVar.f44900f, bArr, i5, iMin);
        jVar.f44900f += iMin;
        return iMin;
    }

    public final int o(byte[] bArr, int i5, int i10, int i11, boolean z2) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i12 = this.f44896b.read(bArr, i5 + i11, i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        if (i11 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final int q(int i5) throws EOFException, InterruptedIOException {
        j jVar;
        int iMin = Math.min(this.f44901g, i5);
        r(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f44895a;
            jVar = this;
            iMin = jVar.o(bArr, 0, Math.min(i5, bArr.length), 0, true);
        } else {
            jVar = this;
        }
        if (iMin != -1) {
            jVar.f44898d += iMin;
        }
        return iMin;
    }

    public final void r(int i5) {
        int i10 = this.f44901g - i5;
        this.f44901g = i10;
        this.f44900f = 0;
        byte[] bArr = this.f44899e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        this.f44899e = bArr2;
    }

    @Override // N1.InterfaceC0758g, t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws EOFException, InterruptedIOException {
        j jVar;
        int i11 = this.f44901g;
        int iO = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f44899e, 0, bArr, i5, iMin);
            r(iMin);
            iO = iMin;
        }
        if (iO == 0) {
            jVar = this;
            iO = jVar.o(bArr, i5, i10, 0, true);
        } else {
            jVar = this;
        }
        if (iO != -1) {
            jVar.f44898d += iO;
        }
        return iO;
    }

    @Override // s2.n, J5.l
    public final void readFully(byte[] bArr, int i5, int i10) throws EOFException, InterruptedIOException {
        f(bArr, i5, i10, false);
    }
}
