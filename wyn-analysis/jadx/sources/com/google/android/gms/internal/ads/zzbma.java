package com.google.android.gms.internal.ads;

import D6.r1;
import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes3.dex */
public final class zzbma extends AbstractC2614a {
    public static final Parcelable.Creator<zzbma> CREATOR = new zzbmb();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final r1 zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbma(int i5, boolean z2, int i10, boolean z10, int i11, r1 r1Var, boolean z11, int i12, int i13, boolean z12, int i14) {
        this.zza = i5;
        this.zzb = z2;
        this.zzc = i10;
        this.zzd = z10;
        this.zze = i11;
        this.zzf = r1Var;
        this.zzg = z11;
        this.zzh = i12;
        this.zzj = z12;
        this.zzi = i13;
        this.zzk = i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.nativead.g zza(com.google.android.gms.internal.ads.zzbma r5) {
        /*
            com.google.android.gms.ads.nativead.f r0 = new com.google.android.gms.ads.nativead.f
            r0.<init>()
            if (r5 != 0) goto Ld
            com.google.android.gms.ads.nativead.g r5 = new com.google.android.gms.ads.nativead.g
            r5.<init>(r0)
            return r5
        Ld:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L43
            r3 = 3
            if (r1 == r3) goto L38
            r4 = 4
            if (r1 == r4) goto L19
            goto L47
        L19:
            boolean r1 = r5.zzg
            r0.f26342f = r1
            int r1 = r5.zzh
            r0.f26338b = r1
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.f26343g = r4
            r0.f26344h = r1
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.f26345i = r2
        L38:
            D6.r1 r1 = r5.zzf
            if (r1 == 0) goto L43
            x6.w r2 = new x6.w
            r2.<init>(r1)
            r0.f26340d = r2
        L43:
            int r1 = r5.zze
            r0.f26341e = r1
        L47:
            boolean r1 = r5.zzb
            r0.f26337a = r1
            boolean r5 = r5.zzd
            r0.f26339c = r5
            com.google.android.gms.ads.nativead.g r5 = new com.google.android.gms.ads.nativead.g
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbma.zza(com.google.android.gms.internal.ads.zzbma):com.google.android.gms.ads.nativead.g");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        boolean z2 = this.zzb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i11 = this.zzc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        boolean z10 = this.zzd;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i12 = this.zze;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i12);
        AbstractC1304a.Z(parcel, 6, this.zzf, i5, false);
        boolean z11 = this.zzg;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(z11 ? 1 : 0);
        int i13 = this.zzh;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(i13);
        int i14 = this.zzi;
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(i14);
        boolean z12 = this.zzj;
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        int i15 = this.zzk;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(i15);
        AbstractC1304a.m0(iL0, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public zzbma(A6.e eVar) {
        boolean z2 = eVar.f397a;
        x6.w wVar = eVar.f402f;
        this(4, z2, eVar.f398b, eVar.f400d, eVar.f401e, wVar != null ? new r1(wVar) : null, eVar.f403g, eVar.f399c, 0, false, 0);
    }
}
