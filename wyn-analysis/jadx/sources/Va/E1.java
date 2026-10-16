package Va;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.applovin.adview.AdViewController;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class E1 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13297R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f13298S;

    /* renamed from: T, reason: collision with root package name */
    public static int f13299T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13300U = 1;

    static {
        char[] cArr = new char[2053];
        R8.v.k("\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l»\u009aáÈI\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÿ²Ò\u001e¤¹whIè\u001b\u0094î4ÀÖ\u0093Ze\u00127\u0087\n%ÜÊ¯}\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0098~ò¬EÙ¹\u0007\b5}b\u0089\u0090\u0005½\u0091ë\u000e\u0019WF×t#¡\u009bÏáým*\u00adX0\u0086j³ÅáJ\u0000A-ù[l\u0088¾¶\u0011äf\u0011í?$l\u0086\u009añÈPõÐ#0P\u0095~ó¬A\u00103=\u009fK8\u0098é¦iô\u0015\u0001µ/W|Ó\u008a\u0099Ø$å¨3\\@øn\u0090¼(ÉÖ\u0017v%\u0019r¹\u0080w\u00adðûx\t\u0000V¼dN±ôß\u0084\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¡\u009aëÈVõÚ#.P\u008a~â¬ZÙ¤\u0007\u00045kbË\u0090\u0005½\u0085ë:\u0019rFÙt9¡\u009dÏè\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈaõÓ#5P\u009a~ý¬\u007fÙ¹\u0007\u001e5~bÂ\u0090*½\u0084ë\f\u0002\u008e/\"Y\u0085\u008aT´Ôæ¨\u0013\b=ênf\u0098.Ê©÷\u0019!àRF|5®\u009dÛf\u0005î7¬`\u001b\u0092ÿ¿Kéß\u001b±D\u0005P$}\u0088\u000b/Øþæ~´\u0002A¢o@<ÌÊ\u0084\u0098\u0015¥¿sN\u0000ý.\u0081ü2\u0089ùWae\u001c2¶ÀDíê»~I\fi\u000eD¢2\u0005áÔßT\u008d(x\u0088Vj\u0005æó®¡;\u009c\u0099Jw9Ó\u0017¶Å,°ónC\\<\u000b\u008aùjÔÍ\u0082Zp\u0018/\u009e\u001diÈÉ¦¥\u0094\rCã1[õÑØ}®Ú}\u000bC\u008b\u0011÷äWÊµ\u00999oq=á\u0000FÖ¶¥\f\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈvõÆ#,P\u009cl\u001bA·7\u0010äÁÚA\u0088=}\u009dS\u007f\u0000ûö±¤\u001b\u0099\u0080Oh<×\u0012¥À\u001fµãkMY5\u000e\u0099üWÑÕ\u0087Pu$*\u0090\u0018|ÍÜ£¼\u0091\u0002Fú4]ê5°÷\u009d[ëü8-\u0006\u00adTÑ¡q\u008f\u0093Ü\u0017*]xàEl\u0093\u0098à<ÎT\u001cìi\u0012·²\u0085ÝÒ} ³\r3\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¿\u009aàÈ@õé#5P\u009c~á¬rÙ³\u0007\u00195cbÑ\u0090-½\u0095ë\u0007\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l©\u009aáÈqõÚ#.P\u008f~ÿ¬PÙµ\u0007$5gb×\u0090(X\u001eu²\u0003\u0015ÐÄîD¼8I\u0098gz4öÂ¾\u0090+\u00ad\u0089{f\bÑ&\u008cô\u001a\u0081ê_\\m!:´ÈråÍ³UA!\u001e\u0089,oùß\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¾\u009aìÈFõÚ#3P¯~ÿ¬VÙ§\u0002®/\u0016Y\u0083\u008aQ´þæ\u0089\u0013\u0002=Ëni\u0098\u001eÊ¿÷?!ßRz|\u001c®®Ûv\u0005ï7\u0095`$íxÀÔ¶se¢[\"\t^üþÒ\u001c\u0081\u0090wØ%Y\u0018çÎ\u0016½¥\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u009aÌÈOõÏ#0\u0000M-ü[B\u0088\u0091¶\u0001ä}\u0011Â?8l\u008b\u009a÷ÈGõÚ#2P¸~ò¬zÙ½\u0007\u001d5f\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈrõÞ#.P\u0098~û¬VÙ¤\u0007\b5xbÔ\u0090\r½\u008cë\u000e\u0019w&Ò\u000bg}Á®!\u0090\u008aÂú7X\u0019»J\u0019¼IîØÓR\u0005µv\u000fXj\u008aÉÿ\u0006!\u009f\u0013åDT\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷\u0090þ½OËñ\u0018%&£\u0000M-ü[B\u0088\u0096¶\u0010äW\u0011Á?9l\u0085\u009aäÈV¿_\u0092îäP7\u0084\t\u0002[O®Õ\u0080*Ó\u008e%òw^JÈ\u009c<ädÉÕ¿kl¿R9\u0000nõîÛ\u0007\u0088¶~í,o\u0011ÚÇ\u001c´£\u009aËH\u007f=\u0097ã!ÑQ\u0007é*X\\æ\u008f!±µãÂ\u0016k8\u009dk(\u000b¾&\u000fP±\u0083v½âï\u0095\u001a<4Êg\u007f\u0091\u0013Ãµþ\r(Ë[Fu\f§³ÒW\fû>\u0097i1\u009bÅ\u0000M-ø[^\u0088¾¶\u0015äe\u0011Ç?$l\u0086\u009aÄÈFõÞ#,P\u008d~ó¬AÙ\u0092\u0007\f5ybÂ\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¥\u009aàÈFõÖ#=P\u008d~ÿ¬\\Ù¾\u0007,5nbÆ\u00904½\u0095ë\u001b\u0019iÄcéÖ\u009fpL\u0090r; KÕéû\n¨¨^ê\fh1ðç\u0002\u0094£ºÝho\u001d¬Ã,ñQ¦ýT\u000fy½\u0095e¸ÔÎj\u001d¾#8qo\u0084ïª\u0006ù·\u000fì]n`ö¶\u0004Å¥ëÛ9i\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0007\f5zbÓ\u0090!½\u0093\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8P\u0098~æ¬GÙµ\u0007\u001f\u0000M-ü[B\u0088\u0084¶\u001däv\u0011À?*l\u0084\u009aÕÈPõÐ#*P\u0090~ò¬VÙ¢\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈrõÞ#.P\u0098~û¬VÙ¤\u0007\b5xbÔì\u0084Á5·\u008bd_ZÙ\b¹ý\u0017Óö\u0080Dv>$¹\u0019\u0013Ïæ¼@\u00920@\u00945jëÁÙ\u0093\u008e\u000f|ÿQI\u0007Úõ·ª\u0005\u0098ùMI#5\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈqõÖ#;P\u0097~÷¬_Ù\u0093\u0007\u00025fbË\u0090!½\u0082ë\n\u0019rF×t;¡¢Ïîý^*¨X\u000b\u0086f³ÔáX\u000e¨<\u0004â4Ï\u0085¹;jïTi\u0006\tó§ÝF\u008eôx\u008e*\u0012\u0017¨ÁL²ô\u009c\u0086N+;Åå}×\t\u0080¿rI_ñ\thû\f¤\u0091\u0096MCù-\u0097\u001f8ÈÕºkd\u001fQ«\u00037\u0000M-ü[B\u0088\u0096¶\u0010äp\u0011Þ??l\u008d\u009a÷ÈnõÖ#/P\u008d~ó¬]Ùµ\u0007\u001f\u0000M-ü[B\u0088\u0096¶\u0010äG\u0011Ç?.l\u009f\u009aÄÈFõÞ#,P\u008d~ó¬AÙ\u009c\u0007\u00045ybÓ\u0090!½\u008fë\u001b\u0019i\u0000M-ü[B\u0088\u009e¶\u001aäe\u0011Ë?9l\u009b\u009añÈKõË#5P\u0098~ú¬rÙ´\u0007\f5zbÓ\u0090!½\u0093ë2\u0019rFËt!¡\u0097ÏáýI*»\u0000M-ü[B\u0088\u0085¶\u0011äf\u0011Ï?9l\u008c\u009aàÈFõþ#8P\u0098~æ¬GÙµ\u0007\u001f5FbÎ\u00907½\u0095ë\u001b\u0019uFÝt'\u0000M-ü[B\u0088\u0084¶\u001däv\u0011À?*l\u0084\u009aÆÈMõÓ#0P\u009c~õ¬GÙ¹\u0007\u00025dbë\u0090-½\u0092ë\n\u0019~FÖt0¡\u0080ÅkèÚ\u009edM´s !EÔçú\u001fW|zÐ\fwß¦á&³ZFúh\u0018;\u0097ÍÊ\u009fp¢ãt\u0005\u0007§)Êû}\u008e\u0099P\u001dbV5ôÇ\u0018ê»¼&NT\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%lª\u009a÷ÈMõÞ#8P\u009a~÷¬@Ù¤\u0007 5kbÉ\u0090%½\u0086ë\u001b\u0019iFêt0¡\u0091ÏêýE*¿X\u0003\u0086q\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l«\u009aêÈOõÒ#)P\u0097~ÿ¬PÙ±\u0007\u00195ebÕ\u0090\t½\u0084ë\r\u0019hFÙt2¡\u0097¢B\u008fóùV*»\u0014\u0000F~³Æ\u009d)Î\u00888ðjLWÌ\u0081\u0010ò\u009dÜä\u000eA{°¥\u000b\u0097nÀï2(\u001f\u0090I\u0013\u0080Í\u00adaÛÆ\b\u00176\u0097dë\u0091K¿©ì'\u001afHÃu^£¥Ð\u001bþs,ÜY=\u0087\u0095µéâYÂÆïj\u0099ÍJ\u001ct\u009c&àÓ@ý¢®,Xm\nÈ7Uá®\u0092\u0010¼xn×\u001b6Å\u009e÷â RR\u0090\u007f\u0013)\u009bÛï\u0084\\¶ c\u001c\rj?Îè<\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l«\u009aêÈOõÒ#)P\u0097~ÿ¬PÙ±\u0007\u00195ebÕ\u0090\u0014½\u0094ë\u001c\u0019wFÑt&¡\u009aÏêý^wyZÕ,rÿ£Á#\u0093_fÿH\u001d\u001b\u0093íÒ¿w\u0082êT\u0011'¯\tÇÛh®\u0089p!B]\u0015íç1Ê¼\u009c5nP1á\u0003\nÖ£¸Ù\u008as]¢/;ñIÄî\u0096ly\u0081K*\u0091P¼üÊ[\u0019\u008a'\nuv\u0080Ö®4ýº\u000bûY^dÃ²8Á\u0086ïî=AH \u0096\b¤tóÄ\u0001\u0010,\u009ez\u001b\u0088c×Ýå=\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l®\u009aðÈNõÓ#/P\u009a~ä¬VÙµ\u0007\u00035^bÏ\u0090!½\u008cë\u001b\u0019\u007fFùt6¡\u0086ÏæýZ* X\u0012\u0086z\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0098~ò¬EÙ¹\u0007\b5}b\u0089\u0090\u0005½\u0091ë\u000e\u0019WF×t#¡\u009bÏáýj*¼X\n\u0086o³Óá^\u000e¨<\u0012jq\u0097ßÅ\u001aò\u0083 íNH{§©;Ö½\u0004ú2B_º\u008d\u0006»dèÞ\u0016>\u0001\u009a,+Z\u0095\u0089N·Âå²\u0010\u0010>êmZ\u009b\u0013É\u0091¨Ä\u0085uóË \u0010\u001e\u009cLì¹N\u0097´Ä\u00042M`Ï]z\u008b¼ø\u0003Ök\u0004ßq7¯\u0081\u009dñ\u0000M-ü[B\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõó#3P\u0098~ò¬VÙ¢Æ.ë\u009f\u009d!Núpv\"\u0006×¤ù^ªî\\§\u000e%3\u0095åR\u0096ê¸\u0099\rx ÉVw\u0085¬» éP\u001cò2\ba¸\u0097ñÅsøÜ.\u0000]©sÔ\u0000c-ò[W\u0088ù¶\u0015äa\u0011Þ?'l\u0087\u009aóÈKõÑ#rP\u0094~ó¬WÙ¹\u0007\f5~bÎ\u0090+½\u008fëP\u0019uFÙt!¡\u009bÏùýI*\u0088X\u0002\u0086p³\u008eáp\u000e»<\u000fjZ\u0097ÐÅ:ò\u0082 þN@{\u0083©;Öª\u0004ð2S_¤\u0012¤?\u0015I«\u009ap¤üö\u008c\u0003.-Ô~d\u0088-Ú¯ç\u00001ÜBul\b¾\u0098ËP\u0015ê'\u0087p+\u0082ß\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¦\u009aäÈVõÖ#*P\u009c~×¬WxÖUz#Ýð\fÎ\u008c\u009cðiPG²\u00141âs°Á\u008dA[½(\u000b\u0006@ÔÀ¡\u0002\u007f\u008cMø\u001a^è§Å:\u0093\u0080aÿ>[\f§Ù\u000b·}\u0085É\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¦\u009aäÈVõÖ#*P\u009c~×¬WÙ\u0083\u0007\b5xbÑ\u0090-½\u0082ë\u001b{\u0090V< \u009bóJÍÊ\u009f¶j\u0016Dô\u0017tá1³\u0097\u008e\u0007Xì+~\u0005.×\u0087¢v\u0000A-í[J\u0088\u009b¶\u001bäg\u0011Ç?%l¾\u009aäÈQõË#\u0011P\u009c~ò¬ZÙ±\u0007;5cbÂ\u00903Ë^æò\u0090UC\u0084}\u0004/xÚØô:§¹Qû\u0003I>Éè5\u009b\u0083µÈgH\u0012\u0086Ì\u001fþe©Ô\u0000V-Ø[h\u0088\u0084¶=ä^\u0011à\u0000^-Á[^\u0088\u008c¶(äu\u0011\u0080?\u0016lÃ\u009aÙÈFõ\u009bXÂuI\u0003ÿÐ'î¡¼ãIsg\u00934:Â_\u0090ß\u00adg{\u009e\b<&Bôì\u0081\u0004_®\u0000s-ø[N\u0088\u0096¶\u0010äG\u0011Ç?/l\u008d\u009aêÈrõÓ#=P\u0080~ô¬RÙ³\u0007\u00065FbÎ\u00907½\u0095ë\u001b\u0019uFÝt'\u0000s-ø[N\u0088\u0096¶\u0010äU\u0011Ç?8l\u0098\u009aéÈCõÆ#\u0010P\u0090~å¬GÙµ\u0007\u00035obÕx{Uä#Rð\u008aÎ\f\u009c[iÛG2\u0014\u0083âÚ°Q\u008dÍ[4(\u0097\u0006åÔC¡ \u007f\u0014Md\u0000K-Ô[b\u0088º¶<ät\u0011æ?)l±\u009aÄÈlõö#\u0002\u0000g-ø[N\u0088\u0084¶\u001däk\u0011Ë\u0000g-ø[N\u0088\u0083¶\räa\u0011Ë\u0000g-ø[N\u0088\u008d¶\u001bä\u007f\u0011Ë?\u0002l\u008c\u0000g-ø[N\u0088\u0094¶\u0006ät\u0011Ï??l\u0081\u009aóÈGõö#8\u0000i-î[l\u0088¾¶\u0010ät\u0011Á?\nl\u008c\u009f°²7Ä¡\u0017o)Ã{¦\u008e\u0012 à\u0007®*)\\´\u008f~±Ðã³\u0016\u00078økF\u009d4Ï\u008cò\u0002$þWZy\u0010«\u0090]ëpt\u0006ÂÕ\u001aë\u0088¹íLnb¨1\u0012Ç`\u0095À¨q~¢\r\u001a#{ñÛ\u0084?Z\u0080hõ?_Í\u0085à\f¶\u009cDö\u001bS)¼ü\f\u0084+©¡ß\u0004\fç2^`<\u0095\u0092»`èð\u001e¬L\u000bqª§jÔÖú¦(\u0004]Ë\u0083F±<æ\u009f\u0014y9ÛoF\u009d1Â\u0095ð^%ÎKµy\u0010®ùÜI\u0002?7\u008bËºæ<\u0090\u0087C}}Ü/·Ú\u0012ôð§BQ8\u0003¬>\u0000èã\u009bzµ6g\u008a\u0012vÌÌþ\u0087©\u001a[ävO ÕÒ·\u008d\u0016¿éjI\u0004\u00126\u0086áe\u0093ÌM¥x\u0019*\u0097ÅgÊ®ç1\u0091\u0087B_|Í.¨Û+õí¦WP%\u0002\u0085?5éú\u009a]´2f\u008f\u0013wÍÍÿ ¨\u000fZùwG!ÅÓ\u009f\u008c\u0014¾ïkH\u0005'7\u0082àe\u0092ëL«y\u001d+\u0095 Í\rV{æ¨\u001a\u0096©ÄÝ1y\u001f\u0097L3ºoèóÕ@\u0003\u0092p7^d\u008câù\u0018'º\u0015ÚBZ°\u0095\u009d2Ë\u00ad9ÐfhT\u0082\u0081/ïPÝæ\n\u0018xª\u0000g-ø[N\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõò#=P\u0090~ø¬zÙ½\u0007\f5mbÂ\u0090\u0011½\u0093ë\u0017\u0000s-ø[N\u0088\u0099¶\u0015äe\u0011Ç?=l\u008d\u009aÄÈFõú#*P\u009c~ø¬GÙ\u009c\u0007\u00045ybÓ\u0090!½\u008fë\u001b\u0019iü\u0013Ñ\u008c§:tíJa\u0018\u0011í³ÃI\u0090ùf°42\t\u0082ßK¬â\u0082\u008cP\u0012%Öûp", "ISO-8859-1", cArr, 0, 2053);
        f13297R = cArr;
        f13298S = 2710220064118746525L;
    }

    public static boolean C0(AppLovinAd appLovinAd) {
        f13300U = (f13299T + 69) % 128;
        boolean zIsVideoAd = appLovinAd.isVideoAd();
        f13299T = (f13300U + 21) % 128;
        return zIsVideoAd;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean D0(com.applovin.sdk.AppLovinAd r3) {
        /*
            int r0 = Va.E1.f13299T
            int r0 = r0 + 31
            int r1 = r0 % 128
            Va.E1.f13300U = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L13
            r0 = 11
            int r0 = r0 / r1
            if (r3 == 0) goto L37
            goto L15
        L13:
            if (r3 == 0) goto L37
        L15:
            com.applovin.sdk.AppLovinAdSize r0 = F0(r3)
            com.applovin.sdk.AppLovinAdSize r2 = com.applovin.sdk.AppLovinAdSize.BANNER
            if (r0 == r2) goto L35
            int r0 = Va.E1.f13299T
            int r0 = r0 + 13
            int r0 = r0 % 128
            Va.E1.f13300U = r0
            com.applovin.sdk.AppLovinAdSize r0 = F0(r3)
            com.applovin.sdk.AppLovinAdSize r2 = com.applovin.sdk.AppLovinAdSize.LEADER
            if (r0 == r2) goto L35
            com.applovin.sdk.AppLovinAdSize r3 = F0(r3)
            com.applovin.sdk.AppLovinAdSize r0 = com.applovin.sdk.AppLovinAdSize.MREC
            if (r3 != r0) goto L37
        L35:
            r3 = 1
            return r3
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E1.D0(com.applovin.sdk.AppLovinAd):boolean");
    }

    public static boolean E0(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            f13299T = (f13300U + 29) % 128;
            if (appLovinAd.getType().equals(AppLovinAdType.INCENTIVIZED)) {
                return true;
            }
        }
        f13299T = (f13300U + 111) % 128;
        return false;
    }

    public static AppLovinAdSize F0(AppLovinAd appLovinAd) {
        int i5 = f13300U + 45;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinAd.getSize();
        }
        appLovinAd.getSize();
        throw null;
    }

    public static long G0(AppLovinAd appLovinAd) {
        f13300U = (f13299T + 51) % 128;
        long adIdNumber = appLovinAd.getAdIdNumber();
        f13299T = (f13300U + 119) % 128;
        return adIdNumber;
    }

    public static String H0(AppLovinAd appLovinAd) {
        f13300U = (f13299T + 39) % 128;
        String zoneId = appLovinAd.getZoneId();
        int i5 = f13300U + 35;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return zoneId;
        }
        throw null;
    }

    public static String I0(MaxAd maxAd) {
        f13300U = (f13299T + 123) % 128;
        String creativeId = maxAd.getCreativeId();
        int i5 = f13300U + 71;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return creativeId;
        }
        throw null;
    }

    public static void J0(AdViewController adViewController, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        f13299T = (f13300U + 123) % 128;
        adViewController.setAdDisplayListener(appLovinAdDisplayListener);
        f13299T = (f13300U + 25) % 128;
    }

    public static String K0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13297R[i5 + i11] ^ (i11 * f13298S)) ^ c10);
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

    public static void L0(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdClickListener appLovinAdClickListener) {
        f13300U = (f13299T + 97) % 128;
        appLovinInterstitialAdDialog.setAdClickListener(appLovinAdClickListener);
        int i5 = f13300U + 47;
        f13299T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 50 / 0;
        }
    }

    public static void M0() {
        int i5 = f13300U + 95;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            throw new IncompatibleClassChangeError();
        }
        throw new IncompatibleClassChangeError();
    }

    public static AdViewController N0(AppLovinAdView appLovinAdView) {
        int i5 = f13300U + 13;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return appLovinAdView.getAdViewController();
        }
        appLovinAdView.getAdViewController();
        throw null;
    }

    public static AppLovinBroadcastManager O0(Context context) {
        int i5 = f13300U + 27;
        f13299T = i5 % 128;
        int i10 = i5 % 2;
        AppLovinBroadcastManager appLovinBroadcastManager = AppLovinBroadcastManager.getInstance(context);
        if (i10 != 0) {
            int i11 = 11 / 0;
        }
        f13300U = (f13299T + 13) % 128;
        return appLovinBroadcastManager;
    }

    public static void P0(AppLovinInterstitialAdDialog appLovinInterstitialAdDialog, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        int i5 = f13300U + 49;
        f13299T = i5 % 128;
        int i10 = i5 % 2;
        appLovinInterstitialAdDialog.setAdVideoPlaybackListener(appLovinAdVideoPlaybackListener);
        if (i10 != 0) {
            throw null;
        }
        int i11 = f13299T + 39;
        f13300U = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 56 / 0;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(K0(TextUtils.lastIndexOf("", '0', 0) + 1664, 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (TextUtils.indexOf("", "") + 22705)).intern(), new B1(0));
        map.put(K0(1681 - View.MeasureSpec.getSize(0), Color.blue(0) + 26, (char) (Process.getGidForName("") + 1)).intern(), new J0(22));
        map.put(K0(KeyEvent.normalizeMetaState(0) + 1707, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 19, (char) Color.argb(0, 0, 0, 0)).intern(), new A1());
        map.put(K0((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1727, (ViewConfiguration.getLongPressTimeout() >> 16) + 19, (char) (Gravity.getAbsoluteGravity(0, 0) + 30748)).intern(), new J0(28));
        map.put(K0(1746 - Color.blue(0), 13 - ExpandableListView.getPackedPositionType(0L), (char) (44 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern(), new J0(24));
        map.put(K0(1759 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 7 - View.resolveSize(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern(), new J0(23));
        map.put(K0(1766 - (Process.myPid() >> 22), 7 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) Color.red(0)).intern(), new J0(26));
        map.put(K0(TextUtils.indexOf((CharSequence) "", '0') + 1774, 9 - KeyEvent.normalizeMetaState(0), (char) (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new J0(25));
        map.put(K0(ExpandableListView.getPackedPositionGroup(0L) + 1782, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), new J0(29));
        map.put(K0(1795 - (ViewConfiguration.getTouchSlop() >> 8), 10 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), new B1(3));
        map.put(K0(1804 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getMode(0) + 8, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 40922)).intern(), new B1(1));
        map.put(K0((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1812, (Process.myTid() >> 22) + 16, (char) (1991 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), new J0(27));
        map.put(K0(View.getDefaultSize(0, 0) + 1828, View.combineMeasuredStates(0, 0) + 27, (char) (KeyEvent.normalizeMetaState(0) + 23948)).intern(), new B1(2));
        map.put(K0(1855 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 33, (char) (TextUtils.indexOf("", "") + 33881)).intern(), new C1());
        map.put(K0((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1888, 35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (52175 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).intern(), new D1());
        map.put(K0(Gravity.getAbsoluteGravity(0, 0) + 1923, 34 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (51913 - Color.blue(0))).intern(), new B1(5));
        String strIntern = K0(1957 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 30 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (8382 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern();
        C1208y1 c1208y1 = new C1208y1(0);
        c1208y1.f14801b = this;
        map.put(strIntern, c1208y1);
        map.put(K0(1989 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.red(0) + 23, (char) ExpandableListView.getPackedPositionType(0L)).intern(), new B1(4));
        map.put(K0((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2010, (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 24, (char) TextUtils.getCapsMode("", 0, 0)).intern(), new J0(21));
        map.put(K0(View.resolveSizeAndState(0, 0, 0) + 2035, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, (char) (AndroidCharacter.getMirror('0') + 64580)).intern(), new J0(20));
        int i5 = f13300U + 99;
        f13299T = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        f13299T = (f13300U + 41) % 128;
        try {
            try {
                String str = (String) AppLovinSdk.class.getDeclaredField(K0(1644 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 7, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()).get(null);
                f13300U = (f13299T + 119) % 128;
                return str;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            C1051la c1051la = (C1051la) C0999ha.j().f14264b;
            String strIntern = K0(TextUtils.lastIndexOf("", '0', 0) + 1652, 11 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern();
            c1051la.getClass();
            return C1051la.n(AppLovinSdk.class, strIntern);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:203:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 3378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.E1.w0(java.lang.String):java.lang.Class");
    }
}
