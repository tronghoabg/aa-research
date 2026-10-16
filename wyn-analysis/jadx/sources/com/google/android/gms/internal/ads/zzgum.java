package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzgum {
    public static zzguj zza(zzguj zzgujVar) {
        return ((zzgujVar instanceof zzgul) || (zzgujVar instanceof zzguk)) ? zzgujVar : zzgujVar instanceof Serializable ? new zzguk(zzgujVar) : new zzgul(zzgujVar);
    }
}
