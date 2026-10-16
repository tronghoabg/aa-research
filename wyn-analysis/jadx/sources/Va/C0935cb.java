package Va;

import android.app.Activity;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* renamed from: Va.cb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0935cb implements Ia, InterfaceC1129rb {

    /* renamed from: d, reason: collision with root package name */
    public static C0935cb f14073d = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f14075f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f14076g = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f14078i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f14079j = 1;
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f14080l = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f14081a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14082b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14083c;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f14074e = {'t', 153, 156, 143, 142, 129, 162, 144, 149, 'y', 150, 160, 161, 146, 155, 159, 128, 163, 'r', 'M', 148, 164, 133, 134, 152, 147, 131, 157, 166, 165};

    /* renamed from: h, reason: collision with root package name */
    public static final char[] f14077h = {42368, 22902, 23613, 21502, 22178, 19058, 18711, 19706, 17332, 18301, 31281, 31230, 'S', 64692, 63969, 63008, 62305, 61366, 60661, 59681, 59005, 58021, 57318, 56370, 55596, 54719, 53995, 53036, 52341, 51384, 50660, 49718, 49008, 48117, 47349, 46392, 45686, 44735, 44019, 43068, 42278, 3831, 62009, 63341, 63659, 17424, 47318, 48530, 37202, 28034, 26829, 26381, 25154, 32396, 32193, 30793, 30539, 29576, 20169, 19715, 18505, 45707, 20045, 41609, 24137};

    public static String a(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 4863);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String d(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14077h[i5 + i11] ^ (i11 * (-6053810036959085375L))) ^ c10);
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

    public static String e(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14074e;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - '-');
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static void f(View view, K7 k72) {
        int i5 = f14076g + 117;
        int i10 = i5 % 128;
        f14075f = i10;
        if (i5 % 2 != 0) {
            f14076g = (i10 + 75) % 128;
            AbstractC1104pb.u(view, k72);
            f14076g = (f14075f + 83) % 128;
            int i11 = 90 / 0;
        } else {
            f14076g = (i10 + 75) % 128;
            AbstractC1104pb.u(view, k72);
            f14076g = (f14075f + 83) % 128;
        }
        int i12 = f14076g + 3;
        f14075f = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 39 / 0;
        }
    }

    public static boolean g(ViewGroup viewGroup) {
        f14076g = (f14075f + 87) % 128;
        try {
            if (viewGroup.getChildCount() == 0) {
                return false;
            }
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                if (!(viewGroup.getChildAt(i5) instanceof TextView)) {
                    f14075f = (f14076g + 29) % 128;
                    return false;
                }
            }
            f14076g = (f14075f + 83) % 128;
            return true;
        } catch (Throwable th) {
            Ab.R(e((ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), e((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, "\u008c\u0096\u008e\u008b\u009b\u008d\u009e\u008e\u0086\u0094\u009d\u0082\u008f\u0083\u0094\u008c\u008f\u008b\u0085\u008d\u008f\u0083\u0088\u0094\u009c\u0087\u0083\u0090\u0081\u0096\u008e\u008b\u009b\u0094\u009a\u008b\u0094\u0095\u008f\u008b\u0099\u0088\u008e\u0089\u0088\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th);
            return false;
        }
    }

    public static String h(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "㑕痷《捍".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        long j8 = (charArray[i10] ^ c12) ^ 7155428204448527445L;
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public static String i(C0935cb c0935cb) {
        k = (f14080l + 31) % 128;
        c0935cb.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a((char) (28569 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "䪙ᗷ餉졯", "쫄뙗\ue981㴎ﷲ佪貭\u2004\ue76a\uf193疱倀ꃏ᪔", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
        sb2.append((String) c0935cb.f14081a);
        sb2.append(a((char) (40853 - (ViewConfiguration.getPressedStateDuration() >> 16)), "劻⟔闘枟", "㔐", (-668478382) - (ViewConfiguration.getTouchSlop() >> 8)).intern());
        String string = sb2.toString();
        int i5 = k + 17;
        int i10 = i5 % 128;
        f14080l = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i11 = i10 + 21;
        k = i11 % 128;
        if (i11 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static String j(C0935cb c0935cb, Sa sa2) {
        k = (f14080l + 27) % 128;
        c0935cb.getClass();
        k = (f14080l + 57) % 128;
        String strK = c0935cb.k(sa2.f13689b);
        int i5 = k;
        int i10 = i5 + 89;
        f14080l = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i11 = i5 + 23;
        f14080l = i11 % 128;
        if (i11 % 2 != 0) {
            return strK;
        }
        throw null;
    }

    public static void m(C0935cb c0935cb, ViewGroup viewGroup, ViewOnLayoutChangeListenerC0909ab viewOnLayoutChangeListenerC0909ab) {
        EnumC1000hb enumC1000hb;
        EnumC1000hb enumC1000hbE;
        int i5;
        f14076g = (f14075f + 15) % 128;
        c0935cb.getClass();
        if (viewGroup != null) {
            int i10 = f14076g + 11;
            f14075f = i10 % 128;
            if (i10 % 2 != 0) {
                g(viewGroup);
                throw null;
            }
            if (!g(viewGroup)) {
                Activity activityB = Bb.b(viewGroup);
                C1013ib c1013ibD = C1013ib.d();
                synchronized (c1013ibD) {
                    enumC1000hb = EnumC1000hb.f14266b;
                    enumC1000hbE = c1013ibD.e(activityB);
                }
                if (enumC1000hb == enumC1000hbE) {
                    if (viewGroup.findViewById(160766228) == null) {
                        c0935cb.y(viewGroup, viewOnLayoutChangeListenerC0909ab);
                        i5 = f14075f + 39;
                        f14076g = i5 % 128;
                    }
                } else if (!(!C1013ib.d().c(activityB))) {
                    c0935cb.q(viewGroup, viewOnLayoutChangeListenerC0909ab);
                    i5 = f14075f + 89;
                    f14076g = i5 % 128;
                }
            }
        }
        int i11 = f14076g + 9;
        f14075f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Ra o(C0935cb c0935cb) {
        int i5 = k + 95;
        f14080l = i5 % 128;
        int i10 = i5 % 2;
        Object obj = c0935cb.f14083c;
        if (i10 != 0) {
            return (Ra) obj;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0020 A[Catch: all -> 0x001a, TryCatch #1 {all -> 0x001a, blocks: (B:4:0x0003, B:6:0x000f, B:18:0x0043, B:17:0x0020, B:12:0x0019, B:15:0x001c, B:8:0x0013), top: B:25:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized Va.C0935cb p() {
        /*
            java.lang.Class<Va.cb> r1 = Va.C0935cb.class
            monitor-enter(r1)
            int r0 = Va.C0935cb.f14076g     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 119
            int r2 = r0 % 128
            Va.C0935cb.f14075f = r2     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 % 2
            if (r0 == 0) goto L1c
            Va.cb r0 = Va.C0935cb.f14073d     // Catch: java.lang.Throwable -> L1a
            r2 = 77
            int r2 = r2 / 0
            if (r0 != 0) goto L43
            goto L20
        L18:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L1a
        L1a:
            r0 = move-exception
            goto L47
        L1c:
            Va.cb r0 = Va.C0935cb.f14073d     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L43
        L20:
            Va.cb r0 = new Va.cb     // Catch: java.lang.Throwable -> L1a
            r0.<init>()     // Catch: java.lang.Throwable -> L1a
            java.util.WeakHashMap r2 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L1a
            r0.f14082b = r2     // Catch: java.lang.Throwable -> L1a
            Va.ta r3 = new Va.ta     // Catch: java.lang.Throwable -> L1a
            r6 = -1
            r8 = -1
            r4 = -1
            r5 = -1
            r3.<init>(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L1a
            r0.f14083c = r3     // Catch: java.lang.Throwable -> L1a
            Va.C0935cb.f14073d = r0     // Catch: java.lang.Throwable -> L1a
            int r0 = Va.C0935cb.f14076g     // Catch: java.lang.Throwable -> L1a
            int r0 = r0 + 79
            int r0 = r0 % 128
            Va.C0935cb.f14075f = r0     // Catch: java.lang.Throwable -> L1a
        L43:
            Va.cb r0 = Va.C0935cb.f14073d     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r0
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0935cb.p():Va.cb");
    }

    public static ViewGroup s(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int i5 = f14076g;
        f14075f = (i5 + 29) % 128;
        if (viewGroup2 == null) {
            f14075f = (i5 + 47) % 128;
            return viewGroup;
        }
        ViewGroup viewGroup3 = viewGroup2;
        while (viewGroup2 != null) {
            int i10 = f14076g + 19;
            f14075f = i10 % 128;
            if (i10 % 2 != 0) {
                viewGroup2.getParent();
                throw null;
            }
            ViewParent parent = viewGroup2.getParent();
            if (parent != viewGroup) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                viewGroup3 = viewGroup2;
                viewGroup2 = (ViewGroup) parent;
            } else {
                return viewGroup3 == viewGroup2 ? viewGroup2 : viewGroup3;
            }
        }
        return viewGroup2;
    }

    public static /* synthetic */ String u(C0935cb c0935cb, String str) {
        k = (f14080l + 95) % 128;
        String strK = c0935cb.k(str);
        f14080l = (k + 121) % 128;
        return strK;
    }

    @Override // Va.Ia
    public void b(C1052lb c1052lb, String str) {
        int i5;
        if (c1052lb != null) {
            int i10 = f14079j + 119;
            f14078i = i10 % 128;
            int i11 = i10 % 2;
            Aa aa2 = (Aa) c1052lb.f14374c;
            if (i11 != 0) {
                throw null;
            }
            i5 = aa2.f13191a;
        } else {
            f14079j = (f14078i + 109) % 128;
            i5 = -1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h((char) Color.argb(0, 0, 0, 0), "\ued3c抎\ud8db㊝", "擒㺛㏉ꞛ泀ꮿ춯有値屷谌醨죤ꃶ萼䱘⼃䀚㜧₸牣쟯畬䀄휿㚅쮌躢鲸㗤\uda27僣녅ﻻ", 1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
        sb2.append(i5);
        Ab.k(d((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf("", "", 0) + 12, (char) (42450 - View.resolveSizeAndState(0, 0, 0))).intern(), sb2.toString());
        if (i5 != 403) {
            int i12 = G.f13355F;
            G.f13354E = (i12 + 35) % 128;
            G g9 = (G) this.f14083c;
            int i13 = g9.f13373w;
            g9.f13373w = i13 + 1;
            int i14 = (i12 + 37) % 128;
            G.f13354E = i14;
            G.f13355F = (i14 + 77) % 128;
            int iOptInt = g9.e().optInt(G.T((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, "\ud8b1쵘✞훂").intern(), 3);
            int i15 = G.f13355F + 67;
            int i16 = i15 % 128;
            G.f13354E = i16;
            if (i15 % 2 != 0) {
                throw null;
            }
            int i17 = i16 + 61;
            G.f13355F = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            if (i13 < iOptInt) {
                int i18 = f14079j + 53;
                f14078i = i18 % 128;
                if (i18 % 2 != 0) {
                    w(g9.z());
                    throw null;
                }
                w(g9.z());
            }
        }
        int i19 = f14078i + 81;
        f14079j = i19 % 128;
        if (i19 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0256  */
    @Override // Va.Ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(Va.C1052lb r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0935cb.c(Va.lb):void");
    }

    public String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f14082b);
        sb2.append(str);
        String string = sb2.toString();
        f14080l = (k + 91) % 128;
        return string;
    }

    public synchronized void l(C1154ta c1154ta) {
        int i5 = (f14076g + 39) % 128;
        f14075f = i5;
        this.f14083c = c1154ta;
        int i10 = i5 + 95;
        f14076g = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.InterfaceC1129rb
    public /* synthetic */ Object n(String str, JSONObject jSONObject) {
        int i5 = (C0984g8.f14188i + 27) % 128;
        C0984g8.f14189j = i5;
        String str2 = ((C0984g8) this.f14083c).f14190a;
        C0984g8.f14188i = (i5 + 113) % 128;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        C1126r8[] c1126r8Arr = (C1126r8[]) this.f14082b;
        C1126r8 c1126r8 = new C1126r8((String) this.f14081a, str2, str, jSONObjectOptJSONObject, c1126r8Arr[0]);
        c1126r8Arr[0] = c1126r8;
        return c1126r8;
    }

    public void q(ViewGroup viewGroup, ViewOnLayoutChangeListenerC0909ab viewOnLayoutChangeListenerC0909ab) {
        K7 k72 = new K7();
        k72.f13480b = this;
        Handler handler = new Handler(Looper.getMainLooper());
        O o7 = new O(3);
        o7.f13562g = this;
        o7.f13559d = viewGroup;
        o7.f13560e = k72;
        o7.f13561f = viewOnLayoutChangeListenerC0909ab;
        handler.post(o7);
        int i5 = f14076g + 75;
        f14075f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public synchronized C1154ta r() {
        C1154ta c1154ta;
        int i5 = (f14075f + 91) % 128;
        f14076g = i5;
        c1154ta = (C1154ta) this.f14083c;
        f14075f = (i5 + 79) % 128;
        return c1154ta;
    }

    public void t(Sa sa2, C1169v c1169v) {
        Handler handlerK = Ra.k();
        Da da2 = new Da(1);
        da2.f13291f = this;
        da2.f13289d = sa2;
        da2.f13290e = c1169v;
        handlerK.post(da2);
        f14080l = (k + 29) % 128;
    }

    public synchronized void v() {
        try {
            int i5 = f14075f + 99;
            f14076g = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            if (((C0962f) this.f14081a) == null) {
                C0962f c0962f = new C0962f(1);
                c0962f.f14145b = this;
                this.f14081a = c0962f;
                Za.n().p((C0962f) this.f14081a);
            }
            int i10 = f14075f + 59;
            f14076g = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 16 / 0;
                return;
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public void w(int i5) {
        synchronized (((G) this.f14083c)) {
            try {
                G g9 = (G) this.f14083c;
                int i10 = G.f13355F;
                G.f13354E = (i10 + 65) % 128;
                Handler handler = g9.f13363m;
                G.f13354E = (i10 + 117) % 128;
                if (handler != null) {
                    C1169v c1169v = new C1169v(5);
                    c1169v.f14690d = this;
                    Cb.f(c1169v, i5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x(MotionEvent motionEvent) {
        try {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            C1206y c1206y = new C1206y(2);
            c1206y.f14799e = this;
            c1206y.f14798d = motionEventObtain;
            Cb.j(c1206y);
            int i5 = f14076g + 59;
            f14075f = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Ab.a0(e((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, "\u008e\u0088\u008b\u0092\u0090\u008e\u0091\u0090\u008e\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), e(KeyEvent.keyCodeFromString("") + 127, "\u0098\u0096\u0085\u0090\u0094\u0090\u0083\u0094\u0097\u0096\u0085\u0090\u0094\u0089\u0088\u0087\u0083\u008d\u0094\u0095\u008f\u008b\u008d\u008d\u008e\u0095\u0094\u0090\u0083\u0090\u0090\u0093").intern(), th, false);
        }
    }

    public void y(ViewGroup viewGroup, ViewOnLayoutChangeListenerC0909ab viewOnLayoutChangeListenerC0909ab) {
        C0922bb c0922bb = new C0922bb(this, viewGroup.getContext());
        c0922bb.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        synchronized (this) {
            ((WeakHashMap) this.f14082b).put(c0922bb, new Object());
        }
        c0922bb.setId(160766228);
        Handler handler = new Handler(Looper.getMainLooper());
        Da da2 = new Da(21);
        da2.f13289d = viewGroup;
        da2.f13290e = c0922bb;
        da2.f13291f = viewOnLayoutChangeListenerC0909ab;
        handler.post(da2);
    }
}
