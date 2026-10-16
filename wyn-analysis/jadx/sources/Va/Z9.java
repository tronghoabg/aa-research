package Va;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
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
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes4.dex */
public final class Z9 extends WebChromeClient implements InterfaceC0950e0, Q6 {

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13908c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f13909d;

    /* renamed from: e, reason: collision with root package name */
    public static int f13910e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13911f = 1;

    /* renamed from: a, reason: collision with root package name */
    public final WebChromeClient f13912a;

    /* renamed from: b, reason: collision with root package name */
    public final WebChromeClient f13913b;

    static {
        char[] cArr = new char[1163];
        R8.v.k("\u0000WWy®Z\u0005\u0017\\\u0018³þ\nÇa©¸\u0085\u000f¿gt¾]\u00155l\u0002Ãü\u001aàq¥È¿\u001f\u0097wfÎQ%8|\u0007Óö\u0001\u0014V?¯\u001b\u0004j]S²ý\u000b\u0090`û¹\u0091\u000eÀf\u001d¿\u0007\u0014MmTÂª\u001b\u0081pôÉã\u001eÌv7ÏA$r}WÒ\u0085+\u0083\u0080\u0082Ùî.×\u0086$ß\u000e4j\u008dvâ¹;¬\u0090\u0087éâ>Ä\u00969\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c0ãé:è\u0091Ôè±\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c-ãã:ó\u0091Ö\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ßØ½/\u009d\u0087fÞI5,\u008c0ãï:é\u0091Ûè¼?¹\u0097oîGE*\u009c5ó\u000eJô;ýlÖ\u0095ò>\u0083gº\u0088\u00141yZ\u0012\u0083x4)\\ô\u0085î.¤W½øC!hJ\u001dó\n$%LÞõ¨\u001e\u009bG¾èo\u0011pºkã\u0017\u0014\u000f¼Ýåç\u000e\u0084·³ØU\u0001rªiÓ\t\u0004?±¿æ\u0094\u001f°´Áíø\u0002V»;ÐP\t:¾kÖ¶\u000f¬¤æÝÿr\u0001«*À_yH®gÆ\u009c\u007fê\u0094ÙÍüb6\u009b30\"iG\u009eM6\u009fo¥\u0084Æ=ñR\u0017\u008b0 +YK\u008e}\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÇ*Ò\u0081ÙØ¹/\u0080\u0087uÞ{5!\u008c\nãä:ó\u0091Ï\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÖ*Å\u0081ÍØ\u00ad/\u0091\u0087cÞX5\u000e\u008c\u000bãã:é\u0091Ë \u00ad÷\u0086\u000e¢¥Óüê\u0013Dª)ÁB\u0018(¯yÇ¤\u001e¾µôÌíc\u0013º8ÑMhZ¿u×\u008enø\u0085ËÜîs/\u008a$!;xC\u008fy'¯~\u00ad\u0095Î,èC\u0007\u009a\u0003\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081ýØ´/\u0091\u0087bÞX\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081ÿØ·/\u009a\u0087vÞE5:\u008c\tÜø\u008bÓr÷Ù\u0086\u0080¿o\u0011Ö|½\u0017d}Ó,»ñbëÉ¡°¸\u001fFÆm\u00ad\u0018\u0014\u000fÃ «Û\u0012\u00adù\u009e »\u000fsön]Q\u0004\u0017ó&[À\u0002áé\u0081\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081þØ½/\u0092\u0087\u007fÞ^5-\u008c1ãî:ð\u0091×èµ?\u0094Cú\u0014ÑíõF\u0084\u001f½ð\u0013I~\"\u0015û\u007fL.$óýéV£/º\u0080DYo2\u001a\u008b\r\\\"4Ù\u008d¯f\u009c?¹\u0090~igÂ`\u009b\u0002l.ÄË\u009döv\u0093Ï\u009f ^yWÒf«\t|.ÔÀ\u00adò\u0006ªßª°¬\tSâj<(k\u0003\u0092'9V`o\u008fÁ6¬]Ç\u0084\u00ad3ü[!\u0082;)qPhÿ\u0096&½MÈôß#ðK\u000bò}\u0019N@kï®\u0016¨½¾äÙ\u0013ö»\u001eâ \tQ°`ß\u0082\u0006\u009f\u00ad\u0085ÔÜ\u0003ï«\fÒ,yZ ~Ïxv\u009a\u009d·ÄÎsÒ\u009b\rÂ&iZ\u0090a?gf\u0096\u008d°4Ñcñü\u0086«\u00adR\u0089ùø ÁOoö\u0002\u009diD\u0003óR\u009b\u008fB\u0095éß\u0090Æ?8æ\u0013\u008df4qã^\u008b¥2ÓÙà\u0080Å/\u0000Ö\u0006}\u0010$wÓX{°\"\u008eÉÿpÎ\u001f,Æ1m+\u0014rÃAk¢\u0012\u0082¹ô`Ð\u000fÖ¶4]\u0019\u0004`³g[¢\u0002\u0083©æPÏÿÉ¦8M\u001eô\u007f£_\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÔ*Å\u0081ÎØµ/\u009d\u0087cÞ_5!\u008c\u000bãî:Î\u0091Ýè¥?\u0085\u0097iî[E0Vh\u0001CøgS\u0016\n/å\u0081\\ì7\u0087îíY²1TèuC\u0011:(\u0095ËLî'Í\u009e\u009eI§!P\u0098zs\b*+\u0085\u0089|â×ÿ\u008e¥y¼ÑO\u0088lc\fÚ:µÞlØÇú¾\u0097i\u008fÁD¸t\u0013\u001cÊ(¥\"\u001cÁ\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÔ*Å\u0081ÎØµ/\u009d\u0087cÞ_5!\u008c\u000bãî:Î\u0091Ýè¥?\u0085\u0097iî[E0\u009c#ó\u001dJö¡×øµO\u0080§mþ@\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u009fgy¾X\u0015<l\u0005Ãæ\u001aÃqàÈ³\u001f\u008aw}ÎW%%|\u0006Ó¤*Ï\u0081ÒØ\u0088/\u0091\u0087bÞA5!\u008c\u0017ãó:õ\u0091×èº?¢\u0097iîYE1\u009c\u0005ó\u000fJì¡÷ø±O\u0082§kþAU,¬9\u0003\u001c\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÎ*Ó\u0081èØ±/\u0099\u0087uÞC5=\u008c\u0010\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%#|\u0006ÓÇ*Ï\u0081ÒØ«/\u009b\u0087|ÞI5\u0005\u008c\u0001ãó:ï\u0091Ùè³?\u0095fZ1qÈUc$:\u001dÕ³lÞ\u0007µÞßi\u008e\u0001SØIs\u0003\n\u001a¥ä|Ï\u0017º®\u00ady\u0082\u0011y¨\u000fC4\u001a\u0012µïLûçÆ¾¡I\u008aáz¸_S#ê-\u0085ö\\ç÷Â\u008e¤Y¿ñ|\u0088D#/ú\u001a\u0095\u0011Sô\u0004ßýûV\u008a\u000f³à\u001dYp2\u001bëq\\ 4ýíçF\u00ad?´\u0090JIa\"\u0014\u009b\u0003L,$×\u009d¡v\u009a/¼\u0080AyGÒd\u008b\r| ÔÎ\u008dÑf\u0096ß´°UiDÂg»\u0002l\u0011ÄÏ½ö\u0016\u0092Ï£ ¨\u0019Zòv«7\u001c4ôÜ\u00adâ\u0000EWn®J\u0005;\\\u0002³¬\nÁaª¸À\u000f\u0091gL¾V\u0015\u001cl\u0005Ãû\u001aÐq¥È²\u001f\u009dwfÎ\u0010%+|\rÓð*ö\u0081ÕØ«/\u009d\u0087dÞI5,\u008c,ãé:ï\u0091Ìè»?\u0082\u0097us\u009b$°Ý\u0094vå/ÜÀry\u001f\u0012tË\u001e|O\u0014\u0092Í\u0088fÂ\u001fÛ°%i\u000e\u0002{»llC\u0004¸½ÎVý\u000fØ \tY\u0016ò\r«q\\lô§\u00ad\u009eFóÿù\u00906I-â\t\u009byLKä \u0005ãRý«È\u0000\u0087Y\u0086¶i\u000f\\d0½\u0001\n\u001cbË»Õ\u0010¶i«Æd\u001fRt+Í5\u001a\u0019rÓËØ ¡y\u0089Ön/P\u0000gWy®L\u0005\u0000\\\u0012³Û\nÍa¦¸£\u000f\u0094gj¾[\u0015=l\tÃË\u001aÈq©È¹\u001f\u0096w`\u0000EWn®J\u0005;\\\u0002³¬\nßa¬¸\u0089\u000f\u0090g}¾\u0014\u00155l\u0014Ãí\u001aÇqµÈ¨\u001f\u0091wzÎW%l|?Óá*Â\u0081ÿØ°/\u0086\u0087\u007fÞA5-\u008c'ãì:õ\u0091Ýèº?\u0084\u0097HîME'\u009c\u000fó\u000eJù¡Àø¿O\u009e§(þJU!¬(\u0003\u0011Zâ±Õ\bì_\u0085·a\u000eTeT¼7\u0013\u0010j°Á\u008b/1", "ISO-8859-1", cArr, 0, 1163);
        f13908c = cArr;
        f13909d = 515938261104940828L;
    }

