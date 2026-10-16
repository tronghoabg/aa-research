package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.AbstractC1732v;
import j9.C3094d;
import j9.C3095e;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class zzuf implements zztr {
    private final zzow zza;
    private zzsr zzb = new zzsr();
    private final int zzc;

    private zzuf(zzow zzowVar, int i5) {
        this.zza = zzowVar;
        zzuo.zza();
        this.zzc = i5;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i5) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.zza.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.zzb = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzstVarZzf = this.zza.zzj().zzf();
        if (zzstVarZzf == null || zzy.zzb(zzstVarZzf.zzk())) {
            return "NA";
        }
        String strZzk = zzstVarZzf.zzk();
        AbstractC1732v.i(strZzk);
        return strZzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i5, boolean z2) throws IOException {
        this.zzb.zzf(Boolean.valueOf(1 == (i5 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzuo.zza();
            if (i5 != 0) {
                zzoy zzoyVarZzj = this.zza.zzj();
                zzdb zzdbVar = new zzdb();
                zzmq.zza.configure(zzdbVar);
                return zzdbVar.zza().zza(zzoyVarZzj);
            }
            zzoy zzoyVarZzj2 = this.zza.zzj();
            C3094d c3094d = new C3094d();
            zzmq.zza.configure(c3094d);
            c3094d.f38685d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                C3095e c3095e = new C3095e(stringWriter, c3094d.f38682a, c3094d.f38683b, c3094d.f38684c, c3094d.f38685d);
                c3095e.a(zzoyVarZzj2);
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
