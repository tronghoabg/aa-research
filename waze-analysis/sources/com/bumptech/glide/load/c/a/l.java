package com.bumptech.glide.load.c.a;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3350a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3351b;

    l(ByteBuffer byteBuffer, int i2) {
        this.f3350a = i2;
        this.f3351b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // com.bumptech.glide.load.c.a.k
    public final int a() throws IOException {
        int iD;
        short sD;
        if (this.f3350a != 0) {
            iD = d() << 8;
            sD = d();
        } else {
            iD = d() << 8;
            sD = d();
        }
        return sD | iD;
    }

    @Override // com.bumptech.glide.load.c.a.k
    public final int b(byte[] bArr, int i2) throws IOException {
        int i3 = 0;
        if (this.f3350a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f3351b;
            int iMin = Math.min(i2, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }
        int i4 = 0;
        while (i3 < i2) {
            i4 = ((InputStream) this.f3351b).read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                break;
            }
            i3 += i4;
        }
        if (i3 == 0 && i4 == -1) {
            throw new j();
        }
        return i3;
    }

    @Override // com.bumptech.glide.load.c.a.k
    public final long c(long j2) throws IOException {
        if (this.f3350a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) this.f3351b;
            int iMin = (int) Math.min(byteBuffer.remaining(), j2);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
        if (j2 < 0) {
            return 0L;
        }
        long j3 = j2;
        while (j3 > 0) {
            InputStream inputStream = (InputStream) this.f3351b;
            long jSkip = inputStream.skip(j3);
            if (jSkip > 0) {
                j3 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j3--;
            }
        }
        return j2 - j3;
    }

    @Override // com.bumptech.glide.load.c.a.k
    public final short d() throws IOException {
        int i2 = this.f3350a;
        Object obj = this.f3351b;
        if (i2 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (byteBuffer.remaining() > 0) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new j();
        }
        int i3 = ((InputStream) obj).read();
        if (i3 != -1) {
            return (short) i3;
        }
        throw new j();
    }

    l(InputStream inputStream, int i2) {
        this.f3350a = i2;
        this.f3351b = inputStream;
    }
}
