package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class d1 implements Iterator, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public boolean f50218a = false;

    /* renamed from: b, reason: collision with root package name */
    public Object f50219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f50220c;

    public d1(Spliterator spliterator) {
        this.f50220c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f50218a = true;
        this.f50219b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f50218a) {
            this.f50220c.tryAdvance(this);
        }
        return this.f50218a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f50218a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f50218a = false;
        return this.f50219b;
    }
}
