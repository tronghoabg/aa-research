package Va;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.webview.WebView;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.Invocation;
import com.unity3d.services.core.webview.bridge.NativeCallback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class O6 extends WebViewApp implements H9 {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f13563d = {'W', 'e', 'b', 'V', 'i', 'w', 'A', 'p', '.', 's', 't', 'L', 'o', 'a', 'd', 'F', 'l', 'u', 'r', 'M', 'g', 'C', 'I', 'n', 'z', 'f', 'v', 'k', 'h', 'c', 'm', 'X', 'Y', 'Z', '[', '\\'};

    /* renamed from: e, reason: collision with root package name */
    public static int f13564e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f13565f = 1;

    /* renamed from: a, reason: collision with root package name */
    public final WebViewApp f13566a;

    /* renamed from: b, reason: collision with root package name */
    public final Ra f13567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P6 f13568c;

    public O6(P6 p62, WebViewApp webViewApp, Ra ra2) {
        this.f13568c = p62;
        this.f13566a = webViewApp;
        this.f13567b = ra2;
    }

    public static String a(byte b5, int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13194B) {
            try {
                char[] cArr = f13563d;
                char[] cArr2 = new char[i5];
                if (i5 % 2 != 0) {
                    i5--;
                    cArr2[i5] = (char) (charArray[i5] - b5);
                }
                if (i5 > 1) {
                    Ab.f13193A = 0;
                    while (true) {
                        int i10 = Ab.f13193A;
                        if (i10 >= i5) {
                            break;
                        }
                        char c10 = charArray[i10];
                        int i11 = i10 + 1;
                        char c11 = charArray[i11];
                        if (c10 == c11) {
                            cArr2[i10] = (char) (c10 - b5);
                            cArr2[i11] = (char) (c11 - b5);
                        } else {
                            int i12 = c10 / 6;
                            int i13 = c10 % 6;
                            int i14 = c11 / 6;
                            int i15 = c11 % 6;
                            if (i13 == i15) {
                                cArr2[i10] = cArr[(((i12 + 5) % 6) * 6) + i13];
                                cArr2[i11] = cArr[(((i14 + 5) % 6) * 6) + i15];
                            } else if (i12 == i14) {
                                cArr2[i10] = cArr[(i12 * 6) + ((i13 + 5) % 6)];
                                cArr2[i11] = cArr[(i14 * 6) + ((i15 + 5) % 6)];
                            } else {
                                cArr2[i10] = cArr[(i12 * 6) + i15];
                                cArr2[i11] = cArr[(i14 * 6) + i13];
                            }
                        }
                        Ab.f13193A = i10 + 2;
                    }
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String b(char c10, String str, String str2, int i5) {
        String str3;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = str.toCharArray();
        char[] charArray3 = "﮺藹\ude48쨡".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) i5));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13933q;
                    if (i10 < length) {
                        int i11 = (i10 + 3) % 4;
                        int i12 = cArr[i10 % 4] * 32718;
                        char c11 = cArr2[(i10 + 2) % 4];
                        char c12 = (char) ((i12 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr2[i11] = (char) (((cArr[i11] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr[i11] = c12;
                        long j8 = (charArray[i10] ^ c12) ^ (-3881577000749892678L);
                        long j10 = 0;
                        cArr3[i10] = (char) ((j8 ^ j10) ^ j10);
                        AbstractC0897a.f13933q = i10 + 1;
                    } else {
                        str3 = new String(cArr3);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void addCallback(NativeCallback nativeCallback) {
        this.f13568c.B0(this, this.f13567b, a((byte) (31 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u008f\u008f\u0007\u000e\u0083\u0083\u0013\u000f\u008b\u008b\u0001\u000e\u0018\u001c").intern(), nativeCallback);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            f13565f = (f13564e + 31) % 128;
            webViewApp.addCallback(nativeCallback);
            f13564e = (f13565f + 31) % 128;
        }
    }

    @Override // Va.H9
    public final Object d() {
        int i5 = (f13565f + 93) % 128;
        f13564e = i5;
        f13565f = (i5 + 71) % 128;
        return this.f13566a;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final NativeCallback getCallback(String str) {
        f13564e = (f13565f + 49) % 128;
        this.f13568c.B0(this, this.f13567b, b((char) TextUtils.getOffsetBefore("", 0), "\ud963願\uf466窹", "꺗㏼텇㼊볊霺ꪆ⸘⠺Ⴄꅛ홙Ἂꅹ厃阡\uf793═ኅ輙퐍鶦", View.resolveSize(0, 0)).intern(), str);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return null;
        }
        NativeCallback callback = webViewApp.getCallback(str);
        int i5 = f13565f + 5;
        f13564e = i5 % 128;
        if (i5 % 2 == 0) {
            return callback;
        }
        throw null;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final Configuration getConfiguration() {
        f13564e = (f13565f + 43) % 128;
        int absoluteGravity = 27 - Gravity.getAbsoluteGravity(0, 0);
        this.f13568c.B0(this, this.f13567b, a((byte) (123 - TextUtils.lastIndexOf("", '0', 0)), absoluteGravity, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bìì\u000e\u001a\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\f\u0017\u0010\u0007\u0000\u0010ê").intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return null;
        }
        f13565f = (f13564e + 49) % 128;
        return webViewApp.getConfiguration();
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final ErrorState getErrorStateFromWebAppCode() {
        f13564e = (f13565f + 21) % 128;
        this.f13568c.B0(this, this.f13567b, b((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "뀜ቐ\u0fdf缀", "⭑伳㶒坍\uf7f4\ueb1f苝犉\ue2c6暫輢齄귡胷ꄖ盾╓\ued3aᒿ姖겊媪ퟫ氉扻\ud9a9ཏᶆ\udde8ﭯ\uf38c寥ꬾ赱\uf192ꜿⅮ彨", ViewConfiguration.getScrollDefaultDelay() >> 16).intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return null;
        }
        int i5 = f13564e + 117;
        f13565f = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewApp.getErrorStateFromWebAppCode();
        }
        int i10 = 71 / 0;
        return webViewApp.getErrorStateFromWebAppCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        r0 = r4.getWebAppFailureCode();
        Va.O6.f13564e = (Va.O6.f13565f + 45) % 128;
     */
    @Override // com.unity3d.services.core.webview.WebViewApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getWebAppFailureCode() {
        /*
            r7 = this;
            int r0 = Va.O6.f13565f
            int r0 = r0 + 13
            int r1 = r0 % 128
            Va.O6.f13564e = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u000e\u001a\u0004\u0007\u0001\u0002\u0000\b\u0082\u0082\u0010\u000e\n\u0016\f\u0017\u0003\u0013\r\u000fw"
            Va.Ra r2 = r7.f13567b
            Va.P6 r3 = r7.f13568c
            com.unity3d.services.core.webview.WebViewApp r4 = r7.f13566a
            r5 = 0
            if (r0 == 0) goto L34
            r0 = 120(0x78, float:1.68E-43)
            r6 = 1
            int r6 = android.view.View.resolveSizeAndState(r6, r6, r5)
            int r0 = r0 >>> r6
            int r6 = android.view.KeyEvent.normalizeMetaState(r5)
            int r6 = 34 - r6
            byte r6 = (byte) r6
            java.lang.String r0 = a(r6, r0, r1)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r3.B0(r7, r2, r0, r1)
            if (r4 == 0) goto L5d
            goto L50
        L34:
            int r0 = android.view.View.resolveSizeAndState(r5, r5, r5)
            int r0 = 31 - r0
            int r6 = android.view.KeyEvent.normalizeMetaState(r5)
            int r6 = 18 - r6
            byte r6 = (byte) r6
            java.lang.String r0 = a(r6, r0, r1)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r3.B0(r7, r2, r0, r1)
            if (r4 == 0) goto L5d
        L50:
            int r0 = r4.getWebAppFailureCode()
            int r1 = Va.O6.f13565f
            int r1 = r1 + 45
            int r1 = r1 % 128
            Va.O6.f13564e = r1
            return r0
        L5d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.O6.getWebAppFailureCode():int");
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final String getWebAppFailureMessage() {
        int iLastIndexOf = 33 - TextUtils.lastIndexOf("", '0', 0, 0);
        this.f13568c.B0(this, this.f13567b, a((byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 74), iLastIndexOf, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bºº\u000e\u001a\u0004\u0007\u0001\u0002\u0000\bºº\u0010\u000e\n\u0016\f\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002").intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            f13564e = (f13565f + 85) % 128;
            return null;
        }
        int i5 = f13565f + 73;
        f13564e = i5 % 128;
        if (i5 % 2 == 0) {
            return webViewApp.getWebAppFailureMessage();
        }
        webViewApp.getWebAppFailureMessage();
        throw null;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final WebView getWebView() {
        f13564e = (f13565f + 1) % 128;
        this.f13568c.B0(this, this.f13567b, b((char) ((-1) - Process.getGidForName("")), "⚡᭛쨷꺺", "모盂芧ᔯ恮\ud9af恝撅㕎슀송ꔦ쀙币씒痥搜钐⦧성䎼", 924539685 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return null;
        }
        WebView webView = webViewApp.getWebView();
        int i5 = f13564e + 63;
        f13565f = i5 % 128;
        if (i5 % 2 != 0) {
            return webView;
        }
        throw null;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final boolean invokeCallback(Invocation invocation) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f13568c.B0(this, this.f13567b, a((byte) (90 - (Process.myPid() >> 22)), 25 - TextUtils.getOffsetBefore("", 0), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÊÊ\n\u0002\u0014\u001d\u000f\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019Å").intern(), invocation);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            f13564e = (f13565f + 19) % 128;
            return false;
        }
        int i5 = f13564e + 85;
        f13565f = i5 % 128;
        if (i5 % 2 != 0) {
            return webViewApp.invokeCallback(invocation);
        }
        boolean zInvokeCallback = webViewApp.invokeCallback(invocation);
        int i10 = 87 / 0;
        return zInvokeCallback;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp, com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker
    public final boolean invokeMethod(String str, String str2, Method method, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f13565f = (f13564e + 125) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 2), 23 - (ViewConfiguration.getEdgeSlop() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000brr\n\u0002\u0014\u001d\u000f\u0018\u0007\u0019\u0004\u0007\u0018\u0010f").intern(), str, str2, method, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return false;
        }
        int i5 = f13565f + 39;
        f13564e = i5 % 128;
        if (i5 % 2 == 0) {
            return webViewApp.invokeMethod(str, str2, method, objArr);
        }
        webViewApp.invokeMethod(str, str2, method, objArr);
        throw null;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final boolean isWebAppInitialized() {
        f13564e = (f13565f + 53) % 128;
        this.f13568c.B0(this, this.f13567b, b((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 38393), "䨕\ue0cd\uf8d3뢕", "\uea27龇⤖ф\ueef1븻㤧\ua8dc4ꇢ畝屒䅼騸늮国ጦ刄췄昲笯ﭑꠘ冉칄\uf1a5\uf46a끑㐒殢", Color.green(0)).intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            f13565f = (f13564e + 83) % 128;
            return webViewApp.isWebAppInitialized();
        }
        f13564e = (f13565f + 121) % 128;
        return false;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final boolean isWebAppLoaded() {
        f13564e = (f13565f + 47) % 128;
        int iRgb = Color.rgb(0, 0, 0) + 16777241;
        this.f13568c.B0(this, this.f13567b, a((byte) (85 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), iRgb, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÅÅ\n\u0002\u0006\u0003\u0002\u0003\u0007\b\b\u0006\r\u000e\r\u0002¹").intern(), new Object[0]);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            return false;
        }
        boolean zIsWebAppLoaded = webViewApp.isWebAppLoaded();
        f13564e = (f13565f + 29) % 128;
        return zIsWebAppLoaded;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void removeCallback(NativeCallback nativeCallback) {
        f13564e = (f13565f + 33) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 84), (ViewConfiguration.getWindowTouchSlop() >> 8) + 25, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÄÄ\u0006\u0014\u0000\u001f\u000e\u0018\u0003\u0013\u000e\u0011\u000e\u0004\u0011\u0019¿").intern(), nativeCallback);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            int i5 = f13565f + 79;
            f13564e = i5 % 128;
            int i10 = i5 % 2;
            webViewApp.removeCallback(nativeCallback);
            if (i10 != 0) {
                throw null;
            }
        }
        f13565f = (f13564e + 41) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    @Override // com.unity3d.services.core.webview.WebViewApp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resetWebViewAppInitialization() {
        /*
            r9 = this;
            int r0 = Va.O6.f13564e
            int r0 = r0 + 87
            int r1 = r0 % 128
            Va.O6.f13565f = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r2 = "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0006\u0014\u0003\u0007\u0004\u0007\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u0082\u0082\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\f\u0010\n\u0011\u0012"
            Va.Ra r3 = r9.f13567b
            Va.P6 r4 = r9.f13568c
            com.unity3d.services.core.webview.WebViewApp r5 = r9.f13566a
            r6 = 0
            if (r0 != 0) goto L3a
            r0 = 60
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            r7 = 95
            int r0 = r7 >>> r0
            int r7 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r7 = r7 << 107
            r8 = 27
            int r7 = r8 >>> r7
            byte r7 = (byte) r7
            java.lang.String r0 = a(r7, r0, r2)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r4.B0(r9, r3, r0, r2)
            if (r5 == 0) goto L5d
            goto L5a
        L3a:
            r0 = 48
            char r0 = android.text.AndroidCharacter.getMirror(r0)
            int r0 = 88 - r0
            int r7 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r7 = r7 >> 16
            int r7 = r7 + 18
            byte r7 = (byte) r7
            java.lang.String r0 = a(r7, r0, r2)
            java.lang.String r0 = r0.intern()
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r4.B0(r9, r3, r0, r2)
            if (r5 == 0) goto L5d
        L5a:
            r5.resetWebViewAppInitialization()
        L5d:
            int r0 = Va.O6.f13565f
            int r0 = r0 + 17
            int r2 = r0 % 128
            Va.O6.f13564e = r2
            int r0 = r0 % r1
            if (r0 == 0) goto L69
            int r1 = r1 / r6
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.O6.resetWebViewAppInitialization():void");
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final boolean sendEvent(Enum r82, Enum r92, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        this.f13568c.B0(this, this.f13567b, b((char) TextUtils.getTrimmedLength(""), "\uda4a綰ٝ暅", "匢ṑ䨥\ue175寘鉧㘲ᵧ柔ĥ曤촥陥❾╄\uecf1训퀊̤쾅", KeyEvent.getMaxKeyCode() >> 16).intern(), r82, r92, Arrays.asList(objArr));
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp == null) {
            int i5 = f13564e + 25;
            f13565f = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 16 / 0;
            }
            return false;
        }
        int i11 = f13565f + 47;
        f13564e = i11 % 128;
        if (i11 % 2 == 0) {
            return webViewApp.sendEvent(r82, r92, objArr);
        }
        webViewApp.sendEvent(r82, r92, objArr);
        throw null;
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setConfiguration(Configuration configuration) {
        f13565f = (f13564e + 3) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7), (Process.myTid() >> 22) + 27, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bww\t\n\u0004\u0007\u0012\u000f\u0013\u001d\u0002\u0016\f\u0017\u0010\u0007\u0000\u0010u").intern(), configuration);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            webViewApp.setConfiguration(configuration);
        }
        int i5 = f13564e + 65;
        f13565f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 64 / 0;
        }
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setWebAppFailureCode(int i5) {
        this.f13568c.B0(this, this.f13567b, a((byte) (94 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 31, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÏÏ\t\n\u0004\u0007\u0001\u0002\u0000\bÏÏ\u0010\u000e\n\u0016\f\u0017\u0003\u0013\r\u000fÄ").intern(), Integer.valueOf(i5));
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            f13564e = (f13565f + 119) % 128;
            webViewApp.setWebAppFailureCode(i5);
        }
        int i10 = f13564e + 123;
        f13565f = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 90 / 0;
        }
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setWebAppFailureMessage(String str) {
        f13565f = (f13564e + 11) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) (46 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (ViewConfiguration.getTouchSlop() >> 8) + 34, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000b\u009e\u009e\t\n\u0004\u0007\u0001\u0002\u0000\b\u009e\u009e\u0010\u000e\n\u0016\f\u0017\u0007\u0019\u0003\u0007\u0007\u000f\u0013\u0002").intern(), str);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            webViewApp.setWebAppFailureMessage(str);
        }
        int i5 = f13565f + 75;
        f13564e = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 55 / 0;
        }
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setWebAppInitialized(boolean z2) {
        f13565f = (f13564e + 51) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) ((Process.myTid() >> 22) + 86), KeyEvent.normalizeMetaState(0) + 31, "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÆÆ\t\n\u0004\u0007\u0001\u0002\u0000\bÆÆ\u0017\u0012\n\u0010\u0001\u0010\u0016\n\u0019\u0000º").intern(), Boolean.valueOf(z2));
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            int i5 = f13564e + 31;
            f13565f = i5 % 128;
            int i10 = i5 % 2;
            webViewApp.setWebAppInitialized(z2);
            if (i10 == 0) {
                throw null;
            }
            f13564e = (f13565f + 19) % 128;
        }
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setWebAppLoaded(boolean z2) {
        f13564e = (f13565f + 69) % 128;
        this.f13568c.B0(this, this.f13567b, a((byte) (97 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0001\u0002\u0003\u0004\u0005\u0002\u0000\u000bÑÑ\t\n\u0004\u0007\u0001\u0002\u0000\bÑÑ\u0006\u0011\u000e\u000f\u0002\r").intern(), Boolean.valueOf(z2));
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            int i5 = f13565f + 67;
            f13564e = i5 % 128;
            int i10 = i5 % 2;
            webViewApp.setWebAppLoaded(z2);
            if (i10 != 0) {
                int i11 = 35 / 0;
            }
        }
        int i12 = f13565f + 95;
        f13564e = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.unity3d.services.core.webview.WebViewApp
    public final void setWebView(WebView webView) {
        this.f13568c.B0(this, this.f13567b, b((char) TextUtils.indexOf("", "", 0, 0), "荈犁鞵鮀", "ڨ剅逵㯍箆\udbd6嗨ả嗭\ue803䳙톍\ue4c1麥♟곯̍쪟괛⪑\ue00c", (-1250786941) - ExpandableListView.getPackedPositionGroup(0L)).intern(), webView);
        WebViewApp webViewApp = this.f13566a;
        if (webViewApp != null) {
            f13564e = (f13565f + 3) % 128;
            webViewApp.setWebView(webView);
        }
        int i5 = f13564e + 117;
        f13565f = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
