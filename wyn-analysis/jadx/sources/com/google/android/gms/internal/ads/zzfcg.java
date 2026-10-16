package com.google.android.gms.internal.ads;

import G6.U;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;
import p7.C3773c;
import r7.C3934d;

/* loaded from: classes3.dex */
public final class zzfcg implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;
    private final H6.a zzc;
    private final String zzd;

    public zzfcg(zzhcp zzhcpVar, Context context, H6.a aVar, String str) {
        this.zza = zzhcpVar;
        this.zzb = context;
        this.zzc = aVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        return this.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 35;
    }

    public final zzfch zzc() {
        Context context = this.zzb;
        boolean zE = C3773c.a(context).e();
        U u10 = C6.n.f1857D.f1863c;
        boolean zF = U.f(context);
        String str = this.zzc.f4927a;
        int iMyUid = Process.myUid();
        boolean z2 = iMyUid == 0 || iMyUid == 1000;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzfch(zE, zF, str, z2, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, C3934d.d(context, ModuleDescriptor.MODULE_ID, false), C3934d.a(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
