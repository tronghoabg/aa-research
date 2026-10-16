package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yvd extends defpackage.yve {
    private final java.lang.Object b;
    private final java.lang.Object c;

    public yvd(java.lang.Object obj, java.lang.Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.yve
    public final j$.util.Optional a(java.util.function.BiFunction biFunction) {
        j$.util.Optional optional = (j$.util.Optional) biFunction.apply(this.b, this.c);
        optional.getClass();
        return optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.yvd) {
            defpackage.yvd yvdVar = (defpackage.yvd) obj;
            if (j$.util.Objects.equals(this.b, yvdVar.b) && j$.util.Objects.equals(this.c, yvdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.b, this.c);
    }

    public final java.lang.String toString() {
        return "of(" + ((java.lang.String) this.b) + ", " + ((java.lang.String) this.c) + ")";
    }

    @Override // defpackage.yve
    public final defpackage.yve b() {
        return this;
    }
}
