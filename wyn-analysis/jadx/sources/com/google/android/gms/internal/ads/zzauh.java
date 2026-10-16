package com.google.android.gms.internal.ads;

import Va.M6;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class zzauh implements zzasv {
    private final zzaug zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzauh(zzaug zzaugVar, int i5) {
        this.zzc = zzaugVar;
    }

    public static byte[] zzg(zzauf zzaufVar, long j8) throws IOException {
        long jZza = zzaufVar.zza();
        if (j8 >= 0 && j8 <= jZza) {
            int i5 = (int) j8;
            if (i5 == j8) {
                byte[] bArr = new byte[i5];
                new DataInputStream(zzaufVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 33 + String.valueOf(jZza).length());
        M6.A(sb2, "streamToBytes length=", j8, ", maxLength=");
        sb2.append(jZza);
        throw new IOException(sb2.toString());
    }

    public static void zzh(OutputStream outputStream, int i5) throws IOException {
        outputStream.write(i5 & 255);
        outputStream.write((i5 >> 8) & 255);
        outputStream.write((i5 >> 16) & 255);
        outputStream.write((i5 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j8) throws IOException {
        outputStream.write((byte) j8);
        outputStream.write((byte) (j8 >>> 8));
        outputStream.write((byte) (j8 >>> 16));
        outputStream.write((byte) (j8 >>> 24));
        outputStream.write((byte) (j8 >>> 32));
        outputStream.write((byte) (j8 >>> 40));
        outputStream.write((byte) (j8 >>> 48));
        outputStream.write((byte) (j8 >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzauf zzaufVar) throws IOException {
        return new String(zzg(zzaufVar, zzk(zzaufVar)), "UTF-8");
    }

    private final void zzn(String str, zzaue zzaueVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaueVar.zza - ((zzaue) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaueVar.zza;
        }
        map.put(str, zzaueVar);
    }

    private final void zzo(String str) {
        zzaue zzaueVar = (zzaue) this.zza.remove(str);
        if (zzaueVar != null) {
            this.zzb -= zzaueVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i5 = inputStream.read();
        if (i5 != -1) {
            return i5;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized zzasu zza(String str) {
        zzaue zzaueVar = (zzaue) this.zza.get(str);
        if (zzaueVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzaue.zza(zzaufVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzatx.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzaufVar, zzaufVar.zza());
                zzasu zzasuVar = new zzasu();
                zzasuVar.zza = bArrZzg;
                zzasuVar.zzb = zzaueVar.zzc;
                zzasuVar.zzc = zzaueVar.zzd;
                zzasuVar.zzd = zzaueVar.zze;
                zzasuVar.zze = zzaueVar.zzf;
                zzasuVar.zzf = zzaueVar.zzg;
                List<zzatd> list = zzaueVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzatd zzatdVar : list) {
                    treeMap.put(zzatdVar.zza(), zzatdVar.zzb());
                }
                zzasuVar.zzg = treeMap;
                zzasuVar.zzh = DesugarCollections.unmodifiableList(list);
                return zzasuVar;
            } finally {
                zzaufVar.close();
            }
        } catch (IOException e7) {
            zzatx.zzb("%s: %s", fileZzf.getAbsolutePath(), e7.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzb(String str, zzasu zzasuVar) {
        long j8;
        float f10;
        try {
            long j10 = this.zzb;
            int length = zzasuVar.zza.length;
            long j11 = j10 + length;
            int i5 = this.zzd;
            float f11 = 0.9f;
            if (j11 <= i5 || length <= i5 * 0.9f) {
                File fileZzf = zzf(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzaue zzaueVar = new zzaue(str, zzasuVar);
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaueVar.zzb);
                        String str2 = zzaueVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzaueVar.zzd);
                        zzj(bufferedOutputStream, zzaueVar.zze);
                        zzj(bufferedOutputStream, zzaueVar.zzf);
                        zzj(bufferedOutputStream, zzaueVar.zzg);
                        List<zzatd> list = zzaueVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzatd zzatdVar : list) {
                                zzl(bufferedOutputStream, zzatdVar.zza());
                                zzl(bufferedOutputStream, zzatdVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzasuVar.zza);
                        bufferedOutputStream.close();
                        zzaueVar.zza = fileZzf.length();
                        zzn(str, zzaueVar);
                        long j12 = this.zzb;
                        int i10 = this.zzd;
                        if (j12 >= i10) {
                            boolean z2 = zzatx.zzb;
                            if (z2) {
                                zzatx.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i11 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j8 = j13;
                                    break;
                                }
                                zzaue zzaueVar2 = (zzaue) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaueVar2.zzb;
                                if (zzf(str3).delete()) {
                                    f10 = f11;
                                    j8 = j13;
                                    this.zzb -= zzaueVar2.zza;
                                } else {
                                    f10 = f11;
                                    j8 = j13;
                                    zzatx.zzb("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.zzb < i10 * f10) {
                                    break;
                                }
                                j13 = j8;
                                f11 = f10;
                            }
                            if (z2) {
                                zzatx.zza("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j8), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e7) {
                        zzatx.zzb("%s", e7.toString());
                        bufferedOutputStream.close();
                        zzatx.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzf.delete()) {
                        zzatx.zzb("Could not clean up file %s", fileZzf.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzatx.zzb("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzc() {
        synchronized (this) {
            File fileZza = this.zzc.zza();
            if (fileZza.exists()) {
                File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            long length = file.length();
                            zzauf zzaufVar = new zzauf(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                zzaue zzaueVarZza = zzaue.zza(zzaufVar);
                                zzaueVarZza.zza = length;
                                zzn(zzaueVarZza.zzb, zzaueVarZza);
                                zzaufVar.close();
                            } catch (Throwable th) {
                                zzaufVar.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                zzatx.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasv
    public final synchronized void zzd(String str, boolean z2) {
        zzasu zzasuVarZza = zza(str);
        if (zzasuVarZza != null) {
            zzasuVarZza.zzf = 0L;
            zzasuVarZza.zze = 0L;
            zzb(str, zzasuVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzatx.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzauh(File file, int i5) {
        this.zzc = new zzaud(this, file);
    }
}
