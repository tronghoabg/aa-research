package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class airo implements airp {
    public final afdr a;
    public final afec b;

    public airo(afdr afdrVar, afec afecVar) {
        this.a = afdrVar;
        this.b = afecVar;
    }

    @Override // defpackage.airp
    public final Iterator a() {
        return new airn(this);
    }
}
