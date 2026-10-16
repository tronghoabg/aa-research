package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public abstract class zzbmh extends zzbem implements zzbmi {
    public zzbmh() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    public final boolean zzdd(int i5, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbnq zzbnqVar;
        switch (i5) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                InterfaceC3876a interfaceC3876aR = BinderC3877b.R(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzf(interfaceC3876aR);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC3876a interfaceC3876aZzg = zzg();
                parcel2.writeNoException();
                zzben.zze(parcel2, interfaceC3876aZzg);
                return true;
            case 5:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 6:
                float fZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzi);
                return true;
            case 7:
                L0 l0Zzj = zzj();
                parcel2.writeNoException();
                zzben.zze(parcel2, l0Zzj);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i11 = zzben.zza;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbnqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    zzbnqVar = iInterfaceQueryLocalInterface instanceof zzbnq ? (zzbnq) iInterfaceQueryLocalInterface : new zzbnq(strongBinder);
                }
                zzben.zzh(parcel);
                zzm(zzbnqVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i12 = zzben.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
