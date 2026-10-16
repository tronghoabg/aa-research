package P5;

import J5.h;
import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f9254d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9255a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f9256b;

    /* renamed from: c, reason: collision with root package name */
    public int f9257c;

    public static long a(byte[] bArr, int i5, boolean z2) {
        long j8 = bArr[0] & 255;
        if (z2) {
            j8 &= ~f9254d[i5 - 1];
        }
        for (int i10 = 1; i10 < i5; i10++) {
            j8 = (j8 << 8) | (bArr[i10] & 255);
        }
        return j8;
    }

    public static int b(int i5) {
        for (int i10 = 0; i10 < 8; i10++) {
            if ((f9254d[i10] & i5) != 0) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public final long c(h hVar, boolean z2, boolean z10, int i5) throws EOFException, InterruptedIOException {
        int i10 = this.f9256b;
        byte[] bArr = this.f9255a;
        if (i10 == 0) {
            if (!hVar.f(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iB = b(bArr[0] & ForkServer.ERROR);
            this.f9257c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f9256b = 1;
        }
        int i11 = this.f9257c;
        if (i11 > i5) {
            this.f9256b = 0;
            return -2L;
        }
        if (i11 != 1) {
            hVar.f(bArr, 1, i11 - 1, false);
        }
        this.f9256b = 0;
        return a(bArr, this.f9257c, z10);
    }
}
