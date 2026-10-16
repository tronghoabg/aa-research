package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
public final class zzahb {
    public final zzahe zza;
    public final zzahe zzb;

    public zzahb(zzahe zzaheVar, zzahe zzaheVar2) {
        this.zza = zzaheVar;
        this.zzb = zzaheVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahb.class == obj.getClass()) {
            zzahb zzahbVar = (zzahb) obj;
            if (this.zza.equals(zzahbVar.zza) && this.zzb.equals(zzahbVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzahe zzaheVar = this.zza;
        zzahe zzaheVar2 = this.zzb;
        String string = zzaheVar.toString();
        String strConcat = zzaheVar.equals(zzaheVar2) ? "" : ", ".concat(zzaheVar2.toString());
        return AbstractC3256n.h(new StringBuilder(AbstractC0279p0.g(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
