package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzbhw {
    private final zzbib zza;
    private final zzbic.zzt.zza zzb;
    private final boolean zzc;

    private zzbhw() {
        this.zzb = zzbic.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbib();
    }

    public static zzbhw zza() {
        return new zzbhw();
    }

    private final synchronized void zzd(int i5) {
        zzbic.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(U.H());
        zzbia zzbiaVar = new zzbia(this.zza, zzaVar.zzbu().zzaN(), null);
        int i10 = i5 - 1;
        zzbiaVar.zzb(i10);
        zzbiaVar.zza();
        G6.L.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    private final synchronized void zze(int i5) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfzu.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i5).getBytes());
                } catch (IOException unused) {
                    G6.L.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        G6.L.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    G6.L.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            G6.L.k("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i5) {
        StringBuilder sb2;
        zzbic.zzt.zza zzaVar = this.zzb;
        String strZzf = zzaVar.zzf();
        C6.n.f1857D.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbu().zzaN(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strZzf);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i5 - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public final synchronized void zzb(zzbhv zzbhvVar) {
        if (this.zzc) {
            try {
                zzbhvVar.zza(this.zzb);
            } catch (NullPointerException e7) {
                C6.n.f1857D.f1868h.zzh(e7, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i5) {
        if (this.zzc) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgl)).booleanValue()) {
                zze(i5);
            } else {
                zzd(i5);
            }
        }
    }

    public zzbhw(zzbib zzbibVar) {
        this.zzb = zzbic.zzt.zzx();
        this.zza = zzbibVar;
        this.zzc = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgk)).booleanValue();
    }
}
