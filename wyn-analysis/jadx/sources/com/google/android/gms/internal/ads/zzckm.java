package com.google.android.gms.internal.ads;

import Va.M6;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzckm extends zzhj implements zzik {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzij zze;
    private zzhv zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzckm(String str, zzip zzipVar, int i5, int i10, long j8, long j10) {
        super(true);
        zzdh.zza(str);
        this.zzd = str;
        this.zze = new zzij();
        this.zzb = i5;
        this.zzc = i10;
        this.zzh = new ArrayDeque();
        this.zzq = j8;
        this.zzr = j10;
        if (zzipVar != null) {
            zze(zzipVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("Unexpected error while disconnecting", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j8 = this.zzl;
            long j10 = this.zzm;
            if (j8 - j10 == 0) {
                return -1;
            }
            long j11 = this.zzn + j10;
            long j12 = i10;
            long j13 = j11 + j12 + this.zzr;
            long j14 = this.zzp;
            long j15 = j14 + 1;
            if (j13 > j15) {
                long j16 = this.zzo;
                if (j14 < j16) {
                    long jMin = Math.min(j16, Math.max(((this.zzq + j15) - r4) - 1, (j15 + j12) - 1));
                    zzk(j15, jMin, 2);
                    this.zzp = jMin;
                    j14 = jMin;
                }
            }
            int i11 = this.zzi.read(bArr, i5, (int) Math.min(j12, ((j14 + 1) - this.zzn) - this.zzm));
            if (i11 == -1) {
                throw new EOFException();
            }
            this.zzm += i11;
            zzh(i11);
            return i11;
        } catch (IOException e7) {
            throw new zzig(e7, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException, NumberFormatException {
        this.zzf = zzhvVar;
        this.zzm = 0L;
        long j8 = zzhvVar.zze;
        long j10 = zzhvVar.zzf;
        long jMin = j10 == -1 ? this.zzq : Math.min(this.zzq, j10);
        this.zzn = j8;
        HttpURLConnection httpURLConnectionZzk = zzk(j8, (jMin + j8) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j11 = Long.parseLong(matcher.group(2));
                    long j12 = Long.parseLong(matcher.group(3));
                    long j13 = zzhvVar.zzf;
                    if (j13 != -1) {
                        this.zzl = j13;
                        this.zzo = Math.max(j11, (this.zzn + j13) - 1);
                    } else {
                        this.zzl = j12 - this.zzn;
                        this.zzo = j12 - 1;
                    }
                    this.zzp = j11;
                    this.zzj = true;
                    zzg(zzhvVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strT = M6.t(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, "]");
                    int i5 = G6.L.f4523b;
                    H6.l.c(strT);
                }
            }
        }
        throw new zzckk(headerField, zzhvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzig {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzig(e7, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhj, com.google.android.gms.internal.ads.zzhr
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j8, long j10, int i5) throws IOException {
        int i10;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e7) {
                    iOException = e7;
                    i10 = i5;
                    String strValueOf = String.valueOf(string);
                    throw new zzig("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i10);
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 7 + String.valueOf(j10).length());
            sb2.append("bytes=");
            sb2.append(j8);
            sb2.append("-");
            sb2.append(j10);
            httpURLConnection.setRequestProperty("Range", sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzckl(this.zzk, headerFields, this.zzf, i5);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzig(e10, this.zzf, 2000, i5);
                }
            } catch (IOException e11) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzig("Unable to connect to ".concat(strValueOf2), e11, this.zzf, 2000, i5);
            }
        } catch (IOException e12) {
            i10 = i5;
            iOException = e12;
        }
    }
}
