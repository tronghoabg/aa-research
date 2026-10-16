package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
final class f0 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    boolean f37874a = false;

    /* renamed from: b, reason: collision with root package name */
    Object f37875b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Spliterator f37876c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    f0(Spliterator spliterator) {
        this.f37876c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f37874a = true;
        this.f37875b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f37874a) {
            this.f37876c.tryAdvance(this);
        }
        return this.f37874a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f37874a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f37874a = false;
        return this.f37875b;
    }
}
