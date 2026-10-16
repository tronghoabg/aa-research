package Va;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.m9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1063m9 extends AbstractC1127r9 {

    /* renamed from: e, reason: collision with root package name */
    public static int f14392e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14393f = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14395c;

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f14391d = {258, 281, 276, 261, 260, 257, 270, 259};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f14394g = {-103363495, 2003605276, -1420544544, -1252579132, -1713099814, -152276108, 2099479766, -783070933, -768469740, -779988851, 1387319639, -1187362168, -1272085706, -1712757759, -456793712, 1819351901, 698509257, -1862287001};

    private final String f() throws UnsupportedEncodingException {
        String str;
        f14393f = (f14392e + 67) % 128;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 128;
        byte[] bytes = "\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081".getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14391d;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13938v;
                    if (i5 >= AbstractC0897a.f13939w) {
                        break;
                    }
                    cArr2[i5] = (char) (cArr[bytes[(r6 - 1) - i5] + bitsPerPixel] - 160);
                    AbstractC0897a.f13938v = i5 + 1;
                }
                str = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        int i10 = f14393f + 123;
        f14392e = i10 % 128;
        if (i10 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // Va.AbstractC1127r9
    public final String a() {
        String str;
        switch (this.f14395c) {
            case 0:
                return f();
            default:
                int[] iArr = {1182476305, -703218953, -240757321, -295938597};
                int iResolveOpacity = 6 - Drawable.resolveOpacity(0, 0);
                synchronized (AbstractC0897a.f13930n) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[8];
                        int[] iArr2 = (int[]) f14394g.clone();
                        AbstractC0897a.k = 0;
                        while (true) {
                            int i5 = AbstractC0897a.k;
                            if (i5 < 4) {
                                int i10 = iArr[i5];
                                char c10 = (char) (i10 >> 16);
                                cArr[0] = c10;
                                char c11 = (char) i10;
                                cArr[1] = c11;
                                int i11 = iArr[i5 + 1];
                                char c12 = (char) (i11 >> 16);
                                cArr[2] = c12;
                                char c13 = (char) i11;
                                cArr[3] = c13;
                                AbstractC0897a.f13928l = (c10 << 16) + c11;
                                AbstractC0897a.f13929m = (c12 << 16) + c13;
                                AbstractC0897a.o(iArr2);
                                for (int i12 = 0; i12 < 16; i12++) {
                                    int i13 = AbstractC0897a.f13928l ^ iArr2[i12];
                                    AbstractC0897a.f13928l = i13;
                                    int iG = AbstractC0897a.G(i13) ^ AbstractC0897a.f13929m;
                                    int i14 = AbstractC0897a.f13928l;
                                    AbstractC0897a.f13928l = iG;
                                    AbstractC0897a.f13929m = i14;
                                }
                                int i15 = AbstractC0897a.f13928l;
                                int i16 = AbstractC0897a.f13929m;
                                AbstractC0897a.f13928l = i16;
                                AbstractC0897a.f13929m = i15;
                                int i17 = i15 ^ iArr2[16];
                                AbstractC0897a.f13929m = i17;
                                int i18 = iArr2[17] ^ i16;
                                AbstractC0897a.f13928l = i18;
                                cArr[0] = (char) (i18 >>> 16);
                                cArr[1] = (char) i18;
                                cArr[2] = (char) (i17 >>> 16);
                                cArr[3] = (char) i17;
                                AbstractC0897a.o(iArr2);
                                int i19 = AbstractC0897a.k;
                                int i20 = i19 << 1;
                                cArr2[i20] = cArr[0];
                                cArr2[i20 + 1] = cArr[1];
                                cArr2[i20 + 2] = cArr[2];
                                cArr2[i20 + 3] = cArr[3];
                                AbstractC0897a.k = i19 + 2;
                            } else {
                                str = new String(cArr2, 0, iResolveOpacity);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str.intern();
        }
    }

    @Override // Va.AbstractC1127r9
    public Z0 c() {
        C0991h2 c0991h2 = new C0991h2(a());
        int i5 = f14392e + 87;
        f14393f = i5 % 128;
        if (i5 % 2 != 0) {
            return c0991h2;
        }
        throw null;
    }
}
