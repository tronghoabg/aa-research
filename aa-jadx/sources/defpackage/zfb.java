package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class zfb extends defpackage.yms {
    final /* synthetic */ java.util.Comparator a;
    final /* synthetic */ java.util.Map b;

    public zfb(java.util.Comparator comparator, java.util.Map map) {
        this.a = comparator;
        this.b = map;
    }

    @Override // defpackage.yms, java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Map map = this.b;
        java.lang.Object obj3 = map.get(obj);
        obj3.getClass();
        java.lang.Object obj4 = map.get(obj2);
        obj4.getClass();
        return this.a.compare(obj3, obj4);
    }
}
