package defpackage;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
public final class rlf {
    public static final /* synthetic */ int e = 0;
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    long a;
    public final int b;
    public final ByteBuffer c;
    public final boolean d;
    private final ThreadLocal g = new rle();
    private final int h;
    private final boolean i;
    private final long j;

    public rlf(int i, ByteBuffer byteBuffer, int i2, boolean z, boolean z2, long j) {
        this.b = i;
        if (byteBuffer == null) {
            throw new NullPointerException("Null message");
        }
        this.c = byteBuffer;
        this.h = i2;
        this.i = z;
        this.d = z2;
        this.j = j;
    }

    public static ByteBuffer b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    final String a() {
        return ((SimpleDateFormat) this.g.get()).format(Long.valueOf(this.j));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rlf) {
            rlf rlfVar = (rlf) obj;
            if (this.b == rlfVar.b && this.c.equals(rlfVar.c) && this.h == rlfVar.h && this.i == rlfVar.i && this.d == rlfVar.d && this.j == rlfVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.b ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.h) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237)) * 1000003;
        long j = this.j;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        String strA = a();
        long j = this.a;
        byte[] bArrArray = this.c.array();
        int length = bArrArray.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArrArray) {
            char[] cArr2 = f;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        boolean z = this.d;
        boolean z2 = this.i;
        return strA + "  channelId: " + this.b + ", sequenceNumber: " + j + ", size: " + this.h + ", isControlMessage: " + z2 + ", isTxMessage: " + z + ", message: " + new String(cArr);
    }

    public rlf() {
    }
}
