package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbdg extends zzbdm {
    private final zzbcg zzh;
    private long zzi;

    public zzbdg(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10, zzbcg zzbcgVar) {
        super(zzbbzVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxtVar, i5, 53);
        this.zzh = zzbcgVar;
        if (zzbcgVar != null) {
            this.zzi = zzbcgVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
