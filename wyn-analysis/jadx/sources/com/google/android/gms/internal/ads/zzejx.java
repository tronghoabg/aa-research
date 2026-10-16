package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public final class zzejx implements zzfpt {
    private final zzejl zza;
    private final zzejp zzb;

    public zzejx(zzejl zzejlVar, zzejp zzejpVar) {
        this.zza = zzejlVar;
        this.zzb = zzejpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdL(zzfpm zzfpmVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdM(zzfpm zzfpmVar, String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue()) {
            if (zzfpm.RENDERER == zzfpmVar) {
                zzejl zzejlVar = this.zza;
                C6.n.f1857D.k.getClass();
                zzejlVar.zzg(SystemClock.elapsedRealtime());
            } else if (zzfpm.PRELOADED_LOADER == zzfpmVar || zzfpm.SERVER_TRANSACTION == zzfpmVar) {
                zzejl zzejlVar2 = this.zza;
                C6.n.f1857D.k.getClass();
                zzejlVar2.zza(SystemClock.elapsedRealtime());
                final zzejp zzejpVar = this.zzb;
                final long jZzb = zzejlVar2.zzb();
                zzejpVar.zza.zza(new zzfos() { // from class: com.google.android.gms.internal.ads.zzejo
                    @Override // com.google.android.gms.internal.ads.zzfos
                    public final /* synthetic */ Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzejpVar.zzf()) {
                            return null;
                        }
                        long j8 = jZzb;
                        zzbic.zzaf.zza.C0142zza c0142zzaZzz = zzbic.zzaf.zza.zzz();
                        c0142zzaZzz.zzad(j8);
                        byte[] bArrZzaN = c0142zzaZzz.zzbu().zzaN();
                        zzejw.zzf(sQLiteDatabase, false, false);
                        zzejw.zze(sQLiteDatabase, j8, bArrZzaN);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdN(zzfpm zzfpmVar, String str, Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.zza;
            if (zzejlVar.zzh() != 0) {
                C6.n.f1857D.k.getClass();
                zzejlVar.zzi(SystemClock.elapsedRealtime() - zzejlVar.zzh());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzdO(zzfpm zzfpmVar, String str) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue() && zzfpm.RENDERER == zzfpmVar) {
            zzejl zzejlVar = this.zza;
            if (zzejlVar.zzh() != 0) {
                C6.n.f1857D.k.getClass();
                zzejlVar.zzi(SystemClock.elapsedRealtime() - zzejlVar.zzh());
            }
        }
    }
}
