package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: Va.q8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1114q8 {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f14528d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f14529e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f14530f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f14531g;

    /* renamed from: h, reason: collision with root package name */
    public static int f14532h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14533i = 1;

    /* renamed from: a, reason: collision with root package name */
    public int f14534a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f14535b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte f14536c = 0;

    static {
        char[] cArr = new char[1256];
        R8.v.k("\u0000{\u0000m÷¡ïüç$ß\u007fÖ°Î¸Æ>¾Oµ\u0080\u00adÑ¥L\u009dC\u0094\u009c\u008c×\u0084\t|,t`kècî[5S4J¹B¼:\u00032K)\u0085!Ü\u0019\u001f\u0011A\b\u0096\u0000Øø ð7è|ß\u00ad×äÏ1Çu¾¹¶Î®\u0010SQðÛ\u0007\u0010:ÛÍ\u0016ÕG\u0089ý~&fknªVÿ¤ÐS\u0003K^C\u009b{Àr\u0018å¢\u0012v\n-\u0002í:»\u0000c÷«ïæç8ßyÖºÎíÆ9\u0000t÷¶ïñ\u0000v÷¥ïú\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾\u0007µß\u00ad\u008f¥L\u009dQ\u0094\u0080\u008c\u0098\u0084\u0019|.t`kècã[6S4J«Bè:\u00012P)\u008d!Á\u0019\u0015\u0011Z\b\u008c\u0000(\u0000i÷¢ï¨ç?ßdÖµÎìÆ9¾Mµ\u0081\u00adÆ¥\u0018\u009d\u0010\u0094\u0087\u008cÐ\u0084\u0013|5thk¬c¬[2SqJøBú:\u000f2H)\u0084!Ã\u0019\u0007\u0011Q\b\u009c\u0000\u009cøâð=è(ß\u00ad×°ÏsÇ0¾û\u0000)$\bÓÃËÉÃ^û\u0005òÔê\u008dâX\u009a,\u0091à\u0089§\u0081y¹q°ö¨¶ sXEP\fOÝG\u0084\u007f^w\u001bn\u0099f\u008e\u001ei\u0016*\rü\u0005¡=u5u,û$¸ÜÁÔLÌ\u0007ûÞó\u0098ëQã\u001c\u009a\u009d\u0092æ\u008a-\u0082`¹ª3\u0002ÄÏÜ\u009cÔN\u0000f÷«ïúçlßcÖ ÎùÆ(¾Eµ\u0089\u00adÍ¥\u0002\u009dD\u0094Ô\u008cË\u0084\u0014|/tqk¤cè[pSvJ½B¼:\u00062K)\u0084!À\u0019\u001f\u0011C\b\u009d\u0000Øø ð&èqßì×ñÏtÇ?¾ô¶\u0087Él>¡&ð.f\u0016y\u001f±\u0007ü\u000f2wC|\u009adËl\tTT]ÞEÁM\u001eµ%½{¢®ªâ\u0092z\u009a{\u0083¼\u008bòóJûYà\u008bèÒÐ\u0012Ø\u001eÁÕÉ\u008d1\u00adqL\u0086\u0097\u009eß\u0096\u0006®\\§\u0099¿Ú·\u0013Ï#Ä¢ÜóÔ?ìaå²ýèõ,\r\n\u0005H\u001a\u0085\u0012\u008f*\u0000\"_;\u00943ÊK/CcXëPêh=`syûqè\u0089Ê\u0081\u0013\u0099C®Ï`\u009c\u0097G\u008f\n\u0087Ë¿\u009e¶\u001f®\u0000¦ÃÞªÕ{Í&Åêý¾ôqì'ä·\u001cØ\u0014\u0087\u000bL\u0003\u0012;×3\u009b*\u0013\"\u0015ZîRïIeA(y÷q³h|` \u0098\u000e\u0090Ë\u0088Ã¿E·\u0002¯\u009f§\u0092Þ\u0017ÖlÎ§Æä\u0000w÷¬ïáç ßuÖôÎëÆ(¾Aµ\u0090\u00adÍ¥\u0001\u009dU\u0094\u009a\u008cÌ\u0084\\|#tkk¦cè[9S`J±Bó:\u000e2\u0004)\u009b!Ä\u0019\u001f\u0011A\b\u0094\u0000Øø ð&èmßì×ùÏ:Çk¾µ¶Ä®\u0001¦\b\u009dË\u0095\u0098\u008d]\u0085\u001f\u0014'ãåû¢ó?Ë0ÂóÚªÒ{ª\u0016¡Ú¹\u009e±Q\u0089\u0017\u0080\u0087\u0098\u0086\u0090Zh``#\u007f»w½OfGg^èV .^&\u0007=Ô5\u008a\rM\u0005\u0003\u001c\u008b\u0014Çìºäyü(ËöÃ§ÛbÓkª¨¢\u0088ºJ²\\\u0089\u0096©Ò^\u0014FMN\u009evÉ\u0000t÷¶ïñçlßcÖ ÎùÆ(¾Eµ\u0089\u00adÍ¥\u0002\u009dD\u0094Ô\u008cË\u0084\u0014|/tqk¤cè[pSvJ½B¼:\u00062K)\u0084!À\u0019\u001f\u0011C\b\u009d\u0000Øø ð&èqßì×ñÏtÇ{¾½¶Ô®\u0007¦@\u009dÌ\u0095Ã\u008d\u0000\u0085Y|\u0088t¥léd-\\bS¤zm\u008d«\u0095ò\u009d!¥v¬ú´ý¼7ÄWÏ\u009d×Éß\u0010çZîÚöÅþ\u001a\u0006!\u000e\u007f\u0011ª\u0019æ!~)x0³8²@\bHES\u008a[Îc\u0011kMr\u0093zÖ\u0082®\u008a(\u0092\u007f¥â\u00adÿµz½1ÄúÌ\u0089\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾Cµ\u0085\u00adÜ¥\u000f\u009dX\u0094Ô\u008cÎ\u0084\u001d|2tmk©cî[<SqJøBò:\u00012I)\u008d¼±KwS.[ýcªj&r:zï\u0002\u0080\tW\u0011\u0017\u0019\u009e!\u0091(N0\u00058ÛÀþÈ²×:ß<ççïæölþ!\u0086Þ\u008e\u009a\u0095U\u009d\t¥Ç\u00ad\u0082´\n¼\fD+L¶T»c>kes¯{í/uØ³ÀêÈ9ðnùâáýé>\u0091W\u009a\u0086\u0082Û\u008a\u0017²C»\u008c£Ú«JS;[gD\u00adLîtf|`e«mª\u0015\u0015\u001d]\u0006\u0093\u000eÊ6\t>W'\u0080/Î×¶ßzÇwð´øõà+èj\u0091¯\u0099\u0096\u0081U\u0089E²\u0087º\u0081¢K¯©Xz@'Hâp¹yaaciô\u0011\u008f\u001a^\u0002\u0007\nÒ2\u0086;J#\r+ÓÓ»Û¬Ä{Ì8ôþü£ågíg\u0095Þ\u009d\u0091\u0086W\u008eW¶Ü¾\u0086§W¯\u000fW{_¸Gèp0ð}\u0007©\u001fò\u00172/d&ë>ô67N^E\u008f]ÒU\u001emJd\u0085|ÓtC\u008c,\u0084s\u009b¸\u0093æ«#£oºç²æÊ\u0011Â_Ù×ÑÄé\u0006á_ø\u008fð\u0083\b¸\u0000`\u00180éë\u001e#\u0006n\u000e°6ñ?2'e/±W\u0088\\\u001fDTL\u0085tÌ}\u0019e]m\u0091\u0095¦\u009dø\u0082`\u008aw²°ºó£%«xÓ\u008cÛ\u008cÀ\u0005ÈJð\u009cø\u009cá\u0007é]\u0011|\u0019¤\u0001 6c>#&ûn\u009a\u008c,{è\u0017¶àr\u0000=÷ùkÅ\u009c\u001d\u0000<\u0000>\u0000<÷ù\u0000>÷ù\u0000+\u0000-\u0000+÷ï\u0000-÷éöVrÉçd¯þ\u0084ú\u0002\u0096\u0000!\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾Cµ\u0088\u00adÇ¥\u001f\u009dY\u0094\u009a\u008cß\u0084\\|gt-kïðºkÐ\u009c/\u0084h\u008c±´å½4¥~\u00ad\u00adÕÀÞ\u0005Æ\rÎ\u0086öÅÿ\u0014çOï\u0098\u0017±\u001fî\u0000?\b)\u0000U÷ªïíç4ß`Ö±ÎûÆ(¾Eµ\u0080\u00ad\u0088¥\u0018\u009d_\u0094\u009f\u008cÝ\u0084\u0012|`\u0000E÷¼ïøç)ßsÖ ÎýÆ8¾\u0000µ\u008d\u00adÌ¥\t\u009d^\u0094\u0080\u008cÑ\u0084\u001a|)takºc¬[2SaJ¬B¼:\u00072K)\u009c!\u008c)¿ÞlÆ#Îíö¸ÿzç!ïø\u0097\u0082\u009cG\u0084E\u008cÂ´\u0091½X¥\u0006\u00adÂU\u00ad]§BdJ,røzªc5k\"\u0013Å\u001b\u0086\u0000P\b\r0Ù8Ù!W)\u0014ÑmÙïÁªömþ1æöî¢\u0097t\u009f\t\u0087\u0089\u008f\u0087´X¼]¤Ð¬\u009bUG]bE*Mäuµztb6jû\u0012ñ\u001b\n\u0003A\u000b\u008b3Ï8\u0013 P(\u0092\u0000s÷±ïêç?ßsÖ¦ÎñÆ,¾TµÄ\u00adÛ¥\u0004\u009d_\u0094\u0081\u008cÔ\u0084\u0018|`tfk\u00adc¬[3SxJ·Bï:\u00052@)È!Û\u0019\u0019\u0011@\b\u0090\u0000\u009cø§ð\u0019è/è,\u001fó\u0007¦\u000fb>±ÉsÑ:Ùëá K1¼ó¤º¬k\u0094 \u009d¶\u0085©\u008dvõ\rþÓæ\u0086îJÖRßÔÇ\u009fÏ\u001e7d?) æ(¢\u0010}\u0018!\u0001ÿ\tºq\u0002y\u0004bÓjÎRSZVC×K\u009b³¶»n£%\u0094ê\u009cò\u0084\u007f\u008c4õèý\u008dåEí\u000bÖÚÞ\u009bÆYÎ\u0014®;YÂA\u0086IWq\rxÞ`\u0083hF\u0010~\u001bÉ\u0003¢\u000b`3':ä\"¡*\"Ò\\Ú\u000fÅÂÍÒõIý\u0005äÒìÂ¨S\u0000j÷·ïçç\"ß0Ö¿ÎýÆ%¾\u0000µ\u0097\u00adÀ¥\u0003\u009dE\u0094\u0098\u008cÜ\u0084\\|\"takècê[?SxJ´Bó:\u00172A)\u008c!\u008c\u0019\u0012\u0011M\bØ\u0000Ýø ð2èiß ×åÏ1Ç8¾½¶Æ®\u0010¦M\u009d\u009e\u0095\u0090\u008dS\u0085\u0002|Ûv\u0080\u0000l÷\u00adïûç8ß0Ö§ÎðÆ3¾Uµ\u0088\u00adÌ¥L\u009dU\u0094\u009a\u008cÜ\u0084\\|7tmk¼cä[pS3\u0086#\u0000U÷ªïíç4ß`Ö±ÎûÆ(¾Eµ\u0080\u00ad\u0088¥\t\u009d^\u0094\u0090\u008c\u0098\u0084\u0013|&t$k¼cã[;SqJ¶Bï\u0000E÷¼ïëç)ß`Ö ÎñÆ3¾NµÄ\u00adß¥\u0004\u009dY\u0094\u0098\u008cÝ\u0084\\|'tak¼cø[9SzJ¿B¼:\u000e2A)\u0090!Ø\u0019P\u0011@\b\u0097\u0000×øåð*5ùÂ\u0000ÚWÒ\u0095êÜã\u001cûMó\u008f\u008bò\u0080x\u0098c\u0090¸¨å¡$¹a±àI\u008cAÝ^\u0011V[n\u0085fÆ\u007f\u0003w\u0000\u000f½\u0007ì\u001ct\u0014~,©$ð=05 ÍHÅ\u0097Ýßê\u0015âB>\u000eÉ\u008bÑÀÙ\u0016á[è\u0088ð\u0096à\u0094\u0017m\u000f)\u0007ø?¢6q.,&é^Ñ\u0000 ÷¦ïýç8ß0Ö¦ÎýÆ?¾Eµ\u008d\u00adÞ¥\t\u009dT\u0094Ô\u0000 ÷éï¨", "ISO-8859-1", cArr, 0, 1256);
        f14530f = cArr;
        f14531g = -4308831352574707772L;
        f14528d = new HashMap();
        f14529e = new HashMap();
        f14532h = (f14533i + 65) % 128;
    }

    public static AbstractC1215y8 j(AbstractC1215y8 abstractC1215y8) {
        f14533i = (f14532h + 113) % 128;
        HashMap map = f14528d;
        AbstractC1215y8 abstractC1215y82 = (AbstractC1215y8) map.get(abstractC1215y8);
        if (abstractC1215y82 != null) {
            return abstractC1215y82;
        }
        f14532h = (f14533i + 13) % 128;
        map.put(abstractC1215y8, abstractC1215y8);
        f14533i = (f14532h + 13) % 128;
        return abstractC1215y8;
    }

    public static String l(Object obj, String str, String str2, String str3) {
        String string;
        int i5 = f14532h + 85;
        f14533i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        String string2 = "";
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p(View.MeasureSpec.getMode(0) + 1223, 7 - Color.argb(0, 0, 0, 0), (char) (15917 - Process.getGidForName(""))).intern());
            sb2.append(obj);
            string = sb2.toString();
        } else {
            string = "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p(1229 - Process.getGidForName(""), Color.alpha(0) + 9, (char) (57552 - TextUtils.indexOf((CharSequence) "", '0'))).intern());
        sb3.append(str);
        sb3.append(string);
        sb3.append(p((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1239, ((Process.getThreadPriority(0) + 20) >> 6) + 14, (char) View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        sb3.append(str2);
        if (str3 != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(p(KeyEvent.getDeadChar(0, 0) + 1253, 3 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) View.combineMeasuredStates(0, 0)).intern());
            sb4.append(str3);
            string2 = sb4.toString();
        }
        sb3.append(string2);
        String string3 = sb3.toString();
        int i10 = f14533i + 61;
        f14532h = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 47 / 0;
        }
        return string3;
    }

    public static String p(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f14530f[i5 + i11] ^ (i11 * f14531g)) ^ c10);
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

    public static AbstractC0933c9 t(AbstractC0933c9 abstractC0933c9) {
        int i5 = f14532h + 73;
        f14533i = i5 % 128;
        int i10 = i5 % 2;
        HashMap map = f14529e;
        if (i10 == 0) {
            throw null;
        }
        AbstractC0933c9 abstractC0933c92 = (AbstractC0933c9) map.get(abstractC0933c9);
        if (abstractC0933c92 != null) {
            return abstractC0933c92;
        }
        int i11 = f14532h + 107;
        f14533i = i11 % 128;
        if (i11 % 2 != 0) {
            map.put(abstractC0933c9, abstractC0933c9);
            return abstractC0933c9;
        }
        map.put(abstractC0933c9, abstractC0933c9);
        throw null;
    }

    public final boolean a(List list) {
        f14532h = (f14533i + 45) % 128;
        if (this.f14534a >= list.size()) {
            return false;
        }
        f14532h = (f14533i + 117) % 128;
        return true;
    }

    public final C1178v8 b(List list) {
        int i5 = f14532h + 33;
        f14533i = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                a(list);
                throw null;
            }
            if (!a(list)) {
                r(p(1129 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), null);
                throw null;
            }
            f14532h = (f14533i + 37) % 128;
            int i10 = this.f14534a;
            this.f14534a = i10 + 1;
            return (C1178v8) list.get(i10);
        } catch (Exception e7) {
            r(p(1152 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 33, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), e7);
            throw null;
        }
    }

    public final C1178v8 c(ArrayList arrayList) {
        try {
            if (!a(arrayList)) {
                f14532h = (f14533i + 101) % 128;
                return null;
            }
            int i5 = f14533i + 21;
            f14532h = i5 % 128;
            if (i5 % 2 == 0) {
                return (C1178v8) arrayList.get(this.f14534a);
            }
            int i10 = 23 / 0;
            return (C1178v8) arrayList.get(this.f14534a);
        } catch (Exception e7) {
            r(p((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1185, View.resolveSizeAndState(0, 0, 0) + 37, (char) (ExpandableListView.getPackedPositionType(0L) + 13756)).intern(), e7);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e2, code lost:
    
        r3 = new java.util.HashMap();
        r4 = p(764 - android.view.View.resolveSizeAndState(0, 0, 0), 1 - android.view.View.MeasureSpec.getMode(0), (char) (android.view.View.resolveSize(0, 0) + 28391)).intern();
        r5 = new Va.C1075n8(0);
        r5.f14427b = r20;
        r1 = m(r21, r4, r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0319, code lost:
    
        if ((!r1.hasNext()) == true) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x031b, code lost:
    
        Va.C1114q8.f14532h = (Va.C1114q8.f14533i + 113) % 128;
        r4 = (android.util.Pair) r1.next();
        r3.put(r4.first, r4.second);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0331, code lost:
    
        Va.C1114q8.f14532h = (Va.C1114q8.f14533i + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0340, code lost:
    
        return j(new Va.A8(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x036b, code lost:
    
        return j(new Va.C1227z8(z(p(android.view.KeyEvent.normalizeMetaState(0) + 811, (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) (61719 - android.text.AndroidCharacter.getMirror('0'))).intern(), r21)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036c, code lost:
    
        r2 = j(new Va.G8(s(r21)));
        n(r21, p(151 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), r2, p(792 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 19 - android.view.View.MeasureSpec.getMode(0), (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0))).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x03b4, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03b5, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(p(android.text.TextUtils.indexOf("", "", 0, 0) + 832, 17 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0))).intern());
        r1.append(r2);
        q(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x03e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0173, code lost:
    
        if (r2.d() == Va.EnumC1165u8.f14666c) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        if (r2.d() == Va.EnumC1165u8.f14666c) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x017e, code lost:
    
        Va.C1178v8.f14705c = (Va.C1178v8.f14706d + 41) % 128;
        r3 = r2.f();
        r15 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0196, code lost:
    
        if (r15 == 33) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        if (r15 == 40) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019c, code lost:
    
        if (r15 == 45) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x019e, code lost:
    
        if (r15 == 91) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a2, code lost:
    
        if (r15 == 123) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c3, code lost:
    
        if (r3.equals(p(android.view.KeyEvent.getMaxKeyCode() >> 16, 1 - android.view.KeyEvent.normalizeMetaState(0), (char) android.text.TextUtils.indexOf("", "", 0, 0)).intern()) == true) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c7, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ee, code lost:
    
        if (r3.equals(p((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 789, -android.text.TextUtils.lastIndexOf("", '0', 0), (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 33953)).intern()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f0, code lost:
    
        r3 = Va.C1114q8.f14533i + 65;
        Va.C1114q8.f14532h = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01f9, code lost:
    
        if ((r3 % 2) == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fb, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01fe, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x021f, code lost:
    
        if (r3.equals(p(((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 781, 1 - android.view.View.getDefaultSize(0, 0), (char) android.text.TextUtils.getOffsetBefore("", 0)).intern()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0221, code lost:
    
        Va.C1114q8.f14533i = (Va.C1114q8.f14532h + 5) % 128;
        r3 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0249, code lost:
    
        if (r3.equals(p(110 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), -android.graphics.ImageFormat.getBitsPerPixel(0), (char) android.text.TextUtils.getOffsetAfter("", 0)).intern()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x026a, code lost:
    
        if (r3.equals(p(790 - android.text.TextUtils.lastIndexOf("", '0', 0, 0), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 1, (char) android.widget.ExpandableListView.getPackedPositionGroup(0)).intern()) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x026c, code lost:
    
        Va.C1114q8.f14532h = (Va.C1114q8.f14533i + 13) % 128;
        r3 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0276, code lost:
    
        r3 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0278, code lost:
    
        if (r3 == 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x027a, code lost:
    
        if (r3 == 1) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x027c, code lost:
    
        if (r3 == 2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        if (r3 == 3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0280, code lost:
    
        if (r3 != 4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x029e, code lost:
    
        return j(new Va.R8(j(new Va.U8(0, 2)), d(r21), 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x029f, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append(p((android.media.AudioTrack.getMinVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMinVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 812, android.graphics.Color.green(0) + 20, (char) (27524 - android.text.TextUtils.lastIndexOf("", '0'))).intern());
        r1.append(r2.f());
        q(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02d2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02e1, code lost:
    
        return j(new Va.O8(e(r21), 2));
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 d(java.util.List r21) {
        /*
            Method dump skipped, instructions count: 1149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.d(java.util.List):Va.y8");
    }

    public final AbstractC1215y8 e(List list) {
        f14532h = (f14533i + 109) % 128;
        AbstractC1215y8 abstractC1215y8D = d(list);
        while (a(list)) {
            int i5 = f14533i + 69;
            f14532h = i5 % 128;
            if (i5 % 2 != 0) {
                b(list).f().getClass();
                throw null;
            }
            String strF = b(list).f();
            int iHashCode = strF.hashCode();
            char c10 = 65535;
            if (iHashCode == 46) {
                if (!(!strF.equals(p(TextUtils.getCapsMode("", 0, 0) + 788, -TextUtils.indexOf((CharSequence) "", '0'), (char) (45009 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern()))) {
                    c10 = 0;
                }
            } else if (iHashCode == 91) {
                if (strF.equals(p(ImageFormat.getBitsPerPixel(0) + 790, 1 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33952)).intern())) {
                    c10 = 1;
                }
            }
            if (c10 == 0) {
                abstractC1215y8D = v(abstractC1215y8D, list);
            } else {
                if (c10 != 1) {
                    this.f14534a--;
                    return abstractC1215y8D;
                }
                f14533i = (f14532h + 75) % 128;
                AbstractC1215y8 abstractC1215y8S = s(list);
                n(list, p(810 - TextUtils.lastIndexOf("", '0', 0, 0), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (61671 - ExpandableListView.getPackedPositionType(0L))).intern(), abstractC1215y8S, p(940 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 34, (char) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                if (b(list).h(p((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 789, 1 - TextUtils.getCapsMode("", 0, 0), (char) (View.resolveSize(0, 0) + 683)).intern())) {
                    abstractC1215y8D = j(new K8(abstractC1215y8D, abstractC1215y8S, s(list)));
                    f14532h = (f14533i + 17) % 128;
                } else {
                    this.f14534a--;
                    abstractC1215y8D = j(new L8(abstractC1215y8D, abstractC1215y8S));
                    f14533i = (f14532h + 63) % 128;
                }
            }
        }
        return abstractC1215y8D;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 f(java.util.List r13) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.f(java.util.List):Va.y8");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 g(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.g(java.util.List):Va.y8");
    }

    public final V8 h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        byte b5 = (byte) (this.f14536c + 1);
        this.f14536c = b5;
        C1178v8 c1178v8C = c(arrayList);
        f14533i = (f14532h + 65) % 128;
        while (!c1178v8C.h(p((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 764, 1 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 28392)).intern())) {
            int i5 = f14532h + 13;
            f14533i = i5 % 128;
            this.f14535b = i5 % 2 == 0 ? this.f14535b - 1 : this.f14535b + 1;
            arrayList2.add(x(arrayList));
            c1178v8C = c(arrayList);
        }
        this.f14534a++;
        this.f14535b++;
        this.f14536c = (byte) (this.f14536c - 1);
        return (V8) t(new V8(arrayList2, b5));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 i(java.util.List r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.i(java.util.List):Va.y8");
    }

    public final V8 k(ArrayList arrayList) {
        f14532h = (f14533i + 9) % 128;
        this.f14534a = 0;
        this.f14536c = (byte) 0;
        u(arrayList, p(1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, (char) TextUtils.getOffsetBefore("", 0)).intern(), p(1 - TextUtils.getTrimmedLength(""), 41 - MotionEvent.axisFromString(""), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        V8 v8H = h(arrayList);
        int i5 = f14533i + 17;
        f14532h = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 22 / 0;
        }
        return v8H;
    }

    public final ArrayList m(List list, String str, InterfaceC1101p8 interfaceC1101p8) {
        ArrayList arrayList = new ArrayList();
        if (b(list).h(str)) {
            return arrayList;
        }
        this.f14534a--;
        arrayList.add(interfaceC1101p8.a(list));
        C1178v8 c1178v8B = b(list);
        while (c1178v8B.h(p(1104 - View.getDefaultSize(0, 0), 1 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf("", "", 0, 0) + 30380)).intern())) {
            f14532h = (f14533i + 87) % 128;
            arrayList.add(interfaceC1101p8.a(list));
            c1178v8B = b(list);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p(1105 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 22, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern());
        sb2.append(str);
        sb2.append(p(TextUtils.indexOf((CharSequence) "", '0') + 1128, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 34309)).intern());
        y(c1178v8B, str, arrayList, sb2.toString());
        f14532h = (f14533i + 61) % 128;
        return arrayList;
    }

    public final void n(List list, String str, Object obj, String str2) {
        f14533i = (f14532h + 123) % 128;
        y(b(list), str, obj, str2);
        int i5 = f14533i + 69;
        f14532h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[PHI: r0
  0x0032: PHI (r0v20 java.lang.String) = (r0v3 java.lang.String), (r0v22 java.lang.String) binds: [B:10:0x002f, B:6:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[PHI: r0
  0x005d: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v22 java.lang.String) binds: [B:9:0x002d, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 o(Va.C1178v8 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.o(Va.v8, java.util.List):Va.y8");
    }

    public final void q(String str) {
        f14533i = (f14532h + 81) % 128;
        r(str, null);
        throw null;
    }

    public final void r(String str, Exception exc) {
        throw new C1191w8(this.f14535b, exc, str);
    }

    public final AbstractC1215y8 s(List list) {
        AbstractC1215y8 abstractC1215y8G = g(list);
        if (!a(list)) {
            return abstractC1215y8G;
        }
        int i5 = f14532h + 115;
        f14533i = i5 % 128;
        if (i5 % 2 == 0) {
            b(list).f().getClass();
            throw null;
        }
        String strF = b(list).f();
        int iHashCode = strF.hashCode();
        char c10 = 65535;
        if (iHashCode == 1216) {
            if (strF.equals(p(766 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 2 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (35850 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern())) {
                f14533i = (f14532h + 65) % 128;
                c10 = 0;
            }
        } else if (iHashCode == 3968) {
            if (strF.equals(p(767 - KeyEvent.getDeadChar(0, 0), 1 - MotionEvent.axisFromString(""), (char) (6090 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                c10 = 1;
            }
        }
        if (c10 == 0) {
            return j(new S8(abstractC1215y8G, s(list), 1));
        }
        if (c10 == 1) {
            return j(new S8(abstractC1215y8G, s(list), 0));
        }
        this.f14534a--;
        return abstractC1215y8G;
    }

    public final void u(ArrayList arrayList, String str, String str2) {
        int i5 = f14533i + 17;
        f14532h = i5 % 128;
        int i10 = i5 % 2;
        n(arrayList, str, null, str2);
        if (i10 != 0) {
            int i11 = 32 / 0;
        }
        int i12 = f14532h + 85;
        f14533i = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public final AbstractC1215y8 v(AbstractC1215y8 abstractC1215y8, List list) {
        f14533i = (f14532h + 15) % 128;
        C1178v8 c1178v8B = b(list);
        ArrayList arrayListM = null;
        if (!c1178v8B.a()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(p(KeyEvent.normalizeMetaState(0) + 849, 28 - Color.argb(0, 0, 0, 0), (char) ((-1) - ImageFormat.getBitsPerPixel(0))).intern());
            sb2.append(c1178v8B);
            r(sb2.toString(), null);
            throw null;
        }
        String strF = c1178v8B.f();
        C1178v8 c1178v8B2 = b(list);
        if (c1178v8B2.h(p((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 773, View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (char) ((-1) - MotionEvent.axisFromString(""))).intern())) {
            f14533i = (f14532h + 17) % 128;
            String strIntern = p(775 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1 - (Process.myTid() >> 22), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern();
            C1088o8 c1088o8 = new C1088o8(0);
            c1088o8.f14460b = this;
            arrayListM = m(list, strIntern, c1088o8);
            int i5 = f14532h + 23;
            f14533i = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 89 / 0;
            }
            n(list, p(View.MeasureSpec.getMode(0) + 110, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (char) KeyEvent.normalizeMetaState(0)).intern(), arrayListM, p(878 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 63 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 10701)).intern());
        } else {
            if (!c1178v8B2.h(p(110 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (char) Drawable.resolveOpacity(0, 0)).intern())) {
                this.f14534a--;
                return j(new D8(abstractC1215y8, strF));
            }
        }
        return j(new E8(abstractC1215y8, strF, arrayListM, z(p(151 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 1, (char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1)).intern(), list)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC1215y8 w(java.lang.String r7, java.util.ArrayList r8) {
        /*
            r6 = this;
            int r0 = Va.C1114q8.f14533i
            int r0 = r0 + 85
            int r1 = r0 % 128
            Va.C1114q8.f14532h = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1a
            Va.v8 r0 = r6.c(r8)
            boolean r0 = r0.h(r7)
            r2 = 0
            int r2 = r2 / r2
            if (r0 != 0) goto L5c
            goto L24
        L1a:
            Va.v8 r0 = r6.c(r8)
            boolean r0 = r0.h(r7)
            if (r0 != 0) goto L5c
        L24:
            Va.y8 r1 = r6.s(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r2 = r2 >> 16
            int r2 = r2 + 28963
            char r2 = (char) r2
            int r3 = android.view.ViewConfiguration.getEdgeSlop()
            int r3 = r3 >> 16
            int r3 = r3 + 274
            float r4 = android.view.ViewConfiguration.getScrollFriction()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = r4 + 35
            java.lang.String r2 = p(r3, r4, r2)
            java.lang.String r2 = r2.intern()
            r0.append(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r6.n(r8, r7, r1, r0)
        L5c:
            int r7 = Va.C1114q8.f14532h
            int r7 = r7 + 57
            int r7 = r7 % 128
            Va.C1114q8.f14533i = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.w(java.lang.String, java.util.ArrayList):Va.y8");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.AbstractC0933c9 x(java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 2146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1114q8.x(java.util.ArrayList):Va.c9");
    }

    public final void y(C1178v8 c1178v8, String str, Object obj, String str2) {
        f14532h = (f14533i + 45) % 128;
        if (c1178v8.h(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(p(ImageFormat.getBitsPerPixel(0) + 1128, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (Color.rgb(0, 0, 0) + 16811524)).intern());
        sb2.append(str);
        sb2.append(p(View.getDefaultSize(0, 0) + 1127, ExpandableListView.getPackedPositionGroup(0L) + 1, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 34308)).intern());
        String string = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(p((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1126, -TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34308)).intern());
        sb3.append(c1178v8.f());
        sb3.append(p(MotionEvent.axisFromString("") + 1128, TextUtils.getOffsetAfter("", 0) + 1, (char) (34308 - Gravity.getAbsoluteGravity(0, 0))).intern());
        q(l(obj, string, sb3.toString(), str2));
        throw null;
    }

    public final ArrayList z(String str, List list) {
        C1088o8 c1088o8 = new C1088o8(1);
        c1088o8.f14460b = this;
        ArrayList arrayListM = m(list, str, c1088o8);
        f14533i = (f14532h + 51) % 128;
        return arrayListM;
    }
}
