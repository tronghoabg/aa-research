package defpackage;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public final class abqr extends abql implements Set, j$.util.Set, afgc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abqr(Collection collection) {
        super(collection);
        collection.getClass();
    }

    @Override // defpackage.abql, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this, 1);
    }
}