    public Z9(WebChromeClient webChromeClient, WebChromeClient webChromeClient2) {
        this.f13912a = webChromeClient;
        this.f13913b = webChromeClient2;
    }

    public static String b(int i5, int i10, char c10) {
        String str;
        synchronized (Ab.f13218u) {
            try {
                char[] cArr = new char[i10];
                Ab.f13217t = 0;
                while (true) {
                    int i11 = Ab.f13217t;
                    if (i11 < i10) {
                        cArr[i11] = (char) ((f13908c[i5 + i11] ^ (i11 * f13909d)) ^ c10);
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    @Override // Va.Q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Va.C1214y7 r10, java.lang.String r11, java.util.ArrayList r12, Va.Ra r13, Va.C1203x8 r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z9.a(Va.y7, java.lang.String, java.util.ArrayList, Va.Ra, Va.x8):java.lang.Object");
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        int i5 = f13910e + 39;
        f13911f = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(M6.E(25, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), ViewConfiguration.getScrollBarFadeDuration() >> 16), b(KeyEvent.keyCodeFromString("") + 889, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 41, (char) (26143 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), th, false);
        }
        if (i10 == 0) {
            webChromeClient.getDefaultVideoPoster();
            throw null;
        }
        webChromeClient.getDefaultVideoPoster();
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 != null) {
            int i11 = f13910e + 103;
            f13911f = i11 % 128;
            if (i11 % 2 != 0) {
                return webChromeClient2.getDefaultVideoPoster();
            }
            webChromeClient2.getDefaultVideoPoster();
            throw null;
        }
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        int i12 = f13911f + 15;
        f13910e = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 61 / 0;
        }
        return defaultVideoPoster;
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        f13910e = (f13911f + 99) % 128;
        try {
            this.f13913b.getVideoLoadingProgressView();
            f13911f = (f13910e + 59) % 128;
        } catch (Throwable th) {
            Ab.a0(b(Color.green(0), TextUtils.lastIndexOf("", '0') + 25, (char) View.combineMeasuredStates(0, 0)).intern(), M6.E(48, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) ((-16755791) - Color.rgb(0, 0, 0)), KeyEvent.getDeadChar(0, 0) + 931), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            return webChromeClient.getVideoLoadingProgressView();
        }
        View videoLoadingProgressView = super.getVideoLoadingProgressView();
        int i5 = f13910e + 41;
        f13911f = i5 % 128;
        if (i5 % 2 != 0) {
            return videoLoadingProgressView;
        }
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public final void getVisitedHistory(ValueCallback valueCallback) {
        f13911f = (f13910e + 55) % 128;
        try {
            this.f13913b.getVisitedHistory(valueCallback);
        } catch (Throwable th) {
            Ab.a0(b(ViewConfiguration.getDoubleTapTimeout() >> 16, 23 - TextUtils.indexOf((CharSequence) "", '0'), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), M6.E(38, Color.argb(0, 0, 0, 0), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 980 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            webChromeClient.getVisitedHistory(valueCallback);
            int i5 = f13911f + 61;
            f13910e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        super.getVisitedHistory(valueCallback);
        int i10 = f13910e + 115;
        f13911f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        f13911f = (f13910e + 103) % 128;
        try {
            this.f13913b.onCloseWindow(webView);
        } catch (Throwable th) {
            Ab.a0(M6.E(24, TextUtils.indexOf("", "", 0), (char) Color.green(0), '0' - AndroidCharacter.getMirror('0')), b(320 - Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) (41192 - KeyEvent.keyCodeFromString(""))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            super.onCloseWindow(webView);
            return;
        }
        int i5 = f13910e + 91;
        f13911f = i5 % 128;
        if (i5 % 2 == 0) {
            webChromeClient.onCloseWindow(webView);
            throw null;
        }
        webChromeClient.onCloseWindow(webView);
        f13911f = (f13910e + 75) % 128;
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i5, String str2) {
        int i10 = f13910e + 87;
        f13911f = i10 % 128;
        int i11 = i10 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
            if (i11 == 0) {
                webChromeClient.onConsoleMessage(str, i5, str2);
                int i12 = 12 / 0;
            } else {
                webChromeClient.onConsoleMessage(str, i5, str2);
            }
        } catch (Throwable th) {
            Ab.a0(M6.E(25, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), TextUtils.indexOf("", "", 0, 0)), M6.E(37, ViewConfiguration.getScrollDefaultDelay() >> 16, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (-16776364) - Color.rgb(0, 0, 0)), th, false);
        }
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 == null) {
            super.onConsoleMessage(str, i5, str2);
            return;
        }
        webChromeClient2.onConsoleMessage(str, i5, str2);
        int i13 = f13910e + 73;
        f13911f = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 90 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z2, boolean z10, Message message) {
        f13910e = (f13911f + 113) % 128;
        try {
            this.f13913b.onCreateWindow(webView, z2, z10, message);
        } catch (Throwable th) {
            Ab.a0(M6.E(24, ViewConfiguration.getKeyRepeatTimeout() >> 16, (char) (Process.myTid() >> 22), ViewConfiguration.getKeyRepeatTimeout() >> 16), b((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 249, View.resolveSize(0, 0) + 35, (char) Color.red(0)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            return super.onCreateWindow(webView, z2, z10, message);
        }
        int i5 = f13910e + 79;
        f13911f = i5 % 128;
        if (i5 % 2 != 0) {
            return webChromeClient.onCreateWindow(webView, z2, z10, message);
        }
        webChromeClient.onCreateWindow(webView, z2, z10, message);
        throw null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j8, long j10, long j11, WebStorage.QuotaUpdater quotaUpdater) {
        f13911f = (f13910e + 49) % 128;
        try {
            this.f13913b.onExceededDatabaseQuota(str, str2, j8, j10, j11, quotaUpdater);
        } catch (Throwable th) {
            Ab.a0(b(KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), b(484 - (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 44, (char) (17343 - View.MeasureSpec.makeMeasureSpec(0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            webChromeClient.onExceededDatabaseQuota(str, str2, j8, j10, j11, quotaUpdater);
            return;
        }
        super.onExceededDatabaseQuota(str, str2, j8, j10, j11, quotaUpdater);
        int i5 = f13910e + 83;
        f13911f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        try {
            this.f13913b.onGeolocationPermissionsHidePrompt();
            f13911f = (f13910e + 31) % 128;
        } catch (Throwable th) {
            Ab.a0(b(KeyEvent.getMaxKeyCode() >> 16, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, (char) View.combineMeasuredStates(0, 0)).intern(), b(583 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (Process.myPid() >> 22) + 55, (char) (64707 - Color.red(0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            f13910e = (f13911f + 39) % 128;
            webChromeClient.onGeolocationPermissionsHidePrompt();
            return;
        }
        super.onGeolocationPermissionsHidePrompt();
        int i5 = f13911f + 71;
        f13910e = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        f13910e = (f13911f + 29) % 128;
        try {
            this.f13913b.onGeolocationPermissionsShowPrompt(str, callback);
            f13911f = (f13910e + 77) % 128;
        } catch (Throwable th) {
            Ab.a0(M6.E(24, Color.argb(0, 0, 0, 0), (char) TextUtils.indexOf("", "", 0, 0), (-1) - ((byte) KeyEvent.getModifierMetaStateMask())), b(527 - MotionEvent.axisFromString(""), ExpandableListView.getPackedPositionChild(0L) + 56, (char) (15469 - View.getDefaultSize(0, 0))).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            return;
        }
        f13910e = (f13911f + 47) % 128;
        webChromeClient.onGeolocationPermissionsShowPrompt(str, callback);
        int i5 = f13910e + 117;
        f13911f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        try {
            this.f13913b.onHideCustomView();
            f13911f = (f13910e + 99) % 128;
        } catch (Throwable th) {
            Ab.a0(b(ViewConfiguration.getMaximumFlingVelocity() >> 16, 24 - View.resolveSize(0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), M6.E(36, TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 45562), 213 - KeyEvent.normalizeMetaState(0)), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            super.onHideCustomView();
            return;
        }
        int i5 = f13910e + 119;
        f13911f = i5 % 128;
        if (i5 % 2 != 0) {
            webChromeClient.onHideCustomView();
        } else {
            webChromeClient.onHideCustomView();
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f13913b.onJsAlert(webView, str, str2, jsResult);
        } catch (Throwable th) {
            Ab.a0(b(Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25, (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern(), M6.E(30, TextUtils.indexOf("", "", 0), (char) Color.alpha(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 355), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            boolean zOnJsAlert = super.onJsAlert(webView, str, str2, jsResult);
            int i5 = f13911f + 23;
            f13910e = i5 % 128;
            if (i5 % 2 == 0) {
                return zOnJsAlert;
            }
            throw null;
        }
        int i10 = f13911f + 15;
        f13910e = i10 % 128;
        if (i10 % 2 != 0) {
            webChromeClient.onJsAlert(webView, str, str2, jsResult);
            throw null;
        }
        boolean zOnJsAlert2 = webChromeClient.onJsAlert(webView, str, str2, jsResult);
        f13910e = (f13911f + 21) % 128;
        return zOnJsAlert2;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        f13911f = (f13910e + 87) % 128;
        try {
            this.f13913b.onJsBeforeUnload(webView, str, str2, jsResult);
        } catch (Throwable th) {
            Ab.a0(b(KeyEvent.getDeadChar(0, 0), 24 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "")).intern(), b(447 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 37, (char) (ImageFormat.getBitsPerPixel(0) + 1)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            return super.onJsBeforeUnload(webView, str, str2, jsResult);
        }
        boolean zOnJsBeforeUnload = webChromeClient.onJsBeforeUnload(webView, str, str2, jsResult);
        f13911f = (f13910e + 97) % 128;
        return zOnJsBeforeUnload;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        try {
            this.f13913b.onJsConfirm(webView, str, str2, jsResult);
        } catch (Throwable th) {
            Ab.a0(b(ImageFormat.getBitsPerPixel(0) + 1, View.MeasureSpec.getMode(0) + 24, (char) (KeyEvent.getMaxKeyCode() >> 16)).intern(), M6.E(33, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) Color.green(0), ExpandableListView.getPackedPositionGroup(0L) + 384), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            boolean zOnJsConfirm = super.onJsConfirm(webView, str, str2, jsResult);
            f13910e = (f13911f + 113) % 128;
            return zOnJsConfirm;
        }
        int i5 = f13911f + 59;
        f13910e = i5 % 128;
        if (i5 % 2 == 0) {
            return webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        }
        webChromeClient.onJsConfirm(webView, str, str2, jsResult);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    @Override // android.webkit.WebChromeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onJsPrompt(android.webkit.WebView r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.webkit.JsPromptResult r13) {
        /*
            r8 = this;
            int r0 = Va.Z9.f13911f
            int r0 = r0 + 47
            int r0 = r0 % 128
            Va.Z9.f13910e = r0
            android.webkit.WebChromeClient r1 = r8.f13913b     // Catch: java.lang.Throwable -> L20
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.onJsPrompt(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L18
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L65
        L18:
            r0 = move-exception
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
        L1e:
            r9 = r0
            goto L27
        L20:
            r0 = move-exception
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            goto L1e
        L27:
            r10 = 0
            int r11 = android.graphics.Color.red(r10)
            char r11 = (char) r11
            int r12 = android.view.View.combineMeasuredStates(r10, r10)
            int r13 = android.os.Process.myPid()
            int r13 = r13 >> 22
            int r13 = r13 + 24
            java.lang.String r11 = b(r12, r13, r11)
            java.lang.String r11 = r11.intern()
            int r12 = android.view.ViewConfiguration.getDoubleTapTimeout()
            int r12 = r12 >> 16
            r13 = 56509(0xdcbd, float:7.9186E-41)
            int r13 = r13 - r12
            char r12 = (char) r13
            int r13 = android.graphics.Color.blue(r10)
            int r13 = 416 - r13
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getCapsMode(r0, r10, r10)
            int r0 = r0 + 31
            java.lang.String r12 = b(r13, r0, r12)
            java.lang.String r12 = r12.intern()
            Va.Ab.a0(r11, r12, r9, r10)
        L65:
            android.webkit.WebChromeClient r2 = r8.f13912a
            if (r2 == 0) goto L7f
            int r9 = Va.Z9.f13910e
            int r9 = r9 + 47
            int r10 = r9 % 128
            Va.Z9.f13911f = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L7a
            boolean r9 = r2.onJsPrompt(r3, r4, r5, r6, r7)
            return r9
        L7a:
            r2.onJsPrompt(r3, r4, r5, r6, r7)
            r9 = 0
            throw r9
        L7f:
            r9 = r3
            r10 = r4
            r11 = r5
            r12 = r6
            r13 = r7
            boolean r9 = super.onJsPrompt(r9, r10, r11, r12, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Z9.onJsPrompt(android.webkit.WebView, java.lang.String, java.lang.String, java.lang.String, android.webkit.JsPromptResult):boolean");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsTimeout() {
        f13910e = (f13911f + 49) % 128;
        try {
            this.f13913b.onJsTimeout();
        } catch (Throwable th) {
            Ab.a0(M6.E(23, TextUtils.lastIndexOf("", '0', 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), ViewConfiguration.getPressedStateDuration() >> 16), M6.E(33, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 820 - TextUtils.getCapsMode("", 0, 0)), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            f13910e = (f13911f + 5) % 128;
            return webChromeClient.onJsTimeout();
        }
        boolean zOnJsTimeout = super.onJsTimeout();
        f13910e = (f13911f + 31) % 128;
        return zOnJsTimeout;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        int i5 = f13910e + 27;
        f13911f = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(b((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 24, (char) Gravity.getAbsoluteGravity(0, 0)).intern(), b(638 - (ViewConfiguration.getPressedStateDuration() >> 16), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), th, false);
        }
        if (i10 == 0) {
            webChromeClient.onPermissionRequest(permissionRequest);
            throw null;
        }
        webChromeClient.onPermissionRequest(permissionRequest);
        f13910e = (f13911f + 69) % 128;
        try {
            WebChromeClient webChromeClient2 = this.f13912a;
            if (webChromeClient2 == null) {
                super.onPermissionRequest(permissionRequest);
                return;
            }
            int i11 = f13911f + 29;
            f13910e = i11 % 128;
            if (i11 % 2 != 0 && Build.VERSION.SDK_INT < 83) {
                return;
            }
            webChromeClient2.onPermissionRequest(permissionRequest);
        } catch (Throwable th2) {
            Ab.a0(M6.E(24, ViewConfiguration.getScrollBarSize() >> 8, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "")), b(679 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), Color.rgb(0, 0, 0) + 16777259, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22061)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        int i5 = f13911f + 101;
        f13910e = i5 % 128;
        if (i5 % 2 != 0) {
            try {
                if (Build.VERSION.SDK_INT >= 58) {
                    this.f13913b.onPermissionRequestCanceled(permissionRequest);
                }
            } catch (Throwable th) {
                Ab.a0(M6.E(25, (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0)), b(TextUtils.lastIndexOf("", '0', 0, 0) + 722, (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 48, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th, false);
            }
        } else {
            this.f13913b.onPermissionRequestCanceled(permissionRequest);
        }
        try {
            WebChromeClient webChromeClient = this.f13912a;
            if (webChromeClient == null) {
                super.onPermissionRequestCanceled(permissionRequest);
                return;
            }
            int i10 = f13910e + 71;
            f13911f = i10 % 128;
            if (i10 % 2 == 0) {
                webChromeClient.onPermissionRequestCanceled(permissionRequest);
                throw null;
            }
            webChromeClient.onPermissionRequestCanceled(permissionRequest);
            int i11 = f13911f + 89;
            f13910e = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Ab.a0(M6.E(24, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), KeyEvent.normalizeMetaState(0)), b(Color.blue(0) + 769, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 50, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1)).intern(), th2, false);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        int i10 = f13911f + 39;
        f13910e = i10 % 128;
        int i11 = i10 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(b(ViewConfiguration.getTouchSlop() >> 8, 23 - Process.getGidForName(""), (char) TextUtils.getTrimmedLength("")).intern(), M6.E(38, (Process.getThreadPriority(0) + 20) >> 6, (char) (AndroidCharacter.getMirror('0') + 289), KeyEvent.normalizeMetaState(0) + 24), th, false);
        }
        if (i11 != 0) {
            webChromeClient.onProgressChanged(webView, i5);
            throw null;
        }
        webChromeClient.onProgressChanged(webView, i5);
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 == null) {
            super.onProgressChanged(webView, i5);
            return;
        }
        f13911f = (f13910e + 65) % 128;
        webChromeClient2.onProgressChanged(webView, i5);
        int i12 = f13910e + 45;
        f13911f = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        int i5 = f13911f + 53;
        f13910e = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(b(MotionEvent.axisFromString("") + 1, View.resolveSizeAndState(0, 0, 0) + 24, (char) KeyEvent.getDeadChar(0, 0)).intern(), b(98 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 35, (char) KeyEvent.normalizeMetaState(0)).intern(), th, false);
        }
        if (i10 != 0) {
            webChromeClient.onReceivedIcon(webView, bitmap);
            throw null;
        }
        webChromeClient.onReceivedIcon(webView, bitmap);
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 != null) {
            f13910e = (f13911f + 79) % 128;
            webChromeClient2.onReceivedIcon(webView, bitmap);
            return;
        }
        super.onReceivedIcon(webView, bitmap);
        int i11 = f13910e + 23;
        f13911f = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        int i5 = f13911f + 117;
        f13910e = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(b((-1) - TextUtils.indexOf((CharSequence) "", '0'), 24 - Color.green(0), (char) KeyEvent.getDeadChar(0, 0)).intern(), b((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 62, TextUtils.lastIndexOf("", '0') + 37, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern(), th, false);
        }
        if (i10 != 0) {
            webChromeClient.onReceivedTitle(webView, str);
            throw null;
        }
        webChromeClient.onReceivedTitle(webView, str);
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 == null) {
            super.onReceivedTitle(webView, str);
            return;
        }
        int i11 = f13910e + 77;
        f13911f = i11 % 128;
        if (i11 % 2 != 0) {
            webChromeClient2.onReceivedTitle(webView, str);
        } else {
            webChromeClient2.onReceivedTitle(webView, str);
            int i12 = 44 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z2) {
        int i5 = f13910e + 81;
        f13911f = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(M6.E(24, ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (Process.getThreadPriority(0) + 20) >> 6), b(133 - (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 43, (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern(), th, false);
        }
        if (i10 == 0) {
            webChromeClient.onReceivedTouchIconUrl(webView, str, z2);
            throw null;
        }
        webChromeClient.onReceivedTouchIconUrl(webView, str, z2);
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 == null) {
            super.onReceivedTouchIconUrl(webView, str, z2);
            return;
        }
        webChromeClient2.onReceivedTouchIconUrl(webView, str, z2);
        int i11 = f13911f + 27;
        f13910e = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onRequestFocus(WebView webView) {
        int i5 = f13910e + 89;
        f13911f = i5 % 128;
        int i10 = i5 % 2;
        WebChromeClient webChromeClient = this.f13913b;
        try {
        } catch (Throwable th) {
            Ab.a0(b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, 24 - View.MeasureSpec.getSize(0), (char) Color.blue(0)).intern(), b(Color.alpha(0) + 285, (Process.myPid() >> 22) + 35, (char) ((-1) - TextUtils.lastIndexOf("", '0'))).intern(), th, false);
        }
        if (i10 == 0) {
            webChromeClient.onRequestFocus(webView);
            throw null;
        }
        webChromeClient.onRequestFocus(webView);
        f13910e = (f13911f + 119) % 128;
        WebChromeClient webChromeClient2 = this.f13912a;
        if (webChromeClient2 == null) {
            super.onRequestFocus(webView);
        } else {
            f13911f = (f13910e + 13) % 128;
            webChromeClient2.onRequestFocus(webView);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        f13911f = (f13910e + 57) % 128;
        try {
            this.f13913b.onShowCustomView(view, customViewCallback);
        } catch (Throwable th) {
            Ab.a0(b(View.getDefaultSize(0, 0), Color.alpha(0) + 24, (char) (ViewConfiguration.getScrollBarSize() >> 8)).intern(), b(MotionEvent.axisFromString("") + 177, 37 - View.getDefaultSize(0, 0), (char) ((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 15288)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient == null) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        webChromeClient.onShowCustomView(view, customViewCallback);
        int i5 = f13911f + 45;
        f13910e = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 10 / 0;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        int i5 = f13910e + 51;
        f13911f = i5 % 128;
        if (i5 % 2 == 0) {
            try {
                if (Build.VERSION.SDK_INT >= 104) {
                    this.f13913b.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
            } catch (Throwable th) {
                Ab.a0(b((Process.getThreadPriority(0) + 20) >> 6, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), b(View.resolveSize(0, 0) + 1017, KeyEvent.normalizeMetaState(0) + 38, (char) (Color.blue(0) + 29662)).intern(), th, false);
            }
        } else {
            this.f13913b.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            f13910e = (f13911f + 9) % 128;
            f13910e = (f13911f + 119) % 128;
            return webChromeClient.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        boolean zOnShowFileChooser = super.onShowFileChooser(webView, valueCallback, fileChooserParams);
        f13910e = (f13911f + 27) % 128;
        return zOnShowFileChooser;
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i5, WebChromeClient.CustomViewCallback customViewCallback) {
        try {
            this.f13913b.onShowCustomView(view, i5, customViewCallback);
        } catch (Throwable th) {
            Ab.a0(M6.E(24, ViewConfiguration.getWindowTouchSlop() >> 8, (char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSize(0, 0)), b(TextUtils.getOffsetBefore("", 0) + 176, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15287)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            f13910e = (f13911f + 31) % 128;
            webChromeClient.onShowCustomView(view, i5, customViewCallback);
            return;
        }
        super.onShowCustomView(view, i5, customViewCallback);
        int i10 = f13910e + 33;
        f13911f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        try {
            this.f13913b.onConsoleMessage(consoleMessage);
        } catch (Throwable th) {
            Ab.a0(M6.E(24, (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), Process.getGidForName("") + 1), b(852 - View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 37, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), th, false);
        }
        WebChromeClient webChromeClient = this.f13912a;
        if (webChromeClient != null) {
            int i5 = f13911f + 7;
            f13910e = i5 % 128;
            if (i5 % 2 == 0) {
                return webChromeClient.onConsoleMessage(consoleMessage);
            }
            webChromeClient.onConsoleMessage(consoleMessage);
            throw null;
        }
        boolean zOnConsoleMessage = super.onConsoleMessage(consoleMessage);
        f13911f = (f13910e + 89) % 128;
        return zOnConsoleMessage;
    }
}
