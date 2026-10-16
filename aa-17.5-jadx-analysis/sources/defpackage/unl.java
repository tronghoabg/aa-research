package defpackage;

/* loaded from: classes3.dex */
final class unl {
    final /* synthetic */ unp a;
    private final ackk b;
    private uok c = null;
    private boolean d = false;

    public unl(unp unpVar, ackk ackkVar) {
        this.a = unpVar;
        this.b = ackkVar;
    }

    final synchronized uok a() {
        if (this.d) {
            return this.c;
        }
        try {
            vaq.d();
            uoi uoiVar = (uoi) this.b.a();
            unp unpVar = this.a;
            uok uokVarB = uoiVar.b(unpVar.d, unpVar.g);
            this.c = uokVarB;
            return uokVarB;
        } finally {
            this.d = true;
        }
    }
}
