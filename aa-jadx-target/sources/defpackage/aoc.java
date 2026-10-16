package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aoc extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.affc b;
    final /* synthetic */ defpackage.afer c;
    final /* synthetic */ defpackage.afer d;
    final /* synthetic */ defpackage.affg e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoc(defpackage.affc affcVar, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.affg affgVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = affcVar;
        this.c = aferVar;
        this.d = aferVar2;
        this.e = affgVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aoc aocVar = new defpackage.aoc(this.b, this.c, this.d, this.e, afdkVar);
        aocVar.f = obj;
        return aocVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: CancellationException -> 0x00a2, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0099 A[Catch: CancellationException -> 0x00a2, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00a2, blocks: (B:7:0x0011, B:24:0x006d, B:26:0x0075, B:28:0x0081, B:30:0x008d, B:31:0x0090, B:32:0x0093, B:33:0x0099, B:8:0x0015, B:19:0x0046, B:21:0x004a, B:11:0x001d, B:16:0x0037, B:14:0x0029), top: B:40:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0090 A[SYNTHETIC] */
    @Override // defpackage.afdy
    public final java.lang.Object hf(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.cru cruVar;
        defpackage.cru cruVar2;
        defpackage.crd crdVar;
        java.util.List list;
        int size;
        defpackage.crd crdVar2;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i = this.a;
        try {
            if (i == 0) {
                defpackage.afga.cz(obj);
                cruVar = (defpackage.cru) this.f;
                this.f = cruVar;
                this.a = 1;
                defpackage.affh affhVar = defpackage.arc.a;
                obj = defpackage.arc.a(cruVar, false, defpackage.cqv.b, this);
                if (obj != afdrVar) {
                }
                return afdrVar;
            }
            if (i != 1) {
                cruVar2 = (defpackage.cru) this.f;
                if (i == 2) {
                    defpackage.afga.cz(obj);
                    crdVar = (defpackage.crd) obj;
                    if (crdVar != null) {
                        this.b.invoke(new defpackage.cji(crdVar.c));
                        long j = crdVar.a;
                        defpackage.act actVar = new defpackage.act(this.e, 13);
                        this.f = cruVar2;
                        this.a = 3;
                        obj = defpackage.ca.aS(cruVar2, j, actVar, this);
                        if (obj == afdrVar) {
                            return afdrVar;
                        }
                    }
                    return defpackage.afbk.a;
                }
                defpackage.afga.cz(obj);
            } else {
                cruVar = (defpackage.cru) this.f;
                defpackage.afga.cz(obj);
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                list = cruVar2.p().a;
                size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    crdVar2 = (defpackage.crd) list.get(i2);
                    if (defpackage.tq.k(crdVar2)) {
                        crdVar2.b();
                    }
                }
                this.c.invoke();
            } else {
                this.d.invoke();
            }
            return defpackage.afbk.a;
            long j2 = ((defpackage.crd) obj).a;
            this.f = cruVar;
            this.a = 2;
            obj = defpackage.ca.aP(cruVar, j2, this);
            if (obj != afdrVar) {
                cruVar2 = cruVar;
                crdVar = (defpackage.crd) obj;
                if (crdVar != null) {
                    this.b.invoke(new defpackage.cji(crdVar.c));
                    long j3 = crdVar.a;
                    defpackage.act actVar2 = new defpackage.act(this.e, 13);
                    this.f = cruVar2;
                    this.a = 3;
                    obj = defpackage.ca.aS(cruVar2, j3, actVar2, this);
                    if (obj == afdrVar) {
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        list = cruVar2.p().a;
                        size = list.size();
                        while (i2 < size) {
                            crdVar2 = (defpackage.crd) list.get(i2);
                            if (defpackage.tq.k(crdVar2)) {
                                crdVar2.b();
                            }
                        }
                        this.c.invoke();
                    } else {
                        this.d.invoke();
                    }
                }
                return defpackage.afbk.a;
            }
            return afdrVar;
        } catch (java.util.concurrent.CancellationException e) {
            this.d.invoke();
            throw e;
        }
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aoc) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
