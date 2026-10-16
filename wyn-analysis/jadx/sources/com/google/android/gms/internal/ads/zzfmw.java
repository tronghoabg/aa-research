package com.google.android.gms.internal.ads;

import D6.A1;
import D6.C0395s;
import D6.v1;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbic;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfmw implements zzfmv {
    private final ConcurrentHashMap zza;
    private final zzfnc zzb;
    private final zzfmy zzc = new zzfmy();

    public zzfmw(zzfnc zzfncVar) {
        this.zza = new ConcurrentHashMap(zzfncVar.zzd);
        this.zzb = zzfncVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfnc> creator = zzfnc.CREATOR;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzht)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zzfnc zzfncVar = this.zzb;
            sb2.append(zzfncVar.zzb);
            sb2.append(" PoolCollection");
            sb2.append(this.zzc.zzg());
            int i5 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i5++;
                sb2.append(i5);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((zzfnf) entry.getKey()).hashCode());
                sb2.append("    ");
                for (int i10 = 0; i10 < ((zzfmu) entry.getValue()).zzc(); i10++) {
                    sb2.append("[O]");
                }
                for (int iZzc = ((zzfmu) entry.getValue()).zzc(); iZzc < zzfncVar.zzd; iZzc++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                sb2.append(((zzfmu) entry.getValue()).zzg());
                sb2.append("\n");
            }
            while (i5 < zzfncVar.zzc) {
                i5++;
                sb2.append(i5);
                sb2.append(".\n");
            }
            String string = sb2.toString();
            int i11 = G6.L.f4523b;
            H6.l.a(string);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized zzfne zza(zzfnf zzfnfVar) {
        zzfne zzfneVarZzb;
        try {
            zzfmu zzfmuVar = (zzfmu) this.zza.get(zzfnfVar);
            if (zzfmuVar != null) {
                zzfneVarZzb = zzfmuVar.zzb();
                if (zzfneVarZzb == null) {
                    this.zzc.zzb();
                }
                zzfns zzfnsVarZzh = zzfmuVar.zzh();
                if (zzfneVarZzb != null) {
                    zzbic.zzb.zzc zzcVarZzs = zzbic.zzb.zzs();
                    zzbic.zzb.zza.C0143zza c0143zzaZzs = zzbic.zzb.zza.zzs();
                    c0143zzaZzs.zzc(zzbic.zzb.zzd.IN_MEMORY);
                    zzbic.zzb.zze.zza zzaVarZzq = zzbic.zzb.zze.zzq();
                    zzaVarZzq.zzc(zzfnsVarZzh.zza);
                    zzaVarZzq.zzg(zzfnsVarZzh.zzb);
                    c0143zzaZzs.zzh(zzaVarZzq);
                    zzcVarZzs.zzh(c0143zzaZzs);
                    zzfneVarZzb.zza.zza().zzd().zzj(zzcVarZzs.zzbu());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfneVarZzb = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfneVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized boolean zzb(zzfnf zzfnfVar, zzfne zzfneVar) {
        boolean zZza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfmu zzfmuVar = (zzfmu) concurrentHashMap.get(zzfnfVar);
            C6.n.f1857D.k.getClass();
            zzfneVar.zzd = System.currentTimeMillis();
            if (zzfmuVar == null) {
                zzfnc zzfncVar = this.zzb;
                zzfmu zzfmuVar2 = new zzfmu(zzfncVar.zzd, zzfncVar.zze * 1000);
                if (concurrentHashMap.size() == zzfncVar.zzc) {
                    int i5 = zzfncVar.zzg;
                    int i10 = i5 - 1;
                    zzfnf zzfnfVar2 = null;
                    if (i5 == 0) {
                        throw null;
                    }
                    long jZzd = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry.getValue()).zzd() < jZzd) {
                                jZzd = ((zzfmu) entry.getValue()).zzd();
                                zzfnfVar2 = (zzfnf) entry.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    } else if (i10 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry2.getValue()).zze() < jZzd) {
                                jZzd = ((zzfmu) entry2.getValue()).zze();
                                zzfnfVar2 = (zzfnf) entry2.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    } else if (i10 == 2) {
                        int iZzf = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfmu) entry3.getValue()).zzf() < iZzf) {
                                iZzf = ((zzfmu) entry3.getValue()).zzf();
                                zzfnfVar2 = (zzfnf) entry3.getKey();
                            }
                        }
                        if (zzfnfVar2 != null) {
                            concurrentHashMap.remove(zzfnfVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfnfVar, zzfmuVar2);
                this.zzc.zzc();
                zzfmuVar = zzfmuVar2;
            }
            zZza = zzfmuVar.zza(zzfneVar);
            zzfmy zzfmyVar = this.zzc;
            zzfmyVar.zze();
            zzfmx zzfmxVarZzf = zzfmyVar.zzf();
            zzfns zzfnsVarZzh = zzfmuVar.zzh();
            zzbic.zzb.zzc zzcVarZzs = zzbic.zzb.zzs();
            zzbic.zzb.zza.C0143zza c0143zzaZzs = zzbic.zzb.zza.zzs();
            c0143zzaZzs.zzc(zzbic.zzb.zzd.IN_MEMORY);
            zzbic.zzb.zzg.zza zzaVarZzs = zzbic.zzb.zzg.zzs();
            zzaVarZzs.zzc(zzfmxVarZzf.zza);
            zzaVarZzs.zzg(zzfmxVarZzf.zzb);
            zzaVarZzs.zzk(zzfnsVarZzh.zzb);
            c0143zzaZzs.zzn(zzaVarZzs);
            zzcVarZzs.zzh(c0143zzaZzs);
            zzfneVar.zza.zza().zzd().zzk(zzcVarZzs.zzbu());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final synchronized boolean zzc(zzfnf zzfnfVar) {
        zzfmu zzfmuVar = (zzfmu) this.zza.get(zzfnfVar);
        if (zzfmuVar == null) {
            return true;
        }
        return zzfmuVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    @Deprecated
    public final zzfnf zzd(v1 v1Var, String str, A1 a12) {
        zzfnc zzfncVar = this.zzb;
        return new zzfng(v1Var, str, new zzcbn(zzfncVar.zza).zza().zzj, zzfncVar.zzf, a12);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final zzfnc zze() {
        return this.zzb;
    }
}
