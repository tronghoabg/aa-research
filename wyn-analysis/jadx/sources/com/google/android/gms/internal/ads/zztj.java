package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
public final class zztj extends zzcq {
    private zzham zzd;
    private zzham zze;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    @Override // com.google.android.gms.internal.ads.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.nio.ByteBuffer r15) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztj.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        zzham zzhamVar = this.zzd;
        if (zzhamVar == null) {
            return zzcl.zza;
        }
        int i5 = zzclVar.zzd;
        if (!zzfm.zzE(i5)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        int iZzh = zzhamVar.zzh();
        int i10 = zzclVar.zzc;
        boolean z2 = i10 != iZzh;
        int i11 = 0;
        while (i11 < iZzh) {
            int iZzi = zzhamVar.zzi(i11);
            if (iZzi >= i10) {
                String string = zzhamVar.toString();
                throw new zzco(M6.t(new StringBuilder(string.length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzclVar);
            }
            z2 |= iZzi != i11;
            i11++;
        }
        return z2 ? new zzcl(zzclVar.zzb, iZzh, i5) : zzcl.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzo(zzcn zzcnVar) {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(zzham zzhamVar) {
        this.zzd = zzhamVar;
    }
}
