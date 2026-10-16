package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzaff {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;
    public final String zzl;

    private zzaff(List list, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.zza = list;
        this.zzb = i5;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = i13;
        this.zzg = i14;
        this.zzh = i15;
        this.zzi = i16;
        this.zzj = i17;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzaff zza(zzeu zzeuVar) throws zzat {
        String strZzb;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        int i16;
        try {
            zzeuVar.zzk(4);
            int iZzs = (zzeuVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzeuVar.zzs() & 31;
            for (int i17 = 0; i17 < iZzs2; i17++) {
                arrayList.add(zzb(zzeuVar));
            }
            int iZzs3 = zzeuVar.zzs();
            for (int i18 = 0; i18 < iZzs3; i18++) {
                arrayList.add(zzb(zzeuVar));
            }
            if (iZzs2 > 0) {
                zzgq zzgqVarZze = zzgr.zze((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i19 = zzgqVarZze.zze;
                int i20 = zzgqVarZze.zzf;
                int i21 = zzgqVarZze.zzh + 8;
                int i22 = zzgqVarZze.zzi + 8;
                int i23 = zzgqVarZze.zzj;
                int i24 = zzgqVarZze.zzk;
                int i25 = zzgqVarZze.zzl;
                int i26 = zzgqVarZze.zzm;
                float f11 = zzgqVarZze.zzg;
                strZzb = zzdr.zzb(zzgqVarZze.zza, zzgqVarZze.zzb, zzgqVarZze.zzc);
                i13 = i25;
                i14 = i26;
                f10 = f11;
                i12 = i22;
                i15 = i23;
                i16 = i24;
                i5 = i19;
                i10 = i20;
                i11 = i21;
            } else {
                strZzb = null;
                i5 = -1;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = 16;
                f10 = 1.0f;
                i15 = -1;
                i16 = -1;
            }
            return new zzaff(arrayList, iZzs, i5, i10, i11, i12, i15, i16, i13, i14, f10, strZzb);
        } catch (ArrayIndexOutOfBoundsException e7) {
            throw zzat.zzb("Error parsing AVC config", e7);
        }
    }

    private static byte[] zzb(zzeu zzeuVar) {
        int iZzt = zzeuVar.zzt();
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(iZzt);
        return zzdr.zzh(zzeuVar.zzi(), iZzg, iZzt);
    }
}
