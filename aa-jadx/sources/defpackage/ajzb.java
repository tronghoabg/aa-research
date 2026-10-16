package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajzb extends defpackage.ajzc implements defpackage.ajvu {
    private static final long serialVersionUID = -7744598295706617057L;
    public int[] a;
    public boolean b;

    @Override // defpackage.ajzc
    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.ajzb ajzbVar = (defpackage.ajzb) super.clone();
        int[] iArr = this.a;
        if (iArr != null) {
            ajzbVar.a = (int[]) iArr.clone();
        }
        return ajzbVar;
    }

    @Override // defpackage.ajzc, defpackage.ajvi
    public final boolean g(java.util.Date date) {
        return this.b || super.g(date);
    }

    @Override // defpackage.ajzc, defpackage.ajvi
    public final int[] i() {
        return this.a;
    }
}
