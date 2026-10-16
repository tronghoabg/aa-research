package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yff extends defpackage.you {
    final /* synthetic */ java.lang.Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yff(int i, java.lang.Iterable[] iterableArr) {
        super(i, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.you
    public final /* bridge */ /* synthetic */ java.lang.Object a(int i) {
        return this.a[i].iterator();
    }
}
