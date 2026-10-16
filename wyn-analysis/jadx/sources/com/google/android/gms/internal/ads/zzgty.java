package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* loaded from: classes3.dex */
final class zzgty extends zzgue {
    final /* synthetic */ zzgtg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgty(zzgug zzgugVar, CharSequence charSequence, zzgtg zzgtgVar) {
        super(zzgugVar, charSequence);
        this.zza = zzgtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzc(int i5) {
        Matcher matcher = ((zzgtj) this.zza).zza;
        if (matcher.find(i5)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzd(int i5) {
        return ((zzgtj) this.zza).zza.end();
    }
}
