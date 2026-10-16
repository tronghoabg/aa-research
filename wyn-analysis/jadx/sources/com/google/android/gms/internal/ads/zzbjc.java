package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes3.dex */
public final class zzbjc {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void zzg(Map map, zzbjl zzbjlVar) throws Throwable {
        FileOutputStream fileOutputStream;
        Uri.Builder builderBuildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zzbjlVar != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(zzbjlVar.zza())) {
                sb2.append("&it=");
                sb2.append(zzbjlVar.zza());
            }
            if (!TextUtils.isEmpty(zzbjlVar.zzb())) {
                sb2.append("&blat=");
                sb2.append(zzbjlVar.zzb());
            }
            string = sb2.toString();
        }
        FileOutputStream fileOutputStream2 = null;
        if (!this.zzh.get()) {
            U u10 = C6.n.f1857D.f1863c;
            new G6.B(this.zze, this.zzf, string, null).zzb();
            return;
        }
        File file = this.zzi;
        try {
            if (file == null) {
                int i5 = G6.L.f4523b;
                H6.l.f("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
                return;
            }
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e7) {
                e = e7;
            }
            try {
                fileOutputStream.write(string.getBytes());
                fileOutputStream.write(10);
                try {
                    fileOutputStream.close();
                } catch (IOException e10) {
                    int i10 = G6.L.f4523b;
                    H6.l.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream2 = fileOutputStream;
                int i11 = G6.L.f4523b;
                H6.l.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        H6.l.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                    }
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e13) {
                        int i12 = G6.L.f4523b;
                        H6.l.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void zza(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbks.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(zzfzu.zza().zza(externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.zza.zzf();
            }
        });
        Map map2 = this.zzc;
        zzbji zzbjiVar = zzbji.zzb;
        map2.put(HandleInvocationsFromAdViewer.KEY_ACTION, zzbjiVar);
        map2.put("ad_format", zzbjiVar);
        map2.put("e", zzbji.zzc);
    }

    public final boolean zzb(zzbjm zzbjmVar) {
        return this.zza.offer(zzbjmVar);
    }

    public final Map zzc(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zzd(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final zzbji zzd(String str) {
        zzbji zzbjiVar = (zzbji) this.zzc.get(str);
        return zzbjiVar != null ? zzbjiVar : zzbji.zza;
    }

    public final void zze(String str) throws Throwable {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzc(this.zzb, linkedHashMap), null);
    }

    public final /* synthetic */ void zzf() throws Throwable {
        while (true) {
            try {
                zzbjm zzbjmVar = (zzbjm) this.zza.take();
                zzbjl zzbjlVarZzc = zzbjmVar.zzc();
                if (!TextUtils.isEmpty(zzbjlVarZzc.zza())) {
                    zzg(zzc(this.zzb, zzbjmVar.zze()), zzbjlVarZzc);
                }
            } catch (InterruptedException e7) {
                int i5 = G6.L.f4523b;
                H6.l.g("CsiReporter:reporter interrupted", e7);
                return;
            }
        }
    }
}
