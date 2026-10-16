package j$.util.concurrent;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class u implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentLinkedQueue.Node f50212a;

    /* renamed from: b, reason: collision with root package name */
    public Object f50213b;

    /* renamed from: c, reason: collision with root package name */
    public ConcurrentLinkedQueue.Node f50214c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ConcurrentLinkedQueue f50215d;

    public u(ConcurrentLinkedQueue concurrentLinkedQueue) {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node node2;
        this.f50215d = concurrentLinkedQueue;
        loop0: while (true) {
            node = concurrentLinkedQueue.head;
            node2 = node;
            while (true) {
                E e2 = node2.item;
                if (e2 != 0) {
                    this.f50212a = node2;
                    this.f50213b = e2;
                    break loop0;
                }
                ConcurrentLinkedQueue.Node node3 = node2.next;
                if (node3 == null) {
                    break loop0;
                } else if (node2 == node3) {
                    break;
                } else {
                    node2 = node3;
                }
            }
        }
        concurrentLinkedQueue.h(node, node2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f50213b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ConcurrentLinkedQueue.Node node = this.f50212a;
        if (node == null) {
            throw new NoSuchElementException();
        }
        this.f50214c = node;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f50215d;
        ConcurrentLinkedQueue.Node node2 = node.next;
        if (node == node2) {
            node2 = concurrentLinkedQueue.head;
        }
        Object obj = null;
        while (node2 != null) {
            obj = node2.item;
            if (obj != null) {
                break;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f50215d;
            ConcurrentLinkedQueue.Node node3 = node2.next;
            ConcurrentLinkedQueue.Node node4 = node2 == node3 ? concurrentLinkedQueue2.head : node3;
            if (node4 != null) {
                ConcurrentLinkedQueue.f50160d.a(node, node2, node4);
            }
            node2 = node4;
        }
        this.f50212a = node2;
        Object obj2 = this.f50213b;
        this.f50213b = obj;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ConcurrentLinkedQueue.Node node = this.f50214c;
        if (node == null) {
            throw new IllegalStateException();
        }
        node.item = null;
        this.f50214c = null;
    }
}
