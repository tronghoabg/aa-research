package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcet;
import q7.InterfaceC3876a;

/* renamed from: D6.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0365c0 extends zzbel implements InterfaceC0367d0 {
    @Override // D6.InterfaceC0367d0
    public final zzccp A(InterfaceC3876a interfaceC3876a, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzccp zzccpVarZzt = zzcco.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzccpVarZzt;
    }

    @Override // D6.InterfaceC0367d0
    public final zzbmp C(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, interfaceC3876a2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbmp zzbmpVarZzdG = zzbmo.zzdG(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmpVarZzdG;
    }

    @Override // D6.InterfaceC0367d0
    public final zzcet F(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzcet zzcetVarZzb = zzces.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzcetVarZzb;
    }

    @Override // D6.InterfaceC0367d0
    public final zzbra I(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5, zzbqx zzbqxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        zzben.zze(parcelZza, zzbqxVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        zzbra zzbraVarZzb = zzbqz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbraVarZzb;
    }

    @Override // D6.InterfaceC0367d0
    public final zzbzb J(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        zzbzb zzbzbVarZzb = zzbza.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbzbVarZzb;
    }

    @Override // D6.InterfaceC0367d0
    public final D0 N(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        D0 b02;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            b02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            b02 = iInterfaceQueryLocalInterface instanceof D0 ? (D0) iInterfaceQueryLocalInterface : new B0(strongBinder);
        }
        parcelZzcZ.recycle();
        return b02;
    }

    @Override // D6.InterfaceC0367d0
    public final L O(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        L j8;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, x1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j8 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // D6.InterfaceC0367d0
    public final H e(InterfaceC3876a interfaceC3876a, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        H f10;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            f10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            f10 = iInterfaceQueryLocalInterface instanceof H ? (H) iInterfaceQueryLocalInterface : new F(strongBinder);
        }
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // D6.InterfaceC0367d0
    public final X p(InterfaceC3876a interfaceC3876a, zzbvj zzbvjVar, int i5) throws RemoteException {
        X v2;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            v2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            v2 = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new V(strongBinder);
        }
        parcelZzcZ.recycle();
        return v2;
    }

    @Override // D6.InterfaceC0367d0
    public final InterfaceC0385m0 q(InterfaceC3876a interfaceC3876a, int i5) throws RemoteException {
        InterfaceC0385m0 c0381k0;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0381k0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c0381k0 = iInterfaceQueryLocalInterface instanceof InterfaceC0385m0 ? (InterfaceC0385m0) iInterfaceQueryLocalInterface : new C0381k0(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0381k0;
    }

    @Override // D6.InterfaceC0367d0
    public final L u(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        L j8;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, x1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j8 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // D6.InterfaceC0367d0
    public final L y(InterfaceC3876a interfaceC3876a, x1 x1Var, String str, zzbvj zzbvjVar, int i5) throws RemoteException {
        L j8;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzben.zzc(parcelZza, x1Var);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            j8 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            j8 = iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(strongBinder);
        }
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // D6.InterfaceC0367d0
    public final zzbzi zzg(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        zzbzi zzbziVarZzI = zzbzh.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbziVarZzI;
    }
}
