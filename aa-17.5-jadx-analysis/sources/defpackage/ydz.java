package defpackage;

/* loaded from: classes3.dex */
final class ydz extends ynp {
    final /* synthetic */ Iterable[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydz(int i, Iterable[] iterableArr) {
        super(i, 0);
        this.a = iterableArr;
    }

    @Override // defpackage.ynp
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return this.a[i].iterator();
    }
}
