package j$.util.concurrent;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Comparator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class t implements Spliterator {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentLinkedQueue.Node f50208a;

    /* renamed from: b, reason: collision with root package name */
    public int f50209b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50210c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConcurrentLinkedQueue f50211d;

    public t(ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f50211d = concurrentLinkedQueue;
    }

    public final ConcurrentLinkedQueue.Node a() {
        ConcurrentLinkedQueue.Node nodeB = this.f50208a;
        if (nodeB == null && !this.f50210c) {
            nodeB = this.f50211d.b();
            this.f50208a = nodeB;
            if (nodeB == null) {
                this.f50210c = true;
            }
        }
        return nodeB;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4368;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return Long.MAX_VALUE;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null) {
            this.f50208a = null;
            this.f50210c = true;
            this.f50211d.c(consumer, nodeA);
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
        E e2;
        Objects.requireNonNull(consumer);
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA == null) {
            return false;
        }
        do {
            e2 = nodeA.item;
            ConcurrentLinkedQueue.Node node = nodeA.next;
            nodeA = nodeA == node ? this.f50211d.b() : node;
            if (e2 != 0) {
                break;
            }
        } while (nodeA != null);
        this.f50208a = nodeA;
        if (nodeA == null) {
            this.f50210c = true;
        }
        if (e2 == 0) {
            return false;
        }
        consumer.u(e2);
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node nodeA = a();
        if (nodeA != null && (node = nodeA.next) != null) {
            int iMin = Math.min(this.f50209b + 1, GroupFlagsKt.HasAuxSlotFlag);
            this.f50209b = iMin;
            Object[] objArr = null;
            int i2 = 0;
            do {
                Object obj = nodeA.item;
                if (obj != null) {
                    if (objArr == null) {
                        objArr = new Object[iMin];
                    }
                    objArr[i2] = obj;
                    i2++;
                }
                nodeA = nodeA == node ? this.f50211d.b() : node;
                if (nodeA == null || (node = nodeA.next) == null) {
                    break;
                }
            } while (i2 < iMin);
            this.f50208a = nodeA;
            if (nodeA == null) {
                this.f50210c = true;
            }
            if (i2 != 0) {
                return Spliterators.b(objArr, 0, i2, 4368);
            }
        }
        return null;
    }
}
