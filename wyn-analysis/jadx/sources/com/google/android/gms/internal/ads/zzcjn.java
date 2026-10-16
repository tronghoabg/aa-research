package com.google.android.gms.internal.ads;

import D6.C0395s;
import Va.M6;
import android.net.Uri;
import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzcjn extends zzcjh implements zzip {
    private static final AtomicInteger zzo = new AtomicInteger(0);
    private String zzd;
    private final zzcht zze;
    private boolean zzf;
    private final zzcjm zzg;
    private final zzciq zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcjn(zzchu zzchuVar, zzcht zzchtVar) {
        super(zzchuVar);
        this.zze = zzchtVar;
        this.zzg = new zzcjm();
        this.zzh = new zzciq();
        this.zzk = new Object();
        this.zzl = (String) zzgtp.zzd(zzchuVar != null ? zzchuVar.zzn() : null).zza("");
        this.zzm = zzchuVar != null ? zzchuVar.zzp() : 0;
        zzo.incrementAndGet();
    }

    public static int zzr() {
        return zzo.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(H6.f.d(str, "MD5")));
    }

    private final void zzx() {
        int iZza = (int) this.zzg.zza();
        int iZza2 = (int) this.zzh.zza(this.zzi);
        int iPosition = this.zzi.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzP = zzchl.zzP();
        int iZzQ = zzchl.zzQ();
        String str = this.zzd;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzP, iZzQ);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void release() {
        zzo.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zza(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzb(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
        if (zzhrVar instanceof zzic) {
            this.zzg.zzb((zzic) zzhrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzc(zzhr zzhrVar, zzhv zzhvVar, boolean z2, int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzip
    public final void zzd(zzhr zzhrVar, zzhv zzhvVar, boolean z2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zze(String str) throws IOException {
        String str2;
        String str3;
        long j8;
        this.zzd = str;
        String str4 = "error";
        String strZzv = zzv(str);
        try {
            zzhy zzhyVar = new zzhy();
            zzhyVar.zzb(this.zzb);
            zzcht zzchtVar = this.zze;
            zzhyVar.zzc(zzchtVar.zzd);
            zzhyVar.zzd(zzchtVar.zze);
            zzhyVar.zze(true);
            zzhyVar.zzf(this);
            zzhr zzhrVarZza = zzhyVar.zza();
            if (zzchtVar.zzi) {
                zzhrVarZza = new zzcio(this.zza, zzhrVarZza, this.zzl, this.zzm, null, null);
            }
            zzhrVarZza.zzb(new zzhv(Uri.parse(str), 0L, -1L, null));
            zzchu zzchuVar = (zzchu) this.zzc.get();
            if (zzchuVar != null) {
                zzchuVar.zzt(strZzv, this);
            }
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbio zzbioVar = zzbix.zzar;
            C0395s c0395s = C0395s.f2489e;
            long jLongValue = ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue();
            long jLongValue2 = ((Long) c0395s.f2492c.zzd(zzbix.zzaq)).longValue();
            this.zzi = ByteBuffer.allocate(zzchtVar.zzc);
            int i5 = Segment.SIZE;
            byte[] bArr = new byte[Segment.SIZE];
            long j10 = jCurrentTimeMillis;
            while (true) {
                int iZza = zzhrVarZza.zza(bArr, 0, Math.min(this.zzi.remaining(), i5));
                if (iZza == -1) {
                    this.zzn = true;
                    zzp(str, strZzv, (int) this.zzh.zza(this.zzi));
                    return true;
                }
                synchronized (this.zzk) {
                    str2 = str4;
                    try {
                        if (this.zzf) {
                            j8 = jCurrentTimeMillis;
                        } else {
                            j8 = jCurrentTimeMillis;
                            this.zzi.put(bArr, 0, iZza);
                        }
                    } finally {
                    }
                }
                if (this.zzi.remaining() <= 0) {
                    zzx();
                    return true;
                }
                try {
                    str3 = this.zzf;
                } catch (Exception e7) {
                    e = e7;
                    str3 = str2;
                    String canonicalName = e.getClass().getCanonicalName();
                    String message = e.getMessage();
                    String strT = M6.t(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, message);
                    String strH = AbstractC3256n.h(new StringBuilder(strT.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", strT);
                    int i10 = G6.L.f4523b;
                    H6.l.f(strH);
                    zzq(str, strZzv, str3, strT);
                    return false;
                }
                try {
                    if (str3 != 0) {
                        int iLimit = this.zzi.limit();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iLimit).length() + 24);
                        sb2.append("Precache abort at ");
                        sb2.append(iLimit);
                        sb2.append(" bytes");
                        throw new IOException(sb2.toString());
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 - j10 >= jLongValue) {
                        zzx();
                        j10 = jCurrentTimeMillis2;
                    }
                    if (jCurrentTimeMillis2 - j8 > 1000 * jLongValue2) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(jLongValue2).length() + 29);
                        sb3.append("Timeout exceeded. Limit: ");
                        sb3.append(jLongValue2);
                        sb3.append(" sec");
                        throw new IOException(sb3.toString());
                    }
                    str4 = str2;
                    jCurrentTimeMillis = j8;
                    i5 = Segment.SIZE;
                } catch (Exception e10) {
                    e = e10;
                    String canonicalName2 = e.getClass().getCanonicalName();
                    String message2 = e.getMessage();
                    String strT2 = M6.t(new StringBuilder(String.valueOf(canonicalName2).length() + 1 + String.valueOf(message2).length()), canonicalName2, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, message2);
                    String strH2 = AbstractC3256n.h(new StringBuilder(strT2.length() + String.valueOf(str).length() + 34), "Failed to preload url ", str, " Exception: ", strT2);
                    int i102 = G6.L.f4523b;
                    H6.l.f(strH2);
                    zzq(str, strZzv, str3, strT2);
                    return false;
                }
            }
        } catch (Exception e11) {
            e = e11;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzl() {
        this.zzf = true;
    }

    public final String zzs() {
        return this.zzd;
    }

    public final boolean zzt() {
        return this.zzn;
    }

    public final ByteBuffer zzu() {
        synchronized (this.zzk) {
            try {
                ByteBuffer byteBuffer = this.zzi;
                if (byteBuffer != null && !this.zzj) {
                    byteBuffer.flip();
                    this.zzj = true;
                }
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzi;
    }
}
