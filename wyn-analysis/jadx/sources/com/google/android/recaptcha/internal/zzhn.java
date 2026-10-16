package com.google.android.recaptcha.internal;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
public abstract class zzhn {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhn) {
            zzhn zzhnVar = (zzhn) obj;
            if (zzb() == zzhnVar.zzb() && zzc(zzhnVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i5 = bArrZze[0] & ForkServer.ERROR;
        for (int i10 = 1; i10 < bArrZze.length; i10++) {
            i5 |= (bArrZze[i10] & ForkServer.ERROR) << (i10 * 8);
        }
        return i5;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b5 : bArrZze) {
            char[] cArr = zza;
            sb2.append(cArr[(b5 >> 4) & 15]);
            sb2.append(cArr[b5 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzhn zzhnVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
