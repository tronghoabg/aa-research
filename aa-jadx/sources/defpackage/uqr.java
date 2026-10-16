package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class uqr extends defpackage.uqq {
    private final byte[] a;

    public uqr(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.uqt
    protected final /* bridge */ /* synthetic */ java.lang.Object a() {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        byte[] bArr = this.a;
        return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }
}
