package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class W {

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f13802f = {242, 255, 245, 259, 256, 250, 191, 264, 246, 243, 252, 261, 244, 254, 248, 218, 222, 210, 263, 266, 257, 260, 253, 265, 200, 193};

    /* renamed from: g, reason: collision with root package name */
    public static int f13803g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f13804h = 1;

    /* renamed from: a, reason: collision with root package name */
    public final List f13805a = Arrays.asList(c("\u0001\u0004\u0016ￍ\u0003\b\u000e\u0011\u0003\r\u0000ￍ\f\u000e\u0002ￍ\u0016\u0004\b\u0015", 20 - (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) + 186, Color.green(0) + 15, true).intern(), b(127 - ExpandableListView.getPackedPositionGroup(0), "\u0087\u008c\u0086\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081").intern(), "");

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f13806b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final List f13807c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f13808d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f13809e;

    public W() throws JSONException {
        List listAsList = Arrays.asList(b(127 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0083\u0092\u0086\u008a\u0085\u0091\u0082\u0090\u0087\u008f\u0082\u0086\u0084\u0089\u0083\u0082\u0089\u0084\u0087\u0086\u008a\u0085\u008e\u0082\u0086\u0087\u008e\u0085\u008d").intern(), c("\r\b\u0011\u0004\u0003\r\u0004\u0011ￍ\u0012\u0003\u0000ￍ\b\u0001\u000e\f\r\bￍ\f\u000e\u0002\u0018\u0013\b\u0015\b\u0013\u0002￠\u0003￠\b\u0001\u000e￬\r￨ￍ\u0006", 41 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 186, 22 - ((byte) KeyEvent.getModifierMetaStateMask()), true).intern(), b(127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0090\u0087\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0086\u0087\u0089\u008f\u0081\u0096\u0089\u0084\u0095\u0087\u0085\u0086").intern(), c("\u000e\r\f\uffff\u000e\b￣\uffc8\u0003\u000f\uffc8\u0006\ufffb\u0003\u000e\u0003\u000e\r\f\uffff\u000e\b\u0003\uffc8\uffff\u0001\ufffb\r\uffff\f\n\uffc8\t\u0003\u0013\u000e\u0003\u0010\u0003\u000e�ￛ\u0006\ufffb\u0003\u000e\u0003", AndroidCharacter.getMirror('0') - 1, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 190, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 34, true).intern());
        this.f13807c = listAsList;
        b((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 127, "\u0095\u0093\u0088").intern();
        b(127 - (Process.myTid() >> 22), "\u0083\u0096\u0093\u0088").intern();
        c("\u0007\ufffa\u0000", 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 194, 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true).intern();
        c("\ufffb\u000b￼\u0001", TextUtils.lastIndexOf("", '0', 0, 0) + 5, 193 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 4 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), false).intern();
        c("\u0004\ufff6\b", 3 - View.getDefaultSize(0, 0), View.getDefaultSize(0, 0) + 201, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, true).intern();
        b(127 - TextUtils.getCapsMode("", 0, 0), "\u0098\u008c\u0089").intern();
        c("\ufff6\u0005\t\ufffe", 3 - ImageFormat.getBitsPerPixel(0), 196 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3, false).intern();
        this.f13808d = new JSONObject();
        this.f13809e = new JSONObject();
        try {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                this.f13809e.put((String) it.next(), b(127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u0097\u0084").intern());
            }
        } catch (JSONException unused) {
        }
    }

    public static String b(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f13802f;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 145);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String c(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'Y');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public final int a() {
        f13803g = (f13804h + 9) % 128;
        int iOptInt = this.f13808d.optInt(b(126 - TextUtils.lastIndexOf("", '0', 0, 0), "\u0083\u0084\u008e\u008d").intern(), 3000);
        int i5 = f13804h + 105;
        f13803g = i5 % 128;
        if (i5 % 2 == 0) {
            return iOptInt;
        }
        throw null;
    }

    public final List d() {
        JSONObject jSONObject;
        String strC;
        int i5 = f13803g + 29;
        f13804h = i5 % 128;
        int i10 = i5 % 2;
        ArrayList arrayList = this.f13806b;
        if (i10 == 0) {
            jSONObject = this.f13808d;
            strC = c("\u0007\ufffa\u0000", Color.red(1) * 4, TextUtils.getTrimmedLength("") + 20200, 5 >> (ViewConfiguration.getKeyRepeatTimeout() + 98), false);
        } else {
            jSONObject = this.f13808d;
            strC = c("\u0007\ufffa\u0000", Color.red(0) + 3, TextUtils.getTrimmedLength("") + 194, 3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true);
        }
        return Ab.V(jSONObject, strC.intern(), arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0073, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0075, code lost:
    
        r8 = (Va.Ha.f13415g + 17) % 128;
        Va.Ha.f13416h = r8;
        Va.Ha.f13415g = (r8 + 123) % 128;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0085, code lost:
    
        r4 = new Va.Na(r0, r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0060, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(Va.Ha r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            r1 = 0
            int r0 = android.text.TextUtils.getOffsetAfter(r0, r1)
            int r0 = r0 + 127
            java.lang.String r2 = "\u008b\u008d\u0081\u008a\u0089\u008d\u0081\u0084\u008c"
            java.lang.String r0 = b(r0, r2)
            java.lang.String r0 = r0.intern()
            int r2 = android.view.View.MeasureSpec.getSize(r1)
            int r2 = r2 + 127
            java.lang.String r3 = "\u009a\u0087\u0099"
            java.lang.String r2 = b(r2, r3)
            java.lang.String r2 = r2.intern()
            Va.Ra r3 = new Va.Ra
            r3.<init>()
            r3.f13665a = r7
            r8.getClass()
            Va.Oa r4 = new Va.Oa
            r5 = 0
            r4.<init>(r5, r0, r2)
            Va.G r5 = Va.G.S()
            Va.E r5 = r5.J()
            boolean r5 = r5.x()
            if (r5 == 0) goto L8b
            int r4 = Va.Ha.f13416h
            int r4 = r4 + 115
            int r5 = r4 % 128
            Va.Ha.f13415g = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L63
            Va.G r4 = Va.G.S()
            Va.E r4 = r4.J()
            java.lang.String r4 = r4.u(r0)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            r6 = 72
            int r6 = r6 / r1
            if (r5 == 0) goto L85
            goto L75
        L63:
            Va.G r1 = Va.G.S()
            Va.E r1 = r1.J()
            java.lang.String r4 = r1.u(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L85
        L75:
            int r8 = Va.Ha.f13415g
            int r8 = r8 + 17
            int r8 = r8 % 128
            Va.Ha.f13416h = r8
            int r8 = r8 + 123
            int r8 = r8 % 128
            Va.Ha.f13415g = r8
            r8 = 0
            goto L8f
        L85:
            Va.Na r1 = new Va.Na
            r1.<init>(r0, r2, r4)
            r4 = r1
        L8b:
            java.lang.String r8 = r8.c(r4, r3)
        L8f:
            r7.f(r8)
            int r8 = Va.W.f13804h
            int r8 = r8 + 91
            int r8 = r8 % 128
            Va.W.f13803g = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.W.e(Va.Ha):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = Va.W.f13804h
            int r0 = r0 + 43
            int r1 = r0 % 128
            Va.W.f13803g = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 86
            int r1 = r1 / 0
            if (r0 != 0) goto L25
            goto L1d
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
        L1d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r0.<init>(r3)     // Catch: org.json.JSONException -> L25
            r2.f13808d = r0     // Catch: org.json.JSONException -> L25
            return
        L25:
            int r3 = Va.W.f13803g
            int r3 = r3 + 13
            int r0 = r3 % 128
            Va.W.f13804h = r0
            int r3 = r3 % 2
            if (r3 == 0) goto L32
            return
        L32:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.W.f(java.lang.String):void");
    }
}
