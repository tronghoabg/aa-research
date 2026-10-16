package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzacp {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);
    private zzgv zzb;

    private final void zzd(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (((zzgu) list.get(i5)).zza == 1) {
                this.zzb = zzgv.zza((zzgu) list.get(i5));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z2) {
        zzgv zzgvVar;
        zzgs zzgsVarZzb;
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgw.zza(byteBuffer2));
            zze();
        }
        List listZza = zzgw.zza(byteBuffer);
        zzd(listZza);
        int size = listZza.size() - 1;
        int i5 = 0;
        while (size >= 0) {
            zzgu zzguVar = (zzgu) listZza.get(size);
            int i10 = zzguVar.zza;
            if (i10 != 2 && i10 != 15) {
                if (i10 == 3) {
                    if (!z2) {
                        break;
                    }
                    i10 = 3;
                }
                if ((i10 != 6 && i10 != 3) || (zzgvVar = this.zzb) == null || (zzgsVarZzb = zzgs.zzb(zzgvVar, zzguVar)) == null || zzgsVarZzb.zza()) {
                    break;
                }
            }
            if (((zzgu) listZza.get(size)).zza == 6 || ((zzgu) listZza.get(size)).zza == 3) {
                i5++;
            }
            size--;
        }
        return (i5 > 1 || size + 1 >= 8) ? byteBuffer.limit() : size >= 0 ? ((zzgu) listZza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
