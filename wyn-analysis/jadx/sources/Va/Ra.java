package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import x9.C4504d;
import za.C4658a;

/* loaded from: classes4.dex */
public final class Ra implements Ia, InterfaceC1217ya, InterfaceC1129rb {

    /* renamed from: b, reason: collision with root package name */
    public static Handler f13659b = null;

    /* renamed from: c, reason: collision with root package name */
    public static int f13660c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f13661d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f13662e = {'A', 'n', 'a', 'l', 'y', 't', 'i', 'c', 's', 'G', 'o', ' ', 'u', 'e', 'r', 'p', 'f', 'd', 'E', 'v', '!', 'S', 'm', 'h', 'g', 'w', '.', ':', 'B', 'C', 'D', 'F', 'H', 'I', 'J', 'K'};

    /* renamed from: f, reason: collision with root package name */
    public static int f13663f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f13664g = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f13665a;

    public /* synthetic */ Ra(Object obj) {
        this.f13665a = obj;
    }

    public static String f(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(-1296698730471629185L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * (-1296698730471629185L)));
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

    public static /* synthetic */ void g(Ra ra2) {
        int i5 = f13660c + 27;
        f13661d = i5 % 128;
        int i10 = i5 % 2;
        ra2.getClass();
        i();
        if (i10 == 0) {
            int i11 = 50 / 0;
        }
        f13661d = (f13660c + 81) % 128;
    }

