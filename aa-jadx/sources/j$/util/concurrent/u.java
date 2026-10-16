package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements java.util.Iterator {
    public j$.util.concurrent.ConcurrentLinkedQueue.Node a;
    public java.lang.Object b;
    public j$.util.concurrent.ConcurrentLinkedQueue.Node c;
    public final /* synthetic */ j$.util.concurrent.ConcurrentLinkedQueue d;

    public u(j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        j$.util.concurrent.ConcurrentLinkedQueue.Node node;
        j$.util.concurrent.ConcurrentLinkedQueue.Node node2;
        this.d = concurrentLinkedQueue;
        loop0: while (true) {
            node = concurrentLinkedQueue.head;
            node2 = node;
            while (true) {
                E e = node2.item;
                if (e != 0) {
                    this.a = node2;
                    this.b = e;
                    break loop0;
                }
                j$.util.concurrent.ConcurrentLinkedQueue.Node node3 = node2.next;
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
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node node = this.a;
        if (node == null) {
            throw new java.util.NoSuchElementException();
        }
        this.c = node;
        j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        j$.util.concurrent.ConcurrentLinkedQueue.Node node2 = node.next;
        if (node == node2) {
            node2 = concurrentLinkedQueue.head;
        }
        java.lang.Object obj = null;
        while (node2 != null) {
            obj = node2.item;
            if (obj != null) {
                break;
            }
            j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = this.d;
            j$.util.concurrent.ConcurrentLinkedQueue.Node node3 = node2.next;
            j$.util.concurrent.ConcurrentLinkedQueue.Node node4 = node2 == node3 ? concurrentLinkedQueue2.head : node3;
            if (node4 != null) {
                j$.util.concurrent.ConcurrentLinkedQueue.d.a(node, node2, node4);
            }
            node2 = node4;
        }
        this.a = node2;
        java.lang.Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node node = this.c;
        if (node == null) {
            throw new java.lang.IllegalStateException();
        }
        node.item = null;
        this.c = null;
    }
}
