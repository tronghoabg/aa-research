package defpackage;

@afdo
/* loaded from: classes.dex */
public final class afae implements Comparable<afae> {
    public final long a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(afae afaeVar) {
        return affa.c(this.a ^ Long.MIN_VALUE, afaeVar.a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afae) && this.a == ((afae) obj).a;
    }

    public final int hashCode() {
        return a.g(this.a);
    }

    public final String toString() {
        return woy.dD(this.a, 10);
    }
}
