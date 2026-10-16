package defpackage;

/* loaded from: classes3.dex */
public final class aezq implements Comparable<aezq> {
    public final int a;
    private final int b;
    private final int c;

    public aezq(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.a = (i << 16) + (i2 << 8);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(aezq aezqVar) {
        aezqVar.getClass();
        return this.a - aezqVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        aezq aezqVar = obj instanceof aezq ? (aezq) obj : null;
        return aezqVar != null && this.a == aezqVar.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "." + this.c + ".0";
    }
}
