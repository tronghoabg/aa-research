package defpackage;

/* loaded from: classes.dex */
public final class xwn extends xwp {
    final xwp a;
    final xwp b;

    public xwn(xwp xwpVar, xwp xwpVar2) {
        this.a = xwpVar;
        xwpVar2.getClass();
        this.b = xwpVar2;
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return this.a.b(c) || this.b.b(c);
    }

    public final String toString() {
        xwp xwpVar = this.b;
        return this.a.toString() + ".or(" + xwpVar.toString() + ")";
    }
}
