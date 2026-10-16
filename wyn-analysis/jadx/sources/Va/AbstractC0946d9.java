package Va;

import android.view.View;
import java.io.UnsupportedEncodingException;

/* renamed from: Va.d9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0946d9 extends AbstractC0933c9 {

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14106e = {'e'};

    /* renamed from: f, reason: collision with root package name */
    public static int f14107f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14108g = 1;

    /* renamed from: d, reason: collision with root package name */
    public final byte f14109d;

    public AbstractC0946d9(byte b5) {
        this.f14109d = b5;
    }

    public static void e(int i5, StringBuilder sb2) throws UnsupportedEncodingException {
        String str;
        f14107f = (f14108g + 77) % 128;
        for (int i10 = 0; i10 < i5; i10++) {
            f14107f = (f14108g + 1) % 128;
            int mode = 127 - View.MeasureSpec.getMode(0);
            byte[] bytes = "\u0081\u0081".getBytes("ISO-8859-1");
            synchronized (AbstractC0897a.f13940x) {
                try {
                    char[] cArr = f14106e;
                    int length = bytes.length;
                    AbstractC0897a.f13939w = length;
                    char[] cArr2 = new char[length];
                    AbstractC0897a.f13938v = 0;
                    while (true) {
                        int i11 = AbstractC0897a.f13938v;
                        if (i11 >= AbstractC0897a.f13939w) {
                            break;
                        }
                        cArr2[i11] = (char) (cArr[bytes[(r8 - 1) - i11] + mode] - 'E');
                        AbstractC0897a.f13938v = i11 + 1;
                    }
                    str = new String(cArr2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            sb2.append(str.intern());
        }
        int i12 = f14107f + 69;
        f14108g = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }
}
