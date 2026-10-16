package com.google.android.gms.internal.identity;

import Va.M6;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.Collections;
import java.util.List;
import ka.AbstractC3256n;
import x7.C4495g;

/* loaded from: classes.dex */
public final class zzh extends AbstractC2614a {
    public static final Parcelable.Creator<zzh> CREATOR;
    static final List zza = Collections.EMPTY_LIST;
    static final C4495g zzb;
    final C4495g zzc;
    final List zzd;
    final String zze;

    static {
        boolean z2 = 20000 >= 0 && 20000 < Long.MAX_VALUE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(20000L).length() + 102);
        sb2.append("Invalid interval: ");
        sb2.append(20000L);
        sb2.append(" should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        zzer.zzb(z2, sb2.toString());
        zzb = new C4495g(20000L, false);
        CREATOR = new zzi();
    }

    public zzh(C4495g c4495g, List list, String str) {
        this.zzc = c4495g;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return AbstractC1732v.m(this.zzc, zzhVar.zzc) && AbstractC1732v.m(this.zzd, zzhVar.zzd) && AbstractC1732v.m(this.zze, zzhVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.zze;
        StringBuilder sb2 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        AbstractC3256n.p(sb2, "DeviceOrientationRequestInternal[deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return M6.t(sb2, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.Z(parcel, 1, this.zzc, i5, false);
        AbstractC1304a.e0(parcel, 2, this.zzd, false);
        AbstractC1304a.a0(parcel, 3, this.zze, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
