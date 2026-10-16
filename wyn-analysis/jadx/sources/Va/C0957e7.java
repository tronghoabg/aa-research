package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.banner.BannerAdView;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.common.VideoController;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.HashMap;

/* renamed from: Va.e7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0957e7 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f14120R = {866230629, -1108042986, 1383250739, 555169352, -429843980, -461066906, -321509670, -1358576725, -521508064, -12538048, 632330766, -732928010, -39831879, -494371002, -1479766174, 2003506080, 1466793282, -104413323};

    /* renamed from: S, reason: collision with root package name */
    public static int f14121S = 0;

    /* renamed from: T, reason: collision with root package name */
    public static int f14122T = 1;

    public static String C0(int i5, int[] iArr) {
        String str;
        synchronized (AbstractC0897a.f13930n) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f14120R.clone();
                AbstractC0897a.k = 0;
                while (true) {
                    int i10 = AbstractC0897a.k;
                    if (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        char c10 = (char) (i11 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i11;
                        cArr[1] = c11;
                        int i12 = iArr[i10 + 1];
                        char c12 = (char) (i12 >> 16);
                        cArr[2] = c12;
                        char c13 = (char) i12;
                        cArr[3] = c13;
                        AbstractC0897a.f13928l = (c10 << 16) + c11;
                        AbstractC0897a.f13929m = (c12 << 16) + c13;
                        AbstractC0897a.o(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = AbstractC0897a.f13928l ^ iArr2[i13];
                            AbstractC0897a.f13928l = i14;
                            int iG = AbstractC0897a.G(i14) ^ AbstractC0897a.f13929m;
                            int i15 = AbstractC0897a.f13928l;
                            AbstractC0897a.f13928l = iG;
                            AbstractC0897a.f13929m = i15;
                        }
                        int i16 = AbstractC0897a.f13928l;
                        int i17 = AbstractC0897a.f13929m;
                        AbstractC0897a.f13928l = i17;
                        AbstractC0897a.f13929m = i16;
                        int i18 = i16 ^ iArr2[16];
                        AbstractC0897a.f13929m = i18;
                        int i19 = iArr2[17] ^ i17;
                        AbstractC0897a.f13928l = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        AbstractC0897a.o(iArr2);
                        int i20 = AbstractC0897a.k;
                        int i21 = i20 << 1;
                        cArr2[i21] = cArr[0];
                        cArr2[i21 + 1] = cArr[1];
                        cArr2[i21 + 2] = cArr[2];
                        cArr2[i21 + 3] = cArr[3];
                        AbstractC0897a.k = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static MediaFile D0(VideoAd videoAd) {
        int i5 = f14121S + 73;
        f14122T = i5 % 128;
        int i10 = i5 % 2;
        MediaFile mediaFile = videoAd.getMediaFile();
        if (i10 == 0) {
            int i11 = 97 / 0;
        }
        int i12 = f14122T + 75;
        f14121S = i12 % 128;
        if (i12 % 2 == 0) {
            return mediaFile;
        }
        throw null;
    }

    public static void E0(BannerAdView bannerAdView, BannerAdEventListener bannerAdEventListener) {
        f14121S = (f14122T + 27) % 128;
        bannerAdView.setBannerAdEventListener(bannerAdEventListener);
        f14122T = (f14121S + 121) % 128;
    }

    public static String F0(AdInfo adInfo) {
        int i5 = f14121S + 113;
        f14122T = i5 % 128;
        int i10 = i5 % 2;
        String adUnitId = adInfo.getAdUnitId();
        if (i10 == 0) {
            int i11 = 90 / 0;
        }
        int i12 = f14121S + 35;
        f14122T = i12 % 128;
        if (i12 % 2 != 0) {
            return adUnitId;
        }
        throw null;
    }

    public static String G0(ImpressionData impressionData) {
        int i5 = f14122T + 51;
        f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return impressionData.getRawData();
        }
        impressionData.getRawData();
        throw null;
    }

    public static void H0(VideoController videoController, VideoEventListener videoEventListener) {
        f14121S = (f14122T + 49) % 128;
        videoController.setVideoEventListener(videoEventListener);
        int i5 = f14121S + 91;
        f14122T = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void I0(InterstitialAd interstitialAd, InterstitialAdEventListener interstitialAdEventListener) {
        int i5 = f14122T + 77;
        f14121S = i5 % 128;
        int i10 = i5 % 2;
        interstitialAd.setAdEventListener(interstitialAdEventListener);
        if (i10 != 0) {
            int i11 = 24 / 0;
        }
    }

    public static int J0(Reward reward) {
        f14122T = (f14121S + 71) % 128;
        int amount = reward.getAmount();
        f14122T = (f14121S + 15) % 128;
        return amount;
    }

    public static AdInfo K0(InterstitialAd interstitialAd) {
        f14121S = (f14122T + 19) % 128;
        AdInfo info = interstitialAd.getInfo();
        f14121S = (f14122T + 107) % 128;
        return info;
    }

    public static String L0(MediaFile mediaFile) {
        int i5 = f14121S + 29;
        f14122T = i5 % 128;
        if (i5 % 2 != 0) {
            return mediaFile.getUrl();
        }
        mediaFile.getUrl();
        throw null;
    }

    public static void M0(RewardedAd rewardedAd, RewardedAdEventListener rewardedAdEventListener) {
        int i5 = f14122T + 25;
        f14121S = i5 % 128;
        int i10 = i5 % 2;
        rewardedAd.setAdEventListener(rewardedAdEventListener);
        if (i10 != 0) {
            throw null;
        }
        int i11 = f14121S + 59;
        f14122T = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 53 / 0;
        }
    }

    public static AdInfo N0(RewardedAd rewardedAd) {
        f14121S = (f14122T + 49) % 128;
        AdInfo info = rewardedAd.getInfo();
        int i5 = f14122T + 13;
        f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return info;
        }
        throw null;
    }

    public static String O0(Reward reward) {
        f14122T = (f14121S + 7) % 128;
        String type = reward.getType();
        int i5 = f14121S + 51;
        f14122T = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 5 / 0;
        }
        return type;
    }

    public static String P0(VideoAd videoAd) {
        int i5 = f14121S + 125;
        f14122T = i5 % 128;
        int i10 = i5 % 2;
        String info = videoAd.getInfo();
        if (i10 == 0) {
            int i11 = 50 / 0;
        }
        return info;
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
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 1379406682144961612L);
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
        map.put(C0(11 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new int[]{266109525, -1815399805, -1515101001, -880122083, 216296973, -1891400394}).intern(), new Y6());
        map.put(o(TextUtils.getOffsetBefore("", 0) + 2087, "\uf42bﰎ\ue476\uec6b풱\udcf8쓢촼딀뵲").intern(), new C0905a7());
        map.put(C0(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, new int[]{306558999, 1698031303, 293133844, 1142584674, -1902836356, 787881048, 1423309588, -495795799, 586860845, 1278612339, 1205908307, 45710277}).intern(), new C0918b7());
        map.put(C0(20 - TextUtils.getCapsMode("", 0, 0), new int[]{-1297542773, 88807194, 880913417, -474985245, 965750390, 446345591, -704066054, -1494894380, 223762354, -806038953}).intern(), new C0944d7());
        map.put(C0(Color.green(0) + 15, new int[]{1671402473, 116697856, 2102484818, 1368567723, 1859865004, 1363902280, 642920802, 819977482}).intern(), new R6());
        map.put(C0(13 - KeyEvent.normalizeMetaState(0), new int[]{1671402473, 116697856, 2102484818, 1368567723, -1372038530, -1354226142, -34192188, 2134330211}).intern(), new C0931c7());
        map.put(C0((Process.myPid() >> 22) + 17, new int[]{1671402473, 116697856, 2102484818, 1368567723, 1666748735, 1991161453, -1731930521, -918989238, -80219148, 539275868}).intern(), new T6());
        map.put(o(KeyEvent.getDeadChar(0, 0) + 34351, "\uf43f爆\uf866暓\uec95櫐턷彷앐䎎짾〈븜⑪ꊨ⣨雒ᴧ魎Ř输\uf5e3簣福恁\ueea9").intern(), new U6());
        map.put(o((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33247, "\uf43f痶\uf786熘\uf35e絣３礧難擯\ue693悭\ue251汾\uee12栜\ue9d8毆햔垤텎即\udd2a弬\ud8d7嫿쒏䚧쁍䉽").intern(), new S6());
        map.put(o(24223 - Drawable.resolveOpacity(0, 0), "\uf42bꪶ䤆\uefdc蹕ⴳ쎟扴òꞲ䘖\ue4fc魭㨭\ud892").intern(), new W6());
        map.put(o(42439 - AndroidCharacter.getMirror('0'), "\uf42b冾뼖ӟ批쿛ᖣ猂\ud8b5♧菧\ue954㜼鲎\ufa6f䟓굕ଧ傷").intern(), new Z6());
        map.put(C0((ViewConfiguration.getDoubleTapTimeout() >> 16) + 14, new int[]{1427128958, -314899657, 293133844, 1142584674, 721144925, -1720000360, 1791935829, 335799672}).intern(), new X6());
        map.put(o(ExpandableListView.getPackedPositionGroup(0L) + 2111, "\uf43fﰖ\ue446\uecb3퓑\udd19았춐뗆븺Ꙟ꺼雎鼚蝐辉矰砊恑梕僅変䅃䦗").intern(), new V6());
        int i5 = f14122T + 99;
        f14121S = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        int i5 = f14122T + 123;
        f14121S = i5 % 128;
        if (i5 % 2 != 0) {
            MobileAds.getLibraryVersion();
            throw null;
        }
        String libraryVersion = MobileAds.getLibraryVersion();
        f14122T = (f14121S + 105) % 128;
        return libraryVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d7  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0957e7.w0(java.lang.String):java.lang.Class");
    }
}
