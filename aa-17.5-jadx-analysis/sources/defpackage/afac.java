package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class afac implements Comparable<afac> {
    public final int a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(afac afacVar) {
        return affa.b(this.a ^ Integer.MIN_VALUE, afacVar.a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afac) && this.a == ((afac) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 4294967295L);
    }
}
