package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
final class qsp implements rus {
    final /* synthetic */ qsr a;
    private final Set b;
    private final boolean c;

    public qsp(qsr qsrVar, Set set, boolean z) {
        this.a = qsrVar;
        this.b = set;
        this.c = z;
    }

    @Override // defpackage.rus
    public final void a() {
        qsr.a.f().ai(7874).u("Car services started");
        qsr qsrVar = this.a;
        qsq qsqVar = qsrVar.e;
        qsqVar.getClass();
        qsrVar.d.post(new ral(qsqVar, 1));
    }

    @Override // defpackage.rus
    public final boolean b(int i) {
        if (!this.c || i != rro.SENSOR_SOURCE.a()) {
            return false;
        }
        qsr.a.f().ai(7875).w("Sensor service (%d) already opened in Proxy. Force open in Lite.", i);
        return true;
    }

    @Override // defpackage.rus
    public final boolean c(int i) {
        return this.b.contains(Integer.valueOf(i));
    }
}
