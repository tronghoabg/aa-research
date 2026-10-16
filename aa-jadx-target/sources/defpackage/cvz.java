package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvz {
    public boolean a;
    public defpackage.aan b;
    public defpackage.aan c;
    public defpackage.aan d;
    public defpackage.aan e;
    private final defpackage.cyu f;

    public cvz(defpackage.cyu cyuVar) {
        this.f = cyuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void e(defpackage.cge cgeVar, defpackage.cjv cjvVar, java.util.Set set) {
        if (!cgeVar.M().A) {
            defpackage.csc.c("visitSubtreeIf called on an unattached node");
        }
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar2 = cgeVar.M().u;
        if (cgeVar2 == null) {
            defpackage.cjv.x(bzcVar, cgeVar.M());
        } else {
            bzcVar.n(cgeVar2);
        }
        while (true) {
            int i = bzcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cge cgeVar3 = (defpackage.cge) bzcVar.c(i - 1);
            if ((cgeVar3.s & 32) != 0) {
                defpackage.cge cgeVar4 = cgeVar3;
                while (true) {
                    if (cgeVar4 != null && cgeVar4.A) {
                        if ((cgeVar4.r & 32) != 0) {
                            ?? O = cgeVar4;
                            ?? bzcVar2 = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.cwb) {
                                    defpackage.cwb cwbVar = (defpackage.cwb) O;
                                    if (cwbVar instanceof defpackage.cwi) {
                                        defpackage.cwi cwiVar = (defpackage.cwi) cwbVar;
                                        if ((cwiVar.a instanceof defpackage.cvy) && cwiVar.c.contains(cjvVar)) {
                                            set.add(cwbVar);
                                        }
                                    }
                                    if (cwbVar.d().c(cjvVar)) {
                                        break;
                                    }
                                } else if ((O.r & 32) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar5 = ((defpackage.cwo) O).C;
                                    int i2 = 0;
                                    O = O;
                                    bzcVar2 = bzcVar2;
                                    while (cgeVar5 != null) {
                                        if ((cgeVar5.r & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bzcVar2 = bzcVar2;
                                                O = cgeVar5;
                                            } else {
                                                if (bzcVar2 == 0) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar2.n(O);
                                                }
                                                bzcVar2.n(cgeVar5);
                                                O = 0;
                                            }
                                        }
                                        cgeVar5 = cgeVar5.u;
                                        O = O;
                                        bzcVar2 = bzcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar2);
                            }
                        }
                        cgeVar4 = cgeVar4.u;
                    }
                }
            }
            defpackage.cjv.x(bzcVar, cgeVar3);
        }
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f.C(new defpackage.oe(this, 20));
    }

    public final defpackage.aan b() {
        defpackage.aan aanVar = this.b;
        if (aanVar != null) {
            return aanVar;
        }
        defpackage.aan aanVar2 = new defpackage.aan(16);
        this.b = aanVar2;
        return aanVar2;
    }

    public final defpackage.aan c() {
        defpackage.aan aanVar = this.c;
        if (aanVar != null) {
            return aanVar;
        }
        defpackage.aan aanVar2 = new defpackage.aan(16);
        this.c = aanVar2;
        return aanVar2;
    }

    public final defpackage.aan d() {
        defpackage.aan aanVar = this.e;
        if (aanVar != null) {
            return aanVar;
        }
        defpackage.aan aanVar2 = new defpackage.aan(16);
        this.e = aanVar2;
        return aanVar2;
    }
}
