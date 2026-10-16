package Va;

import E5.C0441b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class E7 extends AbstractC1104pb {

    /* renamed from: M, reason: collision with root package name */
    public static int f13301M = 0;

    /* renamed from: N, reason: collision with root package name */
    public static int f13302N = 1;

    /* renamed from: P, reason: collision with root package name */
    public static int f13304P = 0;

    /* renamed from: Q, reason: collision with root package name */
    public static int f13305Q = 1;

    /* renamed from: R, reason: collision with root package name */
    public static int f13306R = 0;

    /* renamed from: S, reason: collision with root package name */
    public static int f13307S = 1;

    /* renamed from: T, reason: collision with root package name */
    public static int f13308T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13309U = 1;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ int f13310K;
    public static final char[] L = {'6', 'F', 'C', 'j', 'k', 'k', 'n', 'q', 's', 'I', 'I', 'p', 'p', 'r', '[', '\\', 's', 'n', 'j', 'F', 'G', 'n', 'G', 'D', 'e', 'b', 'S', '[', 'p', 'j', 'J', 'O', 'h', 'x', 263, 286, 284, 284, 245, 245, 287, 285, 282, 279, 279, 278, 239, 239, 275, 278, 284, 280, 279, 245, 243, 282, 243, 242, 278, 282, 287};

    /* renamed from: O, reason: collision with root package name */
    public static final char[] f13303O = {'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15181, 33593, 52192, 5069, 23456, 42058, 60442, 13538, 31914, 50331, 3398, 21806, 40446, 58815, 11893, 30291, 48645, 1733, 20135, 39763, 54097, 2830, 17382, 48048, 62015, 10827, 25111, 56027, 4778, 18800, 33080, 63748, 12736, 27088, 41051, 6191, 20726, 35035, 49334, 16220, 30491, 45047, 59296, 24461, 38483, 52792, 1768, 32425, 46435, 60741, 9491, 40403, 54705, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15190, 33589, 52193, 5075, 23438, 42100, 60469, 13551, 31930, 50333, 3423, 21805, 40441, 58757, 11887, 30288, 48644, 1772, 20156, 38777, 57163, 10001, 28615, 47035, 'a', 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15190, 33589, 52193, 5075, 23438, 42100, 60469, 13551, 31930, 50333, 3423, 21805, 40441, 58767, 11886, 30299, 48667, 1740, 20144, 38782, 57174, 10011, 28615, 46994, 'z', 18491, 36873, 55511, 8329, 27001, 45347, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15188, 33598, 52169, 5083, 23446, 42059, 60460, 13562, 31872, 50320, 3404, 21772, 40432, 58793, 11853, 30303, 48664, 1748, 20144, 38756, 57178, 9990, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15193, 33570, 52202, 5083, 23435, 42055, 60472, 13565, 31927, 50346, 3400, 21761, 40434, 58789, 11895, 30291, 48665};

    public /* synthetic */ E7(int i5) {
        this.f13310K = i5;
    }

    public static double A0() {
        int i5 = f13307S + 99;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return G.S().N();
        }
        G.S().N();
        throw null;
    }

    public static void B0(ArrayList arrayList) {
        C1091ob c1091ob;
        C1078nb c1078nb;
        int i5 = f13304P + 117;
        f13305Q = i5 % 128;
        if (i5 % 2 == 0) {
            c1091ob = (C1091ob) AbstractC1104pb.U(arrayList, 1, C1091ob.class);
            c1091ob.getClass();
            c1078nb = new C1078nb(c1091ob);
        } else {
            c1091ob = (C1091ob) AbstractC1104pb.U(arrayList, 0, C1091ob.class);
            c1091ob.getClass();
            c1078nb = new C1078nb(c1091ob);
        }
        c1091ob.f14465b.x(c1078nb);
    }

    public static Object B1(C1203x8 c1203x8, C1214y7 c1214y7, ArrayList arrayList) {
        C1077na c1077naU1 = u1(c1214y7, arrayList, c1203x8);
        if (c1077naU1 != null) {
            return c1077naU1.s0();
        }
        return null;
    }

    public static Object C0(ArrayList arrayList) {
        H9 h92 = (H9) AbstractC1104pb.U(arrayList, 0, H9.class);
        if (h92 != null) {
            f13305Q = (f13304P + 59) % 128;
            return h92.d();
        }
        int i5 = f13304P + 91;
        f13305Q = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 75 / 0;
        }
        return null;
    }

    public static Object C1(ArrayList arrayList) {
        f13306R = (f13307S + 77) % 128;
        String str = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        C cK = G.S().K();
        cK.getClass();
        int i5 = C.f13246g + 47;
        C.f13247h = i5 % 128;
        Object objOpt = null;
        if (i5 % 2 == 0) {
            cK.C();
            throw null;
        }
        JSONObject jSONObjectC = cK.C();
        if (jSONObjectC == null) {
            int i10 = C.f13247h + 39;
            C.f13246g = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } else {
            objOpt = jSONObjectC.opt(str);
        }
        f13306R = (f13307S + 71) % 128;
        return objOpt;
    }

    public static HashMap D0() {
        int i5 = f13306R + 123;
        f13307S = i5 % 128;
        if (i5 % 2 != 0) {
            return G.S().A();
        }
        G.S().A();
        throw null;
    }

    public static ArrayList D1(ArrayList arrayList) {
        Object objU;
        Class<?> cls;
        C0960ea c0960ea;
        int size = arrayList.size();
        if (size == 2) {
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
                objU = null;
            } else {
                Object objU2 = AbstractC1104pb.U(arrayList, 0, Object.class);
                if (objU2 != null) {
                    objU = objU2;
                    cls = objU2.getClass();
                } else {
                    objU = objU2;
                    cls = null;
                }
            }
            c0960ea = (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class);
        } else if (size != 3) {
            c0960ea = null;
            cls = null;
            objU = null;
        } else if (arrayList.get(0) instanceof Class) {
            cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
            if (arrayList.get(1) instanceof C0960ea) {
                c0960ea = (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class);
                objU = null;
            } else {
                objU = AbstractC1104pb.U(arrayList, 1, Object.class);
                c0960ea = (C0960ea) AbstractC1104pb.U(arrayList, 2, C0960ea.class);
            }
        } else {
            objU = AbstractC1104pb.U(arrayList, 0, Object.class);
            cls = objU.getClass();
            c0960ea = (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class);
        }
        C0999ha.j().getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            C0921ba c0921ba = (C0921ba) C0999ha.j().f14263a;
            ArrayList arrayList3 = new ArrayList();
            c0921ba.h(cls, c0960ea, arrayList3);
            Iterator it = arrayList3.iterator();
            C1051la.f14366c = (C1051la.f14367d + 89) % 128;
            while (it.hasNext()) {
                int i5 = C1051la.f14367d + 29;
                C1051la.f14366c = i5 % 128;
                if (i5 % 2 != 0) {
                    arrayList2.add(((Field) it.next()).get(objU));
                    throw null;
                }
                arrayList2.add(((Field) it.next()).get(objU));
            }
        } catch (Throwable unused) {
            String strIntern = C1051la.m(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1051la.d("\uffc1\b\u0006\u0015\u0015\n\u000f\b\uffc1￦\u0013\u0013\u0010\u0013", (-16777202) - Color.rgb(0, 0, 0), 194 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 9 - TextUtils.indexOf("", "", 0, 0), false).intern());
            sb2.append(c0960ea.f14140O);
            sb2.append(C1051la.m(127 - Drawable.resolveOpacity(0, 0), "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(C1051la.m(TextUtils.getOffsetBefore("", 0) + 127, "\u0094\u0094\u0093\u0092\u0085\u008c").intern());
            Ab.x(strIntern, sb2.toString());
        }
        return arrayList2;
    }

    public static boolean E0() {
        int i5 = f13307S + 53;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return G.S().f0();
        }
        G.S().f0();
        throw null;
    }

    public static JSONObject E1() throws JSONException {
        JSONObject jSONObjectW;
        int i5 = f13306R + 103;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            C1154ta c1154taR0 = r0();
            jSONObjectW = Ab.W(c1154taR0.f14648a, c1154taR0.f14649b, c1154taR0.f14650c, c1154taR0.f14651d);
            int i10 = 79 / 0;
        } else {
            C1154ta c1154taR02 = r0();
            jSONObjectW = Ab.W(c1154taR02.f14648a, c1154taR02.f14649b, c1154taR02.f14650c, c1154taR02.f14651d);
        }
        f13306R = (f13307S + 121) % 128;
        return jSONObjectW;
    }

    public static boolean F0(ArrayList arrayList) {
        int i5 = f13305Q + 107;
        f13304P = i5 % 128;
        int i10 = i5 % 2;
        return AbstractC0897a.F(AbstractC1104pb.U(arrayList, 0, Object.class));
    }

    public static JSONObject F1(C1214y7 c1214y7) throws JSONException {
        int i5 = f13306R + 99;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            c1214y7.a();
            throw null;
        }
        JSONObject jSONObjectA = c1214y7.a();
        f13306R = (f13307S + 13) % 128;
        return jSONObjectA;
    }

    public static S7 G0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        C1214y7 c1214y72;
        try {
            c1214y72 = c1214y7;
        } catch (Exception e7) {
            e = e7;
            c1214y72 = c1214y7;
        }
        try {
            S7 s72 = new S7(c1214y72, (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class), c1203x8, AbstractC1104pb.G(1, arrayList), G1(arrayList, 2));
            f13304P = (f13305Q + 75) % 128;
            return s72;
        } catch (Exception e10) {
            e = e10;
            AbstractC0897a.f(c1214y72.f(), K1((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 153, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern(), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        Va.E7.f13305Q = (Va.E7.f13304P + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if ((!r4) != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G1(java.util.ArrayList r4, int r5) {
        /*
            int r0 = r4.size()
            r1 = 0
            if (r0 <= r5) goto L32
            int r0 = Va.E7.f13304P
            int r0 = r0 + 3
            int r2 = r0 % 128
            Va.E7.f13305Q = r2
            int r0 = r0 % 2
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 1
            java.lang.Object r4 = Va.AbstractC1104pb.U(r4, r5, r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r0 != 0) goto L27
            r5 = 12
            int r5 = r5 / r1
            r4 = r4 ^ r3
            if (r4 == r3) goto L32
            goto L29
        L27:
            if (r4 == 0) goto L32
        L29:
            int r4 = Va.E7.f13304P
            int r4 = r4 + 83
            int r4 = r4 % 128
            Va.E7.f13305Q = r4
            return r3
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.G1(java.util.ArrayList, int):boolean");
    }

    public static C0971f8 H0() {
        C0971f8 c0971f8 = new C0971f8();
        int i5 = f13306R + 95;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 36 / 0;
        }
        return c0971f8;
    }

    public static void H1(ArrayList arrayList) {
        f13305Q = (f13304P + 49) % 128;
        View view = (View) AbstractC1104pb.U(arrayList, 0, View.class);
        R9 r92 = (R9) AbstractC1104pb.U(arrayList, 1, R9.class);
        if (!G1(arrayList, 2)) {
            AbstractC1104pb.t(view, new I7(r92));
            f13305Q = (f13304P + 107) % 128;
        } else {
            f13304P = (f13305Q + 11) % 128;
            AbstractC1104pb.t(view, r92);
            f13304P = (f13305Q + 17) % 128;
        }
    }

    public static String I0(C1214y7 c1214y7) {
        f13306R = (f13307S + 73) % 128;
        String strB = c1214y7.h().b();
        f13307S = (f13306R + 105) % 128;
        return strB;
    }

    public static void J0(ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException {
        f13305Q = (f13304P + 9) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) AbstractC1104pb.U(arrayList, 0, MediaPlayer.class);
        P9 p92 = (P9) AbstractC1104pb.U(arrayList, 1, P9.class);
        if (!G1(arrayList, 2)) {
            AbstractC1104pb.l0(mediaPlayer, new P7(p92));
        } else {
            AbstractC1104pb.l0(mediaPlayer, p92);
            f13304P = (f13305Q + 27) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cd, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:28:0x00af, B:33:0x00cf, B:31:0x00c1), top: B:41:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:28:0x00af, B:33:0x00cf, B:31:0x00c1), top: B:41:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object J1(java.util.ArrayList r11) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.J1(java.util.ArrayList):java.lang.Object");
    }

    public static W7 K0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        C1214y7 c1214y72;
        try {
            c1214y72 = c1214y7;
        } catch (Exception e7) {
            e = e7;
            c1214y72 = c1214y7;
        }
        try {
            W7 w72 = new W7(c1214y72, (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class), c1203x8, AbstractC1104pb.G(1, arrayList), G1(arrayList, 2));
            f13304P = (f13305Q + 95) % 128;
            return w72;
        } catch (Exception e10) {
            e = e10;
            Exception exc = e;
            AbstractC0897a.f(c1214y72.f(), K1(TextUtils.lastIndexOf("", '0', 0) + 192, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), exc);
            return null;
        }
    }

    public static String K1(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13303O[i5 + i11] ^ (i11 * 8163304008932804661L)) ^ c10);
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

    public static C0906a8 L0() {
        C0906a8 c0906a8 = new C0906a8();
        int i5 = f13307S + 59;
        f13306R = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 65 / 0;
        }
        return c0906a8;
    }

    public static String L1(C1214y7 c1214y7) {
        f13307S = (f13306R + 117) % 128;
        String strG = c1214y7.u().g();
        int i5 = f13306R + 25;
        f13307S = i5 % 128;
        if (i5 % 2 != 0) {
            return strG;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        Va.AbstractC1104pb.K(r0, new Va.O7(r1));
        Va.E7.f13304P = (Va.E7.f13305Q + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (G1(r6, 5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (G1(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        Va.AbstractC1104pb.K(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M0(java.util.ArrayList r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            int r0 = Va.E7.f13304P
            int r0 = r0 + 85
            int r1 = r0 % 128
            Va.E7.f13305Q = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<Va.T9> r2 = Va.T9.class
            r3 = 1
            java.lang.Class<android.media.MediaPlayer> r4 = android.media.MediaPlayer.class
            r5 = 0
            if (r0 != 0) goto L26
            java.lang.Object r0 = Va.AbstractC1104pb.U(r6, r3, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r1 = Va.AbstractC1104pb.U(r6, r5, r2)
            Va.T9 r1 = (Va.T9) r1
            r2 = 5
            boolean r6 = G1(r6, r2)
            if (r6 == 0) goto L3d
            goto L39
        L26:
            java.lang.Object r0 = Va.AbstractC1104pb.U(r6, r5, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = Va.AbstractC1104pb.U(r6, r3, r2)
            Va.T9 r2 = (Va.T9) r2
            boolean r6 = G1(r6, r1)
            r1 = r2
            if (r6 == 0) goto L3d
        L39:
            Va.AbstractC1104pb.K(r0, r1)
            goto L4d
        L3d:
            Va.O7 r6 = new Va.O7
            r6.<init>(r1)
            Va.AbstractC1104pb.K(r0, r6)
            int r6 = Va.E7.f13305Q
            int r6 = r6 + 119
            int r6 = r6 % 128
            Va.E7.f13304P = r6
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.M0(java.util.ArrayList):void");
    }

    public static String M1(ArrayList arrayList) {
        int i5 = f13307S + 121;
        f13306R = i5 % 128;
        int i10 = i5 % 2;
        return ISAdQualityAdType.fromInt(((Integer) AbstractC1104pb.U(arrayList, 0, Integer.class)).intValue()).name().toLowerCase();
    }

    public static C0958e8 N0() {
        C0958e8 c0958e8 = new C0958e8();
        int i5 = f13307S + 5;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return c0958e8;
        }
        throw null;
    }

    public static /* synthetic */ ArrayList N1(List list, Object[] objArr) {
        int i5 = f13305Q + 65;
        f13304P = i5 % 128;
        if (i5 % 2 != 0) {
            g1(list, objArr);
            throw null;
        }
        ArrayList arrayListG1 = g1(list, objArr);
        f13305Q = (f13304P + 83) % 128;
        return arrayListG1;
    }

    public static List O1(C1214y7 c1214y7, ArrayList arrayList) {
        C1214y7 c1214y72;
        List list = (List) AbstractC1104pb.U(arrayList, 0, List.class);
        try {
            C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 1, C1126r8.class);
            List arrayList2 = new ArrayList();
            if (arrayList.size() <= 2) {
                c1214y72 = c1214y7;
            } else if (AbstractC1104pb.P(arrayList, 2, C1214y7.class)) {
                c1214y72 = (C1214y7) AbstractC1104pb.U(arrayList, 2, C1214y7.class);
                if (arrayList.size() > 3) {
                    int i5 = f13301M + 9;
                    f13302N = i5 % 128;
                    int i10 = i5 % 2;
                    arrayList2 = AbstractC1104pb.G(3, arrayList);
                }
            } else {
                arrayList2 = AbstractC1104pb.G(2, arrayList);
                c1214y72 = c1214y7;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                arrayList2.add(0, list.get(i11));
                if (c1126r8.c(c1214y72.e(), c1214y72, arrayList2).e()) {
                    int i12 = f13301M + 119;
                    f13302N = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList3.add(list.get(i11));
                        throw null;
                    }
                    arrayList3.add(list.get(i11));
                }
                arrayList2.remove(0);
            }
            return arrayList3;
        } catch (Exception e7) {
            AbstractC0897a.f(c1214y7.f(), d1("\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{33, 28, 172, 0}, false).intern(), e7);
            return list;
        }
    }

    public static String P0(C1214y7 c1214y7) {
        int i5 = f13306R + 43;
        f13307S = i5 % 128;
        int i10 = i5 % 2;
        String strJ = c1214y7.u().j();
        if (i10 == 0) {
            int i11 = 55 / 0;
        }
        return strJ;
    }

    public static void P1(ArrayList arrayList) {
        f13304P = (f13305Q + 59) % 128;
        InterfaceC1180va interfaceC1180va = (InterfaceC1180va) AbstractC1104pb.U(arrayList, 0, InterfaceC1180va.class);
        Xa xaG = Xa.g();
        xaG.getClass();
        Cb.j(new Ta(xaG, interfaceC1180va, 1));
        int i5 = f13304P + 63;
        f13305Q = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        Va.AbstractC1104pb.a0(r0, r1);
        Va.E7.f13304P = (Va.E7.f13305Q + 107) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (G1(r6, 4) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (G1(r6, 2) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        Va.AbstractC1104pb.a0(r0, new Va.V7(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void Q0(java.util.ArrayList r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            int r0 = Va.E7.f13305Q
            int r0 = r0 + 13
            int r1 = r0 % 128
            Va.E7.f13304P = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<Va.L9> r2 = Va.L9.class
            r3 = 1
            java.lang.Class<android.media.MediaPlayer> r4 = android.media.MediaPlayer.class
            r5 = 0
            if (r0 == 0) goto L26
            java.lang.Object r0 = Va.AbstractC1104pb.U(r6, r5, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r1 = Va.AbstractC1104pb.U(r6, r3, r2)
            Va.L9 r1 = (Va.L9) r1
            r2 = 4
            boolean r6 = G1(r6, r2)
            if (r6 == 0) goto L39
            goto L42
        L26:
            java.lang.Object r0 = Va.AbstractC1104pb.U(r6, r5, r4)
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r2 = Va.AbstractC1104pb.U(r6, r3, r2)
            Va.L9 r2 = (Va.L9) r2
            boolean r6 = G1(r6, r1)
            r1 = r2
            if (r6 != 0) goto L42
        L39:
            Va.V7 r6 = new Va.V7
            r6.<init>(r1)
            Va.AbstractC1104pb.a0(r0, r6)
            goto L4d
        L42:
            Va.AbstractC1104pb.a0(r0, r1)
            int r6 = Va.E7.f13305Q
            int r6 = r6 + 107
            int r6 = r6 % 128
            Va.E7.f13304P = r6
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.Q0(java.util.ArrayList):void");
    }

    public static void S0(ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException {
        f13304P = (f13305Q + 113) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) AbstractC1104pb.U(arrayList, 0, MediaPlayer.class);
        N9 n92 = (N9) AbstractC1104pb.U(arrayList, 1, N9.class);
        if (!G1(arrayList, 2)) {
            AbstractC1104pb.J(mediaPlayer, new G7(n92));
            f13305Q = (f13304P + 19) % 128;
            return;
        }
        int i5 = f13304P + 81;
        f13305Q = i5 % 128;
        if (i5 % 2 != 0) {
            AbstractC1104pb.J(mediaPlayer, n92);
        } else {
            AbstractC1104pb.J(mediaPlayer, n92);
            throw null;
        }
    }

    public static String T0() {
        int i5 = f13306R + 87;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            IronSourceAdQuality.getSDKVersion();
            throw null;
        }
        String sDKVersion = IronSourceAdQuality.getSDKVersion();
        int i10 = f13306R + 55;
        f13307S = i10 % 128;
        if (i10 % 2 != 0) {
            return sDKVersion;
        }
        throw null;
    }

    public static M7 U0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        try {
            C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
            List listG = AbstractC1104pb.G(1, arrayList);
            M7 m72 = new M7();
            m72.f13526a = c1126r8;
            m72.f13527b = c1203x8;
            m72.f13528c = c1214y7;
            m72.f13529d = listG;
            int i5 = f13305Q + 121;
            f13304P = i5 % 128;
            if (i5 % 2 == 0) {
                return m72;
            }
            throw null;
        } catch (Exception e7) {
            AbstractC0897a.f(c1214y7.f(), K1((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 107, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47, (char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), e7);
            return null;
        }
    }

    public static View.OnTouchListener V0(ArrayList arrayList) {
        int i5 = f13304P + 63;
        f13305Q = i5 % 128;
        return AbstractC1104pb.h0((View) AbstractC1104pb.U(arrayList, i5 % 2 == 0 ? 1 : 0, View.class));
    }

    public static String W0(C1214y7 c1214y7) {
        int i5 = f13307S + 71;
        f13306R = i5 % 128;
        int i10 = i5 % 2;
        B7 b7U = c1214y7.u();
        if (i10 == 0) {
            return b7U.n();
        }
        b7U.n();
        throw null;
    }

    public static JSONObject X0() {
        f13306R = (f13307S + 59) % 128;
        JSONObject jSONObjectU = Ab.u(G.S().e());
        f13306R = (f13307S + 15) % 128;
        return jSONObjectU;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long Y0(java.util.ArrayList r4) {
        /*
            int r0 = Va.E7.f13309U
            int r0 = r0 + 99
            int r1 = r0 % 128
            Va.E7.f13308T = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r3 = 1
            if (r0 == 0) goto L16
            int r0 = r4.size()
            if (r0 <= r3) goto L36
            goto L1c
        L16:
            int r0 = r4.size()
            if (r0 <= r3) goto L36
        L1c:
            boolean r0 = Va.AbstractC1104pb.P(r4, r3, r2)
            if (r0 == 0) goto L36
            java.lang.Object r4 = Va.AbstractC1104pb.U(r4, r3, r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r0 = (long) r4
            int r4 = Va.E7.f13309U
            int r4 = r4 + 71
            int r4 = r4 % 128
            Va.E7.f13308T = r4
            goto L52
        L36:
            int r0 = r4.size()
            if (r0 <= r1) goto L50
            int r0 = Va.E7.f13308T
            int r0 = r0 + 75
            int r0 = r0 % 128
            Va.E7.f13309U = r0
            java.lang.Object r4 = Va.AbstractC1104pb.U(r4, r1, r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r0 = (long) r4
            goto L52
        L50:
            r0 = 0
        L52:
            int r4 = Va.E7.f13308T
            int r4 = r4 + 107
            int r4 = r4 % 128
            Va.E7.f13309U = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.Y0(java.util.ArrayList):long");
    }

    public static Q7 Z0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            int i5 = f13304P + 119;
            f13305Q = i5 % 128;
            int i10 = i5 % 2;
            arrayList2.addAll((Collection) AbstractC1104pb.U(arrayList, 1, List.class));
        }
        if (c1126r8 == null) {
            return null;
        }
        Q7 q72 = new Q7();
        q72.f13625a = arrayList2;
        q72.f13626b = c1126r8;
        q72.f13627c = c1203x8;
        q72.f13628d = c1214y7;
        int i11 = f13305Q + 59;
        f13304P = i11 % 128;
        if (i11 % 2 == 0) {
            return q72;
        }
        throw null;
    }

    public static C0945d8 a1() {
        C0945d8 c0945d8 = new C0945d8();
        f13307S = (f13306R + 25) % 128;
        return c0945d8;
    }

    public static Context b1(C1214y7 c1214y7) {
        int i5 = f13307S + 21;
        f13306R = i5 % 128;
        int i10 = i5 % 2;
        Context contextZ = c1214y7.z();
        if (i10 != 0) {
            int i11 = 45 / 0;
        }
        f13307S = (f13306R + 25) % 128;
        return contextZ;
    }

    public static View.OnClickListener c1(ArrayList arrayList) {
        int i5 = f13304P + 111;
        f13305Q = i5 % 128;
        View.OnClickListener onClickListenerD = AbstractC1104pb.d((View) AbstractC1104pb.U(arrayList, i5 % 2 == 0 ? 1 : 0, View.class));
        int i10 = f13305Q + 95;
        f13304P = i10 % 128;
        if (i10 % 2 == 0) {
            return onClickListenerD;
        }
        throw null;
    }

    public static String d1(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(L, i5, cArr, 0, i10);
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

    public static String e1(ArrayList arrayList) {
        Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
        List list = (List) AbstractC1104pb.U(arrayList, 1, List.class);
        int iIntValue = ((Integer) AbstractC1104pb.U(arrayList, 2, Integer.class)).intValue();
        C0999ha.j().getClass();
        String strE = new C0973fa(iIntValue, list).e(objU);
        C1051la.f14367d = (C1051la.f14366c + 15) % 128;
        return strE;
    }

    public static ArrayList f1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
        A7 a72 = (A7) AbstractC1104pb.U(arrayList, 1, A7.class);
        List listG = AbstractC1104pb.G(2, arrayList);
        if (a72 == null) {
            return null;
        }
        X7 x72 = new X7();
        x72.f13841a = a72;
        x72.f13842b = c1203x8;
        x72.f13843c = c1214y7;
        x72.f13844d = listG;
        Ra ra2 = a72.f13181a;
        List list = a72.f13183c;
        int i5 = a72.f13184d;
        C0921ba c0921ba = (C0921ba) ra2.f13665a;
        c0921ba.f14044b = x72;
        c0921ba.f14045c = null;
        C1025ja c1025ja = (C1025ja) c0921ba.f14043a;
        c1025ja.f14322d = list;
        c1025ja.f14323e = i5;
        c1025ja.f14320b = X7.class;
        c1025ja.f14321c = null;
        ((C1051la) C0999ha.j().f14264b).getClass();
        F6.r rVar = new F6.r(c0921ba);
        rVar.f4011b = true;
        C1051la.l(objU, rVar, 0, null);
        ArrayList arrayList2 = new ArrayList((HashSet) rVar.f4016g);
        C1051la.f14367d = (C1051la.f14366c + 13) % 128;
        return arrayList2;
    }

    public static long g0() {
        long j8;
        int i5 = f13306R + 43;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            j8 = r0().f14650c;
            int i10 = 73 / 0;
        } else {
            j8 = r0().f14650c;
        }
        f13307S = (f13306R + 63) % 128;
        return j8;
    }

    public static ArrayList g1(List list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            f13305Q = (f13304P + 93) % 128;
            arrayList.addAll(list);
            f13304P = (f13305Q + 11) % 128;
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (Va.AbstractC1104pb.P(r10, 2, Va.C1214y7.class) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List h1(Va.C1214y7 r9, java.util.ArrayList r10) {
        /*
            r0 = 0
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Object r1 = Va.AbstractC1104pb.U(r10, r0, r1)
            java.util.List r1 = (java.util.List) r1
            r2 = 1
            java.lang.Class<Va.r8> r3 = Va.C1126r8.class
            java.lang.Object r3 = Va.AbstractC1104pb.U(r10, r2, r3)     // Catch: java.lang.Exception -> L33
            Va.r8 r3 = (Va.C1126r8) r3     // Catch: java.lang.Exception -> L33
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r4.<init>()     // Catch: java.lang.Exception -> L33
            int r5 = r10.size()     // Catch: java.lang.Exception -> L33
            r6 = 2
            if (r5 <= r6) goto L59
            int r5 = Va.E7.f13301M
            int r5 = r5 + 31
            int r7 = r5 % 128
            Va.E7.f13302N = r7
            int r5 = r5 % r6
            java.lang.Class<Va.y7> r7 = Va.C1214y7.class
            r8 = 3
            if (r5 != 0) goto L35
            boolean r5 = Va.AbstractC1104pb.P(r10, r8, r7)     // Catch: java.lang.Exception -> L33
            if (r5 == r2) goto L3b
            goto L55
        L33:
            r10 = move-exception
            goto L8b
        L35:
            boolean r5 = Va.AbstractC1104pb.P(r10, r6, r7)     // Catch: java.lang.Exception -> L33
            if (r5 == 0) goto L55
        L3b:
            java.lang.Object r5 = Va.AbstractC1104pb.U(r10, r6, r7)     // Catch: java.lang.Exception -> L33
            Va.y7 r5 = (Va.C1214y7) r5     // Catch: java.lang.Exception -> L33
            int r7 = r10.size()     // Catch: java.lang.Exception -> L33
            if (r7 <= r8) goto L5a
            int r4 = Va.E7.f13302N
            int r4 = r4 + 71
            int r7 = r4 % 128
            Va.E7.f13301M = r7
            int r4 = r4 % r6
            java.util.List r4 = Va.AbstractC1104pb.G(r8, r10)     // Catch: java.lang.Exception -> L33
            goto L5a
        L55:
            java.util.List r4 = Va.AbstractC1104pb.G(r6, r10)     // Catch: java.lang.Exception -> L33
        L59:
            r5 = r9
        L5a:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Exception -> L33
            r10.<init>()     // Catch: java.lang.Exception -> L33
            r6 = r0
        L60:
            int r7 = r1.size()     // Catch: java.lang.Exception -> L33
            if (r6 >= r7) goto L8a
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Exception -> L33
            r4.add(r0, r7)     // Catch: java.lang.Exception -> L33
            Va.x8 r7 = r5.e()     // Catch: java.lang.Exception -> L33
            Va.s8 r7 = r3.c(r7, r5, r4)     // Catch: java.lang.Exception -> L33
            java.lang.Object r7 = r7.c()     // Catch: java.lang.Exception -> L33
            r10.add(r7)     // Catch: java.lang.Exception -> L33
            r4.remove(r0)     // Catch: java.lang.Exception -> L33
            int r6 = r6 + 1
            int r7 = Va.E7.f13301M
            int r7 = r7 + 35
            int r7 = r7 % 128
            Va.E7.f13302N = r7
            goto L60
        L8a:
            return r10
        L8b:
            java.lang.String r9 = r9.f()
            r3 = 33
            r4 = 15
            int[] r0 = new int[]{r0, r3, r0, r4}
            java.lang.String r3 = "\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001"
            java.lang.String r0 = d1(r3, r0, r2)
            java.lang.String r0 = r0.intern()
            Va.AbstractC0897a.f(r9, r0, r10)
            java.util.List r1 = (java.util.List) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.h1(Va.y7, java.util.ArrayList):java.util.List");
    }

    public static void j1(ArrayList arrayList) {
        V v2;
        String str = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        List listG = AbstractC1104pb.G(1, arrayList);
        Kb kbU = Kb.u();
        synchronized (kbU) {
            try {
                int i5 = Kb.f13489w;
                int i10 = i5 + 111;
                Kb.f13490x = i10 % 128;
                if (i10 % 2 == 0) {
                    v2 = kbU.k;
                    int i11 = 52 / 0;
                } else {
                    v2 = kbU.k;
                }
                int i12 = i5 + 31;
                Kb.f13490x = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 43 / 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (v2 != null) {
            f13307S = (f13306R + 85) % 128;
            v2.y(str, listG);
            f13307S = (f13306R + 7) % 128;
        }
    }

    public static long k1() {
        int i5 = f13307S + 101;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return AbstractC1104pb.g0();
        }
        AbstractC1104pb.g0();
        throw null;
    }

    public static C1226z7 l1(ArrayList arrayList) {
        List list = (List) AbstractC1104pb.U(arrayList, 0, List.class);
        int iIntValue = ((Integer) AbstractC1104pb.U(arrayList, 1, Integer.class)).intValue();
        C1226z7 c1226z7 = new C1226z7();
        A7 a72 = new A7();
        c1226z7.f14842K = a72;
        Ra ra2 = new Ra();
        C0921ba c0921ba = new C0921ba();
        C1025ja c1025ja = new C1025ja();
        c1025ja.f14324f = -1;
        c1025ja.f14325g = -1;
        c1025ja.f14326h = -1;
        c1025ja.f14327i = -1;
        c1025ja.f14328j = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.k = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.f14329l = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        c1025ja.f14330m = true;
        c0921ba.f14043a = c1025ja;
        ra2.f13665a = c0921ba;
        a72.f13181a = ra2;
        a72.f13183c = list;
        a72.f13184d = iIntValue;
        yb ybVar = new yb();
        ybVar.f14820a = new C0999ha();
        c1226z7.L = ybVar;
        return c1226z7;
    }

    public static T7 m1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        try {
            C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
            List listG = AbstractC1104pb.G(1, arrayList);
            T7 t72 = new T7();
            t72.f13716a = c1126r8;
            t72.f13717b = c1203x8;
            t72.f13718c = c1214y7;
            t72.f13719d = listG;
            f13304P = (f13305Q + 23) % 128;
            return t72;
        } catch (Exception e7) {
            AbstractC0897a.f(c1214y7.f(), K1((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, View.MeasureSpec.getSize(0) + 34, (char) View.MeasureSpec.getSize(0)).intern(), e7);
            return null;
        }
    }

    public static Ba n1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        List listG;
        f13309U = (f13308T + 39) % 128;
        try {
            if (AbstractC1104pb.P(arrayList, 0, Ba.class)) {
                f13308T = (f13309U + 105) % 128;
                return (Ba) AbstractC1104pb.U(arrayList, 0, Ba.class);
            }
            C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
            if (arrayList.size() > 2) {
                f13309U = (f13308T + 49) % 128;
                listG = AbstractC1104pb.G(2, arrayList);
            } else {
                listG = AbstractC1104pb.G(1, arrayList);
            }
            O o7 = new O(2);
            o7.f13559d = listG;
            o7.f13560e = c1126r8;
            o7.f13561f = c1203x8;
            o7.f13562g = c1214y7;
            return o7;
        } catch (Exception e7) {
            String strF = c1214y7.f();
            char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 30232);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            char[] charArray = "崕섪◅\u0a00ܳ㠾皀웃Ὲ톢͛聣⍘椨ᥔ\ud94c䏄鉛洈\u2d74⪪륭蒙\uea17軓㷩閅䫸蜓뮟".toCharArray();
            char[] charArray2 = "\uf791\u1cffᡛᙶ".toCharArray();
            char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
            synchronized (AbstractC0897a.f13934r) {
                try {
                    char[] cArr = (char[]) charArray2.clone();
                    char[] cArr2 = (char[]) charArray3.clone();
                    cArr[0] = (char) (cIndexOf ^ cArr[0]);
                    cArr2[2] = (char) (cArr2[2] + ((char) iMakeMeasureSpec));
                    int length = charArray.length;
                    char[] cArr3 = new char[length];
                    AbstractC0897a.f13933q = 0;
                    while (true) {
                        int i5 = AbstractC0897a.f13933q;
                        if (i5 >= length) {
                            AbstractC0897a.f(strF, new String(cArr3).intern(), e7);
                            return null;
                        }
                        int i10 = (i5 + 3) % 4;
                        int i11 = cArr[i5 % 4] * 32718;
                        char c10 = cArr2[(i5 + 2) % 4];
                        char c11 = (char) ((i11 + c10) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i10] = (char) (((cArr[i10] * 32718) + c10) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i10] = c11;
                        cArr3[i5] = (char) (((charArray[i5] ^ c11) ^ (-727503175)) ^ 0);
                        AbstractC0897a.f13933q = i5 + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String o(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-3112093523340093020L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-3112093523340093020L)));
                        AbstractC1104pb.f14483C = i10 + 1;
                    } else {
                        str2 = new String(cArrZ, 4, cArrZ.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String o1(C1214y7 c1214y7) {
        f13306R = (f13307S + 31) % 128;
        String strH = c1214y7.u().h();
        f13307S = (f13306R + 15) % 128;
        return strH;
    }

    public static ArrayList p1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = f1(c1214y7, arrayList, c1203x8).iterator();
        while (it.hasNext()) {
            C1077na c1077na = (C1077na) it.next();
            if (c1077na != null) {
                arrayList2.add(c1077na.s0());
            }
        }
        return arrayList2;
    }

    public static String q0() {
        f13307S = (f13306R + 39) % 128;
        String strY = G.S().K().y();
        int i5 = f13306R + 69;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 96 / 0;
        }
        return strY;
    }

    public static void q1(C1214y7 c1214y7, ArrayList arrayList) throws JSONException {
        f13306R = (f13307S + 45) % 128;
        c1214y7.o((String) AbstractC1104pb.U(arrayList, 0, String.class), (JSONObject) AbstractC1104pb.U(arrayList, 1, JSONObject.class));
        int i5 = f13306R + 97;
        f13307S = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 13 / 0;
        }
    }

    public static C1154ta r0() {
        f13306R = (f13307S + 15) % 128;
        C1154ta c1154taR = C0935cb.p().r();
        int i5 = f13307S + 29;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return c1154taR;
        }
        throw null;
    }

    public static void r1(ArrayList arrayList) {
        f13304P = (f13305Q + 83) % 128;
        InterfaceC1180va interfaceC1180va = (InterfaceC1180va) AbstractC1104pb.U(arrayList, 0, InterfaceC1180va.class);
        Xa xaG = Xa.g();
        xaG.getClass();
        Cb.j(new Ta(xaG, interfaceC1180va, 0));
        int i5 = f13304P + 45;
        f13305Q = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 56 / 0;
        }
    }

    public static WebChromeClient s0(ArrayList arrayList) {
        f13305Q = (f13304P + 35) % 128;
        WebChromeClient webChromeClientC0 = Ab.c0((WebView) AbstractC1104pb.U(arrayList, 0, WebView.class));
        f13305Q = (f13304P + 29) % 128;
        return webChromeClientC0;
    }

    public static void s1(ArrayList arrayList) {
        String str;
        f13307S = (f13306R + 61) % 128;
        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
        int iIndexOf = TextUtils.indexOf("", "", 0);
        char[] charArray = "龎Đߡꕉ㽷\ue33e侩逃퇃쓑ਚ㕔".toCharArray();
        char[] charArray2 = "誇荵벡烫".toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (scrollDefaultDelay ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) iIndexOf));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13933q;
                    if (i5 >= length) {
                        break;
                    }
                    int i10 = (i5 + 3) % 4;
                    int i11 = cArr[i5 % 4] * 32718;
                    char c10 = cArr2[(i5 + 2) % 4];
                    char c11 = (char) ((i11 + c10) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    cArr2[i10] = (char) (((cArr[i10] * 32718) + c10) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    cArr[i10] = c11;
                    cArr3[i5] = (char) (((charArray[i5] ^ c11) ^ (-1420473262)) ^ 0);
                    AbstractC0897a.f13933q = i5 + 1;
                }
                str = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        Ab.Y(str.intern(), (String) AbstractC1104pb.U(arrayList, 0, String.class));
        int i12 = f13306R + 39;
        f13307S = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 0 / 0;
        }
    }

    public static JSONObject t0() {
        f13306R = (f13307S + 53) % 128;
        JSONObject jSONObjectC = G.S().K().C();
        f13307S = (f13306R + 85) % 128;
        return jSONObjectC;
    }

    public static B7 t1(C1214y7 c1214y7) {
        f13307S = (f13306R + 23) % 128;
        B7 b7U = c1214y7.u();
        f13306R = (f13307S + 45) % 128;
        return b7U;
    }

    public static WebViewClient u0(ArrayList arrayList) {
        int i5 = f13305Q + 35;
        f13304P = i5 % 128;
        return Ab.F((WebView) AbstractC1104pb.U(arrayList, i5 % 2 != 0 ? 1 : 0, WebView.class));
    }

    public static C1077na u1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
        A7 a72 = (A7) AbstractC1104pb.U(arrayList, 1, A7.class);
        List listG = AbstractC1104pb.G(2, arrayList);
        if (a72 == null) {
            return null;
        }
        Y7 y72 = new Y7();
        y72.f13867a = a72;
        y72.f13868b = c1203x8;
        y72.f13869c = c1214y7;
        y72.f13870d = listG;
        Ra ra2 = a72.f13181a;
        List list = a72.f13183c;
        int i5 = a72.f13184d;
        C0921ba c0921ba = (C0921ba) ra2.f13665a;
        c0921ba.f14044b = y72;
        c0921ba.f14045c = null;
        C1025ja c1025ja = (C1025ja) c0921ba.f14043a;
        c1025ja.f14322d = list;
        c1025ja.f14323e = i5;
        c1025ja.f14320b = Y7.class;
        c1025ja.f14321c = null;
        return ((C1051la) C0999ha.j().f14264b).i(objU, c0921ba);
    }

    public static JSONObject v0() {
        int i5 = f13307S + 73;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return G.S().K().e();
        }
        int i10 = 67 / 0;
        return G.S().K().e();
    }

    public static Activity v1() {
        f13306R = (f13307S + 69) % 128;
        Activity activityI = C0974fb.e().i();
        int i5 = f13307S + 105;
        f13306R = i5 % 128;
        if (i5 % 2 == 0) {
            return activityI;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String w0() {
        /*
            int r0 = Va.E7.f13307S
            int r0 = r0 + 69
            int r0 = r0 % 128
            Va.E7.f13306R = r0
            Va.G r0 = Va.G.S()
            r0.getClass()
            int r1 = Va.G.f13355F
            int r1 = r1 + 103
            int r2 = r1 % 128
            Va.G.f13354E = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L26
            boolean r1 = r0.t()
            r2 = 22
            int r2 = r2 / 0
            if (r1 == 0) goto L32
            goto L2e
        L26:
            boolean r1 = r0.t()
            r2 = 1
            if (r1 == r2) goto L2e
            goto L32
        L2e:
            Va.H r0 = r0.f13357B
            if (r0 != 0) goto L41
        L32:
            int r0 = Va.G.f13354E
            int r0 = r0 + 113
            int r1 = r0 % 128
            Va.G.f13355F = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L40
            goto L64
        L40:
            throw r1
        L41:
            int r1 = Va.H.k
            int r1 = r1 + 31
            int r1 = r1 % 128
            Va.H.f13391j = r1
            java.io.Serializable r0 = r0.f13398g
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r1 + 49
            int r1 = r1 % 128
            Va.H.k = r1
            int r1 = Va.G.f13354E
            int r1 = r1 + 119
            int r2 = r1 % 128
            Va.G.f13355F = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L63
            r1 = 99
            int r1 = r1 / 0
        L63:
            r1 = r0
        L64:
            int r0 = Va.E7.f13307S
            int r0 = r0 + 81
            int r0 = r0 % 128
            Va.E7.f13306R = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E7.w0():java.lang.String");
    }

    public static void x0(ArrayList arrayList) {
        f13304P = (f13305Q + 41) % 128;
        C1091ob c1091ob = (C1091ob) AbstractC1104pb.U(arrayList, 0, C1091ob.class);
        c1091ob.getClass();
        c1091ob.f14465b.t(new C1065mb(c1091ob));
        f13304P = (f13305Q + 93) % 128;
    }

    public static C1091ob y0(ArrayList arrayList) {
        WebView webView;
        String strO;
        int i5 = f13304P + 79;
        f13305Q = i5 % 128;
        if (i5 % 2 == 0) {
            webView = (WebView) AbstractC1104pb.U(arrayList, 1, WebView.class);
            strO = o(1 - ImageFormat.getBitsPerPixel(1), "聍\ude86耬唰㍃읆昛翃\ue6bf廙쳒耐䵂");
        } else {
            webView = (WebView) AbstractC1104pb.U(arrayList, 0, WebView.class);
            strO = o(ImageFormat.getBitsPerPixel(0) + 1, "聍\ude86耬唰㍃읆昛翃\ue6bf廙쳒耐䵂");
        }
        C1091ob c1091obF = C1091ob.f(webView, strO.intern());
        int i10 = f13305Q + 5;
        f13304P = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 71 / 0;
        }
        return c1091obF;
    }

    public static String y1(ArrayList arrayList) {
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
            String str = (String) AbstractC1104pb.U(arrayList, 1, String.class);
            ((C1051la) C0999ha.j().f14264b).getClass();
            return C1051la.n(cls, str);
        }
        Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
        if (arrayList.get(1) instanceof List) {
            JSONArray jSONArray = new JSONArray((Collection) AbstractC1104pb.U(arrayList, 1, List.class));
            ((C1051la) C0999ha.j().f14264b).getClass();
            return C1051la.e(jSONArray, objU);
        }
        if (arrayList.get(1) instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) AbstractC1104pb.U(arrayList, 1, JSONArray.class);
            ((C1051la) C0999ha.j().f14264b).getClass();
            return C1051la.e(jSONArray2, objU);
        }
        String str2 = (String) AbstractC1104pb.U(arrayList, 1, String.class);
        ((C1051la) C0999ha.j().f14264b).getClass();
        return C1051la.j(objU, str2);
    }

    public static boolean z0() {
        f13306R = (f13307S + 95) % 128;
        boolean zP = G.S().P();
        f13306R = (f13307S + 49) % 128;
        return zP;
    }

    public static void z1(ArrayList arrayList) {
        f13304P = (f13305Q + 41) % 128;
        View view = (View) AbstractC1104pb.U(arrayList, 0, View.class);
        X9 x92 = (X9) AbstractC1104pb.U(arrayList, 1, X9.class);
        if (G1(arrayList, 2)) {
            int i5 = f13304P + 113;
            f13305Q = i5 % 128;
            if (i5 % 2 == 0) {
                AbstractC1104pb.u(view, x92);
                int i10 = 95 / 0;
            } else {
                AbstractC1104pb.u(view, x92);
            }
        } else {
            AbstractC1104pb.u(view, new K7(x92));
        }
        int i11 = f13304P + 35;
        f13305Q = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public Object A1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        switch (this.f13310K) {
            case 1:
                try {
                    C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
                    List listG = AbstractC1104pb.G(1, arrayList);
                    J7 j72 = new J7();
                    j72.f13446a = c1126r8;
                    j72.f13447b = c1203x8;
                    j72.f13448c = c1214y7;
                    j72.f13449d = listG;
                    int i5 = f13304P + 71;
                    f13305Q = i5 % 128;
                    if (i5 % 2 != 0) {
                        return j72;
                    }
                    throw null;
                } catch (Exception e7) {
                    AbstractC0897a.f(c1214y7.f(), K1(Process.getGidForName("") + 69, 39 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), e7);
                    return null;
                }
            default:
                int i10 = f13309U + 125;
                f13308T = i10 % 128;
                if (i10 % 2 != 0) {
                    Cb.g(n1(c1214y7, arrayList, c1203x8));
                    int i11 = 13 / 0;
                } else {
                    Cb.g(n1(c1214y7, arrayList, c1203x8));
                }
                return null;
        }
    }

    public Object I1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        switch (this.f13310K) {
            case 1:
                try {
                    C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
                    List listG = AbstractC1104pb.G(1, arrayList);
                    L7 l72 = new L7();
                    l72.f13511a = c1126r8;
                    l72.f13512b = c1203x8;
                    l72.f13513c = c1214y7;
                    l72.f13514d = listG;
                    f13305Q = (f13304P + 3) % 128;
                    break;
                } catch (Exception e7) {
                    AbstractC0897a.f(c1214y7.f(), K1(35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 35, (char) (39702 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), e7);
                    return null;
                }
            default:
                f13308T = (f13309U + 1) % 128;
                Cb.c(n1(c1214y7, arrayList, c1203x8));
                f13308T = (f13309U + 27) % 128;
                break;
        }
        return null;
    }

    public Object O0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        switch (this.f13310K) {
            case 1:
                try {
                    C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
                    List listG = AbstractC1104pb.G(1, arrayList);
                    N7 n72 = new N7();
                    n72.f13548a = c1126r8;
                    n72.f13549b = c1203x8;
                    n72.f13550c = c1214y7;
                    n72.f13551d = listG;
                    int i5 = f13304P + 89;
                    f13305Q = i5 % 128;
                    if (i5 % 2 != 0) {
                        return n72;
                    }
                    throw null;
                } catch (Exception e7) {
                    AbstractC0897a.f(c1214y7.f(), o((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, "➛闷⟞\ue8ff锢谡\udbc5\ud9a1䅹ᗣ煄☬\ueade獒\ue8e3轇ᑅ\ud8c4踧ᗳ붾♷┞牯✛迯\udc86\ud8e7䂞ᒁ爘℀\uea38爆\ue9a2辕ፘ\udbbc轚ᐾ볧Ω⛓犻♷軚\udc64\udbda俎ᑍ珢⁌").intern(), e7);
                    return null;
                }
            default:
                int i10 = f13308T + 111;
                f13309U = i10 % 128;
                if (i10 % 2 != 0) {
                    Cb.f(n1(c1214y7, arrayList, c1203x8), Y0(arrayList));
                    return null;
                }
                Cb.f(n1(c1214y7, arrayList, c1203x8), Y0(arrayList));
                throw null;
        }
    }

    public Object R0(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        C1214y7 c1214y72;
        switch (this.f13310K) {
            case 1:
                try {
                    c1214y72 = c1214y7;
                } catch (Exception e7) {
                    e = e7;
                    c1214y72 = c1214y7;
                }
                try {
                    R7 r72 = new R7((C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class), (C1126r8) AbstractC1104pb.U(arrayList, 1, C1126r8.class), AbstractC1104pb.G(2, arrayList), G1(arrayList, 3), c1203x8, c1214y72);
                    f13304P = (f13305Q + 27) % 128;
                    break;
                } catch (Exception e10) {
                    e = e10;
                    AbstractC0897a.f(c1214y72.f(), o(View.resolveSize(0, 0), "᱑펣ᰔ\ue76d鹨쩵푗틫窳厷绖ⵦ턔㔆\ue771萍⾏麐膵ẻ虿怆⪑礰᳠즴팝펇筅勆綱⩁퇢㑟\ue634蓚⢶鷢胩Ὥ蜲杣⥐秺ᶔ좕").intern(), e);
                    return null;
                }
            default:
                f13308T = (f13309U + 13) % 128;
                Cb.e(n1(c1214y7, arrayList, c1203x8));
                int i5 = f13308T + 29;
                f13309U = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 41 / 0;
                    break;
                }
                break;
        }
        return null;
    }

    public void i1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        switch (this.f13310K) {
            case 2:
                f13307S = (f13306R + 19) % 128;
                C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
                if (c1126r8 != null) {
                    F7 f72 = new F7();
                    f72.f13334a = c1126r8;
                    f72.f13335b = c1203x8;
                    f72.f13336c = c1214y7;
                    c1214y7.getClass();
                    C1214y7.f14803m = (C1214y7.f14802l + 27) % 128;
                    c1214y7.f14811h.a().e(f72);
                    C1214y7.f14802l = (C1214y7.f14803m + 65) % 128;
                    f13306R = (f13307S + 77) % 128;
                    return;
                }
                return;
            default:
                f13309U = (f13308T + 25) % 128;
                Cb.j(n1(c1214y7, arrayList, c1203x8));
                int i5 = f13309U + 39;
                f13308T = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                return;
        }
    }

    public Object w1(C1214y7 c1214y7, ArrayList arrayList) {
        boolean zBooleanValue;
        switch (this.f13310K) {
            case 0:
                int i5 = f13301M + 101;
                f13302N = i5 % 128;
                if (i5 % 2 == 0) {
                    h1(c1214y7, arrayList);
                    int i10 = 97 / 0;
                } else {
                    h1(c1214y7, arrayList);
                }
                return null;
            default:
                f13304P = (f13305Q + 59) % 128;
                Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
                Object objU = AbstractC1104pb.U(arrayList, 1, Object.class);
                if (arrayList.size() > 2) {
                    int i11 = f13304P + 23;
                    f13305Q = i11 % 128;
                    zBooleanValue = i11 % 2 == 0 ? ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue() : ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue();
                } else {
                    zBooleanValue = false;
                }
                String simpleName = arrayList.size() > 3 ? (String) AbstractC1104pb.U(arrayList, 3, String.class) : cls.getSimpleName();
                C0441b c0441b = new C0441b(4);
                c0441b.f3291c = simpleName;
                c0441b.f3290b = zBooleanValue;
                c0441b.f3292d = c1214y7;
                try {
                    Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, H9.class}, new C1181vb(objU, c0441b));
                    int i12 = AbstractC0897a.f13926i + 45;
                    AbstractC0897a.f13927j = i12 % 128;
                    if (i12 % 2 != 0) {
                        return objNewProxyInstance;
                    }
                    throw null;
                } catch (Throwable th) {
                    Ab.a0(AbstractC0897a.I("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 10, 72, 0}, false).intern(), AbstractC0897a.I("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{10, 56, 169, 54}, false).intern(), th, true);
                    try {
                        objU = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, H9.class}, new C1181vb(objU, c0441b));
                    } catch (Throwable th2) {
                        Ab.a0(AbstractC0897a.I("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 10, 72, 0}, false).intern(), AbstractC0897a.I("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{66, 49, 0, 0}, true).intern(), th2, true);
                    }
                    return objU;
                }
        }
    }

    public Object x1(C1214y7 c1214y7, ArrayList arrayList, C1203x8 c1203x8) {
        switch (this.f13310K) {
            case 1:
                try {
                    C1126r8 c1126r8 = (C1126r8) AbstractC1104pb.U(arrayList, 0, C1126r8.class);
                    List listG = AbstractC1104pb.G(1, arrayList);
                    H7 h72 = new H7();
                    h72.f13404a = c1126r8;
                    h72.f13405b = c1203x8;
                    h72.f13406c = c1214y7;
                    h72.f13407d = listG;
                    f13305Q = (f13304P + 29) % 128;
                    return h72;
                } catch (Exception e7) {
                    AbstractC0897a.f(c1214y7.f(), o((-1) - TextUtils.lastIndexOf("", '0', 0), "톙▨퇜닐葆㱾自죅띻ꖼ⭫㝈᳜쌍닌鸣\ue247梛퐈җ䮼阨缱挋턙㾰蚩즃뚜ꓞ⠷つ\u1c39쉎뎍黪\ue578毾핽Վ䫅酵系揎큜㺂虝쪸").intern(), e7);
                    return null;
                }
            default:
                f13308T = (f13309U + 23) % 128;
                Cb.a(n1(c1214y7, arrayList, c1203x8), Y0(arrayList));
                int i5 = f13308T + 77;
                f13309U = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                throw null;
        }
    }
}
