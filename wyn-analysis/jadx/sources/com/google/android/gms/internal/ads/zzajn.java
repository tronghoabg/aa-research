package com.google.android.gms.internal.ads;

import Va.M6;
import j$.util.Objects;
import java.util.Arrays;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzajn extends zzajs {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;

    public zzajn(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajn.class == obj.getClass()) {
            zzajn zzajnVar = (zzajn) obj;
            if (Objects.equals(this.zza, zzajnVar.zza) && Objects.equals(this.zzb, zzajnVar.zzb) && Objects.equals(this.zzc, zzajnVar.zzc) && Arrays.equals(this.zzd, zzajnVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzd) + ((this.zzc.hashCode() + ((this.zzb.hashCode() + (((str != null ? str.hashCode() : 0) + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzb;
        int length3 = str3.length() + length + 11 + length2 + 11;
        String str4 = this.zzc;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 14);
        AbstractC3256n.p(sb2, str, ": mimeType=", str2, ", filename=");
        return M6.t(sb2, str3, ", description=", str4);
    }
}
