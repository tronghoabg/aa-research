package Va;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes4.dex */
public final class R8 extends N8 {
    public static final char[] k = {'-'};

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f13652l = {'*'};

    /* renamed from: m, reason: collision with root package name */
    public static int f13653m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f13654n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static int f13655o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f13656p = 1;

    /* renamed from: q, reason: collision with root package name */
    public static int f13657q = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f13658j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, int i5) {
        super(abstractC1215y8, abstractC1215y82, 1);
        this.f13658j = i5;
    }

    public static String m(int i5) {
        String str;
        char[] charArray = "烙".toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-1491163008681807620L));
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    private final String n() {
        String str;
        f13655o = (f13656p + 125) % 128;
        int iIndexOf = TextUtils.indexOf("", "") + 1;
        char[] charArray = "ﾀﾯ燚ᓕﱮ".toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-5454280642948135403L, charArray, iIndexOf);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i5 = AbstractC1104pb.f14483C;
                    if (i5 < cArrZ.length) {
                        cArrZ[i5] = (char) ((cArrZ[i5] ^ cArrZ[i5 % 4]) ^ ((i5 - 4) * (-5454280642948135403L)));
                        AbstractC1104pb.f14483C = i5 + 1;
                    } else {
                        str = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        f13656p = (f13655o + 55) % 128;
        return strIntern;
    }

    private final String o() {
        String str;
        f13653m = (f13654n + 7) % 128;
        int tapTimeout = ViewConfiguration.getTapTimeout() >> 16;
        int i5 = 1 - tapTimeout;
        char c10 = (byte) (80 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
        char[] charArray = "y".toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13652l;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5 = 0 - tapTimeout;
                    cArr2[i5] = (char) (charArray[i5] - c10);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c11 = charArray[i10];
                        int i11 = i10 + 1;
                        char c12 = charArray[i11];
                        if (c11 == c12) {
                            cArr2[i10] = (char) (c11 - c10);
                            cArr2[i11] = (char) (c12 - c10);
                        } else {
                            int i12 = c11 % 1;
                            int i13 = c12 % 1;
                            if (i12 == i13) {
                                cArr2[i10] = cArr[(c11 % 1) + i12];
                                cArr2[i11] = cArr[(c12 % 1) + i13];
                            } else if (c11 == c12) {
                                cArr2[i10] = cArr[c11 + (i12 % 1)];
                                cArr2[i11] = cArr[c12 + (i13 % 1)];
                            } else {
                                cArr2[i10] = cArr[c11 + i13];
                                cArr2[i11] = cArr[c12 + i12];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        f13654n = (f13653m + 123) % 128;
        return strIntern;
    }

    @Override // Va.F8
    public final String h() {
        String str;
        switch (this.f13658j) {
            case 0:
                int iRed = Color.red(0);
                int i5 = 1 - iRed;
                char cResolveSizeAndState = (byte) (101 - View.resolveSizeAndState(0, 0, 0));
                char[] charArray = "\u0092".toCharArray();
                synchronized (Ab.f13194B) {
                    try {
                        char[] cArr = k;
                        char[] cArr2 = new char[i5];
                        if (i5 % 2 != 0) {
                            i5 = 0 - iRed;
                            cArr2[i5] = (char) (charArray[i5] - cResolveSizeAndState);
                        }
                        if (i5 > 1) {
                            Ab.f13193A = 0;
                            while (true) {
                                int i10 = Ab.f13193A;
                                if (i10 < i5) {
                                    char c10 = charArray[i10];
                                    int i11 = i10 + 1;
                                    char c11 = charArray[i11];
                                    if (c10 == c11) {
                                        cArr2[i10] = (char) (c10 - cResolveSizeAndState);
                                        cArr2[i11] = (char) (c11 - cResolveSizeAndState);
                                    } else {
                                        int i12 = c10 % 1;
                                        int i13 = c11 % 1;
                                        if (i12 == i13) {
                                            cArr2[i10] = cArr[(c10 % 1) + i12];
                                            cArr2[i11] = cArr[(c11 % 1) + i13];
                                        } else if (c10 == c11) {
                                            cArr2[i10] = cArr[c10 + (i12 % 1)];
                                            cArr2[i11] = cArr[c11 + (i13 % 1)];
                                        } else {
                                            cArr2[i10] = cArr[c10 + i13];
                                            cArr2[i11] = cArr[c11 + i12];
                                        }
                                    }
                                    Ab.f13193A = i10 + 2;
                                }
                            }
                        }
                        str = new String(cArr2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str.intern();
            case 1:
                return o();
            case 2:
                return n();
            default:
                return m((f13657q + 95) % 2 != 0 ? 42209 / (ViewConfiguration.getKeyRepeatDelay() - 123) : 42209 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
    
        if ((r5 instanceof java.lang.Long) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
    
        if ((r5 instanceof java.lang.Long) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return java.lang.Integer.valueOf(r5.intValue() * r4.intValue());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    @Override // Va.N8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number i(java.lang.Number r4, java.lang.Number r5) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.R8.i(java.lang.Number, java.lang.Number):java.lang.Number");
    }
}
