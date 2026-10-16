package b.a.a;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final int f1688a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f1689b;

    /* renamed from: c, reason: collision with root package name */
    private int f1690c;

    public d(long j2) {
        if (j2 >= SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException("numBits=" + j2);
        }
        int i2 = ((int) ((j2 + 63) >>> 6)) + 1;
        int i3 = i2 + i2;
        this.f1688a = i3;
        this.f1689b = new int[i3];
        this.f1690c = i3;
    }

    private final int d(int i2) {
        return this.f1689b[i2];
    }

    private final void e(int i2, int i3) {
        this.f1689b[i2] = i3;
    }

    public final BigInteger a() {
        int[] iArr = this.f1689b;
        byte[] bArr = new byte[iArr.length << 2];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            intBufferAsIntBuffer.put(i2, iArr[i2]);
        }
        return new BigInteger(bArr);
    }

    public final void b(int i2) {
        if (i2 == 0) {
            return;
        }
        long j2 = i2;
        int i3 = this.f1688a - 1;
        long j3 = j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        while (j3 != 0) {
            long jD = (d(i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) + j3;
            e(i3, (int) jD);
            j3 = jD >>> 32;
            i3--;
        }
        this.f1690c = Math.min(this.f1690c, i3 + 1);
    }

    public final void c(int i2) {
        int i3 = this.f1688a - 1;
        long j2 = i2;
        while (i3 >= this.f1690c) {
            long jD = ((d(i3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) * 100000000) + j2;
            e(i3, (int) jD);
            j2 = jD >>> 32;
            i3--;
        }
        if (j2 != 0) {
            e(i3, (int) j2);
            this.f1690c = i3;
        }
    }
}
