package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaam extends zzbk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzaam() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final /* synthetic */ boolean zzA() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzf;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzg;
    }

    public final /* synthetic */ SparseArray zzG() {
        return this.zzh;
    }

    public final /* synthetic */ SparseBooleanArray zzH() {
        return this.zzi;
    }

    public final zzaam zzx(zzbl zzblVar) {
        zza(zzblVar);
        return this;
    }

    public final zzaam zzy(int i5, boolean z2) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        if (sparseBooleanArray.get(i5) == z2) {
            return this;
        }
        if (z2) {
            sparseBooleanArray.put(i5, true);
            return this;
        }
        sparseBooleanArray.delete(i5);
        return this;
    }

    public final /* synthetic */ boolean zzz() {
        return this.zza;
    }

    public /* synthetic */ zzaam(zzaan zzaanVar, byte[] bArr) {
        super(zzaanVar);
        this.zza = zzaanVar.zzK;
        this.zzb = zzaanVar.zzM;
        this.zzc = zzaanVar.zzO;
        this.zzd = zzaanVar.zzT;
        this.zze = zzaanVar.zzU;
        this.zzf = zzaanVar.zzV;
        this.zzg = zzaanVar.zzX;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        while (true) {
            SparseArray sparseArrayZze = zzaanVar.zze();
            if (i5 < sparseArrayZze.size()) {
                sparseArray.put(sparseArrayZze.keyAt(i5), new HashMap((Map) sparseArrayZze.valueAt(i5)));
                i5++;
            } else {
                this.zzh = sparseArray;
                this.zzi = zzaanVar.zzf().clone();
                return;
            }
        }
    }
}
