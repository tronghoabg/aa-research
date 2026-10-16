package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Va.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1066n extends C1052lb {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f14400l = {18715, 43047, 35613, 59919, 52591, 11377, 3905, 28348, 16817, 41140, 33682, 58094, 50640, 9433, 1559, 31010, 22532, 47996, 39550, 64850, 56402, 16314, 7818, 24095, 48907, 39993, 'd', 57703, 49749, 's', 57702, 49743, 41821, 55635, 14426, 7010, 60837, 3243, 12189};

    /* renamed from: m, reason: collision with root package name */
    public static int f14401m = 0;

    /* renamed from: n, reason: collision with root package name */
    public static int f14402n = 1;

    /* renamed from: g, reason: collision with root package name */
    public String f14403g;

    /* renamed from: h, reason: collision with root package name */
    public int f14404h;

    /* renamed from: i, reason: collision with root package name */
    public int f14405i;

    /* renamed from: j, reason: collision with root package name */
    public int f14406j;
    public Handler k;

    public static /* synthetic */ void d(C1066n c1066n) {
        int i5 = f14401m + 51;
        f14402n = i5 % 128;
        c1066n.f14405i = i5 % 2 == 0 ? c1066n.f14405i : c1066n.f14405i + 1;
    }

    public static String e(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14400l[i5 + i11] ^ (i11 * 5499615291181359379L)) ^ c10);
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

    public static String f(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC1104pb.f14484D) {
            try {
                char[] cArrZ = AbstractC1104pb.z(4741201730987580008L, charArray, i5);
                AbstractC1104pb.f14483C = 4;
                while (true) {
                    int i10 = AbstractC1104pb.f14483C;
                    if (i10 < cArrZ.length) {
                        cArrZ[i10] = (char) ((cArrZ[i10] ^ cArrZ[i10 % 4]) ^ ((i10 - 4) * 4741201730987580008L));
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

    @Override // Va.C1052lb
    public final JSONObject c(JSONObject jSONObject, boolean z2, boolean z10, boolean z11) {
        long jG0;
        long jS;
        int i5;
        synchronized (this) {
            jG0 = AbstractC1104pb.g0();
            jS = AbstractC1104pb.S();
        }
        JSONObject jSONObjectC = super.c(jSONObject, z2, z10, z11);
        try {
            String str = AbstractC1141sa.f14615f;
            long jOptLong = jSONObjectC.optLong(str);
            jSONObjectC.remove(str);
            if (jOptLong != 0) {
                long j8 = jS - (jG0 - jOptLong);
                jSONObjectC.put(e(Color.green(0) + 23, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24171)).intern(), jG0);
                jSONObjectC.put(f("煞춘浑焭㨩鞅\ud9f5", Drawable.resolveOpacity(0, 0)).intern(), jS);
                jG0 = jOptLong;
                jS = j8;
            }
            jSONObjectC.put(e(26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 3 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), jG0);
            jSONObjectC.put(f("擲齂쯮撇撈앞", View.resolveSizeAndState(0, 0, 0)).intern(), jS);
            jSONObjectC.put(e(Drawable.resolveOpacity(0, 0) + 29, 4 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ('0' - AndroidCharacter.getMirror('0'))).intern(), this.f14403g);
            jSONObjectC.put(e(KeyEvent.keyCodeFromString("") + 33, 4 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (55584 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), this.f14404h);
            String strIntern = e(36 - View.resolveSizeAndState(0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 4, (char) (60886 - KeyEvent.normalizeMetaState(0))).intern();
            int i10 = f14402n + 41;
            int i11 = i10 % 128;
            f14401m = i11;
            if (i10 % 2 != 0) {
                int i12 = 67 / 0;
                if (this.f14405i == 0) {
                    f14402n = (i11 + 95) % 128;
                    i5 = 1;
                }
                i5 = this.f14405i;
            } else if (this.f14405i == 0) {
                f14402n = (i11 + 95) % 128;
                i5 = 1;
            } else {
                i5 = this.f14405i;
            }
            jSONObjectC.put(strIntern, i5);
            if (G.S().D()) {
                jSONObjectC.put(f("㧣ῦᖵ㦀ࠐ䗽ꄉ\u074c", TextUtils.getTrimmedLength("")).intern(), true);
            }
            C cK = G.S().K();
            if (cK != null) {
                String strY = cK.y();
                if (!TextUtils.isEmpty(strY)) {
                    jSONObjectC.put(f("\udff1䘈ᥬ\udf94鉅ᰔ귈", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), strY);
                }
            }
            if (z10) {
                g(jSONObjectC);
                return jSONObjectC;
            }
        } catch (JSONException e7) {
            Ab.R(e(Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 23 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Color.alpha(0) + 18778)).intern(), f("︁楎滶﹄젗㍔\uda54은韓굦烥낽ⴤ䒇\ue692⨆슏﹡齦葪壷槃㗈緛\uee6cΣꩲ휮", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), e7);
        }
        return jSONObjectC;
    }

    public final synchronized void g(JSONObject jSONObject) {
        JSONObject jSONObjectW;
        String strIntern;
        int i5 = f14401m + 33;
        f14402n = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                C1154ta c1154taR = C0935cb.p().r();
                jSONObjectW = Ab.W(c1154taR.f14648a, c1154taR.f14649b, c1154taR.f14650c, c1154taR.f14651d);
                strIntern = f("⃓稟ꖒ₿飧‖ᄱ鞫䤧빸뮗\ue05c\uf3fb", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
            } else {
                C1154ta c1154taR2 = C0935cb.p().r();
                jSONObjectW = Ab.W(c1154taR2.f14648a, c1154taR2.f14649b, c1154taR2.f14650c, c1154taR2.f14651d);
                strIntern = f("⃓稟ꖒ₿飧‖ᄱ鞫䤧빸뮗\ue05c\uf3fb", (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
            }
            jSONObject.put(strIntern, jSONObjectW);
            f14401m = (f14402n + 67) % 128;
        } catch (JSONException e7) {
            Ab.R(e(KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 24, (char) (18779 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), f("㞃鞞黀㟦왵춄⩢줢幑厶胑뻉\ue4a7멟ᚾ⑪ୃº漑訞酷霙엥玮⟋ﴶ婄\ud942乣䏓뀦仨풍ꨢ", KeyEvent.normalizeMetaState(0)).intern(), e7);
        }
    }
}
