package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jwe implements defpackage.lhn, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("CarApp.H.Har");
    public static final defpackage.kqe d = new defpackage.kqe();
    public boolean b;
    public defpackage.rpe c;
    public defpackage.erh e;
    private final java.util.ArrayDeque f = new java.util.ArrayDeque();

    public static defpackage.jwe a() {
        return (defpackage.jwe) defpackage.mkp.a.i(defpackage.jwe.class);
    }

    public final void b(defpackage.jwc jwcVar, defpackage.jwb jwbVar, int i) {
        java.util.ArrayDeque arrayDeque = this.f;
        synchronized (arrayDeque) {
            arrayDeque.addFirst(new defpackage.jwd(jwcVar, jwbVar, i));
            while (arrayDeque.size() > 30) {
                arrayDeque.removeLast();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2802)).u("CarHardwareProvider is already stopped.");
            b(defpackage.jwc.e, defpackage.jwb.e, 0);
            return;
        }
        this.b = false;
        b(defpackage.jwc.e, defpackage.jwb.a, 0);
        defpackage.mni.a().d(defpackage.mnh.h);
        this.c = null;
        this.e = null;
    }

    public final void e(jvz jvzVar) {
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2803)).u("CarHardwareProvider unsubscribe after stop.");
            b(defpackage.jwc.d, defpackage.jwb.b, jvzVar.b);
            return;
        }
        defpackage.rpe rpeVar = this.c;
        if (rpeVar == null) {
            b(defpackage.jwc.d, defpackage.jwb.c, jvzVar.b);
        } else {
            b(defpackage.jwc.d, defpackage.jwb.a, jvzVar.b);
            rpeVar.b(jvzVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        if (this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 2801)).u("CarHardwareProvider is already started");
            b(defpackage.jwc.a, defpackage.jwb.e, 0);
        } else {
            ((defpackage.yqj) a.l().ai((char) 2800)).u("Starting CarHardwareProvider");
            defpackage.mni.a().b(defpackage.mnh.h, this);
            defpackage.kgu.d(new defpackage.kyo(this, 1), "CarApp.H.Har", defpackage.zbe.APP_HOST_CONTEXT, defpackage.zbd.qp, "Non-recoverable error during initialization. Bailing.", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        defpackage.kqe kqeVar = d;
        printWriter.println("---\nCarHardwareFilter:");
        for (java.util.Map.Entry entry : kqeVar.a.entrySet()) {
            printWriter.printf("  %s%s allowed", entry.getKey(), true != kqeVar.e(((java.lang.Integer) entry.getValue()).intValue()) ? " not" : "");
        }
        printWriter.println("\n---\nCarHardwareProvider:\n");
        java.util.ArrayDeque<defpackage.jwd> arrayDeque = this.f;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                printWriter.println("No car hardware provider status events stored.");
                return;
            }
            mnl mnlVarL = mnq.l();
            mnm mnmVarA = mnn.a();
            mnmVarA.a = "Event Type";
            mnmVarA.b();
            mnmVarA.c('|');
            mnmVarA.d(true);
            mnlVarL.b(mnmVarA.a());
            mnm mnmVarA2 = mnn.a();
            mnmVarA2.a = "Event Status";
            mnmVarA2.b();
            mnmVarA2.c('|');
            mnmVarA2.d(true);
            mnlVarL.b(mnmVarA2.a());
            mnm mnmVarA3 = mnn.a();
            mnmVarA3.a = "Result Type";
            mnmVarA3.b();
            mnmVarA3.c('|');
            mnmVarA3.d(true);
            mnlVarL.b(mnmVarA3.a());
            mnm mnmVarA4 = mnn.a();
            mnmVarA4.a = "Timestamp";
            mnmVarA4.b();
            mnmVarA4.c('|');
            mnmVarA4.d(true);
            mnlVarL.b(mnmVarA4.a());
            for (defpackage.jwd jwdVar : arrayDeque) {
                mnlVarL.c(new java.lang.Object[]{jwdVar.a, jwdVar.b, java.lang.Integer.valueOf(jwdVar.c), java.lang.Long.valueOf(jwdVar.d)});
            }
            mnlVarL.a().m(printWriter);
        }
    }
}
