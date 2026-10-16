package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
public enum zzur implements zzaka {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private final int zzi;

    zzur(int i5) {
        this.zzi = i5;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(zzur.class.getName());
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
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzur zza(int i5) {
        if (i5 == 0) {
            return UNKNOWN_HASH;
        }
        if (i5 == 1) {
            return SHA1;
        }
        if (i5 == 2) {
            return SHA384;
        }
        if (i5 == 3) {
            return SHA256;
        }
        if (i5 == 4) {
            return SHA512;
        }
        if (i5 != 5) {
            return null;
        }
        return SHA224;
    }
}
