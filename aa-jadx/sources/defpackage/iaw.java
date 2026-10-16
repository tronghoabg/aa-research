package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iaw implements defpackage.iav {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public iaw(java.nio.ByteBuffer byteBuffer, int i) {
        this.a = i;
        this.b = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.iav
    public final int a() throws java.io.IOException {
        int iD;
        short sD;
        if (this.a != 0) {
            iD = d() << 8;
            sD = d();
        } else {
            iD = d() << 8;
            sD = d();
        }
        return sD | iD;
    }

    @Override // defpackage.iav
    public final int b(byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        if (this.a != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.b;
            int iMin = java.lang.Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }
        int i3 = 0;
        while (i2 < i) {
            i3 = ((java.io.InputStream) this.b).read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new defpackage.iau();
        }
        return i2;
    }

    @Override // defpackage.iav
    public final long c(long j) throws java.io.IOException {
        if (this.a != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.b;
            int iMin = (int) java.lang.Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            java.io.InputStream inputStream = (java.io.InputStream) this.b;
            long jSkip = inputStream.skip(j2);
            if (jSkip > 0) {
                j2 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.iav
    public final short d() throws java.io.IOException {
        int i = this.a;
        java.lang.Object obj = this.b;
        if (i != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            if (byteBuffer.remaining() > 0) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new defpackage.iau();
        }
        int i2 = ((java.io.InputStream) obj).read();
        if (i2 != -1) {
            return (short) i2;
        }
        throw new defpackage.iau();
    }

    public iaw(java.io.InputStream inputStream, int i) {
        this.a = i;
        this.b = inputStream;
    }
}
