package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class P6 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f13593R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f13594S;

    /* renamed from: T, reason: collision with root package name */
    public static int f13595T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f13596U = 1;

    static {
        char[] cArr = new char[1281];
        R8.v.k("\u0080Ó\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\u0015\u00ad\u0006ùùEÌ\u0091\u0099ÞI*Tv+\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\t\u00ad=ùþEÑ\u0091\u0094Þq*qv<Âó\u000eäZ¹¦\u008bóT?-\u008b\u001e×ý#²ÆD\u008aW^(\"\u001döÈº\u0098\u000e\u0085Óz§\u0018k,?ï\u0083ÀW\u0085\u0018`ì`°-\u0004âÈü\u009c¹`\u009d5Tù7M\u0005\u0011ìåµ©µzhÎZ\u0092\u0005fü*Ïþ¬Cc\r\u001bA\b\u0095wéB=\u0097qÇÅÚ\u0018%lY Cô¼H \u009cÇÓ#'\t{WÏ¾\u0003\u0096Q\u000b\u001d5ÉXµBa\u009d-Á\u0099ÆD\"0hüv¨¿\u0014\u0097\u0000WLM\u00982ä*0Å|¹È\u0085\u0015}a3\u00ad\u001cùÕEÎ\u0091\u0085Þf*DQ\u0003\u001d\u0019Éfµza\u009d-ù\u0099ÓD\t0büY¨ª\u0014\u0098À÷\u008f={\u0010'i\u0093³_\u0093\u000bö÷Õ\u0000ULF\u00989ä\f0Ù|\u0085È\u009f\u0015va%\u00ad\u001cùùEÂ\u0091\u0081Þ|*Yv7ÂîÛz\u0097iC\u0016?&ëÈ§\u0085\u0013\u0095ÎXº\u001av5\"Ü\u009eÿJ¬\u0005SñX\u00ad\u0015\u0019ÈÕñ\u0081\u008d}´({þæ²øf\u0086\u001a©Îj\u0082\u00006\u0010ëË\u009f\u0080S£\u0007A\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\u0017\u00ad\rùòEî\u0091\u0089Þm*GÕd\u0099~M\u00011\u0019åö©\u008a\u001d¶ÀN´\u0000x/\u008d¾Á³\u0015úié½6ñCEN\u0098\u0084ìË þt\u0019È.\u001ckS\u008e\u0000BLI\u0098>ä\u00160Å|º\u0000ULF\u00989ä\f0Ù|\u008aÈ\u0091\u0015va.\u00ad\rùâEË\u0000ULF\u00989ä\f0Ù|\u008aÈ\u0091\u0015va.\u00ad\rùâEë\u0091\u0089Þr*U \u009aì\u00918æDÎ\u0090\u001dÜbh{µ¨Á÷\rÇ\u0084ãÈè\u001c\u009f`·´dø\u001bL\u0019\u0091Ðå\u0085)¬Ï[\u0083PW'+\u000fÿÜ³£\u0007¬Úw®<b\u001f6ý\u0000BLI\u0098>ä\u00160Å|ºÈ¼\u0015qa3\u00ad\u001cùõEÖ\u0091\u0085Þz\u0000BLI\u0098>ä\u00160Å|ºÈ\u0083\u0015Ua/\u00ad\fùåEÔ\u0091\u0085ÞK*_v6Âæ\u000eÁZ·¦\u008dóR?)\u008b\u0004×ñ#¯o\u0086\u0000BLI\u0098>ä\u00160Å|ºÈ \u0015ja/\u00ad\u0018ùõEÊ\u0091\u0094Þa*Uv+\u0000BLI\u0098>ä\u00160Å|ºÈ \u0015wa3\u00ad\u0001ùäEÑ\u0091\u008fÞf\u0000BLI\u0098>ä\u00160Å|ºÈ§\u0015}a\"\u00ad8ùüEÙ\u0091\u0099Þm*Bv\u001bÂï\u000eÆZ¤¦\u0099óI?&\u008b\u0015×êò\u0016¾\u001djj\u0016BÂ\u0091\u008eî:áç>\u0093f_S\u000b¶·¯cÛ,8Ø\u0001\u0000BLI\u0098>ä\u00160Å|ºÈµ\u0015ja2\u00ad\u0007ùâEñ\u0091\u008eÞn*_\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001f\u0000cLG\u0098=äV0Õ|¦È\u0099\u0015la9\u00ad[ùôE\u0096\u0091\u0093Þm*Bv.Âé\u000eËZµ¦\u008bó\u000e?*\u008b\u0011×ö#®o\u008d¼b\bKTN ÊìÑ8¶\u0085nÑM\u001d\"i.µÉ\u0001\u00adM\u0087\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùÓEÙ\u0091\u0083Þ`*U\u0000IL}\u0098>ä\u00110Ô|±È²\u0015ya.\u00ad\u0006ùõEÊ\u0091¬Þa*Cv,Âå\u000eÆZµ¦\u008a\u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùÙEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢Å¸\u0089³]Ä!ìõ?¹@\r\\Ð\u008b¤ßhå<&\u0080+Ti\u001b\u0086ï¯³Ì\u0007\u001fË \u0000BLI\u0098>ä\u00160Å|ºÈ¦\u0015qa%\u00ad\u001fùßEÔ\u0091\u0084\u0000cLG\u0098=äV0Õ|¦È\u0099\u0015la9\u00ad[ùôE\u0096\u0091\u0093Þm*Bv.Âé\u000eËZµ¦\u008bó\u000e?*\u008b\u0011×ö#®o\u008d¼b\bKTN þìÙ8½\u0085wÑ\u0006\u001d\u0012i\u0019µÎ\u0001¦M\u0095\u009ajæ\u00162\u0001~õÊÏ\u0000FL]\u0098<ä\u00140Ó|«È\u0082\u0015}a%\u00ad\u0006ùÇEÝ\u0091\u0082Þ^*Yv=Â÷\u000eìZ¹¦\u008bóP?$\u008b\u0011×áRß\u001eûÊ\u0081¶êbi.\u001a\u009a%GÐ3\u0085ÿç«H\u0017*Ã=\u008cÐxÿ$Ê\u0090]\\p\b\u001cô(¡ým\u008dÙ©\u0085VqR=\u0012îÙZè\u0006°òg¾oj\u0016×Ù\u0083ñO\u0082;\u0093çyS\u0016\u001f\u001aÈÍ´\u0099`£,h\u0098mD/1Äýà©\u0085\u0015E¶úú÷.¤R¡\u0086qÊ\u0016~(£×;³w´£Æßø\u000b=GSóf.¬ZÇ\u0096öÂ\u000e~9ªqå\u0088\u0011§MÏù\u001c5\raG\u009dhÈ\u0084\u0004Ó°çì\u001d\u0018sT~\u0087²3¦oó\u009b\u0003×'\u0003X\u0000ULF\u00989ä\f0Ù|\u0089È\u0094\u0015ka\f\u00ad\u0007ùñEÜ\u0091¯Þx*Dv1Âï\u000eÆZ£Wå\u001böÏ\u0089³¼gi+9\u009f$BÛ6²ú¹®S\u0012mÆ\u001f\u0089È}ô!\u0081\u0095_Yv\r\u0013\u009eðÒý\u0006§z¦®câ\u0014V \u008bÝÈ\u0015\u0084\u0012Po,Kø\u0098´ê\u0000öÝ<©yeN1£\u008d\u009cYÂ\u00167â\u0003¾}µHùM-=Q\u0013\u0085ÂÉ«}\u008f `Ô%\u0018\u0007LÙðÂ$\u0089kj\u009fH\u001fÙSí\u0087®û\u0081/Dc!×!\nì~£²«æhZG\u008e\u0007ÁÔ5Éi»Ýd\u0011]E.¹\rìÂû\u008c·¦cÏ\u001fÐË>\u0087Q3iî\u0096\u009aÅV÷\u0002,¾6ji%µÑ²\u008dÖ9\u001cõ\u0002¡K]c\u0000cLZ\u00985ä\u00190Ô|\u00adÈ¤\u0015Za\u0017\u00ad\rùòEî\u0091\u0089Þm*Gv\u0019Âð\u000eØ7({\u0016¯\u007fÓ`\u0007\u008eKáÿÙ\"&Vu\u009aGÎ\u009cr\u0086¦Ùé\u0005\u001d\u0002Afõ¬9²mû\u0091ÓH[\u0004qÐ\u0018¬\u0003xý4\u0099\u0080©]m)\u0018C\u0082\u000f¨ÛÁ§Ès+?D\u008baV\u0084\"äîéº\u0006\u0006\u0011Òl\u009d\u009ei¡5Ø\u0081\u000bM(\u0019G\u0000sLM\u0098$ä-0Î|¡È\u0084\u0015aa\u0001\u00ad\fùãEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢\u0000aLL\u00984ä-0Î|¡È\u0084\u0015aa\u0001\u00ad\fùãEô\u0091\u0089Þ{*Dv=Âî\u000eÍZ¢, `\u001f´oÈE\u001c\u0084Pÿä÷9$M{\u0081NÕ»i«½Öò)\u0006.Zcî¡\"\u008evç\u008aÄß\u0017\u0013h$`hJ¼#À(\u0014ÂX\u00adì¡1vE\"\u0089\u0018ÝÒaÉµ\u0082úa\u000eCR\u001cææ*Û~²\u0082\u0098×H\u001b=¯\u000ek\"'\bóa\u008fj[\u0080\u0017ï£ç~8\ntÆX\u0092°.\u008eúÑµ\bA\u0003\u001dx©«e\u0099\u0000gLM\u0098$ä(0Ì|©È\u0093\u0015}a-\u00ad\rùþEÌ\u0091©ÞlGï\u000bÅß¬£²wI;.\u008f\u0016Rõ&ºê¬¾q\u0002CÖ\u001c\u0099åmÖ1µ\u0085zr8>\u0006êo\u0096qB\u008a\u000eíºÕg6\u0013yßo\u008b²7\u0080ãß¬&X\u0015\u0004v°¹ý)±\u0003ej\u0019yÍ\u009e\u0081ö5Ñè$\u009czPS\u0004°¸\u009flÚ#?×7\u008br\u0085\u0002É(\u001dAaMµ©ùÌMö\u0090\u0018äH(h|\u009bÀ©\u0014Ì[\t¯\u0013óOG\u008a\u008b ßô#ùv\nºO\u000e\u007fR\u0098¦Æêù\u001fìSÆ\u0087¯û¿/Dc\"×\u001f\nÜ~»²\u0097ærZ\\\u008e\u0005Áð\u001b9W\u0013\u0083zÿb+\u009fgâÓÏ»(÷\u0002#k_p\u008b\u008eÇêsÚ®\u001eÚk\u0016aB\u00adþ\u0098*Âe\u0004\u0091\u0013Í~yªµ\u0089áë\u001dçH\u001d\u0084h0Ol²\u0098ýÔÓ\u00076³\u0012ï\\\u009c\rÐ'\u0004NxB¬¦àÃTù\u0089\u0017ýG1ge\u0094Ù¦\rÃB\u0006¶\u001cê@^\u0085\u0092¯Æþ:ûo+£E\u0017tK\u009d¿Ùóö \u0013\u00941ÈO<\u0094p¿¤Ü\u0019\u001e\u0000gLM\u0098$ä+0Ô|ºÈ\u0099\u0015va'\u00ad<ùñEß\u0091\u0093èâ¤Èp¡\f©ØW\u0094, \u0016ýö\u0089¬E\u0083\u0011r\u00adiy\n6æÂÐ\u009e³¶Zúw.\u001eR-\u0086òÊ\u0087\u0086!Ê\u0016\u001ecbJ¶\u0098úïNË\u0093.çn+Z\u007fµ\u0000RLm\u0098\u0001ä-0å|\u009bÈ¤\u0000RLm\u0098\u0003ä70ì|\u009eÈµ¤Ñèû<\u0081@¢\u0094w\u0091ËÝï\t\u0096u¾¡mí\u0003Y,\u0084Ùð\u009e<©hLÔi\u0000SL|\u0098\u001fä*0á|\u008fÈµ§±ë\u0089?ìCÊ\u0097\u0017ÛxoB²¸Æç\t\u0080E\u00ad\u0091Úíñ9/u]Á\u007f\u001c\u0098hÉ\u0000CLg\u0098\u001dä(0ì|\u008dÈ¤\u0015]\u0018FTi\u0080\u0019ü4(åd\u008c", "ISO-8859-1", cArr, 0, 1281);
        f13593R = cArr;
        f13594S = -7554200149052339160L;
    }

    public static Object C0() {
        f13596U = (f13595T + 55) % 128;
        IUnityAdsListener listener = UnityAds.getListener();
        int i5 = f13596U + 43;
        f13595T = i5 % 128;
        if (i5 % 2 == 0) {
            return listener;
        }
        throw null;
    }

    public static String D0() {
        String gameId;
        int i5 = f13595T + 111;
        f13596U = i5 % 128;
        if (i5 % 2 == 0) {
            gameId = ClientProperties.getGameId();
            int i10 = 14 / 0;
        } else {
            gameId = ClientProperties.getGameId();
        }
        int i11 = f13595T + 5;
        f13596U = i11 % 128;
        if (i11 % 2 != 0) {
            return gameId;
        }
        throw null;
    }

    public static void E0(IUnityAdsListener iUnityAdsListener) {
        f13596U = (f13595T + 59) % 128;
        UnityAds.removeListener(iUnityAdsListener);
        f13595T = (f13596U + 99) % 128;
    }

    public static String F0(AdObject adObject) {
        int i5 = f13595T + 1;
        f13596U = i5 % 128;
        if (i5 % 2 == 0) {
            adObject.getPlacementId();
            throw null;
        }
        String placementId = adObject.getPlacementId();
        int i10 = f13596U + 95;
        f13595T = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 68 / 0;
        }
        return placementId;
    }

    public static UnityAdsLoadOptions G0(AdObject adObject) {
        f13596U = (f13595T + 101) % 128;
        UnityAdsLoadOptions loadOptions = adObject.getLoadOptions();
        int i5 = f13596U + 7;
        f13595T = i5 % 128;
        if (i5 % 2 == 0) {
            return loadOptions;
        }
        throw null;
    }

    public static String H0(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        int i5 = f13595T + 91;
        f13596U = i5 % 128;
        if (i5 % 2 == 0) {
            diagnosticEvent.getPlacementId();
            throw null;
        }
        String placementId = diagnosticEvent.getPlacementId();
        f13596U = (f13595T + 59) % 128;
        return placementId;
    }

    public static String I0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13593R[i5 + i11] ^ (i11 * f13594S)) ^ c10);
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

    public static void J0(IUnityAdsListener iUnityAdsListener) {
        f13596U = (f13595T + 35) % 128;
        UnityAds.setListener(iUnityAdsListener);
        f13595T = (f13596U + 3) % 128;
    }

    public static void K0(IUnityAdsListener iUnityAdsListener) {
        f13596U = (f13595T + 65) % 128;
        UnityAds.addListener(iUnityAdsListener);
        int i5 = f13595T + 5;
        f13596U = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 81 / 0;
        }
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(I0((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 805, 20 - View.MeasureSpec.getSize(0), (char) (64491 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern(), new N3(18));
        String strIntern = I0(Color.red(0) + 825, 18 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
        C1208y1 c1208y1 = new C1208y1(3);
        c1208y1.f14801b = this;
        map.put(strIntern, c1208y1);
        map.put(I0(843 - (KeyEvent.getMaxKeyCode() >> 16), 20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (14171 - KeyEvent.getDeadChar(0, 0))).intern(), new N3(11));
        map.put(I0((Process.myPid() >> 22) + 863, 9 - TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 18492)).intern(), new N3(13));
        map.put(I0(872 - (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 19, (char) (17381 - View.combineMeasuredStates(0, 0))).intern(), new N3(14));
        map.put(I0(891 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 18 - ExpandableListView.getPackedPositionChild(0L), (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), new J6());
        map.put(I0(TextUtils.indexOf((CharSequence) "", '0', 0) + 911, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1)).intern(), new I6());
        map.put(I0(929 - View.MeasureSpec.makeMeasureSpec(0, 0), 22 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 11346)).intern(), new L6());
        map.put(I0(951 - TextUtils.indexOf("", ""), 23 - ExpandableListView.getPackedPositionGroup(0L), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9222)).intern(), new N3(15));
        map.put(I0(975 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (27462 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), new N3(17));
        map.put(I0(992 - (ViewConfiguration.getEdgeSlop() >> 16), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 13, (char) View.resolveSize(0, 0)).intern(), new N3(16));
        map.put(I0(1006 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 17, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18313)).intern(), new N6());
        map.put(I0((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1023, TextUtils.indexOf((CharSequence) "", '0', 0) + 18, (char) (29260 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), new K6());
        map.put(I0(1040 - TextUtils.getOffsetAfter("", 0), 16 - View.combineMeasuredStates(0, 0), (char) (Color.blue(0) + 64846)).intern(), new N3(21));
        map.put(I0(Color.blue(0) + 1056, Gravity.getAbsoluteGravity(0, 0) + 26, (char) (View.getDefaultSize(0, 0) + 34149)).intern(), new N3(20));
        map.put(I0(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1083, 14 - TextUtils.getOffsetAfter("", 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8074)).intern(), new N3(10));
        map.put(I0(1096 - ((Process.getThreadPriority(0) + 20) >> 6), 6 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7006)).intern(), new N3(19));
        map.put(I0((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1103, 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 47951)).intern(), new N3(22));
        map.put(I0(1133 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 32, (char) (TextUtils.getOffsetBefore("", 0) + 40042)).intern(), new G6());
        map.put(I0((ViewConfiguration.getWindowTouchSlop() >> 8) + 1165, 13 - KeyEvent.normalizeMetaState(0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), new H6());
        map.put(I0(View.MeasureSpec.getMode(0) + 1178, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15, (char) (59525 - ExpandableListView.getPackedPositionGroup(0L))).intern(), new N3(12));
        f13596U = (f13595T + 111) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        return r0.split(I0(android.view.ViewConfiguration.getLongPressTimeout() >> 16, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, (char) (android.view.View.getDefaultSize(0, 0) + 33022)).intern())[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        Va.P6.f13595T = (Va.P6.f13596U + 67) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 != null) goto L9;
     */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t0() {
        /*
            r5 = this;
            int r0 = Va.P6.f13595T
            int r0 = r0 + 27
            int r1 = r0 % 128
            Va.P6.f13596U = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r0 = com.unity3d.ads.UnityAds.getVersion()
            r2 = 89
            int r2 = r2 / r1
            if (r0 == 0) goto L43
            goto L1d
        L17:
            java.lang.String r0 = com.unity3d.ads.UnityAds.getVersion()
            if (r0 == 0) goto L43
        L1d:
            r2 = 33022(0x80fe, float:4.6274E-41)
            int r3 = android.view.View.getDefaultSize(r1, r1)
            int r3 = r3 + r2
            char r2 = (char) r3
            int r3 = android.view.ViewConfiguration.getLongPressTimeout()
            int r3 = r3 >> 16
            int r4 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r4 = r4 >> 24
            int r4 = r4 + 1
            java.lang.String r2 = I0(r3, r4, r2)
            java.lang.String r2 = r2.intern()
            java.lang.String[] r0 = r0.split(r2)
            r0 = r0[r1]
            return r0
        L43:
            int r0 = Va.P6.f13596U
            int r0 = r0 + 67
            int r0 = r0 % 128
            Va.P6.f13595T = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.P6.t0():java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06c4  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 2144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.P6.w0(java.lang.String):java.lang.Class");
    }
}
