package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.adcom.Ad;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.BidMachine;
import io.bidmachine.banner.BannerListener;
import io.bidmachine.banner.BannerView;
import io.bidmachine.interstitial.InterstitialAd;
import io.bidmachine.interstitial.InterstitialListener;
import io.bidmachine.protobuf.RequestExtension;
import io.bidmachine.rewarded.RewardedAd;
import io.bidmachine.rewarded.RewardedListener;
import java.util.HashMap;
import java.util.List;

/* renamed from: Va.d2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0939d2 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14091R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f14092S;

    /* renamed from: T, reason: collision with root package name */
    public static int f14093T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14094U = 1;

    static {
        char[] cArr = new char[1179];
        R8.v.k("ßÌÑ\u001bÂ\\ó¶ä\u009a\u0095ß\u0087B¸\u001c©\u0011Z³K¤|\u0091û/õßæ\u0087×~ÀT±3£õ\u009cÓ\u008d²~GoEX9J÷\u0000A\u000e±\u001dî,\u0016;'JYX\u0092g²vÑb\u009eln\u007f#NÉYï(\u0093:Nî\ràýó ÂFÕt¤\t¶á\u0089ü\u0098\u0096kTz{M\u0005_ü.ô!\u00990C\u0003y\u0012\u0007äÓ÷ñOÒA\"Ruc\u0085t´\u0005Î\u0017\b(.9^Ê\u009c\u0000A\u000e±\u001dø,\u001a;%J\\X\u009bg vÜ\u0000A\u000e±\u001dø,\u001a;%J\\X\u009bg vÜ\u0085-\u00943£U±\u009dÀ¼ÏÃÞ\u000fí5üW\n\u0089U«[[H3yÁnÇ\u001f³\rq\u0012\u0003\u001có\u000f¾>T)sX\u001c\u0085`\u008b\u0096\u0098æ©3¾\u0013ÏyÝ\u0090â\u0098óù\u0000+\u0011\u0015&k4»E\u0081\u0000B\u000e´\u001dÄ,\u0011;1J[X¨gºvÍ\u0085\nÞåÐ6Ã\bò\u0091å±\u0094Á\u0086\u001f¹>¨G[\u0099J·}Åo\u0015\u001es\u0011H\u0000\u00963²\"ÇÔ\u0013Ç1ö\u0006é·\u0098£\u008bÁ½\u001a¬$_\\N\u00adA©pÈb\rØCÖ½ÅÏô3ã4\u0092K\u0080\u0097¿»®Ç]\u0019Ö\u0093ØmË\u001fúãíä\u009c\u009b\u008eG±k \u0017SÉBÂu\u0092\u0000C\u000e§\u001dÏ,\u001e; J@X\u0088g¶vî\u0085\u0012\u0094 £J±\u009dÀ¥\u0000I\u000e¸\u001dË,\u0018;1JmX\u009fg§vÉ\u0082É\u008c;\u009f^®\u009a¹¦ÈÚÚ\nå:ô\\\u0007\u0094\u0016³!Ë3=B5#£-Q>4\u000fð\u0018Ìi°{`DPU6¦þ·Ù\u0080¡\u0092ZãRì?ýåÎßß¡)u:W\u0000F\u000e \u001dÆ,\u0013;\u0007JJX\u008cg¶vÍ\u0085\u0013\u0094\u0013£C\u0000M\u000e°\u001dÎ,\u0016;5JhX\u008dg vÍ\u0085\t\u0094\u0006£^±\u008cÀ´\u0000M\u000e°\u001dÎ,\u0016;5J\u007fX\u0097g¶vßQþ_-L\u0013}\u008ajª\u001bÚ\t\u00046%'\\Ô\u0082Å¬òÞà\u000e\u0091h\u009e_\u008f\u008d¼³\u00adÛ[\u001bH=yRf\u008a\u0017÷\u0004Â2\u0006#?ÐBÁÎÎ\u0096ÿÓí\u0005\u009a5\u008bV¸´©´VíD\u0014\u00974\u0099Î\u008a¤»l¬XÝ6ÏÅðÍòþü\u0004ïnÞ¦É\u0092¸üª\u0002\u0095\n\u0084kw¹f\u0087QùC)2\u0013ÀÐÎ*Ý@ì\u0088û¼\u008aÒ\u0098-§(¶RE\u008aT\u00adcïq\u000b\u0000*\u000fO\u0000R\u000e°\u001dÝ,\u001e;&JMX\u009bg·vé\u0085\u0019¸F¶¤¥É\u0094\n\u00832òYà\u008fß£Îð=\u0000,5\u001bG\t\u008dx«w×f\u001d\u0004V\n¸\u0019Í(\u0013?\u001dNH\\\u009ec¾rÍ\u00815\u0090?§Pµ\u008cÄ°ËÌÚ\u001aé&\u0000R\u000e¼\u001dÉ,\u0017;\u0019JLX\u009agºvÉ\u0085+\u0094;£B±\u008bºv´¥§\u009b\u0096\u0002\u0081\"ðRâ\u008cÝ\u00adÌÔ?\n.$\u0019V\u000b\u0086zàuËd\rW,FR°\u0088£µ\u0092ß\u008d\u000fü0ï\u0012ÙµÈ»;Þ*\u0000%\u001e\u0014[\u0006\u008dq½`ÞS<B<½e¯\u009cÕÔÛ>ÈLù\u0098î¹\u009fû\u008d\u0010²0£SP\u009aA¢väd\u001d\u0015'\u001aM\u000b\u008f8»)Óß\u0001\u009fW\u0091\u0084\u0082º³#¤\u0003ÕsÇ\u00adø\u008céõ\u001a+\u000b\u0005<w.§_ÁPöA$r\u001acr\u0095²\u0086\u0094·û¨#Ù^Êkü¯í\u0096\u001eë\u000fg\u0000$1v#¬T\u0090Eñv\u001bg\u0018\u0098@\u008a³»\u0092¬ÒÝ\fÎ\u0015ÿWñ¥â\u008f\u0013Ë\u0004;5\u0001\u0000A\u000e±°²¾X\u00ad4\u009cé\u008bÏú\u0097èb×XÆ>5ô$Ä\u0013¬\u0001z\u0002í\f4\u001fI.ß9¿HßZ\u0000e1tI\u0087\u0081\u0096¹¡Ú³\u0006Â>ÍKÜ\u009eïðþÂ\b\u0015\u001b#*\u00045\u009aD²WÌa\u001fp'\u0083\u0002\u0092´\u009d°¬Î¾\u0011É!Øoë\u0098ú°\u0005ø\u0017\f&.1d@\u0084Ä\u000fÊåÙ\u0089èTÿr\u008e/\u009cÕ£ð²\u0086APPwg$uÝ\u0004ç\u000b\u008d\u001aO){8\u0013ÎÁ\u0000c\u000eº\u001dÇ,Q;1JQX\u008eg¿vÇ\u0085\u000f\u00947£T±\u0088À°ÏÅÞ\u0010í~üL\n\u009b\u0019\u00ad(\u008a7\u0014F<UBc\u0091r©\u0081\u008c\u0090:\u009f>®@¼\u009fË¯Úäé\u001cø+\u0007s\u0015\u009b$®3ßB\u0010Q<`tn\u0084}®\u008cè\u009b\b\u0000M\u000e§\u001dË,\u0016;0J`X\u0090g§vÍ\u0085\u000f\u0094!£S±\u0095À¥ÏÏÞ\u001aí<\u0000M\u000e§\u001dË,\u0016;0J`X\u0090g§vÍ\u0085\u000f\u0094!£S±\u0095À¥ÏÏÞ\u001aí<üi\n\u0093\u0019¼(Ð7\u001cF UFc\u008aÐÔÞ>ÍRü\u008fë©\u009aæ\u0088\u000e·/¦F\u0000c\u000eº\u001dÇ,Q;1JQX\u008eg¿vÇ\u0085\u000f\u00947£T±\u0088À°ÏÅÞ\u0010í~üL\n\u009b\u0019\u00ad(\u008a7\u0014F<UBc\u0091r©\u0081\u008c\u0090:\u009f>®@¼\u009fË¯Úöé\u001cø/\u0007h\u0000M\u000e§\u001dË,\u0016;0J\u007fX\u0097g¶vß\u00851\u0094;£T±\u0088À´ÏÈÞ\u001eí\"²t¼\u0096¯û\u009e)\u00897øhê¨Õ\u0098Äü76&\u0004\u0011|Í\"ÃûÐ\u0086á\u0010öp\u0087\u0010\u0095Ïªþ»\u0086HNYvn\u0015|É\rñ\u0002\u0084\u0013Q ?1\rÇÚÔìåËúN\u008bn\u0098\u0011®Í¿¢L\u0082]URyc\tqÁ\u0006ã\u0017\u0095$M5%Ê\bØÔéûþ«\u008fs\u009cj\u00ad(£Ú°ðA´VDg~\u0000V\u000e´\u001dÙ,\u000b;\u0002J@X\u009bg¤îìà5óHÂÞÕ¾¤Þ¶\u0001\u00890\u0098Hk\u0080z¸MÛ_\u0007.?!J0\u009f\u0003ñ\u0012Ãä\u0014÷\"Æ\u0005Ù\u0080¨ »ß\u008d\u0003\u009cloL~\u009bq·@ÇR\u000f%-4[\u0007\u0083\u0016ëéÆû\u001aÊ5Ýe¬ª¿®\u008e÷\u0080\nÔàÚ\nÉfø»ï\u009d\u009eÅ\u008c7³(¢lQµ@\u0088\u0000c\u000eº\u001dÇ,Q;1JQX\u008eg¿vÇ\u0085\u000f\u00947£T±\u0088À°ÏÅÞ\u0010í~üL\n\u009b\u0019\u00ad(\u008a7\u0014F<UBc\u0091r©\u0081\u008c\u0090:\u009f>®@¼\u009fË¯Úáé\u0011ø\u001c\u0007v\u0015\u0091$¾ÜQÒ³ÁÞð\fç\u0005\u0096G\u0084\u009c»£ªãY\u0013H&\u007fTm\u009e\u001c¸\u0013Ä\u0002\u000ex*vÈe£TrCI2\" ò\u001fî\u000e¨ýqìOÛ1É÷¸À·±¦m÷Ûù\fêbÛ\u0087Ì\u0081½æ¯2\u0090\u0003\u0081ur¸c¯TÿF-è3æäõ\u008aÄ}Ói¢\u0019°Ï\u008fè\u009e½mM|kà\u0000î×ý¹ÌZÛFª ¸ý\u0087Ø\u0096ª\u0000g\u000e°\u001dÞ,;;=JZX\u008eg¿vÉ\u0085\u0004\u0086\u0089\u0088^\u009b0ªÕ½ÓÌ´Þ`áQð'\u0003ê\u0012þ%¨7|FQI-Xç\u0000g\u000e°\u001dÞ,=;5JGX\u0090g¶vÚ\u00858\u0094*£S±¬À£ÏÉÞ\u000fí?üi\n\u0093\u0019¼(Ð\u0000g\u000e°\u001dÞ,);=JMX\u009bg¼\u0000g\u000e°\u001dÞ,>;0JFX\u0093g²vÁ\u0085\u0013\u0000g\u000e°\u001dÞ,<;&JLX\u009fg§vÁ\u0085\u000b\u00947£n±\u0098¤1ªæ¹\u0088\u0088y\u009fnî\u001eüËÃàÒ\u0093!N0j\u0007\u0005\u0015ãdã\u0000g\u000e°\u001dÞ,>;0J}X\u0087g£vÍ\u0000g\u000e°\u001dÞ,,;1JEX\u0092g¶vÚ\u00854\u00946\u0000s\u000e°\u001dÞ,6;:J]X\u009bg¡vÛ\u0085\t\u0094;£S±\u0095À°ÏÊÞ7í9üV\n\u008e\u0019ª(Ê7\u001cF<\u0000s\u000e°\u001dÞ,-;1J^X\u009fg¡vÌ\u0085\u0018\u00946£k±\u0095À¢ÏÒÞ\u001eí>ü@\n\u0088:h4«'Å\u0016&\u0001.p\\b\u008b]\u00adLÁ¿*® \u0099O\u008b\u0093ú¯õÓä\u0005×9\u0000g\u000e°\u001dÞ,:;,J]X®g¡vÇ\u0085\t\u0094=£k±\u0095À¢ÏÒ×xÙ¯ÊÁû\"ì2\u009dB\u008f\u0084°\u009f¡ÃR\u0010C$tVf\u0084øRö\u009cåîÔ*Ã7²m ¼\u009f\u008a\u008eö}*l6[xI\u009f8\u00957ä&\"\u0015\u000e\u0004r", "ISO-8859-1", cArr, 0, 1179);
        f14091R = cArr;
        f14092S = 5367741728903270101L;
    }

    public static Ad.Video C0(Ad ad2) {
        f14093T = (f14094U + 117) % 128;
        Ad.Video video = ad2.getVideo();
        f14094U = (f14093T + 49) % 128;
        return video;
    }

    public static List D0(Ad ad2) {
        f14093T = (f14094U + 45) % 128;
        List extProtoList = ad2.getExtProtoList();
        int i5 = f14093T + 119;
        f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return extProtoList;
        }
        throw null;
    }

    public static String E0(Ad ad2) {
        int i5 = f14093T + 93;
        f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return ad2.getId();
        }
        ad2.getId();
        throw null;
    }

    public static Ad.Display.Banner F0(Ad.Display display) {
        f14093T = (f14094U + 33) % 128;
        Ad.Display.Banner banner = display.getBanner();
        f14093T = (f14094U + 59) % 128;
        return banner;
    }

    public static String G0(ByteString byteString) {
        int i5 = f14094U + 13;
        f14093T = i5 % 128;
        int i10 = i5 % 2;
        String stringUtf8 = byteString.toStringUtf8();
        if (i10 != 0) {
            int i11 = 65 / 0;
        }
        return stringUtf8;
    }

    public static String H0(RequestExtension requestExtension) {
        f14094U = (f14093T + 121) % 128;
        String sellerId = requestExtension.getSellerId();
        f14094U = (f14093T + 121) % 128;
        return sellerId;
    }

    public static ByteString I0(Any any) {
        f14093T = (f14094U + 73) % 128;
        ByteString value = any.getValue();
        int i5 = f14093T + 97;
        f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return value;
        }
        throw null;
    }

    public static String J0(Ad.Display display) {
        f14093T = (f14094U + 47) % 128;
        String adm = display.getAdm();
        f14093T = (f14094U + 111) % 128;
        return adm;
    }

    public static String K0(Ad.Video video) {
        int i5 = f14093T + 3;
        f14094U = i5 % 128;
        int i10 = i5 % 2;
        String adm = video.getAdm();
        if (i10 == 0) {
            int i11 = 1 / 0;
        }
        f14093T = (f14094U + 41) % 128;
        return adm;
    }

    public static String L0(Ad ad2, int i5) {
        f14093T = (f14094U + 31) % 128;
        String adomain = ad2.getAdomain(i5);
        int i10 = f14094U + 101;
        f14093T = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 81 / 0;
        }
        return adomain;
    }

    public static String M0(AdRequestParameters adRequestParameters) {
        int i5 = f14093T + 3;
        f14094U = i5 % 128;
        int i10 = i5 % 2;
        String name = adRequestParameters.getAdsType().getName();
        if (i10 == 0) {
            int i11 = 3 / 0;
        }
        return name;
    }

    public static List N0(Ad.Display.Banner banner) {
        int i5 = f14093T + 125;
        f14094U = i5 % 128;
        if (i5 % 2 == 0) {
            banner.getExtProtoList();
            throw null;
        }
        List extProtoList = banner.getExtProtoList();
        int i10 = f14093T + 37;
        f14094U = i10 % 128;
        if (i10 % 2 != 0) {
            return extProtoList;
        }
        throw null;
    }

    public static void O0(BannerView bannerView, BannerListener bannerListener) {
        f14093T = (f14094U + 17) % 128;
        bannerView.setListener(bannerListener);
        f14093T = (f14094U + 19) % 128;
    }

    public static Ad.Display P0(Ad ad2) {
        f14093T = (f14094U + 65) % 128;
        Ad.Display display = ad2.getDisplay();
        f14093T = (f14094U + 117) % 128;
        return display;
    }

    public static String Q0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14091R[i5 + i11] ^ (i11 * f14092S)) ^ c10);
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

    public static String R0(AdRequestParameters adRequestParameters) {
        int i5 = f14093T + 111;
        f14094U = i5 % 128;
        int i10 = i5 % 2;
        String placementId = adRequestParameters.getPlacementId();
        if (i10 == 0) {
            int i11 = 87 / 0;
        }
        int i12 = f14094U + 1;
        f14093T = i12 % 128;
        if (i12 % 2 == 0) {
            return placementId;
        }
        throw null;
    }

    public static String S0(Ad ad2, int i5) {
        int i10 = f14093T + 9;
        f14094U = i10 % 128;
        if (i10 % 2 == 0) {
            ad2.getBundle(i5);
            throw null;
        }
        String bundle = ad2.getBundle(i5);
        int i11 = f14094U + 11;
        f14093T = i11 % 128;
        if (i11 % 2 == 0) {
            return bundle;
        }
        throw null;
    }

    public static void T0(InterstitialAd interstitialAd, InterstitialListener interstitialListener) {
        int i5 = f14093T + 55;
        f14094U = i5 % 128;
        int i10 = i5 % 2;
        interstitialAd.setListener(interstitialListener);
        if (i10 == 0) {
            throw null;
        }
        f14093T = (f14094U + 123) % 128;
    }

    public static void U0(RewardedAd rewardedAd, RewardedListener rewardedListener) {
        int i5 = f14093T + 117;
        f14094U = i5 % 128;
        int i10 = i5 % 2;
        rewardedAd.setListener(rewardedListener);
        if (i10 == 0) {
            int i11 = 14 / 0;
        }
        f14093T = (f14094U + 53) % 128;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(Q0(928 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (63420 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern(), new W1());
        map.put(Q0(TextUtils.indexOf("", "", 0) + 942, ExpandableListView.getPackedPositionType(0L) + 11, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59476)).intern(), new O1());
        map.put(Q0(953 - ExpandableListView.getPackedPositionGroup(0L), 10 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 57447)).intern(), new M1());
        map.put(Q0(962 - Color.red(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 10, (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new N1());
        map.put(Q0(972 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, (char) (34542 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), new P1());
        map.put(Q0(KeyEvent.getDeadChar(0, 0) + 988, ExpandableListView.getPackedPositionGroup(0L) + 21, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new Q1());
        map.put(Q0(1009 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 8, (char) TextUtils.getTrimmedLength("")).intern(), new S1());
        map.put(Q0((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1016, 10 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new R1());
        map.put(Q0(1028 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 13, (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern(), new U1());
        map.put(Q0(((Process.getThreadPriority(0) + 20) >> 6) + 1040, 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16819286)).intern(), new X1());
        map.put(Q0(1054 - ((Process.getThreadPriority(0) + 20) >> 6), 9 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new V1());
        map.put(Q0(1064 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 11, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new Y1());
        map.put(Q0(1074 - View.getDefaultSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 23, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), new T1());
        map.put(Q0(1096 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 20, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), new C0913b2());
        map.put(Q0(View.resolveSize(0, 0) + 1116, 16 - MotionEvent.axisFromString(""), (char) (Color.green(0) + 14875)).intern(), new Z1());
        map.put(Q0(1133 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 15, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern(), new C0900a2());
        map.put(Q0(1148 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getFadingEdgeLength() >> 16) + 13, (char) (55071 - ExpandableListView.getPackedPositionType(0L))).intern(), new L1());
        map.put(Q0(1161 - TextUtils.getOffsetBefore("", 0), 18 - (Process.myPid() >> 22), (char) (63535 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new C0926c2());
        int i5 = f14093T + 69;
        f14094U = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        C1051la c1051la;
        Class<BidMachine> cls;
        String strIntern;
        int i5 = f14093T + 61;
        f14094U = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                c1051la = (C1051la) C0999ha.j().f14264b;
                cls = BidMachine.class;
                strIntern = Q0(TextUtils.getOffsetBefore("", 0), 45 - ExpandableListView.getPackedPositionGroup(1L), (char) (57234 % TextUtils.getOffsetBefore("", 0))).intern();
            } else {
                c1051la = (C1051la) C0999ha.j().f14264b;
                cls = BidMachine.class;
                strIntern = Q0(TextUtils.getOffsetBefore("", 0), ExpandableListView.getPackedPositionGroup(0L) + 12, (char) (57234 - TextUtils.getOffsetBefore("", 0))).intern();
            }
            c1051la.getClass();
            return C1051la.n(cls, strIntern);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:171:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x041c  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0939d2.w0(java.lang.String):java.lang.Class");
    }
}
