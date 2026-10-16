package j$.util.concurrent;

import androidx.media3.extractor.text.ttml.TtmlNode;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class ConcurrentLinkedQueue<E> extends AbstractQueue<E> implements Queue<E>, Serializable, Collection<E> {

    /* renamed from: a, reason: collision with root package name */
    public static final j$.com.android.tools.r8.b f50157a;

    /* renamed from: b, reason: collision with root package name */
    public static final j$.com.android.tools.r8.b f50158b;

    /* renamed from: c, reason: collision with root package name */
    public static final j$.com.android.tools.r8.b f50159c;

    /* renamed from: d, reason: collision with root package name */
    public static final j$.com.android.tools.r8.b f50160d;
    private static final long serialVersionUID = 196745693267521676L;
    volatile transient Node<E> head;
    private volatile transient Node<E> tail;

    static {
        try {
            Class<ConcurrentLinkedQueue> cls = ConcurrentLinkedQueue.class;
            Class<Node> cls2 = Node.class;
            f50157a = new j$.com.android.tools.r8.b(cls, TtmlNode.TAG_HEAD, cls2);
            f50158b = new j$.com.android.tools.r8.b(cls, "tail", cls2);
            f50159c = new j$.com.android.tools.r8.b(cls2, "item", Object.class);
            f50160d = new j$.com.android.tools.r8.b(cls2, "next", cls2);
        } catch (ReflectiveOperationException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public ConcurrentLinkedQueue() {
        Node<E> node = new Node<>();
        this.tail = node;
        this.head = node;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Node<E> node = null;
        Node<E> node2 = null;
        while (true) {
            Object object = objectInputStream.readObject();
            if (object == null) {
                break;
            }
            Node<E> node3 = new Node<>(object);
            if (node == null) {
                node = node3;
            } else {
                node2.getClass();
                f50160d.b(node2, node3);
            }
            node2 = node3;
        }
        if (node == null) {
            node = new Node<>();
            node2 = node;
        }
        this.head = node;
        this.tail = node2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Node<E> nodeB = b();
        while (nodeB != null) {
            E e2 = nodeB.item;
            if (e2 != null) {
                objectOutputStream.writeObject(e2);
            }
            Node<E> node = nodeB.next;
            nodeB = nodeB == node ? this.head : node;
        }
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0054 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.function.Predicate r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = r0
        L2:
            j$.util.concurrent.ConcurrentLinkedQueue$Node<E> r2 = r13.head
            r3 = 0
            r4 = 8
            r5 = r2
            r7 = r3
            r6 = r4
        La:
            if (r2 == 0) goto L56
            j$.util.concurrent.ConcurrentLinkedQueue$Node<E> r8 = r2.next
            E r9 = r2.item
            r10 = 1
            if (r9 == 0) goto L15
            r11 = r10
            goto L16
        L15:
            r11 = r0
        L16:
            if (r11 == 0) goto L28
            boolean r12 = r14.test(r9)
            if (r12 == 0) goto L28
            j$.com.android.tools.r8.b r11 = j$.util.concurrent.ConcurrentLinkedQueue.f50159c
            boolean r9 = r11.a(r2, r9, r3)
            if (r9 == 0) goto L27
            r1 = r10
        L27:
            r11 = r0
        L28:
            if (r11 != 0) goto L34
            if (r8 == 0) goto L34
            int r6 = r6 + (-1)
            if (r6 != 0) goto L31
            goto L34
        L31:
            if (r2 != r8) goto L54
            goto L2
        L34:
            if (r5 == r2) goto L4f
            j$.com.android.tools.r8.b r9 = j$.util.concurrent.ConcurrentLinkedQueue.f50160d
            if (r7 == 0) goto L3f
            boolean r10 = r9.a(r7, r5, r2)
            goto L4c
        L3f:
            j$.com.android.tools.r8.b r12 = j$.util.concurrent.ConcurrentLinkedQueue.f50157a
            boolean r12 = r12.a(r13, r5, r2)
            if (r12 == 0) goto L4b
            r9.c(r5, r5)
            goto L4c
        L4b:
            r10 = r0
        L4c:
            if (r10 == 0) goto L51
            r5 = r2
        L4f:
            if (r11 == 0) goto L54
        L51:
            r7 = r2
            r6 = r4
            r5 = r8
        L54:
            r2 = r8
            goto La
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentLinkedQueue.a(java.util.function.Predicate):boolean");
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e2) {
        return offer(e2);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        Node<E> node;
        if (collection == this) {
            throw new IllegalArgumentException();
        }
        Iterator<E> it = collection.iterator();
        Node node2 = null;
        Node node3 = null;
        while (it.hasNext()) {
            Node node4 = new Node(Objects.requireNonNull(it.next()));
            if (node2 == null) {
                node2 = node4;
            } else {
                node3.getClass();
                f50160d.b(node3, node4);
            }
            node3 = node4;
        }
        if (node2 == null) {
            return false;
        }
        Node<E> node5 = this.tail;
        Node<E> node6 = node5;
        while (true) {
            Node<E> node7 = node5.next;
            if (node7 == null) {
                if (f50160d.a(node5, null, node2)) {
                    break;
                }
            } else if (node5 == node7) {
                Node<E> node8 = this.tail;
                Node<E> node9 = node6 != node8 ? node8 : this.head;
                node6 = node8;
                node5 = node9;
            } else if (node5 == node6) {
                node = node6;
                node6 = node;
                node5 = node7;
            } else {
                node = this.tail;
                if (node6 != node) {
                    node7 = node;
                    node6 = node;
                    node5 = node7;
                } else {
                    node6 = node;
                    node = node6;
                    node6 = node;
                    node5 = node7;
                }
            }
        }
        j$.com.android.tools.r8.b bVar = f50158b;
        if (bVar.f(this, node6, node3)) {
            return true;
        }
        Node<E> node10 = this.tail;
        if (node3.next != null) {
            return true;
        }
        bVar.f(this, node10, node3);
        return true;
    }

    public final Node b() {
        Node<E> node;
        Node<E> node2;
        boolean z;
        Node<E> node3;
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

    public final void c(Consumer consumer, Node node) {
        while (true) {
            Node node2 = null;
            while (node != null) {
                Node<E> node3 = node.next;
                E e2 = node.item;
                if (e2 != null) {
                    consumer.accept(e2);
                } else {
                    Node node4 = node;
                    while (node3 != null && node3.item == null) {
                        if (node4 == node3) {
                            break;
                        }
                        node4 = node3;
                        node3 = node3.next;
                    }
                    node = d(node2, node, node4, node3);
                }
                node2 = node;
                node = node3;
            }
            return;
            node = this.head;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        a(new j$.desugar.sun.nio.fs.n(11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeD = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e2 = node.item;
                if (e2 == null) {
                    Node<E> node3 = node;
                    while (node2 != null && node2.item == null) {
                        if (node3 == node2) {
                            break;
                        }
                        node3 = node2;
                        node2 = node2.next;
                    }
                    nodeD = d(nodeD, node, node3, node2);
                } else {
                    if (obj.equals(e2)) {
                        return true;
                    }
                    nodeD = node;
                }
                node = node2;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.ConcurrentLinkedQueue.Node d(j$.util.concurrent.ConcurrentLinkedQueue.Node r3, j$.util.concurrent.ConcurrentLinkedQueue.Node r4, j$.util.concurrent.ConcurrentLinkedQueue.Node r5, j$.util.concurrent.ConcurrentLinkedQueue.Node r6) {
        /*
            r2 = this;
            if (r6 != 0) goto L6
            if (r4 != r5) goto L5
            goto L49
        L5:
            r6 = r5
        L6:
            j$.com.android.tools.r8.b r0 = j$.util.concurrent.ConcurrentLinkedQueue.f50160d
            if (r3 == 0) goto Lf
            boolean r2 = r0.a(r3, r4, r6)
            goto L1d
        Lf:
            j$.com.android.tools.r8.b r1 = j$.util.concurrent.ConcurrentLinkedQueue.f50157a
            boolean r2 = r1.a(r2, r4, r6)
            if (r2 == 0) goto L1c
            r0.c(r4, r4)
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            if (r2 == 0) goto L4a
            if (r3 == 0) goto L49
            j$.com.android.tools.r8.b r2 = j$.util.concurrent.ConcurrentLinkedQueue.f50159c
            long r0 = r2.f49642b
            sun.misc.Unsafe r4 = j$.com.android.tools.r8.b.f49640c
            java.lang.Class r2 = r2.f49641a
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r2 != r6) goto L36
            int r2 = r4.getInt(r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L47
        L36:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r2 != r6) goto L43
            long r0 = r4.getLong(r3, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            goto L47
        L43:
            java.lang.Object r2 = r4.getObject(r3, r0)
        L47:
            if (r2 == 0) goto L4a
        L49:
            return r3
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentLinkedQueue.d(j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node, j$.util.concurrent.ConcurrentLinkedQueue$Node):j$.util.concurrent.ConcurrentLinkedQueue$Node");
    }

    public final Object[] f(Object[] objArr) {
        int i2;
        Object[] objArrCopyOf = objArr;
        loop0: while (true) {
            Node<E> nodeB = b();
            i2 = 0;
            while (nodeB != null) {
                E e2 = nodeB.item;
                if (e2 != null) {
                    if (objArrCopyOf == null) {
                        objArrCopyOf = new Object[4];
                    } else if (i2 == objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, (i2 + 4) * 2);
                    }
                    objArrCopyOf[i2] = e2;
                    i2++;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (objArrCopyOf == null) {
            return new Object[0];
        }
        if (objArr == null || i2 > objArr.length) {
            return i2 == objArrCopyOf.length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i2);
        }
        if (objArr != objArrCopyOf) {
            System.arraycopy(objArrCopyOf, 0, objArr, 0, i2);
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        c(consumer, this.head);
    }

    public final void h(Node node, Node node2) {
        if (node == node2 || !f50157a.a(this, node, node2)) {
            return;
        }
        f50160d.c(node, node);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return b() == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new u(this);
    }

    @Override // java.util.Queue
    public boolean offer(E e2) {
        Node<E> node;
        Node node2 = new Node(Objects.requireNonNull(e2));
        Node<E> node3 = this.tail;
        Node<E> node4 = node3;
        while (true) {
            Node<E> node5 = node3.next;
            if (node5 == null) {
                if (f50160d.a(node3, null, node2)) {
                    break;
                }
            } else if (node3 == node5) {
                Node<E> node6 = this.tail;
                Node<E> node7 = node4 != node6 ? node6 : this.head;
                node4 = node6;
                node3 = node7;
            } else if (node3 == node4) {
                node = node4;
                node4 = node;
                node3 = node5;
            } else {
                node = this.tail;
                if (node4 != node) {
                    node5 = node;
                    node4 = node;
                    node3 = node5;
                } else {
                    node4 = node;
                    node = node4;
                    node4 = node;
                    node3 = node5;
                }
            }
        }
        if (node3 == node4) {
            return true;
        }
        f50158b.f(this, node4, node2);
        return true;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Queue
    public final Object peek() {
        Node<E> node;
        Node<E> node2;
        E e2;
        Node<E> node3;
        loop0: while (true) {
            node = this.head;
            node2 = node;
            while (true) {
                e2 = node2.item;
                if (e2 != null || (node3 = node2.next) == null) {
                    break loop0;
                }
                if (node2 == node3) {
                    break;
                }
                node2 = node3;
            }
        }
        h(node, node2);
        return e2;
    }

    @Override // java.util.Queue
    public E poll() {
        while (true) {
            Node<E> node = this.head;
            Node<E> node2 = node;
            while (true) {
                E e2 = node2.item;
                if (e2 != null && f50159c.a(node2, e2, null)) {
                    if (node2 != node) {
                        Node<E> node3 = node2.next;
                        if (node3 != null) {
                            node2 = node3;
                        }
                        h(node, node2);
                    }
                    return e2;
                }
                Node<E> node4 = node2.next;
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
    public boolean remove(Object obj) {
        if (obj == null) {
            return false;
        }
        while (true) {
            Node<E> node = this.head;
            Node<E> nodeD = null;
            while (node != null) {
                Node<E> node2 = node.next;
                E e2 = node.item;
                if (e2 == null) {
                    Node<E> node3 = node;
                    while (node2 != null && node2.item == null) {
                        if (node3 == node2) {
                            break;
                        }
                        node3 = node2;
                        node2 = node2.next;
                    }
                    nodeD = d(nodeD, node, node3, node2);
                } else {
                    if (obj.equals(e2) && f50159c.a(node, e2, null)) {
                        d(nodeD, node, node, node2);
                        return true;
                    }
                    nodeD = node;
                }
                node = node2;
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        Objects.requireNonNull(collection);
        return a(new s(collection, 1));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return a(predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        Objects.requireNonNull(collection);
        return a(new s(collection, 0));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        while (true) {
            Node<E> nodeB = b();
            int i2 = 0;
            while (nodeB != null) {
                if (nodeB.item != null && (i2 = i2 + 1) == Integer.MAX_VALUE) {
                    return i2;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
            return i2;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final Spliterator spliterator() {
        return new t(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        return f(objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i2;
        int length;
        String[] strArr = null;
        loop0: while (true) {
            Node<E> nodeB = b();
            i2 = 0;
            length = 0;
            while (nodeB != null) {
                E e2 = nodeB.item;
                if (e2 != null) {
                    if (strArr == null) {
                        strArr = new String[4];
                    } else if (i2 == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, i2 * 2);
                    }
                    String string = e2.toString();
                    strArr[i2] = string;
                    length += string.length();
                    i2++;
                }
                Node<E> node = nodeB.next;
                if (nodeB == node) {
                    break;
                }
                nodeB = node;
            }
        }
        if (i2 == 0) {
            return "[]";
        }
        char[] cArr = new char[(i2 * 2) + length];
        cArr[0] = '[';
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 > 0) {
                int i5 = i3 + 1;
                cArr[i3] = ',';
                i3 += 2;
                cArr[i5] = ' ';
            }
            String str = strArr[i4];
            int length2 = str.length();
            str.getChars(0, length2, cArr, i3);
            i3 += length2;
        }
        cArr[i3] = ']';
        return new String(cArr);
    }

    /* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
    public static final class Node<E> {
        volatile E item;
        volatile Node<E> next;

        public Node(Object obj) {
            ConcurrentLinkedQueue.f50159c.b(this, obj);
        }

        public Node() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return f(null);
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
