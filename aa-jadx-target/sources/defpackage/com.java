package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class com extends defpackage.bup {
    public com(defpackage.col colVar) {
        super(colVar);
    }

    private static final defpackage.cnl m(defpackage.col colVar) {
        if (colVar instanceof defpackage.cnl) {
            return (defpackage.cnl) colVar;
        }
        throw new java.lang.IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // defpackage.bup
    protected final void e() {
        defpackage.cnl cnlVarM = m((defpackage.col) this.a);
        cnlVarM.f(0, cnlVarM.a());
    }

    @Override // defpackage.buq
    public final /* bridge */ /* synthetic */ void i(int i, java.lang.Object obj) {
        m((defpackage.col) this.b).d(i, (defpackage.col) obj);
    }

    @Override // defpackage.buq
    public final /* bridge */ /* synthetic */ void j(int i, java.lang.Object obj) {
    }

    @Override // defpackage.buq
    public final void k(int i, int i2, int i3) {
        defpackage.cnl cnlVarM = m((defpackage.col) this.b);
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                java.util.List list = cnlVarM.a;
                defpackage.col colVar = (defpackage.col) list.get(i);
                list.remove(i);
                list.add(i2, colVar);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                java.util.List list2 = cnlVarM.a;
                defpackage.col colVar2 = (defpackage.col) list2.get(i);
                list2.remove(i);
                list2.add(i2 - 1, colVar2);
                i4++;
            }
        }
        cnlVarM.q();
    }

    @Override // defpackage.buq
    public final void l(int i, int i2) {
        m((defpackage.col) this.b).f(i, i2);
    }
}
