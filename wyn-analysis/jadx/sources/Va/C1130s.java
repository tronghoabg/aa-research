package Va;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.lang.Thread;

/* renamed from: Va.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1130s implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static int f14563b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f14564c = 1;

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1194x f14565a;

    public static String a(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i10];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i10) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i11);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 162);
                    Ab.f13219v = i12 + 1;
                }
                if (i5 > 0) {
                    Ab.f13220w = i5;
                    char[] cArr2 = new char[i10];
                    System.arraycopy(cArr, 0, cArr2, 0, i10);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i10 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i10 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i10];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr3[i15] = cArr[(i10 - i15) - 1];
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        f14563b = (f14564c + 63) % 128;
        Ab.m(a("\f\u0001\ufffb\u000b\uffd9\u0006\ufff9\u0004\u0011", View.resolveSizeAndState(0, 0, 0) + 4, 9 - (ViewConfiguration.getTouchSlop() >> 8), 267 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), false).intern(), a("\n\uffff�\u0012\uffffﾺ\u000e\u0002\u0001\u000f\ufffb�\b\uffef\b\t\u0003\u000e", Color.green(0) + 14, 18 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 264, true).intern(), a("\b\u0000\ufffe\uffff\u0002\u0000\ufffe\u000f\ufff1", 8 - TextUtils.lastIndexOf("", '0'), (-16777207) - Color.rgb(0, 0, 0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 261, true).intern(), th);
        C1194x c1194x = this.f14565a;
        c1194x.w();
        int i5 = (C1194x.f14742s + 23) % 128;
        C1194x.f14741r = i5;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = c1194x.f14755n;
        int i10 = (i5 + 53) % 128;
        C1194x.f14742s = i10;
        if (uncaughtExceptionHandler != null) {
            int i11 = (i10 + 23) % 128;
            C1194x.f14741r = i11;
            C1194x.f14742s = (i11 + 53) % 128;
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
            f14564c = (f14563b + 105) % 128;
        } catch (SecurityException unused) {
        }
    }
}
