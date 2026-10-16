package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s7 implements Spliterator, Consumer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f50610d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Spliterator f50611a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f50612b;

    /* renamed from: c, reason: collision with root package name */
    public Object f50613c;

    public s7(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f50611a = spliterator;
        this.f50612b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        this.f50613c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f50611a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50611a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f50611a.forEachRemaining(new j$.nio.file.z(9, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f50611a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i2) {
        return j$.com.android.tools.r8.a.n(this, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f50611a.tryAdvance(this)) {
            Object obj = this.f50613c;
            if (obj == null) {
                obj = f50610d;
            }
            if (this.f50612b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.u(this.f50613c);
                this.f50613c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f50611a.trySplit();
        if (spliteratorTrySplit != null) {
            return new s7(spliteratorTrySplit, this.f50612b);
        }
        return null;
    }
}
