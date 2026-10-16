package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.Collection;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class qim implements lha, mnd {
    public static final /* synthetic */ int c = 0;
    private static final yph d = yph.c("GH.DefaultAppManager");
    public final Map a;
    final qin b;
    private final Handler e;
    private final Context f;

    public qim(Context context) {
        int i = lhb.a;
        this.a = new HashMap();
        this.e = new Handler();
        this.f = context;
        this.b = new qin(context);
        int i2 = mnc.a;
        ((mnc) mki.a.i(mnc.class)).b(mnb.i, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.content.ComponentName g(defpackage.mpz r10, boolean r11, defpackage.qrn r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qim.g(mpz, boolean, qrn):android.content.ComponentName");
    }

    private final void i(ComponentName componentName, String str) {
        ((ype) ((ype) d.f()).ai(7365)).M("App validation failed for app=%s reason=%s", componentName, str);
        this.e.post(new prm(this, componentName, str, 6));
    }

    private final boolean j(ComponentName componentName, mpz mpzVar) {
        if (jrj.a(this.f, new Intent().setComponent(componentName)) != null) {
            return true;
        }
        i(componentName, String.format(Locale.US, "queryComponentNameForIntent was NULL category=%s", mpzVar.name()));
        return false;
    }

    private final boolean k(ComponentName componentName) {
        if (acoh.d() || !lhb.a(this.f.getPackageManager(), componentName)) {
            return false;
        }
        ((ype) ((ype) d.f()).ai((char) 7364)).y("Component %s is marked as DISABLED", componentName);
        return true;
    }

    private static final ygr l(qrn qrnVar, mpz mpzVar) {
        int iOrdinal = mpzVar.ordinal();
        return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) ? (ygr) Collection.EL.stream(lem.a().b(qrnVar, nyj.a())).filter(new pcx(mpzVar, 10)).collect(ycm.b) : yly.a;
    }

    @Override // defpackage.lha
    public final ComponentName a(mpz mpzVar) {
        return g(mpzVar, true, kio.b().e());
    }

    @Override // defpackage.lha
    public final ComponentName b(mpz mpzVar) {
        ComponentName componentNameG = g(mpzVar, false, null);
        if (componentNameG == null || nrz.e().g(componentNameG) || k(componentNameG)) {
            return componentNameG;
        }
        ((ype) d.l().ai((char) 7361)).y("getDefaultAppOutOfLifetime unable to return %s since it is disabled", componentNameG.toShortString());
        return null;
    }

    @Override // defpackage.lha
    public final void c(mpz mpzVar, lgz lgzVar) {
        this.b.c.t(qin.a(mpzVar), lgzVar);
    }

    @Override // defpackage.lha
    public final void d(mpz mpzVar) {
        this.b.b(mpzVar);
    }

    @Override // defpackage.lha
    public final void e(mpz mpzVar, lgz lgzVar) {
        this.b.c.C(qin.a(mpzVar), lgzVar);
    }

    @Override // defpackage.lha
    public final void f(mpz mpzVar, ComponentName componentName) {
        yph yphVar = d;
        ((ype) yphVar.l().ai(7368)).M("setDefaultApp for facet type: %s component %s", mpzVar, componentName);
        if (componentName == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 7369)).u("Attempt to set default app with null component. Ignoring.");
            return;
        }
        qin qinVar = this.b;
        ((ype) qin.a.l().ai((char) 7374)).M("writeDefaultApp appCategory:%s component:%s", mpzVar, componentName);
        SharedPreferences.Editor editorEdit = qinVar.b.edit();
        editorEdit.putString("component_".concat(qin.a(mpzVar)), componentName.flattenToString());
        editorEdit.apply();
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        wer.c();
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);
        printWriter.println("Rejected Apps:");
        for (Map.Entry entry : this.a.entrySet()) {
            printWriter.println(entry.getKey());
            Iterator<E> it = ((ydx) entry.getValue()).iterator();
            while (it.hasNext()) {
                qil qilVar = (qil) it.next();
                printWriter.println(String.format(Locale.US, "\t[%s] %s", qilVar.a.atZone(ZoneId.systemDefault()).format(dateTimeFormatterOfPattern), qilVar.b));
            }
            printWriter.println();
        }
    }
}
