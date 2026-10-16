package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzalx implements zzahh {
    public static final zzalx zza = new zzalx(true);
    public static final zzalx zzb = new zzalx(false);
    public final boolean zzc;

    private zzalx(boolean z2) {
        this.zzc = z2;
    }

    public final String toString() {
        boolean z2 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z2).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z2);
        sb2.append("}");
        return sb2.toString();
    }
}
