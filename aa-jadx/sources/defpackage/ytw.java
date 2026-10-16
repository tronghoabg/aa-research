package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ytw extends defpackage.ytz implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final byte[] a;

    public ytw(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    @Override // defpackage.ytz
    public final int a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        defpackage.ysr.bl(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    @Override // defpackage.ytz
    public final int b() {
        return this.a.length * 8;
    }

    @Override // defpackage.ytz
    public final long c() {
        byte[] bArr = this.a;
        int length = bArr.length;
        defpackage.ysr.bl(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = bArr[0] & 255;
        for (int i = 1; i < java.lang.Math.min(bArr.length, 8); i++) {
            j |= (((long) bArr[i]) & 255) << (i * 8);
        }
        return j;
    }

    @Override // defpackage.ytz
    public final boolean d(defpackage.ytz ytzVar) {
        int length = ytzVar.f().length;
        byte[] bArr = this.a;
        if (bArr.length != length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            z &= bArr[i] == ytzVar.f()[i];
        }
        return z;
    }

    @Override // defpackage.ytz
    public final byte[] e() {
        return (byte[]) this.a.clone();
    }

    @Override // defpackage.ytz
    public final byte[] f() {
        return this.a;
    }
}
