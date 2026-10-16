package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
final class zzcjs extends zzhj implements zzik {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzij zzg;
    private zzhv zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcjs(String str, zzip zzipVar, int i5, int i10, int i11) {
        super(true);
        this.zzc = new zzcjr(this);
        this.zzr = new HashSet();
        zzdh.zza(str);
        this.zzf = str;
        this.zzg = new zzij();
        this.zzd = i5;
        this.zze = i10;
        this.zzq = i11;
        if (zzipVar != null) {
            zze(zzipVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Unexpected error while disconnecting", e7);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j8 = this.zzo;
                    long j10 = this.zzm;
                    if (j8 == j10) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i11 = this.zzj.read(bArr2, 0, (int) Math.min(j10 - j8, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += i11;
                    zzh(i11);
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j11 = this.zzn;
            if (j11 != -1) {
                long j12 = j11 - this.zzp;
                if (j12 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j12);
            }
            int i12 = this.zzj.read(bArr, i5, i10);
            if (i12 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += i12;
            zzh(i12);
            return i12;
        } catch (IOException e7) {
            throw new zzig(e7, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x027b, B:98:0x0288, B:100:0x0299, B:103:0x02a2, B:104:0x02af, B:106:0x02b9, B:107:0x02c0, B:108:0x02c1, B:109:0x02de), top: B:114:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0288 A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x027b, B:98:0x0288, B:100:0x0299, B:103:0x02a2, B:104:0x02af, B:106:0x02b9, B:107:0x02c0, B:108:0x02c1, B:109:0x02de), top: B:114:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhv r24) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjs.zzb(com.google.android.gms.internal.ads.zzhv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzig {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzig(e7, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj, com.google.android.gms.internal.ads.zzhr
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i5) throws SocketException {
        this.zzq = i5;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e7) {
                    int i10 = G6.L.f4523b;
                    H6.l.g("Failed to update receive buffer size.", e7);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
