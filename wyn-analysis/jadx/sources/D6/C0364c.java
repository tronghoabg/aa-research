package D6;

import android.os.RemoteException;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzf;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import j$.util.Objects;
import q7.BinderC3877b;

/* renamed from: D6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0364c extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdActivity f2410b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0388o f2411c;

    public C0364c(C0388o c0388o, AdActivity adActivity) {
        this.f2410b = adActivity;
        Objects.requireNonNull(c0388o);
        this.f2411c = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final /* bridge */ /* synthetic */ Object a() {
        C0388o.k(this.f2410b, "ad_overlay");
        return null;
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        AdActivity adActivity = this.f2410b;
        zzbix.zza(adActivity);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue();
        C0388o c0388o = this.f2411c;
        if (!zBooleanValue) {
            return ((zzbzf) c0388o.f2466e).zza(adActivity);
        }
        try {
            try {
                return zzbzh.zzI(zzbzk.zzb(tg.b.X(adActivity).b("com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl")).zze(new BinderC3877b(adActivity)));
            } catch (Exception e7) {
                throw new H6.n(e7);
            }
        } catch (H6.n e10) {
            e = e10;
            zzcah zzcahVarZza = zzcaf.zza(adActivity.getApplicationContext());
            c0388o.f2467f = zzcahVarZza;
            zzcahVarZza.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            zzcah zzcahVarZza2 = zzcaf.zza(adActivity.getApplicationContext());
            c0388o.f2467f = zzcahVarZza2;
            zzcahVarZza2.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzcah zzcahVarZza22 = zzcaf.zza(adActivity.getApplicationContext());
            c0388o.f2467f = zzcahVarZza22;
            zzcahVarZza22.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.zzg(new BinderC3877b(this.f2410b));
    }
}
