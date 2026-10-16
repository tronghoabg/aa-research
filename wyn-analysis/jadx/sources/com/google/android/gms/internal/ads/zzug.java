package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zzug extends zzcq {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzfm.zzb;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final long zza(long j8) {
        return Math.max(0L, j8 - zzfm.zzu(this.zze + this.zzd, this.zzb.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i5 = iLimit - iPosition;
        if (i5 == 0) {
            return;
        }
        int iMin = Math.min(i5, this.zzg);
        this.zzj += iMin / this.zzb.zze;
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i10 = i5 - iMin;
            int length = (this.zzi + i10) - this.zzh.length;
            ByteBuffer byteBufferZzk = zzk(length);
            int i11 = this.zzi;
            String str = zzfm.zza;
            int iMax = Math.max(0, Math.min(length, i11));
            byteBufferZzk.put(this.zzh, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i10));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzk.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i12 = i10 - iMax2;
            int i13 = this.zzi - iMax;
            this.zzi = i13;
            byte[] bArr = this.zzh;
            System.arraycopy(bArr, iMax, bArr, 0, i13);
            byteBuffer.get(this.zzh, this.zzi, i12);
            this.zzi += i12;
            byteBufferZzk.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final ByteBuffer zzf() {
        int i5;
        if (super.zzg() && (i5 = this.zzi) > 0) {
            zzk(i5).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcq, com.google.android.gms.internal.ads.zzcp
    public final boolean zzg() {
        return super.zzg() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        if (!zzfm.zzE(zzclVar.zzd)) {
            throw new zzco("Unhandled input format:", zzclVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? zzcl.zza : zzclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzn() {
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += r0 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzo(zzcn zzcnVar) {
        if (this.zzf) {
            this.zzf = false;
            int i5 = this.zze;
            int i10 = this.zzb.zze;
            this.zzh = new byte[i5 * i10];
            this.zzg = this.zzd * i10;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        this.zzh = zzfm.zzb;
    }

    public final void zzq(int i5, int i10) {
        this.zzd = i5;
        this.zze = i10;
    }

    public final void zzr() {
        this.zzj = 0L;
    }

    public final long zzs() {
        return this.zzj;
    }
}
