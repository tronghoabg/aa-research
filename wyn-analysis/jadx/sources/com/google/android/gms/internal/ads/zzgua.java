package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class zzgua implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgug zzb;

    public zzgua(zzgug zzgugVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgugVar);
        this.zzb = zzgugVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzgtl.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
