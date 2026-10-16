package D6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzccc;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class K extends zzbem implements L {
    public K() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static L zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof L ? (L) iInterfaceQueryLocalInterface : new J(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        InterfaceC0407y c0403w = null;
        InterfaceC0373g0 c0371f0 = null;
        B c0409z = null;
        A0 c0410z0 = null;
        O n10 = null;
        C0369e0 c0369e0 = null;
        InterfaceC0401v c0399u = null;
        InterfaceC0362b0 z2 = null;
        switch (i5) {
            case 1:
                InterfaceC3876a interfaceC3876aZzb = zzb();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                v1 v1Var = (v1) zzben.zzb(parcel, v1.CREATOR);
                zzben.zzh(parcel);
                boolean zZze = zze(v1Var);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c0403w = iInterfaceQueryLocalInterface instanceof InterfaceC0407y ? (InterfaceC0407y) iInterfaceQueryLocalInterface : new C0403w(strongBinder);
                }
                zzben.zzh(parcel);
                zzdS(c0403w);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    z2 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0362b0 ? (InterfaceC0362b0) iInterfaceQueryLocalInterface2 : new Z(strongBinder2);
                }
                zzben.zzh(parcel);
                zzi(z2);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                x1 x1VarZzn = zzn();
                parcel2.writeNoException();
                zzben.zzd(parcel2, x1VarZzn);
                return true;
            case 13:
                x1 x1Var = (x1) zzben.zzb(parcel, x1.CREATOR);
                zzben.zzh(parcel);
                zzo(x1Var);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbzr zzbzrVarZzb = zzbzq.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(zzbzrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbzu zzbzuVarZzb = zzbzt.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzben.zzh(parcel);
                zzq(zzbzuVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzbjs zzbjsVarZzb = zzbjr.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzx(zzbjsVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c0399u = iInterfaceQueryLocalInterface3 instanceof InterfaceC0401v ? (InterfaceC0401v) iInterfaceQueryLocalInterface3 : new C0399u(strongBinder3, "com.google.android.gms.ads.internal.client.IAdClickListener");
                }
                zzben.zzh(parcel);
                zzy(c0399u);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0369e0 = iInterfaceQueryLocalInterface4 instanceof C0369e0 ? (C0369e0) iInterfaceQueryLocalInterface4 : new C0369e0(strongBinder4);
                }
                zzben.zzh(parcel);
                zzY(c0369e0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzz(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                zzccc zzcccVarZzb = zzccb.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzC(zzcccVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                L0 l0ZzF = zzF();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0ZzF);
                return true;
            case 29:
                r1 r1Var = (r1) zzben.zzb(parcel, r1.CREATOR);
                zzben.zzh(parcel);
                zzG(r1Var);
                parcel2.writeNoException();
                return true;
            case 30:
                O0 o02 = (O0) zzben.zzb(parcel, O0.CREATOR);
                zzben.zzh(parcel);
                zzH(o02);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                InterfaceC0362b0 interfaceC0362b0Zzv = zzv();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC0362b0Zzv);
                return true;
            case 33:
                InterfaceC0407y interfaceC0407yZzw = zzw();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC0407yZzw);
                return true;
            case 34:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzK(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    n10 = iInterfaceQueryLocalInterface5 instanceof O ? (O) iInterfaceQueryLocalInterface5 : new N(strongBinder5);
                }
                zzben.zzh(parcel);
                zzj(n10);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzk);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzben.zzh(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                A1 a12 = (A1) zzben.zzb(parcel, A1.CREATOR);
                zzben.zzh(parcel);
                zzI(a12);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbgt zzbgtVarZze = zzbgs.zze(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzJ(zzbgtVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                H0 h0Zzt = zzt();
                parcel2.writeNoException();
                zzben.zze(parcel2, h0Zzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c0410z0 = iInterfaceQueryLocalInterface6 instanceof A0 ? (A0) iInterfaceQueryLocalInterface6 : new C0410z0(strongBinder6);
                }
                zzben.zzh(parcel);
                zzP(c0410z0);
                parcel2.writeNoException();
                return true;
            case 43:
                v1 v1Var2 = (v1) zzben.zzb(parcel, v1.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c0409z = iInterfaceQueryLocalInterface7 instanceof B ? (B) iInterfaceQueryLocalInterface7 : new C0409z(strongBinder7, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
                }
                zzben.zzh(parcel);
                zzQ(v1Var2, c0409z);
                parcel2.writeNoException();
                return true;
            case 44:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzR(interfaceC3876aR);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c0371f0 = iInterfaceQueryLocalInterface8 instanceof InterfaceC0373g0 ? (InterfaceC0373g0) iInterfaceQueryLocalInterface8 : new C0371f0(strongBinder8, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                }
                zzben.zzh(parcel);
                zzS(c0371f0);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i13 = zzben.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 47:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case 48:
                long j8 = parcel.readLong();
                zzben.zzh(parcel);
                zzT(j8);
                parcel2.writeNoException();
                return true;
        }
    }
}
