package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class afbi<T> implements Iterable<afbh<? extends T>>, afgc {
    private final afdr a;

    public afbi(afdr afdrVar) {
        this.a = afdrVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<afbh<T>> iterator() {
        return new afbj((Iterator) this.a.invoke());
    }
}
