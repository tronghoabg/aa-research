package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class aexr implements Iterator, aeyu {
    protected aexr() {
    }

    @Override // defpackage.aeyu
    public /* synthetic */ Short a() {
        throw null;
    }

    @Override // defpackage.aeyu
    public /* synthetic */ void b(aeys aeysVar) {
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        b((aeys) obj);
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return a();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        adqs.P(this, consumer);
    }
}
