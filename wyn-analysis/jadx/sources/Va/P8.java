package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class P8 extends M8 {

    /* renamed from: m, reason: collision with root package name */
    public static int f13599m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13600n = 1;

    /* renamed from: p, reason: collision with root package name */
    public static int f13602p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f13603q = 1;

    /* renamed from: s, reason: collision with root package name */
    public static int f13605s;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f13598l = {31, '='};

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f13601o = {0};

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f13604r = {194};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, int i5) {
        super(abstractC1215y8, abstractC1215y82, 0);
        this.k = i5;
    }

    private final String m() throws UnsupportedEncodingException {
        String str;
        f13599m = (f13600n + 99) % 128;
        int[] iArr = {0, 2, 0, 1};
        byte[] bytes = "\u0000\u0001".getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13598l, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                char[] cArr4 = new char[i10];
                Ab.f13222y = 0;
                while (true) {
                    int i15 = Ab.f13222y;
                    if (i15 >= i10) {
                        break;
                    }
                    cArr4[i15] = cArr[(i10 - i15) - 1];
                    Ab.f13222y = i15 + 1;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr4[i16] = (char) (cArr4[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        f13599m = (f13600n + 41) % 128;
        return strIntern;
    }

    private final String n() {
        String string;
        f13602p = (f13603q + 13) % 128;
        short sCombineMeasuredStates = (short) ((-118) - View.combineMeasuredStates(0, 0));
        int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
        int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
        int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        int i5 = (-926448935) + maxKeyCode;
        byte bAlpha = (byte) ((-13) - Color.alpha(0));
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i10 = 1 - tapTimeout;
                int i11 = i10 == -1 ? 1 : 0;
                if (i11 != 0) {
                    i10 = (byte) (f13601o[maxKeyCode] + 85);
                }
                if (i10 > 0) {
                    AbstractC1104pb.f14486F = ((i5 + i10) - (-926448933)) + i11;
                    AbstractC1104pb.f14487G = bAlpha;
                    char c10 = (char) (edgeSlop + 60);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i10) {
                        byte[] bArr = f13601o;
                        int i12 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i12 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i12] + sCombineMeasuredStates)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = string.intern();
        f13603q = (f13602p + 33) % 128;
        return strIntern;
    }

    private final String o() throws UnsupportedEncodingException {
        String str;
        int scrollBarFadeDuration = 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
        byte[] bytes = "\u0081".getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13604r;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13938v;
                    if (i5 < AbstractC0897a.f13939w) {
                        cArr2[i5] = (char) (cArr[bytes[(r6 - 1) - i5] + scrollBarFadeDuration] - 132);
                        AbstractC0897a.f13938v = i5 + 1;
                    } else {
                        str = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str.intern();
    }

    @Override // Va.F8
    public final String h() {
        String str;
        switch (this.k) {
            case 0:
                return m();
            case 1:
                return n();
            case 2:
                return o();
            default:
                int iIndexOf = 2 - TextUtils.indexOf("", "", 0);
                char[] charArray = "㻡칇".toCharArray();
                synchronized (Ab.f13198F) {
                    try {
                        char[] cArr = new char[charArray.length];
                        Ab.f13197E = 0;
                        char[] cArr2 = new char[2];
                        while (true) {
                            int i5 = Ab.f13197E;
                            if (i5 < charArray.length) {
                                cArr2[0] = charArray[i5];
                                cArr2[1] = charArray[i5 + 1];
                                int i10 = 58224;
                                for (int i11 = 0; i11 < 16; i11++) {
                                    char c10 = cArr2[1];
                                    char c11 = cArr2[0];
                                    char c12 = (char) (c10 - (((c11 + i10) ^ ((c11 << 4) + 61506)) ^ ((c11 >>> 5) + 9891)));
                                    cArr2[1] = c12;
                                    cArr2[0] = (char) (c11 - (((c12 >>> 5) + 17475) ^ ((c12 + i10) ^ ((c12 << 4) + 38465))));
                                    i10 -= 40503;
                                }
                                int i12 = Ab.f13197E;
                                cArr[i12] = cArr2[0];
                                cArr[i12 + 1] = cArr2[1];
                                Ab.f13197E = i12 + 2;
                            } else {
                                str = new String(cArr, 0, iIndexOf);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str.intern();
        }
    }

    @Override // Va.N8
    public final boolean l(int i5) {
        switch (this.k) {
            case 0:
                if (i5 >= 0) {
                    int i10 = f13600n + 21;
                    f13599m = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = 43 / 0;
                    }
                    return true;
                }
                int i12 = f13599m + 95;
                f13600n = i12 % 128;
                if (i12 % 2 != 0) {
                    return false;
                }
                throw null;
            case 1:
                int i13 = f13602p;
                int i14 = (i13 + 13) % 128;
                f13603q = i14;
                if (i5 >= 0) {
                    f13603q = (i13 + 39) % 128;
                    return false;
                }
                int i15 = (i14 + 27) % 128;
                f13602p = i15;
                f13603q = (i15 + 11) % 128;
                return true;
            case 2:
                int i16 = (f13605s + 15) % 128;
                if (i5 <= 0) {
                    return false;
                }
                int i17 = i16 + 45;
                f13605s = i17 % 128;
                if (i17 % 2 == 0) {
                    return true;
                }
                throw null;
            default:
                return i5 <= 0;
        }
    }
}
