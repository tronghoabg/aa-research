package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
final class zzasg extends zzase {
    private int zza = 0;
    private final Context zzb;
    private final String zzc;
    private zzbeq zzd;
    private ServiceConnection zze;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzasg(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            android.content.Context r0 = r3.getApplicationContext()
            r2.zzb = r0
            int r0 = g1.AbstractC2665a.f35493a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L27
            r1 = 33
            if (r0 < r1) goto L4b
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.AbstractC3340k.d(r0, r1)
            java.lang.String r0 = "UpsideDownCake"
            boolean r0 = g1.AbstractC2665a.a(r0)
            if (r0 == 0) goto L4b
        L27:
            int r0 = com.applovin.impl.sdk.z.b()
            r1 = 8
            if (r0 < r1) goto L4b
            boolean r0 = G6.T.x()
            if (r0 == 0) goto L46
            java.lang.Class r0 = Wf.AbstractC1258p.i()
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.sdksandbox.sdkprovider.SdkSandboxController r3 = Wf.AbstractC1258p.g(r3)
            java.lang.String r3 = com.applovin.impl.sdk.y.g(r3)
            goto L4f
        L46:
            java.lang.String r3 = r3.getPackageName()
            goto L4f
        L4b:
            java.lang.String r3 = r3.getPackageName()
        L4f:
            r2.zzc = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzasg.<init>(android.content.Context):void");
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final boolean zza() {
        return (this.zza != 2 || this.zzd == null || this.zze == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb(zzash zzashVar) {
        ServiceInfo serviceInfo;
        if (zza()) {
            zzasj.zza("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            zzashVar.zza(0);
            return;
        }
        int i5 = this.zza;
        if (i5 == 1) {
            zzasj.zzb("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            zzashVar.zza(3);
            return;
        }
        if (i5 == 3) {
            zzasj.zzb("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            zzashVar.zza(3);
            return;
        }
        zzasj.zza("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.zzb;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
            this.zza = 0;
            zzasj.zza("InstallReferrerClient", "Install Referrer service unavailable on device.");
            zzashVar.zza(2);
            return;
        }
        String str = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str) && str2 != null) {
            try {
                if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                    Intent intent2 = new Intent(intent);
                    zzasf zzasfVar = new zzasf(this, zzashVar, null);
                    this.zze = zzasfVar;
                    try {
                        if (this.zzb.bindService(intent2, zzasfVar, 1)) {
                            zzasj.zza("InstallReferrerClient", "Service was bonded successfully.");
                            return;
                        }
                        zzasj.zzb("InstallReferrerClient", "Connection to service is blocked.");
                        this.zza = 0;
                        zzashVar.zza(1);
                        return;
                    } catch (SecurityException unused) {
                        zzasj.zzb("InstallReferrerClient", "No permission to connect to service.");
                        this.zza = 0;
                        zzashVar.zza(4);
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        zzasj.zzb("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
        this.zza = 0;
        zzashVar.zza(2);
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzc() {
        this.zza = 3;
        if (this.zze != null) {
            zzasj.zza("InstallReferrerClient", "Unbinding from service.");
            this.zzb.unbindService(this.zze);
            this.zze = null;
        }
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final zzasi zzd() throws RemoteException {
        if (!zza()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.zzc);
        try {
            return new zzasi(this.zzd.zze(bundle));
        } catch (RemoteException e7) {
            zzasj.zzb("InstallReferrerClient", "RemoteException getting install referrer information");
            this.zza = 0;
            throw e7;
        }
    }

    public final /* synthetic */ void zze(int i5) {
        this.zza = i5;
    }

    public final /* synthetic */ void zzf(zzbeq zzbeqVar) {
        this.zzd = zzbeqVar;
    }
}
