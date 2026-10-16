package defpackage;

/* loaded from: classes.dex */
public final class bvk extends cew implements bym {
    public final afdr a;
    public final byi b;
    public bvj c = new bvj(cek.b().v());

    public bvk(afdr afdrVar, byi byiVar) {
        this.a = afdrVar;
        this.b = byiVar;
    }

    @Override // defpackage.bym
    public final Object a() {
        afec afecVarI = cek.b().i();
        if (afecVarI != null) {
            afecVarI.invoke(this);
        }
        cec cecVarB = cek.b();
        return b((bvj) cek.d(this.c, cecVarB), cecVarB, true, this.a).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Type inference failed for: r12v3, types: [bee] */
    /* JADX WARN: Type inference failed for: r2v7, types: [lah] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bvj b(defpackage.bvj r21, defpackage.cec r22, boolean r23, defpackage.afdr r24) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvk.b(bvj, cec, boolean, afdr):bvj");
    }

    @Override // defpackage.cev
    /* renamed from: c */
    public final cex getA() {
        return this.c;
    }

    @Override // defpackage.cev
    public final void d(cex cexVar) {
        cexVar.getClass();
        this.c = (bvj) cexVar;
    }

    public final bvj e() {
        cec cecVarB = cek.b();
        return b((bvj) cek.d(this.c, cecVarB), cecVarB, false, this.a);
    }

    public final String toString() {
        bvj bvjVar = (bvj) cek.e(this.c, this);
        return "DerivedState(value=" + (bvjVar.d(cek.b()) ? String.valueOf(bvjVar.e) : "<Not calculated>") + ")@" + hashCode();
    }
}
