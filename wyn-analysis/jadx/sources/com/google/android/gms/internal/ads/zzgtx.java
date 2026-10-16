package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgtx extends zzgue {
    final /* synthetic */ zzgtf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtx(zzgug zzgugVar, CharSequence charSequence, zzgtf zzgtfVar) {
        super(zzgugVar, charSequence);
        this.zza = zzgtfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzc(int i5) {
        CharSequence charSequence = ((zzgue) this).zzb;
        int length = charSequence.length();
        zzgtr.zzn(i5, length, "index");
        while (i5 < length) {
            if (this.zza.zzb(charSequence.charAt(i5))) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgue
    public final int zzd(int i5) {
        return i5 + 1;
    }
}
