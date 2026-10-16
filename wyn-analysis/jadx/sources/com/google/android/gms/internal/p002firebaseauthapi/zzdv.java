package com.google.android.gms.internal.p002firebaseauthapi;

import cb.AbstractC1593a;
import j$.util.Objects;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzdv extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zzb zzd;

        public final zza zza(int i5) throws GeneralSecurityException {
            this.zzb = 12;
            return this;
        }

        public final zza zzb(int i5) throws GeneralSecurityException {
            if (i5 != 16 && i5 != 24 && i5 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i5)));
            }
            this.zza = Integer.valueOf(i5);
            return this;
        }

        public final zza zzc(int i5) throws GeneralSecurityException {
            this.zzc = 16;
            return this;
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }

        public final zza zza(zzb zzbVar) {
            this.zzd = zzbVar;
            return this;
        }

        public final zzdv zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzd != null) {
                    if (this.zzb != null) {
                        if (this.zzc != null) {
                            return new zzdv(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
                        }
                        throw new GeneralSecurityException("Tag size is not set");
                    }
                    throw new GeneralSecurityException("IV size is not set");
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static zza zze() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdv)) {
            return false;
        }
        zzdv zzdvVar = (zzdv) obj;
        return zzdvVar.zza == this.zza && zzdvVar.zzb == this.zzb && zzdvVar.zzc == this.zzc && zzdvVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int i5 = this.zzb;
        int i10 = this.zzc;
        int i11 = this.zza;
        StringBuilder sbK = AbstractC1593a.k(i5, "AesGcm Parameters (variant: ", strValueOf, ", ", "-byte IV, ");
        sbK.append(i10);
        sbK.append("-byte tag, and ");
        sbK.append(i11);
        sbK.append("-byte key)");
        return sbK.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzd != zzb.zzc;
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

    public final zzb zzf() {
        return this.zzd;
    }

    private zzdv(int i5, int i10, int i11, zzb zzbVar) {
        this.zza = i5;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = zzbVar;
    }
}
