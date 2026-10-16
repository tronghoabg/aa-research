package Va;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.hyprmx.android.BuildConfig;
import com.hyprmx.android.sdk.api.data.Ad;
import com.hyprmx.android.sdk.api.data.OfferCacheEntity;
import com.hyprmx.android.sdk.api.data.WebTrafficObject;
import com.hyprmx.android.sdk.core.DependencyHolder;
import com.hyprmx.android.sdk.core.HyprMXController;
import com.hyprmx.android.sdk.model.PreloadedVastData;
import com.hyprmx.android.sdk.placement.PlacementController;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: Va.w2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1185w2 extends Z0 {

    /* renamed from: R, reason: collision with root package name */
    public static final char[] f14722R;

    /* renamed from: S, reason: collision with root package name */
    public static final long f14723S;

    /* renamed from: T, reason: collision with root package name */
    public static int f14724T = 0;

    /* renamed from: U, reason: collision with root package name */
    public static int f14725U = 1;

    static {
        char[] cArr = new char[1080];
        R8.v.k("\u0000Vå\u0005ÊÒ¯\u0093\u0095Iz\u000f_ÎD\u009f*N\u000f\u0001ôÍÙ\u0085\u0000^å\u001cÊä¯\u009b\u0095\\z$_®D\u009d*+\u000f\u001côäÙä²\fW}x´\u001dö'\tÈ\\\u0000Hå9Êð¯²\u0095Mz\u0018_ÃD¯*n\u000f4ôòÙ¯¿l¤,\u0089ån²\u0000På,Êá¯£\u0095ez-_åD®*t\u000f\u0014ôùÙ°¿e\u0000Aå$\u0098Â}£Rv7#\rèâ¢ÇcÜ(²å\u0097¿lNA)'ê<¢\u0011cö4íþ\b\u009c'KB\u0002xÁ\u0097\u008f²J©\u000bÇÊâ¸\u0019O4\u001dRÚIªdO\u0083\u001a¹Ï\u0000Hå9Êð¯²\u0095Mz\u0018_ÐD²*o\u000f0ôåÙ²¿t¤)\u0089ån³p<\u0095Mº\u0084ßÆå9\nl/£4ÑZ\u0016\u007fb\u0084\u009d©ÑÏ\u0003Ôcù\u009d\u001eÀ$\u001cIwn\u0098sÛ\u0099\u0007¾UÃ\u0096èØ\u000e\u0011\u0013z8\u0095]Âc6\u0088U\u00ad\u0086\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098§~rc!Hð-¨\u0013iø#ÝóÂî¨H\u008d9rðW²=M\"\u0018\u0007×ì¥Òb·\u0016\u009cé\u0081¥gwL\u00171é\u0016´ühá\u0003Æì«¯\u0091sv![â@¬&e\u000b\u000eðáÕ¶»B !\u0085ò\u0000Hå9Êð¯²\u0095Mz\u0018_ÎD¯*O\u000f&ôæÙ¥¿r¤3\u0089Án£Tt9)\u001eö\u0003©étÎ9ª¯Oã`!\u0005\"?¤Ðõõ<î~\u0080¡¥ô^bsm\u0015¢\u000eè#>Äcþ¥\u0093è´b©\u007fC¨dç\u0019b2mÔ¯Éøâ%\u0087z¹¥Røw5h\"\u0002\u0084'õØ<ý~\u0097\u0081\u0088Ô\u00ad\u0002Fcx\u0083\u001dê6*+iÍ¾æÿ\u009b\r¼oV¸Kål:\u0001e;¸Üõ\u0000Hå9Êð¯²\u0095Mz\u0018_ÏD¦*f\u000f%ôòÙ\u0096¿i¤%\u0089÷n¥Tr9\u0001\u001eã\u0003´éiÎ6³é\u0098´~y\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098¡~cc4Hé-¶\u0013iø4ÝùÂî¨H\u008d9rðW²=M\"\u0018\u0007Ïì¦Òf·%\u009cò\u0081\u0096giL%1÷\u0016¥ürá\u0001Æã«´\u0091iv6[é@´&y\u0000Hå9Êð¯²\u0095Mz\u0018_ÒD¥*q\u000f5ôéÙ²¿e¤$\u0089Én®Tf9/\u001eò\u0003\u00adéaÎ4³é\u0098¯~nc\u0001Hã-´\u0013iø6ÝéÂ´¨y\u0000cå/Êí¯î\u0095hz9_ðD²*m\u000f8ô®Ù¡¿n¤$\u0089òn¯Ti9$\u001e®\u0003³édÎ+³®\u0098¡~cc4Hé-¶\u0013iø4ÝùÂî¨H\u008d9rðW²=M\"\u0018\u0007Òì¥Òq·5\u009cé\u0081²geL$1É\u0016®üfá/Æò«\u00ad\u0091av4[é@¯&n\u000b\u0001ðãÕ´»i 6\u0085éj´Py\u0000Hå9Êð¯²\u0095Mz\u0018_ÂD¡*s\u000f%ôÖÙ©¿e¤7\u0089Ãn¯Tn94\u001eò\u0003¯élÎ,³å\u0098²\nqï\u0000ÀÉ¥\u008b\u009ftp!UïN\u0098 J\u0005\rþïÓ\u0090µ\\®\u000e\u0083úd\u0096^W3\r\u0014Ë\t\u0096ãUÄ\u0015¹Ü\u0092\u008b\u00895lDC\u008d&Ï\u001c0óeÖªÍØ£\u001f\u0086i}\u008fPÜ6\u001b-[\u0000\u0094çÞÝ+°T\u0097\u0098\u008aÊ`>GR:\u0093\u0011É÷\u000fêRÁ\u0091¤Ñ\u009a\u0018qO\u0082zg\u0013HÓ-\u0090\u0017Gø6ÝÔÆ\u0096¨]\u008d\u0010vð[\u009b=A&\u001c\u000bÁì\u008c\u0000Wå%Êâ¯\u0094\u0095rz!_æD¦*i\u000f#ôÏÙ¢¿j¤%\u0089ãn´\u0000Wå%Êâ¯\u0094\u0095rz!_æD¦*i\u000f#ôÕÙ\u0092¿L\u0000Hå9Êð¯²\u0095Mz\u0018_ÌD¥*a\u000f2ôîÙ\u008d¿o¤2\u0089ån\u0083To9.\u001eô\u0003²éoÎ,³ì\u0098¥~r\u0085÷`\u0086OO*\r\u0010òÿ§ÚrÁ\r¯Þ\u008a\u0096q[\\):Ö!\u009a\fHë<ÑÐ¼\u0091\u009bK\u0086\rlÐK\u00936S\u001d\u001aûÍÇ½\"Ì\r\u0005hGR¸½í\u0098:\u0083Sí\u0093ÈÐ3\u0007\u001ebx\u0090c×N#©\\\u0093\u0090þÂÙ6ÄZ.\u009b\tÁt\u0007_Z¹\u0099¤Ù\u008f\u0010êG\u0000Hå9Êð¯²\u0095Mz\u0018_×D¥*b\u000f\u0016ôéÙ¥¿w\u0000Hå9Êð¯²\u0095Mz\u0018_×D¥*b\u000f\u0016ôéÙ¥¿w¤\u0003\u0089ìn©Te9.\u001eôû0\u001eA1\u0088TÊn5\u0081`¤·¿ÞÑ\u001eô]\u000f\u008a\"îD\u0011_]r\u008f\u0095Ý¯\nÂpå\u0099øÖ\u0012\u001c5TH\u009dcÊ\u0000Oå&Êæ¯¥\u0095rz\u0016_éD¥*w\u000f%ôòÙ\u0088¿a¤.\u0089än¬Te92\u001eÌ\u0003©ésÎ4³å\u0098®~ec2\u0000Hå9Êð¯²\u0095Mz\u0018_ÓD«*i\u000f0ôÃÙ¯¿n¤4\u0089òn¯Tl9,\u001eå\u0003²\u008aæo\u0097@^%\u001c\u001fãð¶Õ}Î\u0005 Ç\u0085\u009e~mS\u00015À.\u009a\u0003\\ä\u0001ÞÂ³\u0082\u0094K\u0089\u001ccâD\u00879]\u0012\u001aôËé\u0080ÂK§\u001c\u0000Hå9Êð¯²\u0095Mz\u0018_ÂD²*o\u000f7ôóÙ¥¿r¤\u0001\u0089ãn´Ti96\u001eé\u0003´éy_`º,\u0095îðíÊk%:\u0000ó\u001b±unP;«\u00ad\u0086¢àmû'Öñ1¬\u000bjf'A\u00ad\\°¶g\u0091(ì\u00adÇ¬!u<&\u0017ñr¯Lb§:\u0082\u00ad\u009d\u008b÷zÒ3-ñ\b\u008eb[}\u0001Xñ³¬\u008dtè0ÃæÞ±8B\u0013 n÷Iª£u¾*\u0099÷ôºðL\u0015\u000e:ß_¼eN\u008a\t¯ÿ´\u0099ÚJÿ\r\u0004Í)\u0082OHT$yÉ\u009e\u0081¤NÉ\bîßó¾\u0019Y>\u0007CØ\u0000gå%Êô¯\u008f\u0095fz&_åD²*C\u000f!ôãÙ¨¿e¤\u0003\u0089ìn©Tc9+\u001eÔ\u0003¨érÎ/³õ\u0098§~hc\u0015Hò-¬@_¥\u001d\u008aÌï¹Õ\\:,\u001fÁ\u0004\u0088j]\u0000gå%Êô¯\u0090\u0095lz!_ãD¥*m\u000f%ôîÙ´¿T¤9\u0089ðn¥TE9.\u001eõ\u0003\u00ad\u0000gå%Êô¯\u0084\u0095ez0_åD®*d\u000f%ôîÙ£¿y¤\b\u0089ïn¬Td9%\u001eò\u0003\u0089énÎ3³ô\u0098¡~nc#Hå\u0000gå%Êô¯\u0084\u0095iz3_ôD²*i\u000f\"ôõÙ´¿o¤2\u0089Én¤\f_é\u001dÆÌ£¨\u0099Tv\u0019SÛH\u009d&U\u0003\u001døÖÕ\u008c³{¨\u0017\u0085Öb\u008cXJ5\u0017\u0012Ô\u000f\u0094å]Â\n\u0000gå%Êô¯\u0090\u0095rz%_ìD¯*a\u000f$ôåÙ¤¿D¤!\u0089ôn¡¤-Aon¾\u000bÚ1+Þxû«àç\u008e/«~P¯}ø\u001b9\u0000Rå\u0005Ê×¯\u0081\u0095Rz\u0004_ÅD\u0084\u0000Iå\u000eÊÔ¯\u0085\u0095Rz\u0013_ÔD\u0089*T\u000f\tôÁÙ\u008c\u0014àñ§Þ\u007f»(\u0081ån Km¼>Y\u007fv¤\u0013ï)9Æ~ã¹øä\u00969³qH¼eù\u0003*\u0018u5´", "ISO-8859-1", cArr, 0, 1080);
        f14722R = cArr;
        f14723S = -2605419941773777600L;
    }

    public static DependencyHolder C0() {
        f14725U = (f14724T + 109) % 128;
        DependencyHolder dependencyHolder = DependencyHolder.INSTANCE;
        f14725U = (f14724T + 33) % 128;
        return dependencyHolder;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object D0(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1185w2.D0(java.lang.String):java.lang.Object");
    }

    public static String E0(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14722R[i5 + i11] ^ (i11 * f14723S)) ^ c10);
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

    public static String F0(Ad ad2) {
        int i5 = f14724T + 49;
        f14725U = i5 % 128;
        int i10 = i5 % 2;
        String str = ad2.type;
        if (i10 == 0) {
            throw null;
        }
        int i11 = f14724T + 11;
        f14725U = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static List G0(WebTrafficObject webTrafficObject) {
        int i5 = f14725U + 9;
        f14724T = i5 % 128;
        int i10 = i5 % 2;
        List list = webTrafficObject.urls;
        if (i10 != 0) {
            throw null;
        }
        int i11 = f14724T + 89;
        f14725U = i11 % 128;
        if (i11 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public static PreloadedVastData H0(DependencyHolder dependencyHolder) {
        f14724T = (f14725U + 109) % 128;
        PreloadedVastData preloadedData = dependencyHolder.getPreloadedData();
        f14724T = (f14725U + 91) % 128;
        return preloadedData;
    }

    public static String I0(OfferCacheEntity offerCacheEntity) {
        int i5 = f14725U + 97;
        f14724T = i5 % 128;
        int i10 = i5 % 2;
        String str = offerCacheEntity.clickThroughUrl;
        if (i10 != 0) {
            int i11 = 4 / 0;
        }
        return str;
    }

    public static JSONObject J0(PreloadedVastData preloadedVastData) {
        int i5 = f14724T + 25;
        f14725U = i5 % 128;
        int i10 = i5 % 2;
        JSONObject parameters = preloadedVastData.getParameters();
        if (i10 == 0) {
            int i11 = 55 / 0;
        }
        f14724T = (f14725U + 109) % 128;
        return parameters;
    }

    public static PlacementController K0(HyprMXController hyprMXController) {
        f14724T = (f14725U + 57) % 128;
        PlacementController placementController = hyprMXController.getPlacementController();
        f14725U = (f14724T + 33) % 128;
        return placementController;
    }

    public static String L0(DependencyHolder dependencyHolder) {
        f14725U = (f14724T + 31) % 128;
        String distributorId = dependencyHolder.getDistributorId();
        int i5 = f14724T + 7;
        f14725U = i5 % 128;
        if (i5 % 2 != 0) {
            return distributorId;
        }
        throw null;
    }

    @Override // Va.Z0
    public final HashMap A0() {
        HashMap map = new HashMap();
        map.put(E0(864 - (ViewConfiguration.getScrollBarSize() >> 8), 23 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (61483 - Color.red(0))).intern(), new C1133s2());
        map.put(E0((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 887, 29 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) Color.blue(0)).intern(), new C1120r2());
        map.put(E0(915 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 9 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (16439 - TextUtils.lastIndexOf("", '0', 0))).intern(), new C1108q2());
        map.put(E0(924 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20 - View.combineMeasuredStates(0, 0), (char) TextUtils.indexOf("", "", 0, 0)).intern(), new B1(19));
        map.put(E0(944 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 28, (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new B1(20));
        map.put(E0(971 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 16 - (ViewConfiguration.getTapTimeout() >> 16), (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), new C1095p2());
        map.put(E0(988 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 22, (char) (3128 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern(), new C1146t2());
        map.put(E0(1009 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 15 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) KeyEvent.keyCodeFromString("")).intern(), new C1172v2());
        map.put(E0(KeyEvent.normalizeMetaState(0) + 1025, 13 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42057)).intern(), new C1159u2());
        int i5 = f14725U + 111;
        f14724T = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 59 / 0;
        }
        return map;
    }

    @Override // Va.Z0
    public final String t0() {
        f14725U = (f14724T + 79) % 128;
        try {
            try {
                String str = (String) BuildConfig.class.getDeclaredField(E0(ViewConfiguration.getScrollBarSize() >> 8, 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0)).intern()).get(null);
                f14724T = (f14725U + 125) % 128;
                return str;
            } catch (Exception unused) {
                C1051la c1051la = (C1051la) C0999ha.j().f14264b;
                String strIntern = E0(View.MeasureSpec.getSize(0) + 12, 11 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ('0' - AndroidCharacter.getMirror('0'))).intern();
                c1051la.getClass();
                return C1051la.n(BuildConfig.class, strIntern);
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021e  */
    @Override // Va.Z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Class w0(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1185w2.w0(java.lang.String):java.lang.Class");
    }
}
