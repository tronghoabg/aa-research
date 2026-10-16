package D6;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcah;
import q7.BinderC3877b;
import q7.C3878c;

/* loaded from: classes3.dex */
public final class u1 extends q7.d {

    /* renamed from: a, reason: collision with root package name */
    public zzcah f2500a;

    public final L a(Context context, x1 x1Var, String str, zzbvj zzbvjVar, int i5) throws H6.n {
        M m10;
        x1 x1Var2;
        String str2;
        zzbvj zzbvjVar2;
        int i10;
        zzbix.zza(context);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmo)).booleanValue()) {
            try {
                BinderC3877b binderC3877b = new BinderC3877b(context);
                try {
                    IBinder iBinderB = tg.b.X(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl");
                    if (iBinderB == null) {
                        x1Var2 = x1Var;
                        str2 = str;
                        zzbvjVar2 = zzbvjVar;
                        i10 = i5;
                        m10 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        m10 = iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new M(iBinderB);
                        x1Var2 = x1Var;
                        str2 = str;
                        zzbvjVar2 = zzbvjVar;
                        i10 = i5;
                    }
                    IBinder iBinderR = m10.R(binderC3877b, x1Var2, str2, zzbvjVar2, i10);
                    if (iBinderR != null) {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderR.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                        return iInterfaceQueryLocalInterface2 instanceof L ? (L) iInterfaceQueryLocalInterface2 : new J(iBinderR);
                    }
                } catch (Exception e7) {
                    throw new H6.n(e7);
                }
            } catch (H6.n e10) {
                e = e10;
                Exception exc = e;
                zzcah zzcahVarZza = zzcaf.zza(context);
                this.f2500a = zzcahVarZza;
                zzcahVarZza.zzh(exc, "AdManagerCreator.newAdManagerByDynamiteLoader");
                H6.l.i("#007 Could not call remote method.", exc);
                return null;
            } catch (RemoteException e11) {
                e = e11;
                Exception exc2 = e;
                zzcah zzcahVarZza2 = zzcaf.zza(context);
                this.f2500a = zzcahVarZza2;
                zzcahVarZza2.zzh(exc2, "AdManagerCreator.newAdManagerByDynamiteLoader");
                H6.l.i("#007 Could not call remote method.", exc2);
                return null;
            } catch (NullPointerException e12) {
                e = e12;
                Exception exc22 = e;
                zzcah zzcahVarZza22 = zzcaf.zza(context);
                this.f2500a = zzcahVarZza22;
                zzcahVarZza22.zzh(exc22, "AdManagerCreator.newAdManagerByDynamiteLoader");
                H6.l.i("#007 Could not call remote method.", exc22);
                return null;
            }
        } else {
            try {
                IBinder iBinderR2 = ((M) getRemoteCreatorInstance(context)).R(new BinderC3877b(context), x1Var, str, zzbvjVar, i5);
                if (iBinderR2 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderR2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                    return iInterfaceQueryLocalInterface3 instanceof L ? (L) iInterfaceQueryLocalInterface3 : new J(iBinderR2);
                }
            } catch (RemoteException e13) {
                e = e13;
                H6.l.b("Could not create remote AdManager.", e);
                return null;
            } catch (C3878c e14) {
                e = e14;
                H6.l.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        return null;
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof M ? (M) iInterfaceQueryLocalInterface : new M(iBinder);
    }
}
