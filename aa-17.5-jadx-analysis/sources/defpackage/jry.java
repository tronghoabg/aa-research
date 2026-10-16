package defpackage;

import android.os.SystemClock;
import android.util.Pair;
import androidx.car.app.AppInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.PrintWriter;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jry implements epf, mnd {
    private static final yph c = yph.c("CarApp.H");
    private static jry d;
    public boolean a;
    public final Map b = new ConcurrentHashMap();

    private jry() {
    }

    public static jry g() {
        jry jryVar = d;
        boolean z = false;
        if (jryVar != null && !jryVar.a && lbh.d().getLifecycle().a().a(eps.d)) {
            z = true;
        }
        jry jryVar2 = d;
        if (jryVar2 != null && !z) {
            return jryVar2;
        }
        jry jryVar3 = new jry();
        jryVar3.a = true;
        lbh.d().getLifecycle().c(jryVar3);
        mnc.a().c(mnb.b, lbh.d(), jryVar3);
        d = jryVar3;
        return jryVar3;
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        this.a = false;
        Map map = this.b;
        ((ype) c.l().ai((char) 2703)).y("Invalidating Hosts: %s", map.values());
        if (!map.isEmpty()) {
            for (fug fugVar : map.values()) {
                fugVar.e();
                fugVar.d();
            }
        }
        map.clear();
        eqaVar.getLifecycle().d(this);
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        try {
            printWriter.println("Car host cache");
            Map map = this.b;
            printWriter.printf("- size: %d\n", Integer.valueOf(map.size()));
            printWriter.printf("- host sdk version: %d\n", Integer.valueOf((int) aczc.b()));
            printWriter.printf("- hosts: %d\n", Integer.valueOf(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Pair pair = (Pair) entry.getKey();
                printWriter.println("\n-------------------------------");
                printWriter.printf("Host: %s\n", pair.first);
                printWriter.printf("SessionInfo: %s\n", pair.second);
                fug fugVar = (fug) entry.getValue();
                printWriter.printf("- state: %s\n", fugVar.a.e);
                printWriter.printf("- is valid: %b\n", Boolean.valueOf(fugVar.g));
                if (fugVar.f >= 0) {
                    fugVar.e.z();
                    printWriter.printf("- duration: %s\n", ger.a(SystemClock.elapsedRealtime() - fugVar.f));
                }
                gmg gmgVar = fugVar.b;
                printWriter.printf("- state: %s\n", gmgVar.m.name());
                ggl gglVarI = gmgVar.g.i();
                printWriter.printf("- host min api: %d, host max api: %d, negotiated api: %s\n", Integer.valueOf(((jvd) gglVarI).d), Integer.valueOf(((jvd) gglVarI).e), Integer.valueOf(gglVarI.a));
                AppInfo appInfo = gglVarI.b;
                String strValueOf = appInfo != null ? Integer.valueOf(appInfo.getMinCarAppApiLevel()) : "-";
                AppInfo appInfo2 = gglVarI.b;
                printWriter.printf("- app min api: %s, app target api: %s\n", strValueOf, appInfo2 != null ? Integer.valueOf(appInfo2.getLatestCarAppApiLevel()) : "-");
                AppInfo appInfo3 = gglVarI.b;
                printWriter.printf("- sdk version: %s\n", appInfo3 != null ? appInfo3.getLibraryDisplayVersion() : "n/a");
                fugVar.e.G(printWriter);
                for (Map.Entry entry2 : fugVar.d.entrySet()) {
                    printWriter.printf("\nHost service: %s\n", entry2.getKey());
                    ((fuh) entry2.getValue()).p(printWriter);
                }
            }
        } catch (Throwable th) {
            ((ype) ((ype) ((ype) c.g()).p(th)).ai((char) 2704)).u("Failed to produce status report for car host cache");
        }
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
