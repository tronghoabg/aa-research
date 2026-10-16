package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qeu implements java.lang.Comparable {
    public int a;
    public int b;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.qeu qeuVar = (defpackage.qeu) obj;
        int i = this.b;
        int i2 = qeuVar.b;
        return i != i2 ? i - i2 : this.a - qeuVar.a;
    }

    public final java.lang.String toString() {
        return "Order{order=" + this.b + ", index=" + this.a + "}";
    }
}
