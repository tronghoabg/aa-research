package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzck {
    private final zzgwt zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzgwt zzgwtVar) {
        this.zza = zzgwtVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final void zzi(ByteBuffer byteBuffer) {
        boolean z2;
        do {
            int i5 = 0;
            z2 = false;
            while (i5 <= zzj()) {
                if (!this.zzc[i5].hasRemaining()) {
                    List list = this.zzb;
                    zzcp zzcpVar = (zzcp) list.get(i5);
                    if (!zzcpVar.zzg()) {
                        ByteBuffer byteBuffer2 = i5 > 0 ? this.zzc[i5 - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcp.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcpVar.zzd(byteBuffer2);
                        this.zzc[i5] = zzcpVar.zzf();
                        boolean z10 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.zzc[i5].hasRemaining()) {
                            z10 = false;
                        }
                        z2 |= z10;
                    } else if (!this.zzc[i5].hasRemaining() && i5 < zzj()) {
                        ((zzcp) list.get(i5 + 1)).zze();
                    }
                }
                i5++;
            }
        } while (z2);
    }

    private final int zzj() {
        return this.zzc.length - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzgwt zzgwtVar = this.zza;
        int size = zzgwtVar.size();
        zzgwt zzgwtVar2 = ((zzck) obj).zza;
        if (size != zzgwtVar2.size()) {
            return false;
        }
        for (int i5 = 0; i5 < zzgwtVar.size(); i5++) {
            if (zzgwtVar.get(i5) != zzgwtVar2.get(i5)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzco {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int i5 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                return zzclVar;
            }
            zzcp zzcpVar = (zzcp) zzgwtVar.get(i5);
            zzcl zzclVarZzb = zzcpVar.zzb(zzclVar);
            if (zzcpVar.zzc()) {
                zzgtr.zzi(!zzclVarZzb.equals(r0));
                zzclVar = zzclVarZzb;
            }
            i5++;
        }
    }

    public final void zzb(zzcn zzcnVar) {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i5 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                break;
            }
            zzcp zzcpVar = (zzcp) zzgwtVar.get(i5);
            zzcpVar.zzi(zzcnVar);
            if (zzcpVar.zzc()) {
                zzcm zzcmVar = new zzcm(zzcnVar, null);
                zzcmVar.zza(zzcpVar.zza(zzcnVar.zzb));
                zzcnVar = zzcmVar.zzd();
                list.add(zzcpVar);
            }
            i5++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i10 = 0; i10 <= zzj(); i10++) {
            this.zzc[i10] = ((zzcp) list.get(i10)).zzf();
        }
    }

    public final boolean zzc() {
        return !this.zzb.isEmpty();
    }

    public final void zzd(ByteBuffer byteBuffer) {
        if (!zzc() || this.zzd) {
            return;
        }
        zzi(byteBuffer);
    }

    public final ByteBuffer zze() {
        if (!zzc()) {
            return zzcp.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzj()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzi(zzcp.zza);
        return this.zzc[zzj()];
    }

    public final void zzf() {
        if (!zzc() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcp) this.zzb.get(0)).zze();
    }

    public final boolean zzg() {
        return this.zzd && ((zzcp) this.zzb.get(zzj())).zzg() && !this.zzc[zzj()].hasRemaining();
    }

    public final void zzh() {
        int i5 = 0;
        while (true) {
            zzgwt zzgwtVar = this.zza;
            if (i5 >= zzgwtVar.size()) {
                this.zzb.clear();
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            }
            zzcp zzcpVar = (zzcp) zzgwtVar.get(i5);
            zzcpVar.zzi(zzcn.zza);
            zzcpVar.zzj();
            i5++;
        }
    }
}
