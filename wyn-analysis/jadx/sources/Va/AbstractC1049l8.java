package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
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
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Va.l8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1049l8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14352a = Pattern.compile(a(1877 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "䀆䝖亓喊嵶撰残獑竔ǺॗႤៅἤ⚄ⷢ㔥㲧쎒쬺틅\ud985\ue149\ue8a6\uef8a").intern());

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14353b = Pattern.compile(a(Color.blue(0) + 50441, "䀆蕳쩢ོ呆餩\ude32⍅桬굒\uf25c㜙籩䄄蘌쯽").intern());

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14354c = Pattern.compile(b("￤￥￼\ufff7\u0019\u0019￤9\u0018\u001b￤\u001a￦\uffe7￤\u001b", 16 - (Process.myTid() >> 22), 158 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), false).intern());

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14355d = Pattern.compile(b("\uffef￬\ufff8\u001c￪\u001b￭\u001a\uffef￬\ufff8\u001c￪\u001d\u001a", 14 - ImageFormat.getBitsPerPixel(0), 157 - View.resolveSizeAndState(0, 0, 0), 14 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), false).intern());

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14356e = Pattern.compile(a((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 13308, "䀆現➒\udb82辕䏴瞝").intern());

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f14357f = Pattern.compile(b("￠\ufff4-￠\u0014\u000e\u0010\u0012ￗ\r￠\ufff4-￠\u0014\u000e\u0011&&\u0014\u001f\u0016￡\u000f\uffdd\u0010￡\u0012ￗ￬￠￣\r", 34 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 170, 18 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), true).intern());

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14358g = Pattern.compile(b("&￮￮", TextUtils.getOffsetBefore("", 0) + 3, 149 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 3, false).intern());

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14359h = Pattern.compile(b("\u0013\ufff5\ufff3\u0013\ufff3", Color.argb(0, 0, 0, 0) + 5, 196 - ExpandableListView.getPackedPositionChild(0), 1 - (KeyEvent.getMaxKeyCode() >> 16), false).intern());

    /* renamed from: i, reason: collision with root package name */
    public static final List f14360i = Arrays.asList(a(41334 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), "䀱\ue14b").intern(), a((AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 30047, "䀽㕫ꪕ†").intern(), a(1823 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "䀶䜲上啩").intern(), a(53077 - (ViewConfiguration.getScrollBarSize() >> 8), "䀪轨\ude86ⷒ絾䲟").intern(), b("\ufff6\u0001\u0006\u0004\u0003", (ViewConfiguration.getLongPressTimeout() >> 16) + 5, View.MeasureSpec.getSize(0) + Sdk.SDKError.Reason.AD_IS_LOADING_VALUE, Drawable.resolveOpacity(0, 0) + 4, true).intern(), a(3500 - (SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), "䀬䶁孷").intern(), b("\r￼\u0001￼\ufffa", (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 4, (Process.myPid() >> 22) + 195, AndroidCharacter.getMirror('0') - '-', false).intern());

    /* renamed from: j, reason: collision with root package name */
    public static int f14361j = 0;
    public static int k = (f14361j + 35) % 128;

    public static String a(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (AbstractC0897a.f13937u) {
            try {
                AbstractC0897a.f13936t = i5;
                char[] cArr = new char[charArray.length];
                AbstractC0897a.f13935s = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13935s;
                    if (i10 < charArray.length) {
                        cArr[i10] = (char) ((charArray[i10] ^ (AbstractC0897a.f13936t * i10)) ^ 6546245650451939416L);
                        AbstractC0897a.f13935s = i10 + 1;
                    } else {
                        str2 = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String b(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - '\\');
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4 A[PHI: r7 r8
  0x00e4: PHI (r7v14 Va.u8) = (r7v13 Va.u8), (r7v32 Va.u8) binds: [B:31:0x008c, B:33:0x00a2] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r8v14 java.lang.String) = (r8v13 java.lang.String), (r8v36 java.lang.String) binds: [B:31:0x008c, B:33:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1049l8.c(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public static String d(String str) {
        int length;
        int i5 = k + 31;
        f14361j = i5 % 128;
        int i10 = 1;
        if (i5 % 2 != 0) {
            length = str.length() >> 1;
            i10 = 0;
        } else {
            length = str.length() - 1;
        }
        return str.substring(i10, length);
    }

    public static String e(Pattern pattern, String str, int i5) {
        int i10 = k + 11;
        f14361j = i10 % 128;
        if (i10 % 2 != 0) {
            Matcher matcher = pattern.matcher(str);
            matcher.region(i5, str.length());
            matcher.find();
            throw null;
        }
        Matcher matcher2 = pattern.matcher(str);
        matcher2.region(i5, str.length());
        if (!matcher2.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher2.start(), matcher2.end());
        f14361j = (k + 57) % 128;
        return strSubstring;
    }
}
