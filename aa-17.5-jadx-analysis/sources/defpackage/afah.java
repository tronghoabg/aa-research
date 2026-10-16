package defpackage;

@afdo
/* loaded from: classes.dex */
public final class afah implements Comparable<afah> {
    public final short a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(afah afahVar) {
        return affa.b((char) this.a, (char) afahVar.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afah) && this.a == ((afah) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf((int) ((char) this.a));
    }
}
