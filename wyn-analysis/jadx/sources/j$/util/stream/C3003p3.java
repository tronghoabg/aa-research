package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3003p3 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f38281d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Spliterator f38282a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f38283b;

    /* renamed from: c, reason: collision with root package name */
    private Object f38284c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.S.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i5) {
        return j$.util.S.e(this, i5);
    }

    C3003p3(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    private C3003p3(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f38282a = spliterator;
        this.f38283b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        this.f38284c = obj;
    }

    final void b(Consumer consumer, Object obj) {
        if (this.f38283b.putIfAbsent(obj != null ? obj : f38281d, Boolean.TRUE) == null) {
            consumer.p(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f38282a.tryAdvance(this)) {
            Object obj = this.f38284c;
            if (obj == null) {
                obj = f38281d;
            }
            if (this.f38283b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.p(this.f38284c);
                this.f38284c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f38282a.forEachRemaining(new C3000p0(2, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f38282a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C3003p3(spliteratorTrySplit, this.f38283b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f38282a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f38282a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f38282a.getComparator();
    }
}
