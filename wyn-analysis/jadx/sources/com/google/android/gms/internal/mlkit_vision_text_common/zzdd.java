package com.google.android.gms.internal.mlkit_vision_text_common;

import h9.b;
import h9.d;
import h9.h;
import java.io.IOException;

/* loaded from: classes4.dex */
final class zzdd implements h {
    private boolean zza = false;
    private boolean zzb = false;
    private d zzc;
    private final zzcz zzd;

    public zzdd(zzcz zzczVar) {
        this.zzd = zzczVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final h add(double d3) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d3, this.zzb);
        return this;
    }

    public final void zza(d dVar, boolean z2) {
        this.zza = false;
        this.zzc = dVar;
        this.zzb = z2;
    }

    public final h add(float f10) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f10, this.zzb);
        return this;
    }

    public final h add(int i5) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i5, this.zzb);
        return this;
    }

    public final h add(long j8) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j8, this.zzb);
        return this;
    }

    @Override // h9.h
    public final h add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // h9.h
    public final h add(boolean z2) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z2 ? 1 : 0, this.zzb);
        return this;
    }

    public final h add(byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
