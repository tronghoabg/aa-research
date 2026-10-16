package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bak {
    public final java.util.List a;
    public final java.util.List[] b;
    public int c;
    public int d;
    public boolean e;
    final /* synthetic */ defpackage.bal f;

    public bak(defpackage.bal balVar, java.util.List list) {
        this.f = balVar;
        this.a = list;
        this.b = new java.util.List[list.size()];
        if (list.isEmpty()) {
            defpackage.asq.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
