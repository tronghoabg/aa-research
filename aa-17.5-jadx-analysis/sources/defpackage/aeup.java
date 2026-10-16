package defpackage;

import j$.util.Set;
import j$.util.Spliterator;
import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class aeup extends aetx implements Serializable, Set, aeum {
    private static final long serialVersionUID = -7046029254386353129L;

    public aeup(aeum aeumVar) {
        super(aeumVar);
    }

    @Override // defpackage.aetx, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return this.a.equals(obj);
    }

    @Override // defpackage.aetx, java.util.Collection
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.aetx, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // defpackage.aetx, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.aetx, j$.util.Collection, java.lang.Iterable, j$.lang.a
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return super.spliterator();
    }
}
