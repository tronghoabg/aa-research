package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class ConcurrentHashMap<K, V> extends java.util.AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, java.io.Serializable, j$.util.concurrent.ConcurrentMap<K, V> {
    public static final int g = java.lang.Runtime.getRuntime().availableProcessors();
    public static final j$.sun.misc.a h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    public volatile transient j$.util.concurrent.k[] a;
    public volatile transient j$.util.concurrent.k[] b;
    private volatile transient long baseCount;
    public volatile transient j$.util.concurrent.c[] c;
    private volatile transient int cellsBusy;
    public transient j$.util.concurrent.ConcurrentHashMap.KeySetView d;
    public transient j$.util.concurrent.r e;
    public transient j$.util.concurrent.e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
    public static class KeySetView<K, V> extends j$.util.concurrent.b implements java.util.Set<K>, java.io.Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;
        public final java.lang.Object b;

        public KeySetView(j$.util.concurrent.ConcurrentHashMap concurrentHashMap, java.lang.Boolean bool) {
            super(concurrentHashMap);
            this.b = bool;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(java.lang.Object obj) {
            java.lang.Object obj2 = this.b;
            if (obj2 != null) {
                return this.a.f(obj, obj2, true) == null;
            }
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            java.lang.Object obj = this.b;
            if (obj == null) {
                throw new java.lang.UnsupportedOperationException();
            }
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.f(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(java.lang.Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof java.util.Set)) {
                return false;
            }
            java.util.Set set = (java.util.Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final void forEach(java.util.function.Consumer consumer) {
            consumer.getClass();
            j$.util.concurrent.k[] kVarArr = this.a.a;
            if (kVarArr == null) {
                return;
            }
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    return;
                } else {
                    consumer.accept(kVarA.b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            java.lang.Object it = iterator();
            int iHashCode = 0;
            while (((j$.util.concurrent.a) it).hasNext()) {
                iHashCode += ((j$.util.concurrent.h) it).next().hashCode();
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final java.util.Iterator iterator() {
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
            j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new j$.util.concurrent.h(kVarArr, length, length, concurrentHashMap, (byte) 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream parallelStream() {
            return j$.util.Collection.CC.$default$parallelStream(this);
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(java.lang.Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return j$.util.Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.a
        public final j$.util.Spliterator spliterator() {
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
            long j = concurrentHashMap.j();
            j$.util.concurrent.k[] kVarArr = concurrentHashMap.a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new j$.util.concurrent.i(kVarArr, length, 0, length, j < 0 ? 0L : j, (byte) 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ j$.util.stream.Stream stream() {
            return j$.util.Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
            return toArray((java.lang.Object[]) intFunction.apply(0));
        }
    }

    static {
        java.io.ObjectStreamField objectStreamField = new java.io.ObjectStreamField("segments", j$.util.concurrent.m[].class);
        java.lang.Class cls = java.lang.Integer.TYPE;
        serialPersistentFields = new java.io.ObjectStreamField[]{objectStreamField, new java.io.ObjectStreamField("segmentMask", cls), new java.io.ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(j$.util.concurrent.ConcurrentHashMap.class, "sizeCtl");
        j = aVar.a(j$.util.concurrent.ConcurrentHashMap.class, "transferIndex");
        k = aVar.a(j$.util.concurrent.ConcurrentHashMap.class, "baseCount");
        l = aVar.a(j$.util.concurrent.ConcurrentHashMap.class, "cellsBusy");
        m = aVar.a(j$.util.concurrent.c.class, "value");
        n = aVar.a.arrayBaseOffset(j$.util.concurrent.k[].class);
        int iArrayIndexScale = aVar.a.arrayIndexScale(j$.util.concurrent.k[].class);
        if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
            throw new java.lang.ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - java.lang.Integer.numberOfLeadingZeros(iArrayIndexScale);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || i2 < 0 || i3 <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        long j2 = (long) (((double) ((i2 < i3 ? i3 : i2) / f)) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public static final boolean b(j$.util.concurrent.k[] kVarArr, int i2, j$.util.concurrent.k kVar) {
        long j2 = (((long) i2) << o) + ((long) n);
        sun.misc.Unsafe unsafe = h.a;
        while (true) {
            j$.util.concurrent.k[] kVarArr2 = kVarArr;
            j$.util.concurrent.k kVar2 = kVar;
            if (unsafe.compareAndSwapObject(kVarArr2, j2, (java.lang.Object) null, kVar2)) {
                return true;
            }
            if (unsafe.getObject(kVarArr2, j2) != null) {
                return false;
            }
            kVarArr = kVarArr2;
            kVar = kVar2;
        }
    }

    public static java.lang.Class c(java.lang.Object obj) {
        java.lang.reflect.Type[] actualTypeArguments;
        if (!(obj instanceof java.lang.Comparable)) {
            return null;
        }
        java.lang.Class<?> cls = obj.getClass();
        if (cls != java.lang.String.class) {
            java.lang.reflect.Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (java.lang.reflect.Type type : genericInterfaces) {
                if (type instanceof java.lang.reflect.ParameterizedType) {
                    java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
                    if (parameterizedType.getRawType() != java.lang.Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final void h(j$.util.concurrent.k[] kVarArr, int i2, j$.util.concurrent.k kVar) {
        h.a.putObjectVolatile(kVarArr, (((long) i2) << o) + ((long) n), kVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
    }

    public static final j$.util.concurrent.k k(j$.util.concurrent.k[] kVarArr, int i2) {
        return (j$.util.concurrent.k) h.a.getObjectVolatile(kVarArr, (((long) i2) << o) + ((long) n));
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> java.lang.Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static <K> j$.util.concurrent.ConcurrentHashMap.KeySetView<K, java.lang.Boolean> newKeySet() {
        return new j$.util.concurrent.ConcurrentHashMap.KeySetView<>(new j$.util.concurrent.ConcurrentHashMap(), java.lang.Boolean.TRUE);
    }

    public static j$.util.concurrent.k p(j$.util.concurrent.q qVar) {
        j$.util.concurrent.k kVar = null;
        j$.util.concurrent.k kVar2 = null;
        for (j$.util.concurrent.k kVar3 = qVar; kVar3 != null; kVar3 = kVar3.d) {
            j$.util.concurrent.k kVar4 = new j$.util.concurrent.k(kVar3.a, kVar3.b, kVar3.c);
            if (kVar2 == null) {
                kVar = kVar4;
            } else {
                kVar2.d = kVar4;
            }
            kVar2 = kVar4;
        }
        return kVar;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        long j2;
        long j3;
        java.lang.Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        j$.util.concurrent.k kVar = null;
        while (true) {
            java.lang.Object object = objectInputStream.readObject();
            java.lang.Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j5++;
            kVar = new j$.util.concurrent.k(i(object.hashCode()), object, object2, kVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) (((double) (j5 / 0.75f)) + 1.0d);
        int iL = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        j$.util.concurrent.k[] kVarArr = new j$.util.concurrent.k[iL];
        int i2 = iL - 1;
        while (kVar != null) {
            j$.util.concurrent.k kVar2 = kVar.d;
            int i3 = kVar.a;
            int i4 = i3 & i2;
            j$.util.concurrent.k kVarK = k(kVarArr, i4);
            boolean z = true;
            if (kVarK == null) {
                j3 = j2;
            } else {
                java.lang.Object obj2 = kVar.b;
                if (kVarK.a < 0) {
                    if (((j$.util.concurrent.p) kVarK).e(i3, obj2, kVar.c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (j$.util.concurrent.k kVar3 = kVarK; kVar3 != null; kVar3 = kVar3.d) {
                        if (kVar3.a == i3 && ((obj = kVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        kVar.d = kVarK;
                        j$.util.concurrent.k kVar4 = kVar;
                        j$.util.concurrent.q qVar = null;
                        j$.util.concurrent.q qVar2 = null;
                        while (kVar4 != null) {
                            j$.util.concurrent.q qVar3 = new j$.util.concurrent.q(kVar4.a, kVar4.b, kVar4.c, null, null);
                            qVar3.h = qVar2;
                            if (qVar2 == null) {
                                qVar = qVar3;
                            } else {
                                qVar2.d = qVar3;
                            }
                            kVar4 = kVar4.d;
                            qVar2 = qVar3;
                        }
                        h(kVarArr, i4, new j$.util.concurrent.p(qVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                kVar.d = kVarK;
                h(kVarArr, i4, kVar);
            }
            kVar = kVar2;
            j2 = j3;
        }
        this.a = kVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        j$.util.concurrent.m[] mVarArr = new j$.util.concurrent.m[16];
        for (int i6 = 0; i6 < 16; i6++) {
            mVarArr[i6] = new j$.util.concurrent.m();
        }
        java.io.ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", mVarArr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        j$.util.concurrent.k[] kVarArr = this.a;
        if (kVarArr != null) {
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(kVarA.b);
                objectOutputStream.writeObject(kVarA.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:149:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x015e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0151 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #2 {all -> 0x015c, blocks: (B:96:0x014d, B:98:0x0151), top: B:132:0x014d }] */
    public final void a(long j2, int i2) {
        boolean zCompareAndSwapLong;
        j$.util.concurrent.v vVar;
        int i3;
        j$.util.concurrent.c[] cVarArr;
        j$.sun.misc.a aVar;
        long j3;
        long j4;
        boolean z;
        int length;
        boolean z2;
        int length2;
        int length3;
        j$.util.concurrent.c cVar;
        long j5;
        j$.util.concurrent.k[] kVarArr;
        int length4;
        j$.util.concurrent.k[] kVarArr2;
        j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this;
        j$.util.concurrent.c[] cVarArr2 = concurrentHashMap.c;
        if (cVarArr2 == null) {
            j$.sun.misc.a aVar2 = h;
            long j6 = k;
            long j7 = concurrentHashMap.baseCount;
            j5 = j7 + j2;
            if (!aVar2.a.compareAndSwapLong(concurrentHashMap, j6, j7, j5)) {
                if (cVarArr2 != null || (length3 = cVarArr2.length - 1) < 0 || (cVar = cVarArr2[length3 & ((j$.util.concurrent.ThreadLocalRandom) j$.util.concurrent.ThreadLocalRandom.f.get()).b]) == null) {
                    zCompareAndSwapLong = true;
                } else {
                    j$.sun.misc.a aVar3 = h;
                    long j8 = m;
                    long j9 = cVar.value;
                    zCompareAndSwapLong = aVar3.a.compareAndSwapLong(cVar, j8, j9, j9 + j2);
                    if (zCompareAndSwapLong) {
                        if (i2 <= 1) {
                            return;
                        } else {
                            j5 = concurrentHashMap.j();
                        }
                    }
                }
                vVar = j$.util.concurrent.ThreadLocalRandom.f;
                i3 = ((j$.util.concurrent.ThreadLocalRandom) vVar.get()).b;
                if (i3 == 0) {
                    j$.util.concurrent.ThreadLocalRandom.a();
                    i3 = ((j$.util.concurrent.ThreadLocalRandom) vVar.get()).b;
                    zCompareAndSwapLong = true;
                }
                boolean z3 = zCompareAndSwapLong;
                int i4 = i3;
                while (true) {
                    boolean z4 = false;
                    while (true) {
                        cVarArr = concurrentHashMap.c;
                        if (cVarArr != null || (length = cVarArr.length) <= 0) {
                            if (concurrentHashMap.cellsBusy == 0 || concurrentHashMap.c != cVarArr) {
                                aVar = h;
                                j3 = k;
                                j4 = concurrentHashMap.baseCount;
                                if (aVar.a.compareAndSwapLong(concurrentHashMap, j3, j4, j4 + j2)) {
                                    return;
                                }
                            } else {
                                if (h.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                                    try {
                                        if (concurrentHashMap.c == cVarArr) {
                                            j$.util.concurrent.c[] cVarArr3 = new j$.util.concurrent.c[2];
                                            cVarArr3[i4 & 1] = new j$.util.concurrent.c(j2);
                                            concurrentHashMap.c = cVarArr3;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        concurrentHashMap.cellsBusy = 0;
                                        if (z) {
                                            return;
                                        }
                                    } catch (java.lang.Throwable th) {
                                        concurrentHashMap.cellsBusy = 0;
                                        throw th;
                                    }
                                } else {
                                    aVar = h;
                                    j3 = k;
                                    j4 = concurrentHashMap.baseCount;
                                    if (aVar.a.compareAndSwapLong(concurrentHashMap, j3, j4, j4 + j2)) {
                                        return;
                                    }
                                }
                            }
                            concurrentHashMap = this;
                        } else {
                            j$.util.concurrent.c cVar2 = cVarArr[(length - 1) & i4];
                            if (cVar2 != null) {
                                if (z3) {
                                    j$.sun.misc.a aVar4 = h;
                                    long j10 = m;
                                    long j11 = cVar2.value;
                                    if (!aVar4.a.compareAndSwapLong(cVar2, j10, j11, j11 + j2)) {
                                        if (concurrentHashMap.c == cVarArr && length < g) {
                                            if (!z4) {
                                                z4 = true;
                                            } else if (concurrentHashMap.cellsBusy == 0) {
                                                if (aVar4.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    z3 = true;
                                }
                                int i5 = (i4 << 13) ^ i4;
                                int i6 = i5 ^ (i5 >>> 17);
                                int i7 = i6 ^ (i6 << 5);
                                ((j$.util.concurrent.ThreadLocalRandom) j$.util.concurrent.ThreadLocalRandom.f.get()).b = i7;
                                i4 = i7;
                                concurrentHashMap = this;
                            } else if (concurrentHashMap.cellsBusy == 0) {
                                j$.util.concurrent.c cVar3 = new j$.util.concurrent.c(j2);
                                if (concurrentHashMap.cellsBusy == 0) {
                                    if (h.a.compareAndSwapInt(concurrentHashMap, l, 0, 1)) {
                                        try {
                                            j$.util.concurrent.c[] cVarArr4 = concurrentHashMap.c;
                                            if (cVarArr4 == null || (length2 = cVarArr4.length) <= 0) {
                                                z2 = false;
                                            } else {
                                                int i8 = (length2 - 1) & i4;
                                                if (cVarArr4[i8] == null) {
                                                    cVarArr4[i8] = cVar3;
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                            }
                                            concurrentHashMap.cellsBusy = 0;
                                            if (z2) {
                                                return;
                                            }
                                        } catch (java.lang.Throwable th2) {
                                            concurrentHashMap.cellsBusy = 0;
                                            throw th2;
                                        }
                                    }
                                }
                            }
                            z4 = false;
                            int i9 = (i4 << 13) ^ i4;
                            int i10 = i9 ^ (i9 >>> 17);
                            int i11 = i10 ^ (i10 << 5);
                            ((j$.util.concurrent.ThreadLocalRandom) j$.util.concurrent.ThreadLocalRandom.f.get()).b = i11;
                            i4 = i11;
                            concurrentHashMap = this;
                        }
                    }
                    try {
                        if (concurrentHashMap.c == cVarArr) {
                            concurrentHashMap.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(cVarArr, length << 1);
                        }
                        concurrentHashMap.cellsBusy = 0;
                    } catch (java.lang.Throwable th3) {
                        concurrentHashMap.cellsBusy = 0;
                        throw th3;
                    }
                }
            }
        } else {
            if (cVarArr2 != null) {
                zCompareAndSwapLong = true;
            } else {
                zCompareAndSwapLong = true;
            }
            vVar = j$.util.concurrent.ThreadLocalRandom.f;
            i3 = ((j$.util.concurrent.ThreadLocalRandom) vVar.get()).b;
            if (i3 == 0) {
                j$.util.concurrent.ThreadLocalRandom.a();
                i3 = ((j$.util.concurrent.ThreadLocalRandom) vVar.get()).b;
                zCompareAndSwapLong = true;
            }
            boolean z5 = zCompareAndSwapLong;
            int i12 = i3;
            while (true) {
                boolean z6 = false;
                while (true) {
                    cVarArr = concurrentHashMap.c;
                    if (cVarArr != null) {
                    }
                    if (concurrentHashMap.cellsBusy == 0) {
                        aVar = h;
                        j3 = k;
                        j4 = concurrentHashMap.baseCount;
                        if (aVar.a.compareAndSwapLong(concurrentHashMap, j3, j4, j4 + j2)) {
                            return;
                        }
                    } else {
                        aVar = h;
                        j3 = k;
                        j4 = concurrentHashMap.baseCount;
                        if (aVar.a.compareAndSwapLong(concurrentHashMap, j3, j4, j4 + j2)) {
                            return;
                        }
                    }
                    concurrentHashMap = this;
                }
                if (concurrentHashMap.c == cVarArr) {
                    concurrentHashMap.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(cVarArr, length << 1);
                }
                concurrentHashMap.cellsBusy = 0;
            }
        }
        if (i2 < 0) {
            return;
        }
        while (true) {
            int i13 = concurrentHashMap.sizeCtl;
            if (j5 < i13 || (kVarArr = concurrentHashMap.a) == null || (length4 = kVarArr.length) >= 1073741824) {
                return;
            }
            int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(length4) | 32768;
            if (i13 >= 0) {
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i13, (iNumberOfLeadingZeros << 16) + 2)) {
                    concurrentHashMap.m(kVarArr, null);
                }
            } else {
                if ((i13 >>> 16) != iNumberOfLeadingZeros || i13 == iNumberOfLeadingZeros + 1 || i13 == iNumberOfLeadingZeros + 65535 || (kVarArr2 = concurrentHashMap.b) == null || concurrentHashMap.transferIndex <= 0) {
                    return;
                }
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i13, i13 + 1)) {
                    concurrentHashMap.m(kVarArr, kVarArr2);
                }
            }
            j5 = concurrentHashMap.j();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j$.util.concurrent.k kVarK;
        j$.util.concurrent.k kVar;
        j$.util.concurrent.k[] kVarArrD = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                if (kVarArrD == null || i2 >= kVarArrD.length) {
                    break loop0;
                }
                kVarK = k(kVarArrD, i2);
                if (kVarK == null) {
                    i2++;
                } else {
                    int i3 = kVarK.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (kVarK) {
                        try {
                            if (k(kVarArrD, i2) == kVarK) {
                                if (i3 >= 0) {
                                    kVar = kVarK;
                                } else {
                                    kVar = kVarK instanceof j$.util.concurrent.p ? ((j$.util.concurrent.p) kVarK).f : null;
                                }
                                while (kVar != null) {
                                    j2--;
                                    kVar = kVar.d;
                                }
                                h(kVarArrD, i2, null);
                                i2++;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            kVarArrD = d(kVarArrD, kVarK);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0044 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0043 */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        j$.util.concurrent.q qVarB;
        java.lang.Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        j$.util.concurrent.k[] kVarArrE = this.a;
        int i3 = 0;
        java.lang.Object objApply = null;
        int i4 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    j$.util.concurrent.k kVarK = k(kVarArrE, i5);
                    if (kVarK == null) {
                        break;
                    }
                    int i6 = kVarK.a;
                    if (i6 == -1) {
                        kVarArrE = d(kVarArrE, kVarK);
                    } else {
                        synchronized (kVarK) {
                            try {
                                if (k(kVarArrE, i5) == kVarK) {
                                    if (i6 >= 0) {
                                        i4 = 1;
                                        j$.util.concurrent.k kVar = null;
                                        j$.util.concurrent.k kVar2 = kVarK;
                                        while (true) {
                                            if (kVar2.a == i2 && ((obj2 = kVar2.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                objApply = biFunction.apply(obj, kVar2.c);
                                                if (objApply == null) {
                                                    j$.util.concurrent.k kVar3 = kVar2.d;
                                                    if (kVar != null) {
                                                        kVar.d = kVar3;
                                                    } else {
                                                        h(kVarArrE, i5, kVar3);
                                                    }
                                                    i3 = -1;
                                                    break;
                                                }
                                                kVar2.c = objApply;
                                                break;
                                            }
                                            j$.util.concurrent.k kVar4 = kVar2.d;
                                            if (kVar4 == null) {
                                                break;
                                            }
                                            i4++;
                                            kVar = kVar2;
                                            kVar2 = kVar4;
                                        }
                                    } else if (kVarK instanceof j$.util.concurrent.p) {
                                        j$.util.concurrent.p pVar = (j$.util.concurrent.p) kVarK;
                                        j$.util.concurrent.q qVar = pVar.e;
                                        if (qVar != null && (qVarB = qVar.b(i2, obj, null)) != null) {
                                            objApply = biFunction.apply(obj, qVarB.c);
                                            if (objApply != null) {
                                                qVarB.c = objApply;
                                            } else {
                                                if (pVar.f(qVarB)) {
                                                    h(kVarArrE, i5, p(pVar.f));
                                                }
                                                i3 = -1;
                                            }
                                        }
                                        i4 = 2;
                                    } else if (kVarK instanceof j$.util.concurrent.l) {
                                        throw new java.lang.IllegalStateException("Recursive update");
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        if (i4 != 0) {
                            break;
                        }
                    }
                }
            }
            kVarArrE = e();
        }
        if (i3 != 0) {
            a(i3, i4);
        }
        return objApply;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        obj.getClass();
        j$.util.concurrent.k[] kVarArr = this.a;
        if (kVarArr != null) {
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                java.lang.Object obj2 = kVarA.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final j$.util.concurrent.k[] d(j$.util.concurrent.k[] kVarArr, j$.util.concurrent.k kVar) {
        int i2;
        if (!(kVar instanceof j$.util.concurrent.g)) {
            return this.a;
        }
        j$.util.concurrent.k[] kVarArr2 = ((j$.util.concurrent.g) kVar).e;
        int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
        while (kVarArr2 == this.b && this.a == kVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, i2 + 1)) {
                concurrentHashMap.m(kVarArr, kVarArr2);
                return kVarArr2;
            }
            this = concurrentHashMap;
        }
        return kVarArr2;
    }

    public final j$.util.concurrent.k[] e() {
        while (true) {
            j$.util.concurrent.k[] kVarArr = this.a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                java.lang.Thread.yield();
            } else {
                j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i2, -1)) {
                    try {
                        j$.util.concurrent.k[] kVarArr2 = concurrentHashMap.a;
                        if (kVarArr2 == null || kVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            j$.util.concurrent.k[] kVarArr3 = new j$.util.concurrent.k[i3];
                            concurrentHashMap.a = kVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            kVarArr2 = kVarArr3;
                        }
                        return kVarArr2;
                    } finally {
                        concurrentHashMap.sizeCtl = i2;
                    }
                }
                this = concurrentHashMap;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        j$.util.concurrent.e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        j$.util.concurrent.e eVar2 = new j$.util.concurrent.e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        j$.util.concurrent.k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, length, 0, length);
        while (true) {
            j$.util.concurrent.k kVarA = oVar.a();
            if (kVarA == null) {
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            java.lang.Object obj2 = kVarA.c;
            java.lang.Object obj3 = map.get(kVarA.b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, boolean z) {
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        j$.util.concurrent.k[] kVarArrE = this.a;
        int i3 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i4 = (length - 1) & i2;
                    j$.util.concurrent.k kVarK = k(kVarArrE, i4);
                    if (kVarK != null) {
                        int i5 = kVarK.a;
                        if (i5 == -1) {
                            kVarArrE = d(kVarArrE, kVarK);
                        } else {
                            if (z && i5 == i2 && (((obj5 = kVarK.b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = kVarK.c) != null)) {
                                return obj6;
                            }
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArrE, i4) != kVarK) {
                                        obj3 = null;
                                    } else if (i5 >= 0) {
                                        i3 = 1;
                                        j$.util.concurrent.k kVar = kVarK;
                                        while (true) {
                                            if (kVar.a != i2 || ((obj4 = kVar.b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                j$.util.concurrent.k kVar2 = kVar.d;
                                                if (kVar2 == null) {
                                                    kVar.d = new j$.util.concurrent.k(i2, obj, obj2);
                                                    obj3 = null;
                                                } else {
                                                    i3++;
                                                    kVar = kVar2;
                                                }
                                            } else {
                                                obj3 = kVar.c;
                                                if (!z) {
                                                    kVar.c = obj2;
                                                }
                                            }
                                        }
                                    } else if (kVarK instanceof j$.util.concurrent.p) {
                                        j$.util.concurrent.q qVarE = ((j$.util.concurrent.p) kVarK).e(i2, obj, obj2);
                                        if (qVarE != null) {
                                            java.lang.Object obj7 = qVarE.c;
                                            if (!z) {
                                                qVarE.c = obj2;
                                            }
                                            obj3 = obj7;
                                        } else {
                                            obj3 = null;
                                        }
                                        i3 = 2;
                                    } else {
                                        if (kVarK instanceof j$.util.concurrent.l) {
                                            throw new java.lang.IllegalStateException("Recursive update");
                                        }
                                        obj3 = null;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArrE, i4);
                                }
                                if (obj3 == null) {
                                    break;
                                }
                                return obj3;
                            }
                        }
                    } else if (b(kVarArrE, i4, new j$.util.concurrent.k(i2, obj, obj2))) {
                        break;
                    }
                }
            }
            kVarArrE = e();
        }
        a(1L, i3);
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(java.util.function.BiConsumer biConsumer) {
        biConsumer.getClass();
        j$.util.concurrent.k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            j$.util.concurrent.k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                biConsumer.accept(kVarA.b, kVarA.c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae A[PHI: r7
  0x00ae: PHI (r7v3 boolean) = 
  (r7v1 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
  (r7v4 boolean)
 binds: [B:68:0x00ad, B:49:0x0075, B:51:0x007b, B:55:0x0083, B:57:0x0089, B:44:0x0067, B:32:0x004b, B:34:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int length;
        int i2;
        j$.util.concurrent.k kVarK;
        boolean z;
        java.lang.Object obj4;
        j$.util.concurrent.q qVarB;
        java.lang.Object obj5;
        int i3 = i(obj.hashCode());
        j$.util.concurrent.k[] kVarArrD = this.a;
        while (kVarArrD != null && (length = kVarArrD.length) != 0 && (kVarK = k(kVarArrD, (i2 = (length - 1) & i3))) != null) {
            int i4 = kVarK.a;
            if (i4 == -1) {
                kVarArrD = d(kVarArrD, kVarK);
            } else {
                synchronized (kVarK) {
                    try {
                        if (k(kVarArrD, i2) == kVarK) {
                            z = true;
                            if (i4 >= 0) {
                                j$.util.concurrent.k kVar = null;
                                j$.util.concurrent.k kVar2 = kVarK;
                                while (true) {
                                    if (kVar2.a != i3 || ((obj5 = kVar2.b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        j$.util.concurrent.k kVar3 = kVar2.d;
                                        if (kVar3 != null) {
                                            kVar = kVar2;
                                            kVar2 = kVar3;
                                        }
                                    } else {
                                        obj4 = kVar2.c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                kVar2.c = obj2;
                                            } else {
                                                j$.util.concurrent.k kVar4 = kVar2.d;
                                                if (kVar != null) {
                                                    kVar.d = kVar4;
                                                } else {
                                                    h(kVarArrD, i2, kVar4);
                                                }
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else if (kVarK instanceof j$.util.concurrent.p) {
                                j$.util.concurrent.p pVar = (j$.util.concurrent.p) kVarK;
                                j$.util.concurrent.q qVar = pVar.e;
                                if (qVar == null || (qVarB = qVar.b(i3, obj, null)) == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = qVarB.c;
                                    if (obj3 != null && obj3 != obj4 && (obj4 == null || !obj3.equals(obj4))) {
                                        obj4 = null;
                                    } else if (obj2 != null) {
                                        qVarB.c = obj2;
                                    } else if (pVar.f(qVarB)) {
                                        h(kVarArrD, i2, p(pVar.f));
                                    }
                                }
                            } else {
                                if (kVarK instanceof j$.util.concurrent.l) {
                                    throw new java.lang.IllegalStateException("Recursive update");
                                }
                                z = false;
                                obj4 = null;
                            }
                        } else {
                            z = false;
                            obj4 = null;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 == null) {
                        break;
                    }
                    if (obj2 == null) {
                        a(-1L, -1);
                    }
                    return obj4;
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object obj) {
        int length;
        j$.util.concurrent.k kVarK;
        java.lang.Object obj2;
        int i2 = i(obj.hashCode());
        j$.util.concurrent.k[] kVarArr = this.a;
        if (kVarArr == null || (length = kVarArr.length) <= 0 || (kVarK = k(kVarArr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = kVarK.a;
        if (i3 == i2) {
            java.lang.Object obj3 = kVarK.b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) kVarK.c;
            }
        } else if (i3 < 0) {
            j$.util.concurrent.k kVarA = kVarK.a(i2, obj);
            if (kVarA != null) {
                return (V) kVarA.c;
            }
            return null;
        }
        while (true) {
            kVarK = kVarK.d;
            if (kVarK == null) {
                return null;
            }
            if (kVarK.a == i2 && ((obj2 = kVarK.b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return (V) kVarK.c;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        j$.util.concurrent.k[] kVarArr = this.a;
        int iHashCode = 0;
        if (kVarArr != null) {
            j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                j$.util.concurrent.k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.c.hashCode() ^ kVarA.b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
        j$.util.concurrent.c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (j$.util.concurrent.c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
        j$.util.concurrent.ConcurrentHashMap.KeySetView keySetView = this.d;
        if (keySetView != null) {
            return keySetView;
        }
        j$.util.concurrent.ConcurrentHashMap.KeySetView keySetView2 = new j$.util.concurrent.ConcurrentHashMap.KeySetView(this, null);
        this.d = keySetView2;
        return keySetView2;
    }

    public final void m(j$.util.concurrent.k[] kVarArr, j$.util.concurrent.k[] kVarArr2) {
        j$.util.concurrent.k[] kVarArr3;
        int i2;
        boolean z;
        char c;
        int i3;
        int i4;
        j$.util.concurrent.k pVar;
        j$.util.concurrent.k pVar2;
        j$.util.concurrent.k kVar;
        j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = kVarArr.length;
        int i5 = g;
        boolean z2 = true;
        int i6 = i5 > 1 ? (length >>> 3) / i5 : length;
        char c2 = 16;
        int i7 = i6 < 16 ? 16 : i6;
        if (kVarArr2 == null) {
            try {
                j$.util.concurrent.k[] kVarArr4 = new j$.util.concurrent.k[length << 1];
                concurrentHashMap.b = kVarArr4;
                concurrentHashMap.transferIndex = length;
                kVarArr3 = kVarArr4;
            } catch (java.lang.Throwable unused) {
                concurrentHashMap.sizeCtl = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
                return;
            }
        } else {
            kVarArr3 = kVarArr2;
        }
        int length2 = kVarArr3.length;
        j$.util.concurrent.g gVar = new j$.util.concurrent.g(kVarArr3);
        boolean zB = true;
        int i8 = 0;
        int i9 = 0;
        boolean z3 = false;
        while (true) {
            if (zB) {
                int i10 = i8 - 1;
                if (i10 >= i9 || z3) {
                    i9 = i9;
                    i8 = i10;
                    zB = false;
                } else {
                    int i11 = concurrentHashMap.transferIndex;
                    if (i11 <= 0) {
                        i8 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i12 = i11 > i7 ? i11 - i7 : 0;
                        int i13 = i9;
                        if (aVar.a.compareAndSwapInt(concurrentHashMap, j2, i11, i12)) {
                            i8 = i11 - 1;
                            i9 = i12;
                        } else {
                            i9 = i13;
                            i8 = i10;
                        }
                    }
                    zB = false;
                }
            } else {
                int i14 = i9;
                j$.util.concurrent.q qVar = null;
                j$.util.concurrent.k kVar2 = null;
                if (i8 < 0 || i8 >= length || (i4 = i8 + length) >= length2) {
                    i2 = length;
                    z = z2;
                    c = c2;
                    i3 = i7;
                    if (z3) {
                        concurrentHashMap.b = null;
                        concurrentHashMap.a = kVarArr3;
                        concurrentHashMap.sizeCtl = (i2 << 1) - (i2 >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i15 = concurrentHashMap.sizeCtl;
                    int i16 = i8;
                    if (!aVar2.a.compareAndSwapInt(concurrentHashMap, j3, i15, i15 - 1)) {
                        i8 = i16;
                    } else {
                        if (i15 - 2 != ((java.lang.Integer.numberOfLeadingZeros(i2) | 32768) << 16)) {
                            return;
                        }
                        zB = z;
                        z3 = zB;
                        i8 = i2;
                    }
                } else {
                    j$.util.concurrent.k kVarK = k(kVarArr, i8);
                    if (kVarK == null) {
                        zB = b(kVarArr, i8, gVar);
                        i2 = length;
                        z = z2;
                        c = c2;
                        i3 = i7;
                    } else {
                        z = z2;
                        int i17 = kVarK.a;
                        if (i17 == -1) {
                            i2 = length;
                            c = c2;
                            i3 = i7;
                            zB = z;
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArr, i8) == kVarK) {
                                        if (i17 >= 0) {
                                            int i18 = i17 & length;
                                            j$.util.concurrent.k kVar3 = kVarK.d;
                                            j$.util.concurrent.k kVar4 = kVarK;
                                            while (kVar3 != null) {
                                                char c3 = c2;
                                                int i19 = kVar3.a & length;
                                                if (i19 != i18) {
                                                    kVar4 = kVar3;
                                                    i18 = i19;
                                                }
                                                kVar3 = kVar3.d;
                                                c2 = c3;
                                            }
                                            c = c2;
                                            if (i18 == 0) {
                                                kVar = null;
                                                kVar2 = kVar4;
                                            } else {
                                                kVar = kVar4;
                                            }
                                            j$.util.concurrent.k kVar5 = kVarK;
                                            while (kVar5 != kVar4) {
                                                int i20 = kVar5.a;
                                                java.lang.Object obj = kVar5.b;
                                                int i21 = length;
                                                java.lang.Object obj2 = kVar5.c;
                                                if ((i20 & i21) == 0) {
                                                    kVar2 = new j$.util.concurrent.k(i20, obj, obj2, kVar2);
                                                } else {
                                                    kVar = new j$.util.concurrent.k(i20, obj, obj2, kVar);
                                                }
                                                kVar5 = kVar5.d;
                                                length = i21;
                                                i7 = i7;
                                            }
                                            i2 = length;
                                            i3 = i7;
                                            h(kVarArr3, i8, kVar2);
                                            h(kVarArr3, i4, kVar);
                                            h(kVarArr, i8, gVar);
                                        } else {
                                            i2 = length;
                                            c = c2;
                                            i3 = i7;
                                            if (kVarK instanceof j$.util.concurrent.p) {
                                                j$.util.concurrent.p pVar3 = (j$.util.concurrent.p) kVarK;
                                                j$.util.concurrent.q qVar2 = null;
                                                j$.util.concurrent.q qVar3 = null;
                                                j$.util.concurrent.k kVar6 = pVar3.f;
                                                int i22 = 0;
                                                int i23 = 0;
                                                j$.util.concurrent.q qVar4 = null;
                                                while (kVar6 != null) {
                                                    j$.util.concurrent.p pVar4 = pVar3;
                                                    int i24 = kVar6.a;
                                                    j$.util.concurrent.q qVar5 = new j$.util.concurrent.q(i24, kVar6.b, kVar6.c, null, null);
                                                    if ((i24 & i2) == 0) {
                                                        qVar5.h = qVar3;
                                                        if (qVar3 == null) {
                                                            qVar = qVar5;
                                                        } else {
                                                            qVar3.d = qVar5;
                                                        }
                                                        i22++;
                                                        qVar3 = qVar5;
                                                    } else {
                                                        qVar5.h = qVar2;
                                                        if (qVar2 == null) {
                                                            qVar4 = qVar5;
                                                        } else {
                                                            qVar2.d = qVar5;
                                                        }
                                                        i23++;
                                                        qVar2 = qVar5;
                                                    }
                                                    kVar6 = kVar6.d;
                                                    pVar3 = pVar4;
                                                }
                                                j$.util.concurrent.p pVar5 = pVar3;
                                                if (i22 <= 6) {
                                                    pVar = p(qVar);
                                                } else {
                                                    pVar = i23 != 0 ? new j$.util.concurrent.p(qVar) : pVar5;
                                                }
                                                if (i23 <= 6) {
                                                    pVar2 = p(qVar4);
                                                } else {
                                                    pVar2 = i22 != 0 ? new j$.util.concurrent.p(qVar4) : pVar5;
                                                }
                                                h(kVarArr3, i8, pVar);
                                                h(kVarArr3, i4, pVar2);
                                                h(kVarArr, i8, gVar);
                                            }
                                        }
                                        zB = z;
                                    } else {
                                        i2 = length;
                                        c = c2;
                                        i3 = i7;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i9 = i14;
                z2 = z;
                c2 = c;
                length = i2;
                i7 = i3;
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        int i2;
        java.lang.Object obj3;
        java.lang.Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i3 = i(obj.hashCode());
        j$.util.concurrent.k[] kVarArrE = this.a;
        int i4 = 0;
        java.lang.Object obj5 = null;
        int i5 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i6 = (length - 1) & i3;
                    j$.util.concurrent.k kVarK = k(kVarArrE, i6);
                    i2 = 1;
                    if (kVarK != null) {
                        int i7 = kVarK.a;
                        if (i7 == -1) {
                            kVarArrE = d(kVarArrE, kVarK);
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArrE, i6) == kVarK) {
                                        if (i7 >= 0) {
                                            j$.util.concurrent.k kVar = null;
                                            j$.util.concurrent.k kVar2 = kVarK;
                                            i4 = 1;
                                            while (true) {
                                                if (kVar2.a == i3 && ((obj3 = kVar2.b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    java.lang.Object objApply = biFunction.apply(kVar2.c, obj4);
                                                    if (objApply == null) {
                                                        j$.util.concurrent.k kVar3 = kVar2.d;
                                                        if (kVar != null) {
                                                            kVar.d = kVar3;
                                                        } else {
                                                            h(kVarArrE, i6, kVar3);
                                                        }
                                                        obj5 = objApply;
                                                        i5 = -1;
                                                        break;
                                                    }
                                                    kVar2.c = objApply;
                                                    obj5 = objApply;
                                                    break;
                                                }
                                                j$.util.concurrent.k kVar4 = kVar2.d;
                                                if (kVar4 == null) {
                                                    kVar2.d = new j$.util.concurrent.k(i3, obj, obj4);
                                                    obj5 = obj4;
                                                    i5 = 1;
                                                    break;
                                                }
                                                i4++;
                                                kVar = kVar2;
                                                kVar2 = kVar4;
                                            }
                                        } else if (kVarK instanceof j$.util.concurrent.p) {
                                            j$.util.concurrent.p pVar = (j$.util.concurrent.p) kVarK;
                                            j$.util.concurrent.q qVar = pVar.e;
                                            j$.util.concurrent.q qVarB = qVar == null ? null : qVar.b(i3, obj, null);
                                            java.lang.Object objApply2 = qVarB == null ? obj4 : biFunction.apply(qVarB.c, obj4);
                                            if (objApply2 != null) {
                                                if (qVarB != null) {
                                                    qVarB.c = objApply2;
                                                } else {
                                                    pVar.e(i3, obj, objApply2);
                                                    i5 = 1;
                                                }
                                            } else if (qVarB != null) {
                                                if (pVar.f(qVarB)) {
                                                    h(kVarArrE, i6, p(pVar.f));
                                                }
                                                i5 = -1;
                                            }
                                            i4 = 2;
                                            obj5 = objApply2;
                                        } else if (kVarK instanceof j$.util.concurrent.l) {
                                            throw new java.lang.IllegalStateException("Recursive update");
                                        }
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            if (i4 != 0) {
                                if (i4 >= 8) {
                                    n(kVarArrE, i6);
                                }
                                i2 = i5;
                                obj4 = obj5;
                                break;
                            }
                        }
                    } else if (b(kVarArrE, i6, new j$.util.concurrent.k(i3, obj, obj4))) {
                        break;
                    }
                }
            }
            kVarArrE = e();
        }
        if (i2 != 0) {
            a(i2, i4);
        }
        return obj4;
    }

    public final void n(j$.util.concurrent.k[] kVarArr, int i2) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        j$.util.concurrent.k kVarK = k(kVarArr, i2);
        if (kVarK == null || kVarK.a < 0) {
            return;
        }
        synchronized (kVarK) {
            try {
                if (k(kVarArr, i2) == kVarK) {
                    j$.util.concurrent.q qVar = null;
                    j$.util.concurrent.k kVar = kVarK;
                    j$.util.concurrent.q qVar2 = null;
                    while (kVar != null) {
                        j$.util.concurrent.q qVar3 = new j$.util.concurrent.q(kVar.a, kVar.b, kVar.c, null, null);
                        qVar3.h = qVar2;
                        if (qVar2 == null) {
                            qVar = qVar3;
                        } else {
                            qVar2.d = qVar3;
                        }
                        kVar = kVar.d;
                        qVar2 = qVar3;
                    }
                    h(kVarArr, i2, new j$.util.concurrent.p(qVar));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i2) {
        j$.util.concurrent.ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            j$.util.concurrent.k[] kVarArr = this.a;
            if (kVarArr == null || (length = kVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > iL ? i3 : iL;
                if (h.a.compareAndSwapInt(concurrentHashMap, i, i3, -1)) {
                    try {
                        if (concurrentHashMap.a == kVarArr) {
                            concurrentHashMap.a = new j$.util.concurrent.k[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                        concurrentHashMap.sizeCtl = i3;
                    } catch (java.lang.Throwable th) {
                        concurrentHashMap.sizeCtl = i3;
                        throw th;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (kVarArr == this.a) {
                    int iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(length) | 32768;
                    j$.sun.misc.a aVar = h;
                    long j2 = i;
                    int i5 = (iNumberOfLeadingZeros << 16) + 2;
                    sun.misc.Unsafe unsafe = aVar.a;
                    concurrentHashMap = this;
                    if (unsafe.compareAndSwapInt(concurrentHashMap, j2, i3, i5)) {
                        concurrentHashMap.m(kVarArr, null);
                    }
                } else {
                    concurrentHashMap = this;
                }
            }
            this = concurrentHashMap;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        o(map.size());
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        j$.util.concurrent.k[] kVarArr = this.a;
        if (kVarArr == null) {
            return;
        }
        j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            j$.util.concurrent.k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            }
            java.lang.Object obj = kVarA.c;
            java.lang.Object obj2 = kVarA.b;
            do {
                java.lang.Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) != null) {
                    break;
                } else {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        return j2 > 2147483647L ? androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY : (int) j2;
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        j$.util.concurrent.k[] kVarArr = this.a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        j$.util.concurrent.o oVar = new j$.util.concurrent.o(kVarArr, length, 0, length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
        j$.util.concurrent.k kVarA = oVar.a();
        if (kVarA != null) {
            while (true) {
                java.lang.Object obj = kVarA.b;
                java.lang.Object obj2 = kVarA.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Collection<V> values() {
        j$.util.concurrent.r rVar = this.e;
        if (rVar != null) {
            return rVar;
        }
        j$.util.concurrent.r rVar2 = new j$.util.concurrent.r(this);
        this.e = rVar2;
        return rVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null && obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(java.util.Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap() {
    }
}
