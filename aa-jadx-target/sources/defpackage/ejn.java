package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ejn<MessageType extends defpackage.ejq<MessageType, BuilderType>, BuilderType extends defpackage.ejn<MessageType, BuilderType>> extends defpackage.eil<MessageType, BuilderType> implements defpackage.ekn {
    public final defpackage.ejq a;
    public defpackage.ejq b;

    public ejn(defpackage.ejq ejqVar) {
        this.a = ejqVar;
        if (ejqVar.s()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = h();
    }

    private final defpackage.ejq h() {
        return this.a.l();
    }

    @Override // defpackage.eil
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.ejn clone() {
        defpackage.ejn ejnVarM = this.a.m();
        ejnVarM.b = e();
        return ejnVarM;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: elf */
    public final defpackage.ejq d() throws elf {
        defpackage.ejq ejqVarE = e();
        if (defpackage.ejq.t(ejqVarE)) {
            return ejqVarE;
        }
        throw new elf();
    }

    public final defpackage.ejq e() {
        boolean zS = this.b.s();
        defpackage.ejq ejqVar = this.b;
        if (!zS) {
            return ejqVar;
        }
        ejqVar.n();
        return this.b;
    }

    @Override // defpackage.ekn
    public final /* synthetic */ defpackage.ekm f() {
        throw null;
    }

    public final void g() {
        if (this.b.s()) {
            return;
        }
        defpackage.ejq ejqVarH = h();
        eku.a.b(ejqVarH).e(ejqVarH, this.b);
        this.b = ejqVarH;
    }

    public ejn() {
        this(defpackage.eic.DEFAULT_INSTANCE);
    }
}
