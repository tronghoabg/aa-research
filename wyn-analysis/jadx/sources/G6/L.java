package G6;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbkz;

/* loaded from: classes3.dex */
public abstract class L extends H6.l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4523b = 0;

    public static void k(String str) {
        if (m()) {
            if (str == null || str.length() <= 4000) {
                Log.v("Ads", str);
                return;
            }
            boolean z2 = true;
            for (String str2 : H6.l.f4960a.zzf(str)) {
                if (z2) {
                    Log.v("Ads", str2);
                } else {
                    Log.v("Ads-cont", str2);
                }
                z2 = false;
            }
        }
    }

    public static void l(String str, Throwable th) {
        if (m()) {
            Log.v("Ads", str, th);
        }
    }

    public static boolean m() {
        return H6.l.j(2) && ((Boolean) zzbkz.zza.zze()).booleanValue();
    }
}
