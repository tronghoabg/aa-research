package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import j9.C3094d;
import j9.C3095e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class zzsk implements zzry {
    private final zzmw zza;
    private zzqt zzb = new zzqt();

    private zzsk(zzmw zzmwVar, int i5) {
        this.zza = zzmwVar;
        zzsv.zza();
    }

    public static zzry zzf(zzmw zzmwVar) {
        return new zzsk(zzmwVar, 0);
    }

    public static zzry zzg() {
        return new zzsk(new zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zza(zzmv zzmvVar) {
        this.zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzb(zznc zzncVar) {
        this.zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzc(zzqt zzqtVar) {
        this.zzb = zzqtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final String zzd() {
        String strZzk;
        zzqv zzqvVarZzf = this.zza.zzk().zzf();
        if (zzqvVarZzf == null || (strZzk = zzqvVarZzf.zzk()) == null || strZzk.isEmpty()) {
            return "NA";
        }
        String strZzk2 = zzqvVarZzf.zzk();
        AbstractC1732v.i(strZzk2);
        return strZzk2;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i5, boolean z2) throws IOException {
        this.zzb.zzf(Boolean.valueOf(1 == (i5 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzsv.zza();
            if (i5 != 0) {
                zzmy zzmyVarZzk = this.zza.zzk();
                zzbg zzbgVar = new zzbg();
                zzkr.zza.configure(zzbgVar);
                return zzbgVar.zza().zza(zzmyVarZzk);
            }
            zzmy zzmyVarZzk2 = this.zza.zzk();
            C3094d c3094d = new C3094d();
            zzkr.zza.configure(c3094d);
            c3094d.f38685d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C3095e c3095e = new C3095e(stringWriter, c3094d.f38682a, c3094d.f38683b, c3094d.f38684c, c3094d.f38685d);
                c3095e.a(zzmyVarZzk2);
                c3095e.c();
                c3095e.f38687b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes("utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
