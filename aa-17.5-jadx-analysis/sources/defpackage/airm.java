package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class airm implements airp {
    public final airp a;
    public final afec b;
    public final afec c;

    public airm(airp airpVar, afec afecVar, afec afecVar2) {
        this.a = airpVar;
        this.b = afecVar;
        this.c = afecVar2;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new airl(this);
    }
}
