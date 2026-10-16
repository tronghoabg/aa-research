package defpackage;

/* loaded from: classes3.dex */
public final class agpv {
    private final afhe<? extends agpu> klass;

    public agpv(afhe<? extends agpu> afheVar) {
        afheVar.getClass();
        this.klass = afheVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agpv) && affa.f(this.klass, ((agpv) obj).klass);
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    public String toString() {
        String name = affa.h(this.klass).getName();
        name.getClass();
        return name;
    }
}
