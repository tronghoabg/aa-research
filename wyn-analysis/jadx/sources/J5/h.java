package J5;

import E5.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import t6.InterfaceC4144l;

/* loaded from: classes3.dex */
public final class h implements l {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4144l f5644b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5645c;

    /* renamed from: d, reason: collision with root package name */
    public long f5646d;

    /* renamed from: f, reason: collision with root package name */
    public int f5648f;

    /* renamed from: g, reason: collision with root package name */
    public int f5649g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f5647e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5643a = new byte[4096];

    static {
        P.a("goog.exo.extractor");
    }

    public h(InterfaceC4144l interfaceC4144l, long j8, long j10) {
        this.f5644b = interfaceC4144l;
        this.f5646d = j8;
        this.f5645c = j10;
    }

    @Override // J5.l
    public final void a(int i5, int i10, byte[] bArr) {
        c(bArr, i5, i10, false);
    }

    public final boolean b(int i5, boolean z2) throws EOFException, InterruptedIOException {
        l(i5);
        int iN = this.f5649g - this.f5648f;
        while (iN < i5) {
            int i10 = i5;
            boolean z10 = z2;
            iN = n(this.f5647e, this.f5648f, i10, iN, z10);
            if (iN == -1) {
                return false;
            }
            this.f5649g = this.f5648f + iN;
            i5 = i10;
            z2 = z10;
        }
        this.f5648f += i5;
        return true;
    }

    @Override // J5.l
    public final boolean c(byte[] bArr, int i5, int i10, boolean z2) {
        if (!b(i10, z2)) {
            return false;
        }
        System.arraycopy(this.f5647e, this.f5648f - i10, bArr, i5, i10);
        return true;
    }

    @Override // J5.l
    public final void e() {
        this.f5648f = 0;
    }

    @Override // J5.l
    public final boolean f(byte[] bArr, int i5, int i10, boolean z2) throws EOFException, InterruptedIOException {
        int iMin;
        int i11 = this.f5649g;
        if (i11 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i11, i10);
            System.arraycopy(this.f5647e, 0, bArr, i5, iMin);
            o(iMin);
        }
        int iN = iMin;
        while (iN < i10 && iN != -1) {
            iN = n(bArr, i5, i10, iN, z2);
        }
        if (iN != -1) {
            this.f5646d += iN;
        }
        return iN != -1;
    }

    @Override // J5.l
    public final long g() {
        return this.f5646d + this.f5648f;
    }

    @Override // J5.l
    public final long getPosition() {
        return this.f5646d;
    }

    @Override // J5.l
    public final void h(int i5) throws EOFException, InterruptedIOException {
        b(i5, false);
    }

    @Override // J5.l
    public final long i() {
        return this.f5645c;
    }

    @Override // J5.l
    public final void j(int i5) {
        int iMin = Math.min(this.f5649g, i5);
        o(iMin);
        int iN = iMin;
        while (iN < i5 && iN != -1) {
            byte[] bArr = this.f5643a;
            iN = n(bArr, -iN, Math.min(i5, bArr.length + iN), iN, false);
        }
        if (iN != -1) {
            this.f5646d += iN;
        }
    }

    public final void l(int i5) {
        int i10 = this.f5648f + i5;
        byte[] bArr = this.f5647e;
        if (i10 > bArr.length) {
            this.f5647e = Arrays.copyOf(this.f5647e, u6.v.h(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int m(int i5, int i10, byte[] bArr) throws EOFException, InterruptedIOException {
        h hVar;
        int iMin;
        l(i10);
        int i11 = this.f5649g;
        int i12 = this.f5648f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            hVar = this;
            iMin = hVar.n(this.f5647e, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            hVar.f5649g += iMin;
        } else {
            hVar = this;
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(hVar.f5647e, hVar.f5648f, bArr, i5, iMin);
        hVar.f5648f += iMin;
        return iMin;
    }

    public final int n(byte[] bArr, int i5, int i10, int i11, boolean z2) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i12 = this.f5644b.read(bArr, i5 + i11, i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        if (i11 == 0 && z2) {
            return -1;
        }
        throw new EOFException();
    }

    public final void o(int i5) {
        int i10 = this.f5649g - i5;
        this.f5649g = i10;
        this.f5648f = 0;
        byte[] bArr = this.f5647e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i5, bArr2, 0, i10);
        this.f5647e = bArr2;
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] bArr, int i5, int i10) throws EOFException, InterruptedIOException {
        h hVar;
        int i11 = this.f5649g;
        int iN = 0;
        if (i11 != 0) {
            int iMin = Math.min(i11, i10);
            System.arraycopy(this.f5647e, 0, bArr, i5, iMin);
            o(iMin);
            iN = iMin;
        }
        if (iN == 0) {
            hVar = this;
            iN = hVar.n(bArr, i5, i10, 0, true);
        } else {
            hVar = this;
        }
        if (iN != -1) {
            hVar.f5646d += iN;
        }
        return iN;
    }

    @Override // J5.l
    public final void readFully(byte[] bArr, int i5, int i10) throws EOFException, InterruptedIOException {
        f(bArr, i5, i10, false);
    }
}
