package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cwy implements java.util.List, j$.util.List, defpackage.afhc {
    public final defpackage.aan b = new defpackage.aan(16);
    public final defpackage.zu c = new defpackage.zu(16);
    public int a = -1;

    public final int a() {
        return this.b.b;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends defpackage.cge> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jF = defpackage.ua.f(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int iA = a() - 1;
        if (i <= iA) {
            while (true) {
                defpackage.zu zuVar = this.c;
                if (i < 0 || i >= zuVar.b) {
                    defpackage.ca.aa("Index must be between 0 and size");
                }
                long j = zuVar.a[i];
                if (defpackage.cws.a(j, jF) < 0) {
                    jF = j;
                }
                if ((java.lang.Float.intBitsToFloat((int) (jF >> 32)) < 0.0f && defpackage.cws.c(jF)) || i == iA) {
                    break;
                }
                i++;
            }
        }
        return jF;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.cge get(int i) {
        java.lang.Object objC = this.b.c(i);
        objC.getClass();
        return (defpackage.cge) objC;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.b.k();
        this.c.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        return (obj instanceof defpackage.cge) && indexOf((defpackage.cge) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((defpackage.cge) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= i2) {
            return;
        }
        this.b.l(i, i2);
        defpackage.zu zuVar = this.c;
        if (i < 0 || i > (i3 = zuVar.b) || i2 < 0 || i2 > i3) {
            defpackage.ca.aa("Index must be between 0 and size");
        }
        if (i2 < i) {
            defpackage.ca.Y("The end index must be < start index");
        }
        if (i2 != i) {
            int i4 = zuVar.b;
            if (i2 < i4) {
                long[] jArr = zuVar.a;
                defpackage.afga.cj(jArr, jArr, i, i2, i4);
            }
            zuVar.b -= i2 - i;
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.a != a() - 1) {
            return defpackage.cws.a(b(), defpackage.ua.f(f, z, false)) > 0;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cge)) {
            return -1;
        }
        defpackage.cge cgeVar = (defpackage.cge) obj;
        int iA = a() - 1;
        if (iA < 0) {
            return -1;
        }
        int i = 0;
        while (!defpackage.afga.f(this.b.c(i), cgeVar)) {
            if (i == iA) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<defpackage.cge> iterator() {
        return new defpackage.cww(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cge)) {
            return -1;
        }
        defpackage.cge cgeVar = (defpackage.cge) obj;
        for (int iA = a() - 1; iA >= 0; iA--) {
            if (defpackage.afga.f(this.b.c(iA), cgeVar)) {
                return iA;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new defpackage.cww(this, 0, 7);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.-CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<defpackage.cge> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super defpackage.cge> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.-CC.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new defpackage.cwx(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.afft.a(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) defpackage.afft.b(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends defpackage.cge> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<defpackage.cge> listIterator(int i) {
        return new defpackage.cww(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
