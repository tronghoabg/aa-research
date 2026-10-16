package defpackage;

/* loaded from: classes3.dex */
public final class aifh extends aihn<aifh> {
    private final agfk annotations;

    public aifh(agfk agfkVar) {
        agfkVar.getClass();
        this.annotations = agfkVar;
    }

    @Override // defpackage.aihn
    public aifh add(aifh aifhVar) {
        return aifhVar == null ? this : new aifh(agfm.composeAnnotations(this.annotations, aifhVar.annotations));
    }

    public boolean equals(Object obj) {
        if (obj instanceof aifh) {
            return affa.f(((aifh) obj).annotations, this.annotations);
        }
        return false;
    }

    public final agfk getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.aihn
    public afhe<? extends aifh> getKey() {
        return affw.b(aifh.class);
    }

    public int hashCode() {
        return this.annotations.hashCode();
    }

    @Override // defpackage.aihn
    public aifh intersect(aifh aifhVar) {
        if (affa.f(aifhVar, this)) {
            return this;
        }
        return null;
    }
}
