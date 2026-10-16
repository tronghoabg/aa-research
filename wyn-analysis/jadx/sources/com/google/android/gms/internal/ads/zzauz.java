package com.google.android.gms.internal.ads;

import Va.M6;
import java.nio.ByteBuffer;
import java.util.Date;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
public final class zzauz extends zzimi {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzims zzm;
    private long zzn;

    public zzauz() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzims.zzj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MovieHeaderBox[creationTime=");
        sb2.append(this.zzg);
        sb2.append(";modificationTime=");
        sb2.append(this.zzh);
        sb2.append(";timescale=");
        sb2.append(this.zzi);
        sb2.append(";duration=");
        sb2.append(this.zzj);
        sb2.append(";rate=");
        sb2.append(this.zzk);
        sb2.append(";volume=");
        sb2.append(this.zzl);
        sb2.append(";matrix=");
        sb2.append(this.zzm);
        sb2.append(";nextTrackId=");
        return M6.s(sb2, this.zzn, "]");
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzimn.zza(zzauv.zzd(byteBuffer));
            this.zzh = zzimn.zza(zzauv.zzd(byteBuffer));
            this.zzi = zzauv.zza(byteBuffer);
            this.zzj = zzauv.zzd(byteBuffer);
        } else {
            this.zzg = zzimn.zza(zzauv.zza(byteBuffer));
            this.zzh = zzimn.zza(zzauv.zza(byteBuffer));
            this.zzi = zzauv.zza(byteBuffer);
            this.zzj = zzauv.zza(byteBuffer);
        }
        this.zzk = zzauv.zze(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.zzl = ((short) ((r1[1] & ForkServer.ERROR) | ((short) (65280 & (r1[0] << 8))))) / 256.0f;
        zzauv.zzb(byteBuffer);
        zzauv.zza(byteBuffer);
        zzauv.zza(byteBuffer);
        this.zzm = new zzims(zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzauv.zza(byteBuffer);
    }
}
