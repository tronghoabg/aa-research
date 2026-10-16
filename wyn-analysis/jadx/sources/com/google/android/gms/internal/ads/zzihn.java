package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzihn extends zzihm {
    @Override // com.google.android.gms.internal.ads.zzihm
    public final boolean zza(byte[] bArr, int i5, int i10) {
        while (i5 < i10 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 >= i10) {
            return true;
        }
        while (i5 < i10) {
            int i11 = i5 + 1;
            byte b5 = bArr[i5];
            if (b5 >= 0) {
                i5 = i11;
            } else {
                if (b5 < -32) {
                    if (i11 < i10 && b5 >= -62) {
                        i5 += 2;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return false;
                }
                if (b5 >= -16) {
                    if (i11 >= i10 - 2) {
                        return false;
                    }
                    int i12 = i5 + 2;
                    byte b10 = bArr[i11];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b5 << 28)) >> 30) == 0) {
                            int i13 = i5 + 3;
                            if (bArr[i12] <= -65) {
                                i5 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i11 >= i10 - 1) {
                    return false;
                }
                int i14 = i5 + 2;
                byte b11 = bArr[i11];
                if (b11 > -65 || (b5 == -32 && b11 < -96)) {
                    return false;
                }
                if (b5 == -19 && b11 >= -96) {
                    return false;
                }
                i5 += 3;
                if (bArr[i14] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
