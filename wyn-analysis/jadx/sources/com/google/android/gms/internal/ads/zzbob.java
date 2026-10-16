package com.google.android.gms.internal.ads;

import D6.A0;
import D6.BinderC0363b1;
import D6.C0389o0;
import D6.H0;
import D6.InterfaceC0391p0;
import D6.InterfaceC0396s0;
import D6.L0;
import D6.n1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbob extends zzbem implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbnz zzbnxVar = null;
        InterfaceC0391p0 c0389o0 = null;
        switch (i5) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbml zzbmlVarZzh = zzh();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmlVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                L0 l0Zzn = zzn();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzn);
                return true;
            case 12:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbme zzbmeVarZzq = zzq();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmeVarZzq);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                InterfaceC3876a interfaceC3876aZzu = zzu();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzu);
                return true;
            case 19:
                InterfaceC3876a interfaceC3876aZzv = zzv();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzv);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbnxVar = iInterfaceQueryLocalInterface instanceof zzbnz ? (zzbnz) iInterfaceQueryLocalInterface : new zzbnx(strongBinder);
                }
                zzben.zzh(parcel);
                zzx(zzbnxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzz);
                return true;
            case 24:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 25:
                InterfaceC0396s0 interfaceC0396s0R = BinderC0363b1.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzB(interfaceC0396s0R);
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    c0389o0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0391p0 ? (InterfaceC0391p0) iInterfaceQueryLocalInterface2 : new C0389o0(strongBinder2, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                }
                zzben.zzh(parcel);
                zzC(c0389o0);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbmi zzbmiVarZzF = zzF();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmiVarZzF);
                return true;
            case 30:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzG ? 1 : 0);
                return true;
            case 31:
                H0 h0ZzH = zzH();
                parcel2.writeNoException();
                zzben.zze(parcel2, h0ZzH);
                return true;
            case 32:
                A0 a0R = n1.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzI(a0R);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long jZzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(jZzK);
                return true;
            case 35:
                long j8 = parcel.readLong();
                zzben.zzh(parcel);
                zzL(j8);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
