package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class cvq {
    public boolean a;
    public aag b;
    public aag c;
    public aag d;
    public aag e;
    private final cym f;

    public cvq(cym cymVar) {
        this.f = cymVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cfx] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void e(cfx cfxVar, bzi bziVar, Set set) {
        if (!cfxVar.M().A) {
            crt.c("visitSubtreeIf called on an unattached node");
        }
        byw bywVar = new byw(new cfx[16]);
        cfx cfxVar2 = cfxVar.M().u;
        if (cfxVar2 == null) {
            bzi.w(bywVar, cfxVar.M());
        } else {
            bywVar.n(cfxVar2);
        }
        while (true) {
            int i = bywVar.b;
            if (i == 0) {
                return;
            }
            cfx cfxVar3 = (cfx) bywVar.c(i - 1);
            if ((cfxVar3.s & 32) != 0) {
                for (cfx cfxVar4 = cfxVar3; cfxVar4 != null && cfxVar4.A; cfxVar4 = cfxVar4.u) {
                    if ((cfxVar4.r & 32) != 0) {
                        cwe cweVarN = cfxVar4;
                        ?? bywVar2 = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cvs) {
                                cvs cvsVar = (cvs) cweVarN;
                                if (cvsVar instanceof cvy) {
                                    cvy cvyVar = (cvy) cvsVar;
                                    if ((cvyVar.a instanceof cvp) && cvyVar.c.contains(bziVar)) {
                                        set.add(cvsVar);
                                    }
                                }
                                if (cvsVar.d().c(bziVar)) {
                                    break;
                                }
                            } else if ((cweVarN.r & 32) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar5 = cweVarN.C;
                                int i2 = 0;
                                cweVarN = cweVarN;
                                bywVar2 = bywVar2;
                                while (cfxVar5 != null) {
                                    if ((cfxVar5.r & 32) != 0) {
                                        i2++;
                                        bywVar2 = bywVar2;
                                        if (i2 == 1) {
                                            cweVarN = cfxVar5;
                                        } else {
                                            if (bywVar2 == 0) {
                                                bywVar2 = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar2.n(cweVarN);
                                            }
                                            bywVar2.n(cfxVar5);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar5 = cfxVar5.u;
                                    cweVarN = cweVarN;
                                    bywVar2 = bywVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar2);
                        }
                    }
                }
            }
            bzi.w(bywVar, cfxVar3);
        }
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f.C(new ahp(this, 18));
    }

    public final aag b() {
        aag aagVar = this.b;
        if (aagVar != null) {
            return aagVar;
        }
        aag aagVar2 = new aag(16);
        this.b = aagVar2;
        return aagVar2;
    }

    public final aag c() {
        aag aagVar = this.c;
        if (aagVar != null) {
            return aagVar;
        }
        aag aagVar2 = new aag(16);
        this.c = aagVar2;
        return aagVar2;
    }

    public final aag d() {
        aag aagVar = this.e;
        if (aagVar != null) {
            return aagVar;
        }
        aag aagVar2 = new aag(16);
        this.e = aagVar2;
        return aagVar2;
    }
}
