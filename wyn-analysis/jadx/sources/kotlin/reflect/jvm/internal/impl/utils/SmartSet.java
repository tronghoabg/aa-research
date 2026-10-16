package kotlin.reflect.jvm.internal.impl.utils;

import ff.m;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class SmartSet<T> extends AbstractSet<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Object data;
    private int size;

    public static final class ArrayIterator<T> implements Iterator<T>, InterfaceC4291a {

        @NotNull
        private final Iterator<T> arrayIterator;

        public ArrayIterator(@NotNull T[] array) {
            AbstractC3340k.e(array, "array");
            this.arrayIterator = AbstractC3340k.i(array);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.arrayIterator.next();
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }

        private Companion() {
        }

        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> set) {
            AbstractC3340k.e(set, "set");
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(set);
            return smartSet;
        }
    }

    public static final class SingletonIterator<T> implements Iterator<T>, InterfaceC4291a {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t10) {
            this.element = t10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
            return this.element;
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (kotlin.jvm.internal.K.d(r1).add(r5) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean add(T r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = r4.size()
            r2 = 1
            if (r1 != 0) goto Lc
            r4.data = r5
            goto L87
        Lc:
            int r1 = r4.size()
            if (r1 != r2) goto L27
            java.lang.Object r1 = r4.data
            boolean r1 = kotlin.jvm.internal.AbstractC3340k.a(r1, r5)
            if (r1 == 0) goto L1b
            goto L86
        L1b:
            java.lang.Object r1 = r4.data
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            r3[r2] = r5
            r4.data = r3
            goto L87
        L27:
            int r1 = r4.size()
            r3 = 5
            if (r1 >= r3) goto L75
            java.lang.Object r1 = r4.data
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.AbstractC3340k.c(r1, r3)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            boolean r3 = ff.m.e0(r5, r1)
            if (r3 == 0) goto L3e
            goto L86
        L3e:
            int r0 = r4.size()
            r3 = 4
            if (r0 != r3) goto L60
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r1 = "elements"
            kotlin.jvm.internal.AbstractC3340k.e(r0, r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            int r3 = r0.length
            int r3 = ff.AbstractC2641B.D(r3)
            r1.<init>(r3)
            ff.m.F0(r0, r1)
            r1.add(r5)
            goto L72
        L60:
            int r0 = r4.size()
            int r0 = r0 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.AbstractC3340k.d(r1, r0)
            int r0 = r1.length
            int r0 = r0 - r2
            r1[r0] = r5
        L72:
            r4.data = r1
            goto L87
        L75:
            java.lang.Object r1 = r4.data
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"
            kotlin.jvm.internal.AbstractC3340k.c(r1, r3)
            java.util.Set r1 = kotlin.jvm.internal.K.d(r1)
            boolean r5 = r1.add(r5)
            if (r5 != 0) goto L87
        L86:
            return r0
        L87:
            int r5 = r4.size()
            int r5 = r5 + r2
            r4.setSize(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.utils.SmartSet.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return AbstractC3340k.a(this.data, obj);
        }
        if (size() < 5) {
            Object obj2 = this.data;
            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return m.e0(obj, (Object[]) obj2);
        }
        Object obj3 = this.data;
        AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new SingletonIterator(this.data);
        }
        if (size() < 5) {
            Object obj = this.data;
            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new ArrayIterator((Object[]) obj);
        }
        Object obj2 = this.data;
        AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return K.d(obj2).iterator();
    }

    public void setSize(int i5) {
        this.size = i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    private SmartSet() {
    }
}
