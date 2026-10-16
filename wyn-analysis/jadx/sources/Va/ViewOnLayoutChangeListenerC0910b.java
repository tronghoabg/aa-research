package Va;

import E5.C0441b;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0910b extends Mb implements View.OnLayoutChangeListener {

    /* renamed from: p, reason: collision with root package name */
    public static int f14001p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static int f14002q = 1;

    /* renamed from: g, reason: collision with root package name */
    public List f14003g;

    /* renamed from: h, reason: collision with root package name */
    public String f14004h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14005i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14006j;
    public C1091ob k;

    /* renamed from: m, reason: collision with root package name */
    public C1218z f14008m;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14010o;

    /* renamed from: l, reason: collision with root package name */
    public final WeakHashMap f14007l = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f14009n = new ArrayList();

    public ViewOnLayoutChangeListenerC0910b(int i5) {
        this.f14010o = i5;
    }

    public static /* synthetic */ void B(ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b, WebView webView) {
        f14002q = (f14001p + 55) % 128;
        viewOnLayoutChangeListenerC0910b.A(webView);
        int i5 = f14001p + 105;
        f14002q = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ List E(ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b) {
        int i5 = f14001p + 33;
        int i10 = i5 % 128;
        f14002q = i10;
        int i11 = i5 % 2;
        List list = viewOnLayoutChangeListenerC0910b.f14003g;
        if (i11 == 0) {
            int i12 = 91 / 0;
        }
        int i13 = i10 + 95;
        f14001p = i13 % 128;
        if (i13 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public static /* synthetic */ JSONObject u(String str) throws UnsupportedEncodingException {
        int i5 = f14002q + 89;
        f14001p = i5 % 128;
        if (i5 % 2 != 0) {
            z(str);
            throw null;
        }
        JSONObject jSONObjectZ = z(str);
        int i10 = f14001p + 95;
        f14002q = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 48 / 0;
        }
        return jSONObjectZ;
    }

    public static String y(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i10];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i10) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i11);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 135);
                    Ab.f13219v = i12 + 1;
                }
                if (i5 > 0) {
                    Ab.f13220w = i5;
                    char[] cArr2 = new char[i10];
                    System.arraycopy(cArr, 0, cArr2, 0, i10);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i10 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i10 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i10];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr3[i15] = cArr[(i10 - i15) - 1];
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

    public static JSONObject z(String str) throws UnsupportedEncodingException {
        f14002q = (f14001p + 91) % 128;
        try {
            String strDecode = URLDecoder.decode(str, y("￩\u0002\u0010\u0011\ufff4", 4 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.rgb(0, 0, 0) + 16777221, 203 - TextUtils.getTrimmedLength(""), true).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                JSONObject jSONObject = new JSONObject(strDecode);
                f14002q = (f14001p + 59) % 128;
                return jSONObject;
            }
        } catch (Exception e7) {
            Ab.R(y("\u0003￠\u0016\u0004\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7", View.MeasureSpec.getSize(0) + 9, 17 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 232 - View.getDefaultSize(0, 0), true).intern(), y("\b\r\u0006\uffbf\u0003\u0000\u0013\u0000￤\u0011\u0011\u000e\u0011\uffbf\u0006\u0004\u0013\u0013", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 9, 18 - (ViewConfiguration.getPressedStateDuration() >> 16), KeyEvent.getDeadChar(0, 0) + 232, false).intern(), e7);
        }
        return new JSONObject();
    }

    public final void A(WebView webView) {
        C1091ob c1091ob = (C1091ob) this.f14007l.get(webView);
        if (this.f14005i) {
            f14002q = (f14001p + 19) % 128;
            C0441b c0441b = c1091ob.f14465b;
            c0441b.getClass();
            int i5 = C0441b.f3287g;
            int i10 = i5 + 115;
            C0441b.f3288h = i10 % 128;
            int i11 = i10 % 2;
            boolean z2 = c0441b.f3290b;
            if (i11 == 0) {
                int i12 = 47 / 0;
            }
            C0441b.f3288h = (i5 + 79) % 128;
            if (z2) {
                Ab.f13208j = (Ab.f13207i + 25) % 128;
                boolean z10 = Ab.F(webView) instanceof V9;
                int i13 = Ab.f13207i + 1;
                Ab.f13208j = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 4 / 0;
                }
                if (!z10) {
                    c1091ob.f14465b.t(new C1065mb(c1091ob));
                    f14001p = (f14002q + 99) % 128;
                }
                f14001p = (f14002q + 111) % 128;
                C1218z c1218z = this.f14008m;
                c1218z.getClass();
                try {
                    Cb.j(new C1206y(23, c1218z, webView));
                    C1218z.k = (C1218z.f14828j + 85) % 128;
                } catch (Exception e7) {
                    String strIntern = C1218z.d(167 - TextUtils.indexOf("", "", 0), "陣零霘鞗铁锒閩鋯鍿鎢郜酳醅鸬齢龒鰶").intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C1218z.d(229 - AndroidCharacter.getMirror('0'), "陱雳霬鑄钒閝鉣銩鏶逌酅醇鸡齫龵鲏鴎驂骮鬯顿飍駍蘒蚮蟏萿蕆薏芏茢").intern());
                    sb2.append(e7.getLocalizedMessage());
                    Ab.x(strIntern, sb2.toString());
                }
                int i15 = (f14002q + 99) % 128;
                f14001p = i15;
                f14002q = (i15 + 47) % 128;
            }
        }
    }

    public final void C(WebView webView) {
        if (webView != null) {
            f14002q = (f14001p + 107) % 128;
            WeakHashMap weakHashMap = this.f14007l;
            if (weakHashMap.containsKey(webView)) {
                return;
            }
            C1091ob c1091obF = C1091ob.f(webView, y("\rￛￛ￦\u0017\u000e\u0018\u000f\u0010", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, 219 - View.combineMeasuredStates(0, 0), true).intern());
            if (this.k == null) {
                this.k = c1091obF;
            }
            weakHashMap.put(webView, c1091obF);
            Vb vb2 = new Vb(this);
            f14001p = (f14002q + 35) % 128;
            this.f14009n.add(vb2);
            c1091obF.f14466c.add(vb2);
            A(webView);
            webView.addOnLayoutChangeListener(this);
            f14001p = (f14002q + 105) % 128;
        }
    }

    public final InterfaceC0950e0 D() {
        int i5 = f14001p;
        int i10 = i5 + 13;
        f14002q = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        C1091ob c1091ob = this.k;
        if (c1091ob == null) {
            return null;
        }
        int i11 = i5 + 33;
        f14002q = i11 % 128;
        if (i11 % 2 != 0) {
            return c1091ob.e();
        }
        c1091ob.e();
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f14007l.containsKey(webView)) {
                    int i17 = f14002q + 79;
                    f14001p = i17 % 128;
                    if (i17 % 2 != 0) {
                        A(webView);
                        throw null;
                    }
                    A(webView);
                }
            }
            int i18 = f14001p + 101;
            f14002q = i18 % 128;
            if (i18 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            Ab.a0(y("\u0003￠\u0016\u0004\b\ufff5\u0001\u0004\ufff6\u0011\u0004\u000b\u0003\r\u0000\uffe7", 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 16 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 232, true).intern(), y("\u0014\u000e\u0018\u0000￫\r\u000e\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0006\r\u0000\u0007￢\u0013", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, 23 - (ViewConfiguration.getTouchSlop() >> 8), 231 - TextUtils.indexOf((CharSequence) "", '0'), true).intern(), th, false);
        }
    }

    @Override // Va.Mb
    public final String q(Object obj) {
        int i5 = f14001p;
        String str = this.f14004h;
        f14002q = (i5 + 63) % 128;
        return str;
    }

    @Override // Va.Mb, Va.Lb
    public final void r(JSONObject jSONObject, View view, Object obj) {
        int i5 = f14002q;
        f14001p = (i5 + 107) % 128;
        f14001p = (i5 + 9) % 128;
        jSONObject.remove(AbstractC1141sa.f14615f);
        super.r(jSONObject, (WebView) view, obj);
        f14001p = (f14002q + 51) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    public final Object t(WebView webView) {
        switch (this.f14010o) {
            case 0:
                Rect rect = Bb.f13245a;
                WebView webView2 = webView;
                while (webView2.getParent() instanceof View) {
                    webView2 = (View) webView2.getParent();
                }
                return webView2;
            default:
                return Bb.b(webView);
        }
    }

    @Override // Va.Mb, Va.Lb
    public final /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) throws JSONException {
        int i5 = f14001p + 95;
        f14002q = i5 % 128;
        int i10 = i5 % 2;
        x(jSONObject, (WebView) view, obj);
        if (i10 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(org.json.JSONObject r4, android.webkit.WebView r5, java.lang.Object r6) throws org.json.JSONException {
        /*
            r3 = this;
            int r0 = Va.ViewOnLayoutChangeListenerC0910b.f14002q
            int r0 = r0 + 17
            int r1 = r0 % 128
            Va.ViewOnLayoutChangeListenerC0910b.f14001p = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 76
            int r0 = r0 / r1
            if (r5 == 0) goto L31
            goto L15
        L13:
            if (r5 == 0) goto L31
        L15:
            java.lang.String r0 = Va.AbstractC1141sa.f14602W     // Catch: org.json.JSONException -> L31
            android.os.IBinder r2 = r5.getWindowToken()     // Catch: org.json.JSONException -> L31
            if (r2 == 0) goto L26
            int r1 = Va.ViewOnLayoutChangeListenerC0910b.f14002q
            int r1 = r1 + 7
            int r1 = r1 % 128
            Va.ViewOnLayoutChangeListenerC0910b.f14001p = r1
            r1 = 1
        L26:
            r4.put(r0, r1)     // Catch: org.json.JSONException -> L31
            int r0 = Va.ViewOnLayoutChangeListenerC0910b.f14001p
            int r0 = r0 + 89
            int r0 = r0 % 128
            Va.ViewOnLayoutChangeListenerC0910b.f14002q = r0
        L31:
            super.v(r4, r5, r6)
            int r4 = Va.ViewOnLayoutChangeListenerC0910b.f14001p
            int r4 = r4 + 43
            int r4 = r4 % 128
            Va.ViewOnLayoutChangeListenerC0910b.f14002q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.ViewOnLayoutChangeListenerC0910b.x(org.json.JSONObject, android.webkit.WebView, java.lang.Object):void");
    }
}
