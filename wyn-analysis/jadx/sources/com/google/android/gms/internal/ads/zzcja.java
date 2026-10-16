package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcja implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzchu zzchuVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzciz zzcizVar = (zzciz) it.next();
            if (zzcizVar.zza == zzchuVar) {
                arrayList.add(zzcizVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzciz) it2.next()).zzb.zzl();
        }
        return true;
    }

    public final zzciz zzb(zzchu zzchuVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzciz zzcizVar = (zzciz) it.next();
            if (zzcizVar.zza == zzchuVar) {
                return zzcizVar;
            }
        }
        return null;
    }

    public final void zzc(zzciz zzcizVar) {
        this.zza.add(zzcizVar);
    }

    public final void zzd(zzciz zzcizVar) {
        this.zza.remove(zzcizVar);
    }
}
