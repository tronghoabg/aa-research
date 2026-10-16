package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class flz {
    public final fod a;
    public final Context b;
    public final String c;
    public final fiy d;
    public final WorkDatabase e;
    public final foe f;
    public final fnk g;
    public final String h;
    public final List i;
    public final aivj j;
    public final ajdr k;
    private final fng l;
    private final List m;
    private final List n;

    /* JADX WARN: Type inference failed for: r2v4, types: [fng, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public flz(rfe rfeVar) throws IOException {
        fod fodVar = (fod) rfeVar.f;
        this.a = fodVar;
        this.b = (Context) rfeVar.e;
        String str = fodVar.a;
        this.c = str;
        this.k = (ajdr) rfeVar.b;
        this.d = (fiy) rfeVar.c;
        this.l = rfeVar.d;
        WorkDatabase workDatabase = (WorkDatabase) rfeVar.a;
        this.e = workDatabase;
        this.f = workDatabase.x();
        this.g = workDatabase.s();
        ?? r3 = rfeVar.g;
        this.m = r3;
        this.h = "Work [ id=" + str + ", class=" + fodVar.c + ", tags={ " + woy.cu(r3, ",", null, null, null, 62) + " } ]";
        this.j = new aivj(null);
        this.i = new ArrayList();
        this.n = new ArrayList();
    }

    public final fny a() {
        return dtb.l(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.afck r20) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flz.b(afck):java.lang.Object");
    }

    public final boolean c(int i) {
        fod fodVar = this.a;
        if (affa.f(fodVar.w, true)) {
            String str = fma.a;
            fjo.a().c(str, "Worker " + fodVar.c + " was interrupted. Backing off.");
            d(i);
            return true;
        }
        foe foeVar = this.f;
        String str2 = this.c;
        fju fjuVarB = foeVar.b(str2);
        if (fjuVarB == null || fjuVarB.a()) {
            String str3 = fma.a;
            fjo.a().c(str3, "Status for " + str2 + " is " + fjuVarB + " ; not doing any work");
            return false;
        }
        String str4 = fma.a;
        fjo.a().c(str4, "Status for " + str2 + " is " + fjuVarB + "; not doing any work and rescheduling for later execution");
        foeVar.w(fju.a, str2);
        foeVar.o(str2, i);
        foeVar.s(str2, -1L);
        return true;
    }

    public final void d(int i) {
        foe foeVar = this.f;
        fju fjuVar = fju.a;
        String str = this.c;
        foeVar.w(fjuVar, str);
        foeVar.m(str, System.currentTimeMillis());
        foeVar.l(str, this.a.t);
        foeVar.s(str, -1L);
        foeVar.o(str, i);
    }

    public final void e() {
        foe foeVar = this.f;
        String str = this.c;
        foeVar.m(str, System.currentTimeMillis());
        foeVar.w(fju.a, str);
        foeVar.u(str);
        foeVar.l(str, this.a.t);
        foeVar.j(str);
        foeVar.s(str, -1L);
    }

    public final void f(dsu dsuVar) {
        String str = fma.a;
        fjo.a();
        Log.i(str, "Worker result FAILURE for ".concat(this.h));
        if (this.a.d()) {
            e();
        } else {
            g(dsuVar);
        }
    }

    public final void g(dsu dsuVar) {
        String str = this.c;
        List<String> listBk = woy.bk(str);
        listBk.addAll(dtb.m(this.g, str));
        for (String str2 : listBk) {
            foe foeVar = this.f;
            if (foeVar.b(str2) != fju.f) {
                foeVar.w(fju.d, str2);
                if (!affa.f(str2, str)) {
                    this.n.add(str2);
                }
            }
        }
        fjc fjcVar = ((fjk) dsuVar).a;
        fjcVar.getClass();
        foe foeVar2 = this.f;
        foeVar2.l(str, this.a.t);
        foeVar2.n(str, fjcVar);
    }
}
