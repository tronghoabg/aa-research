package D6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import j$.util.Objects;
import q7.BinderC3877b;
import q7.C3878c;

/* renamed from: D6.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0384m extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0388o f2455c;

    public C0384m(C0388o c0388o, Context context) {
        this.f2454b = context;
        Objects.requireNonNull(c0388o);
        this.f2455c = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2454b, "mobile_ads_settings");
        return new j1();
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        C0387n0 c0387n0;
        Context context = this.f2454b;
        zzbix.zza(context);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue();
        C0388o c0388o = this.f2455c;
        if (!zBooleanValue) {
            f1 f1Var = (f1) c0388o.f2464c;
            try {
                BinderC3877b binderC3877b = new BinderC3877b(context);
                C0387n0 c0387n02 = (C0387n0) f1Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = c0387n02.zza();
                zzben.zze(parcelZza, binderC3877b);
                parcelZza.writeInt(261710000);
                Parcel parcelZzcZ = c0387n02.zzcZ(1, parcelZza);
                IBinder strongBinder = parcelZzcZ.readStrongBinder();
                parcelZzcZ.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface instanceof InterfaceC0385m0 ? (InterfaceC0385m0) iInterfaceQueryLocalInterface : new C0381k0(strongBinder);
            } catch (RemoteException e7) {
                e = e7;
                H6.l.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            } catch (C3878c e10) {
                e = e10;
                H6.l.g("Could not get remote MobileAdsSettingManager.", e);
                return null;
            }
        }
        try {
            BinderC3877b binderC3877b2 = new BinderC3877b(context);
            try {
                IBinder iBinderB = tg.b.X(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl");
                if (iBinderB == null) {
                    c0387n0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    c0387n0 = iInterfaceQueryLocalInterface2 instanceof C0387n0 ? (C0387n0) iInterfaceQueryLocalInterface2 : new C0387n0(iBinderB);
                }
                Parcel parcelZza2 = c0387n0.zza();
                zzben.zze(parcelZza2, binderC3877b2);
                parcelZza2.writeInt(261710000);
                Parcel parcelZzcZ2 = c0387n0.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return iInterfaceQueryLocalInterface3 instanceof InterfaceC0385m0 ? (InterfaceC0385m0) iInterfaceQueryLocalInterface3 : new C0381k0(strongBinder2);
            } catch (Exception e11) {
                throw new H6.n(e11);
            }
        } catch (H6.n e12) {
            e = e12;
            zzcah zzcahVarZza = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza;
            zzcahVarZza.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (RemoteException e13) {
            e = e13;
            zzcah zzcahVarZza2 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza2;
            zzcahVarZza2.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            zzcah zzcahVarZza22 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza22;
            zzcahVarZza22.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.q(new BinderC3877b(this.f2454b), 261710000);
    }
}
