package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.vpaid.VideoAd;
import net.pubnative.lite.sdk.vpaid.VideoAdController;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;
import net.pubnative.lite.sdk.vpaid.models.vast.ClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.Companion;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionAds;
import net.pubnative.lite.sdk.vpaid.models.vast.CompanionClickThrough;
import net.pubnative.lite.sdk.vpaid.models.vast.Creative;
import net.pubnative.lite.sdk.vpaid.models.vast.Creatives;
import net.pubnative.lite.sdk.vpaid.models.vast.InLine;
import net.pubnative.lite.sdk.vpaid.models.vast.MediaFile;
import net.pubnative.lite.sdk.vpaid.models.vast.StaticResource;
import net.pubnative.lite.sdk.vpaid.models.vast.VASTAdTagURI;
import net.pubnative.lite.sdk.vpaid.models.vast.VastAdSource;
import net.pubnative.lite.sdk.vpaid.models.vast.VideoClicks;
import net.pubnative.lite.sdk.vpaid.models.vast.Wrapper;
import net.pubnative.lite.sdk.vpaid.models.vpaid.CreativeParams;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONObject;

/* renamed from: Va.p5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1098p5 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14470R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f14471S;

    /* renamed from: T, reason: collision with root package name */
    public static int f14472T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14473U = 1;

    static {
        char[] cArr = new char[2355];
        R8.v.k("\u0000HW\u008a¯¤\u0007°_¨í\u0094ºBBpêm²zZ\u0002â\u0002\u0093QÄ\u0084<\u0087\u0094¯Ì\u008c$Ú\u009cÂôÀ,Ñ\u0084îü\u0014T\u0014\u008c\u0007ä6\\<\u0000IW\u009e¯\u0096\u0007«_©·Ì\u000fÁgÌ¿÷\u0017åo3Ç\u0010\u001f\nw6Ï-'X\u007fB\u0088'ßã'â\u008fÙ×Ü?¹\u0087³ï\u009d7\u008c\u009f\u0090çjOc\u0097tÿP\u0000AW\u0097¯µ\u0007¶_¹·Í\u000fÑgÀ¿Û\u0017äo\u0010Ç\u0017\u001f\rw0\u0000HW\u008a¯¤\u0007°_¨·þ\u000fÖgö¿÷\u0017þo\fÇ\u0012\u001f\u0001\u0000VW\u0092¯\u0095\u0007\u00ad_\u0098·Þ\u000fÕgä¿ü\u0017Øo\u0011Ç\u0004\u001f\u0016w4Ï/\u00178@ÿ¸ü\u0010ÔHÜ ©\u0018¥O\u0093\u0018CàYHf\u0010xø\u001c@3(\u0006ð,X) Ê\u0088ÎPÁ8ã\u0080éhª0\u0080\u0098\u0091`³È·\u0091_yGG\u000e\u0010ÂèÄ@ó\u0018ëð½H\u0095 ¶ø©P\u00ad(N\u0080WXI0`\u0088l`\f³näª\u001c\u00ad´\u0095ìµ\u0004ã¼ÚÔï\fÅ¤ÀÜ#t'¬(Ä\n|\u0000\u0000BW\u0081¯\u0089\u0007®_¿·Ú\u000fÀgè¿ù\u0017åo\u001fÇ\u0016\u001f\u0001w%³±äs\u001c]´IìQ\u0004\u000f¼%Ô(\f\u0004¤\u0000Üôtü¬ôÄÚ|Ú\u0094¥Ì¥d\u009b\u009c\u008bÓM\u0084\u008f|¡Ôµ\u008c\u00addóÜÙ´ÔløÄü¼\b\u0014\u0000Ì\b¤&\u001c&ôY¬Y\u0004düaTc\r\u0098å\u008e]\u00845±í¾EÊ=ù\u0095ÁMò%ç\u009d\u0016u\u001e-\u0000\u0085$\u0099\fÎÎ6à\u009eôÆì.²\u0096\u0098þ\u0095&¹\u008e½öI^A\u0086IîgVg¾\u0018æ\u0018N%¶ \u001e\"GÙ¯Ï\u0017Å\u007fð§ÿ\u000f\u008bw¹ß\u0080\u0007¾o§×[?[¤\u0095óx\u000bj£rû}\u0013\u001f«\u0005Ã\u0013\u001b)³'ËÏcÝ»ÀÓþkÎ\u0083\u009cPU\u0007\u0081ÿ\u008eW \u000f¢çÐ_Ú7ÐïðGþ?\u0003\u0097\u0001O('9\u009f3wR/I\u0087Q\u007f~×p\u008e\u0092f·Þ\u009b¶ªn»ÆÕ¾Ó\u0016ÉÎç¦é\u0000IW\u009d¯\u0092\u0007¼_¾·Ì\u000fÆgÌ¿ì\u0017âo\u001fÇ\u001d\u001f4w%Ï/'N\u007fU×M/b\u0087lÞ\u008e6©\u008e\u0083æ¶>¼\u0096ÔîÜFØ\u0000MW\u0081¯\u0087\u0007°_¨·ö\u000fÜgÑ¿ý\u0017ùo\rÇ\u0005\u001f\rw#Ï#'\\\u007f\\×s/d\u0087lÞ\u008f6\u008a\u008e\u008cæ¡>\u00ad\u0096É\u0000VW\u0092¯\u0095\u0007\u00ad_\u0085·Ñ\u000fÆgÀ¿ê\u0017øo\nÇ\u0018\u001f\u0010w>Ï+'Q\u007f`×Q/s\u0087zÞ\u00996\u0081\u008e\u0096æ°>ºz\u0089-qÕu}\u0010%[Í-u7\u001d,Å\u001em\u0018\u0015ð½àeæ\r\u009eµÁ]³\u0005£\u00ad¡Ußý\u009d¤\u007fLcô+\u009c[DAì(\u0094,<4ä\u0000\u008c\u00144ôÜþ\u0084î,ÕÔÍ|ð$ªÌ\u009bt\u0081\u001c\u008bÇioe\u0017M¿Og\r\u000f\u0018·4_8\u0007\u001e¯\u0000WØÿà§ÏOÍ÷×\u009f¡G»ï\u0095\u0097\u009d?\u008fær\u008el6|ÞI\u0086S.=Ö7~\u0017&\u001fÎá`u7·Ï\u0099g\u008d?\u0095×Ëoá\u0007ìßÀwÄ\u000f0§8\u007f0\u0017\u001e¯\u001eGa\u001fa·_OHç@¾¨V¤î¶\u0086\u009c^\u008c\u0000nW\u0096¯\u0092\u0007÷_¼·Ê\u000fÐgË¿ù\u0017ÿo\u0017Ç\u0007\u001f\u0001wyÏ&'T\u007fD×F/8\u0087zÞ\u00986\u0084\u008eÌæ¼>¦\u0096ÏîËFÓ\u009eçöóN\u0013¦\u0019þ\tV2®*\u0006\u0017^M¶|\u000effl½\u008e\u0015\u0082mªÅ¨\u001dêuúÍØ%ü}ùÕç-?\u0085\u0007Ý(5*\u008d0åF=\\\u0095rízEh\u009c\u0095ô\u008bL\u009b¤®ü´TÚ¬Ð\u0004ð\\ø´\u0006\u0000MW\u0081¯\u0087\u0007°_¨·ö\u000fÜgÑ¿ý\u0017ùo\rÇ\u0005\u001f\rw#Ï#'\\\u007f\\×b/u\u0087}Þ\u00956\u0099\u008e\u008bæ¡>±\u0000nW\u0096¯\u0092\u0007÷_¼·Ê\u000fÐgË¿ù\u0017ÿo\u0017Ç\u0007\u001f\u0001wyÏ&'T\u007fD×F/8\u0087zÞ\u00986\u0084\u008eÌæ¼>¦\u0096ÏîËFÓ\u009eçöóN\u0013¦\u0019þ\tV2®*\u0006\u0017^M¶|\u000effl½\u008e\u0015\u0082mªÅ¨\u001dêuáÍË%î}äÕÊ-\u0018\u0085\u001dÝ95=\u008d1åA=A\u0095oígE`\u009c\u0098ô¦L¹¤¹ü©TÅ¬Ï\u0004í\\õ\u0095&Ââ:å\u0092ÝÊõ\"¡\u009a¶ò°*\u009a\u0082\u0088úzRh\u008a`âNZ[²!ê\u0001B0º\u0012\u0012\u0010Kú£ö\u001bæsÜ\u001aÈM\u001e\u008e/Ùù!Ì\u0089ÖÑÖ9°\u0000AW\u0097¯£\u0007¡_¸]ñ\n'ò\u0004Z\f\u0002\u000fê\u007fRm:{â[J^\u00018Vî®é\u0006Å^Ç¶²\u000e¢f¯¾\u0088\u0016\u009cn`ÆA\u001esvHÎ\\\u009aáÍ%58\u009d\u0005Å\u000b-i\u0095Býy%E\u008d^õ¤]¥\u0085\u0096í\u0094U\u0089½ÇåíMöµÊ\u0000VW²¯µ\u0007\u008d_¸·Þ\u000fÕ\u008d6ÚÚ\"Ü\u008aëÒó:\u0092\u0082 ê»2\u0094øÍ¯!W'ÿ\u0010§\bOv÷\\\u009fQG}ïy\u0097\u008d?\u0085ç\u008d\u008f£7£ßÜ\u0087Ü1}f\u0091\u009e\u00976 n¸\u0086Í>ãVû\u008eÆ&Þ^<\u001e¨I~±_\u0019BA@©%\u0011>y\"¡\u0005\t\u0007qåÙÜ\u0001èiÝÑÌ9¦a¸É¾1\u0090\u0099\u0092\u0000PW\u0081¯\u0083\u0007ª_©·Ñ\u000fÆgÀ¿ê\u0017Ío\u001fÇ\u0012\u001f\u0010w8Ï8'D\u0000HW\u008a¯¤\u0007°_¨·í\u000f×gÒ¿ù\u0017ùo\u001aÇ\u0014\u001f\u0000w\u0016Ï.\u0000HW\u008a¯¤\u0007°_¨·í\u000f×gÒ¿ù\u0017ùo\u001aÇ\u0014\u001f\u0000w\u0015Ï8'R\u007fQ×G/u\u0087hÞ\u008f6\u009b\u008e°æ°>«\u0096ÞîÇF×\u009eñöõ\u0000HW\u008a¯¤\u0007°_¨·í\u000f×gÒ¿ù\u0017ùo\u001aÇ\u0014\u001f\u0000w\u0015Ï8'R\u007fQ×G/u\u0087hÞ\u008f6\u009b\u008e±æ°>¦\u0096ßîËFÓ\u0081øÖ<.;\u0086\u0012Þ\u00146q\u008e}æk>b\u0096Sî±F¨\u009e«ö\u0093N\u0094¦òþèVÍ®Ù\u0006À_9·7\u000f)g\u000b¿\r\u0017càß·\u001bO\u001cç5¿3WVïZ\u0087L_E÷t\u008f\u0096'\u008fÿ\u008c\u0097´/³ÇÕ\u009fÏ7èÏúgç>\u0005Ö\rn\u001d\u0006!\u0000VW\u0092¯\u0095\u0007\u00ad_\u009e·Ú\u000fÅgÄ¿ê\u0017ïo\u001bÇ\u0015\u001f4w%Ï/'N\u007fU×M/b\u0087lÞ\u008e\u0000nW\u0096¯\u0092\u0007÷_¼·Ê\u000fÐgË¿ù\u0017ÿo\u0017Ç\u0007\u001f\u0001wyÏ&'T\u007fD×F/8\u0087zÞ\u00986\u0084\u008eÌæ§>\u00ad\u0096ÌîÏFÓ\u009eðöâN\u001e¦Cþ\u0001V0®2\u0006P^Z¶v\u000eff|½Ö\u0015£m§Å\u0093\u001d\u00aduÓÍø%ø}çÕâ-\u0004\u0085\rÝ95+\u008d\u0003åV=\\\u0095ríxEh\u009c\u0080ô\u009e\u0014ÕC\u0017»9\u0013-K5£p\u001bJsO«d\u0003d{\u0087Ó\u0089\u000b\u009dc\u008bÛ´3ÔkÄÃÈ;â\u0093àÊ\u00185çb\u001f\u009a\u001b2~j5\u0082C:YRB\u008ap\"vZ\u009eò\u008e*\u0088Bðú¯\u0012ÝJÍâÏ\u001a±²óë\u0011\u0003\r»EÓ.\u000b$£EÛFsZ«yÃk{\u0097\u0093ÊË\u0088c¹\u009b»3ÙkÓ\u0083ÿ;ïSõ\u0088_ 4X6ð+(9@løF\u0010cHxàx\u0018\u009b°\u0085è±\u0000\u0087¸¨ÐÈ\bÈ äØîpü©\u0004\u0000VW\u0092¯\u0095\u0007\u00ad_\u009e·Ú\u000fÅgÄ¿ê\u0017ïo\u001bÇ\u0015\u001f%w4Ï>'T\u007fF×J/b\u0087p\u0011\u001eFó¾é\u0016óNÔ¦\u0098\u001e\u0099v\u009c\u0000HW\u008a¯¤\u0007°_¨·þ\u000fÖgó¿ñ\u0017îo\tPO\u0007\u008dÿ£W·\u000f¯çú_Ô7ÌïñGé?\u000b\u00977O\u0007'\u0006\u009f$w_/@tH#\u008aÛ¤s°+¨Ãó{×\u0013ÄËücî\u001b\f³\u0013k\u000b\u00036»8SY\u000bq£G[@ó`ª\u0099B\u0098¢üõ>\r\u0010¥\u0004ý\u001c\u0015F\u00adTÅt\u001dOµKÍ\u008be¡½\u0086Õ\u008am\u009b\u0085þÜ\u0004\u008bésóÛÝ\u0083Ñk¨Ó\u0089»\u009fc¸Ëº³D\u001bQÃy«m\u0013xû\u0006£2\u000b\u001eó'[*\u0018aO\u008c·\u0095\u001f\u0089G\u0093¯à\u0017æ\u007fæ§è\u000fÞw\u0019ß)\u00070o\u0011J÷\u001d\u001aå\fM,\u0015\u000eý{Ea-Cõ[]z%°\u008d³U´E-\u0012ÀêÌBÁ\u001aÓò\u0094J¦\"½ú\u0092\u0000VW\u009a¯\u0082\u0007¼_£·þ\u000fÖ·Áà\r\u0018\u0015°+è4\u0000i¸AÐ~\bf oØ\u009dp\u0083¨\u009dÀ¥x¯ñ^¦\u0092^\u008aö´®«FöþÞ\u0096ûNùææ\u009e\u0001\u0000VW\u0092¯\u0095\u0007\u00ad_\u009c·Í\u000fÝgÆ¿ý\u0017øo\rÇ\u001e\u001f\u0016Ý\u009a\u008aUrMÚj\u0082cj\u0007Ò1º\u0001b4Ê.\u0000HW\u008a¯¤\u0007°_¨·ö\u000fÜgÑ¿ý\u0017ùo\rÇ\u0005\u001f\rw#Ï#'\\\u007f\\×b/r\u0087EÞ\u00956\u009c\u008e\u0096æ°>¦\u0096ÞîÜ\u0000HW\u008a¯¤\u0007°_¨·í\u000f×gÒ¿ù\u0017ùo\u001aÇ\u0014\u001f\u0000w\u0016Ï.'q\u007fY×P/b\u0087lÞ\u00926\u008a\u008e\u0090\u0000HW\u008a¯¤\u0007°_¨·þ\u000fÖgó¿ñ\u0017îo\tÇ=\u001f\rw$Ï>'X\u007f^×F/d\u0000TW±¯°\u0007°_¨·Ú\u000fÝgä¿ü\u0017Ço\u0017Ç\u0002\u001f\u0010w2Ï$'X\u007fB\u0000AW\u0097¯¶\u0007¸_¾·Þ\u000fßgÖo<8ðÀéhÄ0åØº`¶\b»Ð\u0080x\u008e\u0000x¨wpk\u0018O vH6\u0010)¸=\u0000VW\u009a¯\u0082\u0007¼_£·þ\u000fÖgæ¿÷\u0017åo\nÇ\u0003\u001f\u000bw;Ï&'X\u007fB\u0000VW\u009a¯\u0082\u0007¼_£·ü\u000fÞgÌ¿û\u0017ào\r\u0000\u0013WÏ¯ß\u0007ê_÷·»\u000f\u008ag\u0087¿§\u0017®oIÇI\u0000CW\u009f¯\u008f\u0007º_§·ë\u000fÀgÄ¿û\u0017ào\u0017Ç\u001f\u001f\u0003jI=\u0096Å\u0081m£5§ÝÛeÑ\rÀÕü\u0000CW\u009c¯\u008b\u0007©_\u00ad·Ñ\u000fÛgÊ¿ö\u0017Êo\u001aÇ\u0002Û·\u008cht\u007fÜ]\u0084Yl%Ô/¼>d\u0002Ì<´æ\u001cìÄó¬È\u0014êü¡¤¶\f¸ô\u0097\\\u009a\u0005` {÷¤\u000f³§\u0091ÿ\u0095\u0017é¯ãÇò\u001fÎ·ðÏ*g ¿?×\u0004o&\u0087wßiwx\u008fE'X~ª\u0096°~F)\u0084Ñ\u0086y½!½ÉÓqÁ\u0019Å¥Gò\u0085\n\u0087¢¼ú¼\u0012ÒªÀÂÄ\u001aï\u0000IW\u009d¯ª\u0007°_¢·Úù\u0006®ÂVÅþý¦ÝN\u008bö±\u009e\u009aF½î©\u0096M>DÚ¹\u008dbuvÝD\u0085Ym\rÕ/½=e\tð\u00ad§v_b÷P¯MG\u0019ÿ;\u0097)O\u001dç\u0018°;çï\u001fï·ÅïÍ\u0007´¿\u0088×¨\u000f\u0083§\u008cßcwk¯oÇZ\u0000VW\u0092¯\u0095\u0007\u00ada;6íÎëfÅ>ÐÖ¶n¬´åã\u0001\u001b\u0006³>ë>\u0003h»UÓw\u000bL£mÛ\u009fs\u008b\u0000CW\u0081¯\u0083\u0007¸_¸·Ö\u000fÄgÀ¿È\u0017êo\fÇ\u0010\u001f\tw$\u0000gW\u0096¯\u0092\u0007\u0098_¼·Ï\u000fægÊ¿ó\u0017îo\u0010\u0097ÊÀ#8\u0017\u0090\u001fÈ\u0018 }\u0098cðb(^\u0080Lø\u008bP»\u0088£à\u0091X\u0086°ßè÷\u0000sW\u0096¯\u0092\u0007\u008f_¥·Û\u000f×gÊ¿Ù\u0017ïo2Ç\u0018\u001f\u0017w#Ï/'S\u007fU×Q\u0000gW\u0096¯\u0092\u0007\u0098_¨·õ\u000fÁgÊ¿ös\u001c$íÜétã,ÓÄ\u0087|»\u0014»Ì\u0082d\u0084\u001cl´|lz\u0004e¼U\u0000gW\u0096¯\u0092\u0007\u0098_¨·é\u000fÓgÖ¿ì\u0085\u0005Òô*ð\u0082úÚÊ2\u0087\u008a¿â©:\u009f\u0092 êx\u007f5(ÄÐÀxÊ úÈ p\u0085\u0018\u0083À«nq9\u0080Á\u0084i\u008e1¾Ùèa×\tÀÑëyéÎ¼\u0099MaIÉC\u0091sy&Á\f©\u001fq Ù?¡Ë\tÙ\u0000gW\u0096¯\u0092\u0007\u0098_¨·þ\u000fÁgÖ¿ý\u0017ÿo+Ç\u0003\u001f\b|/+ÞÓÚ{Ð#àË³s\u009b\u001b\u0099Ã±k\u008b\u0013B»Tc@\u0000gW\u0096¯\u0092\u0007\u0098_¨·û\u000fÓgÑ¿ù\u0017Áo\rtÉ#8Û<s6+\u0006ÃU{}\u0013\u007fËWcp\u001b¢³³\u0000gW\u0096¯\u0092\u0007\u0098_¨·û\u000fÓgÑ¿ù\u0017Øo\nÇ\u0003\u001f\rw9Ï-'{\u007fY×F/z\u0087m\u0000cW\u0081¯\u0083\u0007¸_¸·Ú\u000fægç¿Î\u0017âo\u001aÇ\u0014\u001f\u000bw\u0016Ï.'q\u007fY×P/b\u0087lÞ\u00926\u008a\u008e\u0090\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\rÇ\"\u001f\u0010w%Ï#'S\u007fW\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\rÇ8\u001f\u0000\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\rÇ'\u001f\rw3Ï/'R\u007fb×F/r\u0087`Þ\u008e6\u008a\u008e\u0081æ¡>\u009d\u0096ÉîÂ\u001f¯H^°Z\u0018P@`¨'\u0010\u001bx\u001f 1\b.pÅØü\u0000ÂhûÐÁ8\u0094`\u008aÈ\u008f0\u008c\u0098¤ÁP)N\u0091Xùx!c\u0089\u0007ñ3Y\u001b\u00810¹Mî¼\u0016¸¾²æ\u0082\u000eÅ¶ùÞý\u0006Ó®ÌÖ'~\r¦'Î\u0019v\u0005\u009exÆYne\u0096U>@g½\u008f¶´\u0014ãå\u001bá³ëëÛ\u0003\u009c» Ó¤\u000b\u008a£\u0095Û~sG«yÃ@{z\u0093/Ë1c4\u009b&3\u0016jæ\u0082ÿ:úRÕ\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\rÇ'\u001f\rw3Ï/'R\u007fv×J/z\u0087lÞ©6\u009d\u008e\u008eæ¦>\u0084\u0096ÒîÝFÕ\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\rÇ4\u001f\nw3Ï\t'\\\u007fB×G/C\u0087{Þ\u00906£\u008e\u008bæ¦>¼\u0000gW\u0096¯\u0092\u0007\u0098_¨·ï\u000fÓg×¿ù\u0017æo\r\u0000gW\u0096¯\u0092\u0007\u008f_¥·Û\u000f×gÊ¿Û\u0017ço\u0017Ç\u0012\u001f\u000fw$Ï\t'Q\u007fY×@/}\u0087]Þ\u00946\u009d\u008e\u008dæ >¯\u0096Ó\u0000gW\u0096¯\u0092\u0007\u008f_¥·Û\u000f×gÊ¿Û\u0017ço\u0017Ç\u0012\u001f\u000fw$Ï\t'Q\u007fY×@/}\u0087]Þ\u008e6\u008e\u008e\u0081æ¾>¡\u0096ÕîÉFí\u009eýöôN\u000erÒ%#Ý'u/-\u0016Åg}w\u0015qÍCeW\u001d¤µªm\u0092\u0005\u008e½\u0096Uë\rî¥Â]ËõÎ¬&D/ü0\u0094\b\u0000gW\u0096¯\u0092\u0007\u009a_¾·Ú\u000fÓgÑ¿ñ\u0017ýo\u001bÇ2\u001f\u000bw:Ï:'\\\u007f^×J/y\u0087gÞ½6\u008b\u008e\u0091:Um¤\u0095 =¢e\u0090\u008dá5é]ù\u0085Ï-úU>ý&%7M\u0011õ\u0011\u001dyEgíb\u0000gW\u0096¯\u0092\u0007\u008f_\u00ad·Ì\u000fÆgä¿ü\u0017Øo\u0011Ç\u0004\u001f\u0016w4Ï/'~\u007fB×F/w\u0087}Þ\u00956\u0099\u008e\u0087æ¦\u0000gW\u0096¯\u0092\u0007\u0094_©·Û\u000fÛgÄ¿Þ\u0017âo\u0012Ç\u0014\u001f0w2Ï2'I\u0000gW\u0096¯\u0092\u0007\u008a_¸·Þ\u000fÆgÌ¿û\u0017Ùo\u001bÇ\u0002\u001f\u000bw\"Ï8'^\u007fU×w/s\u0087qÞ\u0088\u0000gW\u0096¯\u0092\u0007\u008a_¸·Þ\u000fÆgÌ¿û\u0017Ùo\u001bÇ\u0002\u001f\u000bw\"Ï8'^\u007fU×`/d\u0087lÞ\u009d6\u009b\u008e\u008bæ£>\u00ad\u0096ïî×FÑ\u009eñ\u0000gW\u0096¯\u0092\u0007\u008e_¾·Þ\u000fÂgÕ¿ý\u0017ùo=Ç\u0003\u001f\u0001w6Ï>'T\u007fF×F/ecÓ4\"Ì&d:<\nÔjlv\u0004aÜItM\f\u009c¤\u0084|\u0083\u0014·¬¿Dí\u001cÐ´öLÅäè½\u001aU\u0012\u0095=ÂÌ:È\u0092ÀÊä\"\u0080\u009a\u0089ò\u008b*«\u0082§úAR{\u008a_â\u007fZq²\nê\u0019B:º>\u00126KÇ£Á\u001bÑsù«÷\u0003¥{\u0095Ó\u008f\u000b¯Ý\u000f\u008aþrúÚò\u0082Öj²Ò»º¹b\u0099Ê\u0095²s\u001aIÂmªM\u0012Cú8¢+\n\u000eò\u0010Z\u0017\u0003ýëõSå;ÓãÍK¶3¨\u009b½Cª+\u008e\u0093`{v", "ISO-8859-1", cArr, 0, 2355);
        f14470R = cArr;
        f14471S = 5176752328158566387L;
    }

    public static List C0(AdParams adParams) {
        int i5 = f14473U + 79;
        f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            adParams.getEndCardUrlList();
            throw null;
        }
        List endCardUrlList = adParams.getEndCardUrlList();
        int i10 = f14472T + 15;
        f14473U = i10 % 128;
        if (i10 % 2 != 0) {
            return endCardUrlList;
        }
        throw null;
    }

    public static String D0(AdParams adParams) {
        int i5 = f14472T + 3;
        f14473U = i5 % 128;
        int i10 = i5 % 2;
        String endCardRedirectUrl = adParams.getEndCardRedirectUrl();
        if (i10 == 0) {
            int i11 = 43 / 0;
        }
        f14473U = (f14472T + 107) % 128;
        return endCardRedirectUrl;
    }

    public static List E0(AdParams adParams) {
        f14472T = (f14473U + 89) % 128;
        List videoFileUrlsList = adParams.getVideoFileUrlsList();
        int i5 = f14473U + 123;
        f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return videoFileUrlsList;
        }
        throw null;
    }

    public static List F0(AdParams adParams) {
        int i5 = f14473U + 19;
        f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return adParams.getVideoClicks();
        }
        adParams.getVideoClicks();
        throw null;
    }

    public static String G0(AdParams adParams) {
        f14473U = (f14472T + 11) % 128;
        String videoRedirectUrl = adParams.getVideoRedirectUrl();
        f14472T = (f14473U + 11) % 128;
        return videoRedirectUrl;
    }

    public static List H0(AdParams adParams) {
        int i5 = f14473U + 33;
        f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return adParams.getEndCardClicks();
        }
        adParams.getEndCardClicks();
        throw null;
    }

    public static String I0(Ad ad2, String str) {
        f14472T = (f14473U + 83) % 128;
        String assetUrl = ad2.getAssetUrl(str);
        f14472T = (f14473U + 119) % 128;
        return assetUrl;
    }

    public static String J0(Ad ad2) {
        f14473U = (f14472T + 53) % 128;
        String creativeId = ad2.getCreativeId();
        f14472T = (f14473U + 47) % 128;
        return creativeId;
    }

    public static String K0(AdData adData) {
        f14473U = (f14472T + 23) % 128;
        String url = adData.getURL();
        f14472T = (f14473U + 41) % 128;
        return url;
    }

    public static String L0(Ad ad2) {
        f14473U = (f14472T + 101) % 128;
        String zoneId = ad2.getZoneId();
        f14472T = (f14473U + 99) % 128;
        return zoneId;
    }

    public static String M0(AdParams adParams) {
        int i5 = f14473U + 63;
        f14472T = i5 % 128;
        int i10 = i5 % 2;
        String id2 = adParams.getId();
        if (i10 != 0) {
            int i11 = 6 / 0;
        }
        int i12 = f14473U + 53;
        f14472T = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 18 / 0;
        }
        return id2;
    }

    public static AdData N0(Ad ad2, String str) {
        int i5 = f14472T + 63;
        f14473U = i5 % 128;
        int i10 = i5 % 2;
        AdData asset = ad2.getAsset(str);
        if (i10 == 0) {
            int i11 = 69 / 0;
        }
        f14472T = (f14473U + 17) % 128;
        return asset;
    }

    public static String O0() {
        f14473U = (f14472T + 107) % 128;
        String appToken = HyBid.getAppToken();
        int i5 = f14472T + 19;
        f14473U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 79 / 0;
        }
        return appToken;
    }

    public static String P0(AdParams adParams) {
        f14473U = (f14472T + 63) % 128;
        String adParams2 = adParams.getAdParams();
        f14473U = (f14472T + 7) % 128;
        return adParams2;
    }

    public static String Q0(Ad ad2) {
        int i5 = f14473U + 33;
        f14472T = i5 % 128;
        int i10 = i5 % 2;
        String vast = ad2.getVast();
        if (i10 != 0) {
            int i11 = 59 / 0;
        }
        f14473U = (f14472T + 95) % 128;
        return vast;
    }

    public static List R0(Ad ad2, String str) {
        int i5 = f14473U + 113;
        f14472T = i5 % 128;
        int i10 = i5 % 2;
        List beacons = ad2.getBeacons(str);
        if (i10 != 0) {
            int i11 = 4 / 0;
        }
        int i12 = f14473U + 9;
        f14472T = i12 % 128;
        if (i12 % 2 == 0) {
            return beacons;
        }
        throw null;
    }

    public static String S0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14470R[i5 + i11] ^ (i11 * f14471S)) ^ c10);
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

    public static String T0(MediaFile mediaFile) {
        int i5 = f14473U + 29;
        f14472T = i5 % 128;
        int i10 = i5 % 2;
        String text = mediaFile.getText();
        if (i10 != 0) {
            int i11 = 73 / 0;
        }
        f14472T = (f14473U + 1) % 128;
        return text;
    }

    public static String U0(StaticResource staticResource) {
        f14473U = (f14472T + 23) % 128;
        String creativeType = staticResource.getCreativeType();
        f14472T = (f14473U + 85) % 128;
        return creativeType;
    }

    public static AdData V0(Ad ad2, String str) {
        int i5 = f14472T + 7;
        f14473U = i5 % 128;
        if (i5 % 2 == 0) {
            ad2.getMeta(str);
            throw null;
        }
        AdData meta = ad2.getMeta(str);
        f14472T = (f14473U + 39) % 128;
        return meta;
    }

    public static ClickThrough W0(VideoClicks videoClicks) {
        f14472T = (f14473U + 85) % 128;
        ClickThrough clickThrough = videoClicks.getClickThrough();
        int i5 = f14472T + 67;
        f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return clickThrough;
        }
        throw null;
    }

    public static Creatives X0(VastAdSource vastAdSource) {
        int i5 = f14472T + 15;
        f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return vastAdSource.getCreatives();
        }
        vastAdSource.getCreatives();
        throw null;
    }

    public static VASTAdTagURI Y0(Wrapper wrapper) {
        f14472T = (f14473U + 33) % 128;
        VASTAdTagURI vastAdTagURI = wrapper.getVastAdTagURI();
        f14473U = (f14472T + 55) % 128;
        return vastAdTagURI;
    }

    public static String Z0(AdData adData) {
        int i5 = f14472T + 79;
        f14473U = i5 % 128;
        int i10 = i5 % 2;
        String js = adData.getJS();
        if (i10 == 0) {
            int i11 = 57 / 0;
        }
        f14473U = (f14472T + 61) % 128;
        return js;
    }

    public static String a1(CreativeParams creativeParams) {
        int i5 = f14473U + 35;
        f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return creativeParams.getEnvironmentVars();
        }
        creativeParams.getEnvironmentVars();
        throw null;
    }

    public static CompanionClickThrough b1(Companion companion) {
        int i5 = f14473U + 95;
        f14472T = i5 % 128;
        if (i5 % 2 == 0) {
            return companion.getCompanionClickThrough();
        }
        companion.getCompanionClickThrough();
        throw null;
    }

    public static AdParams c1(VideoAdController videoAdController) {
        f14472T = (f14473U + 101) % 128;
        AdParams adParams = videoAdController.getAdParams();
        int i5 = f14472T + 7;
        f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return adParams;
        }
        throw null;
    }

    public static boolean d1(VideoAd videoAd) {
        f14472T = (f14473U + 1) % 128;
        boolean zIsRewarded = videoAd.isRewarded();
        f14472T = (f14473U + 59) % 128;
        return zIsRewarded;
    }

    public static String e1(AdData adData) {
        int i5 = f14472T + 75;
        f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return adData.getHtml();
        }
        adData.getHtml();
        throw null;
    }

    public static String f1(CreativeParams creativeParams) {
        f14472T = (f14473U + 77) % 128;
        String creativeData = creativeParams.getCreativeData();
        int i5 = f14472T + 17;
        f14473U = i5 % 128;
        if (i5 % 2 != 0) {
            return creativeData;
        }
        throw null;
    }

    public static List g1(VideoClicks videoClicks) {
        f14472T = (f14473U + 51) % 128;
        List clickTrackingList = videoClicks.getClickTrackingList();
        int i5 = f14472T + 105;
        f14473U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 40 / 0;
        }
        return clickTrackingList;
    }

    public static CompanionAds h1(Creative creative) {
        f14473U = (f14472T + 97) % 128;
        CompanionAds companionAds = creative.getCompanionAds();
        f14473U = (f14472T + 57) % 128;
        return companionAds;
    }

    public static JSONObject i1(Ad ad2) {
        int i5 = f14472T + 121;
        f14473U = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                ad2.toJson();
                throw null;
            }
            JSONObject json = ad2.toJson();
            int i10 = f14473U + 19;
            f14472T = i10 % 128;
            if (i10 % 2 == 0) {
                return json;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void j1(VideoAd videoAd, VideoAdListener videoAdListener) {
        int i5 = f14473U + 119;
        f14472T = i5 % 128;
        int i10 = i5 % 2;
        videoAd.setAdListener(videoAdListener);
        if (i10 != 0) {
            int i11 = 71 / 0;
        }
        f14473U = (f14472T + 39) % 128;
    }

    public static String k1(AdData adData, String str) {
        int i5 = f14473U + 87;
        f14472T = i5 % 128;
        if (i5 % 2 != 0) {
            adData.getStringField(str);
            throw null;
        }
        String stringField = adData.getStringField(str);
        int i10 = f14472T + 115;
        f14473U = i10 % 128;
        if (i10 % 2 != 0) {
            return stringField;
        }
        throw null;
    }

    public static String l1(StaticResource staticResource) {
        f14473U = (f14472T + 117) % 128;
        String text = staticResource.getText();
        f14472T = (f14473U + 89) % 128;
        return text;
    }

    public static Creatives m1(InLine inLine) {
        f14472T = (f14473U + 5) % 128;
        Creatives creatives = inLine.getCreatives();
        f14472T = (f14473U + 15) % 128;
        return creatives;
    }

    public static Creatives n1(Wrapper wrapper) {
        int i5 = f14472T + 101;
        f14473U = i5 % 128;
        int i10 = i5 % 2;
        Creatives creatives = wrapper.getCreatives();
        if (i10 == 0) {
            int i11 = 76 / 0;
        }
        return creatives;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(S0(1632 - KeyEvent.normalizeMetaState(0), 10 - ImageFormat.getBitsPerPixel(0), (char) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new N3(5));
        map.put(S0(1643 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 17 - TextUtils.getTrimmedLength(""), (char) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 38819)).intern(), new G4());
        map.put(S0(Color.blue(0) + 1660, 18 - View.combineMeasuredStates(0, 0), (char) Drawable.resolveOpacity(0, 0)).intern(), new S4());
        map.put(S0(View.resolveSizeAndState(0, 0, 0) + 1678, View.MeasureSpec.getMode(0) + 9, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new C0929c5());
        map.put(S0(1688 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 15 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29563)).intern(), new C0903a5());
        map.put(S0(1703 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 9 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), new C0916b5());
        map.put(S0(1711 - (ViewConfiguration.getTouchSlop() >> 8), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (34146 - View.MeasureSpec.getMode(0))).intern(), new C0955e5());
        map.put(S0((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1722, 10 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (32594 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), new C0968f5());
        map.put(S0(ExpandableListView.getPackedPositionChild(0L) + 1732, AndroidCharacter.getMirror('0') - '&', (char) (View.MeasureSpec.getSize(0) + 28182)).intern(), new C0994h5());
        map.put(S0(1742 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.getOffsetBefore("", 0) + 52955)).intern(), new N4());
        map.put(S0(1753 - View.MeasureSpec.makeMeasureSpec(0, 0), 13 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new C1020j5());
        map.put(S0((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1766, 12 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ImageFormat.getBitsPerPixel(0) + 31817)).intern(), new C0981g5());
        map.put(S0(ImageFormat.getBitsPerPixel(0) + 1780, TextUtils.indexOf("", "", 0) + 11, (char) ExpandableListView.getPackedPositionType(0L)).intern(), new C1007i5());
        map.put(S0(TextUtils.getOffsetAfter("", 0) + 1790, Color.argb(0, 0, 0, 0) + 12, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 29870)).intern(), new C1033k5());
        map.put(S0(1802 - (ViewConfiguration.getEdgeSlop() >> 16), 19 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), new D4());
        String strIntern = S0(1822 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23 - Color.red(0), (char) (ViewConfiguration.getTouchSlop() >> 8)).intern();
        C1046l5 c1046l5 = new C1046l5();
        c1046l5.f14351a = this;
        map.put(strIntern, c1046l5);
        map.put(S0(MotionEvent.axisFromString("") + 1846, 17 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), new C1059m5());
        map.put(S0((ViewConfiguration.getScrollDefaultDelay() >> 16) + 1862, 13 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1)).intern(), new C1072n5());
        map.put(S0(1875 - ExpandableListView.getPackedPositionGroup(0L), 27 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), new I4());
        map.put(S0(1902 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 29, (char) (8135 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern(), new F4());
        map.put(S0(1931 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 22, (char) (47403 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new H4());
        map.put(S0(View.getDefaultSize(0, 0) + 1953, (Process.myTid() >> 22) + 24, (char) (46195 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).intern(), new E4());
        map.put(S0(1977 - TextUtils.indexOf("", "", 0), 28 - KeyEvent.getDeadChar(0, 0), (char) (Process.myTid() >> 22)).intern(), new L4());
        map.put(S0(Color.rgb(0, 0, 0) + 16779221, (ViewConfiguration.getLongPressTimeout() >> 16) + 25, (char) View.combineMeasuredStates(0, 0)).intern(), new O4());
        map.put(S0(2030 - (ViewConfiguration.getScrollBarSize() >> 8), 11 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), new J4());
        map.put(S0(2041 - (Process.myTid() >> 22), 25 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new K4());
        map.put(S0((ViewConfiguration.getWindowTouchSlop() >> 8) + 2067, 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Drawable.resolveOpacity(0, 0)).intern(), new M4());
        map.put(S0((ViewConfiguration.getTouchSlop() >> 8) + 2098, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (char) (TextUtils.lastIndexOf("", '0', 0) + 29366)).intern(), new R4());
        map.put(S0(2122 - View.getDefaultSize(0, 0), 23 - Drawable.resolveOpacity(0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), new Q4());
        map.put(S0(2145 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getMode(0) + 18, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 14899)).intern(), new P4());
        map.put(S0(2163 - TextUtils.getCapsMode("", 0, 0), 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), new T4());
        map.put(S0(TextUtils.indexOf((CharSequence) "", '0', 0) + 2188, (ViewConfiguration.getJumpTapTimeout() >> 16) + 16, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), new Y4());
        map.put(S0(View.combineMeasuredStates(0, 0) + 2203, 21 - Color.red(0), (char) (Process.myTid() >> 22)).intern(), new U4());
        map.put(S0(2223 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0) + 29, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), new W4());
        map.put(S0(2253 - Color.red(0), (ViewConfiguration.getScrollBarSize() >> 8) + 19, (char) TextUtils.getOffsetBefore("", 0)).intern(), new X4());
        map.put(S0(2272 - TextUtils.getOffsetAfter("", 0), Color.red(0) + 22, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 25524)).intern(), new V4());
        map.put(S0(2293 - TextUtils.indexOf((CharSequence) "", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 29, (char) (38234 - TextUtils.getTrimmedLength(""))).intern(), new C0942d5());
        map.put(S0(2323 - View.MeasureSpec.getSize(0), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 32, (char) (TextUtils.indexOf((CharSequence) "", '0') + 56681)).intern(), new Z4());
        f14473U = (f14472T + 79) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14473U = (f14472T + 85) % 128;
        String hyBidVersion = HyBid.getHyBidVersion();
        f14472T = (f14473U + 1) % 128;
        return hyBidVersion;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07b9 A[PHI: r4
  0x07b9: PHI (r4v17 char) = (r4v7 char), (r4v0 char) binds: [B:247:0x0a97, B:183:0x07b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038c A[PHI: r23
  0x038c: PHI (r23v2 char) = (r23v1 char), (r23v0 char) binds: [B:252:0x0acb, B:87:0x038a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 3908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1098p5.w0(java.lang.String):java.lang.Class");
    }
}
