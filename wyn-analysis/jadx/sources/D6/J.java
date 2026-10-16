package D6;

import A7.AbstractC0279p0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgt;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class J extends zzbel implements L {
    public J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // D6.L
    public final L0 zzF() throws RemoteException {
        L0 i02;
        Parcel parcelZzcZ = zzcZ(26, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            i02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            i02 = iInterfaceQueryLocalInterface instanceof L0 ? (L0) iInterfaceQueryLocalInterface : new I0(strongBinder);
        }
        parcelZzcZ.recycle();
        return i02;
    }

    @Override // D6.L
    public final void zzG(r1 r1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, r1Var);
        zzda(29, parcelZza);
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbgtVar);
        zzda(40, parcelZza);
    }

    @Override // D6.L
    public final void zzK(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // D6.L
    public final void zzP(A0 a02) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, a02);
        zzda(42, parcelZza);
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, B b5) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, v1Var);
        zzben.zze(parcelZza, b5);
        zzda(43, parcelZza);
    }

    @Override // D6.L
    public final void zzR(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(44, parcelZza);
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0373g0);
        zzda(45, parcelZza);
    }

    @Override // D6.L
    public final void zzT(long j8) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j8);
        zzda(48, parcelZza);
    }

    @Override // D6.L
    public final long zzU() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(47, zza());
        long j8 = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j8;
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() {
        return AbstractC0279p0.t(zzcZ(1, zza()));
    }

    @Override // D6.L
    public final void zzc() throws RemoteException {
        zzda(2, zza());
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0407y);
        zzda(7, parcelZza);
    }

    @Override // D6.L
    public final boolean zze(v1 v1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, v1Var);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // D6.L
    public final void zzf() throws RemoteException {
        zzda(5, zza());
    }

    @Override // D6.L
    public final void zzg() throws RemoteException {
        zzda(6, zza());
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0362b0);
        zzda(8, parcelZza);
    }

    @Override // D6.L
    public final x1 zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        x1 x1Var = (x1) zzben.zzb(parcelZzcZ, x1.CREATOR);
        parcelZzcZ.recycle();
        return x1Var;
    }

    @Override // D6.L
    public final void zzo(x1 x1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, x1Var);
        zzda(13, parcelZza);
    }

    @Override // D6.L
    public final H0 zzt() throws RemoteException {
        H0 f02;
        Parcel parcelZzcZ = zzcZ(41, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            f02 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            f02 = iInterfaceQueryLocalInterface instanceof H0 ? (H0) iInterfaceQueryLocalInterface : new F0(strongBinder);
        }
        parcelZzcZ.recycle();
        return f02;
    }

    @Override // D6.L
    public final String zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() throws RemoteException {
        InterfaceC0362b0 z2;
        Parcel parcelZzcZ = zzcZ(32, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            z2 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            z2 = iInterfaceQueryLocalInterface instanceof InterfaceC0362b0 ? (InterfaceC0362b0) iInterfaceQueryLocalInterface : new Z(strongBinder);
        }
        parcelZzcZ.recycle();
        return z2;
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() throws RemoteException {
        InterfaceC0407y c0403w;
        Parcel parcelZzcZ = zzcZ(33, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            c0403w = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            c0403w = iInterfaceQueryLocalInterface instanceof InterfaceC0407y ? (InterfaceC0407y) iInterfaceQueryLocalInterface : new C0403w(strongBinder);
        }
        parcelZzcZ.recycle();
        return c0403w;
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0401v);
        zzda(20, parcelZza);
    }

    @Override // D6.L
    public final void zzz(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(22, parcelZza);
    }
}
