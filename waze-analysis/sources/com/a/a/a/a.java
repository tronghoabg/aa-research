package com.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import androidx.core.os.BuildCompat;
import com.bumptech.glide.load.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f1722a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Context f1723b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1724c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.b.a.c f1725d;

    /* renamed from: e, reason: collision with root package name */
    private ServiceConnection f1726e;

    public a(Context context) {
        this.f1723b = context.getApplicationContext();
        String packageName = (BuildCompat.isAtLeastU() && SdkExtensions.getExtensionVersion(34) >= 8 && Process.isSdkSandbox()) ? a$$ExternalSyntheticApiModelOutline1.m(context.getSystemService(a$$ExternalSyntheticApiModelOutline1.m13499m())).getClientPackageName() : context.getPackageName();
        this.f1724c = packageName;
    }

    public final void a(c cVar) {
        if (b()) {
            n.q("Service connection is valid. No need to re-initialize.");
            cVar.a(0);
            return;
        }
        if (this.f1722a == 1) {
            n.r("Client is already in the process of connecting to the service.");
            cVar.a(3);
            return;
        }
        n.q("Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Context context = this.f1723b;
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentServices.get(0);
            if (resolveInfo.serviceInfo != null) {
                String str = resolveInfo.serviceInfo.packageName;
                String str2 = resolveInfo.serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    try {
                        if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                            Intent intent2 = new Intent(intent);
                            b bVar = new b(this, cVar);
                            this.f1726e = bVar;
                            try {
                                if (this.f1723b.bindService(intent2, bVar, 1)) {
                                    n.q("Service was bonded successfully.");
                                    return;
                                }
                                n.r("Connection to service is blocked.");
                                this.f1722a = 0;
                                cVar.a(1);
                                return;
                            } catch (SecurityException unused) {
                                n.r("No permission to connect to service.");
                                this.f1722a = 0;
                                cVar.a(4);
                                return;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                }
                n.r("Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f1722a = 0;
                cVar.a(2);
                return;
            }
        }
        this.f1722a = 0;
        n.q("Install Referrer service unavailable on device.");
        cVar.a(2);
    }

    public final boolean b() {
        return (this.f1722a != 2 || this.f1725d == null || this.f1726e == null) ? false : true;
    }

    public final android.support.v4.a.a.a e() throws RemoteException {
        if (!b()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", this.f1724c);
        try {
            return new android.support.v4.a.a.a(this.f1725d.a(bundle));
        } catch (RemoteException e2) {
            n.r("RemoteException getting install referrer information");
            this.f1722a = 0;
            throw e2;
        }
    }
}
