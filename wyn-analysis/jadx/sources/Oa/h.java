package Oa;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import m9.S;
import wa.C4398a;

/* loaded from: classes4.dex */
public final class h implements d {

    /* renamed from: e, reason: collision with root package name */
    public static h f8939e;

    /* renamed from: a, reason: collision with root package name */
    public float f8940a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: b, reason: collision with root package name */
    public final S f8941b;

    /* renamed from: c, reason: collision with root package name */
    public Na.a f8942c;

    /* renamed from: d, reason: collision with root package name */
    public c f8943d;

    public h(C4398a c4398a, S s10) {
        this.f8941b = s10;
    }

    public static h b() {
        if (f8939e == null) {
            f8939e = new h(new C4398a(23), new S(23));
        }
        return f8939e;
    }

    @Override // Oa.d
    public final void a(boolean z2) {
        if (z2) {
            Sa.a.f11037g.getClass();
            Sa.a.b();
            return;
        }
        Sa.a.f11037g.getClass();
        Handler handler = Sa.a.f11039i;
        if (handler != null) {
            handler.removeCallbacks(Sa.a.k);
            Sa.a.f11039i = null;
        }
    }
}
