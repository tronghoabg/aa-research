package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentLinkedQueue<E> extends java.util.AbstractQueue<E> implements java.util.Queue<E>, java.io.Serializable, j$.util.Collection<E> {
    public static final j$.com.android.tools.r8.a a;
    public static final j$.com.android.tools.r8.a b;
    public static final j$.com.android.tools.r8.a c;
    public static final j$.com.android.tools.r8.a d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient j$.util.concurrent.ConcurrentLinkedQueue.Node<E> head;
    private volatile transient j$.util.concurrent.ConcurrentLinkedQueue.Node<E> tail;

    static {
        try {
            a = new j$.com.android.tools.r8.a(j$.util.concurrent.ConcurrentLinkedQueue.class, "head", j$.util.concurrent.ConcurrentLinkedQueue.Node.class);
            b = new j$.com.android.tools.r8.a(j$.util.concurrent.ConcurrentLinkedQueue.class, "tail", j$.util.concurrent.ConcurrentLinkedQueue.Node.class);
            c = new j$.com.android.tools.r8.a(j$.util.concurrent.ConcurrentLinkedQueue.Node.class, "item", java.lang.Object.class);
            d = new j$.com.android.tools.r8.a(j$.util.concurrent.ConcurrentLinkedQueue.Node.class, "next", j$.util.concurrent.ConcurrentLinkedQueue.Node.class);
        } catch (java.lang.ReflectiveOperationException e) {
            throw new java.lang.ExceptionInInitializerError(e);
        }
    }

    public ConcurrentLinkedQueue() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = new j$.util.concurrent.ConcurrentLinkedQueue.Node<>();
        this.tail = node;
        this.head = node;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = null;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2 = null;
        while (true) {
            java.lang.Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = new j$.util.concurrent.ConcurrentLinkedQueue.Node<>(object);
            if (node == null) {
                node = node3;
            } else {
                node2.getClass();
                d.b(node2, node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new j$.util.concurrent.ConcurrentLinkedQueue.Node<>();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeB = b();
        while (nodeB != null) {
            E e = nodeB.item;
            if (e != null) {
                objectOutputStream.writeObject(e);
            }
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = nodeB.next;
            nodeB = nodeB == node ? this.head : node;
        }
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:41:0x0054 A[SYNTHETIC] */
    public final boolean a(java.util.function.Predicate predicate) {
        boolean z = false;
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = this.head;
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2 = node;
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = null;
            int i = 8;
            while (node != null) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node4 = node.next;
                E e = node.item;
                boolean zA = true;
                boolean z2 = e != null;
                if (z2 && predicate.test(e)) {
                    if (c.a(node, e, null)) {
                        z = true;
                    }
                    z2 = false;
                }
                if (z2 || node4 == null || (i = i - 1) == 0) {
                    if (node2 != node) {
                        j$.com.android.tools.r8.a aVar = d;
                        if (node3 != null) {
                            zA = aVar.a(node3, node2, node);
                        } else if (a.a(this, node2, node)) {
                            aVar.c(node2, node2);
                        } else {
                            zA = false;
                        }
                        if (zA) {
                            node2 = node;
                            if (z2) {
                                node3 = node;
                                i = 8;
                                node2 = node4;
                            }
                        } else {
                            node3 = node;
                            i = 8;
                            node2 = node4;
                        }
                    } else if (z2) {
                        node3 = node;
                        i = 8;
                        node2 = node4;
                    }
                } else if (node == node4) {
                }
                node = node4;
            }
            return z;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e) {
        return offer(e);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node;
        if (collection == this) {
            throw new java.lang.IllegalArgumentException();
        }
        j$.util.concurrent.ConcurrentLinkedQueue.Node node2 = null;
        j$.util.concurrent.ConcurrentLinkedQueue.Node node3 = null;
        for (E e : collection) {
            e.getClass();
            j$.util.concurrent.ConcurrentLinkedQueue.Node node4 = new j$.util.concurrent.ConcurrentLinkedQueue.Node(e);
            if (node2 == null) {
                node2 = node4;
            } else {
                node3.getClass();
                d.b(node3, node4);
            }
            node3 = node4;
        }
        if (node2 == null) {
            return false;
        }
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node5 = this.tail;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node6 = node5;
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node7 = node5.next;
            if (node7 == null) {
                if (d.a(node5, null, node2)) {
                    break;
                }
            } else if (node5 == node7) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node8 = this.tail;
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node9 = node6 != node8 ? node8 : this.head;
                node6 = node8;
                node5 = node9;
            } else {
                if (node5 == node6) {
                    node = node6;
                } else {
                    node = this.tail;
                    if (node6 != node) {
                        node7 = node;
                    } else {
                        node6 = node;
                        node = node6;
                    }
                }
                node6 = node;
                node5 = node7;
            }
        }
        j$.com.android.tools.r8.a aVar = b;
        if (aVar.f(this, node6, node3)) {
            return true;
        }
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node10 = this.tail;
        if (node3.next != null) {
            return true;
        }
        aVar.f(this, node10, node3);
        return true;
    }

    public final j$.util.concurrent.ConcurrentLinkedQueue.Node b() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2;
        boolean z;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                z = node2.item != null;
                if (z || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        h(node, node2);
        if (z) {
            return node2;
        }
        return null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        a(new j$.desugar.sun.nio.fs.n((byte) 13));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = this.head;
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeE = null;
            while (node != null) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = node;
                    while (true) {
                        if (node2 == null || node2.item != null) {
                            nodeE = e(nodeE, node, node3, node2);
                        } else if (node3 != node2) {
                            node3 = node2;
                            node2 = node2.next;
                        }
                    }
                } else {
                    if (obj.equals(e)) {
                        return true;
                    }
                    nodeE = node;
                }
                node = node2;
            }
            return false;
        }
    }

    public final void d(java.util.function.Consumer consumer, j$.util.concurrent.ConcurrentLinkedQueue.Node node) {
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node node2 = null;
            while (node != null) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = node.next;
                E e = node.item;
                if (e != null) {
                    consumer.accept(e);
                } else {
                    j$.util.concurrent.ConcurrentLinkedQueue.Node node4 = node;
                    while (true) {
                        if (node3 == null || node3.item != null) {
                            node = e(node2, node, node4, node3);
                        } else if (node4 == node3) {
                            node = this.head;
                        } else {
                            node4 = node3;
                            node3 = node3.next;
                        }
                    }
                }
                node2 = node;
                node = node3;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:8:0x000a  */
    /* JADX WARN: Code duplicated, block: B:9:0x000f  */
    public final j$.util.concurrent.ConcurrentLinkedQueue.Node e(j$.util.concurrent.ConcurrentLinkedQueue.Node node, j$.util.concurrent.ConcurrentLinkedQueue.Node node2, j$.util.concurrent.ConcurrentLinkedQueue.Node node3, j$.util.concurrent.ConcurrentLinkedQueue.Node node4) {
        j$.com.android.tools.r8.a aVar;
        boolean zA;
        long j;
        sun.misc.Unsafe unsafe;
        java.lang.Class cls;
        java.lang.Object object;
        if (node4 != null) {
            aVar = d;
            if (node != null) {
                zA = aVar.a(node, node2, node4);
            } else if (a.a(this, node2, node4)) {
                aVar.c(node2, node2);
                zA = true;
            } else {
                zA = false;
            }
            if (zA) {
                if (node != null) {
                    j$.com.android.tools.r8.a aVar2 = c;
                    j = aVar2.b;
                    unsafe = j$.com.android.tools.r8.a.c;
                    cls = aVar2.a;
                    if (cls == java.lang.Integer.TYPE) {
                        object = java.lang.Integer.valueOf(unsafe.getInt(node, j));
                    } else if (cls == java.lang.Long.TYPE) {
                        object = java.lang.Long.valueOf(unsafe.getLong(node, j));
                    } else {
                        object = unsafe.getObject(node, j);
                    }
                    if (object != null) {
                    }
                }
            }
            return node3;
        }
        if (node2 != node3) {
            node4 = node3;
            aVar = d;
            if (node != null) {
                zA = aVar.a(node, node2, node4);
            } else if (a.a(this, node2, node4)) {
                aVar.c(node2, node2);
                zA = true;
            } else {
                zA = false;
            }
            if (zA) {
                if (node != null) {
                    j$.com.android.tools.r8.a aVar3 = c;
                    j = aVar3.b;
                    unsafe = j$.com.android.tools.r8.a.c;
                    cls = aVar3.a;
                    if (cls == java.lang.Integer.TYPE) {
                        object = java.lang.Integer.valueOf(unsafe.getInt(node, j));
                    } else if (cls == java.lang.Long.TYPE) {
                        object = java.lang.Long.valueOf(unsafe.getLong(node, j));
                    } else {
                        object = unsafe.getObject(node, j);
                    }
                    if (object != null) {
                    }
                }
            }
            return node3;
        }
        return node;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer consumer) {
        consumer.getClass();
        d(consumer, this.head);
    }

    public final java.lang.Object[] g(java.lang.Object[] objArr) {
        int i;
        java.lang.Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeB = b();
            i = 0;
            while (true) {
                if (nodeB == null) {
                    break loop0;
                }
                E e = nodeB.item;
                if (e != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new java.lang.Object[4];
                    } else if (i == objArrCopyOf.length) {
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, (i + 4) * 2);
                    }
                    objArrCopyOf[i] = e;
                    i++;
                }
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (objArrCopyOf == null) {
            return new java.lang.Object[0];
        }
        if (objArr == null || i > objArr.length) {
            return i == objArrCopyOf.length ? objArrCopyOf : java.util.Arrays.copyOf(objArrCopyOf, i);
        }
        if (objArr != objArrCopyOf) {
            java.lang.System.arraycopy(objArrCopyOf, 0, objArr, 0, i);
        }
        if (i < objArr.length) {
            objArr[i] = null;
        }
        return objArr;
    }

    public final void h(j$.util.concurrent.ConcurrentLinkedQueue.Node node, j$.util.concurrent.ConcurrentLinkedQueue.Node node2) {
        if (node == node2 || !a.a(this, node, node2)) {
            return;
        }
        d.c(node, node);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new j$.util.concurrent.u(this);
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node;
        e.getClass();
        j$.util.concurrent.ConcurrentLinkedQueue.Node node2 = new j$.util.concurrent.ConcurrentLinkedQueue.Node(e);
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = this.tail;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node4 = node3;
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node5 = node3.next;
            if (node5 == null) {
                if (d.a(node3, null, node2)) {
                    break;
                }
            } else if (node3 == node5) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node6 = this.tail;
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node7 = node4 != node6 ? node6 : this.head;
                node4 = node6;
                node3 = node7;
            } else {
                if (node3 == node4) {
                    node = node4;
                } else {
                    node = this.tail;
                    if (node4 != node) {
                        node5 = node;
                    } else {
                        node4 = node;
                        node = node4;
                    }
                }
                node4 = node;
                node3 = node5;
            }
        }
        if (node3 == node4) {
            return true;
        }
        b.f(this, node4, node2);
        return true;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Queue
    public final java.lang.Object peek() {
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2;
        E e;
        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                e = node2.item;
                if (e != null || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        h(node, node2);
        return e;
    }

    @Override // java.util.Queue
    public E poll() {
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = this.head;
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2 = node;
            while (true) {
                E e = node2.item;
                if (e != null && c.a(node2, e, null)) {
                    if (node2 != node) {
                        j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = node2.next;
                        if (node3 != null) {
                            node2 = node3;
                        }
                        h(node, node2);
                    }
                    return e;
                }
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node4 = node2.next;
                if (node4 == null) {
                    h(node, node2);
                    return null;
                }
                if (node2 == node4) {
                    break;
                }
                node2 = node4;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = this.head;
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeE = null;
            while (node != null) {
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node2 = node.next;
                E e = node.item;
                if (e == null) {
                    j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node3 = node;
                    while (true) {
                        if (node2 == null || node2.item != null) {
                            nodeE = e(nodeE, node, node3, node2);
                        } else if (node3 != node2) {
                            node3 = node2;
                            node2 = node2.next;
                        }
                    }
                } else {
                    if (obj.equals(e) && c.a(node, e, null)) {
                        e(nodeE, node, node, node2);
                        return true;
                    }
                    nodeE = node;
                }
                node = node2;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        return a(new j$.util.concurrent.s(collection, (byte) 1));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        predicate.getClass();
        return a(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        collection.getClass();
        return a(new j$.util.concurrent.s(collection, (byte) 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeB = b();
            int i = 0;
            while (nodeB != null) {
                if (nodeB.item != null && (i = i + 1) == Integer.MAX_VALUE) {
                    return i;
                }
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = nodeB.next;
                if (nodeB != node) {
                    nodeB = node;
                }
            }
            return i;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final j$.util.Spliterator spliterator() {
        return new j$.util.concurrent.t(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        return g(objArr);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        int i;
        int length;
        java.lang.String[] strArr = null;
        loop0: while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue.Node<E> nodeB = b();
            i = 0;
            length = 0;
            while (true) {
                if (nodeB == null) {
                    break loop0;
                }
                E e = nodeB.item;
                if (e != null) {
                    if (strArr == null) {
                        strArr = new java.lang.String[4];
                    } else if (i == strArr.length) {
                        strArr = (java.lang.String[]) java.util.Arrays.copyOf(strArr, i * 2);
                    }
                    java.lang.String string = e.toString();
                    strArr[i] = string;
                    length += string.length();
                    i++;
                }
                j$.util.concurrent.ConcurrentLinkedQueue.Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (i == 0) {
            return "[]";
        }
        char[] cArr = new char[(i * 2) + length];
        cArr[0] = '[';
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                int i4 = i2 + 1;
                cArr[i2] = ',';
                i2 += 2;
                cArr[i4] = ' ';
            }
            java.lang.String str = strArr[i3];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i2);
            i2 += length2;
        }
        cArr[i2] = ']';
        return new java.lang.String(cArr);
    }

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public static final class Node<E> {
        volatile E item;
        volatile j$.util.concurrent.ConcurrentLinkedQueue.Node<E> next;

        public Node(java.lang.Object obj) {
            j$.util.concurrent.ConcurrentLinkedQueue.c.b(this, obj);
        }

        public Node() {
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return g(null);
    }
}
