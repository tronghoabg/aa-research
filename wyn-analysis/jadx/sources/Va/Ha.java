package Va;

import android.content.Context;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class Ha {

    /* renamed from: a, reason: collision with root package name */
    public final Ra f13417a;

    /* renamed from: b, reason: collision with root package name */
    public final C1218z f13418b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13419c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13420d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f13414f = {145, 290, 280, 273, 275, 274, 272, 273, 278, 251, 251, 287, 257, 248, 274, 247, 255, 282, 280, 285, 288, 283, 275, 274, '1', 'c', 'L', '0', 'P', 'l', 'k', 'j', 'd', 'l', 'P', 'G', 'f', 'l', 'n', 'o', 'q', 'W', 'u', 252, 236, 238, 238, 229, 255, 232, 244, 276, 265, 257, 254, 254, 263, 270, 276, 244, 232, 255, 263, 270, 264, 249, 257, 268, 246, 252, 249, 241, 249, 254, 267, 266, 259, 226, 199, 195, 197, 218, 249, 263, 235, 200, 232, 266, 248, 249, 238, 221, 219, 242, 241, 214, 238, 233, 210, 233, 262, 237, 235, 259, 261, 272, 271, 269, 237, 203, 234, 232};

    /* renamed from: e, reason: collision with root package name */
    public static final String f13413e = d("\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{42, 70, 155, 37}, false).intern();

    /* renamed from: g, reason: collision with root package name */
    public static int f13415g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13416h = (f13415g + 119) % 128;

    public Ha(Context context, C1218z c1218z, String str) {
        this.f13417a = new Ra(context, d("\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000", new int[]{0, 24, 175, 0}, false).intern(), d("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", new int[]{24, 17, 0, 0}, true).intern());
        this.f13418b = c1218z;
        this.f13419c = str;
        G gS = G.S();
        C1014j c1014j = new C1014j(3);
        c1014j.f14305b = this;
        gS.Z(c1014j);
    }

    public static /* synthetic */ C1218z a(Ha ha) {
        int i5 = f13415g + 5;
        int i10 = i5 % 128;
        f13416h = i10;
        int i11 = i5 % 2;
        C1218z c1218z = ha.f13418b;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i10 + 15;
        f13415g = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 57 / 0;
        }
        return c1218z;
    }

    public static String d(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13414f, i5, cArr, 0, i10);
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
                if (z2) {
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
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008b, code lost:
    
        if (r13.f13417a.m(r11) == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Va.Pa r14, Va.InterfaceC1217ya r15) {
        /*
            r13 = this;
            java.lang.String r0 = r14.c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            monitor-enter(r13)
            int r2 = Va.Ha.f13416h     // Catch: java.lang.Throwable -> La6
            java.lang.String r3 = r13.f13419c     // Catch: java.lang.Throwable -> La6
            int r2 = r2 + 17
            r4 = 128(0x80, float:1.8E-43)
            int r2 = r2 % r4
            Va.Ha.f13415g = r2     // Catch: java.lang.Throwable -> La6
            monitor-exit(r13)
            r1.append(r3)
            java.lang.String r2 = "\u0001"
            r3 = 41
            r5 = 1
            r6 = 0
            int[] r3 = new int[]{r3, r5, r4, r6}
            java.lang.String r2 = d(r2, r3, r5)
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            java.lang.String r11 = r14.d()
            Va.G r0 = Va.G.S()
            r0.getClass()
            int r1 = Va.G.f13355F
            int r1 = r1 + 117
            int r1 = r1 % r4
            Va.G.f13354E = r1
            org.json.JSONObject r0 = r0.e()
            int r1 = android.graphics.Color.red(r6)
            int r1 = 3 - r1
            java.lang.String r2 = "浱᫋苆깯"
            java.lang.String r1 = Va.G.T(r1, r2)
            java.lang.String r1 = r1.intern()
            boolean r0 = r0.optBoolean(r1, r5)
            int r1 = Va.G.f13354E
            int r1 = r1 + 101
            int r2 = r1 % 128
            Va.G.f13355F = r2
            int r1 = r1 % 2
            if (r1 == 0) goto La3
            if (r0 == 0) goto L8e
            int r0 = Va.Ha.f13416h
            int r0 = r0 + 63
            int r0 = r0 % r4
            Va.Ha.f13415g = r0
            Va.G r0 = Va.G.S()
            boolean r0 = r0.R()
            if (r0 != 0) goto L90
            int r0 = Va.Ha.f13416h
            int r0 = r0 + 49
            int r0 = r0 % r4
            Va.Ha.f13415g = r0
            Va.Ra r0 = r13.f13417a
            java.lang.String r0 = r0.m(r11)
            if (r0 != 0) goto L8e
            goto L90
        L8e:
            r8 = r13
            goto La2
        L90:
            Va.Ga r7 = new Va.Ga
            r8 = r13
            r10 = r14
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            Va.AbstractC1104pb.I(r7)
            int r14 = Va.Ha.f13415g
            int r14 = r14 + 15
            int r14 = r14 % r4
            Va.Ha.f13416h = r14
        La2:
            return
        La3:
            r8 = r13
            r14 = 0
            throw r14
        La6:
            r0 = move-exception
            r8 = r13
        La8:
            r14 = r0
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lab
            throw r14
        Lab:
            r0 = move-exception
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ha.b(Va.Pa, Va.ya):void");
    }

    public final String c(Pa pa2, InterfaceC1217ya interfaceC1217ya) {
        boolean z2;
        pa2.getClass();
        int i5 = Pa.f13606f + 119;
        Pa.f13607g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (TextUtils.isEmpty(pa2.f13608a) || TextUtils.isEmpty(pa2.g())) {
            return null;
        }
        String strD = pa2.d();
        synchronized (this) {
            try {
                if (G.S().O()) {
                    z2 = true;
                } else {
                    ArrayList arrayList = this.f13420d;
                    Da da2 = new Da(18);
                    da2.f13291f = this;
                    da2.f13289d = pa2;
                    da2.f13290e = interfaceC1217ya;
                    arrayList.add(da2);
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            b(pa2, interfaceC1217ya);
        }
        return this.f13417a.m(strD);
    }
}
