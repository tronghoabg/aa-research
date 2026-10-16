package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes4.dex */
public class j implements k {

    /* renamed from: d, reason: collision with root package name */
    private static volatile j f28114d;

    /* renamed from: a, reason: collision with root package name */
    private volatile Boolean f28115a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Boolean f28116b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f28117c;

    private j(Context context) {
        this.f28117c = context;
        c();
    }

    public static j a(Context context) {
        if (f28114d == null) {
            synchronized (j.class) {
                try {
                    if (f28114d == null) {
                        f28114d = new j(context);
                    }
                } finally {
                }
            }
        }
        return f28114d;
    }

    public boolean b() {
        boolean zHasSystemFeature;
        if (this.f28116b != null) {
            return this.f28116b.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f28116b == null) {
                    if (c()) {
                        try {
                            PackageManager packageManager = this.f28117c.getPackageManager();
                            if (packageManager == null) {
                                com.iab.omid.library.vungle.utils.d.b("PackageManager is null when checking attestation capability");
                                this.f28116b = Boolean.FALSE;
                            } else {
                                zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                                this.f28116b = Boolean.valueOf(zHasSystemFeature);
                            }
                        } catch (SecurityException e7) {
                            com.iab.omid.library.vungle.utils.d.a("Security exception when checking attestation capability", e7);
                            this.f28116b = Boolean.FALSE;
                            return false;
                        } catch (Exception e10) {
                            com.iab.omid.library.vungle.utils.d.a("Unexpected error when checking attestation capability", e10);
                            this.f28116b = Boolean.FALSE;
                            return false;
                        }
                    } else {
                        this.f28116b = Boolean.FALSE;
                    }
                    return false;
                }
                zHasSystemFeature = this.f28116b.booleanValue();
                return zHasSystemFeature;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        boolean zBooleanValue;
        int i5;
        if (this.f28115a != null) {
            return this.f28115a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f28115a != null) {
                    zBooleanValue = this.f28115a.booleanValue();
                } else {
                    zBooleanValue = this.f28117c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i5 = Build.VERSION.SDK_INT) >= 25 && i5 <= 30;
                    this.f28115a = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // com.iab.omid.library.vungle.attestation.k
    public boolean a() {
        return c();
    }
}
