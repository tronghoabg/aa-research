package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ash implements aizk {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public ash(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v24, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v14, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.c;
        if (i == 0) {
            defpackage.asi asiVar = (defpackage.asi) obj;
            if (asiVar instanceof defpackage.asf) {
                this.a.add(asiVar);
            } else if (asiVar instanceof defpackage.asg) {
                this.a.remove(((defpackage.asg) asiVar).a);
            }
            this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.asi asiVar2 = (defpackage.asi) obj;
            if (asiVar2 instanceof defpackage.asd) {
                this.a.add(asiVar2);
            } else if (asiVar2 instanceof defpackage.ase) {
                this.a.remove(((defpackage.ase) asiVar2).a);
            }
            this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
            return defpackage.afbk.a;
        }
        if (i == 2) {
            defpackage.asi asiVar3 = (defpackage.asi) obj;
            if (asiVar3 instanceof defpackage.asn) {
                this.a.add(asiVar3);
            } else if (asiVar3 instanceof defpackage.aso) {
                this.a.remove(((defpackage.aso) asiVar3).a);
            } else if (asiVar3 instanceof defpackage.asm) {
                this.a.remove(((defpackage.asm) asiVar3).a);
            }
            this.b.b(java.lang.Boolean.valueOf(!this.a.isEmpty()));
            return defpackage.afbk.a;
        }
        if (i != 3) {
            long j = ((defpackage.cji) obj).a;
            defpackage.aeb aebVar = (defpackage.aeb) this.b;
            if ((((defpackage.cji) aebVar.d()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L) {
                if (java.lang.Float.intBitsToFloat((int) (((defpackage.cji) aebVar.d()).a & 4294967295L)) != java.lang.Float.intBitsToFloat((int) (4294967295L & j))) {
                    ahoc.d((aiuw) this.a, (defpackage.afdo) null, 0, new defpackage.aqi(aebVar, j, (defpackage.afdk) null, 3), 3);
                    return defpackage.afbk.a;
                }
            }
            java.lang.Object objE = aebVar.e(new defpackage.cji(j), afdkVar);
            return objE != defpackage.afdr.a ? defpackage.afbk.a : objE;
        }
        defpackage.asi asiVar4 = (defpackage.asi) obj;
        if ((asiVar4 instanceof defpackage.asf) || (asiVar4 instanceof defpackage.asd) || (asiVar4 instanceof defpackage.asn)) {
            ((defpackage.aan) this.b).p(asiVar4);
        } else if (asiVar4 instanceof defpackage.asg) {
            ((defpackage.aan) this.b).o(((defpackage.asg) asiVar4).a);
        } else if (asiVar4 instanceof defpackage.ase) {
            ((defpackage.aan) this.b).o(((defpackage.ase) asiVar4).a);
        } else if (asiVar4 instanceof defpackage.aso) {
            ((defpackage.aan) this.b).o(((defpackage.aso) asiVar4).a);
        } else if (asiVar4 instanceof defpackage.asm) {
            ((defpackage.aan) this.b).o(((defpackage.asm) asiVar4).a);
        }
        defpackage.aan aanVar = (defpackage.aan) this.b;
        java.lang.Object[] objArr = aanVar.a;
        int i2 = aanVar.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            defpackage.asi asiVar5 = (defpackage.asi) objArr[i4];
            if (asiVar5 instanceof defpackage.asf) {
                i3 |= 2;
            } else if (asiVar5 instanceof defpackage.asd) {
                i3 |= 1;
            } else if (asiVar5 instanceof defpackage.asn) {
                i3 |= 4;
            }
        }
        ((defpackage.byj) ((defpackage.bil) this.a).a).h(i3);
        return defpackage.afbk.a;
    }

    public ash(java.util.List list, defpackage.bwx bwxVar, int i) {
        this.c = i;
        this.a = list;
        this.b = bwxVar;
    }
}
