package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import j9.C3094d;
import j9.C3095e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i5) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzlaVarZzc = this.zza.zzf().zzc();
        if (zzlaVarZzc == null || zzg.zzb(zzlaVarZzc.zzk())) {
            return "NA";
        }
        String strZzk = zzlaVarZzc.zzk();
        AbstractC1732v.i(strZzk);
        return strZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i5, boolean z2) throws IOException {
        this.zzb.zzf(Boolean.valueOf(1 == (i5 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i5 != 0) {
                zziy zziyVarZzf = this.zza.zzf();
                zzam zzamVar = new zzam();
                zzhe.zza.configure(zzamVar);
                return zzamVar.zza().zza(zziyVarZzf);
            }
            zziy zziyVarZzf2 = this.zza.zzf();
            C3094d c3094d = new C3094d();
            zzhe.zza.configure(c3094d);
            c3094d.f38685d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C3095e c3095e = new C3095e(stringWriter, c3094d.f38682a, c3094d.f38683b, c3094d.f38684c, c3094d.f38685d);
                c3095e.a(zziyVarZzf2);
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
