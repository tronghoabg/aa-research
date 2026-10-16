package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class airy implements airp, airi {
    public final airp a;

    public airy(airp airpVar) {
        this.a = airpVar;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new airh(this, 2);
    }

    @Override // defpackage.airi
    public final airp b(int i) {
        return i >= 2 ? airj.a : new airx(this.a, 1, 0);
    }
}
