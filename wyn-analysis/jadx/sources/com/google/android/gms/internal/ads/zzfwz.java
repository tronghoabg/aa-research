package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzfwz implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfxc.zzc != null) {
            zzfxc.zzc.post(zzfxc.zzk);
            zzfxc.zzc.postDelayed(zzfxc.zzl, 200L);
        }
    }
}
