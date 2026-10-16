package Va;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: Va.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1206y extends Ba {

    /* renamed from: g, reason: collision with root package name */
    public static int f14784g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14785h = 1;

    /* renamed from: j, reason: collision with root package name */
    public static int f14787j = 0;
    public static int k = 1;

    /* renamed from: m, reason: collision with root package name */
    public static int f14789m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f14790n = 1;

    /* renamed from: p, reason: collision with root package name */
    public static int f14792p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f14793q = 1;

    /* renamed from: s, reason: collision with root package name */
    public static int f14795s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f14796t = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14797c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14798d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14799e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f14783f = {'m', 'e', 'd', 'i', 'a', 't', 'o', 'n', '.', 'C', 'u', 's', 'R', 'v', 'p', 'q'};

    /* renamed from: i, reason: collision with root package name */
    public static final char[] f14786i = {'C', 'o', 'n', 'e', 'c', 't', 'r', 'M', 'a', 'g', 'I', 'i', 'l', 'z', ' ', 'E'};

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f14788l = {'L', 153, 148, 141, 146, 140, 141, 158, 152, 145, 134, 134, 154, 159, 152, 149, 149, 151, 142, 136, 151, 160, 155, 146, 144, 130, 138, 231, 199, 240, 262, 262, 260, 257, 261, 256, 261, 266, 265, 259, 219, 227, 261, 259, 267, 268, 258, 219, 221, 260, 225, 228, 270, 268, 225, 220, 254, 263, 265, 257, 254, 254, 261, 227, 228, 267, 259, 263, 263, 220, 222, 255, 262, 268, 251, 'y', 236, '?', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'a', 'a', 'r', 'l', 'e'};

    /* renamed from: o, reason: collision with root package name */
    public static final char[] f14791o = {'e', 'v', 'n', 't', 's', 'd', 'r', '.', 'o', 'A', 'p', 'E', ':', 'f', 'g', 'h'};

    /* renamed from: r, reason: collision with root package name */
    public static final char[] f14794r = {' ', 'F', 'G', 'K', 'f', 'v', 'n', 'j', 'f', 'k', 'c', 'Z', '&', '8', '*', '*', 'N', 'u', 'm', 'm', 'n', 'j', 'p', 'M', 'N', 'p', 'p', 'M', 'N', 'Q', 'N', 'k', 'V', '<', 'M', 'h', 's', 'u', 'n', 'j', 'i', 'r', 'r', 'o', 'o', 'H', 'N', 'u', 'r', 'K', 'M', 'r', 'H', '9', 'K', 'O', '=', 'P', 'z', 'r', 'n', 'j', 'o', 'g', '^', 'V', 'N'};

    public /* synthetic */ C1206y(int i5) {
        this.f14797c = i5;
    }

    public static String d(String str, int[] iArr) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14794r, i5, cArr, 0, i10);
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
                str2 = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    private final void e() {
        Iterator it = ((ArrayList) this.f14798d).iterator();
        while (it.hasNext()) {
            Gb gb = (Gb) it.next();
            JSONObject jSONObject = (JSONObject) this.f14799e;
            Context contextF = Kb.f((Kb) gb.f13390a.f13389h);
            String str = AbstractC1141sa.L;
            int i5 = AbstractC1193wa.f14739a;
            Intent intentPutExtra = new Intent(str).putExtra(AbstractC1141sa.f14599T, jSONObject.toString());
            Xa xaA = Xa.a(contextF);
            xaA.getClass();
            String strIntern = Xa.i("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000", new int[]{0, 21, 75, 20}, false).intern();
            if (xaA.f13857b) {
                synchronized (((HashMap) xaA.f13858c)) {
                    try {
                        intentPutExtra.getAction();
                        String strResolveTypeIfNeeded = intentPutExtra.resolveTypeIfNeeded(((Context) xaA.f13859d).getContentResolver());
                        intentPutExtra.getData();
                        String scheme = intentPutExtra.getScheme();
                        intentPutExtra.getCategories();
                        boolean z2 = (intentPutExtra.getFlags() & 8) != 0;
                        if (z2) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(Xa.i("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{21, 15, 141, 12}, false).intern());
                            sb2.append(strResolveTypeIfNeeded);
                            sb2.append(Xa.h(View.resolveSizeAndState(0, 0, 0), "⠹⠙\udc66ᾊも뗋輤ꓰ뜄챕൰\ue842").intern());
                            sb2.append(scheme);
                            sb2.append(Xa.i("\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{36, 11, 0, 11}, true).intern());
                            sb2.append(intentPutExtra);
                            Log.v(strIntern, sb2.toString());
                        }
                        ArrayList arrayList = (ArrayList) ((HashMap) xaA.f13860e).get(intentPutExtra.getAction());
                        if (arrayList != null) {
                            if (z2) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(Xa.h(ViewConfiguration.getJumpTapTimeout() >> 16, "ꅉꄈ\u2d69\u13ffⶠ䓔ٞ嗬묣쀷ၓ\uf52d\uefd0ﱩ\ue2ef鳣圁").intern());
                                sb3.append(arrayList);
                                Log.v(strIntern, sb3.toString());
                            }
                            if (arrayList.size() > 0) {
                                if (arrayList.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                if (!z2) {
                                    throw null;
                                }
                                Xa.i("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", new int[]{47, 24, 0, 20}, false).intern();
                                throw null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private final void f() {
        String str;
        Ra raO = C0935cb.o((C0935cb) this.f14799e);
        C0935cb c0935cb = (C0935cb) this.f14799e;
        int deadChar = KeyEvent.getDeadChar(0, 0) + 1;
        char[] charArray = "긺긐턃Ძ꜡".toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-7209418036763202519L, charArray, deadChar);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i5 = AbstractC1104pb.f14483C;
                    if (i5 < cArrZ.length) {
                        cArrZ[i5] = (char) ((cArrZ[i5] ^ cArrZ[i5 % 4]) ^ ((i5 - 4) * (-7209418036763202519L)));
                        AbstractC1104pb.f14483C = i5 + 1;
                    } else {
                        str = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int iE = raO.e(C0935cb.u(c0935cb, str.intern()));
        Ka ka2 = new Ka();
        ka2.f13485d = this;
        ka2.f13484c = iE;
        Cb.g(ka2);
    }

    private final void g() {
        String str;
        f14792p = (f14793q + 111) % 128;
        V vJ = Kb.j((Kb) ((Ga) ((Ra) this.f14799e).f13665a).f13389h);
        char c10 = (byte) (122 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)));
        int iRed = Color.red(0);
        int i5 = 23 - iRed;
        char[] charArray = "\u0001\u0002\u0001\u0003\u0000\u0007\u0001\u0003\u0004\u0001\u0007\u0004\n\u0000\n\u000b\u000b\b\u0002\u0001\u0003\u0000´".toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14791o;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5 = 22 - iRed;
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
                            int i12 = c11 / 4;
                            int i13 = c11 % 4;
                            int i14 = c12 / 4;
                            int i15 = c12 % 4;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 3) % 4) * 4) + i13];
                                cArr2[i11] = cArr[(((i14 + 3) % 4) * 4) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 4) + ((i13 + 3) % 4)];
                                cArr2[i11] = cArr[(i14 * 4) + ((i15 + 3) % 4)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 4) + i15];
                                cArr2[i11] = cArr[(i14 * 4) + i13];
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
        vJ.y(str.intern(), Collections.singletonList((String) this.f14798d));
        int i16 = f14792p + 23;
        f14793q = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static String h(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f14786i;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 4;
                            int i13 = c10 % 4;
                            int i14 = c11 / 4;
                            int i15 = c11 % 4;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 3) % 4) * 4) + i13];
                                cArr2[i11] = cArr[(((i14 + 3) % 4) * 4) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 4) + ((i13 + 3) % 4)];
                                cArr2[i11] = cArr[(i14 * 4) + ((i15 + 3) % 4)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 4) + i15];
                                cArr2[i11] = cArr[(i14 * 4) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String i(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14788l, i5, cArr, 0, i10);
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

    /* JADX WARN: Code restructure failed: missing block: B:99:0x035d, code lost:
    
        if (Va.AbstractC1117qb.e(r0, r7) != false) goto L100;
     */
    @Override // Va.Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1206y.c():void");
    }

    public /* synthetic */ C1206y(int i5, Object obj, Object obj2) {
        this.f14797c = i5;
        this.f14799e = obj;
        this.f14798d = obj2;
    }
}
