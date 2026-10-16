package A7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbu;
import com.google.android.gms.internal.measurement.zzbw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class G extends zzbu implements F {
    public G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // A7.F
    public final List E(String str, String str2, N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, n12);
        Parcel parcelZza = zza(16, parcelA_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(C0242d.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // A7.F
    public final void H(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(6, parcelA_);
    }

    @Override // A7.F
    public final void K(R1 r12, N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, r12);
        zzbw.zza(parcelA_, n12);
        zzb(2, parcelA_);
    }

    @Override // A7.F
    public final void M(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(26, parcelA_);
    }

    @Override // A7.F
    public final void Q(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(25, parcelA_);
    }

    @Override // A7.F
    public final List a(N1 n12, Bundle bundle) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzbw.zza(parcelA_, bundle);
        Parcel parcelZza = zza(24, parcelA_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(E1.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // A7.F
    public final void b(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(4, parcelA_);
    }

    @Override // A7.F
    public final void c(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(27, parcelA_);
    }

    @Override // A7.F
    public final List d(String str, String str2, String str3, boolean z2) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeString(null);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        zzbw.zza(parcelA_, z2);
        Parcel parcelZza = zza(15, parcelA_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(R1.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // A7.F
    public final void f(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(20, parcelA_);
    }

    @Override // A7.F
    public final void g(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        zzb(18, parcelA_);
    }

    @Override // A7.F
    public final void h(long j8, String str, String str2, String str3) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeLong(j8);
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        zzb(10, parcelA_);
    }

    @Override // A7.F
    public final List i(String str, String str2, String str3) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeString(null);
        parcelA_.writeString(str2);
        parcelA_.writeString(str3);
        Parcel parcelZza = zza(17, parcelA_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(C0242d.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // A7.F
    public final List j(String str, String str2, boolean z2, N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        parcelA_.writeString(str);
        parcelA_.writeString(str2);
        zzbw.zza(parcelA_, z2);
        zzbw.zza(parcelA_, n12);
        Parcel parcelZza = zza(14, parcelA_);
        ArrayList arrayListCreateTypedArrayList = parcelZza.createTypedArrayList(R1.CREATOR);
        parcelZza.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // A7.F
    public final void l(C0242d c0242d, N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, c0242d);
        zzbw.zza(parcelA_, n12);
        zzb(12, parcelA_);
    }

    @Override // A7.F
    public final String o(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        Parcel parcelZza = zza(11, parcelA_);
        String string = parcelZza.readString();
        parcelZza.recycle();
        return string;
    }

    @Override // A7.F
    public final C0251g r(N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, n12);
        Parcel parcelZza = zza(21, parcelA_);
        C0251g c0251g = (C0251g) zzbw.zza(parcelZza, C0251g.CREATOR);
        parcelZza.recycle();
        return c0251g;
    }

    @Override // A7.F
    public final void s(C0301x c0301x, N1 n12) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, c0301x);
        zzbw.zza(parcelA_, n12);
        zzb(1, parcelA_);
    }

    @Override // A7.F
    public final byte[] w(C0301x c0301x, String str) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, c0301x);
        parcelA_.writeString(str);
        Parcel parcelZza = zza(9, parcelA_);
        byte[] bArrCreateByteArray = parcelZza.createByteArray();
        parcelZza.recycle();
        return bArrCreateByteArray;
    }

    @Override // A7.F
    /* renamed from: a */
    public final void mo2a(N1 n12, Bundle bundle) throws RemoteException {
        Parcel parcelA_ = a_();
        zzbw.zza(parcelA_, bundle);
        zzbw.zza(parcelA_, n12);
        zzb(19, parcelA_);
    }
}
