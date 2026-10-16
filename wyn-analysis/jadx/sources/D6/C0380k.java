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

/* renamed from: D6.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0380k extends AbstractC0390p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2447b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2448c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzbvf f2449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0388o f2450e;

    public C0380k(C0388o c0388o, Context context, String str, zzbvf zzbvfVar) {
        this.f2447b = context;
        this.f2448c = str;
        this.f2449d = zzbvfVar;
        Objects.requireNonNull(c0388o);
        this.f2450e = c0388o;
    }

    @Override // D6.AbstractC0390p
    public final Object a() {
        C0388o.k(this.f2447b, "native_ad");
        return new h1();
    }

    @Override // D6.AbstractC0390p
    public final Object b() throws H6.n {
        I i5;
        Context context = this.f2447b;
        zzbix.zza(context);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue();
        zzbvf zzbvfVar = this.f2449d;
        C0388o c0388o = this.f2450e;
        String str = this.f2448c;
        if (!zBooleanValue) {
            f1 f1Var = (f1) c0388o.f2463b;
            try {
                BinderC3877b binderC3877b = new BinderC3877b(context);
                I i10 = (I) f1Var.getRemoteCreatorInstance(context);
                Parcel parcelZza = i10.zza();
                zzben.zze(parcelZza, binderC3877b);
                parcelZza.writeString(str);
                zzben.zze(parcelZza, zzbvfVar);
                parcelZza.writeInt(261710000);
                Parcel parcelZzcZ = i10.zzcZ(1, parcelZza);
                IBinder strongBinder = parcelZzcZ.readStrongBinder();
                parcelZzcZ.recycle();
                if (strongBinder == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
            } catch (RemoteException e7) {
                e = e7;
                H6.l.g("Could not create remote builder for AdLoader.", e);
                return null;
            } catch (C3878c e10) {
                e = e10;
                H6.l.g("Could not create remote builder for AdLoader.", e);
                return null;
            }
        }
        try {
            BinderC3877b binderC3877b2 = new BinderC3877b(context);
            try {
                IBinder iBinderB = tg.b.X(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl");
                if (iBinderB == null) {
                    i5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    i5 = iInterfaceQueryLocalInterface2 instanceof I ? (I) iInterfaceQueryLocalInterface2 : new I(iBinderB);
                }
                Parcel parcelZza2 = i5.zza();
                zzben.zze(parcelZza2, binderC3877b2);
                parcelZza2.writeString(str);
                zzben.zze(parcelZza2, zzbvfVar);
                parcelZza2.writeInt(261710000);
                Parcel parcelZzcZ2 = i5.zzcZ(1, parcelZza2);
                IBinder strongBinder2 = parcelZzcZ2.readStrongBinder();
                parcelZzcZ2.recycle();
                if (strongBinder2 == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface3 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return iInterfaceQueryLocalInterface3 instanceof H ? (H) iInterfaceQueryLocalInterface3 : new F(strongBinder2);
            } catch (Exception e11) {
                throw new H6.n(e11);
            }
        } catch (H6.n e12) {
            e = e12;
            zzcah zzcahVarZza = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza;
            zzcahVarZza.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (RemoteException e13) {
            e = e13;
            zzcah zzcahVarZza2 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza2;
            zzcahVarZza2.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            zzcah zzcahVarZza22 = zzcaf.zza(context);
            c0388o.f2467f = zzcahVarZza22;
            zzcahVarZza22.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // D6.AbstractC0390p
    public final Object c(InterfaceC0367d0 interfaceC0367d0) {
        return interfaceC0367d0.e(new BinderC3877b(this.f2447b), this.f2448c, this.f2449d, 261710000);
    }
}
