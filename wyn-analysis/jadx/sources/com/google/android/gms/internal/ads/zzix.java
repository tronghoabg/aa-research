package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class zzix extends zzis {
    public zzv zza;
    public final zziu zzb = new zziu();
    public ByteBuffer zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzal.zzb("media3.decoder");
    }

    public zzix(int i5, int i10) {
        this.zzf = i5;
    }

    private final ByteBuffer zzm(int i5) {
        int i10 = this.zzf;
        if (i10 == 1) {
            return ByteBuffer.allocate(i5);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i5);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new zziw(byteBuffer == null ? 0 : byteBuffer.capacity(), i5);
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    public final void zzj(int i5) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i5);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i5 + iPosition;
        if (iCapacity >= i10) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZzm = zzm(i10);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzc = byteBufferZzm;
    }

    public final boolean zzk() {
        return zzi(1073741824);
    }

    public final void zzl() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
