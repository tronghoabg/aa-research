package Va;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.http.SslError;
import android.os.Message;
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
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class V9 extends WebViewClient implements InterfaceC0950e0, Q6 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13791c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f13792d;

    /* renamed from: e, reason: collision with root package name */
    public static int f13793e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13794f = 1;

    /* renamed from: a, reason: collision with root package name */
    public final WebViewClient f13795a;

    /* renamed from: b, reason: collision with root package name */
    public final WebViewClient f13796b;

    static {
        char[] cArr = new char[1092];
        R8.v.k("\u0000WkWÖ\u0006AÀ¬¡\u0017\u009f\u0083[î\u001dYüÄ«/\u0091\u009bH\u0006,qÎÜÙG\u008d³O\u001e \u0089åôÂ_\u0087Ëh\u008fÕäÐY\u0086Îi#*\u0098J\fÕa Ö K? 0\u0014Ô\u0089\u0084þsS_È\n<Õ\u0091¬\u0006q{TÐXDù¹´.\u0081\u0083Uø\u001elàÁ\u00996\u009e«_\u0000>tìé¹^\u0086³Q(\u0013\u009cêñÆf°Ûa0!¤ö\u0019Í\u008e\u0098ãoXrÍ\u0019!Ì\u0096\u009c\u000b+\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/»\u009bT\u00061qíÜÕG\u0080³c\u001e>\u0089íôÓ_\u0086Ën6l¡\r\fØw\u008dãaN*¹\u001c$å\u008fªûkf2Ñ\u0000<Í§²\u0013m~oé\u001eTò¿\u009c+m\u0096U\u0001\u0002lñ×¤B\u009b®\u0006\u0019\u0015\u0084àï¨Zß\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËi6$¡\u0011\fÅw\u008eãpN\t¹\u000e$Ï\u008f®û|f)Ñ\u0016<Á§\u0083\u0013z~Vé Tñ¿±+f\u0096]\u0001\blÿ×âB\u008e®K\u0019\u0011\u0084çï¡Z\u0085Æ\\1s\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/»\u009bT\u00061qíÜÕG\u0080³c\u001e>\u0089íôÓ_\u0086Ën6l¡\r\fØw\u008dãaN*¹\u001c$å\u008fªûkf2Ñ\u0000<Í§²\u0013m~oé\u001eTò¿\u009c+m\u0096U\u0001\u0002lñ×¤B\u009b®\u0006\u0019\u0012\u0084÷ïµZ\u0083ÆM1)\u009cø\u0007\u0097Up>u\u0083#\u0014Ìù\u008fBïÖp»\u0005\f\u0085\u0091\u009az\u0095ÎqS!$Ö\u0089ú\u0012¯æpK\tÜÔ¡ñ\ný\u009e@c\u0017ô\u001bYä\"°¶D\u001b ì9qþÚ\u009b®O3\u0010\u0084#¸\u0098Ó\u009dnËù$\u0014g¯\u0007;\u0098Víám|r\u0097}#\u0099¾ÉÉ>d\u0012ÿG\u000b\u0098¦á1<L\u0019ç\u0015s¨\u008eÿ\u0019ó´\fÏX[¬öÝ\u0001Ì\u009c\u00197hC ÞõiÊ\u0084\u001d\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡2\fßw\u0083ãpN\u0014¹\u001d$Ù\u008f³û{f2Ñ\u0011<Á@L+I\u0096\u001f\u0001ðì³WÓÃL®9\u0019¹\u0084¦o©ÛMF\u001d1ê\u009cÆ\u0007\u0093óL^5Éè´Í\u001fÁ\u008b`v-á\u0018LÌ7\u0087£y\u000e\u0006ù\u001fd×Ï°»u&*\u0091\u001e|Ýç«SS>V©\u0014\u0014âÿ¼kxÖIÚ\u009c±\u0099\fÏ\u009b vcÍ\u0003Y\u009c4é\u0083i\u001evõyA\u009dÜÍ«:\u0006\u0016\u009dCi\u009cÄåS8.\u001d\u0085\u0011\u0011¬ìû{óÖ\u0006\u00adT9\u0080\u0094þcÏþ\nUW!²¼ý\u000bÂæ\u000f}jÉ²¤\u00973Æ%\u009cN\u0099óÏd \u0089c2\u0003¦\u009cËé|iáv\ny¾\u009d#ÍT:ù\u0016bC\u0096\u009c;å¬8Ñ\u001dz\u0011î¬\u0013û\u0084õ)\fRXÆ¨kö\u009c×\u0001\u0016ªaÞ\u0092CëôÙ\u0019\u0012\u0082}(\u0083C\u0086þÐi?\u0084|?\u001c«\u0083Æöqvìi\u0007f³\u0082.ÒY%ô\to\\\u009b\u00836ú¡'Ü\u0002w\u000eã³\u001eä\u0089þ$\u0019_VË¿fÒ\u0091Û\f\u001f§oÓªNëùÝ\u0014\u0011\u008fc;§V\u0093ÁÄ\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä\u00ad/\u009a\u009b`\u00067qøÜÑG¼³E\u001e!\u0089ñôÔ_\u0085Ës6?¡\r\fÙw\u008dãz\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈË~6#¡+\fÀw\u0086ãuN2¹\u001d$ü\u008fµû}f)Ñ\u0006<Á§²\u0013@~Sé\u001fTê¿¿+p\u0096M\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸û]f3Ñ\u001e<á§¤\u0013z~Ué\u001e»®Ð«mýú\u0012\u0017Q¬18®UÛâ[\u007fD\u0094K ¯½ÿÊ\bg$üq\b®¥×2\nO/ä#p\u009e\u008dÉ\u001aÇ·>ÌjX\u009aõÄ\u0002å\u009f$4S@¦ÝÇjð\u0087*\u001cS¨\u0097Å\u0092Râï\u0007\u0004O\u0090»-ººü×\u0006lDùd\u0015±8ÙSÜî\u008aye\u0094&/F»ÙÖ¬a,ü=\u0017\t£Ö>¨I\u007fäN\u007f\u0015\u008b\u009c&¡±jÌCg\u0013óï\u000e¾\u0099Â4CO\u0010ÛÚv¿\u0081\u0087\u001cS·)Ãä^¹é\u008a\u0004{\u009f&+ýFÃÑ\u009elv\u0087\u000f\u0013û®Ú9\u008eTVï3z\u0011\u0096Ç!\u0099¼}×,\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸ûFf4Ñ\u0006<Ô§\u0097\u0013}~Né\u0004TÌ¿µ+s\u0096A\u0001\u0003lë×¾\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËi6$¡\u0011\fÅw\u008eãpN\t¹\u000e$Ï\u008f®û|f)Ñ\u0016<Á§\u009d\u0013m~Cé)Tè¿µ+l\u0096@ \u009fK\u009aöÌa#\u008c`7\u0000£\u009fÎêyjäu\u000fz»\u009e&ÎQ9ü\u0015g@\u0093\u009f>æ©;Ô\u001e\u007f\u0012ë¯\u0016ø\u0081ñ,\u0004WPÃ¯nò\u0099Æ\u0004\u001c¯cÛ°FÑñÍ\u001c\u0007\u0087I3¤^\u0085ÉØt0.PEUø\u0003oì\u0082¯9Ï\u00adPÀ%w¥êº\u0001µµQ(\u0001_öòÚi\u008f\u009dP0)§ôÚÑqÝå`\u00187\u008f8\"ÆY\u0096Ím`6\u0097.\n×¡¨ÕuH2ÿ\u0002\u0012Õ\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u0081ãqN/¹\u000e$Ï\u008f¸ûBf/Ñ\u0015<Í§¸\u0013Z~_é\u001dTë¿µ+q\u0096@©\u008cÂ\u0089\u007fßè0\u0005s¾\u0013*\u008cGùðymf\u0086i2\u008d¯ÝØ*u\u0006îS\u001a\u008c·õ (]\rö\u0001b¼\u009fë\bå¥\u001cÞHJ¸çæ\u0010Ç\u008d\u0006&qR\u008fÏýxÏ\u0095\u001d\u000eZº³×\u0081@Êý%\u0000Ek@Ö\u0016Aù¬º\u0017Ú\u0083Eî0Y°Ä¯/ \u009bD\u0006\u0014qãÜÏG\u009a³E\u001e<\u0089áôÄ_ÈËu6\"¡,\fÕw\u008cãpN#¹\n$ú\u008f®ûaf#Ñ\u0017<×§¥\u0013O~Ué\u0002Tû\u0000gkWÖ\u0010AÁ¬º\u0017\u009b\u0083\\î.YõÄ¦/£\u009bC\u0006:qÜÜÕG\u008b³W\u001e\u0011\u0089èôß_\u008dËt68\u0000gkWÖ\u0010AÂ¬ª\u0017\u00ad\u0083Iî<YÆÄ«/\u0091\u009bQ\u0006\u001bqæÜÕG\u008b³N\u001e&\u00059n<ÓjD\u0085©Æ\u0012¦\u0086'ëJ\\\u0085ÁÒ*í\u009ez\u0003At\u008eÙ¥Bñ¶)\u001bZ\u008c\u0091ñ¤ZóÎF3g¤g\t®rÈæ\u0001K_¼s!\u0095\u008aÌþ\u001bcYÔ`9¬¢î\u0016\u0011{%ì\u007fQ\u0090ºÍ.\n\u0093'\u0004hiÄÒØGá«&\u001cu\u0081\u0098êÝ_ªÃ94C\u0099\u0084\u0002ªwãÛ:L\b±Ý\u0000'", "ISO-8859-1", cArr, 0, 1092);
        f13791c = cArr;
        f13792d = 8380931267175344946L;
    }

    public V9(WebViewClient webViewClient, WebViewClient webViewClient2) {
        this.f13795a = webViewClient;
        this.f13796b = webViewClient2;
    }

    public static String c(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13791c[i5 + i11] ^ (i11 * f13792d)) ^ c10);
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

    @Override // Va.Q6
    public final Object a(C1214y7 c1214y7, String str, ArrayList arrayList, Ra ra2, C1203x8 c1203x8) {
        int i5 = f13793e + 17;
        f13794f = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                str.getClass();
                throw null;
            }
            try {
                int iHashCode = str.hashCode();
                char c10 = 65535;
                if (iHashCode == 368095040) {
                    if (str.equals(c(TextUtils.indexOf((CharSequence) "", '0', 0) + 1014, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18, (char) TextUtils.indexOf("", "", 0, 0)).intern())) {
                        f13793e = (f13794f + 43) % 128;
                        c10 = 1;
                    }
                } else if (iHashCode == 381550901) {
                    if (str.equals(c(989 - ImageFormat.getBitsPerPixel(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 24, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        c10 = 0;
                    }
                }
                if (c10 == 0) {
                    int i10 = f13793e + 51;
                    f13794f = i10 % 128;
                    if (i10 % 2 != 0) {
                        return this.f13795a;
                    }
                    throw null;
                }
                if (c10 != 1) {
                    new C1036k8(c1214y7, c1203x8, c(ViewConfiguration.getScrollBarSize() >> 8, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21, (char) TextUtils.getOffsetAfter("", 0)).intern(), str).d(c1214y7.f());
                    return null;
                }
                int i11 = f13793e + 65;
                f13794f = i11 % 128;
                if (i11 % 2 != 0) {
                    return this.f13796b;
                }
                throw null;
            } catch (Exception e7) {
                e = e7;
                String strF = c1214y7.f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c(1032 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) + 60, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1403)).intern());
                sb2.append(str);
                sb2.append(c((PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1091, 1 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16)).intern());
                AbstractC0897a.f(strF, sb2.toString(), e);
                return null;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r12 != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:4:0x0014, B:12:0x0029, B:14:0x002d, B:9:0x0021), top: B:34:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.webkit.WebView r10, java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V9.b(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r13 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.webkit.WebView r11, android.webkit.WebResourceRequest r12, boolean r13) {
        /*
            r10 = this;
            android.webkit.WebViewClient r0 = r10.f13795a
            java.lang.String r1 = ""
            r2 = 0
            r4 = 1
            r5 = 0
            android.webkit.WebViewClient r6 = r10.f13796b     // Catch: java.lang.Throwable -> L26
            boolean r6 = r6.shouldOverrideUrlLoading(r11, r12)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L11
            goto L13
        L11:
            if (r13 == 0) goto L64
        L13:
            boolean r13 = r0 instanceof Va.V9     // Catch: java.lang.Throwable -> L26
            if (r13 == 0) goto L28
            int r13 = Va.V9.f13794f
            int r13 = r13 + 65
            int r13 = r13 % 128
            Va.V9.f13793e = r13
            r13 = r0
            Va.V9 r13 = (Va.V9) r13     // Catch: java.lang.Throwable -> L26
            r13.d(r11, r12, r4)     // Catch: java.lang.Throwable -> L26
            return r4
        L26:
            r13 = move-exception
            goto L29
        L28:
            return r4
        L29:
            int r6 = android.text.TextUtils.getCapsMode(r1, r5, r5)
            char r6 = (char) r6
            int r7 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r7 = r7 >> 16
            long r8 = android.view.ViewConfiguration.getZoomControlsTimeout()
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            int r8 = r8 + 21
            java.lang.String r6 = c(r7, r8, r6)
            java.lang.String r6 = r6.intern()
            int r7 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r7 = r7 >> 16
            char r7 = (char) r7
            int r8 = android.graphics.drawable.Drawable.resolveOpacity(r5, r5)
            int r8 = 124 - r8
            int r9 = android.view.ViewConfiguration.getPressedStateDuration()
            int r9 = r9 >> 16
            int r9 = 54 - r9
            java.lang.String r7 = c(r8, r9, r7)
            java.lang.String r7 = r7.intern()
            Va.Ab.a0(r6, r7, r13, r5)
        L64:
            if (r0 == 0) goto Lb9
            int r13 = Va.V9.f13794f
            int r13 = r13 + 69
            int r6 = r13 % 128
            Va.V9.f13793e = r6
            int r13 = r13 % 2
            if (r13 != 0) goto L77
            boolean r11 = r0.shouldOverrideUrlLoading(r11, r12)     // Catch: java.lang.Throwable -> L7c
            return r11
        L77:
            r0.shouldOverrideUrlLoading(r11, r12)     // Catch: java.lang.Throwable -> L7c
            r13 = 0
            throw r13     // Catch: java.lang.Throwable -> L7c
        L7c:
            r13 = move-exception
            int r0 = android.os.Process.getThreadPriority(r5)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            char r0 = (char) r0
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            int r7 = android.text.TextUtils.indexOf(r1, r1)
            int r7 = 22 - r7
            java.lang.String r0 = c(r6, r7, r0)
            java.lang.String r0 = r0.intern()
            r6 = 48
            int r1 = android.text.TextUtils.lastIndexOf(r1, r6, r5, r5)
            int r1 = r1 + r4
            char r1 = (char) r1
            char r4 = android.text.AndroidCharacter.getMirror(r6)
            int r4 = r4 + 130
            long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r5, r5)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r2 = 55 - r2
            java.lang.String r1 = c(r4, r2, r1)
            java.lang.String r1 = r1.intern()
            Va.Ab.a0(r0, r1, r13, r5)
        Lb9:
            boolean r11 = super.shouldOverrideUrlLoading(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.V9.d(android.webkit.WebView, android.webkit.WebResourceRequest, boolean):boolean");
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z2) {
        int i5 = f13793e + 23;
        f13794f = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
        } catch (Throwable th) {
            Ab.a0(c(View.MeasureSpec.getMode(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, (char) Gravity.getAbsoluteGravity(0, 0)).intern(), c(522 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 43 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), th, false);
        }
        if (i10 == 0) {
            webViewClient.doUpdateVisitedHistory(webView, str, z2);
            throw null;
        }
        webViewClient.doUpdateVisitedHistory(webView, str, z2);
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            super.doUpdateVisitedHistory(webView, str, z2);
        } else {
            f13794f = (f13793e + 11) % 128;
            webViewClient2.doUpdateVisitedHistory(webView, str, z2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        f13793e = (f13794f + 49) % 128;
        try {
            this.f13796b.onFormResubmission(webView, message, message2);
            f13793e = (f13794f + 117) % 128;
        } catch (Throwable th) {
            Ab.a0(c((Process.getThreadPriority(0) + 20) >> 6, 23 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0)).intern(), c(455 - ExpandableListView.getPackedPositionChild(0L), 39 - Color.red(0), (char) (10439 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)))).intern(), th, false);
        }
        try {
            WebViewClient webViewClient = this.f13795a;
            if (webViewClient == null) {
                super.onFormResubmission(webView, message, message2);
            } else {
                f13794f = (f13793e + 69) % 128;
                webViewClient.onFormResubmission(webView, message, message2);
            }
        } catch (Error e7) {
            Ab.a0(c(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 21 - TextUtils.lastIndexOf("", '0', 0), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern(), c((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 495, 27 - Color.alpha(0), (char) TextUtils.getOffsetAfter("", 0)).intern(), e7, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        try {
            this.f13796b.onLoadResource(webView, str);
        } catch (Throwable th) {
            Ab.a0(c((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.blue(0) + 22, (char) Color.blue(0)).intern(), c(302 - TextUtils.lastIndexOf("", '0', 0), Process.getGidForName("") + 36, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onLoadResource(webView, str);
            f13793e = (f13794f + 113) % 128;
            return;
        }
        int i5 = f13793e + 103;
        f13794f = i5 % 128;
        if (i5 % 2 != 0) {
            webViewClient.onLoadResource(webView, str);
        } else {
            webViewClient.onLoadResource(webView, str);
            int i10 = 1 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        int i5 = f13794f + 17;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 != 0) {
                webViewClient.onPageCommitVisible(webView, str);
                int i11 = 45 / 0;
            } else {
                webViewClient.onPageCommitVisible(webView, str);
            }
        } catch (Throwable th) {
            Ab.a0(c(TextUtils.getCapsMode("", 0, 0), 22 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), c(234 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 34 - Color.argb(0, 0, 0, 0), (char) (21813 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            super.onPageCommitVisible(webView, str);
            f13793e = (f13794f + 45) % 128;
            return;
        }
        int i12 = f13793e + 23;
        f13794f = i12 % 128;
        if (i12 % 2 == 0) {
            webViewClient2.onPageCommitVisible(webView, str);
            throw null;
        }
        webViewClient2.onPageCommitVisible(webView, str);
        f13794f = (f13793e + 29) % 128;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        try {
            this.f13796b.onPageFinished(webView, str);
        } catch (Throwable th) {
            Ab.a0(c(1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 22, (char) (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), c(268 - Color.red(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 35, (char) ((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 47325)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient != null) {
            f13794f = (f13793e + 11) % 128;
            webViewClient.onPageFinished(webView, str);
            return;
        }
        super.onPageFinished(webView, str);
        int i5 = f13793e + 95;
        f13794f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        try {
            this.f13796b.onPageStarted(webView, str, bitmap);
            f13794f = (f13793e + 57) % 128;
        } catch (Throwable th) {
            Ab.a0(c(View.resolveSizeAndState(0, 0, 0), AndroidCharacter.getMirror('0') - 26, (char) View.MeasureSpec.getMode(0)).intern(), c((Process.myPid() >> 22) + 234, MotionEvent.axisFromString("") + 35, (char) (21812 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onPageStarted(webView, str, bitmap);
            return;
        }
        int i5 = f13793e + 69;
        f13794f = i5 % 128;
        if (i5 % 2 != 0) {
            webViewClient.onPageStarted(webView, str, bitmap);
        } else {
            webViewClient.onPageStarted(webView, str, bitmap);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        int i5 = f13794f + 21;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
        } catch (Throwable th) {
            Ab.a0(c(AndroidCharacter.getMirror('0') - '0', 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) TextUtils.getTrimmedLength("")).intern(), c(KeyEvent.getDeadChar(0, 0) + 604, TextUtils.indexOf((CharSequence) "", '0', 0) + 49, (char) (48107 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), th, false);
        }
        if (i10 != 0) {
            webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            throw null;
        }
        webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
        try {
            WebViewClient webViewClient2 = this.f13795a;
            if (webViewClient2 != null) {
                webViewClient2.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
                f13794f = (f13793e + 47) % 128;
            }
        } catch (Throwable th2) {
            Ab.a0(c(Color.alpha(0), AndroidCharacter.getMirror('0') - 26, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), c((TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 652, KeyEvent.keyCodeFromString("") + 51, (char) (TextUtils.getOffsetAfter("", 0) + 14492)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        f13793e = (f13794f + 9) % 128;
        try {
            this.f13796b.onReceivedError(webView, i5, str, str2);
        } catch (Throwable th) {
            Ab.a0(c(Color.green(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), c(421 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 9689)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onReceivedError(webView, i5, str, str2);
            return;
        }
        webViewClient.onReceivedError(webView, i5, str, str2);
        int i10 = f13793e + 91;
        f13794f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        f13794f = (f13793e + 39) % 128;
        try {
            this.f13796b.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            f13793e = (f13794f + 35) % 128;
        } catch (Throwable th) {
            Ab.a0(c(Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22, (char) (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), c(702 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 46 - View.resolveSizeAndState(0, 0, 0), (char) TextUtils.getTrimmedLength("")).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        } else {
            f13793e = (f13794f + 119) % 128;
            webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        try {
            this.f13796b.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        } catch (Throwable th) {
            Ab.a0(c(TextUtils.indexOf("", ""), Color.rgb(0, 0, 0) + 16777238, (char) (ViewConfiguration.getTapTimeout() >> 16)).intern(), c(910 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.lastIndexOf("", '0') + 41, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43465)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            return;
        }
        f13793e = (f13794f + 19) % 128;
        webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        f13793e = (f13794f + 51) % 128;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        f13793e = (f13794f + 105) % 128;
        try {
            this.f13796b.onReceivedLoginRequest(webView, str, str2, str3);
        } catch (Throwable th) {
            Ab.a0(c(Gravity.getAbsoluteGravity(0, 0), 22 - Color.blue(0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), c(867 - TextUtils.getCapsMode("", 0, 0), Gravity.getAbsoluteGravity(0, 0) + 43, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onReceivedLoginRequest(webView, str, str2, str3);
            return;
        }
        f13794f = (f13793e + 59) % 128;
        webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
        int i5 = f13793e + 17;
        f13794f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 65 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        int i5 = f13793e + 9;
        f13794f = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
        } catch (Throwable th) {
            Ab.a0(c((-16777216) - Color.rgb(0, 0, 0), View.MeasureSpec.getMode(0) + 22, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), c(565 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-16777177) - Color.rgb(0, 0, 0), (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), th, false);
        }
        if (i10 == 0) {
            webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            throw null;
        }
        webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            return;
        }
        int i11 = f13794f + 119;
        f13793e = i11 % 128;
        if (i11 % 2 == 0) {
            webViewClient2.onReceivedSslError(webView, sslErrorHandler, sslError);
        } else {
            webViewClient2.onReceivedSslError(webView, sslErrorHandler, sslError);
            int i12 = 15 / 0;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f13794f = (f13793e + 37) % 128;
        try {
            this.f13796b.onRenderProcessGone(webView, renderProcessGoneDetail);
        } catch (Throwable th) {
            Ab.a0(c((TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, (char) (Process.myTid() >> 22)).intern(), c(998 - AndroidCharacter.getMirror('0'), (ViewConfiguration.getWindowTouchSlop() >> 8) + 40, (char) View.resolveSizeAndState(0, 0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            return true;
        }
        f13794f = (f13793e + 89) % 128;
        return webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f10, float f11) {
        int i5 = f13794f + 99;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 != 0) {
                webViewClient.onScaleChanged(webView, f10, f11);
                int i11 = 86 / 0;
            } else {
                webViewClient.onScaleChanged(webView, f10, f11);
            }
        } catch (Throwable th) {
            Ab.a0(c(ViewConfiguration.getMaximumFlingVelocity() >> 16, ExpandableListView.getPackedPositionGroup(0L) + 22, (char) View.resolveSize(0, 0)).intern(), c(832 - (KeyEvent.getMaxKeyCode() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 35, (char) (11797 - View.getDefaultSize(0, 0))).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            super.onScaleChanged(webView, f10, f11);
            return;
        }
        f13794f = (f13793e + 105) % 128;
        webViewClient2.onScaleChanged(webView, f10, f11);
        f13794f = (f13793e + 107) % 128;
    }

    @Override // android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        int i5 = f13794f + 65;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 != 0) {
                webViewClient.onTooManyRedirects(webView, message, message2);
                int i11 = 59 / 0;
            } else {
                webViewClient.onTooManyRedirects(webView, message, message2);
            }
        } catch (Throwable th) {
            Ab.a0(c(1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 22 - ExpandableListView.getPackedPositionGroup(0L), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern(), c(TextUtils.lastIndexOf("", '0', 0) + 382, ExpandableListView.getPackedPositionChild(0L) + 40, (char) (TextUtils.getCapsMode("", 0, 0) + 56025)).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            super.onTooManyRedirects(webView, message, message2);
            return;
        }
        int i12 = f13793e + 37;
        f13794f = i12 % 128;
        if (i12 % 2 != 0) {
            webViewClient2.onTooManyRedirects(webView, message, message2);
        } else {
            webViewClient2.onTooManyRedirects(webView, message, message2);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        f13793e = (f13794f + 91) % 128;
        try {
            this.f13796b.onUnhandledKeyEvent(webView, keyEvent);
        } catch (Throwable th) {
            Ab.a0(c(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, ImageFormat.getBitsPerPixel(0) + 23, (char) View.MeasureSpec.getSize(0)).intern(), c(792 - TextUtils.indexOf("", "", 0, 0), 40 - KeyEvent.getDeadChar(0, 0), (char) (8410 - TextUtils.getOffsetAfter("", 0))).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient == null) {
            super.onUnhandledKeyEvent(webView, keyEvent);
            return;
        }
        int i5 = f13794f + 123;
        f13793e = i5 % 128;
        if (i5 % 2 == 0) {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
        } else {
            webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            this.f13796b.shouldInterceptRequest(webView, str);
        } catch (Throwable th) {
            Ab.a0(c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 21, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), c(339 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 43, (char) (Drawable.resolveOpacity(0, 0) + 16393)).intern(), th, false);
        }
        WebViewClient webViewClient = this.f13795a;
        if (webViewClient != null) {
            f13794f = (f13793e + 69) % 128;
            WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient.shouldInterceptRequest(webView, str);
            f13793e = (f13794f + 27) % 128;
            return webResourceResponseShouldInterceptRequest;
        }
        WebResourceResponse webResourceResponseShouldInterceptRequest2 = super.shouldInterceptRequest(webView, str);
        int i5 = f13793e + 27;
        f13794f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 20 / 0;
        }
        return webResourceResponseShouldInterceptRequest2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int i5 = f13794f + 59;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 != 0) {
                webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
                int i11 = 30 / 0;
            } else {
                webViewClient.shouldOverrideKeyEvent(webView, keyEvent);
            }
        } catch (Throwable th) {
            Ab.a0(c(ViewConfiguration.getDoubleTapTimeout() >> 16, 21 - Process.getGidForName(""), (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), c(749 - Color.argb(0, 0, 0, 0), 43 - View.resolveSizeAndState(0, 0, 0), (char) View.getDefaultSize(0, 0)).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            return super.shouldOverrideKeyEvent(webView, keyEvent);
        }
        int i12 = f13793e + 61;
        f13794f = i12 % 128;
        if (i12 % 2 != 0) {
            return webViewClient2.shouldOverrideKeyEvent(webView, keyEvent);
        }
        webViewClient2.shouldOverrideKeyEvent(webView, keyEvent);
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i5 = f13793e + 29;
        f13794f = i5 % 128;
        return b(webView, str, i5 % 2 == 0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        int i5 = f13794f + 53;
        f13793e = i5 % 128;
        boolean zD = d(webView, webResourceRequest, i5 % 2 != 0);
        int i10 = f13794f + 89;
        f13793e = i10 % 128;
        if (i10 % 2 == 0) {
            return zD;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i5 = f13794f + 87;
        f13793e = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 != 0) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
                int i11 = 4 / 0;
            } else {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        } catch (Throwable th) {
            Ab.a0(c(ExpandableListView.getPackedPositionGroup(0L), KeyEvent.keyCodeFromString("") + 22, (char) ('0' - AndroidCharacter.getMirror('0'))).intern(), c((ViewConfiguration.getLongPressTimeout() >> 16) + 420, 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (9689 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 != null) {
            int i12 = f13793e + 19;
            f13794f = i12 % 128;
            if (i12 % 2 != 0) {
                webViewClient2.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
            } else {
                webViewClient2.onReceivedError(webView, webResourceRequest, webResourceError);
                int i13 = 36 / 0;
                return;
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        int i5 = f13793e + 75;
        f13794f = i5 % 128;
        int i10 = i5 % 2;
        WebViewClient webViewClient = this.f13796b;
        try {
            if (i10 == 0) {
                webViewClient.shouldInterceptRequest(webView, webResourceRequest);
                int i11 = 24 / 0;
            } else {
                webViewClient.shouldInterceptRequest(webView, webResourceRequest);
            }
        } catch (Throwable th) {
            Ab.a0(c(Drawable.resolveOpacity(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 22, (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), c(338 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 43 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16392)).intern(), th, false);
        }
        WebViewClient webViewClient2 = this.f13795a;
        if (webViewClient2 == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        f13794f = (f13793e + 75) % 128;
        WebResourceResponse webResourceResponseShouldInterceptRequest = webViewClient2.shouldInterceptRequest(webView, webResourceRequest);
        f13794f = (f13793e + 69) % 128;
        return webResourceResponseShouldInterceptRequest;
    }
}
