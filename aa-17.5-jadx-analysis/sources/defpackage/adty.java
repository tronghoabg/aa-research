package defpackage;

/* loaded from: classes.dex */
class adty extends admr {
    public final admr b;

    public adty(admr admrVar) {
        this.b = admrVar;
    }

    @Override // defpackage.admr
    public final String a() {
        return this.b.a();
    }

    @Override // defpackage.admr
    public final void b() {
        this.b.b();
    }

    @Override // defpackage.admr
    public void c() {
        throw null;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", this.b);
        return xxgVarAo.toString();
    }
}
