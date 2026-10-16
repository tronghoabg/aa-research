package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class yen<E> extends yec<E> implements Set<E> {
    protected yen() {
    }

    @Override // defpackage.yec
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    protected abstract Set c();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return obj == this || c().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return c().hashCode();
    }
}
