package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class f extends o implements Spliterator {

    /* renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f50171i;

    /* renamed from: j, reason: collision with root package name */
    public long f50172j;

    public f(k[] kVarArr, int i2, int i3, int i4, long j2, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i2, i3, i4);
        this.f50171i = concurrentHashMap;
        this.f50172j = j2;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f50172j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            k kVarA = a();
            if (kVarA == null) {
                return;
            } else {
                consumer.u(new j(kVarA.f50181b, kVarA.f50182c, this.f50171i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
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
        consumer.getClass();
        k kVarA = a();
        if (kVarA == null) {
            return false;
        }
        consumer.u(new j(kVarA.f50181b, kVarA.f50182c, this.f50171i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i2 = this.f50193f;
        int i3 = this.f50194g;
        int i4 = (i2 + i3) >>> 1;
        if (i4 <= i2) {
            return null;
        }
        k[] kVarArr = this.f50188a;
        this.f50194g = i4;
        long j2 = this.f50172j >>> 1;
        this.f50172j = j2;
        return new f(kVarArr, this.f50195h, i4, i3, j2, this.f50171i);
    }
}
