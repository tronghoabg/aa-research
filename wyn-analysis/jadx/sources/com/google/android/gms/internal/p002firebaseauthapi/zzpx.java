package com.google.android.gms.internal.p002firebaseauthapi;

import A7.AbstractC0279p0;
import cb.AbstractC1593a;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class zzpx extends zzqn {
    private final int zza;
    private final int zzb;
    private final zzb zzc;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private zzb zzc;

        public final zza zza(int i5) throws GeneralSecurityException {
            if (i5 != 16 && i5 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i5 << 3)));
            }
            this.zza = Integer.valueOf(i5);
            return this;
        }

        public final zza zzb(int i5) throws GeneralSecurityException {
            if (i5 < 10 || 16 < i5) {
                throw new GeneralSecurityException(AbstractC3256n.g(i5, "Invalid tag size for AesCmacParameters: "));
            }
            this.zzb = Integer.valueOf(i5);
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = zzb.zzd;
        }

        public final zza zza(zzb zzbVar) {
            this.zzc = zzbVar;
            return this;
        }

        public final zzpx zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        return new zzpx(num.intValue(), this.zzb.intValue(), this.zzc);
                    }
                    throw new GeneralSecurityException("variant not set");
                }
                throw new GeneralSecurityException("tag size not set");
            }
            throw new GeneralSecurityException("key size not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        private zzb(String str) {
            this.zze = str;
        }

        public final String toString() {
            return this.zze;
        }
    }

    public static zza zzd() {
        return new zza();
    }

    private final int zzf() {
        zzb zzbVar = this.zzc;
        if (zzbVar == zzb.zzd) {
            return this.zzb;
        }
        if (zzbVar != zzb.zza && zzbVar != zzb.zzb && zzbVar != zzb.zzc) {
            throw new IllegalStateException("Unknown variant");
        }
        int i5 = this.zzb;
        return i5 + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpx)) {
            return false;
        }
        zzpx zzpxVar = (zzpx) obj;
        return zzpxVar.zza == this.zza && zzpxVar.zzf() == zzf() && zzpxVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzpx.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        return AbstractC0279p0.j(this.zza, "-byte key)", AbstractC1593a.k(this.zzb, "AES-CMAC Parameters (variant: ", strValueOf, ", ", "-byte tags, and "));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzc != zzb.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzb zze() {
        return this.zzc;
    }

    private zzpx(int i5, int i10, zzb zzbVar) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = zzbVar;
    }
}
