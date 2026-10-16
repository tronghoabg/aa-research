package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzanv implements zzahm {
    private final zzahm zza;
    private final zzanq zzb;
    private zzans zzg;
    private zzv zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzfm.zzb;
    private final zzeu zzc = new zzeu();

    public zzanv(zzahm zzahmVar, zzanq zzanqVar) {
        this.zza = zzahmVar;
        this.zzb = zzanqVar;
    }

    private final void zzi(int i5) {
        int length = this.zzf.length;
        int i10 = this.zze;
        if (length - i10 >= i5) {
            return;
        }
        int i11 = i10 - this.zzd;
        int iMax = Math.max(i11 + i11, i5 + i11);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i11);
        this.zzd = 0;
        this.zze = i11;
        this.zzf = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
        String str = zzvVar.zzp;
        str.getClass();
        zzgtr.zza(zzas.zzf(str) == 3);
        if (!zzvVar.equals(this.zzh)) {
            this.zzh = zzvVar;
            zzanq zzanqVar = this.zzb;
            this.zzg = zzanqVar.zza(zzvVar) ? zzanqVar.zzc(zzvVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzA(zzvVar);
            return;
        }
        zzahm zzahmVar = this.zza;
        zzt zztVarZza = zzvVar.zza();
        zztVarZza.zzo("application/x-media3-cues");
        zztVarZza.zzk(str);
        zztVarZza.zzt(Long.MAX_VALUE);
        zztVarZza.zzN(this.zzb.zzb(zzvVar));
        zzahmVar.zzA(zztVarZza.zzP());
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzP(long j8) {
        AbstractC1745i.a(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ int zza(zzj zzjVar, int i5, boolean z2) {
        return AbstractC1745i.b(this, zzjVar, i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i5, boolean z2, int i10) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzb(zzjVar, i5, z2, 0);
        }
        zzi(i5);
        int iZza = zzjVar.zza(this.zzf, this.zze, i5);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzc(zzeu zzeuVar, int i5) {
        AbstractC1745i.c(this, zzeuVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i5, int i10) {
        if (this.zzg == null) {
            this.zza.zzd(zzeuVar, i5, i10);
            return;
        }
        zzi(i5);
        zzeuVar.zzm(this.zzf, this.zze, i5);
        this.zze += i5;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(final long j8, final int i5, int i10, int i11, zzahl zzahlVar) {
        if (this.zzg == null) {
            this.zza.zze(j8, i5, i10, i11, zzahlVar);
            return;
        }
        zzgtr.zzb(zzahlVar == null, "DRM on subtitles is not supported");
        int i12 = (this.zze - i11) - i10;
        try {
            this.zzg.zza(this.zzf, i12, i10, zzanr.zza(), new zzdu() { // from class: com.google.android.gms.internal.ads.zzanu
                @Override // com.google.android.gms.internal.ads.zzdu
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzh(j8, i5, (zzank) obj);
                }
            });
        } catch (RuntimeException e7) {
            if (!this.zzi) {
                throw e7;
            }
            zzeh.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
        }
        int i13 = i12 + i10;
        this.zzd = i13;
        if (i13 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }

    public final void zzf(boolean z2) {
        this.zzi = true;
    }

    public final /* synthetic */ void zzh(long j8, int i5, zzank zzankVar) {
        this.zzh.getClass();
        zzgwt zzgwtVar = zzankVar.zza;
        long j10 = zzankVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgwtVar.size());
        Iterator<E> it = zzgwtVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcy) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzeu zzeuVar = this.zzc;
        int length = bArrMarshall.length;
        zzeuVar.zzb(bArrMarshall, length);
        zzahm zzahmVar = this.zza;
        zzahmVar.zzc(zzeuVar, length);
        long j11 = zzankVar.zzb;
        if (j11 == -9223372036854775807L) {
            zzgtr.zzi(this.zzh.zzu == Long.MAX_VALUE);
        } else {
            long j12 = this.zzh.zzu;
            j8 = j12 == Long.MAX_VALUE ? j8 + j11 : j11 + j12;
        }
        zzahmVar.zze(j8, i5 | 1, length, 0, null);
    }
}
