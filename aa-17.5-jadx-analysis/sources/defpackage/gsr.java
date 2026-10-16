package defpackage;

import android.os.IBinder;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class gsr extends fud {
    public final gsu c;
    public final jyj d;
    private final gsp e;
    private final ArrayDeque f;

    public gsr(gsu gsuVar, geu geuVar, jyj jyjVar) {
        super(geuVar, "CarApp.H.Nav");
        this.e = new gsp(this);
        this.f = new ArrayDeque();
        this.d = jyjVar;
        this.c = gsuVar;
    }

    public final String a() {
        return ((gmh) this.a.d()).a.getPackageName();
    }

    public final void b(int i) {
        ArrayDeque arrayDeque = this.f;
        gsq gsqVar = (gsq) arrayDeque.peekFirst();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (gsqVar == null || gsqVar.d != i) {
            arrayDeque.addFirst(new gsq(i, jCurrentTimeMillis));
            while (arrayDeque.size() > 10) {
                arrayDeque.removeLast();
            }
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            gsqVar.b++;
            gsqVar.c = jCurrentTimeMillis2;
        }
    }

    @Override // defpackage.fud
    public final void k() {
        this.d.a();
    }

    @Override // defpackage.fud
    public final void m() {
        this.d.a();
    }

    @Override // defpackage.fud, defpackage.gnp
    public final void p(PrintWriter printWriter) {
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            printWriter.println("No navigation status events stored.");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        printWriter.printf("Event   | First Event Delta (millis), Num Consecutive Events, Last Event Delta (millis)\n", new Object[0]);
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            gsq gsqVar = (gsq) it.next();
            int i = gsqVar.d;
            printWriter.printf("%8s| %s, %d, %s\n", i != 1 ? i != 2 ? i != 3 ? "STOP" : "END" : "UPDATE" : "START", ger.a(jCurrentTimeMillis - gsqVar.a), Integer.valueOf(gsqVar.b), ger.a(jCurrentTimeMillis - gsqVar.c));
        }
    }

    @Override // defpackage.fuh
    public final /* bridge */ /* synthetic */ IBinder q() {
        g();
        return this.e;
    }
}
