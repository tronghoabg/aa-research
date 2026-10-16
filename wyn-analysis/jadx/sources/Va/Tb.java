package Va;

import android.R;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Tb extends Pb implements InterfaceC0948db {

    /* renamed from: r, reason: collision with root package name */
    public static final String f13726r = Q("ￊ\uffdd\u0000\uffef\u0004\u000b\u0013\n\uffff\u000b\tￊ\u0005\u000e\u000b\n\u000f\u000b\u0011\u000e\uffff\u0001ￊ�\u0000\r\u0011�\b\u0005\u0010\u0015\u000f\u0000\u0007ￊ\u000f\u0000\u0007", (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 38, 8 - Color.argb(0, 0, 0, 0), (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 185, false).intern();

    /* renamed from: s, reason: collision with root package name */
    public static int f13727s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static int f13728t = 1;
    public C1105q k;

    /* renamed from: l, reason: collision with root package name */
    public Class f13729l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f13730m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13731n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13732o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13733p;

    /* renamed from: q, reason: collision with root package name */
    public Sb f13734q;

    static {
        int i5 = f13728t + 57;
        f13727s = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static String E(Activity activity) {
        int i5 = f13727s + 109;
        f13728t = i5 % 128;
        int i10 = i5 % 2;
        int iHashCode = activity.hashCode();
        if (i10 != 0) {
            return Integer.toHexString(iHashCode);
        }
        Integer.toHexString(iHashCode);
        throw null;
    }

    public static /* synthetic */ Sb F(Tb tb) {
        int i5 = f13727s + 117;
        int i10 = i5 % 128;
        f13728t = i10;
        int i11 = i5 % 2;
        Sb sb2 = tb.f13734q;
        if (i11 == 0) {
            int i12 = 98 / 0;
        }
        f13727s = (i10 + 107) % 128;
        return sb2;
    }

    public static /* synthetic */ void H(Tb tb, boolean z2) {
        int i5 = f13728t + 63;
        int i10 = i5 % 128;
        f13727s = i10;
        int i11 = i5 % 2;
        tb.f13731n = z2;
        if (i11 != 0) {
            throw null;
        }
        f13728t = (i10 + 29) % 128;
    }

    public static /* synthetic */ void K(Tb tb, boolean z2) {
        int i5 = f13727s + 67;
        int i10 = i5 % 128;
        f13728t = i10;
        int i11 = i5 % 2;
        tb.f13730m = z2;
        if (i11 == 0) {
            int i12 = 1 / 0;
        }
        f13727s = (i10 + 79) % 128;
    }

    public static /* synthetic */ boolean L(Tb tb) {
        int i5 = f13727s;
        boolean z2 = tb.f13731n;
        int i10 = i5 + 87;
        f13728t = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 69 / 0;
        }
        return z2;
    }

    public static /* synthetic */ boolean N(Tb tb) {
        int i5 = (f13728t + 29) % 128;
        f13727s = i5;
        boolean z2 = tb.f13730m;
        int i10 = i5 + 69;
        f13728t = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 51 / 0;
        }
        return z2;
    }

    public static InterfaceC0948db O(Tb tb) {
        int i5 = (f13728t + 83) % 128;
        f13727s = i5;
        C1105q c1105q = tb.k;
        int i10 = i5 + 41;
        int i11 = i10 % 128;
        f13728t = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 89;
        f13727s = i12 % 128;
        if (i12 % 2 == 0) {
            return c1105q;
        }
        throw null;
    }

    public static /* synthetic */ void P(Tb tb, boolean z2) {
        int i5 = (f13728t + 117) % 128;
        f13727s = i5;
        tb.f13733p = z2;
        int i10 = i5 + 15;
        f13728t = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static String Q(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i11);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'V');
                    Ab.f13219v = i12 + 1;
                }
                if (i10 > 0) {
                    Ab.f13220w = i10;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ boolean S(Tb tb, Activity activity) {
        int i5 = f13728t + 97;
        f13727s = i5 % 128;
        if (i5 % 2 != 0) {
            tb.D(activity);
            throw null;
        }
        boolean zD = tb.D(activity);
        f13727s = (f13728t + 75) % 128;
        return zD;
    }

    @Override // Va.Pb
    public final Lb A() {
        int i5 = (f13727s + 25) % 128;
        f13728t = i5;
        int i10 = i5 + 11;
        f13727s = i10 % 128;
        if (i10 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // Va.Pb
    public final /* synthetic */ void B(Object obj, ArrayList arrayList) {
        int i5 = f13727s + 85;
        f13728t = i5 % 128;
        int i10 = i5 % 2;
        J((Activity) obj, arrayList);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f13728t + 69;
        f13727s = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.Pb
    public final ViewOnLayoutChangeListenerC0910b C() {
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = new ViewOnLayoutChangeListenerC0910b(1);
        int i5 = f13728t + 61;
        f13727s = i5 % 128;
        if (i5 % 2 == 0) {
            return viewOnLayoutChangeListenerC0910b;
        }
        throw null;
    }

    public final boolean D(Activity activity) {
        int i5 = f13727s + 89;
        f13728t = i5 % 128;
        if (i5 % 2 == 0) {
            activity.getClass();
            throw null;
        }
        Class<?> cls = activity.getClass();
        Class cls2 = this.f13729l;
        if (cls2 == null) {
            return false;
        }
        Sb sb2 = this.f13734q;
        int i10 = Sb.f13692s + 41;
        Sb.f13693t = i10 % 128;
        if (i10 % 2 == 0) {
            boolean z2 = sb2.f13697o;
            throw null;
        }
        if (sb2.f13697o) {
            f13727s = (f13728t + 3) % 128;
            return cls2.equals(cls);
        }
        boolean zIsAssignableFrom = cls2.isAssignableFrom(cls);
        f13728t = (f13727s + 103) % 128;
        return zIsAssignableFrom;
    }

    public final void G(Ba ba2) {
        int i5 = f13728t;
        f13727s = (i5 + 37) % 128;
        Sb sb2 = this.f13734q;
        int i10 = Sb.f13693t + 11;
        Sb.f13692s = i10 % 128;
        if (i10 % 2 != 0) {
            boolean z2 = sb2.f13698p;
            throw null;
        }
        if (sb2.f13698p) {
            f13727s = (i5 + 7) % 128;
            Cb.g(ba2);
            return;
        }
        Cb.c(ba2);
        int i11 = f13727s + 107;
        f13728t = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 29 / 0;
        }
    }

    public final void I(Activity activity) {
        boolean z2;
        int i5 = f13728t + 81;
        f13727s = i5 % 128;
        if (i5 % 2 != 0) {
            y(activity);
            z2 = true;
        } else {
            y(activity);
            z2 = false;
        }
        this.f13730m = z2;
        int i10 = f13728t + 37;
        f13727s = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public final void J(Activity activity, ArrayList arrayList) {
        f13728t = (f13727s + 57) % 128;
        Sb sb2 = this.f13734q;
        int i5 = (Sb.f13693t + 57) % 128;
        Sb.f13692s = i5;
        int i10 = sb2.f13696n;
        int i11 = (i5 + 115) % 128;
        Sb.f13693t = i11;
        String str = sb2.f13695m;
        int i12 = i11 + 3;
        Sb.f13692s = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        Bb.c(activity, WebView.class, i10, str, false, false, null, sb2.k, arrayList);
        f13727s = (f13728t + 5) % 128;
    }

    public final void M(JSONObject jSONObject) {
        Sb sb2 = new Sb();
        sb2.f13698p = false;
        String strOptString = jSONObject.optString(Sb.c(14 - Color.blue(0), new int[]{110861797, 1873315360, 228774982, -294014984, -688991972, -831075650, -373437540, 2139413457}).intern());
        int i5 = Sb.f13692s;
        sb2.f13694l = strOptString;
        int i10 = i5 + 65;
        Sb.f13693t = i10 % 128;
        List listAsList = null;
        if (i10 % 2 == 0) {
            throw null;
        }
        String strOptString2 = jSONObject.optString(Sb.c(21 - ImageFormat.getBitsPerPixel(0), new int[]{-1752479271, -1042432582, 664075875, 1091981003, 1984091575, 1163054, 643777341, 1366410695, -770897417, 545996799, -1044474678, 1491461728}).intern());
        int i11 = Sb.f13693t + 93;
        Sb.f13692s = i11 % 128;
        if (i11 % 2 != 0) {
            sb2.f13695m = strOptString2;
            throw null;
        }
        sb2.f13695m = strOptString2;
        int iOptInt = jSONObject.optInt(Sb.b((byte) (45 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ExpandableListView.getPackedPositionGroup(0L) + 9, "\u0001\u0002\u0003\u0004\u0005\u0002\u0001\u0000\u0091").intern(), -1);
        boolean z2 = true;
        int i12 = Sb.f13693t + 1;
        Sb.f13692s = i12 % 128;
        if (i12 % 2 != 0) {
            sb2.f13696n = iOptInt;
            int i13 = 95 / 0;
        } else {
            sb2.f13696n = iOptInt;
        }
        boolean zOptBoolean = jSONObject.optBoolean(Sb.c(Color.blue(0) + 17, new int[]{1923435107, 1222916028, 1159168648, 1170524044, 1536218711, -1088404685, -1457568720, -1023689468, -590260993, 967750160}).intern());
        int i14 = (Sb.f13693t + 19) % 128;
        Sb.f13692s = i14;
        sb2.f13697o = zOptBoolean;
        Sb.f13693t = (i14 + 105) % 128;
        boolean zOptBoolean2 = jSONObject.optBoolean(Sb.b((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 113), View.combineMeasuredStates(0, 0) + 19, "\b\t\n\u000b\b\u0006\b\u0005\b\t\r\u000e\u000f\u0010\r\u0004\u0006\bê").intern());
        int i15 = Sb.f13693t + 9;
        int i16 = i15 % 128;
        Sb.f13692s = i16;
        if (i15 % 2 != 0) {
            sb2.f13698p = zOptBoolean2;
            int i17 = 52 / 0;
        } else {
            sb2.f13698p = zOptBoolean2;
        }
        Sb.f13693t = (i16 + 33) % 128;
        sb2.f13580a = jSONObject.optString(Sb.b((byte) (View.resolveSizeAndState(0, 0, 0) + 26), 11 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0013\f\u0015\r\u0002\u0017\u0013\u0000\t\n").intern());
        if (!TextUtils.isEmpty(jSONObject.optString(Sb.b((byte) (57 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0016\u0017\u0011\u001d\u0013\u0004\u001c\u0000±").intern()))) {
            listAsList = Arrays.asList(jSONObject.optString(Sb.b((byte) (57 - Color.green(0)), 9 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0016\u0017\u0011\u001d\u0013\u0004\u001c\u0000±").intern()).split(Sb.c(1 - TextUtils.indexOf("", "", 0), new int[]{-1141725306, 1355340037}).intern()));
        }
        sb2.f13581b = listAsList;
        sb2.f13582c = jSONObject.optBoolean(Sb.c(13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new int[]{-1698729061, 276156775, 1415576551, 347999924, 259954383, 961576448, -231447354, 2054643204}).intern());
        sb2.f13583d = jSONObject.optBoolean(Sb.c(13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new int[]{1379343212, 1582308888, -1069536053, 1630375662, 1830789992, -1659271692, -2128320065, 952894960}).intern(), true);
        if (TextUtils.isEmpty(jSONObject.optString(Sb.b((byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25), 10 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0013\f\u0015\r\u0002\u0017\u0013\u0000\t\n").intern()))) {
            if (!jSONObject.optBoolean(Sb.c(16 - View.MeasureSpec.getMode(0), new int[]{-1698729061, 276156775, 1415576551, 347999924, 1073619481, -213202403, 819488008, 945135485}).intern())) {
                if (!jSONObject.optBoolean(Sb.c(17 - TextUtils.lastIndexOf("", '0', 0, 0), new int[]{-1698729061, 276156775, 1419651812, 2046204233, -1368412158, -120072843, -2062066468, -1489483628, -338339342, -1817397070}).intern())) {
                    z2 = false;
                }
            }
        }
        sb2.f13585f = z2;
        sb2.f13586g = jSONObject.optBoolean(Sb.c(Color.argb(0, 0, 0, 0) + 16, new int[]{-1698729061, 276156775, 1415576551, 347999924, 1073619481, -213202403, 819488008, 945135485}).intern());
        sb2.f13587h = jSONObject.optBoolean(Sb.c(Color.rgb(0, 0, 0) + 16777226, new int[]{-908856246, 199068797, -1839323357, 847500965, -1693961333, -2019971432}).intern());
        sb2.f13584e = jSONObject.optBoolean(Sb.c((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, new int[]{1564242106, 1799551898, 1846526607, -1018900792, -1969434006, -101790165, 1415576551, 347999924, -1244815100, -1199297533}).intern());
        sb2.f13588i = jSONObject.optBoolean(Sb.b((byte) (73 - MotionEvent.axisFromString("")), 17 - (ViewConfiguration.getScrollBarSize() >> 8), "\u001b\u0014\u0006\n\u0003\u001c\u0007\u0005\u0002\u0017\u000f\u0007\b\u0013\u0007\u0002½").intern());
        sb2.f13589j = jSONObject.optBoolean(Sb.b((byte) (102 - (Process.myPid() >> 22)), Drawable.resolveOpacity(0, 0) + 9, "\u0002\u001c\u001c\u001d\u0015\u0012\u0010\u000eÚ").intern());
        ArrayList arrayListI = Ab.i(jSONObject.optJSONArray(Sb.b((byte) (TextUtils.getOffsetBefore("", 0) + 108), 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), "\u001c\u0005\u0002\u0001\u0013\u0019\u0011\u0003 \u0012\u0010\u0015Ñ").intern()));
        if (arrayListI != null) {
            sb2.k = arrayListI;
        }
        this.f13616j = sb2;
        this.f13734q = sb2;
        Cb.j(new C1169v(this, 27));
        f13727s = (f13728t + 83) % 128;
    }

    public final void R(C1105q c1105q) {
        int i5 = (f13728t + 93) % 128;
        f13727s = i5;
        this.k = c1105q;
        int i10 = i5 + 105;
        f13728t = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 33 / 0;
        }
    }

    @Override // Va.InterfaceC0948db
    public final void b(Activity activity) {
        Qb qb = new Qb(2);
        qb.f13643e = this;
        qb.f13642d = activity;
        Cb.e(qb);
        f13728t = (f13727s + 41) % 128;
    }

    @Override // Va.InterfaceC0948db
    public final void d(Activity activity) {
        Qb qb = new Qb(3);
        qb.f13643e = this;
        qb.f13642d = activity;
        Cb.e(qb);
        f13727s = (f13728t + 61) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Rb rb2 = new Rb(0);
        rb2.f13669f = this;
        rb2.f13667d = activity;
        rb2.f13668e = bundle;
        G(rb2);
        f13728t = (f13727s + 27) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        G(new Qb(this, activity, 1));
        int i5 = f13727s + 51;
        f13728t = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Qb qb = new Qb(0);
        qb.f13643e = this;
        qb.f13642d = activity;
        Cb.e(qb);
        int i5 = f13727s + 99;
        f13728t = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        G(new Qb(this, activity, 6));
        f13728t = (f13727s + 67) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Rb rb2 = new Rb(1);
        rb2.f13669f = this;
        rb2.f13667d = activity;
        rb2.f13668e = bundle;
        G(rb2);
        f13728t = (f13727s + 71) % 128;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Qb qb = new Qb(5);
        qb.f13643e = this;
        qb.f13642d = activity;
        Cb.e(qb);
        int i5 = f13727s + 15;
        f13728t = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        G(new Qb(this, activity, 4));
        f13728t = (f13727s + 19) % 128;
    }

    @Override // Va.Pb
    public final View t(Object obj) {
        int i5 = (f13727s + 111) % 128;
        f13728t = i5;
        f13727s = (i5 + 3) % 128;
        View viewFindViewById = ((Activity) obj).findViewById(R.id.content);
        int i10 = f13727s;
        int i11 = i10 + 29;
        f13728t = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 41 / 0;
        }
        int i13 = i10 + 65;
        f13728t = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 69 / 0;
        }
        return viewFindViewById;
    }
}
