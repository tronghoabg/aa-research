package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rmb {
    public static final /* synthetic */ int e = 0;
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    long a;
    public final int b;
    public final java.nio.ByteBuffer c;
    public final boolean d;
    private final java.lang.ThreadLocal g = new defpackage.rma();
    private final int h;
    private final boolean i;
    private final long j;

    public rmb(int i, java.nio.ByteBuffer byteBuffer, int i2, boolean z, boolean z2, long j) {
        this.b = i;
        if (byteBuffer == null) {
            throw new java.lang.NullPointerException("Null message");
        }
        this.c = byteBuffer;
        this.h = i2;
        this.i = z;
        this.d = z2;
        this.j = j;
    }

    public static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    final java.lang.String a() {
        return ((java.text.SimpleDateFormat) this.g.get()).format(java.lang.Long.valueOf(this.j));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rmb) {
            defpackage.rmb rmbVar = (defpackage.rmb) obj;
            if (this.b == rmbVar.b && this.c.equals(rmbVar.c) && this.h == rmbVar.h && this.i == rmbVar.i && this.d == rmbVar.d && this.j == rmbVar.j) {
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

    public final java.lang.String toString() {
        java.lang.String strA = a();
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
        return strA + "  channelId: " + this.b + ", sequenceNumber: " + j + ", size: " + this.h + ", isControlMessage: " + z2 + ", isTxMessage: " + z + ", message: " + new java.lang.String(cArr);
    }

    public rmb() {
    }
}
