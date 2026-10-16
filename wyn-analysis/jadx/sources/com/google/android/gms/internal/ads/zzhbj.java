package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
final class zzhbj extends zzhbi {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhbl.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhbl.class, "remainingField");

    private zzhbj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final void zza(zzhbl zzhblVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zza;
        while (!atomicReferenceFieldUpdater.compareAndSet(zzhblVar, null, set2) && atomicReferenceFieldUpdater.get(zzhblVar) == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    public final int zzb(zzhbl zzhblVar) {
        return zzb.decrementAndGet(zzhblVar);
    }

    public /* synthetic */ zzhbj(byte[] bArr) {
        super(null);
    }
}
