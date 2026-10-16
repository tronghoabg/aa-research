package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.FairBid;
import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.Interstitial;
import com.fyber.fairbid.ads.PlacementType;
import com.fyber.fairbid.ads.Rewarded;
import com.fyber.fairbid.ads.interstitial.InterstitialListener;
import com.fyber.fairbid.ads.rewarded.RewardedListener;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.mediation.MediationManager;
import com.fyber.fairbid.mediation.config.MediationConfig;
import com.fyber.fairbid.sdk.placements.Placement;
import com.fyber.fairbid.sdk.placements.PlacementsHandler;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;

/* renamed from: Va.a3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0901a3 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13968R = {'A', 55839, 46213, 36658, 27011, 17417, 7812, 63796, 54207, 63431, 11668, 17176, 30866, 40455, 45977, 59649, 3768, 9276, 22938, 32555, 38061, 51752, 61404, 1367, 'P', 55831, 46231, 36626, 27017, 17418, 7815, 63795, 54188, 44576, 34950, 25384, 15786, 6235, 62166, 52560, 42946, 'P', 55831, 46231, 36626, 27017, 17418, 7815, 63795, 54188, 27060, 46059, 56699, 59134, 't', 11753, 30572, 37065, 47690, 51136, 57719, 2773, 21581, 29091, 37036, 19184, 9319, 8177, 63867, 54513, 36467, 27089, 17225, 16095, 6218, 62400, 23926, 34618, 59813, 53812, 13498, 6439, 17315, 42013, 39416, 17313, 11566, 5794, 61490, 56760, 34584, 24706, 'N', 55838, 46210, 36614, 27011, 17429, 7817, 63772, 54204, 44594, 35006, 25405, 15777, 6221, 53760, 2142, 26326, 23872, 48089, 38467, 52433, 11103, 502, 31868, 23273, 45409, 61410, 51723, 8329, 7957, 30085, 20483, 36488, 58638, 18678, 37566, 64544, 51116, 8491, 3207, 22053, 45468, 39694, 59009, 49168, 41850, 30979, 6047, 11309, 51861, 59182, 48518, 23088, 28832, 3358, 11199, 49205, 40634, 47943, 20938, 28237, 1219, 8514, 65519, 37957, 45809, 20335, 23589, 34396, 59584, 54138, 13763, 6229, 17106, 42362, 36841, 62050, 54501, 16228, 25064, 17465, 44697, 37123, 64403, 56891, 129, 27405, 19898, 45104, 39586, 64806, 10148, 2598, 27759, 22239, 47453, 55465, 720, 27724, 22518, 45391, 40153, 50782, 8694, 2917, 30446, 20585, 48104, 58724, 49333, 10773, 5519, 32543, 23206, 33818, 61322, 51507, 13485, 7733, 31157, 41763, 36484, 59604, 'g', 55838, 46210, 36664, 27009, 17431, 7824, 63800, 54187, 44576, 34983, 25382, 15786, 6267, 62171, 52545, 42961, 33384, 23751, 14156, 4588, 60534, 50939, 41322, 31718, 22090, 12314, 'g', 55838, 46210, 36656, 27036, 17431, 7851, 63801, 'g', 55838, 46210, 36642, 27032, 17416, 7824, 63800, 'g', 55838, 46210, 36656, 27016, 17414, 7826, 63785, 54205, 44577, 34957, 25382, 15786, 6233, 62163, 52562, 42949, 33369, 23751, 14165, 4597, 60536, 50940, 41342, 'g', 55838, 46210, 36641, 27008, 17414, 7809, 63800, 54197, 44598, 34976, 25405, 15749, 6235, 62190, 52556, 42944, 33358, 46629, 27740, 704, 14691, 57282, 62020, 43203, 20346, 26103, 6260, 16098, 54655, 35784, 44572, 17557, 31506, 37566, 18631, 9819, 7672, 64345, 55007, 35928, 27617, 16748, 15599, 6777, 61924, 44910, 35502, 24578, 24450, 13581, 4254, 52762, 42378, 1266, 56991, 45059, 35746, 27912, 16529, 6658, 64942, 55101, 43703, 35883, 26500, 14636, 7373, 63055, 51665, 41823, 34511, 22613, 'B', 55866, 46264, 36671, 27049, 17461, 'I', 55861, 46242, 36660, 27070, 17460, 7862, 63764, 54156, 44570, 34959, 25349, 45031, 30091, 6932, 8325, 50699, 60310, 45330, 22188};

    /* renamed from: S, reason: collision with root package name */
    public static int f13969S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f13970T = 1;

    public static String C0(ImpressionData impressionData) {
        int i5 = f13970T + 71;
        f13969S = i5 % 128;
        if (i5 % 2 == 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    public static String D0(ImpressionData impressionData) {
        f13969S = (f13970T + 85) % 128;
        String creativeId = impressionData.getCreativeId();
        int i5 = f13969S + 3;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return creativeId;
        }
        throw null;
    }

    public static String E0(ImpressionData impressionData) {
        f13969S = (f13970T + 105) % 128;
        String campaignId = impressionData.getCampaignId();
        int i5 = f13969S + 123;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return campaignId;
        }
        throw null;
    }

    public static double F0(ImpressionData impressionData) {
        f13970T = (f13969S + 125) % 128;
        double netPayout = impressionData.getNetPayout();
        f13969S = (f13970T + 115) % 128;
        return netPayout;
    }

    public static String G0(ImpressionData impressionData) {
        f13969S = (f13970T + 59) % 128;
        String demandSource = impressionData.getDemandSource();
        int i5 = f13969S + 55;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return demandSource;
        }
        throw null;
    }

    public static MediationManager H0() {
        f13969S = (f13970T + 75) % 128;
        MediationManager companion = MediationManager.Companion.getInstance();
        int i5 = f13970T + 11;
        f13969S = i5 % 128;
        if (i5 % 2 == 0) {
            return companion;
        }
        throw null;
    }

    public static String I0(ImpressionData impressionData) {
        int i5 = f13969S + 115;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return impressionData.getRenderingSdkVersion();
        }
        impressionData.getRenderingSdkVersion();
        throw null;
    }

    public static String J0(ImpressionData impressionData) {
        f13970T = (f13969S + 59) % 128;
        String renderingSdk = impressionData.getRenderingSdk();
        f13969S = (f13970T + 117) % 128;
        return renderingSdk;
    }

    public static boolean K0() {
        boolean zAssertStarted;
        int i5 = f13970T + 63;
        f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            zAssertStarted = FairBid.assertStarted();
            int i10 = 63 / 0;
        } else {
            zAssertStarted = FairBid.assertStarted();
        }
        f13969S = (f13970T + 77) % 128;
        return zAssertStarted;
    }

    public static String L0(ImpressionData impressionData) {
        int i5 = f13969S + 41;
        f13970T = i5 % 128;
        int i10 = i5 % 2;
        String variantId = impressionData.getVariantId();
        if (i10 == 0) {
            int i11 = 30 / 0;
        }
        f13970T = (f13969S + 55) % 128;
        return variantId;
    }

    public static Constants.AdType M0(String str) {
        int i5 = f13970T + 99;
        f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            str.hashCode();
            throw null;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1372958932:
                if (str.equals(P0(361 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 11, (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                    int i10 = f13970T + 105;
                    f13969S = i10 % 128;
                    if (i10 % 2 == 0) {
                        c10 = 2;
                        break;
                    } else {
                        c10 = 5;
                        break;
                    }
                }
                break;
            case 433141802:
                if (str.equals(o(((Process.getThreadPriority(0) + 20) >> 6) + 57221, "\u0b7c퓢둨门畲囧㙹").intern())) {
                    c10 = 0;
                    break;
                }
                break;
            case 543046670:
                if (str.equals(P0(373 - Color.red(0), (Process.myTid() >> 22) + 8, (char) ((Process.myTid() >> 22) + 44981)).intern())) {
                    f13970T = (f13969S + 105) % 128;
                    c10 = 3;
                    break;
                }
                break;
            case 1951953708:
                if (str.equals(P0((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 354, Color.rgb(0, 0, 0) + 16777222, (char) View.resolveSizeAndState(0, 0, 0)).intern())) {
                    c10 = 1;
                    break;
                }
                break;
        }
        if (c10 == 0) {
            return Constants.AdType.UNKNOWN;
        }
        if (c10 == 1) {
            return Constants.AdType.BANNER;
        }
        if (c10 == 2) {
            return Constants.AdType.INTERSTITIAL;
        }
        if (c10 != 3) {
            return null;
        }
        return Constants.AdType.REWARDED;
    }

    public static PlacementType N0(ImpressionData impressionData) {
        int i5 = f13969S + 43;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return impressionData.getPlacementType();
        }
        impressionData.getPlacementType();
        throw null;
    }

    public static Constants.AdType O0(Placement placement) {
        int i5 = f13970T + 57;
        f13969S = i5 % 128;
        int i10 = i5 % 2;
        Constants.AdType adType = placement.getAdType();
        if (i10 != 0) {
            int i11 = 42 / 0;
        }
        return adType;
    }

    public static String P0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13968R[i5 + i11] ^ (i11 * 7454736665033955963L)) ^ c10);
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

    public static String Q0(Placement placement) {
        int i5 = f13969S + 83;
        f13970T = i5 % 128;
        int i10 = i5 % 2;
        String name = placement.getName();
        if (i10 == 0) {
            int i11 = 55 / 0;
        }
        int i12 = f13970T + 71;
        f13969S = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 99 / 0;
        }
        return name;
    }

    public static List R0(MediationConfig mediationConfig) {
        int i5 = f13969S + 101;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return mediationConfig.getAdapterConfigurations();
        }
        mediationConfig.getAdapterConfigurations();
        throw null;
    }

    public static String S0(FairBid.AdsConfig adsConfig) {
        f13970T = (f13969S + 69) % 128;
        String str = adsConfig.appId;
        f13969S = (f13970T + 11) % 128;
        return str;
    }

    public static PlacementType T0(Constants.AdType adType) {
        f13970T = (f13969S + 37) % 128;
        PlacementType placementType = adType.getPlacementType();
        int i5 = f13970T + 11;
        f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 27 / 0;
        }
        return placementType;
    }

    public static PlacementsHandler U0(MediationManager mediationManager) {
        int i5 = f13969S + 125;
        f13970T = i5 % 128;
        int i10 = i5 % 2;
        PlacementsHandler placementsHandler = mediationManager.getPlacementsHandler();
        if (i10 == 0) {
            int i11 = 19 / 0;
        }
        return placementsHandler;
    }

    public static String V0(FairBid.AdsConfig adsConfig) {
        f13970T = (f13969S + 43) % 128;
        String str = adsConfig.store;
        int i5 = f13969S + 13;
        f13970T = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static void W0(InterstitialListener interstitialListener) {
        int i5 = f13969S + 57;
        f13970T = i5 % 128;
        int i10 = i5 % 2;
        Interstitial.setInterstitialListener(interstitialListener);
        if (i10 == 0) {
            int i11 = 47 / 0;
        }
    }

    public static void X0(RewardedListener rewardedListener) {
        f13969S = (f13970T + 75) % 128;
        Rewarded.setRewardedListener(rewardedListener);
        int i5 = f13970T + 123;
        f13969S = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static String o(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ (-3790025977869497559L));
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(o(Process.getGidForName("") + 938, "\u0b4eࣥఏƟרᤀẶ\u12d7ᘕ⮱\u2fdc⌄₈ⓝ㡹㶯㇞㕵䪹仫䉳䞇寛彧岟僋呦").intern(), new B1(26));
        map.put(P0((ViewConfiguration.getFadingEdgeLength() >> 16) + Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, (char) (41758 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), new K2());
        map.put(o(TextUtils.getCapsMode("", 0, 0) + 53381, "\u0b4e\udbc9꩗端䥐ᧀ\ue845룯轲忷\u2e72ﻱ쵻鶬氎㲖̘펬ꈟ犗䄮ᆥ\ue02a낿蜿垠⛿\uf557엕鑝").intern(), new L2());
        map.put(P0(160 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 29, (char) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 23618)).intern(), new Q2());
        map.put(o((ViewConfiguration.getJumpTapTimeout() >> 16) + 22189, "\u0b4e巡ꘇཧ凰머͕嗷븲ݏ概눩᭛涤똾\u1f7e憘쨆፦斐컉\u177d禅싋⭿綫웨⽲熮\udae6⌊疨\udefa✍覼틠").intern(), new O2());
        map.put(o((Process.myPid() >> 22) + 43853, "\u0b4eꀁ巇ઇ꙰变\u0895ꑗ儲\u0eef멂圉\u0cdb름啾˞뾘歰&뷳楌ؖ돓梑Ѿ뇙溉ᩕ뜠").intern(), new N2());
        map.put(o(TextUtils.lastIndexOf("", '0') + 19490, "\u0b4e䝭錟\uef03㯀矼쎝ᾫ橒꙳\uf20a中髋훀⊆纲쥘Վ儚괨倫㗽膑\uddaa⡸摴").intern(), new M2());
        map.put(o((-16745949) - Color.rgb(0, 0, 0), "\u0b4e煯；攉\ue3c8槶힉嶹\uda42䁡츞㓇닣㢪ꚢ⍐ꥸ᜴鴺ᯄ臅ྗ瑒\uf263研\ue636").intern(), new P2());
        map.put(P0(188 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getTapTimeout() >> 16) + 27, (char) (TextUtils.indexOf("", "", 0, 0) + 55502)).intern(), new R2());
        map.put(o(16058 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\u0b4e㗵瘯띋\uf1a0㋄猍뱃ﺒ㿛硺몵ﯫ␈敖꞊\ue0d8℡扏곤\ued38\u2e76梻꧟\uea02⭝喑雮흺ᆱ勦錧\udc67").intern(), new U2());
        map.put(P0((ViewConfiguration.getFadingEdgeLength() >> 16) + Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 27, (char) TextUtils.indexOf("", "", 0)).intern(), new T2());
        map.put(P0(242 - (ViewConfiguration.getScrollBarSize() >> 8), 8 - (KeyEvent.getMaxKeyCode() >> 16), (char) (Process.myPid() >> 22)).intern(), new S2());
        map.put(P0((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 249, 8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) KeyEvent.normalizeMetaState(0)).intern(), new V2());
        map.put(P0(258 - (KeyEvent.getMaxKeyCode() >> 16), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) TextUtils.getTrimmedLength("")).intern(), new W2());
        map.put(P0(283 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new Z2());
        map.put(P0((ViewConfiguration.getKeyRepeatDelay() >> 16) + 300, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, (char) (ImageFormat.getBitsPerPixel(0) + 46659)).intern(), new X2());
        map.put(P0(317 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 20 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (37593 - (ViewConfiguration.getPressedStateDuration() >> 16))).intern(), new Y2());
        map.put(o(TextUtils.indexOf("", "") + 53717, "\u0b4e\uda99ꣷ縗䰙ቔ\ue1ae랊藤欑㤕ཻ\udeb8").intern(), new B1(24));
        map.put(o(42433 - TextUtils.indexOf("", "", 0), "\u0b5a꺍䃟﨣鱃㞘\ue9ca茜╒\ud894狊ᐖ칌憅ᯋ봪坐ઋ곏䘟\uf853鎙㗍").intern(), new J2());
        map.put(P0(336 - (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.getSize(0) + 19, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 1153)).intern(), new I2());
        map.put(o(TextUtils.getCapsMode("", 0, 0) + 62233, "ୈ\uf843\ued68툇윿될맬껲鎀肺疧祟湡").intern(), new B1(25));
        int i5 = f13969S + 17;
        f13970T = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 46 / 0;
        }
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f13970T = (f13969S + 31) % 128;
        try {
            try {
                String str = (String) FairBid.class.getDeclaredField(o(58510 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0b7a\uefe2쉼ꛛ饃綧倡㒓⼘ɡ\ue6f1").intern()).get(null);
                f13970T = (f13969S + 37) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1051la c1051la = (C1051la) C0999ha.j().f14264b;
            String strIntern = o(15798 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "୷㛇瀟뉒ﶠ㾋祌ꓴ\ue6dc 执궊\uef08⤳咔障퀤ቷ巏鼢\ud950ӛ䚃").intern();
            c1051la.getClass();
            return C1051la.n(FairBid.class, strIntern);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0901a3.w0(java.lang.String):java.lang.Class");
    }
}
