package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1027k {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f14332g = {60, 55, 98, 101, 23, 26, -1, -24, 0, 21, -38, -5, 12, -17, 0, 0, 0, 0, 0};

    /* renamed from: h, reason: collision with root package name */
    public static int f14333h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14334i = 1;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f14335a;

    /* renamed from: b, reason: collision with root package name */
    public long f14336b;

    /* renamed from: c, reason: collision with root package name */
    public long f14337c;

    /* renamed from: d, reason: collision with root package name */
    public long f14338d;

    /* renamed from: e, reason: collision with root package name */
    public long f14339e;

    /* renamed from: f, reason: collision with root package name */
    public int f14340f;

    public static /* synthetic */ void a(C1027k c1027k, Boolean bool) {
        int i5 = f14333h + 23;
        int i10 = i5 % 128;
        f14334i = i10;
        int i11 = i5 % 2;
        c1027k.f14335a = bool;
        if (i11 == 0) {
            throw null;
        }
        int i12 = i10 + 55;
        f14333h = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static String e(short s10, int i5, int i10, int i11, byte b5) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 85;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14332g[(-2022172716) + i11] + 85);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 2022172718) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 245454325);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14332g;
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

    public static String g(char c10, String str, String str2, int i5) {
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
                        cArr3[i10] = (char) (((charArray[i10] ^ c12) ^ 0) ^ 21059);
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

    public final void b(JSONObject jSONObject, boolean z2) throws JSONException {
        long jOptLong;
        if (jSONObject.has(g((char) (35685 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "䫽濒操ꖋ", "넿\ue142ダ", ((byte) KeyEvent.getModifierMetaStateMask()) - 848309685).intern())) {
            if (z2) {
                f14333h = (f14334i + 41) % 128;
                jOptLong = jSONObject.optLong(e((short) (View.resolveSizeAndState(0, 0, 0) - 24), (-245454210) - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-82) - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 2022172720, (byte) KeyEvent.normalizeMetaState(0)).intern()) + this.f14338d;
            } else {
                jOptLong = jSONObject.optLong(g((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 35684), "䫽濒操ꖋ", "넿\ue142ダ", ((byte) KeyEvent.getModifierMetaStateMask()) - 848309685).intern()) + this.f14339e;
                f14334i = (f14333h + 23) % 128;
            }
            try {
                jSONObject.put(g((char) (35684 - TextUtils.getTrimmedLength("")), "䫽濒操ꖋ", "넿\ue142ダ", (-848309686) - ExpandableListView.getPackedPositionType(0L)).intern(), jOptLong);
                return;
            } catch (JSONException unused) {
            }
        }
        f14333h = (f14334i + 113) % 128;
    }

    public final boolean c(JSONObject jSONObject) {
        f14334i = (f14333h + 33) % 128;
        if (!jSONObject.has(g((char) (ExpandableListView.getPackedPositionGroup(0L) + 324), "﨧◠䐻鴁", "霓ꦼ鸧", (ViewConfiguration.getScrollBarSize() >> 8) + 992338170).intern())) {
            f14333h = (f14334i + 39) % 128;
            if (!jSONObject.has(e((short) ((-102) - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 245454209, (-82) - (ViewConfiguration.getFadingEdgeLength() >> 16), 2022172718 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L))).intern())) {
                int i5 = (f14334i + 91) % 128;
                f14333h = i5;
                if (this.f14335a != null) {
                    int i10 = i5 + 33;
                    f14334i = i10 % 128;
                    try {
                        if (i10 % 2 == 0) {
                            d(jSONObject);
                            return false;
                        }
                        d(jSONObject);
                        return true;
                    } catch (Exception e7) {
                        Ab.a0(g((char) ((-16777216) - Color.rgb(0, 0, 0)), "膴햺쵕㛻", "\uf40d闸庄Ẫ酱눼쒃霴ǘ錫ė쌟흹욊ἀ늚夒螣蓮⯾\uf439", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1440070272).intern(), g((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), "Ⱎ≂歀ኄ", "\ue850㭅ଠ孹莹\uf64f뒃視ᐫỲ\uee99뫇⭚\uf448䢶돲閌䕙砂⃪뗠潾㐇ᘹ贖", 1075986987 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e7, false);
                    }
                }
            }
        }
        return false;
    }

    public final void d(JSONObject jSONObject) throws JSONException {
        long jOptLong;
        boolean z2;
        try {
            if (jSONObject.optInt(e((short) ((KeyEvent.getMaxKeyCode() >> 16) - 65), (-245454210) - View.getDefaultSize(0, 0), (-82) - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 2022172716 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).intern(), 1) == this.f14340f || f(jSONObject)) {
                jOptLong = jSONObject.optLong(g((char) ((ViewConfiguration.getTouchSlop() >> 8) + 2698), "쑧䡙該嬊", "⼲\ue218", KeyEvent.getMaxKeyCode() >> 16).intern()) + this.f14338d;
                jSONObject.put(g((char) (324 - Color.green(0)), "﨧◠䐻鴁", "霓ꦼ鸧", View.MeasureSpec.getSize(0) + 992338170).intern(), this.f14338d);
                f14333h = (f14334i + 31) % 128;
                z2 = true;
            } else {
                jOptLong = jSONObject.optLong(g((char) (52360 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "䰓㒖袄\uddcc", "樜ᆇ袤", (-2076928436) - Drawable.resolveOpacity(0, 0)).intern()) + this.f14339e;
                jSONObject.put(e((short) ((-102) - View.combineMeasuredStates(0, 0)), TextUtils.getOffsetAfter("", 0) - 245454209, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 82, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2022172717, (byte) (ViewConfiguration.getTouchSlop() >> 8)).intern(), this.f14339e);
                f14333h = (f14334i + 75) % 128;
                z2 = false;
            }
            jSONObject.put(AbstractC1141sa.f14615f, jOptLong);
            if (!this.f14335a.booleanValue()) {
                int i5 = f14334i + 107;
                f14333h = i5 % 128;
                jSONObject.put((i5 % 2 != 0 ? g((char) (22073 >> Drawable.resolveOpacity(1, 0)), "\uf00aᔃ폇ో", "捡\u243a뢔", (-954924048) / (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) > 2.0f ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) == 2.0f ? 0 : -1))) : g((char) (Drawable.resolveOpacity(0, 0) + 19411), "\uf00aᔃ폇ో", "捡\u243a뢔", (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 954924048)).intern(), false);
            }
            b(jSONObject, z2);
            h(jSONObject, z2);
            f14334i = (f14333h + 63) % 128;
        } catch (JSONException unused) {
        }
    }

    public final boolean f(JSONObject jSONObject) {
        if (Math.abs((this.f14337c - this.f14336b) - (jSONObject.optLong(g((char) (TextUtils.indexOf((CharSequence) "", '0') + 52361), "䰓㒖袄\uddcc", "樜ᆇ袤", (-2076928436) - View.resolveSizeAndState(0, 0, 0)).intern()) - jSONObject.optLong(g((char) (2697 - TextUtils.indexOf((CharSequence) "", '0', 0)), "쑧䡙該嬊", "⼲\ue218", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern()))) > 10) {
            return false;
        }
        int i5 = f14333h + 29;
        f14334i = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 89 / 0;
        }
        return true;
    }

    public final void h(JSONObject jSONObject, boolean z2) throws JSONException {
        f14334i = (f14333h + 109) % 128;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e((short) (5 - TextUtils.lastIndexOf("", '0')), (-245454217) - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf("", "", 0, 0) - 76, Gravity.getAbsoluteGravity(0, 0) + 2022172722, (byte) (Process.myPid() >> 22)).intern());
            if (jSONObjectOptJSONObject != null) {
                Long lValueOf = null;
                if (z2) {
                    f14334i = (f14333h + 31) % 128;
                    long jOptLong = jSONObjectOptJSONObject.optLong(g((char) (61945 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "됳膝陼⟱", "쵿", ((Process.getThreadPriority(0) + 20) >> 6) - 964584012).intern());
                    if (jOptLong > 0) {
                        f14334i = (f14333h + 103) % 128;
                        lValueOf = Long.valueOf(jOptLong + this.f14338d);
                    }
                } else {
                    long jOptLong2 = jSONObjectOptJSONObject.optLong(e((short) (View.MeasureSpec.getMode(0) - 3), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 245454209, (-84) - (ViewConfiguration.getJumpTapTimeout() >> 16), 2022172730 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern());
                    if (jOptLong2 > 0) {
                        int i5 = f14334i + 81;
                        f14333h = i5 % 128;
                        lValueOf = i5 % 2 != 0 ? Long.valueOf(jOptLong2 % this.f14339e) : Long.valueOf(jOptLong2 + this.f14339e);
                    }
                }
                if (lValueOf != null) {
                    f14334i = (f14333h + 113) % 128;
                    jSONObjectOptJSONObject.put(e((short) ((-3) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 245454208, (ViewConfiguration.getScrollBarSize() >> 8) - 84, 2022172730 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), lValueOf);
                    f14333h = (f14334i + 61) % 128;
                }
            }
        } catch (JSONException unused) {
        }
    }
}
