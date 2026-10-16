package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ajsm extends defpackage.akaw implements java.lang.Cloneable, defpackage.ajsj, defpackage.ajqh, defpackage.ajst, defpackage.ajso {
    public defpackage.ajqt a;
    public java.net.URI b;
    private final java.util.concurrent.atomic.AtomicMarkableReference c = new java.util.concurrent.atomic.AtomicMarkableReference(null, false);

    protected ajsm() {
    }

    @Override // defpackage.ajsj
    @java.lang.Deprecated
    public final void c(defpackage.ajtq ajtqVar) {
        q(new defpackage.ajsk(ajtqVar));
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.ajsm ajsmVar = (defpackage.ajsm) super.clone();
        ajsmVar.d = (defpackage.akbl) defpackage.agup.a(this.d);
        ajsmVar.e = (defpackage.akbs) defpackage.agup.a(this.e);
        return ajsmVar;
    }

    @Override // defpackage.ajqg
    public final defpackage.ajqt d() {
        defpackage.ajqt ajqtVar = this.a;
        return ajqtVar != null ? ajqtVar : defpackage.akbt.b(hj());
    }

    @Override // defpackage.ajsj
    @java.lang.Deprecated
    public final void e(defpackage.ajtu ajtuVar) {
        q(new defpackage.ajsl(ajtuVar));
    }

    @Override // defpackage.ajqh
    public final defpackage.akbh p() {
        java.lang.String strS = s();
        defpackage.ajqt ajqtVarD = d();
        java.net.URI uri = this.b;
        java.lang.String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new defpackage.akbh(strS, aSCIIString, ajqtVarD);
    }

    public final void q(defpackage.ajtk ajtkVar) {
        java.util.concurrent.atomic.AtomicMarkableReference atomicMarkableReference = this.c;
        if (atomicMarkableReference.compareAndSet((defpackage.ajtk) atomicMarkableReference.getReference(), ajtkVar, false, false)) {
            return;
        }
        ajtkVar.a();
    }

    @Override // defpackage.ajst
    public final boolean r() {
        return this.c.isMarked();
    }

    @Override // defpackage.ajst
    public abstract java.lang.String s();

    @Override // defpackage.ajst
    public final java.net.URI t() {
        return this.b;
    }

    public final java.lang.String toString() {
        return s() + " " + java.lang.String.valueOf(this.b) + " " + java.lang.String.valueOf(d());
    }
}
