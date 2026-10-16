package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class zzne extends zzch {
    private final zzpf zza;

    public zzne(zzpf zzpfVar) {
        this.zza = zzpfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzpf zzpfVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzpfVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpfVar.zza().zzf()) && this.zza.zza().zze().equals(zzpfVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final String toString() {
        String strZzf = this.zza.zza().zzf();
        int i5 = zznh.zza[this.zza.zza().zzd().ordinal()];
        return v.g("(typeUrl=", strZzf, ", outputPrefixType=", i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzws.RAW;
    }

    public final zzpf zzb() {
        return this.zza;
    }
}
