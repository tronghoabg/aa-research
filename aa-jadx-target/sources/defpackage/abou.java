package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class abou extends defpackage.abox implements defpackage.abov {
    public defpackage.abon w = defpackage.abon.a;

    @Override // defpackage.abov
    public final java.lang.Object aY(defpackage.aboj abojVar) {
        j(abojVar);
        java.lang.Object objJ = this.w.j(abojVar.d);
        return objJ == null ? abojVar.b : abojVar.c(objJ);
    }

    @Override // defpackage.abov
    public final boolean aZ(defpackage.aboj abojVar) {
        throw null;
    }

    final defpackage.abon i() {
        defpackage.abon abonVar = this.w;
        if (abonVar.c) {
            this.w = abonVar.clone();
        }
        return this.w;
    }

    public final void j(defpackage.aboj abojVar) {
        if (abojVar.a != s()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
