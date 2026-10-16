package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzciu extends zzaus {
    static final zzciu zzb = new zzciu();

    @Override // com.google.android.gms.internal.ads.zzaus
    public final zzauw zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzauy() : "mvhd".equals(str) ? new zzauz() : new zzava(str);
    }
}
