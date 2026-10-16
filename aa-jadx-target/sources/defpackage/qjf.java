package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjf {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public qjf(android.content.Context context) {
        this.d = context;
        this.b = defpackage.afga.cA(new nwn(this, 19));
        this.a = defpackage.afga.cA(new nwn(this, 20));
        this.c = defpackage.afga.cA(new defpackage.oph(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [yqj] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final synchronized j$.util.Optional a() {
        ?? r2;
        ?? r0 = (defpackage.yqj) defpackage.qjg.a.l().ai(7371);
        ?? r3 = this.b;
        r0.M("User triggered surveys: %s triggerType: %s", r3, this.c);
        if (r3.isEmpty()) {
            return j$.util.Optional.empty();
        }
        if (j$.util.Collection.-EL.stream((java.util.Collection) r3).anyMatch(new omr(15))) {
            r2 = r3;
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream((java.util.Collection) r3).filter(new omr(16));
            int i = defpackage.ygw.d;
            r2 = (java.util.List) streamFilter.collect(defpackage.yds.a);
        }
        r2 = r3;
        j$.util.stream.Stream streamDistinct = j$.util.Collection.-EL.stream((java.util.Collection) r2).map(new defpackage.mjc(this, 17)).distinct();
        int i2 = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) streamDistinct.collect(defpackage.yds.a);
        java.lang.Object obj = this.d;
        return j$.util.Optional.of((java.lang.String) ygwVar.get(((defpackage.qjg) obj).c.nextInt(ygwVar.size())));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void b(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        boolean z;
        for (qje qjeVar : this.a) {
            defpackage.zbd zbdVar = qjeVar.a;
            boolean z2 = true;
            if (zbdVar == null || (telemetryEvent.b.b & 4096) == 0) {
                z = false;
            } else {
                int iA = zbdVar.a();
                defpackage.zbg zbgVar = telemetryEvent.b.o;
                if (zbgVar == null) {
                    zbgVar = defpackage.zbg.a;
                }
                if (iA == zbgVar.e) {
                    z = true;
                } else {
                    z = false;
                }
            }
            defpackage.zaa zaaVar = qjeVar.b;
            if (zaaVar != null) {
                defpackage.yyg yygVar = telemetryEvent.b;
                if ((yygVar.b & 8192) == 0) {
                    z2 = false;
                } else {
                    defpackage.zae zaeVar = yygVar.p;
                    if (zaeVar == null) {
                        zaeVar = defpackage.zae.a;
                    }
                    if (zaaVar.fI != zaeVar.d) {
                        z2 = false;
                    }
                }
            } else {
                z2 = false;
            }
            if (z || z2) {
                this.b.add(qjeVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(abst abstVar) {
        for (abss abssVar : abstVar.b) {
            defpackage.absu absuVarB = defpackage.absu.b(abssVar.f);
            if (absuVarB == null) {
                absuVarB = defpackage.absu.TRIGGER_TYPE_SESSION_END;
            }
            if (absuVarB == this.c) {
                this.a.add(new qje(abssVar));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void d() {
        this.a.clear();
        this.b.clear();
    }

    public final float e(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        ((android.content.Context) this.d).getResources().getValue(i, typedValue, true);
        if (typedValue.type == 4) {
            return typedValue.getFloat();
        }
        throw new android.content.res.Resources.NotFoundException("Resource ID #0x" + java.lang.Integer.toHexString(i) + " type #0x" + java.lang.Integer.toHexString(typedValue.type) + " is not valid");
    }

    public qjf(defpackage.qjg qjgVar, defpackage.absu absuVar) {
        this.d = qjgVar;
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.c = absuVar;
    }
}
