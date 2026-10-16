package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class K3 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13475R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f13476S;

    /* renamed from: T, reason: collision with root package name */
    public static int f13477T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13478U = 1;

    static {
        char[] cArr = new char[1352];
        R8.v.k("\u0083\bÃh\u0003¡Cñ\u0082/ÂC\u0002\u0088BÄ\u0081\u0010ÁH\u0001â@\u0005\u0080{À®\u0000ÆG\u001a\u0087_Ç\u0097\u0007ÓFF\u0086¿Æý\u0005,ES\u0085\u008cÅÜ\u00046D_\u0084ñË#\u000beK±\u008bÕÊ\u001f\u0000c@(\u0080ãÀû\u0001zA\u001a\u0081ÈÁ\u0094\u0002JBQ\u0082¯Ãc\u0003:Cþ\u0083\u0090ÄH\u0004\u0013DÃ\u0084\u0097Å3\u0005éEý\u0086iÆ\u0005\u0006ÃFÁ\u0087WÇ\u001e\u0007°Hb\u0088$Èð\b\u0094IN\u0089\u000bÉÆ\tÒJ\n\u008aäÊ¿\u000b}K-\u008bÇË\u008e\f@L\u0012\u008c´Íl\r\u0019Mù\u008dªÎ@\u000e\u001eNÝ\u008e\u009bÏ-\u000fÊO½\u0090yÐ*\u0010×P\u008e\u0091@Ñ8\u0011£Rs\u0092'Òã\u0012µSW\u0093\u0013\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ \u0006ËF\u009b\u0087_Ç\u000b\u0007\u00adH\u007f\u0088+\u008exÎ3\u000eøNà\u008faÏ\u0001\u000fÓO\u008f\u008cQÌJ\f´Mx\u008d!Íå\r\u008bJS\u008a\bÊØ\n\u008cK(\u008bòËæ\brH\u001e\u0088ØÈÚ\tLI\u0005\u0089«Æy\u0006?Fë\u0086\u008fÇU\u0007\u0010GÝ\u0087ÉÄ\u0011\u0004ÿD¤\u0085fÅ6\u0005ÜE\u0095\u0082[Â\t\u0002¯Cw\u0083\rÃù\u0003©@R\u0080\u0004ÀË\u0000\u0093A?\u0081öÁº\u001eL^\"\u009eþÞ\u0093\u001f]_\u000b\u009f\u00adÜu\u001c!\\÷\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£Ã_\u0003=Cø\u0083\u008aÄd\u0004\u0015DÓ\u0084\u0097Å$\u0005ÚEº\u0086~Æ\u0004\u0006ÇF¿\u0087ZÇ\u001c\u0007½Hn\u0088 ÈØ\b\u0083IS\u0089\u0007ÉÃ\t\u0095J7\u008aóÊ\u0092\u000bwK-\u008bÃ\u0000c@(\u0080ãÀû\u0001zA\u001a\u0081ÈÁ\u0094\u0002JBQ\u0082¯Ãc\u0003:Cþ\u0083\u0090ÄH\u0004\u0013DÃ\u0084\u0097Å3\u0005éEý\u0086iÆ\u0005\u0006ÃFÁ\u0087WÇ\u001e\u0007°Hb\u0088$Èð\b\u0094IN\u0089\u000bÉÆ\tÒJ\n\u008aäÊ¿\u000b}K-\u008bÇË\u008e\f@L\u0012\u008c´Íl\r\u0002Mþ\u008d½ÎM\u000e!NÖ\u008e\u009eÏ(\u000féO\u0099\u0090\u007fÐ9\u0010ÁP\u0084\u0091bÑ\u0015\u0011¡R~\u0092+Òç\u0012\u009dS@\u0093\u001eÓØ\u0013\u008eTV\u0094òÔ´\u0015WU4\u0095ÐÕ\u008cA\u0094\u0001ôÁ=\u0081m@³\u0000ßÀ\u0014\u0080XC\u008c\u0003ÔÃ~\u0082\u0091Bí\u0002\u0015ÂO\u0085\u009bEÙt\u001f4\u007fô¶´æu85Tõ\u009fµÓv\u00076_öõ·\u001awf7\u009f÷Ñ°\u000epS0\u0084ðÛ±g\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÉ\u0083\u0087ÄG\u0004\u0014DÒ\u0084\u008cÅ \u0005þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£Ã@\u00031Cÿ\u0083\u008bÄH\u0004\u0004DÞ\u0084\u0091Å+\u0005ÂE²\u0086wÆ\u0004x\u00888Çø\f¸{y³9Äù\u0002¹Wz´:ßúi»\u00ad{ò;?ûQ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃN\u0003;Cõ\u0083\u0096ÄL\u0004\u001eDÃ\u0084½Å*\u0005âE§\u0086hÆ\u000e\u0006ÄF\u0083\u0087SÇ\u000f\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃX\u0003:Cò\u0083\u0096Äj\u0004\u001fDÙ\u0084\u008aÅ7\u0005ãE¿\u0086vÆ\u0004\u0006Ú\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dâ\u0084\u0090Å,\u0005øE\u0090\u0086uÆ\u000f\u0006ÜF\u009d\u0087YÇ\u0011\u0007¨Hn\u0088 H¤\bØÈ\u0016\u0088PI©\tûÉ(\u0089pJ¥\nïÊN\u008b¨KÜ\u000b\u001aËv\u0000E@1\u0080ëÀ»\u0001hA\u0010\u0081æÁ\u0098\u0002KB\u000b\u0082£Ãc\u00031Cé\u009fÙ\u0003eC\u0005\u0083ÌÃ\u009c\u0002BB.\u0082åÂ©\u0001}A%\u0081\u008fÀg\u0000\r@Û\u0080¢Çv\u0007?Gé\u0087·Æ\f\u0006ÎF©\u0085_Å)\u0005áE¬\u0084YÄ>\u0004\u0086KS\u008b\u001bËÛ\u000b¸JH\u008a-Ê÷\n¤I\u001d\u0089ÉÉ\u0091\bXH\u0016\u0088øÎ2\u008eRN\u009b\u000eËÏ\u0015\u008fyO²\u000fþÌ*\u008crLØ\r0ÍZ\u008d\u008cMõ\n!Êh\u008a¾Jà\u000b[Ë\u0099\u008béH\u0005\b_È¥\u0088ñI#\trÉÌ\u0086<F@\u0006\u0091Æï\u00879G{\u0007«Çõ¢ââ\u009a\"^b\u0004£Çã\u0094#qc+ øà® \u001caÍ¡¬áF!%fé¦¡æm&/g\u0083\u0000I@)\u0080úÀ°\u0001nA\r\u0081ËÁ\u009d\u0002zB\r\u0082©Ãz\u0003'Cþ\u0083\u0090Äe\u0004\u0019DÄ\u0084\u008aÅ \u0005âE¶\u0086h\u0000T@&\u0080þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ$\u0006ÞF\u008a\u0087XÇ\t\u0007·HG\u0088;Èê\b\u0094IB\u0089\u0000ÉÐ\t\u008eJ\u0002\u008aîÊ°\u000bhK+\u008bÃË\u009fE¶\u0005ÖÅ\u001f\u0085OD\u0091\u0004ýÄ6\u0084zG®\u0007öÇ\\\u0086´FÞ\u0006\bÆq\u0081¥Aì\u0001:Ád\u0080ß@\u001d\u0000yÃ\u008b\u0083÷C#\u0003SÂ¦\u0082ìBO\r\u0086ÍÂ\u008d\nMs\f½Ìã\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dá\u0084\u0097Å!\u0005éE¼\u0086YÆ\u000e\u0006ÆF\u009b\u0087SÇ\u0013\u0007°HH\u0088=È÷\b\u0094IU\u0089\u0001ÉÙ\t\u0090J&\u008aø\u0000E@1\u0080ëÀ»\u0001hA\u0010\u0081æÁ\u0098\u0002KB\u000b\u0082£Ãc\u00031Cé\u0083£ÄM\u0004\u0011DÇ\u0084\u008aÅ \u0005þ\u0000V@.\u0080êÀ°\u0001sA \u0081ÅÁ\u009f\u0002LB\u001a\u0082¨Ãy\u0003\u0018Cò\u0083\u0091Ä]\u0004\u0015DÙ\u0084\u009bÅ7\u0005ÍE·\u0086{Æ\u0011\u0006ÜF\u008a\u0087DF\b\u0006GÆ\u0082\u0086æG<\u0007KÇ\u008f\u0087ûD\u0010\u0004J\u0000I@\u0006\u0080ãÀ§\u0001}A\n\u0081ÎÁ¦\u0002]B\u001d\u0082\u0090Ãd\u00031Cì\u0083¡ÄF\u0004\u001eDÃ\u0084\u008cÅ*\u0005àE¿\u0086\u007fÆ\u0013Óï\u0093 S~\u0013\u001aÒÞ\u0092 Rc\u0012\u001cÑ÷\u0091\u00adÙ\u0013\u0099pY¤\u0019ýØ#\u0098JX\u0083\u0018ÂÛ\r\u009bK[Ø\u001a6Úz\u009a \u0000I@\u0006\u0080üÀ¼\u0001\u007fA\u000b\u0081çÁ\u0094\u0002\\B\u0016\u0082§Ã[\u0003=Cÿ\u0083\u0087ÄF\u0004&DÞ\u0084\u009bÅ2\u0000B@&\u0080ýÀ°\u0001JA\n\u0081ÎÁ\u0094\u0002WB)\u0082¯Ãh\u0003#C×\u0083\u008bÄZ\u0004\u0004DÒ\u0084\u0090Å \u0005þ\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃK\u0003!C÷\u0083\u008eÄZ\u0004\u0013DÅ\u0084\u009bÅ \u0005âE\u0092\u0086~Æ$\u0006ÞF\u008a\u0087XÇ\t\u0007·HG\u0088;Èê\b\u0094IB\u0089\u0000ÉÐ\t\u008eJ\u0014\u008aãÊ¥\u000bpK\u0016\u008bËË\u009d\fFL\u001e\u008c±Íz\r9Mø\u008d°Îa\u000e\rNÇ\u008e\u009b\u0000I@)\u0080àÀ°\u0001nA\u0002\u0081ÉÁ\u0085\u0002QB\t\u0082£ÃL\u00030CÍ\u0083\u008bÄL\u0004\u0007Dò\u0084\u0088Å \u0005âE§\u0086iÆ-\u0006ÁF\u009c\u0087BÇ\u0018\u0007ªHn\u0088 ÈÎ\b\u0089IS\u0089\u0006Éü\t\u0091J3\u008aøÊ´\u000bkK,\u008bÏË\u0082\fZL?\u008c£Í}\r1\u0083|Ã9\u0003áC\u008d\u0082rÂ\n\u0002ÃB\u008f\u0081MÁ\u0010\u0001\u008d@d\u0080 Àã\u0000\u009cGA\u0087\u0018ÇÉ\u0007\u0081F\f\u0086òÆ¹\u0005tE\u001f\u0085ÀÅ\u0080Í×\u008d\u0092MJ\r6ÌÜ\u008c¼Ln\f\bÏì\u0099\u0095ÙÐ\u0019\bYf\u0098\u008aØÒ\u00187Xm\u009b¾Ûè\u001bZZ\u008b\u0098iØ4\u0018ÈX \u0099pÙ\u000f\u0019ÙY\u0092\u009aJÚ\u001a\u001a£[c\u009b\u0015Ûÿ\u0000i@4\u0080ØÀ¼\u0001xA\u0006\u0081ÅÁ°\u0002\\\u0004ÕD\u0090\u0084HÄ$\u0005ÂE¸\u0085{Å(\u0006ÞF¥\u0086\u0006ÇÐ\u0007\u0093GN\u00878ÀÎ\u0000°@i\u0000g@\"\u0080úÀ\u0099\u0001}A\u001a\u0081ÅÁ\u0084\u0002L\u000faO$\u008füÏ\u0080\u000e\u007fN\t\u008eÉÎ\u0094\rJM\u001c\u008d¤Ì^\f<Lô\u008c\u0090Ël\u000b\u0019Kß\u008b\u008cÊ1\nåJ¹\u0089pÉ\u0002\tÜ\u0000g@\"\u0080úÀ\u0086\u0001yA\u000f\u0081ÏÁ\u0092\u0002LB\u001a\u0082¢ÃN\u0003;Cõ\u0083\u0096ÄL\u0004\u001eDÃ\u0084½Å*\u0005âE§\u0086hÆ\u000e\u0006ÄF\u0083\u0087SÇ\u000f\u0000g@\"\u0080úÀ\u0090\u0001jA\u0006\u0081ÄÁ\u0085\u0002KB3\u0082¯Ã~\u0003 Cþ\u0083\u008cÄL\u0004\u00020Yp\b°Ððº1@q,±îñ¯2ar\u0019²\u0085óT3\nsÔ³¦ôf4(Ú8\u009a}Z¥\u001aËÛ'\u009bo[\u0085\u001bÁØ\u0013\u0000g@\"\u0080úÀ\u0080\u0001rA\n\u0081ÞÁµ\u0002QB\f\u0082¶Ãa\u00035Câ\u0083¶ÄP\u0004\u0000DÒ\u0084»Å+\u0005ùE¾\u0000g@\"\u0080úÀ\u0098\u0001nA\u0002\u0081ÃÁ\u0095\u0002zB\u001e\u0082¨Ãc\u00031Cé\u0083´Ä@\u0004\u0015DÀ\u0084·Å!nò.·îo®\toä/\u0086ïM¯\u0001lÞ,\u0099ì:\u00ad÷m¯-Jí\u0016ªÈj\u0084*fê\u0004«½kx+/èá\u0000I@\t\u0080ÚÀ\u0090\u0001NA0\u0081þÁ¸\u0002lB6\u0082\u0087ÃA\u0017ËW\u0081\u0097G×\u0016\u0016ÈV§\u0096lÖ&\u0015ú\u0000M@\u0015\u0080ËÀ\u0096\u0001HgH'\fçÊ§\u0091fS&;\u000bRK\u0002\u008bÙË\u0094\nNJ'\u008aïÊµ\u0000S@\u0016\u0080ÛÀ\u0094\u0001NA&\u0000V@\u0002\u0080ÜÀ\u0081\u0001UA \u0081ëÁ½\u008bÑË\u0097\u000b]K\u0001\u008aÜÊº\nk", "ISO-8859-1", cArr, 0, 1352);
        f13475R = cArr;
        f13476S = 7482872454586449991L;
    }

    public static InneractiveUnitController C0(InneractiveAdSpot inneractiveAdSpot) {
        f13478U = (f13477T + 1) % 128;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        int i5 = f13477T + 43;
        f13478U = i5 % 128;
        if (i5 % 2 != 0) {
            return selectedUnitController;
        }
        throw null;
    }

    public static String D0(InneractiveAdSpot inneractiveAdSpot) {
        f13477T = (f13478U + 87) % 128;
        String clickThroughUrl = inneractiveAdSpot.getAdContent().getClickThroughUrl();
        f13477T = (f13478U + 37) % 128;
        return clickThroughUrl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Enum E0(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.K3.E0(java.lang.String):java.lang.Enum");
    }

    public static boolean F0(InneractiveAdSpot inneractiveAdSpot) {
        f13478U = (f13477T + 39) % 128;
        boolean zIsFullscreenAd = inneractiveAdSpot.getAdContent().isFullscreenAd();
        int i5 = f13477T + 55;
        f13478U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 35 / 0;
        }
        return zIsFullscreenAd;
    }

    public static boolean G0(InneractiveAdSpot inneractiveAdSpot) {
        f13478U = (f13477T + 7) % 128;
        boolean zIsVideoAd = inneractiveAdSpot.getAdContent().isVideoAd();
        int i5 = f13477T + 67;
        f13478U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 20 / 0;
        }
        return zIsVideoAd;
    }

    public static int H0() {
        int i5 = f13477T + 117;
        f13478U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = R.id.inneractive_webview_mraid;
            throw null;
        }
        int i11 = R.id.inneractive_webview_mraid;
        int i12 = f13478U + 99;
        f13477T = i12 % 128;
        if (i12 % 2 == 0) {
            return i11;
        }
        throw null;
    }

    public static Object I0(InneractiveAdSpot inneractiveAdSpot) {
        int i5 = f13478U + 15;
        f13477T = i5 % 128;
        if (i5 % 2 != 0) {
            inneractiveAdSpot.getAdContent();
            throw null;
        }
        com.fyber.inneractive.sdk.c.f adContent = inneractiveAdSpot.getAdContent();
        f13478U = (f13477T + 47) % 128;
        return adContent;
    }

    public static InneractiveAdRequest J0(InneractiveAdSpot inneractiveAdSpot) {
        f13478U = (f13477T + 105) % 128;
        InneractiveAdRequest currentProcessedRequest = inneractiveAdSpot.getCurrentProcessedRequest();
        f13478U = (f13477T + 61) % 128;
        return currentProcessedRequest;
    }

    public static InneractiveAdSpot K0(InneractiveAdViewUnitController inneractiveAdViewUnitController) {
        f13478U = (f13477T + 63) % 128;
        InneractiveAdSpot adSpot = inneractiveAdViewUnitController.getAdSpot();
        f13478U = (f13477T + 45) % 128;
        return adSpot;
    }

    public static Object L0(InneractiveUnitController inneractiveUnitController) {
        f13477T = (f13478U + 37) % 128;
        InneractiveContentController selectedContentController = inneractiveUnitController.getSelectedContentController();
        f13478U = (f13477T + 25) % 128;
        return selectedContentController;
    }

    public static String M0(ImpressionData impressionData) {
        int i5 = f13477T + 67;
        f13478U = i5 % 128;
        if (i5 % 2 != 0) {
            return impressionData.getAdvertiserDomain();
        }
        impressionData.getAdvertiserDomain();
        throw null;
    }

    public static String N0(InneractiveAdRequest inneractiveAdRequest) {
        f13478U = (f13477T + 29) % 128;
        String spotId = inneractiveAdRequest.getSpotId();
        f13478U = (f13477T + 121) % 128;
        return spotId;
    }

    public static String O0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13475R[i5 + i11] ^ (i11 * f13476S)) ^ c10);
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

    public static ViewGroup P0(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        int i5 = f13477T + 13;
        f13478U = i5 % 128;
        int i10 = i5 % 2;
        ViewGroup layout = inneractiveFullscreenAdActivity.getLayout();
        if (i10 == 0) {
            int i11 = 31 / 0;
        }
        f13477T = (f13478U + 51) % 128;
        return layout;
    }

    public static InneractiveContentController.EventsListener Q0(InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController) {
        f13477T = (f13478U + 65) % 128;
        InneractiveContentController.EventsListener eventsListener = inneractiveFullscreenVideoContentController.getEventsListener();
        int i5 = f13478U + 109;
        f13477T = i5 % 128;
        if (i5 % 2 == 0) {
            return eventsListener;
        }
        throw null;
    }

    public static void R0(InneractiveContentController inneractiveContentController, InneractiveContentController.EventsListener eventsListener) {
        int i5 = f13478U + 73;
        f13477T = i5 % 128;
        int i10 = i5 % 2;
        inneractiveContentController.setEventsListener(eventsListener);
        if (i10 != 0) {
            int i11 = 57 / 0;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(O0(View.combineMeasuredStates(0, 0) + 1033, 26 - TextUtils.indexOf("", "", 0, 0), (char) (33563 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), new D3());
        map.put(O0(1059 - TextUtils.indexOf("", ""), 9 - TextUtils.getTrimmedLength(""), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 52656)).intern(), new I3());
        map.put(O0(1067 - TextUtils.lastIndexOf("", '0'), 12 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (39410 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern(), new H3());
        map.put(O0(1080 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 14 - ExpandableListView.getPackedPositionType(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 38913)).intern(), new C1198x3());
        map.put(O0(View.resolveSize(0, 0) + 1094, ((Process.getThreadPriority(0) + 20) >> 6) + 9, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new C1210y3());
        map.put(O0(1103 - View.combineMeasuredStates(0, 0), 18 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 1202)).intern(), new B3());
        map.put(O0(1121 - TextUtils.indexOf("", "", 0, 0), 9 - TextUtils.indexOf("", "", 0, 0), (char) ((-1) - MotionEvent.axisFromString(""))).intern(), new A3());
        map.put(O0(1130 - Color.argb(0, 0, 0, 0), 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (3846 - Color.blue(0))).intern(), new C3());
        map.put(O0(1155 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new C1222z3());
        map.put(O0((Process.myTid() >> 22) + 1183, TextUtils.indexOf("", "") + 17, (char) Drawable.resolveOpacity(0, 0)).intern(), new E3());
        map.put(O0((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1199, (ViewConfiguration.getJumpTapTimeout() >> 16) + 17, (char) (12330 - TextUtils.getTrimmedLength(""))).intern(), new F3());
        map.put(O0(Color.alpha(0) + 1217, ImageFormat.getBitsPerPixel(0) + 10, (char) (Process.getGidForName("") + 55904)).intern(), new G3());
        map.put(O0(1225 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 21, (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), new B1(28));
        map.put(O0(1248 - ExpandableListView.getPackedPositionGroup(0L), 20 - Color.blue(0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), new B1(29));
        map.put(O0(1268 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 22, (char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 28309)).intern(), new J3());
        f13478U = (f13477T + 125) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f13478U = (f13477T + 55) % 128;
        String version = InneractiveAdManager.getVersion();
        f13478U = (f13477T + 81) % 128;
        return version;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f4  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 1792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.K3.w0(java.lang.String):java.lang.Class");
    }
}
