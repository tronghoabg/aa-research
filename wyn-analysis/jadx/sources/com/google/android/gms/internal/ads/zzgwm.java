package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgwm {
    public static int zza(int i5) {
        return (int) (Integer.rotateLeft((int) (i5 * (-862048943)), 15) * 461845907);
    }

    public static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
