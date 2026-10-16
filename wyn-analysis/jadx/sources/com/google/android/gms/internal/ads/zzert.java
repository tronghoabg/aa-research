package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
public final class zzert implements C6.e {
    private C6.e zza;

    @Override // C6.e
    public final synchronized void zza(View view) {
        C6.e eVar = this.zza;
        if (eVar != null) {
            eVar.zza(view);
        }
    }

    @Override // C6.e
    public final synchronized void zzb() {
        C6.e eVar = this.zza;
        if (eVar != null) {
            eVar.zzb();
        }
    }

    @Override // C6.e
    public final synchronized void zzc() {
        C6.e eVar = this.zza;
        if (eVar != null) {
            eVar.zzc();
        }
    }

    public final synchronized void zzd(C6.e eVar) {
        this.zza = eVar;
    }
}
