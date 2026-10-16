package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yod<V> extends defpackage.yoe<java.util.Collection<V>> {
    private static final long serialVersionUID = 0;

    @Override // defpackage.yoe, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<java.util.Collection<V>> iterator() {
        return new defpackage.yoc(this, super.iterator());
    }
}
