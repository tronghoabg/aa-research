package defpackage;

import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class jwa implements lhg, mnd {
    public static final yph a = yph.c("CarApp.H.Har");
    public static final ogz d = new ogz((byte[]) null);
    public boolean b;
    public roj c;
    public erb e;
    private final ArrayDeque f = new ArrayDeque();

    public static jwa a() {
        return (jwa) mki.a.i(jwa.class);
    }

    public final void b(jvy jvyVar, jvx jvxVar, int i) {
        ArrayDeque arrayDeque = this.f;
        synchronized (arrayDeque) {
            arrayDeque.addFirst(new jvz(jvyVar, jvxVar, i));
            while (arrayDeque.size() > 30) {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        wer.c();
        if (this.b) {
            ((ype) ((ype) a.h()).ai((char) 2798)).u("CarHardwareProvider is already started");
            b(jvy.a, jvx.e, 0);
        } else {
            ((ype) a.l().ai((char) 2797)).u("Starting CarHardwareProvider");
            mnc.a().b(mnb.h, this);
            kgq.d(new kyi(this, 1), "CarApp.H.Har", yzz.APP_HOST_CONTEXT, yzy.qn, "Non-recoverable error during initialization. Bailing.", new Object[0]);
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        wer.c();
        if (!this.b) {
            ((ype) ((ype) a.h()).ai((char) 2799)).u("CarHardwareProvider is already stopped.");
            b(jvy.e, jvx.e, 0);
            return;
        }
        this.b = false;
        b(jvy.e, jvx.a, 0);
        mnc.a().d(mnb.h);
        this.c = null;
        this.e = null;
    }

    public final void e(jvv jvvVar) {
        if (!this.b) {
            ((ype) ((ype) a.h()).ai((char) 2800)).u("CarHardwareProvider unsubscribe after stop.");
            b(jvy.d, jvx.b, jvvVar.b);
            return;
        }
        roj rojVar = this.c;
        if (rojVar == null) {
            b(jvy.d, jvx.c, jvvVar.b);
        } else {
            b(jvy.d, jvx.a, jvvVar.b);
            rojVar.b(jvvVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        ogz ogzVar = d;
        printWriter.println("---\nCarHardwareFilter:");
        for (Map.Entry entry : ogzVar.b.entrySet()) {
            printWriter.printf("  %s%s allowed", entry.getKey(), true != ogzVar.i(((Integer) entry.getValue()).intValue()) ? " not" : "");
        }
        printWriter.println("\n---\nCarHardwareProvider:\n");
        ArrayDeque arrayDeque = this.f;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                printWriter.println("No car hardware provider status events stored.");
                return;
            }
            mnf mnfVarL = mnk.l();
            mng mngVarA = mnh.a();
            mngVarA.a = "Event Type";
            mngVarA.b();
            mngVarA.c('|');
            mngVarA.d(true);
            mnfVarL.b(mngVarA.a());
            mng mngVarA2 = mnh.a();
            mngVarA2.a = "Event Status";
            mngVarA2.b();
            mngVarA2.c('|');
            mngVarA2.d(true);
            mnfVarL.b(mngVarA2.a());
            mng mngVarA3 = mnh.a();
            mngVarA3.a = "Result Type";
            mngVarA3.b();
            mngVarA3.c('|');
            mngVarA3.d(true);
            mnfVarL.b(mngVarA3.a());
            mng mngVarA4 = mnh.a();
            mngVarA4.a = "Timestamp";
            mngVarA4.b();
            mngVarA4.c('|');
            mngVarA4.d(true);
            mnfVarL.b(mngVarA4.a());
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                jvz jvzVar = (jvz) it.next();
                mnfVarL.c(jvzVar.a, jvzVar.b, Integer.valueOf(jvzVar.c), Long.valueOf(jvzVar.d));
            }
            mnfVarL.a().m(printWriter);
        }
    }
}