    public static String h(String str) {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(o("᷾ổ籭褜⯇컌\ue3dd⽹\uebdf佁ꁟ俽", 11 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        String string = sbJ.toString();
        f13661d = (f13660c + 111) % 128;
        return string;
    }

    public static void i() {
        int i5 = f13661d + 125;
        f13660c = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static Handler k() {
        Handler handler;
        synchronized (Ra.class) {
            try {
                if (f13659b == null) {
                    HandlerThread handlerThread = new HandlerThread(o("ց렞\udb73㞻虥≅ﶺ\ue6da鶏鏉䎢᠓⧭\u2e60ꁟ俽", TextUtils.indexOf("", "", 0, 0) + 15).intern());
                    handlerThread.start();
                    f13659b = new Handler(handlerThread.getLooper());
                }
                handler = f13659b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public static String l(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13662e;
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
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
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

    public static String o(String str, int i5) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 28054)) ^ ((c11 >>> 5) + 44956)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 33407) ^ ((c12 + i11) ^ ((c12 << 4) + 49980))));
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

    @Override // Va.InterfaceC1217ya
    public void a(String str) {
        int i5 = W.f13804h + 125;
        W.f13803g = i5 % 128;
        int i10 = i5 % 2;
        ((W) this.f13665a).f(str);
        if (i10 != 0) {
            int i11 = 67 / 0;
        }
        W.f13803g = (W.f13804h + 47) % 128;
    }

    @Override // Va.Ia
    public void b(C1052lb c1052lb, String str) {
        Da da2 = new Da(3);
        da2.f13291f = this;
        da2.f13289d = c1052lb;
        da2.f13290e = str;
        Cb.g(da2);
    }

    @Override // Va.Ia
    public void c(C1052lb c1052lb) {
        ArrayList<Db> arrayList;
        Aa aa2 = (Aa) c1052lb.f14374c;
        int i5 = aa2.f13191a;
        String str = aa2.f13192b;
        if (i5 >= 200 && i5 <= 299) {
            Ab.y(l((byte) (34 - TextUtils.indexOf("", "", 0)), 9 - View.getDefaultSize(0, 0), "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0095").intern(), l((byte) (111 - TextUtils.getCapsMode("", 0, 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 37, "\n\u000b\u000b\u0011\u0005\b\u0006\u000eÒÒ\u000e\u0007\t\u0006\u000f\u000e\t\u000e\u0007\u0004\u0007\u000e\n\u0011\b\u0010\u0006\t\u0013\u0007\f\u0017\u0019\u0013\u0002\u0000\u0090").intern(), (JSONArray) ((S3.i) this.f13665a).f10961a);
            Iterator it = ((ArrayList) ((S3.i) this.f13665a).f10962b).iterator();
            while (it.hasNext()) {
                C1040l c1040l = (C1040l) it.next();
                C1194x c1194x = (C1194x) ((S3.i) this.f13665a).f10964d;
                int i10 = C1194x.f14742s + 7;
                C1194x.f14741r = i10 % 128;
                if (i10 % 2 != 0) {
                    C0935cb c0935cb = c1194x.f14746d;
                    throw null;
                }
                C0935cb c0935cb2 = c1194x.f14746d;
                Sa saD = c1040l.d();
                c0935cb2.getClass();
                Handler handlerK = k();
                C1206y c1206y = new C1206y(16);
                c1206y.f14799e = c0935cb2;
                c1206y.f14798d = saD;
                handlerK.post(c1206y);
                C0935cb.f14080l = (C0935cb.k + 77) % 128;
            }
            C1206y c1206y2 = new C1206y(9);
            c1206y2.f14799e = this;
            c1206y2.f14798d = c1052lb;
            Cb.g(c1206y2);
            return;
        }
        if (i5 == 403) {
            synchronized (((C1194x) ((S3.i) this.f13665a).f10964d)) {
                try {
                    C1194x c1194x2 = (C1194x) ((S3.i) this.f13665a).f10964d;
                    int i11 = C1194x.f14742s + 63;
                    C1194x.f14741r = i11 % 128;
                    if (i11 % 2 != 0) {
                        arrayList = c1194x2.f14752j;
                        int i12 = 65 / 0;
                    } else {
                        arrayList = c1194x2.f14752j;
                    }
                    for (Db db2 : arrayList) {
                        C1169v c1169v = new C1169v(3);
                        c1169v.f14690d = db2;
                        Cb.g(c1169v);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            String strIntern = l((byte) (34 - TextUtils.getCapsMode("", 0, 0)), Process.getGidForName("") + 10, "\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0095").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l((byte) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 116), (KeyEvent.getMaxKeyCode() >> 16) + 51, "\u0016\t\u0013\u0010\u000b\u001d\u0007\u0000\u001d\u0006\u001f\u0013\u0002\u0000\u0007\u001d\u0010\b\u0000\u0019\u0007\u001d\u000b\u0000\u001d\u0011\u0007\u000e\u0005\r\u0013\u0014\u0013\u0007\u0002\u001d\u0006\n\u000b\u0004\b\u0011\u000e\u0007\u0010\t\u0002\u0007\u000f\u0019\u0094").intern());
            sb2.append(i5);
            sb2.append(l((byte) (32 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "@").intern());
            sb2.append(str);
            Ab.a(strIntern, sb2.toString());
        }
        C1143t c1143t = new C1143t();
        c1143t.f14639f = this;
        c1143t.f14636c = c1052lb;
        c1143t.f14637d = i5;
        c1143t.f14638e = str;
        Cb.g(c1143t);
    }

    public void d(String str) {
        C1206y c1206y = new C1206y(3);
        c1206y.f14799e = this;
        c1206y.f14798d = str;
        Cb.j(c1206y);
    }

    public int e(String str) {
        int iC;
        f13661d = (f13660c + 13) % 128;
        C1013ib c1013ib = (C1013ib) this.f13665a;
        c1013ib.getClass();
        try {
            iC = ((C1128ra) c1013ib.f14299c).c(str);
        } catch (Throwable unused) {
            iC = 0;
        }
        f13661d = (f13660c + 65) % 128;
        return iC;
    }

    public void j(String str, String str2) {
        Handler handlerK = k();
        Qa qa2 = new Qa(1);
        qa2.f13640f = this;
        qa2.f13638d = str;
        qa2.f13639e = str2;
        handlerK.post(qa2);
        int i5 = f13660c + 101;
        f13661d = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String m(String str) {
        String strE;
        f13660c = (f13661d + 45) % 128;
        C1013ib c1013ib = (C1013ib) this.f13665a;
        c1013ib.getClass();
        try {
            strE = ((C1128ra) c1013ib.f14299c).e(str);
            if (strE != null && !TextUtils.isEmpty(strE)) {
                try {
                    strE = ((C0921ba) c1013ib.f14298b).e(strE);
                } catch (C1103pa unused) {
                    strE = "";
                }
            }
        } catch (Throwable unused2) {
            strE = null;
        }
        f13660c = (f13661d + 103) % 128;
        return strE;
    }

    @Override // Va.InterfaceC1129rb
    public Object n(String str, JSONObject jSONObject) {
        int i5 = 27;
        String strG = C0919b8.g((C0919b8) this.f13665a);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        C0984g8 c0984g8 = new C0984g8();
        c0984g8.f14190a = AbstractC1152t8.a(str);
        c0984g8.f14191b = AbstractC1152t8.a(jSONObjectOptJSONObject.optString(C0984g8.c((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern()));
        c0984g8.f14192c = jSONObjectOptJSONObject.optBoolean(C0984g8.c(5 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 8, (char) View.MeasureSpec.getMode(0)).intern());
        c0984g8.f14193d = C0984g8.b(Ab.d0(jSONObjectOptJSONObject.optJSONArray(C0984g8.c(13 - (ViewConfiguration.getWindowTouchSlop() >> 8), 7 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE)).intern()), new C4504d(i5)));
        c0984g8.f14194e = C0984g8.b(Ab.d0(jSONObjectOptJSONObject.optJSONArray(C0984g8.c((-16777196) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, (char) (29407 - View.MeasureSpec.getMode(0))).intern()), new ya.b(i5)));
        c0984g8.f14195f = C0984g8.a(Ab.M(jSONObjectOptJSONObject.optJSONObject(C0984g8.c(24 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6, (char) (19105 - ((Process.getThreadPriority(0) + 20) >> 6))).intern()), new C4658a(i5)));
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(C0984g8.c(TextUtils.getTrimmedLength("") + 31, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 7, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        C0935cb c0935cb = new C0935cb();
        c0935cb.f14083c = c0984g8;
        c0935cb.f14081a = strG;
        c0935cb.f14082b = new C1126r8[]{null};
        c0984g8.f14196g = C0984g8.a(Ab.M(jSONObjectOptJSONObject2, c0935cb));
        return c0984g8;
    }

    public void p(String str) {
        f13661d = (f13660c + 23) % 128;
        C1013ib c1013ib = (C1013ib) this.f13665a;
        c1013ib.getClass();
        try {
            ((C1128ra) c1013ib.f14299c).b(str);
        } catch (Throwable unused) {
        }
        f13661d = (f13660c + 125) % 128;
    }

    public void q(String str, String str2) {
        int i5 = f13660c + 1;
        f13661d = i5 % 128;
        if (i5 % 2 == 0) {
            r(str, str2);
            r(h(str), Long.toString(AbstractC1104pb.g0()));
            int i10 = 8 / 0;
        } else {
            r(str, str2);
            r(h(str), Long.toString(AbstractC1104pb.g0()));
        }
        int i11 = f13661d + 99;
        f13660c = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public void r(String str, String str2) {
        f13661d = (f13660c + 41) % 128;
        C1013ib c1013ib = (C1013ib) this.f13665a;
        c1013ib.getClass();
        try {
            ((C1128ra) c1013ib.f14299c).f(str, ((C0921ba) c1013ib.f14298b).k(str2));
        } catch (Throwable unused) {
        }
        int i5 = f13661d + 83;
        f13660c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 92 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ra(android.content.Context r18, java.lang.String r19, java.lang.String r20) throws java.security.NoSuchAlgorithmException {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Ra.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
