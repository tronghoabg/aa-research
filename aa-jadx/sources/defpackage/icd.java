package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class icd implements defpackage.huu {
    private final java.nio.ByteBuffer a = java.nio.ByteBuffer.allocate(4);
    private final /* synthetic */ int b;

    public icd(int i, byte[] bArr) {
        this.b = i;
    }

    @Override // defpackage.huu
    public final /* synthetic */ void a(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        if (this.b != 0) {
            java.lang.Long l = (java.lang.Long) obj;
            messageDigest.update(bArr);
            java.nio.ByteBuffer byteBuffer = this.a;
            synchronized (byteBuffer) {
                byteBuffer.position(0);
                messageDigest.update(byteBuffer.putLong(l.longValue()).array());
            }
            return;
        }
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        java.nio.ByteBuffer byteBuffer2 = this.a;
        synchronized (byteBuffer2) {
            byteBuffer2.position(0);
            messageDigest.update(byteBuffer2.putInt(num.intValue()).array());
        }
    }

    public icd(int i) {
        this.b = i;
    }
}
