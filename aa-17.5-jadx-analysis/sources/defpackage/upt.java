package defpackage;

import android.graphics.BitmapFactory;

/* loaded from: classes3.dex */
final class upt extends ups {
    private final byte[] a;

    public upt(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.upv
    protected final /* bridge */ /* synthetic */ Object a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        byte[] bArr = this.a;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }
}
