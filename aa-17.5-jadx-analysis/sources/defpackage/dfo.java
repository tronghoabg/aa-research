package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dfo implements deq {
    public final String a;

    public /* synthetic */ dfo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dfo) && affa.f(this.a, ((dfo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ")";
    }
}
