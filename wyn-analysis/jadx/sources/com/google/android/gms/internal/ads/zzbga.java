package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzbga implements Comparator {
    public zzbga(zzbgc zzbgcVar) {
        Objects.requireNonNull(zzbgcVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgf zzbgfVar = (zzbgf) obj;
        zzbgf zzbgfVar2 = (zzbgf) obj2;
        int i5 = zzbgfVar.zzc - zzbgfVar2.zzc;
        return i5 != 0 ? i5 : Long.compare(zzbgfVar.zza, zzbgfVar2.zza);
    }
}
