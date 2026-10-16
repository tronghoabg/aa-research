package defpackage;

import j$.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public abstract class aeeh implements Iterator, aefl {
    protected aeeh() {
    }

    @Override // defpackage.aefl
    public /* synthetic */ Byte a() {
        throw null;
    }

    @Override // defpackage.aefl
    public /* synthetic */ void b(aefj aefjVar) {
        throw null;
    }

    @Override // j$.util.PrimitiveIterator
    public /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        b((aefj) obj);
    }

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return a();
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        aeec.o(this, consumer);
    }
}
