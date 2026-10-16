package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aisb implements airp {
    public final airp a;
    public final Object b;
    private final /* synthetic */ int c;

    public aisb(airp airpVar, Object obj, int i) {
        this.c = i;
        this.a = airpVar;
        this.b = obj;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return this.c != 0 ? new airz(this, 0) : new aisa(this, 0);
    }
}
