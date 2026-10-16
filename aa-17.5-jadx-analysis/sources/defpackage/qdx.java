package defpackage;

/* loaded from: classes2.dex */
public final class qdx implements Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        qdx qdxVar = (qdx) obj;
        int i = this.b;
        int i2 = qdxVar.b;
        return i != i2 ? i - i2 : this.a - qdxVar.a;
    }

    public final String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + "}";
    }
}
