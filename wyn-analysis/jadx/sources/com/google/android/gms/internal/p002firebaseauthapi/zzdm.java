package com.google.android.gms.internal.p002firebaseauthapi;

import cb.AbstractC1593a;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzdm extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zza zzd;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zza zzd;

        public final zzb zza(int i5) throws GeneralSecurityException {
            if (i5 != 12 && i5 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i5)));
            }
            this.zzb = Integer.valueOf(i5);
            return this;
        }

        public final zzb zzb(int i5) throws GeneralSecurityException {
            if (i5 != 16 && i5 != 24 && i5 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
            }
            this.zza = Integer.valueOf(i5);
            return this;
        }

        public final zzb zzc(int i5) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zza.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzd = zzaVar;
            return this;
        }

        public final zzdm zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    if (this.zzd != null) {
                        if (this.zzc != null) {
                            return new zzdm(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("Variant is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static zzb zze() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        return zzdmVar.zza == this.zza && zzdmVar.zzb == this.zzb && zzdmVar.zzc == this.zzc && zzdmVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i5 = this.zzb;
        int i10 = this.zzc;
        int i11 = this.zza;
        StringBuilder sbK = AbstractC1593a.k(i5, "AesEax Parameters (variant: ", strValueOf, ", ", "-byte IV, ");
        sbK.append(i10);
        sbK.append("-byte tag, and ");
        sbK.append(i11);
        sbK.append("-byte key)");
        return sbK.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzd != zza.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zza zzf() {
        return this.zzd;
    }

    private zzdm(int i5, int i10, int i11, zza zzaVar) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = zzaVar;
    }
}
