package D6;

import com.google.android.gms.internal.ads.zzbss;
import x6.AbstractC4473d;

/* loaded from: classes3.dex */
public final class t1 extends A {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4473d f2498a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbss f2499b;

    public t1(AbstractC4473d abstractC4473d, zzbss zzbssVar) {
        this.f2498a = abstractC4473d;
        this.f2499b = zzbssVar;
    }

    @Override // D6.B
    public final void zzb() {
        zzbss zzbssVar;
        AbstractC4473d abstractC4473d = this.f2498a;
        if (abstractC4473d == null || (zzbssVar = this.f2499b) == null) {
            return;
        }
        abstractC4473d.onAdLoaded(zzbssVar);
    }

    @Override // D6.B
    public final void zzc(K0 k02) {
        AbstractC4473d abstractC4473d = this.f2498a;
        if (abstractC4473d != null) {
            abstractC4473d.onAdFailedToLoad(k02.W());
        }
    }
}
