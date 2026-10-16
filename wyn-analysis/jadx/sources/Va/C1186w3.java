package Va;

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
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionData;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: Va.w3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1186w3 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14726R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f14727S;

    /* renamed from: T, reason: collision with root package name */
    public static int f14728T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14729U = 1;

    static {
        char[] cArr = new char[1642];
        R8.v.k("\u0000A¦ÒM\u0013ôd\u009a²A\u0011èC\u008e¤5ÁÜT\u0082\u0081)àÐ4v\u0095\u001dÒm»Ë7 ê\u0099\u0098÷N,ö\u0085®ãUX\u001f\u0003X¥ÄN\u0015÷\u007f\u0099©B\u0004ëW\u008d§6þßY\u0081º*èÓ/u\u0082\u001eÍÇ\"ho\u0012Ò\u0000c¦ßM\rô>\u009a©A\u0002èO\u008e¾5óÜ_\u0082\u0095)âÐ#v\u0095\u001d\u008eÄ#kd\u0011Û¸N_s\u0005¯¬\u001eSTù¢ ïG\\í\u008c\u0094õ;2áÞ\u0088ã/?Ön|Ä#\u0012Ê\u007fp¬\u0017\u001c¾Ed¢\u000bÁ²SX\u0094ÿù¦6L\u0099óÔ\u009a)\u0000I¦ÞM\u0014ôu\u009a²A\u0003èT\u008e¹5ôÜY\u0082\u0081)üÐ\u0001v\u0093\u001dÔÄ9kv\u0011Ù¸\u0014_i\u0000c¦ßM\rô>\u009a©A\u0002èO\u008e¾5óÜ_\u0082\u0095)âÐ#v\u0095\u001d\u008eÄ#kd\u0011Û¸N_s\u0005¯¬\u001eSTù¢ ïG\\í\u008c\u0094õ;2áÞ\u0088é/>Öt|Õ#\u0012Êcp´\u0017\u0019¾Td¹\u000bá²\\X¡ÿó¦4L\u0099óÖ\u009a9AtçÉÅ\u0098c\u0017\u0088Ò1©_B\u0084Õ-\u009bKFð4\u0019\u0093G^ì1\u0015þ³SØ\u000e\u0082\u00ad$\u0011ÏÃvð\u0018gÃÌj\u0081\fp·=^\u0091\u0000[«,Ríô[\u009f@Fíéª\u0093\u0015:\u0080Ý½\u0087a.ÐÑ\u009a{l\"!Å\u0092oB\u0016;¹üc\u0010\n!\u00adîT«þ\u0010¡ûH¬òb\u0095ÿ<\u008dæj\u0089'0\u0088ÚG}*$÷¬\n\n\u0081áLX=6Ðí\\D\u0016\"á\u0099 p\u0016.á\u0085²|mÚÝ±\u0086haÇ\u000f½\u0092\u0014Zó<©ö\u0000G;¨\u009d\u0014vÆÏõ¡bzÉÓ\u0084µu\u000e8ç\u0094¹^\u0012)ëèM^&EÿöP®*\u001f\u0083Âdº>\u007f\u0097Òh\u0084Âu\u009b8|\u009fÖ@¯u\u0000ÂÚI³\u0004\u0014õí\u0098G\u0014\u0018Þñ©Kh,Þ\u0085©_z0%\u0089\u0095cNÄ)\u009dÇwZÈ\u0012¡ôz¾Ü\u000f\u0092À4Sß\u008cfü\b'Ó\u0080zñ\u001c?§cNÁ\u0010\n»^B«ä\u0001\u008fVV·ùì\u0083W*\u0090M,ë§\u0000j¹\u001b×ö\fz¥0ÃÇx\u0086\u00910í¿K+ æ\u0019\u0094wS¬õ\u0005¥cOØ\u00191¨oRÄ\u0007=Â\u009bg\u0000I¦ÝM\u0010ôb\u009a¥A\u0003èS\u008e¹5ïÜ^\u0082¤)ñÐ4v\u0091\u001dìÄ9ks\u0011Ä¸\u0005_~\u0005¥¬\u0002CpåÐ\u000e\u0016·eÙ\u0090\u0002\u0012«}Í\u0081vÃ\u0000c¦ßM\rô>\u009a¡A\u001dèA\u008eª5ïÜ^\u0082Î)ôÐ%v\u0086\u001dÉÄ3ke\u0011\u009e¸\u0001_t\u0005³¬^Sdù\u0084 ÂGqí\u0084\u0094Æ;)á\u0095\u0088×\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜr\u0082\u0081)þÐ.v\u0095\u001dÒÄ\u001cki\u0011Ã¸\u0014_u\u0005®¬\u0015SR\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜy\u0082\u008e)äÐ%v\u0082\u001dÓÄ$ki\u0011Ä¸\t_q\u0005¬¬<SIù£ ôGUí\u008e\u0094õ;2ø0^©µj\f\tbÐ¹\\\u00100vÍÍ\u0085$\u001ezùÑ\u009b(]\u008eþå¸<I\u0093\u0018é\u009a@u§\býÙTc«\u001d\u0001ÙX\u0088¿#\u0015ñl\u008dÃH\u0019åp¿×`.\u0015\u0084¿Ûh2\t\u0088ÒïiF.\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜb\u0082\u0085)çÐ!v\u0082\u001dÄÄ5kd\u0011æ¸\t_t\u0005¥¬\u001fSlù¹ óGDí\u0085\u0094þ;%á\u0082\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜb\u0082\u0085)çÐ!v\u0082\u001dÄÄ5kd\u0011æ¸\t_t\u0005¥¬\u001fSmù± îGEí\u0081\u0094ü;\fá\u0099\u0088Ó/$Öe|Þ#\u0005Êb\u0000A¦ÔM)ô~\u009a¦A\u001f\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜ~\u0082\u0081)äÐ)v\u0086\u001dÅÄ\u0011kd\u0000N¦ÑM\u0014ôy\u009a¶A\u0015èa\u008e´5ÌÜQ\u0082\u0099)ÿÐ5v\u0084\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜ~\u0082\u0081)äÐ)v\u0086\u001dÅÄ\u0011kd\u0011ü¸\t_c\u0005´¬\u0015SNùµ ò_òùk\u0012¨«ËÅ\u0012\u001e\u009e·òÑ\u000fjG\u0083ÃÝ;vJ\u008f\u0097)/BH\u009b\u00874ÛNy\u0000A¦ÔM\u0001ô`\u009a´A\u0015èR\u008e\u009e5áÜD\u0082\u0089)æÐ%v±\u001dÄÄ\u0014ka\u0011Ä¸\u0001 \u000f\u0086\u0090mUÔ8º÷aTÈ ®õ\u0015\u0097ü\u0018¢Ä\t¦ðIVÞ=\u008däuK$1\u0083×$q³\u009ay#\u0018Mß\u0096s?,YÑâ£\u000b<Uùþ\u0094\u0007[¡øÊ\u008c\u0013Y¼!Æ´o~\u0088\tÒÈ{s\u0084(.Ï\u0000N¦ÑM\u0014ôy\u009a¶A\u0015èa\u008e´5ÁÜT\u0082\u0081)àÐ4v\u0095\u001dÒÄ\u0019kn\u0011Ä¸\u0005_b\u0005¦¬\u0011SCùµ\u0000N¦ÑM\u0014ôy\u009a¶A\u0015èa\u008e´5ÄÜQ\u0082\u0094)ñÐ\tv\u009e\u001dÔÄ5kr\u0011Ö¸\u0001_s\u0005¥)\u0080\u008f\u001fdÚÝ·³xhÛÁ¯§z\u001c\u0007õ\u0090«Z\u0000;ùü__4\ríêB§8\u0011\u0091Àv\u0092,g\u0085Íz\u009aÐ{\u0089 n\u009bÄ\\³©\u00156þóG\u009e)Qòò[\u0086=S\u0086.o¹1s\u009a\u0012cÕÅq®&wÔØ\u0082æ\u009b@\u0004«Á\u0012¬|c§À\u000e´haÓ\u0019:\u008adTÏ!6Ù\u0090Lû\u0006\"ñ\u008d°÷\u000b^Ð¹·2ã\u0094|\u007f¹ÆÔ¨\u001bs¸ÚÌ¼\u0019\u0007~îð°,\u001bNâ\u0085D\u0011/dö\u008eYÙ#x\u008a£mØ7\u001f\u0000N¦ÑM\u0014ôy\u009a¶A\u0015èa\u008e´5ÖÜY\u0082\u0085)çÐ\u0002v\u0099\u001dÎÄ4ke\u0011Â¸)_~\u0005´¬\u0015SRù¶ áGSí\u0085Á\u0011g\u0084\u008ct5![ä\u0080A\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜq\u0082\u0084)ÙÐ.v\u0096\u001dÏ\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜr\u0082\u0081)þÐ.v\u0095\u001dÒÄ\u0011kd\u0011æ¸\t_u\u0005·Ç\u0094a(\u008aú3É]B\u0086é/¾ISò\u000e\u001bôEsîI\u0017Ú±bÚ3\u0003Î¬\u0096Ö3\u007fþ\u0098\u0088ÂYk©\u0094µ>Fg\u0019\u0080©*rS\u0015ü\u0099&KO2èÑ\u0011\u0092»+äÇ\r\u008b·VÐþy\u0095£FÌ\u0019u©\u009fr8\u0015aö\u008bc4\u0001]Î\u0086\u0092 0\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜr\u0082\u0081)þÐ.v\u0095\u001dÒÄ\u0011kd\u0011æ¸\t_u\u0005·¬<SIù£ ôGUí\u008e\u0094õ;2ô)R¢¹o\u0000\u001enóµ\u007f\u001c5zÂÁ\u0083(5vÁÝ\u0094$S\u0082Öé¯0B\u009f\rå±Lt\u0000B¦ÑM\u000eô~\u009a¥A\u0002èa\u008e´5ÉÜ^\u0082\u0086)ÿ\u0000B¦ÑM\u000eô~\u009a¥A\u0002èa\u008e´5ÒÜU\u0082\u0091)åÐ%v\u0083\u001dÔ\u0000B¦ÑM\u000eô~\u009a¥A\u0002èa\u008e´5ÖÜY\u0082\u0085)ç\u0000c¦ßM\rô>\u009aµA\u001eèI\u008e¤5ùÜ\u0003\u0082\u0084)¾Ð)v\u0082\u001dÏÄ>ks\u0011ß¸\u0015_b\u0005£¬\u0015SAù´ óG\u001eí\u0082\u0094ñ;.á\u009e\u0088Å/\"Ö.|ò#\u0001Ê~p®\u0017\u0015¾Rd\u0091\u000bä²fX\u0089ÿõ¦7\u001c§º4Qëè\u009b\u0086@]çô\u0084\u0092Q)3À¼\u009e`5\u0002Ìéj|\u00016ØÁw\u0080\r;¤àC\u0087\u0000I¦ÞM\u0014ôu\u009a²A\u0003èT\u008e¹5ôÜY\u0082\u0081)üÐ\u0001v\u0094±\f\u0017\u009büQE0+÷ðFY\u0011?ü\u0084±m\u001c3Ä\u0098¹aDÇÑ¬¬u{Ú# \u009a\u0000I¦ÞM\u0014ôu\u009a²A\u0003èT\u008e¹5ôÜY\u0082\u0081)üÐ\u0001v\u0094\u001dìÄ9ks\u0011Ä¸\u0005_~\u0005¥¬\u0002õJSÝ¸\u0017\u0001vo±´\u0000\u001dW{ºÀ÷)Zw\u0082Üÿ%\u0002\u0083\u0097èñ16\u009eräÆM\u0006ª`ð·\u0000R¦ÕM\u0017ôq\u009a²A\u0014èE\u008e´5ÁÜT\u0000R¦ÕM\u0017ôq\u009a²A\u0014èE\u008e´5ÁÜT\u0082©)þÐ&v\u009fàvFñ\u00ad3\u0014Uz\u0096¡0\ban\u0090Õå<pb\u0088ÉÝ0\u0017\u0096 ýá$\u001a\u008bAñæ\u0000R¦ÕM\u0017ôq\u009a²A\u0014èE\u008e´5ÁÜT\u0082²)õÐ1v\u0085\u001dÅÄ#kt}.Û·0t\u0089\u0017çÎ<B\u0095.óÓH\u009b¡\u001bÿìT\u0086\u00adG\u000bà`±¹F\u0016\u000bl¦Åk\"\u0013xÎÑS.&\\nú÷\u00114¨WÆ\u008e\u001d\u0002´nÒ\u0093iÛ\u0080[Þ¬uÆ\u008c\u0007* Añ\u0098\u00067KMæä+\u0003SY\u008eð\u0013\u000ff¥¾üË\u001ba±¶È×g\f½·Ôð\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜb\u0082\u0085)çÐ!v\u0082\u001dÄÄ5kd\u0011ñ¸\u0004w;Ñ¢:a\u0083\u0002íÛ6W\u009f;ùÆB\u008e«\u0015õò^\u0090§V\u0001õj³³B\u001c\u0013f\u0086Ïs(+rÞÛt$#\u008eÂ×\u00990\"\u009aål¶Ê/!ì\u0098\u008föV-Ú\u0084¶âKY\u0003°\u0098î\u007fE\u001d¼Û\u001axq>\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜy\u0082\u008d)àÐ2v\u0095\u001dÓÄ#ki\u0011ß¸\u000e_T\u0005¡¬\u0004SA\u0000L¦ÕM\u0016ôu\u009a¬A èL\u008e±5ùÜy\u0082\u008d)àÐ2v\u0095\u001dÓÄ#ki\u0011ß¸\u000e_T\u0005¡¬\u0004SAù\u009c éGCí\u0094\u0094õ;.á\u0095\u0088ÒÔ\u008fr=\u0099ü ¨ND\u0095ù<«Z]á\u0005\b½Vfý\f\u0004æ¢yÉ%\u0010Ý\u0000g¦ÕM\u0014ôR\u009a¡A\u001eèN\u008eµ5òÜ|\u0082\u0081)éÐ/v\u0085\u001dÔÄ\u0000kl\u0011Ñ¸\u0003_u\u0005\u00ad¬\u0015SNù¤ ÎGQí\u008d\u0094õ\u0000g¦ÕM\u0014ôY\u009a\u00adA\u0000èR\u008eµ5óÜC\u0082\u0089)ÿÐ.v´\u001dÁÄ$ka\u0011ú¸\u0013_\u007f\u0005®¤Ø\u0002mé½Pà>\u0014å¹Lë*\f\u0091Jxú&0\u008dFt\u0097Ò\r¹x`\u009dÏØµE\u001c°ûÚ¡\r\b¬÷÷]\f\u0004K\u0003\u0003¥¤N|÷\u000e\u0099ÇBdë\u0018\u008dÌ6\u0081ß3\u0081ô*\u0092ÓBuè\u001e¾ÇOh5\u0012 »e\\\u0000\u0006ý¯hP\"úÕ£\u0094D/îô\u0097\u0093\u0000g¦ÕM\u0014ô\\\u009a¥A\u0006èE\u008e¼5ÐÜ\\\u0082\u0081)éÐ\tv\u009d\u001dÐÄ\"ke\u0011Ã¸\u0013_y\u0005¯¬\u001eSdù± ôGQíª\u0094ã;/á\u009e±¾\u0017\u000büÛE\u0083+zðÙY\u009a?c\u0084\u000fm\u00833^\u00986aÖÇB¬\u000fuýÚº \u001c\tÌî¦´p\u001dÁâ³Hf\u0011,ö\u009b\\Z%!\u008aúP]\u0000r¦ÕM\rô\u007f\u009a¶A\u0015èl\u008eµ5öÜU\u0082\u008c)ÀÐ,v\u0091\u001dÙÄ\u0019km\u0011À¸\u0012_u\u0005³¬\u0003SIù¿ îG|í\u0089\u0094ã;4á\u0095\u0088Î/5Örl\u0094Ê2!ó\u0098¹öF-ã\u0084®âAY\u0002°\u0096îcE;¼Î\u001adq3¨Ò\u0007\u0089}2Ôõ\u0093\u001f5\u00adÞlg;\tÝÒz{.\u001dÍ¦\u008aO\f\u0011ùº\u009cCY", "ISO-8859-1", cArr, 0, 1642);
        f14726R = cArr;
        f14727S = -3347799044470036816L;
    }

    public static JSONObject C0(LevelPlayImpressionData levelPlayImpressionData) {
        int i5 = f14728T + 49;
        f14729U = i5 % 128;
        if (i5 % 2 == 0) {
            levelPlayImpressionData.getAllData();
            throw null;
        }
        JSONObject allData = levelPlayImpressionData.getAllData();
        f14729U = (f14728T + 29) % 128;
        return allData;
    }

    public static String D0(AdData adData) {
        f14729U = (f14728T + 65) % 128;
        String serverData = adData.getServerData();
        int i5 = f14729U + 75;
        f14728T = i5 % 128;
        if (i5 % 2 == 0) {
            return serverData;
        }
        throw null;
    }

    public static void E0(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        f14729U = (f14728T + 57) % 128;
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        f14728T = (f14729U + 67) % 128;
    }

    public static String F0(Placement placement) {
        if (placement == null) {
            int i5 = f14728T + 73;
            f14729U = i5 % 128;
            if (i5 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i10 = f14729U + 69;
        f14728T = i10 % 128;
        if (i10 % 2 == 0) {
            return placement.getPlacementName();
        }
        placement.getPlacementName();
        throw null;
    }

    public static void G0(ImpressionDataListener impressionDataListener) {
        f14729U = (f14728T + 7) % 128;
        IronSource.removeImpressionDataListener(impressionDataListener);
        int i5 = f14729U + 85;
        f14728T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 65 / 0;
        }
    }

    public static void H0(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        int i5 = f14728T + 81;
        f14729U = i5 % 128;
        int i10 = i5 % 2;
        LevelPlay.removeImpressionDataListener(levelPlayImpressionDataListener);
        if (i10 == 0) {
            int i11 = 71 / 0;
        }
        int i12 = f14729U + 23;
        f14728T = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static void I0(LevelPlayNativeAd levelPlayNativeAd, LevelPlayNativeAdListener levelPlayNativeAdListener) {
        int i5 = f14729U + 109;
        f14728T = i5 % 128;
        int i10 = i5 % 2;
        levelPlayNativeAd.setListener(levelPlayNativeAdListener);
        if (i10 != 0) {
            int i11 = 31 / 0;
        }
    }

    public static void J0(ImpressionDataListener impressionDataListener) {
        int i5 = f14728T + 7;
        f14729U = i5 % 128;
        int i10 = i5 % 2;
        IronSource.addImpressionDataListener(impressionDataListener);
        if (i10 == 0) {
            throw null;
        }
        f14728T = (f14729U + 29) % 128;
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
                        cArr[i11] = (char) ((f14726R[i5 + i11] ^ (i11 * f14727S)) ^ c10);
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

    public static String L0(IronSourceBannerLayout ironSourceBannerLayout) {
        int i5 = f14729U + 61;
        f14728T = i5 % 128;
        if (i5 % 2 == 0) {
            return ironSourceBannerLayout.getPlacementName();
        }
        ironSourceBannerLayout.getPlacementName();
        throw null;
    }

    public static JSONObject M0(ImpressionData impressionData) {
        int i5 = f14729U + 119;
        f14728T = i5 % 128;
        int i10 = i5 % 2;
        JSONObject allData = impressionData.getAllData();
        if (i10 != 0) {
            int i11 = 2 / 0;
        }
        f14729U = (f14728T + 121) % 128;
        return allData;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(K0(1399 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, (char) (ExpandableListView.getPackedPositionGroup(0L) + 54504)).intern(), new C1083o3());
        map.put(K0(View.MeasureSpec.getMode(0) + 1415, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 27, (char) TextUtils.getCapsMode("", 0, 0)).intern(), new C1109q3());
        map.put(K0((ViewConfiguration.getWindowTouchSlop() >> 8) + 1443, Process.getGidForName("") + 22, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).intern(), new C1096p3());
        map.put(K0(1464 - View.getDefaultSize(0, 0), 25 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (42169 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern(), new C1121r3());
        map.put(K0(TextUtils.lastIndexOf("", '0', 0) + 1490, 27 - Process.getGidForName(""), (char) (TextUtils.getCapsMode("", 0, 0) + 881)).intern(), new C1134s3());
        map.put(K0(1518 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 30 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) TextUtils.indexOf("", "", 0)).intern(), new C1173v3());
        map.put(K0(1546 - TextUtils.indexOf((CharSequence) "", '0', 0), 30 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 45536)).intern(), new C1057m3());
        map.put(K0(1577 - KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getSize(0) + 33, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern(), new C1160u3());
        map.put(K0(View.getDefaultSize(0, 0) + 1610, 19 - Color.alpha(0), (char) (MotionEvent.axisFromString("") + 27880)).intern(), new C1147t3());
        map.put(K0(1630 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 13 - Gravity.getAbsoluteGravity(0, 0), (char) (37752 - (ViewConfiguration.getTapTimeout() >> 16))).intern(), new C1070n3());
        int i5 = f14728T + 11;
        f14729U = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    @Override // Va.Z0
    public final String t0() {
        f14728T = (f14729U + 51) % 128;
        try {
            try {
                String sdkVersion = LevelPlay.getSdkVersion();
                f14729U = (f14728T + 63) % 128;
                return sdkVersion;
            } catch (Throwable unused) {
                return IronSourceUtils.getSDKVersion();
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ae  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1186w3.w0(java.lang.String):java.lang.Class");
    }
}
