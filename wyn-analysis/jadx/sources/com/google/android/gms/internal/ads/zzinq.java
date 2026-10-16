package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzinq extends u.m {
    private final WeakReference zza;

    public zzinq(zzbjy zzbjyVar) {
        this.zza = new WeakReference(zzbjyVar);
    }

    @Override // u.m
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
        zzbjy zzbjyVar = (zzbjy) this.zza.get();
        if (zzbjyVar != null) {
            zzbjyVar.zzf(gVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbjy zzbjyVar = (zzbjy) this.zza.get();
        if (zzbjyVar != null) {
            zzbjyVar.zzg();
        }
    }
}
