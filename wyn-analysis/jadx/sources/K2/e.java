package K2;

import java.io.EOFException;
import java.io.InterruptedIOException;
import org.apache.tika.fork.ForkServer;
import s2.j;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f6451d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f6452a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f6453b;

    /* renamed from: c, reason: collision with root package name */
    public int f6454c;

    public static long a(byte[] bArr, int i5, boolean z2) {
        long j8 = bArr[0] & 255;
        if (z2) {
            j8 &= ~f6451d[i5 - 1];
        }
        for (int i10 = 1; i10 < i5; i10++) {
            j8 = (j8 << 8) | (bArr[i10] & 255);
        }
        return j8;
    }

    public static int b(int i5) {
        for (int i10 = 0; i10 < 8; i10++) {
            if ((f6451d[i10] & i5) != 0) {
                return i10 + 1;
            }
        }
        return -1;
    }

    public final long c(j jVar, boolean z2, boolean z10, int i5) throws EOFException, InterruptedIOException {
        int i10 = this.f6453b;
        byte[] bArr = this.f6452a;
        if (i10 == 0) {
            if (!jVar.f(bArr, 0, 1, z2)) {
                return -1L;
            }
            int iB = b(bArr[0] & ForkServer.ERROR);
            this.f6454c = iB;
            if (iB == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f6453b = 1;
        }
        int i11 = this.f6454c;
        if (i11 > i5) {
            this.f6453b = 0;
            return -2L;
        }
        if (i11 != 1) {
            jVar.f(bArr, 1, i11 - 1, false);
        }
        this.f6453b = 0;
        return a(bArr, this.f6454c, z10);
    }
}
