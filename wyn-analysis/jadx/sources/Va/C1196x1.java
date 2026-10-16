package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.amazon.aps.ads.ApsAd;
import com.amazon.aps.ads.ApsAdRequest;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.DTBFetchFactory;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: Va.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1196x1 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14759R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f14760S;

    /* renamed from: T, reason: collision with root package name */
    public static int f14761T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14762U = 1;

    static {
        char[] cArr = new char[1191];
        R8.v.k("Ò<\u0017óY©\u0083[Åe\u000e¹p´º±ü\u0017&\u001akÕ\u00ad\u0085\u0097¼_ã\u009a\rÔf\u000e¦Hé\u0083<ý\u00137[q\u0088«àæ8 r\u001aIT\u0083\u0015'Ðü\u009e·DC\u0002,Éà·È}\u0098;Rá4¬ô\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016ýÜ\u001d¢]g\u0089-£óá¹\u0019î³+he#¿ßùµ2tLP\u0086\bÀÜ\u001a Wp\u0091:«\u001aåÙ?\u0081xS²$Ìø\u0006Ø@\u0090\u009dB×$\u0011ü\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u009a\u0016ðÜ\u001d¢Qg\u008d-¹óá¹\t\u007f_D\u009f\n Ðà\u0096\u0016\\A!\u0099çÑ\u00adõs'9mþ\u009da-¤öê½0Iv!½ßÃÈ\t\u0090OX\u0095<Øî\u001e¤$\u0094\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016úÜ(¢Wg\u008b-£óã¹\t\u007f_D\u008f\u0000DÅ\u009f\u008bÔQ \u0017HÜ¾¢¬hù.=ôQ¹\u009d\u007fÍEí\u000b;Ñs\u0096\u0084\\Üb\u0016§Íé\u00863ru\u001a¾éÀÿ\n¾Ln\u0096\u0014ÛÎ\u009e\u0093[H\u0015\u0003Ï÷\u0089\u009fBr<pö+°új\u0091'Já\u001aè#-øc³¹Gÿ/4ÂJÀ\u0080\u0099ÆO\u001c+Qç\u0097\u00ad\u00ad\u0086\u0000DÅ\u009f\u008bÔQ \u0017HÜ¡¢«hè./\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fÝEá\u000b9Ñs\u0096\u0086\\Õ\"Uè'®us¯9\u0089ÿ6Åi\u008bJP\u0092\u0016úÜ?¢]g\u009a-½i_¬\u0084âÏ8;~Sµ¿Ë°\u0001ìG&\u0081³Dh\n#Ð×\u0096¿]V#\\é\u001f¯Øu\u00878lþ>Ä\u0003\u008a×P\u009f\u0017fÝ\u0004£àiØ/\u0083òE¸$Ê¼\u000fgA,\u009bßÝ±\u0016{hY¢\u001däæ>ºsuµ5\u008f\u0013ÁÅ\u001b\u009b\u0000DÅ\u009f\u008bÔQ'\u0017IÜ\u0083¢¡hå.\u0015ôB¹\u0080\u007fØEã\u000b*Ñh»\u0006~Ý0\u0096êq¬\u000bgÛ\u0019äÓª\u0095hO\u0004\u0002Þ\u0000DÅ\u009f\u008bÔQ \u0017HÜµ¢£hã.6ôF¹\u009c\u007fõEí\u000b<Ñn\u0096\u0080\\Þ\"\u001eè4\u0000DÅ\u009f\u008bÔQ \u0017HÜµ¢£hþ.=ôa¹\u008f\u007f×Eê\u000b*Ñh\u0096©\\Ù\"\bè2®ts²9Âÿ\u0000\u0004:Áá\u008fªU^\u00136ØË¦Ýl\u0080*Cð\u0014½þ{³A\u009f\u000fCÕ\u0017\u0092ïX§&qìQª\u000ewÎ=\u0095ûeÁ0\u008f\u0002TÈ\u0012\u008eØr¦8\u0000DÅ\u009f\u008bÔQ \u0017HÜ´¢£há.4ôA¹\u008f\u007fÚEïÜÖ\u0019\rWF\u008d²ËÚ\u0000 ~(´oò«(ße\u0018£N\u0099r×\u0091\ráJ\u0004\u0080Vþ\u008c4ºræ¯<\u0000DÅ\u009f\u008bÔQ \u0017HÜ¾¢¬hù.=ôQ¹\u009d\u007fÍEí\u000b;Ñs\u0096\u0084\\Ü\"7è/®bs¨9Âÿ\u001cÅX\u008bz\u0000DÅ\u009f\u008bÔQ \u0017HÜ»¢«hþ.,ôF¹\u0080\u007fÜEö\u0010ÍÕ\u0010\u009bBA\u0099\u0007ÛÌ\u000f²<xq>³äò©\u0016oSUu\u001b\u009bÁâ\u0086\fµíp0>jä ¢ði-\u0017\u000eÝ@\u009b\u008eAè\f\u0004ÊeðO¾\u0080dÊ#?él\u0000AÅ»\u008båQ(\u0017BÜ\u0083¢§hÿ.+ôW¹\u0087\u007fÍEí\u000b.Ñv\u0096¤\\Ó\"\u000fè/®gsµ9Óÿ\u000b\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fØEô\u000b<Ñ4\u0096\u0084\\Ô\"\bèh®ps¿9Óÿ\u001bÅK\u008baP§\u0016çÜG¢ug\u008f-¹óÜ¹\u000e\u007f_D\u0093\n³Ðÿ\u0096#\\K!\u0099çÑ\u00adâs\"9Xþ\u0087ÄÛ\u008a\u0013P3\u0016yÛ¯¡ß?\u001aúà´¾n{(\u0013ãí\u009dúW¢\u0011jË\u000e\u0086Ü@\u0096z¦\u0000cÅ¤\u008bûQO\u0017MÜ\u009a¢£h÷.7ôM¹À\u007fØEô\u000b<Ñ4\u0096\u0084\\Ô\"\bèh®ps¿9Óÿ\u001bÅK\u008baP§\u0016çÜG¢ug\u008f-¹óÔ¹\u0004\u007fjD\u0095\nµÐå\u0096!\\K!\u0099çÁ\u0000AÅ»\u008båQ \u0017HÜ¡¢«hè./\u0000AÅ»\u008bå>vû\u008cµÒo\u0017)\u007fO!\u008aÛÄ\u0085\u001e@X(\u0093ÔíÍ'\u0083aL»1öá0µ\n\u0088DJ\u009e\b\u0000AÅ»\u008båQ \u0017HÜ»¢«hþ.,ôF¹\u0080\u007fÜEöùM<·ré¨,îD%©[«\u0091ð×!\rJ@\u0091\u0086Á¼Äò*(eo\u009d¥ÙÛ\u0019\u0011/Wo\u0000AÅ»\u008båQ \u0017HÜ±¢\u00adhÿ.5ôB¹\u009aª\\o¦!øû=½Uv¾\b¦Âà\u0084 \u0003þÆ\u0004\u0088ZR\u009f\u0014÷ß\u001a¡\u0018kC-\u0092÷ùº\"|rïa*¨dä¾&øZ3\u0081M\u008f\u0087îÁ'P%\u0095ìÛ \u0001eG\u000b\u008cÁòã8§~\\¤\u0000éÏ/\u008f\u0015©[\u007f\u0081!Æî\f\u009crJ¸pþ2#ði\u0086¯U¦¼cu-9÷û±\u0093z~\u0004|Î%\u0088óR\u0097\u001f[Ù\u0011ã:\u00adÖw¨0Zú\"\u0084Ä\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\fÑh\u0096\u0080\\Ñ\"\u000fè/®gs¹9îÿ\u0016\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u0006Ñw\u0096\u0095\\Â\"\u001eè5®bsµ9Èÿ\u001cÅh\u008bzP¿\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u001dÑ\u007f\u0096\u008b\\Ô\"\u001eè4®xs²9Àÿ?Å\\\u008bx!þä7ª{p¹6Ñý<\u0083>Ig\u000f±ÕÕ\u0098\u0019^Sdx*\u0084ðæ·\u0012}M\u0003\u0087É\u00ad\u008fáR+\u0018YÞ©äÑªÿq.7ký\u0095[´\u009e}Ð1\nöL\u009a\u0087Bùp3+uç¯\u0084âk$\u0003\u001e3Pù\u008a¦Íw\u0007\u0007yÛ³Çõ§(~b\u0001¤Ä\u009e\u009dÐ¯\u000bCM8\u0087Éù\u0093<Cvt¨\u0016âÒ$\u008a\u001fDQ\u007f\u008b,\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u000eÑ~\u0096\u0096\u0000gÅ®\u008bâQ \u0017HÜ¥¢§hþ.(ôL¹\u0080\u007fÊEá\u000b\u001fÑh\u0096\u008c\\Ó\"\u001eè\u0016®~sµ9Éÿ\u0006v ³éý¥'ga\u000fªãÔì\u001e°Xz\u00827ÏÅ\t\u00913·}]§\bàë*³\u0000gÅ®\u008bâQ \u0017HÜ¤¢«h÷.=ôb¹\u008a\u007fíEý\u000b?Ñ\u007fsH¶\u0081øÍ\"\u000fdg¯\u008bÑ\u0084\u001bØ]\u0012\u0087\\Ê´\fô6øx\u0005¢Aå¾/öQ:\u009b\u000eÝM\u0000iÅ¸\u008b×Q\u0005\u0017\u007fÜ\u009e¢¸hè.\u0011ôM¹\u009a\u007fÜEö\u000b<Ñn\u0096\u008c\\Ä\"\u0012è'®}s\u009d9Ã\u0000cÅ¹\u008bóQ\u0000\u0017XÜ\u0092¢\u0096hÏ.\u001eôF¹\u009a\u007fÚEì\u000b\tÑ{\u0096\u0086\\Ä\"\u0014è4®hs\u00919Æÿ\u001cÅ\\\u008boP¶\u0016ìÜ$¢Ug\u008f\u0000cÅ¹\u008bóQ\u0000\u0017XÜ\u0092¢\u0096hÏ.\u001dô[¹\u008b\u007fÚEñ\u000b;Ñu\u0096\u0097\\ã\"\u001eè4®gsµ9Äÿ\u0017\u0000gÅ®\u008bâQ \u0017\\Ü\u0084¢\u0083hé.\nôF¹\u009f\u007fÌEá\u000b<Ñn Cå\u008a«Æq\u00077aü·\u0082¯HÇ\u000e\u001aÔh\u0097\u0004RÍ\u001c\u0081ÆR\u0080=Ký5Âÿ\u008b¹kc/.äè´Ò\u0093\u0094\u009cQU\u001f\u0019ÅÉ\u0083»Hc6Mü#ºÖ`±-q¤.aç/«õi³\u0015xÍ\u0006ÊÌ \u008aWP\u0005\u001dÕÛ\u009dá¬¯r!wä¾ªòp06Xý«\u0083½Iü\u000f,ÕV\u0098\u008c\u0000gÅ®\u008bâQ \u0017HÜ¡¢«hè./", "ISO-8859-1", cArr, 0, 1191);
        f14759R = cArr;
        f14760S = -6125157440420461109L;
    }

    public static DTBFetchFactory C0() {
        DTBFetchFactory dTBFetchFactory;
        int i5 = f14762U + 1;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            dTBFetchFactory = DTBFetchFactory.getInstance();
            int i10 = 35 / 0;
        } else {
            dTBFetchFactory = DTBFetchFactory.getInstance();
        }
        int i11 = f14761T + 115;
        f14762U = i11 % 128;
        if (i11 % 2 != 0) {
            return dTBFetchFactory;
        }
        throw null;
    }

    public static String D0(ApsAd apsAd) {
        f14761T = (f14762U + 21) % 128;
        String slotUuid = apsAd.getSlotUuid();
        f14761T = (f14762U + 33) % 128;
        return slotUuid;
    }

    public static List E0(DTBAdResponse dTBAdResponse) {
        int i5 = f14762U + 61;
        f14761T = i5 % 128;
        int i10 = i5 % 2;
        List dTBAds = dTBAdResponse.getDTBAds();
        if (i10 != 0) {
            int i11 = 17 / 0;
        }
        return dTBAds;
    }

    public static HashMap F0(DTBAdResponse dTBAdResponse) {
        int i5 = f14762U + 3;
        f14761T = i5 % 128;
        int i10 = i5 % 2;
        HashMap renderingMap = dTBAdResponse.getRenderingMap();
        if (i10 != 0) {
            int i11 = 81 / 0;
        }
        f14762U = (f14761T + 121) % 128;
        return renderingMap;
    }

    public static DTBAdView G0(ApsAd apsAd) {
        int i5 = f14762U + 75;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            apsAd.getAdView();
            throw null;
        }
        DTBAdView adView = apsAd.getAdView();
        f14761T = (f14762U + 91) % 128;
        return adView;
    }

    public static String H0() {
        f14761T = (f14762U + 101) % 128;
        String appKey = AdRegistration.getAppKey();
        int i5 = f14762U + 91;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 63 / 0;
        }
        return appKey;
    }

    public static Map I0(DTBAdResponse dTBAdResponse) {
        int i5 = f14762U + 113;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
            throw null;
        }
        Map defaultVideoAdsRequestCustomParams = dTBAdResponse.getDefaultVideoAdsRequestCustomParams();
        int i10 = f14761T + 45;
        f14762U = i10 % 128;
        if (i10 % 2 != 0) {
            return defaultVideoAdsRequestCustomParams;
        }
        throw null;
    }

    public static ApsAdRequest J0(ApsAd apsAd) {
        f14762U = (f14761T + 13) % 128;
        ApsAdRequest adLoader = apsAd.getAdLoader();
        f14761T = (f14762U + 27) % 128;
        return adLoader;
    }

    public static Bundle K0(DTBAdResponse dTBAdResponse) {
        int i5 = f14762U + 81;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            dTBAdResponse.getRenderingBundle();
            throw null;
        }
        Bundle renderingBundle = dTBAdResponse.getRenderingBundle();
        f14761T = (f14762U + 47) % 128;
        return renderingBundle;
    }

    public static ApsAdFormat L0(ApsAd apsAd) {
        f14761T = (f14762U + 77) % 128;
        ApsAdFormat apsAdFormat = apsAd.getApsAdFormat();
        int i5 = f14761T + 107;
        f14762U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 45 / 0;
        }
        return apsAdFormat;
    }

    public static AdType M0(DTBAdSize dTBAdSize) {
        int i5 = f14762U + 65;
        f14761T = i5 % 128;
        int i10 = i5 % 2;
        AdType dTBAdType = dTBAdSize.getDTBAdType();
        if (i10 != 0) {
            int i11 = 69 / 0;
        }
        f14762U = (f14761T + 103) % 128;
        return dTBAdType;
    }

    public static String N0(DTBAdResponse dTBAdResponse) {
        int i5 = f14762U + 121;
        f14761T = i5 % 128;
        if (i5 % 2 != 0) {
            dTBAdResponse.getBidId();
            throw null;
        }
        String bidId = dTBAdResponse.getBidId();
        f14762U = (f14761T + 63) % 128;
        return bidId;
    }

    public static String O0(ApsAd apsAd) {
        int i5 = f14761T + 49;
        f14762U = i5 % 128;
        if (i5 % 2 == 0) {
            apsAd.getBidInfo();
            throw null;
        }
        String bidInfo = apsAd.getBidInfo();
        int i10 = f14761T + 103;
        f14762U = i10 % 128;
        if (i10 % 2 != 0) {
            return bidInfo;
        }
        throw null;
    }

    public static JSONObject P0(DTBAdSize dTBAdSize) {
        f14762U = (f14761T + 111) % 128;
        JSONObject pubSettings = dTBAdSize.getPubSettings();
        f14761T = (f14762U + 57) % 128;
        return pubSettings;
    }

    public static String Q0(ApsAd apsAd) {
        f14761T = (f14762U + 95) % 128;
        String pricePoint = apsAd.getPricePoint();
        f14762U = (f14761T + 13) % 128;
        return pricePoint;
    }

    public static String R0(DTBAdResponse dTBAdResponse) {
        f14761T = (f14762U + 45) % 128;
        String crid = dTBAdResponse.getCrid();
        int i5 = f14762U + 53;
        f14761T = i5 % 128;
        if (i5 % 2 == 0) {
            return crid;
        }
        throw null;
    }

    public static ApsAdRequest S0(ApsAd apsAd) {
        f14762U = (f14761T + 125) % 128;
        ApsAdRequest apsAdRequest = apsAd.getApsAdRequest();
        f14761T = (f14762U + 99) % 128;
        return apsAdRequest;
    }

    public static String T0(DTBAdResponse dTBAdResponse) {
        f14761T = (f14762U + 115) % 128;
        String impressionUrl = dTBAdResponse.getImpressionUrl();
        f14762U = (f14761T + 73) % 128;
        return impressionUrl;
    }

    public static boolean U0(DTBAdSize dTBAdSize) {
        f14761T = (f14762U + 27) % 128;
        boolean zIsInterstitialAd = dTBAdSize.isInterstitialAd();
        f14761T = (f14762U + 1) % 128;
        return zIsInterstitialAd;
    }

    public static String V0(DTBAdSize dTBAdSize) {
        f14762U = (f14761T + 61) % 128;
        String slotUUID = dTBAdSize.getSlotUUID();
        int i5 = f14761T + 117;
        f14762U = i5 % 128;
        if (i5 % 2 != 0) {
            return slotUUID;
        }
        throw null;
    }

    public static String W0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14759R[i5 + i11] ^ (i11 * f14760S)) ^ c10);
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

    public static String X0(DTBAdResponse dTBAdResponse, DTBAdSize dTBAdSize) {
        f14762U = (f14761T + 31) % 128;
        String pricePoints = dTBAdResponse.getPricePoints(dTBAdSize);
        int i5 = f14762U + 41;
        f14761T = i5 % 128;
        if (i5 % 2 == 0) {
            return pricePoints;
        }
        throw null;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(W0(AndroidCharacter.getMirror('0') + 705, 9 - View.resolveSizeAndState(0, 0, 0), (char) (Drawable.resolveOpacity(0, 0) + 61190)).intern(), new J0(19));
        map.put(W0((ViewConfiguration.getJumpTapTimeout() >> 16) + 762, 22 - TextUtils.lastIndexOf("", '0', 0), (char) (TextUtils.getTrimmedLength("") + 20546)).intern(), new J0(18));
        map.put(W0(TextUtils.indexOf("", "", 0, 0) + 785, Color.blue(0) + 18, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 42715)).intern(), new C1016j1());
        map.put(W0(TextUtils.getTrimmedLength("") + 803, ((byte) KeyEvent.getModifierMetaStateMask()) + 24, (char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1)).intern(), new C1042l1());
        map.put(W0(Gravity.getAbsoluteGravity(0, 0) + 826, 26 - (Process.myTid() >> 22), (char) (Process.getGidForName("") + 1)).intern(), new C0990h1());
        map.put(W0((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 851, Color.blue(0) + 25, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new C1003i1());
        map.put(W0(876 - Process.getGidForName(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, (char) (8601 - (ViewConfiguration.getTouchSlop() >> 8))).intern(), new C1068n1());
        map.put(W0((KeyEvent.getMaxKeyCode() >> 16) + 905, 37 - (Process.myTid() >> 22), (char) (23508 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), new C1081o1());
        map.put(W0(942 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.combineMeasuredStates(0, 0) + 16, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern(), new C1055m1());
        map.put(W0(((byte) KeyEvent.getModifierMetaStateMask()) + 959, KeyEvent.keyCodeFromString("") + 23, (char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new C1119r1());
        map.put(W0((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 981, 17 - View.MeasureSpec.getMode(0), (char) (30279 - View.resolveSizeAndState(0, 0, 0))).intern(), new C1107q1());
        map.put(W0(999 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0)).intern(), new C1029k1());
        map.put(W0((ViewConfiguration.getEdgeSlop() >> 16) + 1013, 20 - (ViewConfiguration.getTapTimeout() >> 16), (char) (29488 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), new C1094p1());
        map.put(W0(1033 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 22, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new C1158u1());
        String strIntern = W0(1055 - View.MeasureSpec.getMode(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 29, (char) Color.red(0)).intern();
        C0912b1 c0912b1 = new C0912b1(1);
        c0912b1.f14021b = this;
        map.put(strIntern, c0912b1);
        String strIntern2 = W0((ViewConfiguration.getTouchSlop() >> 8) + 1085, 23 - View.resolveSizeAndState(0, 0, 0), (char) View.getDefaultSize(0, 0)).intern();
        C0912b1 c0912b12 = new C0912b1(0);
        c0912b12.f14021b = this;
        map.put(strIntern2, c0912b12);
        map.put(W0(1108 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 15 - View.MeasureSpec.getSize(0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern(), new C1145t1());
        map.put(W0(1123 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 8228)).intern(), new C1132s1());
        map.put(W0(1132 - ImageFormat.getBitsPerPixel(0), 13 - Color.argb(0, 0, 0, 0), (char) (38755 - Color.argb(0, 0, 0, 0))).intern(), new C0938d1());
        map.put(W0(View.getDefaultSize(0, 0) + 1146, 10 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 38140)).intern(), new C0964f1());
        map.put(W0(1157 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - Color.argb(0, 0, 0, 0), (char) (AndroidCharacter.getMirror('0') + 42009)).intern(), new C0925c1());
        map.put(W0(1171 - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf("", "", 0) + 11, (char) (ExpandableListView.getPackedPositionType(0L) + 8464)).intern(), new C0951e1());
        map.put(W0((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1182, '9' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new C0977g1());
        f14761T = (f14762U + 13) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14761T = (f14762U + 79) % 128;
        Matcher matcher = Pattern.compile(W0(ViewConfiguration.getKeyRepeatDelay() >> 16, 13 - TextUtils.getOffsetAfter("", 0), (char) (53778 - (ViewConfiguration.getEdgeSlop() >> 16))).intern()).matcher(u0());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int i5 = f14762U + 63;
        f14761T = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String u0() {
        f14761T = (f14762U + 125) % 128;
        String version = AdRegistration.getVersion();
        f14761T = (f14762U + 125) % 128;
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:140:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0163  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1196x1.w0(java.lang.String):java.lang.Class");
    }
}
