package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class pke {
    private static final yob a = yob.c("com/google/android/apps/gmm/offline/paint/resource/OfflinePaintResourceManagerImpl");
    private final upf b;
    private final upp c;

    public pke(xxh xxhVar, aezk aezkVar) {
        this.b = new upf(aezkVar);
        this.c = (upp) xxhVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap a(upq upqVar, Bitmap[] bitmapArr, Rect rect) {
        int length;
        Bitmap bitmap;
        yfq yfqVar = upqVar.e;
        Bitmap[] bitmapArr2 = new Bitmap[yfqVar.size()];
        for (int i = 0; i < yfqVar.size(); i++) {
            uiy uiyVar = (uiy) yfqVar.get(i);
            if (bitmapArr == null || (bitmap = bitmapArr[i]) == null) {
                String str = uiyVar.b;
                byte[] bArr = uiyVar.c;
                if (!woy.am(str) || (bArr != null && bArr.length != 0)) {
                    if (bArr == null || bArr.length == 0) {
                        bArr = null;
                    }
                    if (bArr == null || (length = bArr.length) == 0) {
                        return null;
                    }
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length);
                    if (bitmapDecodeByteArray == null) {
                        ((ynz) ((ynz) a.g()).ai((char) 6746)).y("Unable to decode bitmap from resource. Asset Key: %s", str);
                        return null;
                    }
                    bitmapArr2[i] = bitmapDecodeByteArray;
                }
            } else {
                bitmapArr2[i] = bitmap;
            }
        }
        return this.b.a(bitmapArr2, upqVar, rect);
    }

    public final void b(Integer num, ujk ujkVar) {
        if (this.c == null || ujkVar == null || num == null) {
            return;
        }
        Objects.toString(num);
        num.toString();
    }
}
