package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzfyv extends AbstractC2614a {
    public static final Parcelable.Creator<zzfyv> CREATOR = new zzfyw();
    public final int zza;
    private zzayt zzb = null;
    private byte[] zzc;

    public zzfyv(int i5, byte[] bArr) {
        this.zza = i5;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzayt zzaytVar = this.zzb;
        if (zzaytVar != null || this.zzc == null) {
            if (zzaytVar == null || this.zzc != null) {
                if (zzaytVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaytVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        byte[] bArrZzaN = this.zzc;
        if (bArrZzaN == null) {
            bArrZzaN = this.zzb.zzaN();
        }
        AbstractC1304a.T(parcel, 2, bArrZzaN, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final zzayt zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzayt.zzi(this.zzc, zzidz.zzb());
                this.zzc = null;
            } catch (zzifh | NullPointerException e7) {
                throw new IllegalStateException(e7);
            }
        }
        zzb();
        return this.zzb;
    }
}
