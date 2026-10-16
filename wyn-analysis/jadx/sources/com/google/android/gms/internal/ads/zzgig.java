package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class zzgig implements zzgie {
    ClassLoader zza;
    private final Context zzb;
    private final ExecutorService zzc;
    private final zzghl zzd;
    private final zzgid zze;
    private final zzgqo zzf;
    private final Set zzh;
    private final long zzj;
    private final File zzk;
    private boolean zzl;
    private byte[] zzm;
    private final String zzg = "1779306227211";
    private final Map zzi = new HashMap();

    public zzgig(Context context, ExecutorService executorService, zzghl zzghlVar, zzgid zzgidVar, File file, zzgqo zzgqoVar, long j8, String str, String str2, String str3, Set set) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = zzghlVar;
        this.zze = zzgidVar;
        this.zzf = zzgqoVar;
        this.zzh = set;
        this.zzk = new File(file, "rbp");
        this.zzj = j8;
    }

    private final void zze(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        if (new File(file.toString().concat("/1779306227211.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1779306227211.dex"));
        if (file2.exists()) {
            long length = file2.length();
            if (length > 0) {
                byte[] bArr = new byte[(int) length];
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        fileInputStream = new FileInputStream(file2);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (zzgic e7) {
                    e = e7;
                } catch (IOException e10) {
                    e = e10;
                }
                try {
                } catch (zzgic e11) {
                    e = e11;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (IOException e12) {
                    e = e12;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(Sdk.SDKError.Reason.MRAID_ERROR_VALUE, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    zzh(fileInputStream2);
                    zzf(file2);
                    throw th;
                }
                if (fileInputStream.read(bArr) <= 0) {
                    zzh(fileInputStream);
                    zzf(file2);
                    return;
                }
                zzayy zzayyVarZzg = zzayz.zzg();
                byte[] bytes = Build.VERSION.SDK.getBytes();
                zzidl zzidlVar = zzidl.zza;
                zzayyVarZzg.zzd(zzidl.zzt(bytes, 0, bytes.length));
                byte[] bytes2 = "1779306227211".getBytes();
                zzayyVarZzg.zzc(zzidl.zzt(bytes2, 0, bytes2.length));
                throw new zzgic();
            }
        }
    }

    private static void zzf(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    private static void zzg(String str) {
        zzf(new File(str));
    }

    private static void zzh(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x01fb A[Catch: all -> 0x0032, zzgem -> 0x0035, TryCatch #12 {all -> 0x0032, blocks: (B:5:0x000c, B:7:0x0011, B:9:0x001a, B:11:0x0029, B:21:0x003e, B:22:0x0040, B:33:0x009c, B:82:0x01d6, B:83:0x01ef, B:84:0x01f5, B:86:0x01fb, B:88:0x0211, B:89:0x0220, B:92:0x0224, B:93:0x023d, B:36:0x00d3, B:47:0x0120, B:66:0x019e, B:67:0x01a1, B:76:0x01b2, B:77:0x01b8, B:79:0x01bb, B:25:0x0078, B:32:0x0099, B:98:0x0246, B:97:0x0243, B:99:0x0247, B:100:0x024c, B:101:0x024d, B:102:0x0252, B:103:0x0253, B:104:0x0258, B:105:0x0259, B:106:0x025e), top: B:124:0x000c, outer: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzgie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zza() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgig.zza():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final synchronized boolean zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgie
    public final Method zzc(String str, String str2) {
        Future future = (Future) this.zzi.get(new Pair(str, str2));
        if (future == null) {
            this.zzf.zzb(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            return null;
        }
        try {
            return (Method) future.get(this.zzj, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            this.zzf.zzb(Sdk.SDKError.Reason.AD_EXPIRED_VALUE);
            return null;
        } catch (TimeoutException unused2) {
            this.zzf.zzb(303);
            return null;
        }
    }

    public final /* synthetic */ Method zzd(zzgii zzgiiVar) {
        ClassLoader classLoader = this.zza;
        zzgid zzgidVar = this.zze;
        byte[] bArr = this.zzm;
        String str = zzgiiVar.zza;
        String str2 = zzgiiVar.zzb;
        try {
            return classLoader.loadClass(zzgidVar.zzb(bArr, str)).getMethod(zzgidVar.zzb(bArr, str2), zzgiiVar.zzc);
        } catch (zzgic | ClassNotFoundException | NoSuchMethodException | NullPointerException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
