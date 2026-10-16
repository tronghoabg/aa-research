package defpackage;

/* loaded from: classes.dex */
public abstract class abns extends abnv implements abnt {
    public abnl w = abnl.a;

    @Override // defpackage.abnt
    public final Object aY(abnh abnhVar) {
        j(abnhVar);
        Object objJ = this.w.j(abnhVar.d);
        return objJ == null ? abnhVar.b : abnhVar.c(objJ);
    }

    @Override // defpackage.abnt
    public final boolean aZ(abnh abnhVar) {
        throw null;
    }

    final abnl i() {
        abnl abnlVar = this.w;
        if (abnlVar.c) {
            this.w = abnlVar.clone();
        }
        return this.w;
    }

    public final void j(abnh abnhVar) {
        if (abnhVar.a != s()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
