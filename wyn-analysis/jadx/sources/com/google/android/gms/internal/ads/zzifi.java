package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzifi extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzifi(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zza()) {
            return;
        }
        this.zzb = zzifc.zzb;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final boolean zza() {
        ByteBuffer byteBuffer;
        do {
            this.zzd++;
            if (!this.zza.hasNext()) {
                return false;
            }
            byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
        } while (!byteBuffer.hasRemaining());
        this.zze = this.zzb.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = zzihk.zzq(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    private final void zzb(int i5) {
        int i10 = this.zze + i5;
        this.zze = i10;
        if (i10 == this.zzb.limit()) {
            zza();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i5 = this.zzg[this.zze + this.zzh] & ForkServer.ERROR;
            zzb(1);
            return i5;
        }
        int iZzp = zzihk.zzp(this.zze + this.zzi) & ForkServer.ERROR;
        zzb(1);
        return iZzp;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i10) throws IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int iLimit = this.zzb.limit();
        int i11 = this.zze;
        int i12 = iLimit - i11;
        if (i10 > i12) {
            i10 = i12;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i11 + this.zzh, bArr, i5, i10);
            zzb(i10);
            return i10;
        }
        int iPosition = this.zzb.position();
        this.zzb.position(this.zze);
        this.zzb.get(bArr, i5, i10);
        this.zzb.position(iPosition);
        zzb(i10);
        return i10;
    }
}
