package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ae;
import com.google.firebase.components.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? b(installerPackageName) : "";
    }

    private static String b(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.h.b.a());
        final ae aeVar = new ae(com.google.firebase.b.a.a.class, Executor.class);
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        com.google.firebase.components.b bVarD = com.google.firebase.components.c.d(com.google.firebase.f.c.class, com.google.firebase.f.g.class, com.google.firebase.f.h.class);
        bVarD.b(r.f(Context.class));
        bVarD.b(r.f(e.class));
        bVarD.b(r.i(com.google.firebase.f.d.class));
        bVarD.b(r.h(com.google.firebase.h.h.class));
        bVarD.b(r.e(aeVar));
        bVarD.c(new com.google.firebase.components.g() { // from class: com.google.firebase.f.b
            @Override // com.google.firebase.components.g
            public final Object a(com.google.firebase.components.d dVar) {
                return c.b(aeVar, dVar);
            }
        });
        arrayList.add(bVarD.a());
        arrayList.add(com.google.firebase.h.g.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.h.g.a("fire-core", "21.0.0_1p"));
        arrayList.add(com.google.firebase.h.g.a("device-name", b(Build.PRODUCT)));
        arrayList.add(com.google.firebase.h.g.a("device-model", b(Build.DEVICE)));
        arrayList.add(com.google.firebase.h.g.a("device-brand", b(Build.BRAND)));
        arrayList.add(com.google.firebase.h.g.b("android-target-sdk", new com.google.firebase.h.f() { // from class: com.google.firebase.g
            @Override // com.google.firebase.h.f
            public final String a(Object obj) {
                int i5 = i4;
                if (i5 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i5 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i5 != 2) {
                    return FirebaseCommonRegistrar.a((Context) obj);
                }
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? TtmlNode.TEXT_EMPHASIS_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(com.google.firebase.h.g.b("android-min-sdk", new com.google.firebase.h.f() { // from class: com.google.firebase.g
            @Override // com.google.firebase.h.f
            public final String a(Object obj) {
                int i5 = i3;
                if (i5 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i5 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i5 != 2) {
                    return FirebaseCommonRegistrar.a((Context) obj);
                }
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? TtmlNode.TEXT_EMPHASIS_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        arrayList.add(com.google.firebase.h.g.b("android-platform", new com.google.firebase.h.f() { // from class: com.google.firebase.g
            @Override // com.google.firebase.h.f
            public final String a(Object obj) {
                int i5 = i2;
                if (i5 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i5 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i5 != 2) {
                    return FirebaseCommonRegistrar.a((Context) obj);
                }
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? TtmlNode.TEXT_EMPHASIS_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        final int i5 = 3;
        arrayList.add(com.google.firebase.h.g.b("android-installer", new com.google.firebase.h.f() { // from class: com.google.firebase.g
            @Override // com.google.firebase.h.f
            public final String a(Object obj) {
                int i52 = i5;
                if (i52 == 0) {
                    ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
                    return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
                }
                if (i52 == 1) {
                    ApplicationInfo applicationInfo2 = ((Context) obj).getApplicationInfo();
                    return applicationInfo2 != null ? String.valueOf(applicationInfo2.targetSdkVersion) : "";
                }
                if (i52 != 2) {
                    return FirebaseCommonRegistrar.a((Context) obj);
                }
                Context context = (Context) obj;
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? TtmlNode.TEXT_EMPHASIS_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            }
        }));
        return arrayList;
    }
}
