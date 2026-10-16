package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.vending.licensing.ILicensingService;
import java.security.SecureRandom;
import p4.AbstractBinderC3765b;
import p4.AbstractBinderC3766c;
import p4.C3764a;

/* loaded from: classes.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22371a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22372b;

    public static class a implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f22373a;

        /* renamed from: b, reason: collision with root package name */
        private final t4 f22374b;

        /* renamed from: com.applovin.impl.o2$a$a, reason: collision with other inner class name */
        public class BinderC0016a extends AbstractBinderC3766c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f22375a;

            public BinderC0016a(int i5) {
                this.f22375a = i5;
                attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
            }

            @Override // p4.InterfaceC3767d
            public void a(int i5, String str, String str2) {
                com.applovin.impl.sdk.o unused = a.this.f22373a;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f22373a.a("LicenseVerificationManager", "Verified with code " + i5);
                }
                a.this.a();
                a.this.f22374b.b(p2.a().b(str).a(str2).b(i5).a(this.f22375a).a());
            }
        }

        public a(com.applovin.impl.sdk.o oVar, t4 t4Var) {
            this.f22373a = oVar;
            this.f22374b = t4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [com.android.vending.licensing.ILicensingService] */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3764a c3764a;
            if (com.applovin.impl.sdk.o.a()) {
                this.f22373a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int i5 = AbstractBinderC3765b.f43237a;
            if (iBinder == null) {
                c3764a = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) {
                    C3764a c3764a2 = new C3764a();
                    c3764a2.f43236a = iBinder;
                    c3764a = c3764a2;
                } else {
                    c3764a = (ILicensingService) iInterfaceQueryLocalInterface;
                }
            }
            try {
                int iNextInt = new SecureRandom().nextInt();
                c3764a.P(iNextInt, com.applovin.impl.sdk.k.o().getPackageName(), new BinderC0016a(iNextInt));
            } catch (RemoteException e7) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22373a.a("LicenseVerificationManager", "Failed to check license", e7);
                }
                a();
                this.f22374b.a((Object) e7);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f22373a.k("LicenseVerificationManager", "License service disconnected");
            }
            if (this.f22374b.c()) {
                return;
            }
            this.f22374b.a((Object) new IllegalStateException("License service disconnected"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e7) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22373a.d("LicenseVerificationManager", "Failed to unbind license service", e7);
                }
            }
        }
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.f22371a = kVar;
        this.f22372b = kVar.O();
    }

    public t4 a(long j8) {
        t4 t4Var = new t4("verify_license");
        if (j8 > 0) {
            j6.a(j8, t4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f22371a);
        }
        try {
            Intent intent = new Intent(ILicensingService.class.getName());
            intent.setPackage("com.android.vending");
            if (!com.applovin.impl.sdk.k.o().bindService(intent, new a(this.f22372b, t4Var), 1)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22372b.k("LicenseVerificationManager", "Failed to bind to the license service");
                }
                t4Var.a((Object) new Exception("Failed to bind to license service"));
                return t4Var;
            }
        } catch (Exception e7) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f22372b.a("LicenseVerificationManager", "Failed to verify license", e7);
            }
            t4Var.a((Object) e7);
        }
        return t4Var;
    }
}
