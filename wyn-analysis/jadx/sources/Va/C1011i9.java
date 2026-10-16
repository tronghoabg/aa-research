package Va;

import android.view.KeyEvent;
import android.view.View;
import com.amazon.device.ads.DTBAdRequest;

/* renamed from: Va.i9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1011i9 extends AbstractC1127r9 {

    /* renamed from: c, reason: collision with root package name */
    public static int f14288c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14289d = 1;

    public static String f(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 36547)) ^ ((c11 >>> 5) + 50216)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 52237) ^ ((c12 + i11) ^ ((c12 << 4) + 3617))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.AbstractC1127r9
    public final String a() {
        int i5 = f14288c + 101;
        f14289d = i5 % 128;
        String strIntern = f("\ue21d贌߶虮\udd3d짆竅\uf61dオ鮚", i5 % 2 == 0 ? 47 >> View.resolveSize(0, 0) : 9 - View.resolveSize(0, 0)).intern();
        f14288c = (f14289d + 71) % 128;
        return strIntern;
    }

    @Override // Va.AbstractC1127r9
    public final Z0 c() {
        C1196x1 c1196x1 = new C1196x1(a());
        int i5 = f14289d + 47;
        f14288c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 39 / 0;
        }
        return c1196x1;
    }

    @Override // Va.AbstractC1127r9
    public final String d() {
        int i5 = f14288c + 17;
        f14289d = i5 % 128;
        return f("Ἀࣽ篝\ue123\ue21d贌߶虮\udd3d짆堏⧻躀퀒ޮ\ude0f꺮䳽⾁ﲊవ虎ߙ샅숼ꎈ莽坒劸쪭〼뷅撉糱", i5 % 2 == 0 ? 113 - KeyEvent.normalizeMetaState(0) : KeyEvent.normalizeMetaState(0) + 34).intern();
    }

    @Override // Va.AbstractC1127r9
    public final Class e() {
        int i5 = f14288c + 43;
        int i10 = i5 % 128;
        f14289d = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i11 = i10 + 53;
        f14288c = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
        return DTBAdRequest.class;
    }
}
