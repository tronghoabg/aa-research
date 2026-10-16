package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public class zzgxg<K, V> extends zzgxb<K, V> implements zzgyb<K, V> {
    private final transient zzgxd<V> emptySet;
    private transient zzgxd zza;

    public zzgxg(zzgww zzgwwVar, int i5, Comparator comparator) {
        super(zzgwwVar, i5);
        this.emptySet = zzgyu.zza;
    }

    public final zzgxd zza() {
        zzgxd zzgxdVar = this.zza;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxf zzgxfVar = new zzgxf(this);
        this.zza = zzgxfVar;
        return zzgxfVar;
    }
}
