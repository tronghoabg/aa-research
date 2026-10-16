package G6;

import android.os.Process;
import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzekz;

/* loaded from: classes3.dex */
public class V extends b0 {
    public final CookieManager h() {
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        int iMyUid = Process.myUid();
        if (iMyUid == 0 || iMyUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i5 = L.f4523b;
            H6.l.d("Failed to obtain CookieManager.", th);
            nVar.f1868h.zzi(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zzclm i(zzclx zzclxVar, zzbhw zzbhwVar, boolean z2, zzekz zzekzVar) {
        return new zzcmp(zzclxVar, zzbhwVar, z2, zzekzVar);
    }
}
