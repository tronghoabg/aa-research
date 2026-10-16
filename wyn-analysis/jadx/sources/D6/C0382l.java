package D6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import j$.util.Objects;
import q7.BinderC3877b;
import q7.C3878c;

/* renamed from: D6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0382l extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0388o f2453d;

    public C0382l(C0388o c0388o, Context context, zzbvf zzbvfVar) {
        this.f2451b = context;
        this.f2452c = zzbvfVar;
        Objects.requireNonNull(c0388o);
        this.f2453d = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final /* bridge */ /* synthetic */ Object a() {
        C0388o.k(this.f2451b, "ads_preloader");
        return null;
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        Y y10;
        X v2;
        Context context = this.f2451b;
        BinderC3877b binderC3877b = new BinderC3877b(context);
        zzbix.zza(context);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue();
        zzbvf zzbvfVar = this.f2452c;
        C0388o c0388o = this.f2453d;
        if (!zBooleanValue) {
            f1 f1Var = (f1) c0388o.f2468g;
            try {
                BinderC3877b binderC3877b2 = new BinderC3877b(context);
                Y y11 = (Y) f1Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = y11.zza();
                zzben.zze(parcelZza, binderC3877b2);
                zzben.zze(parcelZza, zzbvfVar);
                parcelZza.writeInt(261710000);
                Parcel parcelZzcZ = y11.zzcZ(1, parcelZza);
                IBinder strongBinder = parcelZzcZ.readStrongBinder();
                parcelZzcZ.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
            } catch (RemoteException e7) {
                e = e7;
                H6.l.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (NullPointerException e10) {
                e = e10;
                H6.l.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            } catch (C3878c e11) {
                e = e11;
                H6.l.g("Could not get remote AdPreloaderCreator.", e);
                return null;
            }
        }
        try {
            try {
                IBinder iBinderB = tg.b.X(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl");
                if (iBinderB == null) {
                    y10 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    y10 = iInterfaceQueryLocalInterface2 instanceof Y ? (Y) iInterfaceQueryLocalInterface2 : new Y(iBinderB);
                }
                Parcel parcelZza2 = y10.zza();
                zzben.zze(parcelZza2, binderC3877b);
                zzben.zze(parcelZza2, zzbvfVar);
                parcelZza2.writeInt(261710000);
                Parcel parcelZzcZ2 = y10.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    v2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                    v2 = iInterfaceQueryLocalInterface3 instanceof X ? (X) iInterfaceQueryLocalInterface3 : new V(strongBinder2);
                }
                v2.zzl(zzbvfVar);
                return v2;
            } catch (Exception e12) {
                throw new H6.n(e12);
            }
        } catch (H6.n e13) {
            e = e13;
            zzcah zzcahVarZza = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza;
            zzcahVarZza.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (RemoteException e14) {
            e = e14;
            zzcah zzcahVarZza2 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza2;
            zzcahVarZza2.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            zzcah zzcahVarZza22 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza22;
            zzcahVarZza22.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.p(new BinderC3877b(this.f2451b), this.f2452c, 261710000);
    }
}
