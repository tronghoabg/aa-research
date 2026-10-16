package y6;

import D6.C0395s;
import D6.L;
import D6.S0;
import D6.r1;
import H6.l;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkv;
import x6.AbstractC4479j;
import x6.w;

/* loaded from: classes3.dex */
public final class c extends AbstractC4479j {
    public c(Context context) {
        super(context);
        AbstractC1732v.j(context, "Context cannot be null");
    }

    public final void c(b bVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzbix.zza(getContext());
        if (((Boolean) zzbkv.zzf.zze()).booleanValue()) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                H6.c.f4936b.execute(new L7.b(28, this, bVar));
                return;
            }
        }
        this.f47739a.b(bVar.f47736a);
    }

    public AdSize[] getAdSizes() {
        return this.f47739a.f2381g;
    }

    public f getAppEventListener() {
        return this.f47739a.f2382h;
    }

    public VideoController getVideoController() {
        return this.f47739a.f2377c;
    }

    public w getVideoOptions() {
        return this.f47739a.f2384j;
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f47739a.d(adSizeArr);
    }

    public void setAppEventListener(f fVar) {
        this.f47739a.e(fVar);
    }

    public void setManualImpressionsEnabled(boolean z2) {
        S0 s02 = this.f47739a;
        s02.f2386m = z2;
        try {
            L l10 = s02.f2383i;
            if (l10 != null) {
                l10.zzz(z2);
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }

    public void setVideoOptions(w wVar) {
        S0 s02 = this.f47739a;
        s02.f2384j = wVar;
        try {
            L l10 = s02.f2383i;
            if (l10 != null) {
                l10.zzG(wVar == null ? null : new r1(wVar));
            }
        } catch (RemoteException e7) {
            l.i("#007 Could not call remote method.", e7);
        }
    }
}
