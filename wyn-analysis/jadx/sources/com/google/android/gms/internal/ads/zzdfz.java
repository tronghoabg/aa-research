package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
final class zzdfz implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzdga zzdgaVar = (zzdga) this.zza.get();
        if (zzdgaVar != null) {
            zzdgaVar.zzs(zzdfw.zza);
        }
    }
}
