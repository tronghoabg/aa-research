package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import x.C4429v;

/* loaded from: classes3.dex */
public final class zzdql {
    public static final zzdql zza = new zzdql(new zzdqk());
    private final zzbnj zzb;
    private final zzbng zzc;
    private final zzbnw zzd;
    private final zzbnt zze;
    private final zzbsr zzf;
    private final C4429v zzg;
    private final C4429v zzh;

    public /* synthetic */ zzdql(zzdqk zzdqkVar, byte[] bArr) {
        this(zzdqkVar);
    }

    public final zzbnj zza() {
        return this.zzb;
    }

    public final zzbng zzb() {
        return this.zzc;
    }

    public final zzbnw zzc() {
        return this.zzd;
    }

    public final zzbnt zzd() {
        return this.zze;
    }

    public final zzbsr zze() {
        return this.zzf;
    }

    public final zzbnp zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbnp) this.zzg.get(str);
    }

    public final zzbnm zzg(String str) {
        return (zzbnm) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        C4429v c4429v = this.zzg;
        ArrayList arrayList = new ArrayList(c4429v.f47563c);
        for (int i5 = 0; i5 < c4429v.f47563c; i5++) {
            arrayList.add((String) c4429v.g(i5));
        }
        return arrayList;
    }

    private zzdql(zzdqk zzdqkVar) {
        this.zzb = zzdqkVar.zza;
        this.zzc = zzdqkVar.zzb;
        this.zzd = zzdqkVar.zzc;
        this.zzg = new C4429v(zzdqkVar.zzf);
        this.zzh = new C4429v(zzdqkVar.zzg);
        this.zze = zzdqkVar.zzd;
        this.zzf = zzdqkVar.zze;
    }
}
