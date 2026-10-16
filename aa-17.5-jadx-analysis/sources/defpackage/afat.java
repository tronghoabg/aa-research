package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class afat<E> extends AbstractCollection<E> implements Collection<E>, afgd {
    protected afat() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
