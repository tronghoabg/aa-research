package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.util.Log;
import com.google.d.d.bq;
import com.google.v.de;
import com.google.v.eu;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6166a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Map f6167b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6168c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.g.a.a.b f6169d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6170e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f6171f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6172g;

    z(Context context, ab abVar) {
        String staticConfigPackage;
        if (abVar.getAutoSubpackage()) {
            String staticConfigPackage2 = abVar.getStaticConfigPackage();
            int i2 = com.google.android.libraries.phenotype.client.c.f5988a;
            if (staticConfigPackage2.contains("#")) {
                throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(staticConfigPackage2)));
            }
            staticConfigPackage = staticConfigPackage2 + "#" + context.getPackageName();
        } else {
            staticConfigPackage = abVar.getStaticConfigPackage();
        }
        this.f6168c = staticConfigPackage;
        this.f6169d = abVar.getBacking();
        this.f6170e = abVar.getDirectBootAware();
        this.f6171f = abVar.getStickyAccountSupport();
        this.f6172g = abVar.getAccountScoped();
    }

    static Map b(Context context) {
        Map mapB;
        Map map = f6167b;
        if (map != null) {
            return map;
        }
        synchronized (f6166a) {
            mapB = f6167b;
            if (mapB == null) {
                bq bqVar = new bq();
                try {
                    String[] list = context.getAssets().list("phenotype");
                    if (list != null) {
                        for (String str : list) {
                            if (str.endsWith("_package_metadata.binarypb")) {
                                try {
                                    InputStream inputStreamOpen = context.getAssets().open("phenotype/" + str);
                                    try {
                                        z zVar = new z(context, ab.parseFrom(inputStreamOpen, de.a()));
                                        bqVar.d(zVar.f6168c, zVar);
                                        if (inputStreamOpen != null) {
                                            inputStreamOpen.close();
                                        }
                                    } catch (Throwable th) {
                                        if (inputStreamOpen != null) {
                                            try {
                                                inputStreamOpen.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (eu e2) {
                                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata for " + str, e2);
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e3);
                }
                mapB = bqVar.b();
                f6167b = mapB;
            }
        }
        return mapB;
    }

    final String a() {
        return this.f6168c;
    }

    final boolean c() {
        return this.f6172g;
    }

    final boolean d() {
        return this.f6170e;
    }

    final boolean e() {
        return this.f6169d.equals(com.google.g.a.a.b.FILE);
    }

    final boolean f() {
        return this.f6171f;
    }
}
