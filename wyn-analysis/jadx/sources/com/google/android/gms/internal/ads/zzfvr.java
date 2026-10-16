package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzfvr extends zzfvu {
    private static final zzfvr zzb = new zzfvr();

    private zzfvr() {
    }

    public static zzfvr zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final boolean zzb() {
        Iterator it = zzfvs.zza().zzf().iterator();
        while (it.hasNext()) {
            View viewZzi = ((zzfuy) it.next()).zzi();
            if (viewZzi != null && viewZzi.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfvu
    public final void zzc(boolean z2) {
        Iterator it = zzfvs.zza().zze().iterator();
        while (it.hasNext()) {
            ((zzfuy) it.next()).zzg().zzf(z2);
        }
    }
}
