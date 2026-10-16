package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class zzgyn implements Comparator {
    public static zzgyn zzb() {
        return zzgyl.zza;
    }

    public static zzgyn zzc(Comparator comparator) {
        return new zzgwc(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgyn zza() {
        return new zzgyw(this);
    }

    public final zzgyn zzd(zzgti zzgtiVar) {
        return new zzgvo(zzgtiVar, this);
    }
}
