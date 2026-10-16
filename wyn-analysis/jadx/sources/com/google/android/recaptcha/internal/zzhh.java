package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
final class zzhh extends zzhc {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzhh(Iterable iterable, int i5) {
        this.zza = iterable;
        this.zzb = i5;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i5 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzgx.zzb(i5 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i5 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzhg(this, it);
    }
}
