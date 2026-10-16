package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qji implements defpackage.lhh, defpackage.mnj {
    public static final /* synthetic */ int c = 0;
    private static final defpackage.yqm d = defpackage.yqm.c("GH.DefaultAppManager");
    public final java.util.Map a;
    final defpackage.qjj b;
    private final android.os.Handler e;
    private final android.content.Context f;

    public qji(android.content.Context context) {
        int i = defpackage.lhi.a;
        this.a = new java.util.HashMap();
        this.e = new android.os.Handler();
        this.f = context;
        this.b = new defpackage.qjj(context);
        int i2 = defpackage.mni.a;
        ((defpackage.mni) defpackage.mkp.a.i(defpackage.mni.class)).b(defpackage.mnh.i, this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    private final android.content.ComponentName g(defpackage.mqg mqgVar, boolean z, defpackage.qsh qshVar) {
        defpackage.ygw ygwVar;
        android.content.ComponentName componentNameA;
        java.lang.String shortString;
        defpackage.qjj qjjVar = this.b;
        android.content.ComponentName componentNameC = defpackage.qjj.c(mqgVar, qjjVar.b);
        if (componentNameC != null) {
            if (!k(componentNameC)) {
                if (mqgVar == defpackage.mqg.MEDIA && componentNameC.getClassName().equals("com.google.android.projection.gearhead.media.MediaService")) {
                    i(componentNameC, java.lang.String.format(java.util.Locale.US, "invalid class name category=%s", mqgVar.name()));
                } else if (j(componentNameC, mqgVar)) {
                    if (z) {
                        defpackage.yhx yhxVarL = l(qshVar, mqgVar);
                        if (!j$.util.Collection.-EL.stream(yhxVarL).map(new defpackage.rix(1)).anyMatch(new defpackage.orr(componentNameC, 12))) {
                            i(componentNameC, java.lang.String.format(java.util.Locale.US, "not available for category=%s availableApps=%s", mqgVar.name(), yhxVarL));
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 7388)).y("Unable to check available apps since it is not within lifetime, returning app %s", componentNameC);
                    }
                    componentNameA = componentNameC;
                }
                if (!defpackage.actz.P() && !defpackage.nsn.e().g(componentNameC)) {
                    ((defpackage.yqj) ((defpackage.yqj) d.f()).ai(7392)).M("Component %s is disabled and is thus unable to get replaced, category=%s", componentNameC, mqgVar);
                } else if (z) {
                    j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(l(qshVar, mqgVar)).filter(new defpackage.orr(componentNameC, 10));
                    int i = defpackage.ygw.d;
                    ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
                    ((defpackage.yqj) ((defpackage.yqj) d.h()).ai(7391)).R("The saved default component=%s for category=%s is invalid. Querying AvailableAppFinder for potential equivalent apps=%s in case of class name change.", componentNameC, mqgVar.name(), ygwVar);
                    if (ygwVar.size() == 1) {
                        componentNameA = ((defpackage.mqj) ygwVar.get(0)).a();
                        if (j(componentNameA, mqgVar) || k(componentNameA)) {
                        }
                    }
                }
            } else if (!defpackage.actz.P()) {
                if (z) {
                    j$.util.stream.Stream streamFilter2 = j$.util.Collection.-EL.stream(l(qshVar, mqgVar)).filter(new defpackage.orr(componentNameC, 10));
                    int i2 = defpackage.ygw.d;
                    ygwVar = (defpackage.ygw) streamFilter2.collect(defpackage.yds.a);
                    ((defpackage.yqj) ((defpackage.yqj) d.h()).ai(7391)).R("The saved default component=%s for category=%s is invalid. Querying AvailableAppFinder for potential equivalent apps=%s in case of class name change.", componentNameC, mqgVar.name(), ygwVar);
                    if (ygwVar.size() == 1) {
                        componentNameA = ((defpackage.mqj) ygwVar.get(0)).a();
                        if (j(componentNameA, mqgVar)) {
                        }
                    }
                }
            } else if (z) {
                j$.util.stream.Stream streamFilter3 = j$.util.Collection.-EL.stream(l(qshVar, mqgVar)).filter(new defpackage.orr(componentNameC, 10));
                int i3 = defpackage.ygw.d;
                ygwVar = (defpackage.ygw) streamFilter3.collect(defpackage.yds.a);
                ((defpackage.yqj) ((defpackage.yqj) d.h()).ai(7391)).R("The saved default component=%s for category=%s is invalid. Querying AvailableAppFinder for potential equivalent apps=%s in case of class name change.", componentNameC, mqgVar.name(), ygwVar);
                if (ygwVar.size() == 1) {
                    componentNameA = ((defpackage.mqj) ygwVar.get(0)).a();
                    if (j(componentNameA, mqgVar)) {
                    }
                }
            }
            if (componentNameA == null) {
                componentNameA.toShortString();
                return componentNameA;
            }
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) d.f()).ai(7385);
            if (componentNameC != null) {
                shortString = componentNameC.toShortString();
            } else {
                shortString = null;
            }
            yqjVar.M("getDefaultApp clearing invalid component %s %s", shortString, mqgVar);
            qjjVar.b(mqgVar);
            return null;
        }
        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 7387)).y("component not validated, was null, category=%s", mqgVar);
        componentNameA = null;
        if (componentNameA == null) {
            componentNameA.toShortString();
            return componentNameA;
        }
        defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) d.f()).ai(7385);
        if (componentNameC != null) {
            shortString = componentNameC.toShortString();
        } else {
            shortString = null;
        }
        yqjVar2.M("getDefaultApp clearing invalid component %s %s", shortString, mqgVar);
        qjjVar.b(mqgVar);
        return null;
    }

    private final void i(android.content.ComponentName componentName, java.lang.String str) {
        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai(7390)).M("App validation failed for app=%s reason=%s", componentName, str);
        this.e.post(new psi(this, componentName, str, 6));
    }

    private final boolean j(android.content.ComponentName componentName, defpackage.mqg mqgVar) {
        if (defpackage.jrk.a(this.f, new android.content.Intent().setComponent(componentName)) != null) {
            return true;
        }
        i(componentName, java.lang.String.format(java.util.Locale.US, "queryComponentNameForIntent was NULL category=%s", mqgVar.name()));
        return false;
    }

    private final boolean k(android.content.ComponentName componentName) {
        if (defpackage.acpj.d() || !defpackage.lhi.a(this.f.getPackageManager(), componentName)) {
            return false;
        }
        ((defpackage.yqj) ((defpackage.yqj) d.f()).ai((char) 7389)).y("Component %s is marked as DISABLED", componentName);
        return true;
    }

    private static final defpackage.yhx l(defpackage.qsh qshVar, defpackage.mqg mqgVar) {
        int iOrdinal = mqgVar.ordinal();
        return (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) ? (defpackage.yhx) j$.util.Collection.-EL.stream(defpackage.ler.a().b(qshVar, defpackage.nze.a())).filter(new defpackage.orr(mqgVar, 11)).collect(defpackage.yds.b) : defpackage.ynd.a;
    }

    @Override // defpackage.lhh
    public final android.content.ComponentName a(defpackage.mqg mqgVar) {
        return g(mqgVar, true, defpackage.kit.b().e());
    }

    @Override // defpackage.lhh
    public final android.content.ComponentName b(defpackage.mqg mqgVar) {
        android.content.ComponentName componentNameG = g(mqgVar, false, null);
        if (componentNameG == null || defpackage.nsn.e().g(componentNameG) || k(componentNameG)) {
            return componentNameG;
        }
        ((defpackage.yqj) d.l().ai((char) 7386)).y("getDefaultAppOutOfLifetime unable to return %s since it is disabled", componentNameG.toShortString());
        return null;
    }

    @Override // defpackage.lhh
    public final void c(defpackage.mqg mqgVar, lhg lhgVar) {
        this.b.c.t(defpackage.qjj.a(mqgVar), lhgVar);
    }

    @Override // defpackage.lhh
    public final void d(defpackage.mqg mqgVar) {
        this.b.b(mqgVar);
    }

    @Override // defpackage.lhh
    public final void e(defpackage.mqg mqgVar, lhg lhgVar) {
        this.b.c.C(defpackage.qjj.a(mqgVar), lhgVar);
    }

    @Override // defpackage.lhh
    public final void f(defpackage.mqg mqgVar, android.content.ComponentName componentName) {
        defpackage.yqm yqmVar = d;
        ((defpackage.yqj) yqmVar.l().ai(7393)).M("setDefaultApp for facet type: %s component %s", mqgVar, componentName);
        if (componentName == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 7394)).u("Attempt to set default app with null component. Ignoring.");
            return;
        }
        defpackage.qjj qjjVar = this.b;
        ((defpackage.yqj) defpackage.qjj.a.l().ai((char) 7399)).M("writeDefaultApp appCategory:%s component:%s", mqgVar, componentName);
        android.content.SharedPreferences.Editor editorEdit = qjjVar.b.edit();
        editorEdit.putString("component_".concat(defpackage.qjj.a(mqgVar)), componentName.flattenToString());
        editorEdit.apply();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) throws wfo {
        defpackage.wfp.c();
        j$.time.format.DateTimeFormatter dateTimeFormatterOfPattern = j$.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS", java.util.Locale.US);
        printWriter.println("Rejected Apps:");
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            printWriter.println(entry.getKey());
            for (qjh qjhVar : (defpackage.yfd) entry.getValue()) {
                printWriter.println(java.lang.String.format(java.util.Locale.US, "\t[%s] %s", qjhVar.a.atZone(j$.time.ZoneId.systemDefault()).format(dateTimeFormatterOfPattern), qjhVar.b));
            }
            printWriter.println();
        }
    }
}
