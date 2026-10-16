package defpackage;

/* loaded from: classes.dex */
public final class bvx implements cfd {
    private final bva a;

    public bvx(bva bvaVar) {
        this.a = bvaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bvx) && affa.f(this.a, ((bvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
