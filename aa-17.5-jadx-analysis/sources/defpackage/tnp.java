package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final /* synthetic */ class tnp implements xyc {
    private final /* synthetic */ int a;

    public /* synthetic */ tnp(int i) {
        this.a = i;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return new roc();
            case 2:
            case 3:
                return true;
            case 4:
                return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return false;
            case 18:
                return true;
            case 19:
            default:
                return false;
        }
    }
}
