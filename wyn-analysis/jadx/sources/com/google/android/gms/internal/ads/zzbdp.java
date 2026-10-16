package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzbdp {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhcy zzhcyVarZze = zzhcy.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdo
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhcy zzhcyVar = zzhcyVarZze;
                if (list2 == null) {
                    zzhcyVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ApkChecksum apkChecksumD = ab.d.d(list2.get(i5));
                        if (apkChecksumD.getType() == 8) {
                            zzhcyVar.zza(zzbcc.zza(apkChecksumD.getValue()));
                            return;
                        }
                    }
                    zzhcyVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhcyVar.zza((Object) null);
                }
            }
        });
        return (String) zzhcyVarZze.get();
    }
}
