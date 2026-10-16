package D6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.ArrayList;
import java.util.List;
import q7.InterfaceC3876a;

/* renamed from: D6.k0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0381k0 extends zzbel implements InterfaceC0385m0 {
    public C0381k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // D6.InterfaceC0385m0
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // D6.InterfaceC0385m0
    public final void zzf(float f10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f10);
        zzda(2, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzh(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzi(InterfaceC3876a interfaceC3876a, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC3876a);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzj(String str, InterfaceC3876a interfaceC3876a) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzben.zze(parcelZza, interfaceC3876a);
        zzda(6, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final float zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        float f10 = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f10;
    }

    @Override // D6.InterfaceC0385m0
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // D6.InterfaceC0385m0
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // D6.InterfaceC0385m0
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzo(zzbvj zzbvjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvjVar);
        zzda(11, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzp(zzbsd zzbsdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbsdVar);
        zzda(12, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final List zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzbrw.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // D6.InterfaceC0385m0
    public final void zzr(p1 p1Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, p1Var);
        zzda(14, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzs() throws RemoteException {
        zzda(15, zza());
    }

    @Override // D6.InterfaceC0385m0
    public final void zzt(InterfaceC0404w0 interfaceC0404w0) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, interfaceC0404w0);
        zzda(16, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzu(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i5 = zzben.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(17, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // D6.InterfaceC0385m0
    public final void zzw() throws RemoteException {
        zzda(19, zza());
    }
}
