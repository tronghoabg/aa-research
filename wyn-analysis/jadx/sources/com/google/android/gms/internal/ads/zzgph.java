package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes3.dex */
final class zzgph implements zzgpe {
    private final zzgqo zza;
    private final long zzb;

    public zzgph(zzgcy zzgcyVar, zzgqo zzgqoVar, long j8) {
        this.zza = zzgqoVar;
        this.zzb = j8;
    }

    private static boolean zzc(zzggb zzggbVar) {
        int iZza = zzggbVar.zzb().zza().zza();
        int iZzb = zzggbVar.zzb().zza().zzb();
        byte[] versionArray = zzavh.zza();
        AbstractC3340k.e(versionArray, "versionArray");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        AbstractC3340k.d(byteBufferAllocate, "allocate(...)");
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort((short) iZza);
        byteBufferAllocate.putInt(iZzb);
        byte[] bArrArray = byteBufferAllocate.array();
        AbstractC3340k.d(bArrArray, "array(...)");
        return Arrays.equals(bArrArray, versionArray);
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zza(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zza.zzb(20202);
            return true;
        }
        if (!zzc(zzggbVar)) {
            this.zza.zzb(20205);
            return true;
        }
        boolean z2 = zzggbVar.zzb().zzc() - System.currentTimeMillis() <= this.zzb;
        if (z2) {
            this.zza.zzb(20203);
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgpe
    public final boolean zzb(zzggb zzggbVar) {
        if (zzggbVar == null || zzggbVar.equals(zzggb.zzh())) {
            this.zza.zzb(20204);
            return false;
        }
        if (zzc(zzggbVar)) {
            return true;
        }
        this.zza.zzb(20206);
        return false;
    }
}
