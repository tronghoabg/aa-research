package Va;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1014j implements X {

    /* renamed from: d, reason: collision with root package name */
    public static int f14301d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f14302e = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14304a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14305b;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f14300c = {'T', 8300, 16487, 24682, 32871, 41069, 49279, 57422, 'X', 8318, 16459, 24665, 32863, 41001, 49204, 57380, '>', 8252, 16416, 24634, 32790, 7096, 15242, 23429, 31645, 39835, 48068, 56202, 64432, 7157, 15287, 23466, 31678, 39861, 48085, 56277, 64465, 7053, 15323, 23490, 31696, 39919, 48113, 56289, 64430, 7153, 15337, 23314, 31519, 39682, 47896, 56074, 64267, 6957};

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f14303f = {'!', 'Y', 'n', 'n', 'i', 'd', 'k', 'q', 'p', '_', 'W', 'g', 'g', 'd', 'f', 'k', '2', 'o', 'q', 'j', 'f', 'e', 'n', 'n', 'k', 'k', 'D', 'C', 'j', 'k', 'j', 'g', 'a', 'j', 'n', 'V', '[', 'r', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A', 'B'};

    public /* synthetic */ C1014j(int i5) {
        this.f14304a = i5;
    }

    public static String b(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14300c[i5 + i11] ^ (i11 * 5191029071050645509L)) ^ c10);
                        Ab.f13217t = i11 + 1;
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

    public static String c(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f14303f, i5, cArr, 0, i10);
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

    @Override // Va.X
    public final void a() throws JSONException {
        ArrayList arrayList;
        switch (this.f14304a) {
            case 0:
                D dL = G.S().L();
                dL.getClass();
                D.f13268j = (D.f13267i + 39) % 128;
                long jOptLong = dL.e().optLong(D.u((char) (7709 - (ViewConfiguration.getTapTimeout() >> 16)), "\ue3ed禭ᶰﴞ", "娺뺤ࣉ", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1334202910).intern(), 0L);
                D.f13267i = (D.f13268j + 15) % 128;
                C1027k c1027k = (C1027k) this.f14305b;
                if (jOptLong == 0) {
                    f14301d = (f14302e + 19) % 128;
                    C1027k.a(c1027k, Boolean.FALSE);
                    jOptLong = dL.t();
                    Ab.a0(b(ViewConfiguration.getLongPressTimeout() >> 16, (ViewConfiguration.getPressedStateDuration() >> 16) + 21, (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), b(TextUtils.getOffsetAfter("", 0) + 21, TextUtils.indexOf((CharSequence) "", '0') + 34, (char) ((Process.myTid() >> 22) + 7165)).intern(), null, false);
                } else {
                    C1027k.a(c1027k, Boolean.TRUE);
                }
                D.f13268j = (D.f13267i + 23) % 128;
                long jOptLong2 = dL.e().optLong(D.u((char) (29501 - Gravity.getAbsoluteGravity(0, 0)), "勬䄜㶉ၳ", "㿹룈", ViewConfiguration.getPressedStateDuration() >> 16).intern(), 0L);
                int i5 = D.f13267i + 89;
                D.f13268j = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 99 / 0;
                }
                int i11 = (C1027k.f14334i + 33) % 128;
                C1027k.f14333h = i11;
                c1027k.f14336b = jOptLong2;
                C1027k.f14334i = (i11 + 47) % 128;
                long jT = dL.t();
                int i12 = (C1027k.f14333h + 31) % 128;
                C1027k.f14334i = i12;
                c1027k.f14337c = jT;
                int i13 = i12 + 113;
                C1027k.f14333h = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                int i14 = i12 + 51;
                C1027k.f14333h = i14 % 128;
                if (i14 % 2 != 0) {
                    throw null;
                }
                c1027k.f14338d = jOptLong - c1027k.f14336b;
                int i15 = i12 + 97;
                C1027k.f14333h = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                int i16 = i12 + 1;
                C1027k.f14333h = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                int i17 = (i12 + 45) % 128;
                C1027k.f14333h = i17;
                c1027k.f14339e = jOptLong - jT;
                C1027k.f14334i = (i17 + 51) % 128;
                int i18 = f14301d + 5;
                f14302e = i18 % 128;
                if (i18 % 2 == 0) {
                    throw null;
                }
                return;
            case 1:
                Da da2 = (Da) this.f14305b;
                HashMap mapX = G.S().X();
                V v2 = (V) da2.f13291f;
                V.v(v2, mapX);
                Ab.a(c("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{0, 16, 0, 0}, false).intern(), c("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{16, 32, 0, 20}, true).intern());
                V.f13769p = (V.f13770q + 81) % 128;
                v2.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = v2.e().iterator();
                V.f13769p = (V.f13770q + 103) % 128;
                while (it.hasNext()) {
                    B7 b72 = (B7) it.next();
                    if (v2.F(b72.j())) {
                        int i19 = V.f13769p + 3;
                        V.f13770q = i19 % 128;
                        if (i19 % 2 == 0) {
                            arrayList2.add(b72);
                            int i20 = 36 / 0;
                        } else {
                            arrayList2.add(b72);
                        }
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    B7 b73 = (B7) it2.next();
                    String strIntern = V.B(3672 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "药贔鿬ꡇ먕쓼핒\ue722\uf1e6ɮఫỿ⽙㤠䮋呇").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(V.B((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20663, "荨폲∱煨솒დ朏뙃۳啣").intern());
                    sb2.append(b73.o());
                    sb2.append(V.l("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", new int[]{51, 10, 0, 0}).intern());
                    Ab.Y(strIntern, sb2.toString());
                    String strJ = b73.j();
                    v2.s(strJ, (JSONObject) v2.f().get(strJ));
                    S s10 = new S(0);
                    s10.f13671d = b73;
                    Cb.e(s10);
                    ((ArrayList) v2.k()).remove(b73);
                }
                int i21 = (V.f13770q + 35) % 128;
                V.f13769p = i21;
                int i22 = i21 + 97;
                V.f13770q = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
                return;
            case 2:
                int i23 = C1194x.f14742s + 17;
                C1194x.f14741r = i23 % 128;
                int i24 = i23 % 2;
                ((C1194x) this.f14305b).p();
                int i25 = C1194x.f14741r + 23;
                C1194x.f14742s = i25 % 128;
                if (i25 % 2 == 0) {
                    int i26 = 98 / 0;
                    return;
                }
                return;
            case 3:
                synchronized (this) {
                    Ha ha = (Ha) this.f14305b;
                    int i27 = Ha.f13416h + 67;
                    Ha.f13415g = i27 % 128;
                    if (i27 % 2 != 0) {
                        ArrayList arrayList3 = ha.f13420d;
                        throw null;
                    }
                    arrayList = new ArrayList(ha.f13420d);
                    Ha ha2 = (Ha) this.f14305b;
                    int i28 = Ha.f13416h + 67;
                    Ha.f13415g = i28 % 128;
                    if (i28 % 2 != 0) {
                        ArrayList arrayList4 = ha2.f13420d;
                        throw null;
                    }
                    ha2.f13420d.clear();
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((Runnable) it3.next()).run();
                }
                return;
            default:
                G gS = G.S();
                Kb kb2 = (Kb) ((Ga) this.f14305b).f13389h;
                int i29 = Kb.f13490x;
                Kb.f13489w = (i29 + 91) % 128;
                Ha ha3 = kb2.f13505p;
                Kb.f13489w = (i29 + 95) % 128;
                gS.getClass();
                int i30 = G.f13354E + 41;
                G.f13355F = i30 % 128;
                if (i30 % 2 != 0) {
                    ((W) gS.f13539b).e(ha3);
                    return;
                } else {
                    ((W) gS.f13539b).e(ha3);
                    throw null;
                }
        }
    }
}
