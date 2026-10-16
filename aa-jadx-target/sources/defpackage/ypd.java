package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class ypd extends defpackage.ypm implements defpackage.ypu {
    protected ypd(java.util.logging.Level level) {
        super(level);
    }

    @Override // defpackage.ypm
    protected final defpackage.ytg j() {
        return defpackage.yte.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [yqf] */
    /* JADX WARN: Type inference failed for: r15v11, types: [yqc] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [yqc] */
    @Override // defpackage.ypm
    protected final boolean k(defpackage.ypq ypqVar) {
        int iA;
        int i;
        defpackage.yqc yqcVar;
        defpackage.yoz yozVar;
        defpackage.yqc yqcVar2;
        ?? r15;
        defpackage.yqy yqyVarC = c();
        int iB = yqyVarC.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (yqyVarC.c(i2).a == "eye3tag") {
                if (yqyVarC.d(defpackage.ypk.a) != null) {
                    break;
                }
                defpackage.ypx ypxVar = defpackage.ypk.i;
                if (yqyVarC.d(ypxVar) != null) {
                    break;
                }
                r(ypxVar, defpackage.yqi.SMALL);
                break;
            }
        }
        defpackage.ypl yplVar = this.c;
        if (yplVar != null) {
            if (ypqVar != null) {
                long j = this.b;
                defpackage.ypr yprVar = defpackage.ypc.a;
                defpackage.ypb ypbVar = (defpackage.ypb) yplVar.d(defpackage.ypk.d);
                if (ypbVar == null) {
                    yqcVar = null;
                } else {
                    defpackage.ypc ypcVar = (defpackage.ypc) defpackage.ypc.a.b(ypqVar, yplVar);
                    if (j < 0) {
                        throw new java.lang.IllegalArgumentException("timestamp cannot be negative");
                    }
                    java.util.concurrent.atomic.AtomicLong atomicLong = ypcVar.b;
                    long j2 = atomicLong.get();
                    if (j2 >= 0) {
                        long nanos = ypbVar.b.toNanos(ypbVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            yqcVar = defpackage.ypc.c;
                        } else {
                            atomicLong.compareAndSet(j2, -j);
                            yqcVar = ypcVar;
                        }
                    } else {
                        atomicLong.compareAndSet(j2, -j);
                        yqcVar = ypcVar;
                    }
                }
                defpackage.ypl yplVar2 = this.c;
                defpackage.ypr yprVar2 = defpackage.yoz.a;
                java.lang.Integer num = (java.lang.Integer) yplVar2.d(defpackage.ypk.b);
                if (num == null) {
                    yqcVar2 = null;
                } else {
                    yozVar = (defpackage.yoz) defpackage.yoz.a.b(ypqVar, yplVar2);
                    if (yozVar.b.incrementAndGet() < num.intValue()) {
                        yqcVar2 = yozVar;
                        yqcVar2 = defpackage.yoz.c;
                    }
                }
                yqcVar2 = yozVar;
                defpackage.yqc yqcVarB = defpackage.yqc.b(yqcVar, yqcVar2);
                defpackage.ypl yplVar3 = this.c;
                defpackage.ypr yprVar3 = defpackage.yqf.a;
                java.lang.Integer num2 = (java.lang.Integer) yplVar3.d(defpackage.ypk.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r15 = 0;
                } else {
                    r15 = (defpackage.yqf) defpackage.yqf.a.b(ypqVar, yplVar3);
                    if ((((java.util.Random) defpackage.yqf.b.get()).nextInt(num2.intValue()) == 0 ? r15.e.incrementAndGet() : r15.e.get()) <= 0) {
                        r15 = defpackage.yqf.c;
                    }
                }
                defpackage.yqc yqcVarB2 = defpackage.yqc.b(yqcVarB, r15);
                this.d = yqcVarB2;
                if (yqcVarB2 == defpackage.yqc.c) {
                    return false;
                }
            }
            defpackage.ypl yplVar4 = this.c;
            defpackage.ypx ypxVar2 = defpackage.ypk.i;
            defpackage.yqi yqiVar = (defpackage.yqi) yplVar4.d(ypxVar2);
            if (yqiVar != null) {
                defpackage.ypl yplVar5 = this.c;
                if (yplVar5 != null && (iA = yplVar5.a(ypxVar2)) >= 0) {
                    int i3 = iA + iA;
                    int i4 = i3 + 2;
                    while (true) {
                        i = yplVar5.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        java.lang.Object obj = yplVar5.a[i4];
                        if (!obj.equals(ypxVar2)) {
                            java.lang.Object[] objArr = yplVar5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    yplVar5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        yplVar5.a[i3] = null;
                        i3++;
                    }
                }
                defpackage.yqy yqyVarC2 = c();
                defpackage.ypx ypxVar3 = defpackage.ypk.a;
                java.lang.Throwable th = (java.lang.Throwable) yqyVarC2.d(ypxVar3);
                int i5 = yqiVar.f;
                ytm ytmVar = ytj.a;
                if (i5 <= 0 && i5 != -1) {
                    throw new java.lang.IllegalArgumentException("invalid maximum depth: 0");
                }
                r(ypxVar3, new yps(th, yqiVar, ytj.a.b(defpackage.ypm.class, i5, 2)));
            }
        }
        return true;
    }
}
