package defpackage;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ljc {
    public final List a = new CopyOnWriteArrayList();
    public final List b = new CopyOnWriteArrayList();
    public boolean c;
    public boolean d;
    public final qse e;
    public final roj f;

    public ljc(roj rojVar) throws qrz {
        ljb ljbVar = new ljb(this, 0);
        this.e = ljbVar;
        this.f = rojVar;
        rojVar.f(ljbVar, 11, 0);
        qsf qsfVarA = rojVar.a(11);
        if (qsfVarA != null) {
            ljbVar.d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
        }
    }
}
