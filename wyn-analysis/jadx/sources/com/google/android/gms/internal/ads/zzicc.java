package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzicc extends AbstractSet {
    final /* synthetic */ zzich zza;

    public zzicc(zzich zzichVar) {
        Objects.requireNonNull(zzichVar);
        this.zza = zzichVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzc((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzicb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzich zzichVar;
        zzicg zzicgVarZzc;
        if (!(obj instanceof Map.Entry) || (zzicgVarZzc = (zzichVar = this.zza).zzc((Map.Entry) obj)) == null) {
            return false;
        }
        zzichVar.zzd(zzicgVarZzc, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
