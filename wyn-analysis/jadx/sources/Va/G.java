package Va;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class G extends Mb {

    /* renamed from: C, reason: collision with root package name */
    public static G f13352C = null;

    /* renamed from: D, reason: collision with root package name */
    public static final char[] f13353D = {'e', 'm', 'd', 'c', 's', 'l', 'u', 't', 'r', 'a', 'b', 'k', '.', 'v', 'o', 'n', 'f', 'i', 'g', 'R', 'C', 'p', 'q', 'U', 'T'};

    /* renamed from: E, reason: collision with root package name */
    public static int f13354E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static int f13355F = 1;

    /* renamed from: A, reason: collision with root package name */
    public boolean f13356A;

    /* renamed from: B, reason: collision with root package name */
    public H f13357B;

    /* renamed from: g, reason: collision with root package name */
    public final int f13358g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13359h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13360i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13361j;
    public Ra k;

    /* renamed from: l, reason: collision with root package name */
    public C1218z f13362l;

    /* renamed from: m, reason: collision with root package name */
    public Handler f13363m;

    /* renamed from: n, reason: collision with root package name */
    public C f13364n;

    /* renamed from: o, reason: collision with root package name */
    public D f13365o;

    /* renamed from: p, reason: collision with root package name */
    public E f13366p;

    /* renamed from: q, reason: collision with root package name */
    public C f13367q;

    /* renamed from: r, reason: collision with root package name */
    public Fb f13368r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f13369s;

    /* renamed from: t, reason: collision with root package name */
    public ArrayList f13370t;

    /* renamed from: u, reason: collision with root package name */
    public Eb f13371u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13372v;

    /* renamed from: w, reason: collision with root package name */
    public int f13373w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f13374x;

    /* renamed from: y, reason: collision with root package name */
    public A f13375y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f13376z;

    public G() {
        T(TextUtils.indexOf("", "") + 3, "澑\u2e76刺܃").intern();
        W((byte) (MotionEvent.axisFromString("") + 58), View.MeasureSpec.getMode(0) + 3, "\u0001\u0002\u009d").intern();
        T((Process.myTid() >> 22) + 4, "沸\ue0fe樵㘄").intern();
        T(5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "㕺쫅樵㘄").intern();
        T((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 3, "以分ឬ퀐").intern();
        T(4 - (Process.myPid() >> 22), "龎\ue3c9ㆬ\uec5b").intern();
        W((byte) (33 - TextUtils.getOffsetAfter("", 0)), TextUtils.lastIndexOf("", '0', 0) + 5, "\u0004\u0000\u0007\u0000").intern();
        W((byte) (64 - View.MeasureSpec.getMode(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, "\u0000\t¤").intern();
        T(((Process.getThreadPriority(0) + 20) >> 6) + 4, "ꭏ㶪\uee6a͉").intern();
        T((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 3, "붌ී啸욵").intern();
        W((byte) (115 - ExpandableListView.getPackedPositionGroup(0L)), View.MeasureSpec.getSize(0) + 3, "\t\u0001ç").intern();
        W((byte) (View.getDefaultSize(0, 0) + 118), ((Process.getThreadPriority(0) + 20) >> 6) + 4, "\u0002\u0006\u0007\f").intern();
        TimeUnit timeUnit = TimeUnit.HOURS;
        timeUnit.toMillis(24L);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        this.f13358g = (int) timeUnit2.toMillis(5L);
        this.f13359h = (int) timeUnit.toMillis(12L);
        this.f13360i = (int) timeUnit2.toMillis(3L);
        this.f13361j = (int) timeUnit2.toMillis(10L);
        this.f13373w = 0;
        this.f13376z = null;
        this.f13356A = false;
    }

    public static synchronized G S() {
        try {
            if (f13352C == null) {
                f13352C = new G();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13352C;
    }

    public static String T(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 31160)) ^ ((c11 >>> 5) + 46412)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 6375) ^ ((c12 + i11) ^ ((c12 << 4) + 24915))));
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

    public static String W(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13353D;
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
                            int i12 = c10 / 5;
                            int i13 = c10 % 5;
                            int i14 = c11 / 5;
                            int i15 = c11 % 5;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 4) % 5) * 5) + i13];
                                cArr2[i11] = cArr[(((i14 + 4) % 5) * 5) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 5) + ((i13 + 4) % 5)];
                                cArr2[i11] = cArr[(i14 * 5) + ((i15 + 4) % 5)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 5) + i15];
                                cArr2[i11] = cArr[(i14 * 5) + i13];
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

    public static /* synthetic */ void Y(G g9, Fb fb2) {
        int i5 = f13355F;
        int i10 = i5 + 61;
        f13354E = i10 % 128;
        int i11 = i10 % 2;
        g9.f13368r = fb2;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i5 + 39;
        f13354E = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ ArrayList b0(G g9) {
        int i5 = (f13354E + 107) % 128;
        f13355F = i5;
        ArrayList arrayList = g9.f13369s;
        int i10 = i5 + 61;
        f13354E = i10 % 128;
        if (i10 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static void e0(JSONObject jSONObject, long j8) throws JSONException {
        f13355F = (f13354E + 125) % 128;
        if (jSONObject.has(W((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42), 3 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "\u0002\t\u009d").intern())) {
            try {
                jSONObject.put(W((byte) (43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 3 - Color.alpha(0), "\u0002\t\u009d").intern(), jSONObject.optLong(W((byte) (View.combineMeasuredStates(0, 0) + 42), View.getDefaultSize(0, 0) + 3, "\u0002\t\u009d").intern()) + (j8 / 2));
                f13355F = (f13354E + 45) % 128;
            } catch (JSONException unused) {
            }
        }
        f13355F = (f13354E + 31) % 128;
    }

    public static /* synthetic */ ArrayList h0(G g9) {
        int i5 = f13354E;
        int i10 = i5 + 23;
        f13355F = i10 % 128;
        int i11 = i10 % 2;
        ArrayList arrayList = g9.f13370t;
        if (i11 == 0) {
            throw null;
        }
        f13355F = (i5 + 91) % 128;
        return arrayList;
    }

    public final HashMap A() {
        int i5 = f13354E + 9;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            u();
            throw null;
        }
        if (u()) {
            f13354E = (f13355F + 27) % 128;
            if (this.f13357B != null) {
                HashMap map = new HashMap(this.f13357B.b());
                int i10 = f13354E + 99;
                f13355F = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 79 / 0;
                }
                return map;
            }
        }
        return null;
    }

    public final boolean B() {
        JSONObject jSONObjectE;
        int iNormalizeMetaState;
        int i5 = f13354E + 45;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            jSONObjectE = e();
            iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2;
        } else {
            jSONObjectE = e();
            iNormalizeMetaState = 3 - KeyEvent.normalizeMetaState(0);
        }
        return jSONObjectE.optBoolean(T(iNormalizeMetaState, "붌ී啸욵").intern());
    }

    public final boolean C() {
        JSONObject jSONObjectE;
        int maximumDrawingCacheSize;
        int i5 = f13355F + 71;
        f13354E = i5 % 128;
        if (i5 % 2 != 0) {
            jSONObjectE = e();
            maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() * 96) + 4;
        } else {
            jSONObjectE = e();
            maximumDrawingCacheSize = 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
        }
        boolean zOptBoolean = jSONObjectE.optBoolean(T(maximumDrawingCacheSize, "ꭏ㶪\uee6a͉").intern());
        int i10 = f13355F + 89;
        f13354E = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 78 / 0;
        }
        return zOptBoolean;
    }

    public final boolean D() {
        JSONObject jSONObjectE;
        String strW;
        int i5 = f13355F + 99;
        f13354E = i5 % 128;
        if (i5 % 2 != 0) {
            jSONObjectE = e();
            strW = W((byte) (117 % TextUtils.lastIndexOf("", 'G', 1)), View.MeasureSpec.getSize(0) + 5, "\u0004\u0000\u0007\u0000");
        } else {
            jSONObjectE = e();
            strW = W((byte) (32 - TextUtils.lastIndexOf("", '0', 0)), View.MeasureSpec.getSize(0) + 4, "\u0004\u0000\u0007\u0000");
        }
        return jSONObjectE.optBoolean(strW.intern());
    }

    public final int E() {
        int iOptInt;
        synchronized (this) {
            iOptInt = e().optInt(W((byte) (64 - TextUtils.indexOf("", "", 0)), (Process.myTid() >> 22) + 3, "\u0000\t¤").intern(), 100);
        }
        return iOptInt;
    }

    public final long F() throws NumberFormatException {
        f13355F = (f13354E + 125) % 128;
        String strM = this.k.m(W((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40), (ViewConfiguration.getTouchSlop() >> 8) + 37, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099").intern());
        if (TextUtils.isEmpty(strM)) {
            return 0L;
        }
        int i5 = f13354E + 125;
        f13355F = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.parseLong(strM);
        }
        Long.parseLong(strM);
        throw null;
    }

    public final JSONObject G() {
        W w2 = (W) this.f13539b;
        if (w2 == null) {
            return null;
        }
        f13355F = (f13354E + 45) % 128;
        JSONObject jSONObjectOptJSONObject = w2.f13808d.optJSONObject(W.c("\f\ufffe\ufffb￼", 4 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 194, Gravity.getAbsoluteGravity(0, 0) + 3, false).intern());
        if (jSONObjectOptJSONObject == null) {
            int i5 = W.f13804h;
            int i10 = i5 + 95;
            W.f13803g = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            JSONObject jSONObject = w2.f13809e;
            W.f13803g = (i5 + 11) % 128;
            jSONObjectOptJSONObject = jSONObject;
        }
        W.f13803g = (W.f13804h + 95) % 128;
        int i11 = f13354E + 3;
        f13355F = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 41 / 0;
        }
        return jSONObjectOptJSONObject;
    }

    public final synchronized void H() {
        this.f13363m.removeCallbacksAndMessages(null);
        this.f13363m = null;
        F f10 = new F(0);
        f10.f13328d = this;
        Cb.g(f10);
        f13355F = (f13354E + 3) % 128;
    }

    public final String I() {
        f13355F = (f13354E + 93) % 128;
        if (e() == null) {
            return null;
        }
        int i5 = f13354E + 57;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            String strOptString = e().optString(W((byte) (81 % (ViewConfiguration.getWindowTouchSlop() * 12)), 4 % View.MeasureSpec.getMode(0), "\u0007\f\u0007\f").intern());
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
        } else {
            String strOptString2 = e().optString(W((byte) (61 - (ViewConfiguration.getWindowTouchSlop() >> 8)), View.MeasureSpec.getMode(0) + 4, "\u0007\f\u0007\f").intern());
            if (!TextUtils.isEmpty(strOptString2)) {
                return strOptString2;
            }
        }
        W w2 = (W) this.f13539b;
        w2.getClass();
        W.f13804h = (W.f13803g + 87) % 128;
        String strOptString3 = w2.f13808d.optString(W.c("\b\ufff8\b\ufff8", View.resolveSize(0, 0) + 4, 197 - TextUtils.getCapsMode("", 0, 0), 4 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), true).intern(), W.b((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, "\u0097\u008c\u0081").intern());
        int i10 = W.f13804h + 37;
        W.f13803g = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString3;
        }
        throw null;
    }

    public final E J() {
        int i5 = f13354E + 7;
        f13355F = i5 % 128;
        if (i5 % 2 != 0) {
            return this.f13366p;
        }
        throw null;
    }

    public final C K() {
        int i5 = f13355F;
        C c10 = this.f13367q;
        f13354E = (i5 + 107) % 128;
        return c10;
    }

    public final D L() {
        int i5 = (f13355F + 67) % 128;
        f13354E = i5;
        D d3 = this.f13365o;
        f13355F = (i5 + 29) % 128;
        return d3;
    }

    public final String M() {
        f13354E = (f13355F + 57) % 128;
        String strOptString = e().optString(T(3 - View.MeasureSpec.getSize(0), "澑\u2e76刺܃").intern());
        f13354E = (f13355F + 113) % 128;
        return strOptString;
    }

    public final double N() {
        f13355F = (f13354E + 57) % 128;
        double dOptDouble = e().optDouble(T(((Process.getThreadPriority(0) + 20) >> 6) + 4, "以分ឬ퀐").intern(), 1.0d);
        f13354E = (f13355F + 9) % 128;
        return dOptDouble;
    }

    public final synchronized boolean O() {
        boolean z2;
        int i5 = f13355F;
        z2 = this.f13372v;
        int i10 = i5 + 125;
        f13354E = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return z2;
    }

    public final boolean P() {
        int i5 = f13355F + 33;
        int i10 = i5 % 128;
        f13354E = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f13374x;
        int i11 = i10 + 77;
        f13355F = i11 % 128;
        if (i11 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final void Q(Context context, C1218z c1218z, A a5, Eb eb2, boolean z2) {
        JSONObject jSONObject;
        this.k = new Ra(context, W((byte) (12 - View.resolveSize(0, 0)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, "\b\t\b\u0004\u0005\u000f\b\u0004\f\r\f\u000e\u0011\u0007\u000b\r\u0005\u0003\u0004\u000b\u0005\u0002\u0004\r\u0010\u0011\u0012\u0013").intern(), T((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 20, "⇾ꤻ禫ꫳ⟕㩿ꝧ᫁誓\ued55ጐ셉\uf22a㦨䂿\ue8dc⢾癤苚哠").intern());
        this.f13362l = c1218z;
        this.f13372v = false;
        this.f13374x = z2;
        this.f13375y = a5;
        this.f13363m = new Handler(Looper.getMainLooper());
        W w2 = new W();
        C c10 = new C();
        c10.f13539b = w2;
        this.f13364n = c10;
        this.f13365o = new D(w2);
        this.f13366p = new E(w2);
        this.f13367q = new C();
        f13355F = (f13354E + 15) % 128;
        String strM = this.k.m(T(14 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "䘽駘墧૱ি욤\uf365㕌潿椵ᆻꢘ苆깯").intern());
        if (strM != null) {
            try {
                jSONObject = new JSONObject(strM);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject = new JSONObject();
            int i5 = f13354E + 1;
            f13355F = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        j(jSONObject);
        this.f13539b = w2;
        this.f13371u = eb2;
        this.f13369s = new ArrayList();
        this.f13370t = new ArrayList();
        int i10 = f13355F + 115;
        f13354E = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public final boolean R() {
        int i5 = f13354E + 55;
        f13355F = i5 % 128;
        boolean zOptBoolean = i5 % 2 == 0 ? e().optBoolean(T(4 / Color.red(1), "㫚웵潿椵").intern(), false) : e().optBoolean(T(Color.red(0) + 4, "㫚웵潿椵").intern(), true);
        int i10 = f13354E + 53;
        f13355F = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
        return zOptBoolean;
    }

    public final synchronized void U(boolean z2) {
        int i5 = f13354E;
        int i10 = i5 + 23;
        f13355F = i10 % 128;
        if (i10 % 2 == 0) {
            this.f13372v = z2;
            throw null;
        }
        this.f13372v = z2;
        f13355F = (i5 + 61) % 128;
    }

    public final boolean V(String str, String str2) {
        int i5 = f13354E + 41;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            a0(str);
            throw null;
        }
        K kA0 = a0(str);
        if (kA0 == null || !kA0.b(str2)) {
            return true;
        }
        f13355F = (f13354E + 117) % 128;
        return false;
    }

    public final HashMap X() {
        HashMap map = new HashMap();
        try {
            String strOptString = e().optString(W((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 67), 3 - (Process.myTid() >> 22), "\u0003\u0004·").intern());
            if (!TextUtils.isEmpty(strOptString)) {
                map = Ab.M(new JSONObject(strOptString), new m9.S(27));
            }
        } catch (JSONException e7) {
            Ab.a0(W((byte) (Color.red(0) + 58), AndroidCharacter.getMirror('0') - '$', "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013").intern(), T((KeyEvent.getMaxKeyCode() >> 16) + 31, "䆷拲史紎톲꧀扨ﲅ듬ጘ烡\uf7b2货\uf749輥ﳁ誓\ued55雒뺄끘\ua82e鈐滟翤괚ꭏ㶪⋺\ueb2a苆깯").intern(), e7, false);
        }
        f13355F = (f13354E + 33) % 128;
        return map;
    }

    public final void Z(X x5) {
        int i5 = f13354E + 9;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Handler handler = this.f13363m;
        if (handler != null) {
            C1206y c1206y = new C1206y(11);
            c1206y.f14799e = this;
            c1206y.f14798d = x5;
            handler.post(c1206y);
            f13354E = (f13355F + 51) % 128;
        }
    }

    public final K a0(String str) {
        if (str != null) {
            f13355F = (f13354E + 97) % 128;
            return (K) X().get(str);
        }
        f13354E = (f13355F + 115) % 128;
        return null;
    }

    public final void c0(long j8) {
        boolean z2;
        int i5 = f13355F + 45;
        int i10 = i5 % 128;
        f13354E = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        if (this.f13356A) {
            return;
        }
        int i11 = i10 + 25;
        f13355F = i11 % 128;
        if (i11 % 2 == 0) {
            Ra ra2 = this.k;
            String strIntern = W((byte) (23 % (ViewConfiguration.getKeyRepeatTimeout() - 48)), KeyEvent.keyCodeFromString("") + 119, "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099").intern();
            String strValueOf = String.valueOf(j8);
            ra2.getClass();
            Ra.f13661d = (Ra.f13660c + 17) % 128;
            ra2.j(strIntern, strValueOf);
            Ra.f13660c = (Ra.f13661d + 97) % 128;
            z2 = false;
        } else {
            Ra ra3 = this.k;
            String strIntern2 = W((byte) (41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 37 - KeyEvent.keyCodeFromString(""), "\t\n\u0010\u0013\u000e\u0007\u0007\u0002\n\u0007\u000e\t\u0005\u0016\n\u0013\u0014\u0005\u0002\b\r\t\u0018\u0016\u0004\u0007\u0005\u0002\u0016\u0013\u0002\u0001\u0002\t\u0006\u0004\u0099").intern();
            String strValueOf2 = String.valueOf(j8);
            ra3.getClass();
            Ra.f13661d = (Ra.f13660c + 17) % 128;
            ra3.j(strIntern2, strValueOf2);
            Ra.f13660c = (Ra.f13661d + 97) % 128;
            z2 = true;
        }
        this.f13356A = z2;
    }

    public final void d0(C1014j c1014j) {
        int i5 = f13355F + 79;
        f13354E = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        Handler handler = this.f13363m;
        if (handler != null) {
            C1206y c1206y = new C1206y(10);
            c1206y.f14799e = this;
            c1206y.f14798d = c1014j;
            handler.post(c1206y);
            f13354E = (f13355F + 107) % 128;
        }
    }

    public final boolean f0() {
        f13354E = (f13355F + 89) % 128;
        boolean zOptBoolean = e().optBoolean(T(Gravity.getAbsoluteGravity(0, 0) + 3, "蛰\uf1b8\u206d斟").intern(), false);
        int i5 = f13354E + 55;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 14 / 0;
        }
        return zOptBoolean;
    }

    public final String g0(String str) {
        f13354E = (f13355F + 57) % 128;
        K kA0 = a0(str);
        if (kA0 == null) {
            return null;
        }
        int i5 = K.f13467f + 103;
        K.f13468g = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        int i10 = f13355F + 103;
        f13354E = i10 % 128;
        if (i10 % 2 == 0) {
            return kA0.f13471c;
        }
        throw null;
    }

    public final void i0(Context context, H h10, boolean z2) {
        f13354E = (f13355F + 95) % 128;
        this.f13357B = h10;
        if (z2) {
            F f10 = new F(2);
            f10.f13328d = this;
            G gS = S();
            gS.getClass();
            f13354E = (f13355F + 93) % 128;
            int iOptInt = gS.e().optInt(T(4 - (Process.myPid() >> 22), "沸\ue0fe樵㘄").intern(), gS.f13360i);
            f13355F = (f13354E + 109) % 128;
            Cb.a(f10, iOptInt);
            f13355F = (f13354E + 37) % 128;
        }
        U(false);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new C1052lb(context, h10, F()).c(new JSONObject(), y().a().f(), true, false);
        } catch (JSONException e7) {
            Ab.R(W((byte) (58 - View.combineMeasuredStates(0, 0)), 13 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u000f\u0004\u0004\u000b\u0005\u0002\u0018\n\u0010\u0011\u0012\u0013").intern(), T(26 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "䆷拲史紎톲꧀ප\ue6b1련첨徊锫浝덁ᙯ诹\ue43a艖〟㲇\uea37ꜣ澑\u2e76\uef06\uda48").intern(), e7);
        }
        C1218z c1218zY = y();
        A a5 = this.f13375y;
        String strIntern = T((ViewConfiguration.getTouchSlop() >> 8) + 4, "扨ﲅ댿╓").intern();
        a5.getClass();
        int i5 = A.f13173e + 7;
        A.f13174f = i5 % 128;
        int i10 = i5 % 2;
        String str = a5.f13175a;
        if (i10 == 0) {
            A.b(str, strIntern);
            throw null;
        }
        String strB = A.b(str, strIntern);
        C0935cb c0935cb = new C0935cb();
        c0935cb.f14083c = this;
        c0935cb.f14081a = context;
        c0935cb.f14082b = h10;
        c1218zY.i(strB, jSONObject, c0935cb);
    }

    @Override // Va.Mb
    public final synchronized void j(JSONObject jSONObject) {
        try {
            f13355F = (f13354E + 75) % 128;
            boolean zHas = jSONObject.has(T((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, "蘳鱟鎟ﯷ䏈\uec9a").intern());
            int i5 = f13354E + 29;
            int i10 = i5 % 128;
            f13355F = i10;
            if (i5 % 2 == 0) {
                int i11 = 4 / 0;
            }
            if (zHas) {
                f13354E = (i10 + 55) % 128;
                Ab.g0(jSONObject, jSONObject.optJSONObject(T(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7, "蘳鱟鎟ﯷ䏈\uec9a").intern()));
                int i12 = (f13354E + 85) % 128;
                f13355F = i12;
                f13354E = (i12 + 49) % 128;
            }
            super.j(jSONObject);
            this.f13364n.j(jSONObject);
            this.f13365o.j(jSONObject);
            this.f13366p.j(jSONObject);
            this.f13367q.j(jSONObject);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean t() {
        JSONObject jSONObjectE;
        String strW;
        int i5 = f13355F + 83;
        f13354E = i5 % 128;
        if (i5 % 2 != 0) {
            jSONObjectE = e();
            strW = W((byte) (38 % View.resolveSizeAndState(1, 1, 0)), 3 / TextUtils.lastIndexOf("", 'g'), "\t\u0001ç");
        } else {
            jSONObjectE = e();
            strW = W((byte) (View.resolveSizeAndState(0, 0, 0) + 115), TextUtils.lastIndexOf("", '0') + 4, "\t\u0001ç");
        }
        boolean zOptBoolean = jSONObjectE.optBoolean(strW.intern());
        int i10 = f13354E + 39;
        f13355F = i10 % 128;
        if (i10 % 2 != 0) {
            return zOptBoolean;
        }
        throw null;
    }

    public final boolean u() {
        JSONObject jSONObjectE;
        int mirror;
        int iLastIndexOf;
        int i5 = f13354E + 59;
        f13355F = i5 % 128;
        if (i5 % 2 == 0) {
            jSONObjectE = e();
            mirror = '^' / AndroidCharacter.getMirror('5');
            iLastIndexOf = 100 << TextUtils.lastIndexOf("", '\n');
        } else {
            jSONObjectE = e();
            mirror = '4' - AndroidCharacter.getMirror('0');
            iLastIndexOf = 117 - TextUtils.lastIndexOf("", '0');
        }
        boolean zOptBoolean = jSONObjectE.optBoolean(W((byte) iLastIndexOf, mirror, "\u0002\u0006\u0007\f").intern());
        int i10 = f13354E + 29;
        f13355F = i10 % 128;
        if (i10 % 2 != 0) {
            return zOptBoolean;
        }
        throw null;
    }

    public final synchronized void x() {
        try {
            f13355F = (f13354E + 21) % 128;
            Handler handler = this.f13363m;
            if (handler != null) {
                F f10 = new F(1);
                f10.f13328d = this;
                handler.post(f10);
            }
            int i5 = f13354E + 81;
            f13355F = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 56 / 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized C1218z y() {
        C1218z c1218z;
        int i5 = (f13354E + 13) % 128;
        f13355F = i5;
        c1218z = this.f13362l;
        int i10 = i5 + 125;
        f13354E = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return c1218z;
    }

    public final int z() {
        JSONObject jSONObjectE;
        int iIndexOf;
        int iLastIndexOf;
        int i5 = f13354E + 113;
        f13355F = i5 % 128;
        int i10 = i5 % 2;
        int i11 = this.f13358g;
        if (i10 == 0) {
            jSONObjectE = e();
            iIndexOf = 4 << TextUtils.indexOf("", "", 1, 0);
            iLastIndexOf = 96 << TextUtils.lastIndexOf("", (char) 5, 0, 0);
        } else {
            jSONObjectE = e();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 3;
            iLastIndexOf = 93 - TextUtils.lastIndexOf("", '0', 0, 0);
        }
        return jSONObjectE.optInt(W((byte) iLastIndexOf, iIndexOf, "\b\rÒ").intern(), i11);
    }
}
