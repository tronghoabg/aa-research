package Va;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Kb extends IronSourceAdQuality {

    /* renamed from: t, reason: collision with root package name */
    public static Kb f13486t = null;

    /* renamed from: u, reason: collision with root package name */
    public static final char[] f13487u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f13488v;

    /* renamed from: w, reason: collision with root package name */
    public static int f13489w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static int f13490x = 1;

    /* renamed from: b, reason: collision with root package name */
    public ISAdQualityConfig f13492b;

    /* renamed from: i, reason: collision with root package name */
    public Context f13499i;

    /* renamed from: j, reason: collision with root package name */
    public final A f13500j;
    public V k;

    /* renamed from: l, reason: collision with root package name */
    public ISAdQualityAdListener f13501l;

    /* renamed from: m, reason: collision with root package name */
    public C1218z f13502m;

    /* renamed from: n, reason: collision with root package name */
    public C1194x f13503n;

    /* renamed from: o, reason: collision with root package name */
    public Ra f13504o;

    /* renamed from: p, reason: collision with root package name */
    public Ha f13505p;

    /* renamed from: r, reason: collision with root package name */
    public C1218z f13507r;

    /* renamed from: s, reason: collision with root package name */
    public r f13508s;

    /* renamed from: a, reason: collision with root package name */
    public final H f13491a = new H(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f13493c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13494d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13495e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13496f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13497g = false;

    /* renamed from: h, reason: collision with root package name */
    public ISAdQualityLogLevel f13498h = ISAdQualityLogLevel.INFO;

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArraySet f13506q = new CopyOnWriteArraySet();

    static {
        char[] cArr = new char[1987];
        R8.v.k("3Åñê·§uw;\tøð¾Ó|\u0093\"Mà%¥çk\u0098)´ïv\u00adDRþ\u0010²Ö`\u0094BZ\n\u001fÉÝ¹\u0083kA5\u0007\u0011Ä\u0081\u008a\u008dHt\u000e.3ùñß·\u009fuX;yøç¾Á|\u009f\"\u0005à?¥êk·)\u0085ï\u001e\u00ad\tRõ\u0010ýÖe\u0094QZ\\\u001fÝÝ¯\u0083sA-\u0007UÄã\u008a\u008cH`\u000e(3øñÒ·\u0094uT;uøÆ¾¼|\u0089\"Jà:¥ûk¤)\u0086ïV\u00ad\u000bRÿ\u0000AÂQ\u0084;Fê\bµËe\u008dWO\u0007\u0011ÑÓ\u008e\u0096VX\f\u0000CÂT\u0084\u0004F¸\b Ë)\u008dWO\u001d\u0011ÁÓ©\u0096{X&\u001a\u0010ÜØ\u009e\u009ca~#på¨§\u009ai¡,Kîy°ïr§4Ø÷C¹\u0007{ã=»\u0000nÂD\u0084\u0000FÓ\bõËY\u008d{O?\u0011ÚÓþ\u0096cX:\u001a\u0018ÜÁ\u009e\u0082ar#%å¦§Òi\u009e,\u0005î.°çr¡4Ù÷O¹\u0013{è\u0000CÂT\u0084\u0004F¸\b Ë)\u008dWO\u001d\u0011ÁÓ©\u0096{X&\u001a\u0010ÜØ\u009e\u009ca~#på¨§\u009ai¦,wî\u0018°êr\u00924\u008d÷L¹\u000e{þ=¸\u0000xÂ\u0016\u00848Fä\b\u009eË*\u008dHO\u0015\u0011ÚÓþ\u0096`X \u001a\bÜÆ\u009e\u0083as#&åè§\u0095\u0000IÂf\u0084+Fû\b\u0085Ë|\u008d_O\u001f\u0011ÁÓ©\u0096kX\u0014\u001a8Üú\u009eÈar#>åì§Îi\u0086,Eî5°çr¹4\u009d÷\r¹\u0003{û=¾\u0000dÂW\u0084\u000fFÙ\bõËi\u008d^O\u0018\u0011ÅÓ»\u0096w\u0019çÛÈ\u009d\u0085_U\u0011+ÒÒ\u0094ñV±\boÊ\u0007\u008fÅAÉ\u0003\u0081Å[\u0087\u0003x\u0095:\u0097üE¾}p55ã÷\u0096©Lk\u0004-,îæ ìbT$\u0007\u0019ÛÛð\u009dª_j\u0011[ÒÇ\u0094ðV´\b'Ê\u0012\u008fØAÆ\u0003¶Åd\u0087,xÑ:\u008aü\\¾pp:5«÷\u009b©Ok\u0006-.î  ¢bX$\u0000\u0019É\u0087NEY\u0003\tÁµ\u008f\u00adL$\nZÈ\u0010\u0096ÌT¤\u0011vß+\u009d\u001d[Õ\u0019\u0091æs¤}bÁ äî£«Mi\u00057öõ¯³\u0099pI>\u001büãºá\u0087_E\u007f\u0003-Á\u008d\u008f¯Ln\nFÈ\u0011\u0096\u0084T½\u0011kß)\u009d\u001c[\u009f\u0019\u0085æc¤|bî Ûî\u008d«\\i.7¢õ¼³\u0087pF>\u001cüµº©\u0087kE\u0014Èö\náL±\u008e\rÀ\u0015\u0003\u009cEâ\u0087¨Ùt\u001b\u001c^Î\u0090\u0093Ò¥\u0014mV)©ËëÅ-\u001do/¡;äá&\u009cxpº\u0013ü4?¸q´³Cõ\u0017È\u0093\n÷Lþ\u008ewÀ\u0005\u0003\u009fEä\u0087´Ùp\u001b\u0007^\u0086\u0090\u0092Òº\u0014'V7©Äë\u0094-Gow¡k\u0000IÂf\u0084+Fû\b\u0085Ë|\u008d_O\u001f\u0011ÁÓ©\u0096kX\u0014\u001a8Üú\u009eÆal#1åö§\u009ai\u008e,Hî+°ër¢4\u009c÷T¹B{ä=¤\u0000tÂB\u0084\u000fFÏ\b¢Ëd\u008d\u0011Ç$\u0005\u000bCF\u0081\u0096Ïè\f\u0011J2\u0088rÖ¬\u0014ÄQ\u0006\u009fyÝU\u001b\u0097Y«¦\u0001ä\\\"\u009b`÷®ìë,)Bw\u0086µÜóµ0)~a¼\u0093úÕÇ\u0005\u0005:Cj\u0081¤ÏÂ\f\u0002J6\u00889Öé\u0014\u0093Q\u0010\u009fJÝ0\u001b±Yï¦\u0014äX\"Ë`¢®òëh)Dw\u008aµÜóà0'~a¼\u0082úÎÇA\u008c\u0094N»\böÊ&\u0084XG¡\u0001\u0082ÃÂ\u009d\u001c_t\u001a¶Ôº\u0096òP(\u0012píæ¯úi9+\u0014å\u0012 \u008abì<&þj¸A{\u009f5È÷$\u008aVH%\u000enÌ\u0086\u0082ÏA_\u0007\tÅa\u009b\u008fYÞ\u001c\u0005Ò]\u0090cV³\u0014éëM©Vo\u009f-\u00adãí¦4d@:\u008aøØ\u009dØ_û\u0019³ÛB\u0095\u001aVÐ\u0000sÂQ\u0084\u0001\u0000s\u0000tÂE\u00845Fë\b§\u0000sÂZ\u0084\u0005Fò\b¸Ëh\u0000 ÂB\u0084\u0003Fë\b¼Ë)\u008dLO\u0016\u0011ÉÓ®\u0096}X)\u001aFÜ\u0091\u0000EÂG\u0084\u0018Fð\b¦Ë)\u008dMO\u001b\u0011ÝÓ©\u0096fX.\u001a\u0012ÜÖ\u009eÆa\u007f#?åò§ÔðÚ2Øt\u0087¶oø9;¶}Ò¿\u0089áC#6fä¨¶ê\u0084,\u000en\f\u0091÷Óª\u0015hWl\u0099\u0014Ü\u009by¢»µýå?YqA²Èô¬6÷h=ª\u001cï\u009e!Ãcé¥1ç'\u0018\u009eZÐ\u009c\u0010Þ:\u0010.Uè\u0097\u0098É&\u000bqMX\u008e¨ÀÒ\u0002\u0003DLy\u008c»¾ýþ?8q\u0014²¸ô\u009a6ÞhhªHï\u0093!Úc¼¥ çn\u0018\u0088ZÄ\u009c\u0003Þ5\u0010fUª\u0097\u0095\u0000YÂZ\u0084\u001fF¿\b¹Ë|\u008dMO\u0007\u0011\u0088Ó´\u0096|X.\u001a\bÜØ\u009e\u0087aw#9åÿ§ßiÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0016\u0011ÌÓ¸\u0096|X:\u001a\u0018Ü\u0092\u009e\u0084a}#=åê§Òi\u009e,Bîz°¨r·4\u009c÷Z¹.{ý=¹\u0000cÂs\u0084\rFÕ\b·Ë,\u0017\\Õ\u007f\u00931Qý\u001f\u009eÜR\u009apX\u0018\u0006æÄ\u0086\u0081\\O@\rs\u0000 Â\u0019\u0084JF£\b¦Ël\u008dZO\u0012\u0011ËÓ©\u0096wX#\u001aBÜ\u0091\u009eÏa;#<åì§×i\u0086,Pî<°êrã4\u008c÷B¹B\u0000 ÂX\u0084\u000fFë\bµË)\u008dZO\u0012\u0011ÜÓ¼\u00962X1\u001a\u001dÜÝ\u009e\u0093a~##å«§\u009ai¦,Cî7°ár±4\u0091÷C¹\u0005{·=¡\u0000dÂB\u0084\nF\u0080\b±Ëk\u008dKO\u0015\u0011\u0089Ó¨\u0096rX$\u001a\bÜ×\u009eÉ\u0000 Â\u0019\u0084JF£\b¦Ël\u008dZO\u0012\u0011ËÓ©\u0096wX#\u001aBÜ\u0091\u009eÏa;#$åí§ßiÏ,Hî<°àr¤4\u008c÷E¹B{ø=ª\u0000!ÂT\u0084\u0004FÔ\b½Ë*\u008dKO\u001c\u0011ÌÓþ\u0096xX-\u001a\u0004Ü\u0092\u009e\u0086ar#5å¦§Ïi\u0098,@îz°ùr¥4\u0095÷[¹\u0006{¸=¾\u0000jÂX\u0084\u0019FÍ\b²Ë+\u008d\"O\u0010\u0011\u008aÓ½\u0096qX=\u001a\tÜÖ\u009e\u008das#r]¢\u009fÖÙ\u0086\u001byUv\u0000 ÂV\u0084\u0002Fþ\b¦Ëh\u008d]O\u0007\u0011ÍÓ¯\u0096aXi¦§d\u0086\"Üà>®Ym¨+\u0089éÒ·\tuf0¯þû¼ñz\u00178[Ç¢\u0085çC9\u0000EÂG\u0084\u0018Fð\b¦Ë)\u008dMO\u0016\u0011ÜÓ©\u0096{X)\u001a\u001bÜ\u0091\u009e\u008ba~#$åä§\u009ai\u008b,Eî-°ïrãá\u009f#\u0088eØ§dé|*õl\u0081®Çð\u00152ow©¹þû\u0080=\u0018\u007fI\u0080¢Âþ\u0004yF\u000f\u0088WÍØ\u000f¨Qr\u0093VÕw\u0016°XÚ\u009a\u001aÜeá¼#\u0086eÞ§\bép*öl°®ìð>2\"w¸¹õûÒ=N\u007fH\u0080¨Âø\u0004.F\u0003\u0088CÍ\u008e\u000fèQ}\u0000YÂZ\u0084\u001fF¿\b¹Ë|\u008dMO\u0007\u0011\u0088Ó´\u0096|X.\u001a\bÜØ\u009e\u0087aw#9åÿ§ßiÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0016\u0011ÌÓ¸\u0096|X:\u001a\u0018Ü\u0092\u009e\u0084a}#=åê§Òi\u009e,Bîz°¨r§4\u0091÷O¹\r{ÿ=¨\u0000WÂD\u0084\tFÓ\b\u009fËo\u008dg¾$|::wøÕ¶Ëu\u001031ñk¯âmÞ(\u001cæ\r¤ubº âßV\u009dN[Ï\u0019²×à\u0092nP]\u000e\u0091ÌÅ\u008aþIg\u0007gÅ\u008f\u0083\u0086¾\u000e|1:qø¾¶Æ\u0000EÂg\u00848FÐ\b\u0086Ë(\u008d\u001eO\u0006\u0011ÛÓ¸\u0096`Xg\u001a5Üõ\u009eÆar##å¥§Ôi\u009a,Hî5° rã4¨÷A¹\u0007{ö=¿\u0000dÂ\u0016\u0084\u0006FÁ\b¾Ëo\u008d\u001fO\u0007\u0011ÜÓ¬\u0096vXh\u001a\tÜÝ\u009eÇal#0åõ§ÈiÐ,Dîz°ùr¥4\u0095÷G¹\u0007{¸=£\u0000mÂY\u0084AFÏ\b£Ëg\u008d,OU\u0011ßÓ¬\u0096qX;\u001a^Üú\u009e¬a=#&åè§\u009ci¸,uî\u001a°ôr\u00944\u008f÷N¹\b{ð=º\u0000zÂ\u0018\u0084>Fæ\b\u009cË\"\u0085¯G\u0095\u0001ÝÃ%\u008drN®\b\u009eÊÚ\u0094KVj\u0013³Ýü\u009f\u009fY\b\u001bIä»¦ê\u0000EÂg\u00848FÐ\b\u0086Ë(\u008d\u001eO*\u0011ÇÓ¨\u00965X5\u001a\u0019Ü\u0091\u009e\u0093ah#9åë§ÝiÏ,Pî1°ërã4\u009c÷H¹\u0004{ö=¹\u0000mÂB\u0084KFÕ\b¦Ëo\u008dMOT\u0011àÓ\u009a\u00963P*\u0092\u0011Ô>\u0016÷Xµ\u009blÝI\u001f\u0012A\u008c\u0083´Æw\b(J\u001d\u008c\u0095Î\u00911js&µä÷\u009e9\u009f|O¾}àú\"¦d\u008f§ZéF+òmèPp\u0092\\Ô\u0006\u0016ÕX¤\u009bkÝ\u001b\u001f\u0005AÞ\u0083¿Æe\blJ0\u008còÎÃ1~s:µð÷\u009f9\u0091|@¾=àã\"àd\u0088§Yé\u0002+îméPr\u0092\\ÔH\u0016ìX\u0081\u009bNÝ \u001f AÛ\u0083ºÆ|\b$J\u000e\u008cÎÎÌ1Js\u0012µÈ÷\u0096X\u00ad\u009a®Üë\u001e\u0019P\u0000\u0093´Õ\u0099\u0017ÆI8\u008bxÎ\u0093\u0000ÒBä\u0084,Æf9\u0096{\u0084½\"ÿ\n1Ptð¶Øè\t*Rl~¯ùáß#'e\u0018X\u009c\u009a±Ü¥\u001et½O\u007f\u007f95ûîµ\u0093vI0yò)¬Ùn\u0091+På\u0006§0\u0000iÂ[\u0084\u001eF±\b§Ël\u008dMO\u0000\u0011áÓ¹¬ñnÂ(\u008eêy¤4gî!Úã\u0095½F\u007fv:üô´¶×pP2\u0001Í°\u008f´In\u000b^Å\u0006\u0080ØB¨\u001cbÞ%\u0098\u000e\u0000sÂZ\u0084\u0005Fò\b¸Ëh\u008d\u0013O\u0000\u0011ÍÓ¾\u0096`X\"\u001a\bÜ\u009c\u009eÒaz#>åä§Öi\u0096,Pî0°ír°ÿ?=({x¹Ä÷Ü4Ur1°jî ,\u0081i\u0007§Uåt#¨aè\u009e\tÜM\u001a\u0095Xæ\u0096çÓ=\u0011VO\u0086\u008d\u009fËé\b>Fz\u0084\u008eÂ\u0090ÿP=j{^¹\u008f÷è4\u0012r\u0012°}î´,Îi\u0006§@åx#îaÈ\u009e$Üf\u001aÚX°\u0096íÓ*\u0011\u0006O\u0080\u008dÐËð\b&F{\u0084\u008bÂÆÿ\u0010=e\u0000MÂ@\u0084\u0019Fë\bôËz\u008d[O\u0007\u0011\u0088Ó´\u0096|X3\u001a\u0019ÜÃ\u009e\u0088az#<å¥§Îi\u008a,Wî-°®r®4\u0097÷I¹\u0007{·=®\u0000dÂP\u0084\u0004FÒ\b°Ë*\u008dVO\u001a\u0011ÀÓª\u0096zX)\u001a\u0011ÜÛ\u009e\u009dau#?åá§\u009a\u0000aÂ[\u0084\u000eFí\b»Ë`\u008dZO]\u0011ÁÓ³\u0096fX\"\u001a\u0012ÜÅ\u009eÈaz#3åñ§Ói\u0080,Jîw°Ìr\u00824¬÷y¹'{Å=\u0095\u0000^Âu\u0084#Fá\b\u009bËM\u008dzO0\u0000FÂT\u0084\u0003Fó\b±Ëm\u008d\u001eO\u0007\u0011ÇÓý\u0096`X\"\u001a\u001bÜØ\u009e\u0095ao#5å÷§\u009ai\u008d,Eî-°úr¦4\u008a÷T¹B{å=©\u0000bÂS\u0084\u0002FÖ\b°ËxI`\u008bwÍ'\u000f\u009bA\u0083\u0082\nÄn\u00065Xÿ\u009aÞßP\u0011\u0000S\u007f\u0095þ×¬(Kj\u0007¬Ãî÷ ©eu§Zù\u0080;À}\u0092¾]ð\u00002Ðt¾IW\u008btÍ$\u000fêA\u0082\u0082PÄ<\u0006\u0004XÎ\u009a¶ß\u0010\u0011\u001cS?\u0095â×ä(Lj\u001a¬Ðîì ·ei§\u000eùÂ;É\u0003áÁö\u0087¦E\u001a\u000b\u0002È\u008b\u008eïL´\u0012dÐ\u001b\u0095\u0090[\u0086\u0019«ß`\u009d0bÖ \u009fæ\u0007¤uj(/âí\u0092³Mq\u001573ôàº®x\u0015>\u001c\u0003ÆÁâ\u0087¬El\u000b\u0002ÈÍ\u008e½Lû\u0012+Ð5\u0095â[«\u0019»ßA\u009d0bß \u009fæM¤mj+/§í«³iq-7{ôûº xI>O\u0003ÓÁý\u0087»Ew\u000b\u0010ÈÆ\u008e\u0095L¹\u0012&~M¼Zú\n8¶v®µ'óC1\u0018oÈ\u00ad·è<&*d\u0007¢Ìà\u009c\u001fz]3\u009b«ÙÙ\u0017\u0084RN\u0090>Îá\f¹J\u009f\u0089LÇ\u0002\u0005¹C°~j¼Nú\u00008Àv®µaó\u00111Wo\u0087\u00ad\u0099èN&\u0007d\u0017¢íà\u009c\u001fs]3\u009báÙÁ\u0017\u0087R\u000b\u0090\u0007ÎÅ\f\u0081J×\u0089IÇ\u001e\u0005¶C\u00ad~c¼MúB8Æv¶µló:1\u0012oÅ\u00ad½ès&=d\u0015¢ÙàÈ\u0000CÂT\u0084\u0004F¸\b Ë)\u008dMO\u0016\u0011ÜÓý\u0096aX\"\u001a\u001bÜÜ\u009e\u0083au#$å¥§\u0097iÏ,mî\n°Ïr§4©÷X¹\u0003{û=¥\u0000uÂO\u0084KFó\b\u0091ËA\u008d\u001fO\u0003\u0011ÈÓ\u00ad\u00963X;\u001a\u0015ÜÇ\u009e\u0093ax#>åñ§ÕiÞ\u0000CÂT\u0084\u0004F¸\b Ë)\u008dMO\u0016\u0011ÜÓý\u0096qX(\u001a\u0012Ü×\u009e\u008fa|#på¨§\u009ai¦,wî\u0018°êr\u00924\u008d÷L¹\u000e{þ=¸\u0000xÂ\u0016\u00848Fä\b\u009eË*\u008dHO\u0015\u0011ÚÓþ\u0096`X \u001a\bÜÆ\u009e\u0083as#&åè§\u0095\u0014ãÖô\u0090¤R\u0018\u001c\u0000ß\u0089\u0099í[¶\u0005|Ç]\u0082ÑL\u0088\u000e²Èw\u008a/uÜ7Ðñ\b³:}\u00068×ú¸¤Jf2 -ãì\u00ad®o^)\u0018\u0014ØÖ¶\u0090\u0098RD\u001c>ß\u008a\u0099ö[§\u0005)Ç\u001f\u0082ßL\u009a\u000e¸Ès\u008a#uÅ7ÑñO³u}98ñú\u0093¤Nf\b 0ãô\u00ad¦o\\)C\u0000iÂR\u0084\u0004Fð\b¦Ël\u008daO\u0003\u0011ÚÓ¸\u0096MX.\u001a\u0012ÜØ\u009e\u0092aD#3åê§Ôi\u0089,Mî>", "ISO-8859-1", cArr, 0, 1987);
        f13487u = cArr;
        f13488v = 3119417411248898613L;
        f13486t = null;
        f13489w = (f13490x + 87) % 128;
    }

    public Kb() {
        A a5 = new A();
        a5.f13175a = A.a((-1632032488) - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') - 18, (byte) ((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 78), (short) ((-1) - MotionEvent.axisFromString("")), 301491218 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern();
        a5.f13176b = A.a(TextUtils.getOffsetAfter("", 0) - 1632032488, (-19) - Color.green(0), (byte) ((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 14), (short) TextUtils.indexOf("", "", 0), Process.getGidForName("") + 301491253).intern();
        a5.f13177c = A.a((-1632032488) - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-19) - View.getDefaultSize(0, 0), (byte) (103 - Color.red(0)), (short) View.resolveSize(0, 0), 301491285 - ImageFormat.getBitsPerPixel(0)).intern();
        A.a((ViewConfiguration.getFadingEdgeLength() >> 16) - 1632032476, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 40, (byte) (75 - (ViewConfiguration.getScrollBarSize() >> 8)), (short) View.MeasureSpec.getSize(0), 301491320 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern();
        this.f13500j = a5;
    }

    public static /* synthetic */ r a(Kb kb2) {
        int i5 = (f13490x + 33) % 128;
        f13489w = i5;
        r rVar = kb2.f13508s;
        f13490x = (i5 + 35) % 128;
        return rVar;
    }

    public static /* synthetic */ Ra b(Kb kb2) {
        int i5 = f13490x;
        f13489w = (i5 + 7) % 128;
        Ra ra2 = kb2.f13504o;
        int i10 = i5 + 13;
        f13489w = i10 % 128;
        if (i10 % 2 == 0) {
            return ra2;
        }
        throw null;
    }

    public static void d(Kb kb2) {
        int i5;
        f13489w = (f13490x + 1) % 128;
        synchronized (kb2) {
            i5 = (f13489w + 79) % 128;
            f13490x = i5;
            kb2.f13494d = false;
        }
        int i10 = i5 + 63;
        f13489w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ ISAdQualityAdListener e(Kb kb2) {
        int i5 = f13490x + 67;
        f13489w = i5 % 128;
        int i10 = i5 % 2;
        ISAdQualityAdListener iSAdQualityAdListener = kb2.f13501l;
        if (i10 == 0) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    public static /* synthetic */ Context f(Kb kb2) {
        int i5 = (f13490x + 49) % 128;
        f13489w = i5;
        Context context = kb2.f13499i;
        f13490x = (i5 + 63) % 128;
        return context;
    }

    public static /* synthetic */ C1194x i(Kb kb2) {
        int i5 = f13490x;
        f13489w = (i5 + 53) % 128;
        C1194x c1194x = kb2.f13503n;
        f13489w = (i5 + 87) % 128;
        return c1194x;
    }

    public static /* synthetic */ V j(Kb kb2) {
        int i5 = f13490x;
        f13489w = (i5 + 13) % 128;
        V v2 = kb2.k;
        f13489w = (i5 + 65) % 128;
        return v2;
    }

    public static /* synthetic */ H k(Kb kb2) {
        int i5 = f13490x + 105;
        f13489w = i5 % 128;
        if (i5 % 2 != 0) {
            kb2.h();
            throw null;
        }
        H h10 = kb2.h();
        int i10 = f13490x + 67;
        f13489w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
        return h10;
    }

    public static void n(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i5 = f13489w + 123;
        int i10 = i5 % 128;
        f13490x = i10;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (set == null) {
            int i11 = i10 + 73;
            f13489w = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            return;
        }
        Da da2 = new Da(23);
        da2.f13289d = set;
        da2.f13290e = iSAdQualityInitError;
        da2.f13291f = str;
        Cb.g(da2);
    }

    public static /* synthetic */ C1218z o(Kb kb2) {
        int i5 = f13490x + 13;
        int i10 = i5 % 128;
        f13489w = i10;
        int i11 = i5 % 2;
        C1218z c1218z = kb2.f13502m;
        if (i11 != 0) {
            throw null;
        }
        int i12 = i10 + 117;
        f13490x = i12 % 128;
        if (i12 % 2 != 0) {
            return c1218z;
        }
        throw null;
    }

    public static String p(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i5];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i5) {
                        cArr[i11] = (char) ((f13487u[i10 + i11] ^ (i11 * f13488v)) ^ c10);
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

    public static void q(Kb kb2, Context context) {
        f13489w = (f13490x + 91) % 128;
        kb2.getClass();
        try {
            context.registerReceiver(new G6.Q(2), new IntentFilter(p(TextUtils.lastIndexOf("", '0', 0, 0) + 38, 1545 - Color.blue(0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()), null, Cb.d());
            int i5 = f13490x + 87;
            f13489w = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Ab.B(p((ViewConfiguration.getPressedStateDuration() >> 16) + 12, Color.green(0) + 74, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), p(35 - Color.blue(0), Process.getGidForName("") + 1583, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th);
        }
        int i10 = f13489w + 67;
        f13490x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static Kb u() {
        synchronized (Kb.class) {
            try {
                if (f13486t == null) {
                    f13486t = new Kb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f13486t;
    }

    public static /* synthetic */ A w(Kb kb2) {
        int i5 = (f13489w + 95) % 128;
        f13490x = i5;
        A a5 = kb2.f13500j;
        int i10 = i5 + 111;
        f13489w = i10 % 128;
        if (i10 % 2 == 0) {
            return a5;
        }
        throw null;
    }

    public static /* synthetic */ void x(Kb kb2, ISAdQualityInitError iSAdQualityInitError, String str) {
        f13489w = (f13490x + 27) % 128;
        kb2.G(iSAdQualityInitError, str);
        int i5 = f13489w + 3;
        f13490x = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 33 / 0;
        }
    }

    public final synchronized void A(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i5 = f13490x;
        this.f13498h = iSAdQualityLogLevel;
        f13489w = (i5 + 99) % 128;
    }

    public final synchronized void B(boolean z2) {
        int i5 = (f13489w + 89) % 128;
        f13490x = i5;
        this.f13496f = z2;
        int i10 = i5 + 121;
        f13489w = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 40 / 0;
        }
    }

    public final synchronized boolean C() {
        boolean z2;
        try {
            int i5 = f13490x;
            int i10 = i5 + 115;
            f13489w = i10 % 128;
            if (i10 % 2 != 0) {
                z2 = this.f13495e;
                int i11 = 17 / 0;
            } else {
                z2 = this.f13495e;
            }
            int i12 = i5 + 103;
            f13489w = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    public final boolean D(String str) {
        f13490x = (f13489w + 77) % 128;
        if (C()) {
            f13489w = (f13490x + 123) % 128;
            Ab.k(p(Color.argb(0, 0, 0, 0) + 12, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 74, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), p(TextUtils.indexOf((CharSequence) "", '0') + 53, Color.argb(0, 0, 0, 0) + 954, (char) (KeyEvent.normalizeMetaState(0) + 57820)).intern());
            return false;
        }
        if (!c()) {
            Ab.k(p(12 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 74, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern(), p(64 - MotionEvent.axisFromString(""), KeyEvent.normalizeMetaState(0) + 1006, (char) Color.green(0)).intern());
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        f13490x = (f13489w + 27) % 128;
        Ab.k(p((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, 74 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), p(KeyEvent.normalizeMetaState(0) + 34, MotionEvent.axisFromString("") + 1072, (char) (Color.red(0) + 48746)).intern());
        return false;
    }

    public final synchronized ISAdQualityLogLevel E() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i5 = f13489w;
        int i10 = i5 + 73;
        f13490x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        iSAdQualityLogLevel = this.f13498h;
        int i11 = i5 + 13;
        f13490x = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062 A[PHI: r0
  0x0062: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v11 java.lang.String) binds: [B:8:0x0060, B:5:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(android.content.Context r10) {
        /*
            r9 = this;
            int r0 = Va.Kb.f13489w
            int r0 = r0 + 51
            int r1 = r0 % 128
            Va.Kb.f13490x = r1
            int r0 = r0 % 2
            r1 = 11
            r2 = 48
            java.lang.String r3 = ""
            if (r0 != 0) goto L3c
            Va.Ra r0 = r9.f13504o
            int r1 = android.text.TextUtils.lastIndexOf(r3, r1)
            int r1 = r1 + 91
            int r4 = android.text.TextUtils.getTrimmedLength(r3)
            char r4 = (char) r4
            int r5 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r5 = r5 % 60
            r6 = 12375(0x3057, float:1.7341E-41)
            int r5 = r6 >> r5
            java.lang.String r1 = p(r1, r5, r4)
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.m(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lea
            goto L62
        L3c:
            Va.Ra r0 = r9.f13504o
            int r4 = android.text.TextUtils.lastIndexOf(r3, r2)
            int r4 = r4 + r1
            int r1 = android.text.TextUtils.getTrimmedLength(r3)
            char r1 = (char) r1
            int r5 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r5 = r5 >> 16
            int r5 = 1378 - r5
            java.lang.String r1 = p(r4, r5, r1)
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.m(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lea
        L62:
            Va.Ra r1 = new Va.Ra
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r4 = r4 >> 16
            int r4 = r4 + 25
            int r5 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r5 = r5 >> 8
            r6 = 44165(0xac85, float:6.1888E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            r6 = 0
            int r7 = android.text.TextUtils.getOffsetAfter(r3, r6)
            int r7 = 1388 - r7
            java.lang.String r4 = p(r4, r7, r5)
            java.lang.String r4 = r4.intern()
            int r5 = android.graphics.Color.red(r6)
            int r5 = 24 - r5
            int r7 = android.text.TextUtils.indexOf(r3, r2, r6)
            int r7 = r7 + 1
            char r7 = (char) r7
            int r8 = android.graphics.ImageFormat.getBitsPerPixel(r6)
            int r8 = 1412 - r8
            java.lang.String r5 = p(r5, r8, r7)
            java.lang.String r5 = r5.intern()
            r1.<init>(r10, r4, r5)
            long r4 = android.os.SystemClock.currentThreadTimeMillis()
            r7 = -1
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            int r10 = r10 + 9
            int r4 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r4 = r4 >> 16
            char r4 = (char) r4
            int r2 = android.text.TextUtils.lastIndexOf(r3, r2)
            int r2 = r2 + 1379
            java.lang.String r10 = p(r10, r2, r4)
            java.lang.String r10 = r10.intern()
            r1.r(r10, r0)
            Va.Ra r10 = r9.f13504o
            int r0 = android.text.TextUtils.getOffsetAfter(r3, r6)
            int r0 = 10 - r0
            int r1 = android.view.ViewConfiguration.getEdgeSlop()
            int r1 = r1 >> 16
            char r1 = (char) r1
            long r2 = android.os.Process.getElapsedCpuTime()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r2 = r2 + 1377
            java.lang.String r0 = p(r0, r2, r1)
            java.lang.String r0 = r0.intern()
            r10.p(r0)
        Lea:
            int r10 = Va.Kb.f13490x
            int r10 = r10 + 21
            int r10 = r10 % 128
            Va.Kb.f13489w = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Kb.F(android.content.Context):void");
    }

    public final void G(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i5 = f13489w + 59;
        f13490x = i5 % 128;
        int i10 = i5 % 2;
        n(this.f13506q, iSAdQualityInitError, str);
        if (i10 == 0) {
            int i11 = 59 / 0;
        }
    }

    public final synchronized boolean c() {
        boolean z2;
        try {
            int i5 = f13490x + 41;
            f13489w = i5 % 128;
            if (i5 % 2 != 0) {
                z2 = this.f13493c;
                int i10 = 75 / 0;
            } else {
                z2 = this.f13493c;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void changeUserId(String str) {
        String str2;
        boolean z2;
        try {
            if (D(str)) {
                if (str.equals(h().c())) {
                    z2 = false;
                } else {
                    f13489w = (f13490x + 123) % 128;
                    z2 = true;
                }
                boolean zC = C0974fb.e().c();
                if (z2 && zC) {
                    this.f13503n.j();
                    f13489w = (f13490x + 53) % 128;
                }
                str2 = str;
                try {
                    r(this.f13499i, str2, z2, true, zC);
                } catch (Exception e7) {
                    e = e7;
                    String strIntern = p(11 - TextUtils.indexOf((CharSequence) "", '0', 0), Process.getGidForName("") + 75, (char) (ViewConfiguration.getPressedStateDuration() >> 16)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p(21 - (ViewConfiguration.getScrollBarSize() >> 8), 600 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (61598 - TextUtils.lastIndexOf("", '0', 0, 0))).intern());
                    sb2.append(str2);
                    Ab.p(strIntern, sb2.toString(), e, true, false, true);
                }
            }
        } catch (Exception e10) {
            e = e10;
            str2 = str;
        }
    }

    public final synchronized boolean g() {
        int i5 = f13490x;
        boolean z2 = this.f13496f;
        int i10 = i5 + 1;
        f13489w = i10 % 128;
        if (i10 % 2 == 0) {
            return z2;
        }
        int i11 = 52 / 0;
        return z2;
    }

    public final synchronized H h() {
        H h10;
        int i5 = f13490x;
        int i10 = i5 + 1;
        f13489w = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        h10 = this.f13491a;
        f13489w = (i5 + 61) % 128;
        return h10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str) {
        f13490x = (f13489w + 63) % 128;
        initialize(context, str, null);
        f13490x = (f13489w + 67) % 128;
    }

    public final synchronized void l() {
        if (C()) {
            f13490x = (f13489w + 23) % 128;
            Ab.k(p(12 - (ViewConfiguration.getTapTimeout() >> 16), 73 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern(), p(60 - TextUtils.getOffsetAfter("", 0), 1438 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 65404)).intern());
            return;
        }
        if (!c()) {
            this.f13497g = true;
            f13490x = (f13489w + 95) % 128;
            return;
        }
        Ab.k(p(12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 74 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern(), p(48 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1496, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1)).intern());
    }

    public final void m(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        f13489w = (f13490x + 77) % 128;
        y(activity.getApplication(), activity, str, iSAdQualityConfig);
        f13489w = (f13490x + 31) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Kb.r(android.content.Context, java.lang.String, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:26|(1:28)|29|(1:31)(3:34|35|(8:37|55|40|41|(1:43)|44|45|46)(1:38))|32|55|40|41|(0)|44|45|46) */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e1 A[Catch: all -> 0x0065, Exception -> 0x0069, TryCatch #3 {Exception -> 0x0069, blocks: (B:5:0x000c, B:7:0x0015, B:21:0x006e, B:23:0x0074, B:26:0x00b5, B:28:0x00d8, B:29:0x0106, B:31:0x010e, B:32:0x012b, B:40:0x0176, B:41:0x0196, B:43:0x01e1, B:44:0x0210, B:37:0x013f, B:38:0x015d), top: B:58:0x000c, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s(boolean r12) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Kb.s(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ac  */
    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue r11) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Kb.sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue):void");
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        if (!C()) {
            this.f13501l = iSAdQualityAdListener;
            int i5 = f13490x + 19;
            f13489w = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 83 / 0;
                return;
            }
            return;
        }
        f13489w = (f13490x + 121) % 128;
        Ab.k(p(12 - (Process.myPid() >> 22), 74 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), p(Process.getGidForName("") + 54, (-16775599) - Color.rgb(0, 0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 18724)).intern());
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i5;
        boolean z2;
        f13490x = (f13489w + 51) % 128;
        if (C()) {
            Ab.k(p(13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 74 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), p(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 49, 1859 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern());
            return;
        }
        synchronized (this) {
            i5 = (f13489w + 87) % 128;
            f13490x = i5;
            z2 = this.f13494d;
            f13489w = (i5 + 27) % 128;
        }
        if (!z2) {
            this.f13492b = iSAdQualityConfig;
            return;
        }
        f13489w = (i5 + 93) % 128;
        Ab.k(p((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 12, (ViewConfiguration.getEdgeSlop() >> 16) + 74, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), p(58 - View.resolveSizeAndState(0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 1907, (char) (5280 - (ViewConfiguration.getTouchSlop() >> 8))).intern());
        int i10 = f13489w + 19;
        f13490x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setMetaData(String str, String str2) {
        String strIntern = p(Color.red(0) + 12, 74 - View.resolveSize(0, 0), (char) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern();
        try {
            if (C()) {
                Ab.k(strIntern, p(51 - TextUtils.getOffsetAfter("", 0), 621 - KeyEvent.keyCodeFromString(""), (char) (31201 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
                return;
            }
            if (!c()) {
                Ab.k(strIntern, p(65 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 672, (char) ExpandableListView.getPackedPositionType(0L)).intern());
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i5 = f13489w + 35;
            f13490x = i5 % 128;
            if (i5 % 2 == 0) {
                TextUtils.isEmpty(str2);
                throw null;
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            if (!B.a(str)) {
                if (B.d(h().b(), str)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(p(14 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 735, (char) (ExpandableListView.getPackedPositionType(0L) + 5935)).intern());
                    sb2.append(str);
                    sb2.append(p(27 - Color.blue(0), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 749, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
                    sb2.append(5);
                    sb2.append(p((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 44, 776 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                    Ab.k(strIntern, sb2.toString());
                    f13490x = (f13489w + 13) % 128;
                    return;
                }
                if (!B.c(str, str2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(p(13 - (KeyEvent.getMaxKeyCode() >> 16), 735 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 5936)).intern());
                    sb3.append(str);
                    sb3.append(p(74 - Process.getGidForName(""), TextUtils.getOffsetBefore("", 0) + 820, (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                    sb3.append(1);
                    sb3.append(p(5 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 895, (char) (23938 - Gravity.getAbsoluteGravity(0, 0))).intern());
                    sb3.append(64);
                    sb3.append(p(12 - TextUtils.indexOf("", "", 0, 0), 900 - Color.blue(0), (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                    Ab.k(strIntern, sb3.toString());
                    return;
                }
            }
            H h10 = h();
            h10.getClass();
            int i10 = H.k;
            H.f13391j = (i10 + 15) % 128;
            if (str == null) {
                int i11 = i10 + 63;
                H.f13391j = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 19 / 0;
                }
            } else {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) h10.f13400i;
                if (str2 == null) {
                    concurrentHashMap.remove(str);
                } else {
                    concurrentHashMap.put(str, str2);
                }
            }
            if (p(View.MeasureSpec.makeMeasureSpec(0, 0) + 18, 912 - ExpandableListView.getPackedPositionGroup(0L), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 42706)).intern().equals(str)) {
                H h11 = h();
                h11.getClass();
                int i13 = (H.f13391j + 101) % 128;
                H.k = i13;
                h11.f13398g = str2;
                H.f13391j = (i13 + 73) % 128;
            }
            f13490x = (f13489w + 3) % 128;
        } catch (Exception e7) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(p(MotionEvent.axisFromString("") + 25, 930 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
            sb4.append(str);
            Ab.p(strIntern, sb4.toString(), e7, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setSegment(ISAdQualitySegment iSAdQualitySegment) {
        int i5 = f13490x + 29;
        f13489w = i5 % 128;
        if (i5 % 2 != 0) {
            C();
            throw null;
        }
        if (C()) {
            Ab.k(p((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, 73 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), p(MotionEvent.axisFromString("") + 50, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1809, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern());
            return;
        }
        C1206y c1206y = new C1206y(4);
        c1206y.f14799e = this;
        c1206y.f14798d = iSAdQualitySegment;
        Cb.e(c1206y);
        int i10 = f13489w + 89;
        f13490x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void setUserConsent(boolean z2) {
        int i5 = f13489w + 9;
        f13490x = i5 % 128;
        if (i5 % 2 != 0) {
            h().d(z2);
        } else {
            h().d(z2);
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final synchronized void shutdown() {
        f13490x = (f13489w + 105) % 128;
        s(false);
        int i5 = f13490x + 55;
        f13489w = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final synchronized boolean t() {
        int i5 = (f13489w + 87) % 128;
        f13490x = i5;
        boolean z2 = this.f13497g;
        int i10 = i5 + 51;
        f13489w = i10 % 128;
        if (i10 % 2 == 0) {
            return z2;
        }
        int i11 = 99 / 0;
        return z2;
    }

    public final synchronized void v() {
        int i5 = f13489w;
        this.f13493c = true;
        int i10 = i5 + 69;
        f13490x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final void y(Application application, Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        boolean zOptBoolean;
        String str2;
        String strIntern;
        ISAdQualityConfig iSAdQualityConfigBuild = iSAdQualityConfig == null ? new ISAdQualityConfig.Builder().build() : iSAdQualityConfig;
        if (Y.e().isEmpty()) {
            String strIntern2 = p(View.getDefaultSize(0, 0) + 57, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 86, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern();
            Ab.a(p(11 - TextUtils.indexOf((CharSequence) "", '0'), 74 - (Process.myPid() >> 22), (char) KeyEvent.getDeadChar(0, 0)).intern(), strIntern2);
            n(iSAdQualityConfigBuild.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            return;
        }
        int i5 = f13489w;
        int i10 = i5 + 101;
        f13490x = i10 % 128;
        ISAdQualityInitError iSAdQualityInitError = null;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f13492b == null) {
            f13490x = (i5 + 65) % 128;
            zOptBoolean = true;
        } else {
            try {
                str2 = iSAdQualityConfigBuild.getMetaData().get(p(13 - TextUtils.getCapsMode("", 0, 0), TextUtils.getOffsetBefore("", 0) + 1365, (char) (48430 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern());
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(str2)) {
                zOptBoolean = false;
            } else {
                zOptBoolean = new JSONObject(str2).optBoolean(p(23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1965 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                f13490x = (f13489w + 77) % 128;
            }
        }
        if (!zOptBoolean) {
            iSAdQualityConfigBuild = ISAdQualityConfig.merge(this.f13492b, iSAdQualityConfigBuild);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfigBuild;
        synchronized (this) {
            try {
                if (this.f13495e) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN;
                    strIntern = p((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (ViewConfiguration.getWindowTouchSlop() >> 8) + 143, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern();
                } else if (this.f13494d) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                    strIntern = p(40 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 191 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0)).intern();
                } else if (this.f13493c) {
                    iSAdQualityInitError = ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED;
                    strIntern = p((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 59, TextUtils.getOffsetAfter("", 0) + 231, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6574)).intern();
                } else {
                    this.f13494d = true;
                    strIntern = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iSAdQualityInitError != null) {
            if (iSAdQualityInitError == ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN) {
                Ab.k(p(TextUtils.lastIndexOf("", '0', 0) + 13, 74 - View.getDefaultSize(0, 0), (char) View.combineMeasuredStates(0, 0)).intern(), strIntern);
            }
            n(iSAdQualityConfig2.getAdQualityInitListeners(), iSAdQualityInitError, strIntern);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId()) && iSAdQualityConfig2.isUserIdSet()) {
            String strIntern3 = p(60 - View.MeasureSpec.getSize(0), Process.getGidForName("") + 291, (char) (34573 - Color.red(0))).intern();
            Ab.k(p(12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 74, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), strIntern3);
            synchronized (this) {
                this.f13494d = false;
            }
            n(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern3);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            String strIntern4 = p(ExpandableListView.getPackedPositionType(0L) + 49, 350 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51381)).intern();
            Ab.k(p(12 - Color.alpha(0), KeyEvent.keyCodeFromString("") + 74, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), strIntern4);
            synchronized (this) {
                this.f13494d = false;
            }
            n(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern4);
            return;
        }
        synchronized (this) {
            this.f13506q.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
        }
        C0974fb.e().l(application, activity);
        Xa.g().c();
        C0935cb.p().v();
        Cb.e(new Ga(this, iSAdQualityConfig2, str, application, activity));
    }

    public final void z(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i5 = f13489w + 53;
        f13490x = i5 % 128;
        int i10 = i5 % 2;
        y(application, null, str, iSAdQualityConfig);
        if (i10 == 0) {
            int i11 = 97 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public final void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        if (context instanceof Application) {
            z((Application) context, str, iSAdQualityConfig);
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            f13489w = (f13490x + 95) % 128;
            z((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        Set<ISAdQualityInitListener> adQualityInitListeners = null;
        if (context instanceof Activity) {
            int i5 = f13489w + 3;
            f13490x = i5 % 128;
            if (i5 % 2 != 0) {
                m((Activity) context, str, iSAdQualityConfig);
                return;
            } else {
                m((Activity) context, str, iSAdQualityConfig);
                throw null;
            }
        }
        String strIntern = p(74 - TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (13197 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern();
        Ab.k(p((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, (ViewConfiguration.getJumpTapTimeout() >> 16) + 74, (char) View.MeasureSpec.getMode(0)).intern(), strIntern);
        if (iSAdQualityConfig != null) {
            adQualityInitListeners = iSAdQualityConfig.getAdQualityInitListeners();
            f13490x = (f13489w + 47) % 128;
        }
        n(adQualityInitListeners, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
    }
}
