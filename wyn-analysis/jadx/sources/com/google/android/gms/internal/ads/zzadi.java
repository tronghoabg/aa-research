package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* loaded from: classes3.dex */
public final class zzadi extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzadh zzd;
    private boolean zze;

    public /* synthetic */ zzadi(zzadh zzadhVar, SurfaceTexture surfaceTexture, boolean z2, byte[] bArr) {
        super(surfaceTexture);
        this.zzd = zzadhVar;
        this.zza = z2;
    }

    public static synchronized boolean zza(Context context) {
        if (!zzc) {
            try {
            } catch (zzdx e7) {
                zzeh.zze("PlaceholderSurface", "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e7.getMessage())));
            }
            int i5 = zzdy.zza(context) ? zzdy.zzb() ? 1 : 2 : 0;
            zzb = i5;
            zzc = true;
        }
        return zzb != 0;
    }

    public static zzadi zzb(Context context, boolean z2) {
        boolean z10 = true;
        if (z2 && !zza(context)) {
            z10 = false;
        }
        zzgtr.zzi(z10);
        return new zzadh().zza(z2 ? zzb : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzadh zzadhVar = this.zzd;
        synchronized (zzadhVar) {
            try {
                if (!this.zze) {
                    zzadhVar.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
