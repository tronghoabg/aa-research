package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Vb implements InterfaceC1039kb {

    /* renamed from: b, reason: collision with root package name */
    public static int f13799b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f13800c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewOnLayoutChangeListenerC0910b f13801a;

    public Vb(ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b) {
        this.f13801a = viewOnLayoutChangeListenerC0910b;
    }

    public static void e(Vb vb2, WebView webView, String str, boolean z2) {
        int i5 = f13799b + 109;
        f13800c = i5 % 128;
        int i10 = i5 % 2;
        vb2.getClass();
        if (i10 == 0) {
            Cb.c(new Ub(vb2, webView, str, z2));
            int i11 = f13800c + 27;
            f13799b = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            throw null;
        }
        Cb.c(new Ub(vb2, webView, str, z2));
        int i12 = f13800c;
        int i13 = i12 + 27;
        f13799b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        f13799b = (i12 + 67) % 128;
    }

    public static String f(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 'd');
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

    public static String g(String str, int i5) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 21192)) ^ ((c11 >>> 5) + 63871)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 48595) ^ ((c12 + i11) ^ ((c12 << 4) + 5221))));
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

    @Override // Va.InterfaceC1039kb
    public final void a(WebView webView) {
        f13800c = (f13799b + 39) % 128;
        ViewOnLayoutChangeListenerC0910b.B(this.f13801a, webView);
        f13799b = (f13800c + 33) % 128;
    }

    @Override // Va.InterfaceC1039kb
    public final void b(WebView webView, String str, boolean z2) {
        Ub ub = new Ub();
        ub.f13767g = this;
        ub.f13764d = webView;
        ub.f13765e = str;
        ub.f13766f = z2;
        Cb.e(ub);
        f13799b = (f13800c + 121) % 128;
    }

    @Override // Va.InterfaceC1039kb
    public final void c(WebView webView, String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractC1141sa.f14619j, str);
            jSONObject.put(AbstractC1141sa.k, AbstractC1141sa.f14620l);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC1141sa.f14618i, jSONObject);
            ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = this.f13801a;
            viewOnLayoutChangeListenerC0910b.w(jSONObject2, webView, this, viewOnLayoutChangeListenerC0910b.t(webView));
            f13799b = (f13800c + 67) % 128;
        } catch (Exception e7) {
            Ab.a0(f("\ufff6\u0004\u0001\ufff5\b\u0004\u0016￠\u0003\uffe7\u0000\r\u0003\u000b\u0004\u0011", Gravity.getAbsoluteGravity(0, 0) + 16, Drawable.resolveOpacity(0, 0) + 16, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 196, false).intern(), f("\uffc0\u0012\u000f\u0012\u0012￥\u000e\u000f\u0013\n\uffc0\u0014\u000e\u0005\u0016\u0005\uffc0\u0003\u0003\u0017\uffc0\u0007\u000e\t\u0014\u0001\u0005\u0012\u0003", 6 - Color.argb(0, 0, 0, 0), AndroidCharacter.getMirror('0') - 19, 195 - TextUtils.indexOf((CharSequence) "", '0', 0), true).intern(), e7, false);
        }
    }

    @Override // Va.InterfaceC1039kb
    public final void d(WebView webView, String str, String str2) throws JSONException, UnsupportedEncodingException {
        f13799b = (f13800c + 7) % 128;
        String strSubstring = str2.substring(0, str2.indexOf(63));
        String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
        boolean zEquals = strSubstring.equals(f("\ufff9\ufffb\ufffa\f\u000b�", TextUtils.indexOf("", "") + 5, 6 - Color.argb(0, 0, 0, 0), View.combineMeasuredStates(0, 0) + 204, true).intern());
        ViewOnLayoutChangeListenerC0910b viewOnLayoutChangeListenerC0910b = this.f13801a;
        if (zEquals) {
            ViewOnLayoutChangeListenerC0910b.B(viewOnLayoutChangeListenerC0910b, webView);
            return;
        }
        if (strSubstring.equals(f("\ufffa￼\ufffb\r\f\ufffb", TextUtils.getOffsetBefore("", 0) + 5, 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 204 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), true).intern())) {
            f13799b = (f13800c + 63) % 128;
            viewOnLayoutChangeListenerC0910b.x(ViewOnLayoutChangeListenerC0910b.u(strSubstring2), webView, viewOnLayoutChangeListenerC0910b.t(webView));
            return;
        }
        if (strSubstring.equals(g("령봂行䂼⃜헡", 6 - Color.alpha(0)).intern())) {
            JSONObject jSONObjectU = ViewOnLayoutChangeListenerC0910b.u(strSubstring2);
            int i5 = ViewOnLayoutChangeListenerC0910b.f14002q + 17;
            ViewOnLayoutChangeListenerC0910b.f14001p = i5 % 128;
            if (i5 % 2 == 0) {
                viewOnLayoutChangeListenerC0910b.n(jSONObjectU, webView, viewOnLayoutChangeListenerC0910b.D(), viewOnLayoutChangeListenerC0910b.t(webView));
                return;
            } else {
                viewOnLayoutChangeListenerC0910b.D();
                throw null;
            }
        }
        if (strSubstring.equals(g("령봂行䂼ꍛ膈", 6 - KeyEvent.getDeadChar(0, 0)).intern())) {
            JSONObject jSONObjectU2 = ViewOnLayoutChangeListenerC0910b.u(strSubstring2);
            jSONObjectU2.remove(AbstractC1141sa.f14615f);
            viewOnLayoutChangeListenerC0910b.h(jSONObjectU2, webView, viewOnLayoutChangeListenerC0910b.t(webView));
        } else if (strSubstring.equals(f("\u000b\f\ufffa\ufffb\ufff9￼", Color.green(0) + 6, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 6, ExpandableListView.getPackedPositionChild(0L) + Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE, false).intern())) {
            f13800c = (f13799b + 123) % 128;
            JSONObject jSONObjectU3 = ViewOnLayoutChangeListenerC0910b.u(strSubstring2);
            String strOptString = jSONObjectU3.optString(g("诊镫緕쁟", 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
            String strOptString2 = jSONObjectU3.optString(g("笃\u2cf4瓋瘦緕쁟", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 5).intern());
            String strOptString3 = jSONObjectU3.optString(f("\u0007\ufffb\n��￼", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 3, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6, View.MeasureSpec.getSize(0) + 204, true).intern());
            String strOptString4 = jSONObjectU3.optString(g("笃\u2cf4령봂睎\ue4d0", 5 - ExpandableListView.getPackedPositionType(0L)).intern());
            Ab.f13213p = (Ab.f13212o + 93) % 128;
            try {
                Ab.l(strOptString, strOptString2, strOptString3, strOptString4);
                Ab.f13212o = (Ab.f13213p + 121) % 128;
            } catch (Throwable unused) {
            }
        }
    }
}
