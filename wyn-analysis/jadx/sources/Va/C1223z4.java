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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.BannerAdListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.RewardInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* renamed from: Va.z4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1223z4 extends A4 {

    /* renamed from: U, reason: collision with root package name */
    public static final char[] f14832U;

    /* renamed from: V, reason: collision with root package name */
    public static final long f14833V;

    /* renamed from: W, reason: collision with root package name */
    public static int f14834W = 0;

    /* renamed from: X, reason: collision with root package name */
    public static int f14835X = 1;

    static {
        char[] cArr = new char[2298];
        R8.v.k("\u0000.ð)àZÐmÀ'°S <\u0090I\u0080|p0`BP\u000f@\u001b0{ N\u0010\u0007\u0000\u001eð\u0019\u0000MðAàEÐfÀb°i {\u0090r\u0080mpi`\u007fPU@M0H D\u0000MðJàhÐ}Ài°h `\u0090t\u0080tpH`ZPj@b0F I\u0010Y\u0000_ðAàO\u0000MðAàTÐlÀ{°n `\u0090q\u0080Npr`zPD@K0f I\u0010Y\u0000YðEà_ÐMÀE\u0000AðaàuÐ}À~°n q\u0090a\u0080RpH`_PB@P0N \\\u0010D\u0000DðJ\u0000MðAàGÐjÀx°f d\u0090|\u0080lpb\u0002ÏòÃâÇÒäÂã²à¢ÿ\u0092ù\u0082ÛrúbèRÊBÐ2Ì\"Ü\u0012Ö\u0000CðbàkÐyÀm°f u\u0090{òñ\u0002Ð\u0012Ù\"Ë2ßBÔRÇbÉrï\u0082Ñ\u0000IðmàrÐlÀ~°Y {\u0090q\u0080}pt`QPT@P0k C\u0010^\u0000DðVàXÐ\\ÀN:eÊAÚ^ê@úR\u008aP\u009aJªPº@J^ZSjaz^\nb\u001ab*d:sÊSÚsêfúd\u008av\u009a\u0000ª\fº\u0016\u0000RðfàqÐhÀ~°k D\u0090|\u0080|p~`qPm@M0T ^\u0010H\u0000^ðVàD\u0000MðAàOÐgÀx°j `\u0090f\u0080lpr`jPH@E0K k\u0010N\u0000DðZà@ÐPÀH°F\u0000IðmàrÐlÀ~°| f\u0090|\u0080lpr`\u007fPM@h0N Y\u0010Y\u0000Uð]àSÐKú´\n¸\u001a½*\u0091:\u009bJ\u0098Z\u008ej\u009ez·\u008a\u008b\u009a\u0082ª¯\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eð\\àCÐMÀ\u0012°r \u0000\u0090\u0007\u0080)p%` P4@&0\u0001 3\u00108\u0000\u0017\u0000.ðNàDÐKÀm°a |\u0090p\u0080jpL`{PC@r0N O\u0010ZUl¥cµd\u0085(\u0095nåbõoÅsÕs%s5t\u0005\u0000\u0015Fe[uAEIU\u0011¥Qµ[\u0085T\u0095Rå^õ#Å/Õ5%j57\u00057\u0015>e/u{E\u001fU-¥.µ\b\u0085\b\u0095\rå\u0005õ\u000fÅ-Õ\u0012%\u00165'\u0005ç\u0015îeÿ3oÃcÓmãEóZ\u0083H\u0093B£D³NCPSHcjsg\u0003i\u0013@#n3|ÃuÓxã~ól\u0000MðAàOÐgÀx°j `\u0090f\u0080lpr`jPH@E0K |\u0010D\u0000TðVàYÐqÀ]°Q &\u0090)\u0080-p9\u0000MðWàAÐ[Ài°x s\u0090g\u0080|pM`wPE@A0H b\u0010L\u0000^ðWàZÐ\\ÀN\u0000NðbàrÐ`Àz°j ^\u0090|\u0080kpo`{PO@A0UY\u0003©/¹?\u0089-\u00997é'ù\u000bÉ*Ù4)598\t\u0005\u0019\u0007i\ry+I\tY\u000e©\n¹\u001e\u0089\u001a\u0099\u0014é\u0000\u0093\u00adc\u0081s\u0091C\u0083S\u0099#\u00893°\u0003\u0092\u0013·ã\u0091ó\u008eÃ¶Ó¢£ª³¬\u0083¼\u0000CðbàkÐyÀm°f u\u0090{\u0080Mpu`wPU\u0000BðbàuÐlÀJ°} s\u0090r\u0080up~`pPUN²¾\u0081®\u0099\u009e\u008e\u008e\u008fþ\u009aî\u0090Þ³Î\u0081>\u008e.\u0099\u0000cðlàkÐ'Àa°f |\u0090a\u0080}p|`lP@@H0\t G\u0010^\u0000TðXà\u0018Ð[À]°L '\u0090k\u0080?p.`,P'@=02 -\u0010s\u0000\"ð\u0011à\tÐ\u001eÀ\u001f°\n \u0000\u0090#\u0080\u0011p\u001e`\t§ÝWìGîwÕgï\u0017à\u0007ï7Ù'à×ðÇó÷ÆçË\u0097Ã\u0087Ô\u0000CðlàkÐdÀc°a X\u0090`\u0080upk`RPN@E0C O\u0010_\u0000MðAàOÐdÀm°h w\u0090C\u0080qp~`i\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðDà_Ð]À[°Z 6\u0090k\u0080\u0005p\t`\u0007P<@500 ?\u0010\u000b\u0000\tð\u0006à\u0011[W«P»r\u008bg\u009bsërûzËnÛn+R;@\u000bp\\~¬y¼[\u008cN\u009cZì[üSÌGÜG,k<B\f|\u001cdl`|xLp\\põJ\u0005j\u0015a%k5cEgUseRu}\u0085i\u0095q¥QµKÅUÕU\u0000IðGàiÐ~Àb°c }\u0090t\u0080|pW`wPR@P0B D\u0010H\u0000Bïõ\u001fñ\u000fî?ð/â_àOú\u007fàoð\u009fî\u008fã¿Ñ\r`ý@íWÝNÍy½H\u00adR\u009da\u008dS}\\mK\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eð^àTÐJÀU°X ,\u0090$\u0080$p(`!P<@908 4\u0010s\u0000\u0002ð\u0002à\u0015Ð\fÀB°- \u0013\u0090\u0006\u0080\u001dp,`\u001bPã@Ò0î ï\u0010ú\u0000WðjàhÐmÀZ°n |\u0090p\u0080Op~`|Pw@M0B ]\u00997i8y?IsY5)994\t(\u0019(é(ù/É[Ù\u001d©\u0000¹\u001a\u0089\u0012\u0099Ji\ny\u0000I\u001eY\u0001)\f9x\tp\u0019pé|ùuÉhÙm©l¹`\u0089'\u0099Ci^y\\IYYN)Z9H\tD\u0019\u0002éxùCÉ»Ù´©\u0085¹¿\u0089·\u0099¡i\u0090y§I¯Y\u009e)¢9\u0093\t\u0086\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpM`wPE@A0H |\u0010D\u0000UðD1fÁiÑná\"ñd\u0081h\u0091e¡y±yAyQ~a\nqL\u0001Q\u0011K!C1\u001bÁ@ÑZáXñ\\\u0081U\u0091i¡-±\"A*Q>a8q4\u0001|\u0011\u0012!\u001a1\u0017Á\u000fÑ\u0007á\u000bñ\f\u0081<\u0091\u001e¡\u0014±\u0018A\u0011Q-aíqä\u0001õ\u008dÚ}ýmÿ]êMþ=ÿ-÷\u001dã\rãýÚíèÝÅÍÇ½õ\u00adÓ\u009dÞ\u008dä}ÅmÓ]ÊMý=Á-°\u001d¥\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðEà_Ð]ÀY°P l\u0090(\u0080'p/`;P=@10y \u0017\u0010\u001f\u0000\u0012ð\nà\u0002Ð\u000eÀ\t°9 \u0013\u0090\u0006\u0080\fp>`\u0010På@Ç0æ ø\u0010é\u0000ÆðúàóÐî\u0084¯t\u0088d\u008aT\u009fD\u008b4\u008a$\u0082\u0014\u0096\u0004\u0096ô·ä\u009dÔ·Ä¯´³¤\u00ad\u0094\u008a\u0084¼tµd\u0097TºD¬4¹$ö\u0014Î\u0004ÏôÞ35Ã:Ó=ãqó7\u0083;\u00936£*³*C*S-cYs\u001f\u0003\u0002\u0013\u0018#\u00103HÃ\u0013Ó\tã\u000bó\u000f\u0083\u0006\u0093:£~³qCySmcksg\u0003/\u0013A#I3DÃ\\ÓTãXó_\u0083w\u0093E£W³GC[SMc\u0092s¼\u0003µ\u0013\u009f#º3´Ã¡Ó\u0096ã¦ó¯\u0083¾\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpX`rPH@G0L i\u0010y\u0000qðeà_Ð\\ÀKJÓº\u0093ª\u009a\u009a\u0097\u008aÑú\u0091ê\u0083Ú\u0094Ê\u0082:\u008c*\u008a\u001a·\nùz¹jªZºJ¨ºîª³\u009a£\u008a«ú©êÞÚ\u0098ÊÖ:×*Ù\u001a×\nËzÁj\u0087ZãJÑºâªü\u009aþ\u008aøúùêÂÚêÊâ:ë*æ\u001a1\n#z5j/Z\u0017J\u0006º\u0017\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpY`\u007fPR@A0q C\u0010H\u0000G¹ÝIÒYÕi\u0099yß\tÓ\u0019Þ)Â9ÂÉÂÙÅé±ù÷\u0089ê\u0099ð©ø¹ IûYáiãyç\tî\u0019Ò)\u00969\u0099É\u0091Ù\u0085é\u0083ù\u008f\u0089Ç\u0099©©¡¹¬I´Y¼i°y·\t\u0093\u0019\u00ad)¸9£É\u0093Ù©éZùM\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpX`rPH@G0L g\u0010D\u0000^ðZàuÐXÀN°[ \u0014\u0090,\u0080-p<\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðEà_Ð]ÀY°P l\u0090(\u0080'p/`;P=@10y \u0017\u0010\u001f\u0000\u0012ð\nà\u0002Ð\u000eÀ\t°, \u001e\u0090\u001c\u0080\u001bp\u0010`3Pè@ê0î É\u0010ì\u0000âð÷àÀÐðÀù°èâj\u0012M\u0002O2Z\"NROBGrSbS\u0092\u007f\u0082V²h¢wÒaÂdòdâr\u0012f\u0002G2w\"~Ro\u008c%|*l-\\aL'<+,&\u001c:\f:ü:ì=ÜIÌ\u000f¼\u0012¬\b\u009c\u0000\u008cX|\u0003l\u0019\\\u001bL\u001f<\u0016,*\u001cn\faüiì}Ü{Ìw¼?¬Q\u009cY\u008cT|LlD\\HLO<j,[\u001c]\fJü\\ìQÜ©Ì§¼³¬\u009a\u009c¢\u008c³|¢\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpS`+Pd@J0C i\u0010L\u0000BðWà`ÐPÀY°H\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðEà_Ð]ÀY°P l\u0090(\u0080'p/`;P=@10y \u0017\u0010\u001f\u0000\u0012ð\nà\u0002Ð\u000eÀ\t°' G\u00900\u0080\u0016p\u001f`=Pà@ö0ã Ü\u0010ä\u0000õðä¿\u0013O4_6o#\u007f7\u000f6\u001f>/*?*Ï\tß!ï\u0011ÿ\u001e\u008f\u0010\u009f\u001a¯\u0014¿>O\f_\u000fo\u0002\u007f4\u000f\b\u001fy/l\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðEà_Ð]ÀY°P l\u0090(\u0080'p/`;P=@10y \u0017\u0010\u001f\u0000\u0012ð\nà\u0002Ð\u000eÀ\t°# \u0013\u0090\u001b\u0080\u001cp\u0012`\u0010Pæ@Ô0æ í\u0010è\u0000ÆðúàóÐî\u0000MðjàhÐ}Ài°h `\u0090t\u0080tpK`rP@@]0F H\u0010A\u0000Uðeà_Ð\\ÀK\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðEà_Ð]ÀY°P l\u0090(\u0080'p/`;P=@10y \u0017\u0010\u001f\u0000\u0012ð\nà\u0002Ð\u000eÀ\t°? \u001e\u0090\u0014\u0080\u0001p\u001a`\u001cPí@á0Ñ ã\u0010è\u0000OðmàKÐKÀA°j v\u0090|\u0080ypM`wPD@S0k C\u0010^\u0000DðVàXÐ\\ÀN\u0000BðbàhÐgÀi°} S\u0090q\u0080Tpr`mPU@A0I O\u0010_ó³\u0003\u008a\u0013\u0081#\u00873\u008dC\u0083S³c\u0097s\u008b\u0083\u008f\u0093\u008c£ ³§Ã³Ó\u0080ã\u009eó\u0091\u0003°\u0013¢#°3ªC¶SÖcÜ\u0000DðlàkÐhÀe°a _\u0090w\u0080[pt`sPL@K0I k\u0010N\u0000DðZà@ÐPÀH°F\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðRàUÐMÀU°I +\u00901\u00801pe`\nP>@906 3\u00103\u0000-ð!à%Ð\u0006À\u0001°\u0002 \u001d\u0090\u001b\u00809p\u0018`\nPè@ò0î þ\u0010ô\u0000MðAàtÐ`Àh°h w\u0090\\\u0080|ph\u0000RðfàqÐhÀ~°k [\u0090{\u0080~pt.èÞäÎáþÅîÍ\u009eø\u008eÒ¾Ç®Ü^ÌNß~Ònè\u001eæ\u000eê>ç.ÝÞ÷Îýþøîõ\u009eÿ\u008e\u0095R·¢°²º\u0082¥\u0092 â\u0094ò\u009bÂ\u008aÒ\u0094\"\u00812¶\u0002¶\u0012¾b¼r»B\u009bR¯¢£²¬\u0082«\u0092§â³¢©R\u0081B\u0096r¼b\u008e\u0012\u009f\u0002\u00942\u0080\"\u009bÒªÂ\u0090ò¢â¦\u0092¯\u0082\u0081²£¢¤R B´r°b¾\u0012ª^è®À¾×\u008eâ\u009eèîûþÑÎÄÞß.Ï>Ü\u000eÑ\u001eënå~éNä^×®ö¾ä\u008eö\u009eìîðþ\u0090Î\u009a\u0000cðlàkÐ'Àa°m `\u0090|\u0080|p|`{P\u000f@I0T N\u0010F\u0000\u001eðPàYÐWÀZ°V %\u0090k\u0080)p(`:P8@\"0> .\u0010$\u0000Nð-à\u0003Ð\u001eÀ!°-  \u0090\u0010\u0080\u000fp\u001a`\fPå@Ò0î î\u0010è\u0000ÿðÒàõÐíÀõ°é Ë\u0090Ñ\u0080Ñ\u0000NðfàqÐKÀm°| w\u0090T\u0080{po`wPW@M0S SRÄ¢Ë²Ì\u0082\u0080\u0092ÆâÊòÇÂÛÒÛ\"Û2Ü\u0002¨\u0012îbóréBáR¹¢÷²þ\u0082ð\u0092ýâñò\u0082ÂÌÒ\u008e\"\u008f2\u009d\u0002\u009f\u0012\u0085b\u0099r\u0089B\u0083Ré¢\u008a²¤\u0082¹\u0092\u0089â©ò¦Â·Ò\u009e\"¿2\u00ad\u0002O\u0012UbIrYBSº\u0007J\u0000Z\u0001j\u000ez'\n+\u001a9*8:7Ê#\u0000FðbàuÐ}ÀG°Y>ÃÎòÞûîüþÑ\u008eÛ\u009e·#<Ó=Ã)ó\u001fã>\u0093:\u0083=³+£$S2C$s\u0016c,\u00138\u0003:\u0000gðfàrÐYÀm°l y\u0090t\u0080\u007fp~`PP@@I0B\u0000gðfàrÐJÀ`°f q\u0090~\u0080Mpi`rcù\u0093ø\u0083ì³Û£ûÓÿÃçóßãÿ\u0013õ\u0003å\u0000gðfàrÐ@Àa°n u\u0090p\u0080Mpi`rR¯¢®²º\u0082\u0088\u0092§â¨ò´Â\u0088Ò¢\"¿È\u001a8\u001b(\u000f\u00185\b\u0015x;h\u000b\u0000sðfàrÐKÀm°a |\u0090p\u0080jpM`wPD@S0f N\u0010a\u0000Yð@àBÐ\\ÀR°Z 0bä\u0092å\u0082ñ²Ë¢ëÒØÂèòæâþ\u0000gðfàrÐLÀb°k A\u0090v\u0080jp~`{PO@q0U F\u0000gðfàrÐJÀm°b b\u0090t\u0080qp|`pPt@J0N ^\u0010d\u0000T`\u0081\u0090\u0080\u0080\u0094°¿ \u0086Ð\u0088À\u0097ð\u0096à\u0093\u0010\u0098\u0000\u00960³ \u008bP¥O5¿4¯ \u009f\u0019\u008f?ÿ3ï.ß\"Ï8?\u001c/>\u001f\u001fEÞµß¥Ë\u0095ñ\u0085ÑõìåÂÕÜ<¾Ì¿Ü«ì\u0086ü¼\u008c²\u009c®¬£¼\u0094L°\\«l½|\u0093\f\u009d\u001c\u009c,\u0090<\u008cUJ¥Kµ_\u0085g\u0095SåGõ^ÅLÕ\\%@5V\u0005E\u0015mîA\u001e@\u000eT>n.N^aN@~^nR\u0000gðfàrÐKÀm°a |\u0090p\u0080jpS`jPL@HÆÔ6Õ&Á\u0016ê\u0006ÔvÛfòVÉFÞ¶Ú¦Î\u0096÷aO\u0091N\u0081Z±i¡PÑJÁVñháB\u0011_\u0015ÁåÀõÔÅâÕè¥ÛµÝ\u0085×\u0095ÙeØuèEëUã%â5é\u0005æ\u0015óåûõäÅÖÕþ\u0000gðfàrÐDÀN°} {\u0090q\u0080\u007fp~`KPO@M0S c\u0010IB/²6¢\u0012\u0092*\u0082=ò(â&Ò7Â\u001d22\"5\u0012\u0017\u0002\u000er\u0004b\u0018R\u000eB ²\u001c¢\u0015\u0092\b^5®4¾ \u008e\t\u009e;î*þ!Î5Þ..\u0007>-\u000e\u001e\u001e\u0013\u0089\u001by\u001ai\u000eY'I\u00159\u0004)\u000f\u0019\u001b\t\u0000ù&é\u000fÙ2É-¹5©\"g \u0097!\u00875·\u0000§*×<Ç<÷$ç:\u0017\n\u000707\u0002'\u0006W\u000fG9w\u0018g\u0016\u0097\u0017\u0087\u001a·\u0017§\u0015×\u001fÇV÷vç}\u0017e\u0007g7q", "ISO-8859-1", cArr, 0, 2298);
        f14832U = cArr;
        f14833V = 2976225804372733955L;
    }

    public static String C0(CampaignEx campaignEx) {
        f14835X = (f14834W + 71) % 128;
        String htmlUrl = campaignEx.getHtmlUrl();
        int i5 = f14834W + 23;
        f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return htmlUrl;
        }
        throw null;
    }

    public static String D0(CampaignEx campaignEx) {
        int i5 = f14834W + 39;
        f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return campaignEx.getPkgSource();
        }
        campaignEx.getPkgSource();
        throw null;
    }

    public static String E0(CampaignEx campaignEx) {
        f14834W = (f14835X + 41) % 128;
        String nativeVideoTrackingString = campaignEx.getNativeVideoTrackingString();
        int i5 = f14835X + 113;
        f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return nativeVideoTrackingString;
        }
        throw null;
    }

    public static String F0(CampaignEx campaignEx) {
        f14834W = (f14835X + 97) % 128;
        String videoUrlEncode = campaignEx.getVideoUrlEncode();
        f14835X = (f14834W + 37) % 128;
        return videoUrlEncode;
    }

    public static String G0(CampaignEx campaignEx) {
        int i5 = f14835X + 99;
        f14834W = i5 % 128;
        int i10 = i5 % 2;
        String bannerHtml = campaignEx.getBannerHtml();
        if (i10 != 0) {
            int i11 = 93 / 0;
        }
        return bannerHtml;
    }

    public static String H0(CampaignEx campaignEx) {
        f14835X = (f14834W + 55) % 128;
        String adHtml = campaignEx.getAdHtml();
        int i5 = f14835X + 111;
        f14834W = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 79 / 0;
        }
        return adHtml;
    }

    public static long I0(CampaignEx campaignEx) {
        int i5 = f14834W + 9;
        f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            campaignEx.getCreativeId();
            throw null;
        }
        long creativeId = campaignEx.getCreativeId();
        int i10 = f14835X + 59;
        f14834W = i10 % 128;
        if (i10 % 2 == 0) {
            return creativeId;
        }
        throw null;
    }

    public static String J0(CampaignEx campaignEx) {
        int i5 = f14834W + 101;
        f14835X = i5 % 128;
        int i10 = i5 % 2;
        String adZip = campaignEx.getAdZip();
        if (i10 == 0) {
            int i11 = 25 / 0;
        }
        return adZip;
    }

    public static String K0(CampaignEx campaignEx) {
        int i5 = f14834W + 17;
        f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            campaignEx.getId();
            throw null;
        }
        String id2 = campaignEx.getId();
        f14835X = (f14834W + 113) % 128;
        return id2;
    }

    public static String L0(CampaignEx campaignEx) {
        int i5 = f14835X + 41;
        f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return campaignEx.getCampaignUnitId();
        }
        campaignEx.getCampaignUnitId();
        throw null;
    }

    public static String M0(CampaignEx campaignEx) {
        f14835X = (f14834W + 91) % 128;
        String endScreenUrl = campaignEx.getEndScreenUrl();
        int i5 = f14834W + 79;
        f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return endScreenUrl;
        }
        throw null;
    }

    public static String N0(CampaignEx campaignEx) {
        int i5 = f14835X + 105;
        f14834W = i5 % 128;
        int i10 = i5 % 2;
        String bannerUrl = campaignEx.getBannerUrl();
        if (i10 != 0) {
            int i11 = 20 / 0;
        }
        int i12 = f14834W + 123;
        f14835X = i12 % 128;
        if (i12 % 2 != 0) {
            return bannerUrl;
        }
        throw null;
    }

    public static String O0(CampaignEx campaignEx) {
        f14834W = (f14835X + 87) % 128;
        String placementId = campaignEx.getPlacementId();
        f14834W = (f14835X + 57) % 128;
        return placementId;
    }

    public static String P0(CampaignEx campaignEx) {
        int i5 = f14835X + 5;
        f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return campaignEx.getIconUrl();
        }
        campaignEx.getIconUrl();
        throw null;
    }

    public static String Q0(CampaignEx campaignEx) {
        f14834W = (f14835X + 77) % 128;
        String clickURL = campaignEx.getClickURL();
        f14835X = (f14834W + 43) % 128;
        return clickURL;
    }

    public static int R0(CampaignEx campaignEx) {
        f14834W = (f14835X + 25) % 128;
        int linkType = campaignEx.getLinkType();
        int i5 = f14834W + 91;
        f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 46 / 0;
        }
        return linkType;
    }

    public static String S0(CampaignEx campaignEx) {
        f14834W = (f14835X + 19) % 128;
        String imageUrl = campaignEx.getImageUrl();
        int i5 = f14834W + 17;
        f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 35 / 0;
        }
        return imageUrl;
    }

    public static int T0(CampaignEx campaignEx) {
        f14834W = (f14835X + 37) % 128;
        int adType = campaignEx.getAdType();
        int i5 = f14834W + 65;
        f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return adType;
        }
        throw null;
    }

    public static String U0(CampaignEx campaignEx) {
        f14835X = (f14834W + 7) % 128;
        String packageName = campaignEx.getPackageName();
        f14835X = (f14834W + 37) % 128;
        return packageName;
    }

    public static String V0(RewardInfo rewardInfo) {
        f14834W = (f14835X + 7) % 128;
        String rewardAmount = rewardInfo.getRewardAmount();
        int i5 = f14835X + 119;
        f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return rewardAmount;
        }
        throw null;
    }

    public static Object W0() {
        f14835X = (f14834W + 105) % 128;
        com.mbridge.msdk.system.a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        f14834W = (f14835X + 101) % 128;
        return mBridgeSDK;
    }

    public static String X0(MBridgeIds mBridgeIds) {
        f14834W = (f14835X + 7) % 128;
        String unitId = mBridgeIds.getUnitId();
        f14835X = (f14834W + 85) % 128;
        return unitId;
    }

    public static String Y0(MBridgeIds mBridgeIds) {
        f14835X = (f14834W + 115) % 128;
        String placementId = mBridgeIds.getPlacementId();
        int i5 = f14834W + 27;
        f14835X = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 38 / 0;
        }
        return placementId;
    }

    public static String Z0(RewardInfo rewardInfo) {
        int i5 = f14834W + 95;
        f14835X = i5 % 128;
        if (i5 % 2 != 0) {
            return rewardInfo.getRewardName();
        }
        rewardInfo.getRewardName();
        throw null;
    }

    public static void a1(MBBannerView mBBannerView, BannerAdListener bannerAdListener) {
        int i5 = f14834W + 43;
        f14835X = i5 % 128;
        int i10 = i5 % 2;
        mBBannerView.setBannerAdListener(bannerAdListener);
        if (i10 == 0) {
            throw null;
        }
        int i11 = f14835X + 71;
        f14834W = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static String b1(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14832U[i5 + i11] ^ (i11 * f14833V)) ^ c10);
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

    public static boolean c1(RewardInfo rewardInfo) {
        int i5 = f14835X + 61;
        f14834W = i5 % 128;
        if (i5 % 2 == 0) {
            return rewardInfo.isCompleteView();
        }
        rewardInfo.isCompleteView();
        throw null;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(b1((ViewConfiguration.getFadingEdgeLength() >> 16) + 1934, 15 - Color.blue(0), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9050)).intern(), new N3(4));
        map.put(b1(ImageFormat.getBitsPerPixel(0) + 1950, TextUtils.lastIndexOf("", '0', 0) + 15, (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), new C0928c4());
        map.put(b1(1964 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 11 - TextUtils.indexOf("", "", 0), (char) View.resolveSize(0, 0)).intern(), new C1006i4());
        map.put(b1(1974 - (ViewConfiguration.getEdgeSlop() >> 16), View.MeasureSpec.getSize(0) + 11, (char) (25502 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), new C1058m4());
        map.put(b1(1984 - ExpandableListView.getPackedPositionChild(0L), 11 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) TextUtils.getCapsMode("", 0, 0)).intern(), new C1084o4());
        map.put(b1((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1996, 10 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (21192 - Gravity.getAbsoluteGravity(0, 0))).intern(), new C1110q4());
        map.put(b1(2006 - Color.red(0), 6 - MotionEvent.axisFromString(""), (char) (TextUtils.getTrimmedLength("") + 51325)).intern(), new C1071n4());
        map.put(b1(2012 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 23 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), new C1097p4());
        map.put(b1(2036 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9, (char) (25218 - ImageFormat.getBitsPerPixel(0))).intern(), new C1122r4());
        map.put(b1(Gravity.getAbsoluteGravity(0, 0) + 2045, 15 - TextUtils.indexOf("", ""), (char) TextUtils.getOffsetAfter("", 0)).intern(), new C1148t4());
        map.put(b1(2060 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf("", "") + 17, (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new C1161u4());
        map.put(b1((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2076, View.MeasureSpec.getSize(0) + 14, (char) (AndroidCharacter.getMirror('0') + 24758)).intern(), new C1135s4());
        map.put(b1((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 2091, '<' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20305)).intern(), new C1032k4());
        map.put(b1(TextUtils.indexOf("", "", 0) + 2103, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 8, (char) (MotionEvent.axisFromString("") + 17850)).intern(), new C1187w4());
        map.put(b1(2112 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (15577 - ExpandableListView.getPackedPositionType(0L))).intern(), new C0902a4());
        map.put(b1(2129 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 13, (char) (21806 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), new C1174v4());
        map.put(b1(2140 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9, (char) (60965 - TextUtils.lastIndexOf("", '0', 0, 0))).intern(), new C1211y4());
        map.put(b1(2150 - TextUtils.indexOf("", "", 0, 0), 13 - (Process.myTid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1)).intern(), new C1199x4());
        map.put(b1(View.MeasureSpec.makeMeasureSpec(0, 0) + 2163, 11 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (50867 - TextUtils.getOffsetAfter("", 0))).intern(), new C0915b4());
        map.put(b1(Process.getGidForName("") + 2176, 10 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (Color.argb(0, 0, 0, 0) + 24872)).intern(), new C0954e4());
        map.put(b1(2185 - ExpandableListView.getPackedPositionGroup(0L), 20 - MotionEvent.axisFromString(""), (char) (5542 - View.MeasureSpec.getSize(0))).intern(), new C0967f4());
        map.put(b1(2206 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), View.MeasureSpec.getMode(0) + 16, (char) KeyEvent.getDeadChar(0, 0)).intern(), new C0941d4());
        map.put(b1(2222 - TextUtils.getCapsMode("", 0, 0), 20 - TextUtils.indexOf("", "", 0, 0), (char) (16966 - Drawable.resolveOpacity(0, 0))).intern(), new C1019j4());
        map.put(b1(2290 - AndroidCharacter.getMirror('0'), 13 - TextUtils.getOffsetBefore("", 0), (char) (AndroidCharacter.getMirror('0') + 24098)).intern(), new C0993h4());
        map.put(b1(2255 - TextUtils.getOffsetAfter("", 0), 14 - TextUtils.lastIndexOf("", '0', 0), (char) (35195 - MotionEvent.axisFromString(""))).intern(), new C0980g4());
        map.put(b1(2269 - TextUtils.lastIndexOf("", '0', 0), (ViewConfiguration.getTapTimeout() >> 16) + 28, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26439)).intern(), new C1045l4());
        f14835X = (f14834W + 69) % 128;
        return map;
    }

    @Override // Va.Z0
    public final String u0() {
        f14835X = (f14834W + 51) % 128;
        C1051la c1051la = (C1051la) C0999ha.j().f14264b;
        String strIntern = b1((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern();
        c1051la.getClass();
        String strN = C1051la.n(MBConfiguration.class, strIntern);
        f14835X = (f14834W + 3) % 128;
        return strN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0053  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 3630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1223z4.w0(java.lang.String):java.lang.Class");
    }
}
