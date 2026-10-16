package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiqr<E> extends java.util.AbstractList<E> implements java.util.RandomAccess, j$.util.List<E> {
    private java.lang.Object myElem;
    private int mySize;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.mySize)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.mySize);
        }
        if (i2 == 0) {
            this.myElem = e;
        } else if (i2 == 1 && i == 0) {
            this.myElem = new java.lang.Object[]{e, this.myElem};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[i2 + 1];
            java.lang.Object obj = this.myElem;
            if (i2 == 1) {
                objArr[0] = obj;
            } else {
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                java.lang.System.arraycopy(objArr2, 0, objArr, 0, i);
                java.lang.System.arraycopy(objArr2, i, objArr, i + 1, this.mySize - i);
            }
            objArr[i] = e;
            this.myElem = objArr;
        }
        this.mySize++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.myElem = null;
        this.mySize = 0;
        this.modCount++;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$CC.$default$forEach(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.mySize)) {
            E e = (E) this.myElem;
            return i2 == 1 ? e : (E) ((java.lang.Object[]) e)[i];
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.mySize);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        int i = this.mySize;
        if (i == 0) {
            defpackage.aiqo aiqoVar = defpackage.aiqo.getInstance();
            if (aiqoVar == null) {
                $$$reportNull$$$0(2);
            }
            return aiqoVar;
        }
        if (i == 1) {
            return new defpackage.aiqp(this);
        }
        java.util.Iterator<E> it = super.iterator();
        if (it == null) {
            $$$reportNull$$$0(3);
        }
        return it;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.mySize)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.mySize);
        }
        java.lang.Object obj = (E) this.myElem;
        if (i2 == 1) {
            this.myElem = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            java.lang.Object obj2 = objArr[i];
            if (i2 == 2) {
                this.myElem = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    java.lang.System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                i2 = this.mySize;
                objArr[i2 - 1] = null;
            }
            obj = (E) obj2;
        }
        this.mySize = i2 - 1;
        this.modCount++;
        return (E) obj;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        j$.util.List.CC.$default$replaceAll(this, unaryOperator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.mySize)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.mySize);
        }
        E e2 = (E) this.myElem;
        if (i2 == 1) {
            this.myElem = e;
            return e2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) e2;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mySize;
    }

    @Override // java.util.List, j$.util.List
    public void sort(java.util.Comparator<? super E> comparator) {
        int i = this.mySize;
        if (i >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.myElem, 0, i, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection, j$.lang.a
    public /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.CC.$default$stream(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        if (tArr == 0) {
            $$$reportNull$$$0(4);
        }
        int length = tArr.length;
        int i = this.mySize;
        if (i == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.myElem;
                if (tArr2 == 0) {
                    $$$reportNull$$$0(5);
                }
                return tArr2;
            }
            tArr[0] = this.myElem;
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) java.util.Arrays.copyOf((java.lang.Object[]) this.myElem, i, tArr.getClass());
                if (tArr3 == null) {
                    $$$reportNull$$$0(6);
                }
                return tArr3;
            }
            if (i != 0) {
                java.lang.System.arraycopy(this.myElem, 0, tArr, 0, i);
            }
        }
        int i2 = this.mySize;
        if (length > i2) {
            tArr[i2] = 0;
        }
        if (tArr == 0) {
            $$$reportNull$$$0(7);
        }
        return tArr;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray((java.lang.Object[]) intFunction.apply(0));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.mySize;
        if (i == 0) {
            this.myElem = e;
        } else {
            java.lang.Object obj = this.myElem;
            if (i == 1) {
                this.myElem = new java.lang.Object[]{obj, e};
            } else {
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                int length = objArr.length;
                if (i >= length) {
                    int i2 = ((length * 3) / 2) + 1;
                    int i3 = i + 1;
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[i2];
                    this.myElem = objArr2;
                    java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                    objArr = objArr2;
                }
                i = this.mySize;
                objArr[i] = e;
            }
        }
        this.mySize = i + 1;
        this.modCount++;
        return true;
    }
}
