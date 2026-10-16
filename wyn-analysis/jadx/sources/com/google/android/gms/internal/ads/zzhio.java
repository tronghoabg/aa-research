package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzhio extends zzhfh {
    private final zzhin zza;
    private final int zzb;

    private zzhio(zzhin zzhinVar, int i5) {
        this.zza = zzhinVar;
        this.zzb = i5;
    }

    public static zzhio zzb(zzhin zzhinVar, int i5) throws GeneralSecurityException {
        if (i5 < 8 || i5 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzhio(zzhinVar, i5);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhio)) {
            return false;
        }
        zzhio zzhioVar = (zzhio) obj;
        return zzhioVar.zza == this.zza && zzhioVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhio.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        int i5 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 48 + String.valueOf(i5).length() + 1);
        sb2.append("X-AES-GCM Parameters (variant: ");
        sb2.append(string);
        sb2.append("salt_size_bytes: ");
        sb2.append(i5);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zza != zzhin.zzb;
    }

    public final zzhin zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }
}
