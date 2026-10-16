package F6;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f4003a;

    public n(long j8) {
        this.f4003a = j8;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f26307z.remove(Long.valueOf(this.f4003a)) == null) {
            return null;
        }
        C6.n.f1857D.f1868h.zzh(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
