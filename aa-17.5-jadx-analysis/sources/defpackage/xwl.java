package defpackage;

/* loaded from: classes3.dex */
public final class xwl extends xwp {
    final xwp a;

    public xwl(xwp xwpVar) {
        this.a = xwpVar;
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return !this.a.b(c);
    }

    public final String toString() {
        return ((xwk) this.a).b.concat(".negate()");
    }
}
