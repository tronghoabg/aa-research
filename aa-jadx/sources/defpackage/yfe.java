package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yfe extends defpackage.yfh {
    final /* synthetic */ java.lang.Iterable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfe(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        super(iterable);
        this.a = iterable2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.iterator();
    }
}
