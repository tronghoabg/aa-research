package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class zzfvs {
    private static final zzfvs zza = new zzfvs();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfvs() {
    }

    public static zzfvs zza() {
        return zza;
    }

    public final void zzb(zzfuy zzfuyVar) {
        this.zzb.add(zzfuyVar);
    }

    public final void zzc(zzfuy zzfuyVar) {
        ArrayList arrayList = this.zzc;
        boolean zZzg = zzg();
        arrayList.add(zzfuyVar);
        if (zZzg) {
            return;
        }
        zzfwa.zza().zzc();
    }

    public final void zzd(zzfuy zzfuyVar) {
        ArrayList arrayList = this.zzb;
        boolean zZzg = zzg();
        arrayList.remove(zzfuyVar);
        this.zzc.remove(zzfuyVar);
        if (!zZzg || zzg()) {
            return;
        }
        zzfwa.zza().zze();
    }

    public final Collection zze() {
        return DesugarCollections.unmodifiableCollection(this.zzb);
    }

    public final Collection zzf() {
        return DesugarCollections.unmodifiableCollection(this.zzc);
    }

    public final boolean zzg() {
        return this.zzc.size() > 0;
    }
}
