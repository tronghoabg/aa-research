package defpackage;

/* loaded from: classes.dex */
public final class jbq extends ebj implements Comparable {
    public final int a;
    public final int b;

    public jbq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        return r(obj);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    @Override // java.lang.Comparable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final int compareTo(jbq jbqVar) {
        return yde.b.c(this.a, jbqVar.a).c(this.b, jbqVar.b).a();
    }

    public final /* synthetic */ boolean r(Object obj) {
        if (!(obj instanceof jbq)) {
            return false;
        }
        jbq jbqVar = (jbq) obj;
        return this.a == jbqVar.a && this.b == jbqVar.b;
    }

    public final boolean s(jbq jbqVar) {
        return compareTo(jbqVar) >= 0;
    }

    public final boolean t(int i, int i2) {
        return s(new jbq(i, i2));
    }

    public final String toString() {
        return a.U(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, jbq.class);
    }
}
