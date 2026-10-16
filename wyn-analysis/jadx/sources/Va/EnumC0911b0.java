package Va;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Va.b0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC0911b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0911b0 f14011a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0911b0 f14012b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0911b0 f14013c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0911b0 f14014d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0911b0 f14015e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0911b0 f14016f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0911b0[] f14017g;

    /* renamed from: h, reason: collision with root package name */
    public static int f14018h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14019i = 1;

    static {
        EnumC0911b0 enumC0911b0 = new EnumC0911b0(a("\u0002\ufff9\u0002\u0003", View.MeasureSpec.makeMeasureSpec(0, 0) + 4, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 261, ImageFormat.getBitsPerPixel(0) + 3, false).intern(), 0);
        f14011a = enumC0911b0;
        EnumC0911b0 enumC0911b02 = new EnumC0911b0(a("\b\u0004\ufff8\u0005\u0012\u0007\u0001\ufff8\ufffa\ufff4\u0012\u0005\ufff8\n\ufff8\u0001\ufff7\ufff8\u0005￼", 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 262 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 16 - TextUtils.getOffsetAfter("", 0), true).intern(), 1);
        f14012b = enumC0911b02;
        EnumC0911b0 enumC0911b03 = new EnumC0911b0(a("\u0000\u0001\u0001\u0006\u0004\uffff\u0006\uffff\u0000\ufffa\u0004\u0003\ufff6\u0007\u0010￼\ufff5\u0004\u0010\ufff5\ufff6\u0005\u0003", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22, Color.argb(0, 0, 0, 0) + 264, 6 - TextUtils.indexOf((CharSequence) "", '0', 0), true).intern(), 2);
        f14013c = enumC0911b03;
        EnumC0911b0 enumC0911b04 = new EnumC0911b0(a("\u0003\u0014\ufffb\ufff6\ufffe\u0001\ufffa\ufff9\ufffe\u0003\ufffe\t\ufffe\ufff6\u0001\ufffe\u000f\ufff6\t\ufffe\u0004", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22, TextUtils.indexOf("", "", 0, 0) + 260, 8 - Color.alpha(0), false).intern(), 3);
        f14014d = enumC0911b04;
        EnumC0911b0 enumC0911b05 = new EnumC0911b0(a("\u0000�\ufff5\ufffa\u0006\u0003\b\ufff7\ufff9\u0002\u0002\u0003\ufff7\u0013\ufff9\b\ufff5\ufff9\u0006\ufff7\u0013\u0003\b\u0013\ufff8\ufff9", 26 - ((Process.getThreadPriority(0) + 20) >> 6), 261 - (ViewConfiguration.getWindowTouchSlop() >> 8), 3 - TextUtils.lastIndexOf("", '0', 0), true).intern(), 4);
        f14015e = enumC0911b05;
        EnumC0911b0 enumC0911b06 = new EnumC0911b0(a("\ufffe\uffff\u0007\ufffe\u0005\ufffe\ufffb", 8 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 265 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 4, false).intern(), 5);
        f14016f = enumC0911b06;
        f14017g = new EnumC0911b0[]{enumC0911b0, enumC0911b02, enumC0911b03, enumC0911b04, enumC0911b05, enumC0911b06};
        int i5 = f14019i + 7;
        f14018h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static String a(String str, int i5, int i10, int i11, boolean z2) {
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
                    cArr[i12] = (char) (c10 - 185);
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

    public static EnumC0911b0 valueOf(String str) {
        f14018h = (f14019i + 45) % 128;
        EnumC0911b0 enumC0911b0 = (EnumC0911b0) Enum.valueOf(EnumC0911b0.class, str);
        int i5 = f14018h + 41;
        f14019i = i5 % 128;
        if (i5 % 2 != 0) {
            return enumC0911b0;
        }
        throw null;
    }

    public static EnumC0911b0[] values() {
        f14018h = (f14019i + 95) % 128;
        EnumC0911b0[] enumC0911b0Arr = (EnumC0911b0[]) f14017g.clone();
        int i5 = f14019i + 29;
        f14018h = i5 % 128;
        if (i5 % 2 == 0) {
            return enumC0911b0Arr;
        }
        throw null;
    }
}
