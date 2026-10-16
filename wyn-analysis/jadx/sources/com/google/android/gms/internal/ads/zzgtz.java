package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgtz extends zzgue {
    public zzgtz(zzgug zzgugVar, CharSequence charSequence, int i5) {
        super(zzgugVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzc(int i5) {
        int i10 = i5 + 4000;
        if (i10 < ((zzgue) this).zzb.length()) {
            return i10;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzd(int i5) {
        return i5;
    }
}
