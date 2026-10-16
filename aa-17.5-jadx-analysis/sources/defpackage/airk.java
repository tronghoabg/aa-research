package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class airk implements airp {
    public final airp a;
    public final boolean b;
    public final afec c;

    public airk(airp airpVar, boolean z, afec afecVar) {
        this.a = airpVar;
        this.b = z;
        this.c = afecVar;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new airz(this, 1);
    }
}
