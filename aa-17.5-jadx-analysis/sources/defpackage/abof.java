package defpackage;

import java.util.AbstractList;

/* loaded from: classes.dex */
public final class abof<T> extends AbstractList<T> {
    private final abod a;
    private final aboe b;

    public abof(abod abodVar, aboe aboeVar) {
        this.a = abodVar;
        this.b = aboeVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.b.a(this.a.e(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
