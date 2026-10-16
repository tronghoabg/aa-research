package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzciq {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzauz zzauzVar;
        zzauy zzauyVar;
        long j8 = this.zza;
        if (j8 > 0) {
            return j8;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzauu(new zzcip(byteBufferDuplicate), zzciu.zzb).zzc().iterator();
            while (true) {
                zzauzVar = null;
                if (!it.hasNext()) {
                    zzauyVar = null;
                    break;
                }
                zzauw zzauwVar = (zzauw) it.next();
                if (zzauwVar instanceof zzauy) {
                    zzauyVar = (zzauy) zzauwVar;
                    break;
                }
            }
            Iterator it2 = zzauyVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzauw zzauwVar2 = (zzauw) it2.next();
                if (zzauwVar2 instanceof zzauz) {
                    zzauzVar = (zzauz) zzauwVar2;
                    break;
                }
            }
            long jZzd = (zzauzVar.zzd() * 1000) / zzauzVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
