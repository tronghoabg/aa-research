package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.camera.core.processing.util.GLUtils;
import com.google.android.gms.o.ag;
import com.google.android.gms.o.t;
import com.google.android.play.core.a.r;
import com.google.firebase.crashlytics.a.c.ae;
import com.google.firebase.crashlytics.a.c.aj;
import com.google.firebase.crashlytics.a.c.an;
import com.google.firebase.crashlytics.a.c.aq;
import com.google.firebase.crashlytics.a.c.j;
import com.google.firebase.crashlytics.a.i;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebaseCrashlytics {

    /* renamed from: a, reason: collision with root package name */
    final ae f9052a;

    private FirebaseCrashlytics(ae aeVar) {
        this.f9052a = aeVar;
    }

    static FirebaseCrashlytics a(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, com.google.firebase.g.b bVar, com.google.firebase.g.b bVar2, com.google.firebase.g.b bVar3) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        char c2;
        char c3;
        int i2;
        Context contextA = eVar.a();
        String packageName = contextA.getPackageName();
        i.a().f("Initializing Firebase Crashlytics 19.0.4_1p for ".concat(String.valueOf(packageName)));
        com.google.firebase.crashlytics.a.f.c cVar = new com.google.firebase.crashlytics.a.f.c(contextA);
        aj ajVar = new aj(eVar);
        aq aqVar = new aq(contextA, packageName, dVar, ajVar);
        com.google.firebase.crashlytics.a.e eVar2 = new com.google.firebase.crashlytics.a.e(bVar);
        final c cVar2 = new c(bVar2);
        ExecutorService executorServiceA = an.a("Crashlytics Exception Handler");
        j jVar = new j(ajVar, cVar);
        com.google.firebase.sessions.a.c.c(jVar);
        ae aeVar = new ae(eVar, aqVar, eVar2, ajVar, new com.google.firebase.crashlytics.a.b.a() { // from class: com.google.firebase.crashlytics.a
            @Override // com.google.firebase.crashlytics.a.b.a
            public final void a(h hVar) {
                c.c(cVar2, hVar);
            }
        }, new com.google.firebase.crashlytics.a.a.a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.a.a.a
            public final void a(Bundle bundle) {
                cVar2.f9777b.a(bundle);
            }
        }, cVar, executorServiceA, jVar, new r(bVar3));
        String strC = eVar.d().c();
        String strE = com.google.firebase.crashlytics.a.c.g.e(contextA);
        ArrayList<com.google.android.libraries.phenotype.client.stable.j> arrayList = new ArrayList();
        int iB = com.google.firebase.crashlytics.a.c.g.b(contextA, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iB2 = com.google.firebase.crashlytics.a.c.g.b(contextA, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iB3 = com.google.firebase.crashlytics.a.c.g.b(contextA, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iB == 0 || iB2 == 0 || iB3 == 0) {
            c2 = 2;
            c3 = 1;
            i2 = 0;
            i.a().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iB), Integer.valueOf(iB2), Integer.valueOf(iB3)));
        } else {
            String[] stringArray = contextA.getResources().getStringArray(iB);
            String[] stringArray2 = contextA.getResources().getStringArray(iB2);
            String[] stringArray3 = contextA.getResources().getStringArray(iB3);
            int length = stringArray.length;
            c2 = 2;
            int length2 = stringArray3.length;
            c3 = 1;
            if (length == length2 && stringArray2.length == length2) {
                for (int i3 = 0; i3 < stringArray3.length; i3++) {
                    arrayList.add(new com.google.android.libraries.phenotype.client.stable.j(stringArray[i3], stringArray2[i3], stringArray3[i3]));
                }
                i2 = 0;
            } else {
                i2 = 0;
                i.a().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(length), Integer.valueOf(stringArray2.length), Integer.valueOf(length2)));
            }
        }
        i.a().b("Mapping file ID is: ".concat(String.valueOf(strE)));
        for (com.google.android.libraries.phenotype.client.stable.j jVar2 : arrayList) {
            i iVarA = i.a();
            String strH = jVar2.h();
            String strF = jVar2.f();
            String strG = jVar2.g();
            Object[] objArr = new Object[3];
            objArr[i2] = strH;
            objArr[c3] = strF;
            objArr[c2] = strG;
            iVarA.b(String.format("Build id for %s on %s: %s", objArr));
        }
        com.google.firebase.crashlytics.a.h hVar = new com.google.firebase.crashlytics.a.h(contextA);
        try {
            String packageName2 = contextA.getPackageName();
            String strE2 = aqVar.e();
            PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(packageName2, i2);
            com.google.firebase.crashlytics.a.c.a aVar = new com.google.firebase.crashlytics.a.c.a(strC, strE, arrayList, strE2, packageName2, Long.toString(packageInfo.getLongVersionCode()), packageInfo.versionName == null ? GLUtils.VERSION_UNKNOWN : packageInfo.versionName, hVar);
            i.a().g("Installer package name is: ".concat(String.valueOf(aVar.f9068d)));
            String str = aVar.f9070f;
            String str2 = aVar.f9071g;
            ExecutorService executorServiceA2 = an.a("com.google.firebase.crashlytics.startup");
            com.google.firebase.crashlytics.a.h.f fVarJ = com.google.firebase.crashlytics.a.h.f.j(contextA, strC, aqVar, str, str2, cVar, ajVar);
            fVarJ.b(executorServiceA2).b(executorServiceA2, new f());
            ag.a(executorServiceA2, new g(aeVar.l(aVar, fVarJ), aeVar, fVarJ));
            return new FirebaseCrashlytics(aeVar);
        } catch (PackageManager.NameNotFoundException e2) {
            i.a().e("Error retrieving app package info.", e2);
            return null;
        }
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.e.b().f(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public t<Boolean> checkForUnsentReports() {
        return this.f9052a.a();
    }

    public void deleteUnsentReports() {
        this.f9052a.m();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f9052a.j();
    }

    public void log(String str) {
        this.f9052a.d(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            i.a().h("A null value was passed to recordException. Ignoring.");
        } else {
            this.f9052a.e(th);
        }
    }

    public void sendUnsentReports() {
        this.f9052a.o();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.f9052a.g(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, double d2) {
        this.f9052a.h(str, Double.toString(d2));
    }

    public void setCustomKeys(e eVar) {
        Map map = eVar.f9780a;
        this.f9052a.p();
    }

    public void setUserId(String str) {
        this.f9052a.i(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f9052a.g(bool);
    }

    public void setCustomKey(String str, float f2) {
        this.f9052a.h(str, Float.toString(f2));
    }

    public void setCustomKey(String str, int i2) {
        this.f9052a.h(str, Integer.toString(i2));
    }

    public void setCustomKey(String str, long j2) {
        this.f9052a.h(str, Long.toString(j2));
    }

    public void setCustomKey(String str, String str2) {
        this.f9052a.h(str, str2);
    }

    public void setCustomKey(String str, boolean z) {
        this.f9052a.h(str, Boolean.toString(z));
    }
}
