package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zfs implements java.lang.Comparable {
    public final java.lang.Object a;
    final int b;
    public final java.util.List c = new java.util.ArrayList();
    public int d;

    public zfs(java.lang.Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.b, ((defpackage.zfs) obj).b);
    }
}
