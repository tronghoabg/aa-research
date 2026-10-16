package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abru extends defpackage.abro implements java.util.Set, j$.util.Set, defpackage.afhc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abru(java.util.Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.abro, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Spliterators.spliterator(this, 1);
    }
}
