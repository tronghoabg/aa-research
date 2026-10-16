package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzmn extends zzmu {
    public zzmn(int i5) {
        super(i5, null);
    }

    @Override // com.google.android.recaptcha.internal.zzmu
    public final void zza() {
        if (!zzj()) {
            for (int i5 = 0; i5 < zzb(); i5++) {
                ((zzkh) zzg(i5).getKey()).zzg();
            }
            Iterator it = zzc().iterator();
            while (it.hasNext()) {
                ((zzkh) ((Map.Entry) it.next()).getKey()).zzg();
            }
        }
        super.zza();
    }
}
