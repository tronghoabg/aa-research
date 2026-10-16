package D6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* renamed from: D6.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC0383l0 extends zzbem implements InterfaceC0385m0 {
    public AbstractBinderC0383l0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        InterfaceC0404w0 c0400u0;
        switch (i5) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                zzben.zzh(parcel);
                zzf(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzben.zzh(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzi(interfaceC3876aR, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                InterfaceC3876a interfaceC3876aR2 = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(string3, interfaceC3876aR2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzben.zzh(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvj zzbvjVarZzf = zzbvi.zzf(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(zzbvjVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbsd zzbsdVarZzc = zzbsc.zzc(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(zzbsdVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                p1 p1Var = (p1) zzben.zzb(parcel, p1.CREATOR);
                zzben.zzh(parcel);
                zzr(p1Var);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0400u0 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c0400u0 = iInterfaceQueryLocalInterface instanceof InterfaceC0404w0 ? (InterfaceC0404w0) iInterfaceQueryLocalInterface : new C0400u0(strongBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                zzben.zzh(parcel);
                zzt(c0400u0);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzu(zZza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzben.zzh(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
