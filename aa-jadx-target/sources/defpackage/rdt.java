package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdt implements defpackage.rzz {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rdt(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qyo] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, qyl] */
    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = this.c;
        final int i2 = 1;
        if (i == 0) {
            final defpackage.ref refVar = (defpackage.ref) this.a;
            if (!refVar.p(defpackage.rbf.S)) {
                throw new java.lang.IllegalStateException("This API can only be used if the hero punch-through feature is enabled");
            }
            final java.lang.Object obj = this.b;
            return (rkn) refVar.g.c(rkn.class, ((com.google.android.gms.car.display.CarDisplayId) obj).a(), new defpackage.rej() { // from class: rdy
                @Override // defpackage.rej
                public final java.lang.Object a() throws android.os.RemoteException {
                    int i3 = i2;
                    defpackage.ref refVar2 = refVar;
                    if (i3 == 0) {
                        return new rpg(refVar2.C().K((java.lang.String) obj), new defpackage.xei(refVar2, null), refVar2.c);
                    }
                    defpackage.rki rkiVarQ = refVar2.C().Q((com.google.android.gms.car.display.CarDisplayId) obj);
                    rkiVarQ.getClass();
                    return new rkn(rkiVarQ);
                }
            });
        }
        if (i == 1) {
            return java.lang.Boolean.valueOf(((defpackage.qsb) this.a).b.l(this.b));
        }
        if (i == 2) {
            defpackage.zif zifVar = new defpackage.zif();
            ((defpackage.ref) this.a).C().ar((com.google.android.gms.car.display.CarDisplayId) this.b, new ree(zifVar));
            return zifVar;
        }
        final java.lang.Object obj2 = this.b;
        if (i != 3) {
            return ((defpackage.rjf) this.a).b.f((com.google.android.gms.car.control.CarProperty) obj2);
        }
        final defpackage.ref refVar2 = (defpackage.ref) this.a;
        final int i3 = 0;
        return (rpg) refVar2.g.c(rpg.class, (java.lang.String) obj2, new defpackage.rej() { // from class: rdy
            @Override // defpackage.rej
            public final java.lang.Object a() throws android.os.RemoteException {
                int i4 = i3;
                defpackage.ref refVar3 = refVar2;
                if (i4 == 0) {
                    return new rpg(refVar3.C().K((java.lang.String) obj2), new defpackage.xei(refVar3, null), refVar3.c);
                }
                defpackage.rki rkiVarQ = refVar3.C().Q((com.google.android.gms.car.display.CarDisplayId) obj2);
                rkiVarQ.getClass();
                return new rkn(rkiVarQ);
            }
        });
    }
}
