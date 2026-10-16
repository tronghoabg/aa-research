package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class eiw implements defpackage.eit {
    private final /* synthetic */ int a;

    public eiw(int i) {
        this.a = i;
    }

    @Override // defpackage.eit
    public final byte[] a(byte[] bArr, int i, int i2) {
        if (this.a != 0) {
            return java.util.Arrays.copyOfRange(bArr, i, i2 + i);
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
