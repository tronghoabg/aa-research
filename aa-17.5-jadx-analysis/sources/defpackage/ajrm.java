package defpackage;

import java.net.URI;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes2.dex */
public abstract class ajrm extends ajzw implements Cloneable, ajrj, ajph, ajrt, ajro {
    public ajpt a;
    public URI b;
    private final AtomicMarkableReference c = new AtomicMarkableReference(null, false);

    protected ajrm() {
    }

    @Override // defpackage.ajrj
    @Deprecated
    public final void c(ajsq ajsqVar) {
        q(new ajrk(ajsqVar));
    }

    public Object clone() throws CloneNotSupportedException {
        ajrm ajrmVar = (ajrm) super.clone();
        ajrmVar.d = (akal) ahgc.a(this.d);
        ajrmVar.e = (akas) ahgc.a(this.e);
        return ajrmVar;
    }

    @Override // defpackage.ajpg
    public final ajpt d() {
        ajpt ajptVar = this.a;
        return ajptVar != null ? ajptVar : akat.b(hX());
    }

    @Override // defpackage.ajrj
    @Deprecated
    public final void e(ajsu ajsuVar) {
        q(new ajrl(ajsuVar));
    }

    @Override // defpackage.ajph
    public final akah p() {
        String strS = s();
        ajpt ajptVarD = d();
        URI uri = this.b;
        String aSCIIString = uri != null ? uri.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.isEmpty()) {
            aSCIIString = "/";
        }
        return new akah(strS, aSCIIString, ajptVarD);
    }

    public final void q(ajsk ajskVar) {
        AtomicMarkableReference atomicMarkableReference = this.c;
        if (atomicMarkableReference.compareAndSet((ajsk) atomicMarkableReference.getReference(), ajskVar, false, false)) {
            return;
        }
        ajskVar.a();
    }

    @Override // defpackage.ajrt
    public final boolean r() {
        return this.c.isMarked();
    }

    @Override // defpackage.ajrt
    public abstract String s();

    @Override // defpackage.ajrt
    public final URI t() {
        return this.b;
    }

    public final String toString() {
        return s() + " " + String.valueOf(this.b) + " " + String.valueOf(d());
    }
}
