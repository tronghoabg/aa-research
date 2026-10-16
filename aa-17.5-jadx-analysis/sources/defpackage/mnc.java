package defpackage;

import java.io.PrintWriter;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class mnc implements mnd {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.StatusManager");
    private final SortedMap c = new TreeMap();
    private final Object d = new Object();

    public static mnc a() {
        return (mnc) mki.a.i(mnc.class);
    }

    public final void b(mnb mnbVar, mnd mndVar) {
        synchronized (this.d) {
            this.c.put(mnbVar, mndVar);
        }
    }

    public final void c(mnb mnbVar, eqa eqaVar, mnd mndVar) {
        eqaVar.getLifecycle().c(new mna(this, mnbVar, mndVar));
    }

    public final void d(mnb mnbVar) {
        synchronized (this.d) {
            this.c.remove(mnbVar);
        }
    }

    @Override // defpackage.mnd
    public final void h(PrintWriter printWriter) {
        synchronized (this.d) {
            for (Map.Entry entry : this.c.entrySet()) {
                printWriter.format("=== %s ===\n", ((mnb) entry.getKey()).name());
                try {
                    ((mnd) entry.getValue()).h(printWriter);
                } catch (Throwable th) {
                    ((ype) ((ype) ((ype) b.g()).p(th)).ai(5101)).y("Error caputuring dump for section: %s", ((mnb) entry.getKey()).name());
                    printWriter.format("\nError capturing dump for section: %s\n", th.getMessage());
                    th.printStackTrace(printWriter);
                }
                printWriter.println();
            }
        }
    }
}
