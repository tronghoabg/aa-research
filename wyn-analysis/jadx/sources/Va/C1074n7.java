package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: Va.n7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1074n7 extends AbstractC1104pb {

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f14420M = {82, 65, -75, 88, 81, 80, -89, -120, 77, -82, -62, -45, -47, 30, -52, -46, -63, 53, -40, -47, -48, 39, 8, -51, 46, 109, 104, -102, 104, 111, -69, 77, -111, 27, -17, -52, -49, 30, -48, -51, -56, 58, -56, -49, 27, -19, 49, 72, 69, -77, -76, -98, 104, -76, -33, -35, 37, 34, -51, 32, 19, -22, 50, -36, -45, -32, -17, 9, -41, 55, -32, -17, 26, 27, -49, 56, 30, 24, 27, -20, -61, 7, 27, 8, 26, 21, -13, 45, -60, -30, -25, 29, -30, 14, 124, -51, 55, -55, 49, -63, -54, -35, 40, -29, 10, -56, -53, 54, -59, -46, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: N, reason: collision with root package name */
    public static int f14421N = 0;

    /* renamed from: O, reason: collision with root package name */
    public static int f14422O = 1;

    /* renamed from: K, reason: collision with root package name */
    public /* synthetic */ boolean f14423K;
    public /* synthetic */ C1214y7 L;

    public static String q0(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 114;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14420M[(-643014598) + i11] + 114);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 643014600) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 4067004);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14420M;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: L */
    public final void w(JSONObject jSONObject, WebView webView, Vb vb2, View view) {
        f14421N = (f14422O + 85) % 128;
        r0(q0((short) (AndroidCharacter.getMirror('0') - '0'), (-4066885) - View.resolveSizeAndState(0, 0, 0), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 95, 643014663 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) ((ViewConfiguration.getScrollBarSize() >> 8) - 26)).intern(), jSONObject, webView, vb2, view);
        f14422O = (f14421N + 51) % 128;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: M */
    public final void v(JSONObject jSONObject, WebView webView, View view) {
        f14421N = (f14422O + 13) % 128;
        r0(q0((short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-4066906) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-103) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 643014597, (byte) ((-83) - View.getDefaultSize(0, 0))).intern(), jSONObject, webView, null, view);
        int i5 = f14422O + 79;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: c0 */
    public final void s(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, View view) {
        f14421N = (f14422O + 111) % 128;
        r0(q0((short) (ViewConfiguration.getTapTimeout() >> 16), (-4066907) - Color.blue(0), AndroidCharacter.getMirror('0') - 153, 643014623 - TextUtils.getCapsMode("", 0, 0), (byte) ((-110) - TextUtils.indexOf("", "", 0, 0))).intern(), jSONObject, webView, interfaceC0950e0, view);
        f14421N = (f14422O + 65) % 128;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: d0 */
    public final void r(JSONObject jSONObject, WebView webView, View view) {
        f14421N = (f14422O + 51) % 128;
        r0(q0((short) Color.argb(0, 0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 4066907, (-97) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 643014608, (byte) (45 - View.getDefaultSize(0, 0))).intern(), jSONObject, webView, null, view);
        int i5 = f14422O + 67;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void h(JSONObject jSONObject, View view, Object obj) {
        f14421N = (f14422O + 31) % 128;
        h(jSONObject, (WebView) view, (View) obj);
        f14421N = (f14422O + 3) % 128;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: i */
    public final void k(JSONObject jSONObject, WebView webView, View view) {
        f14421N = (f14422O + 91) % 128;
        r0(q0((short) TextUtils.indexOf("", "", 0, 0), 61909 - AndroidCharacter.getMirror('0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 107, 643014645 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((-73) - TextUtils.getOffsetBefore("", 0))).intern(), jSONObject, webView, null, view);
        f14421N = (f14422O + 47) % 128;
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void k(JSONObject jSONObject, View view, KeyEvent.Callback callback) {
        f14421N = (f14422O + 71) % 128;
        k(jSONObject, (WebView) view, (View) callback);
        f14421N = (f14422O + 101) % 128;
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void m(JSONObject jSONObject, Object obj, Object obj2) {
        int i5 = f14422O + 73;
        f14421N = i5 % 128;
        int i10 = i5 % 2;
        m(jSONObject, (WebView) obj, (View) obj2);
        if (i10 != 0) {
            throw null;
        }
        f14421N = (f14422O + 1) % 128;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: m0 */
    public final void n(JSONObject jSONObject, WebView webView, InterfaceC0950e0 interfaceC0950e0, View view) {
        f14421N = (f14422O + 121) % 128;
        r0(q0((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-4066906) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getTrimmedLength("") - 99, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 643014631, (byte) (49 - MotionEvent.axisFromString(""))).intern(), jSONObject, webView, interfaceC0950e0, view);
        int i5 = f14422O + 3;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void n(JSONObject jSONObject, View view, InterfaceC0950e0 interfaceC0950e0, Object obj) {
        f14422O = (f14421N + 53) % 128;
        n(jSONObject, (WebView) view, interfaceC0950e0, (View) obj);
        int i5 = f14421N + 91;
        f14422O = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: n0 */
    public final void m(JSONObject jSONObject, WebView webView, View view) {
        f14421N = (f14422O + 3) % 128;
        r0(q0((short) (ViewConfiguration.getTapTimeout() >> 16), (-4066886) - TextUtils.indexOf("", ""), TextUtils.indexOf("", "") - 102, View.MeasureSpec.makeMeasureSpec(0, 0) + 643014652, (byte) (32 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), jSONObject, webView, null, view);
        f14421N = (f14422O + 81) % 128;
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void r(JSONObject jSONObject, View view, Object obj) {
        f14422O = (f14421N + 101) % 128;
        r(jSONObject, (WebView) view, (View) obj);
        f14422O = (f14421N + 7) % 128;
    }

    public final void r0(String str, JSONObject jSONObject, WebView webView, Object obj, View view) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(q0((short) Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 4066917, (-97) - View.getDefaultSize(0, 0), 643014691 - TextUtils.lastIndexOf("", '0', 0), (byte) ((-64) - Color.blue(0))).intern());
        sb2.append(str);
        C1214y7.s(this.L, sb2.toString(), this.f14423K, false, Arrays.asList(jSONObject, webView, obj, view));
        f14422O = (f14421N + 81) % 128;
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void s(JSONObject jSONObject, Object obj, InterfaceC0950e0 interfaceC0950e0, Object obj2) {
        f14422O = (f14421N + 23) % 128;
        s(jSONObject, (WebView) obj, interfaceC0950e0, (View) obj2);
        int i5 = f14422O + 91;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 17 / 0;
        }
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* bridge */ /* synthetic */ void v(JSONObject jSONObject, View view, Object obj) {
        f14422O = (f14421N + 23) % 128;
        v(jSONObject, (WebView) view, (View) obj);
        int i5 = f14422O + 67;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 47 / 0;
        }
    }

    @Override // Va.AbstractC1104pb, Va.Lb
    public final /* synthetic */ void w(JSONObject jSONObject, View view, Vb vb2, Object obj) {
        int i5 = f14422O + 25;
        f14421N = i5 % 128;
        int i10 = i5 % 2;
        w(jSONObject, (WebView) view, vb2, (View) obj);
        if (i10 != 0) {
            int i11 = 64 / 0;
        }
        f14421N = (f14422O + 5) % 128;
    }

    @Override // Va.AbstractC1104pb
    /* renamed from: x */
    public final void h(JSONObject jSONObject, WebView webView, View view) {
        f14422O = (f14421N + 95) % 128;
        r0(q0((short) ((Process.getThreadPriority(0) + 20) >> 6), (-4066906) - TextUtils.indexOf((CharSequence) "", '0', 0), (-103) - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 643014682, (byte) (28 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), jSONObject, webView, null, view);
        int i5 = f14422O + 117;
        f14421N = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
