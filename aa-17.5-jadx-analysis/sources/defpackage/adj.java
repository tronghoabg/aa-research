package defpackage;

/* loaded from: classes.dex */
public final class adj {
    public final afec a;
    public final aew b;

    public adj(afec afecVar, aew aewVar) {
        this.a = afecVar;
        this.b = aewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adj)) {
            return false;
        }
        adj adjVar = (adj) obj;
        return this.a == adjVar.a && affa.f(this.b, adjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlideConfig(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
