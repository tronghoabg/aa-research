package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Locale;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
final class zzftu {
    private final String zza;
    private final EnumC4471b zzb;
    private final String zzc;

    public /* synthetic */ zzftu(zzftt zzfttVar, byte[] bArr) {
        this.zza = zzfttVar.zzb();
        this.zzb = zzfttVar.zzc();
        this.zzc = zzfttVar.zzd();
    }

    public final boolean equals(Object obj) {
        EnumC4471b enumC4471b;
        EnumC4471b enumC4471b2;
        if (obj instanceof zzftu) {
            zzftu zzftuVar = (zzftu) obj;
            if (this.zza.equals(zzftuVar.zza) && (enumC4471b = this.zzb) != null && (enumC4471b2 = zzftuVar.zzb) != null && enumC4471b.equals(enumC4471b2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        EnumC4471b enumC4471b = this.zzb;
        return enumC4471b == null ? "unknown" : enumC4471b.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
