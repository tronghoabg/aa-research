package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class ymy<V> extends ymz<Collection<V>> {
    private static final long serialVersionUID = 0;

    @Override // defpackage.ymz, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new ymx(this, super.iterator());
    }
}
