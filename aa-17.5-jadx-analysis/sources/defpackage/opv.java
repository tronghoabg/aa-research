package defpackage;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes2.dex */
public final class opv extends erm {
    public final eqj a;
    public final eqj b;
    public final eqj c;
    private final Context d;
    private final AppWidgetManager e;
    private final PackageManager f;
    private final eqm g;
    private final eqm i;
    private final eqm j;

    public opv(Context context) {
        AutoCloseable autoCloseable;
        esi esiVar;
        afco afcoVarI;
        AutoCloseable autoCloseable2;
        this.d = context;
        this.e = AppWidgetManager.getInstance(context);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.f = packageManager;
        afbe afbeVar = afbe.a;
        eqm eqmVar = new eqm(afbeVar);
        this.g = eqmVar;
        this.a = eqmVar;
        eqm eqmVar2 = new eqm(afbeVar);
        this.i = eqmVar2;
        this.b = eqmVar2;
        eqm eqmVar3 = new eqm(null);
        this.j = eqmVar3;
        this.c = eqmVar3;
        opr.a.a();
        lec.a.a();
        synchronized (ern.a) {
            esk eskVar = this.h;
            synchronized (eskVar.d) {
                autoCloseable = (AutoCloseable) eskVar.a.get("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            }
            esiVar = (esi) autoCloseable;
            if (esiVar == null) {
                try {
                    aitu aituVar = aium.a;
                    afcoVarI = ajct.a.i();
                } catch (aezt | IllegalStateException unused) {
                    afcoVarI = afcp.a;
                }
                esi esiVar2 = new esi(afcoVarI.plus(new aiwh(null)));
                esk eskVar2 = this.h;
                if (eskVar2.c) {
                    esk.a(esiVar2);
                } else {
                    synchronized (eskVar2.d) {
                        autoCloseable2 = (AutoCloseable) eskVar2.a.put("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", esiVar2);
                    }
                    esk.a(autoCloseable2);
                }
                esiVar = esiVar2;
            }
        }
        ahnc.d(esiVar, mkm.a.d(), 0, new opu(this, (afck) null, 0), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opv.a():void");
    }
}
