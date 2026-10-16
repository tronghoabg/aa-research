package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import x7.F;
import x7.I;

/* loaded from: classes.dex */
public final class zzee extends AbstractC2614a {
    public static final Parcelable.Creator<zzee> CREATOR = new zzef();
    private final int zza;
    private final IBinder zzb;
    private final IBinder zzc;
    private final PendingIntent zzd;
    private final String zze;

    public zzee(int i5, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.zza = i5;
        this.zzb = iBinder;
        this.zzc = iBinder2;
        this.zzd = pendingIntent;
        this.zze = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, x7.I] */
    public static zzee zza(IInterface iInterface, I i5, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(1, iInterface, i5, null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.IBinder, x7.F] */
    public static zzee zzb(IInterface iInterface, F f10, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new zzee(2, iInterface, f10, null, str);
    }

    public static zzee zzc(PendingIntent pendingIntent) {
        return new zzee(3, null, null, pendingIntent, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzee zzd(zzz zzzVar) {
        return new zzee(4, null, zzzVar, null, null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        AbstractC1304a.V(parcel, 2, this.zzb);
        AbstractC1304a.V(parcel, 3, this.zzc);
        AbstractC1304a.Z(parcel, 4, this.zzd, i5, false);
        AbstractC1304a.a0(parcel, 6, this.zze, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
