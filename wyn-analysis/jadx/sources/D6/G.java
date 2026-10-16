package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbsr;

/* loaded from: classes3.dex */
public abstract class G extends zzbem implements H {
    public G() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        InterfaceC0407y c0403w = null;
        C0369e0 c0369e0 = null;
        switch (i5) {
            case 1:
                E eZze = zze();
                parcel2.writeNoException();
                zzben.zze(parcel2, eZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c0403w = iInterfaceQueryLocalInterface instanceof InterfaceC0407y ? (InterfaceC0407y) iInterfaceQueryLocalInterface : new C0403w(strongBinder);
                }
                zzben.zzh(parcel);
                zzf(c0403w);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbng zzbngVarZzb = zzbnf.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzg(zzbngVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbnj zzbnjVarZzb = zzbni.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(zzbnjVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbnp zzbnpVarZzb = zzbno.zzb(parcel.readStrongBinder());
                zzbnm zzbnmVarZzb = zzbnl.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(string, zzbnpVarZzb, zzbnmVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                zzben.zzh(parcel);
                zzj(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c0369e0 = iInterfaceQueryLocalInterface2 instanceof C0369e0 ? (C0369e0) iInterfaceQueryLocalInterface2 : new C0369e0(strongBinder2);
                }
                zzben.zzh(parcel);
                zzq(c0369e0);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbnt zzbntVarZzb = zzbns.zzb(parcel.readStrongBinder());
                x1 x1Var = (x1) zzben.zzb(parcel, x1.CREATOR);
                zzben.zzh(parcel);
                zzk(zzbntVarZzb, x1Var);
                parcel2.writeNoException();
                return true;
            case 9:
                A6.g gVar = (A6.g) zzben.zzb(parcel, A6.g.CREATOR);
                zzben.zzh(parcel);
                zzl(gVar);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbnw zzbnwVarZzb = zzbnv.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzm(zzbnwVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbsi zzbsiVar = (zzbsi) zzben.zzb(parcel, zzbsi.CREATOR);
                zzben.zzh(parcel);
                zzn(zzbsiVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsr zzbsrVarZzb = zzbsq.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(zzbsrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                A6.a aVar = (A6.a) zzben.zzb(parcel, A6.a.CREATOR);
                zzben.zzh(parcel);
                zzp(aVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
