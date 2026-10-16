package defpackage;

@afdo
/* loaded from: classes.dex */
public final class afaa implements Comparable<afaa> {
    public final byte a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(afaa afaaVar) {
        return affa.b(this.a & 255, afaaVar.a & 255);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afaa) && this.a == ((afaa) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
