package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxg {
    public final defpackage.bvk a;
    public final defpackage.buq b;
    public final java.lang.Object c;
    public final java.util.concurrent.atomic.AtomicReference d = new java.util.concurrent.atomic.AtomicReference(defpackage.bxh.c);
    public long e = java.lang.Thread.currentThread().getId();
    public final defpackage.cdg f;
    public final defpackage.bxu g;
    private final defpackage.bvi h;
    private final defpackage.bwj i;
    private final defpackage.affg j;
    private final boolean k;
    private defpackage.aaw l;

    public bxg(defpackage.bvk bvkVar, defpackage.bvi bviVar, defpackage.bwj bwjVar, java.util.Set set, defpackage.affg affgVar, boolean z, defpackage.buq buqVar, java.lang.Object obj) {
        this.a = bvkVar;
        this.h = bviVar;
        this.i = bwjVar;
        this.j = affgVar;
        this.k = z;
        this.b = buqVar;
        this.c = obj;
        defpackage.aaw aawVar = defpackage.aax.a;
        aawVar.getClass();
        this.l = aawVar;
        defpackage.cdg cdgVar = new defpackage.cdg();
        cdgVar.h(set, bwjVar.Q());
        this.f = cdgVar;
        this.g = new defpackage.bxu();
    }

    private final void c() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
        defpackage.bxh bxhVar = defpackage.bxh.d;
        defpackage.bxh bxhVar2 = defpackage.bxh.f;
        if (defpackage.a.g(atomicReference, bxhVar, bxhVar2)) {
            return;
        }
        defpackage.bxi.b(defpackage.a.bv(bxhVar2, bxhVar, "Unexpected state change from: ", " to: ", "."));
    }

    public final boolean a() {
        return ((defpackage.bxh) this.d.get()).compareTo(defpackage.bxh.f) >= 0;
    }

    public final void b(defpackage.byc bycVar) throws java.lang.Exception {
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference = this.d;
            switch (((defpackage.bxh) atomicReference.get()).ordinal()) {
                case defpackage.abnt.b /* 0 */:
                    throw new java.lang.IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new java.lang.IllegalStateException("The paused composition has been cancelled");
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    if (this.k) {
                        this.i.ac();
                    }
                    this.l = this.h.p(this.a, bycVar, this.j);
                    if (this.k) {
                        this.i.Z();
                    }
                    defpackage.bxh bxhVar = defpackage.bxh.c;
                    defpackage.bxh bxhVar2 = defpackage.bxh.d;
                    if (!defpackage.a.g(this.d, bxhVar, bxhVar2)) {
                        defpackage.bxi.b(defpackage.a.bv(bxhVar2, bxhVar, "Unexpected state change from: ", " to: ", "."));
                    }
                    if (this.l.b()) {
                        c();
                    }
                    a();
                    return;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    defpackage.bxh bxhVar3 = defpackage.bxh.d;
                    defpackage.bxh bxhVar4 = defpackage.bxh.e;
                    if (!defpackage.a.g(atomicReference, bxhVar3, bxhVar4)) {
                        defpackage.bxi.b(defpackage.a.bv(bxhVar4, bxhVar3, "Unexpected state change from: ", " to: ", "."));
                    }
                    long j = this.e;
                    try {
                        this.e = java.lang.Thread.currentThread().getId();
                        this.l = this.h.q(this.a, bycVar, this.l);
                        this.e = j;
                        defpackage.bxh bxhVar5 = defpackage.bxh.e;
                        defpackage.bxh bxhVar6 = defpackage.bxh.d;
                        if (!defpackage.a.g(this.d, bxhVar5, bxhVar6)) {
                            defpackage.bxi.b(defpackage.a.bv(bxhVar6, bxhVar5, "Unexpected state change from: ", " to: ", "."));
                        }
                        if (this.l.b()) {
                            c();
                        }
                        a();
                        return;
                    } catch (java.lang.Throwable th) {
                        this.e = j;
                        defpackage.bxh bxhVar7 = defpackage.bxh.e;
                        defpackage.bxh bxhVar8 = defpackage.bxh.d;
                        if (!defpackage.a.g(this.d, bxhVar7, bxhVar8)) {
                            defpackage.bxi.b(defpackage.a.bv(bxhVar8, bxhVar7, "Unexpected state change from: ", " to: ", "."));
                        }
                        throw th;
                    }
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    defpackage.bvg.a("Recursive call to resume()");
                    throw new defpackage.afap();
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    throw new java.lang.IllegalStateException("Pausable composition is complete and apply() should be applied");
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new java.lang.IllegalStateException("The paused composition has been applied");
                default:
                    throw new defpackage.afas();
            }
        } catch (java.lang.Exception e) {
            this.d.set(defpackage.bxh.a);
            throw e;
        }
    }
}
