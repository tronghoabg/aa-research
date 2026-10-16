package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzvf implements zzaka {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    zzvf(int i5) {
        this.zzh = i5;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzvf.class.getName());
        sb2.append('@');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb2.append(" number=");
            sb2.append(zza());
        }
        sb2.append(" name=");
        sb2.append(name());
        sb2.append('>');
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvf zza(int i5) {
        if (i5 == 0) {
            return KEM_UNKNOWN;
        }
        if (i5 == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i5 == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i5 == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i5 != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }
}
