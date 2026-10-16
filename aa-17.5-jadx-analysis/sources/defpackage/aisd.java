package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class aisd implements airp {
    public final airp a;
    public final afec b;

    public aisd(airp airpVar, afec afecVar) {
        this.a = airpVar;
        this.b = afecVar;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new aisc(this);
    }
}
