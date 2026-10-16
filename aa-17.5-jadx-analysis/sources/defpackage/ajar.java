package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ajar extends ajal {
    private final Iterable d;

    public ajar(Iterable iterable, afco afcoVar, int i, int i2) {
        super(afcoVar, i, i2);
        this.d = iterable;
    }

    @Override // defpackage.ajal
    public final Object b(aixv aixvVar, afck afckVar) {
        ajbf ajbfVar = new ajbf(aixvVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ahnc.d(aixvVar, null, 0, new nkn((aiyk) it.next(), ajbfVar, (afck) null, 20), 3);
        }
        return afak.a;
    }

    @Override // defpackage.ajal
    protected final ajal c(afco afcoVar, int i, int i2) {
        return new ajar(this.d, afcoVar, i, i2);
    }

    @Override // defpackage.ajal
    public final aixx e(aitx aitxVar) {
        return aimh.c(aitxVar, this.a, this.b, 1, 1, new epm((ajal) this, (afck) null, 5));
    }
}
