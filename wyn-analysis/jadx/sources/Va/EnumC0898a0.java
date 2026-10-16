package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Va.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC0898a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0898a0 f13942a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0898a0 f13943b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0898a0 f13944c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0898a0 f13945d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0898a0 f13946e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0898a0 f13947f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0898a0[] f13948g;

    /* renamed from: h, reason: collision with root package name */
    public static int f13949h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final int f13950i;

    static {
        EnumC0898a0 enumC0898a0 = new EnumC0898a0(a("\t\u0000\ufff7", 4 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE, Color.blue(0) + 1, false).intern(), 0);
        f13942a = enumC0898a0;
        EnumC0898a0 enumC0898a02 = new EnumC0898a0(a("\ufffe\u0005\u0000\uffff\ufffa\u000b￼�", 8 - (ViewConfiguration.getFadingEdgeLength() >> 16), 124 - (ViewConfiguration.getLongPressTimeout() >> 16), 7 - ExpandableListView.getPackedPositionChild(0L), true).intern(), 1);
        f13943b = enumC0898a02;
        EnumC0898a0 enumC0898a03 = new EnumC0898a0(a("\ufff6\u0001\ufffe\u000f\ufffe\u0003￼\ufffe\u0003\ufffe\t\ufffe", (ViewConfiguration.getScrollBarSize() >> 8) + 12, 126 - Color.red(0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6, false).intern(), 2);
        f13944c = enumC0898a03;
        EnumC0898a0 enumC0898a04 = new EnumC0898a0(a("\ufffe\u0002", 3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 129 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), -TextUtils.lastIndexOf("", '0'), false).intern(), 3);
        f13945d = enumC0898a04;
        EnumC0898a0 enumC0898a05 = new EnumC0898a0(a("��\u0002\f\ufffa\ufffb\u0005\ufffe", 7 - TextUtils.lastIndexOf("", '0'), 122 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1 - TextUtils.getOffsetBefore("", 0), false).intern(), 4);
        f13946e = enumC0898a05;
        EnumC0898a0 enumC0898a06 = new EnumC0898a0(a("\u0004\u0004\ufff7\u0004\u0001", View.MeasureSpec.getSize(0) + 5, 129 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getSize(0) + 3, true).intern(), 5);
        f13947f = enumC0898a06;
        f13948g = new EnumC0898a0[]{enumC0898a0, enumC0898a02, enumC0898a03, enumC0898a04, enumC0898a05, enumC0898a06};
        f13950i = (f13949h + 115) % 128;
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
                    cArr[i12] = (char) (c10 - '3');
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

    public static EnumC0898a0 valueOf(String str) {
        int i5 = f13950i;
        int i10 = i5 + 27;
        f13949h = i10 % 128;
        int i11 = i10 % 2;
        EnumC0898a0 enumC0898a0 = (EnumC0898a0) Enum.valueOf(EnumC0898a0.class, str);
        if (i11 != 0) {
            int i12 = 8 / 0;
        }
        f13949h = (i5 + 5) % 128;
        return enumC0898a0;
    }

    public static EnumC0898a0[] values() {
        int i5 = f13950i;
        f13949h = (i5 + 95) % 128;
        EnumC0898a0[] enumC0898a0Arr = (EnumC0898a0[]) f13948g.clone();
        f13949h = (i5 + 123) % 128;
        return enumC0898a0Arr;
    }
}
