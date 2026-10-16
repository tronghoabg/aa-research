package j$.util.concurrent;

import androidx.collection.SieveCacheKt;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* renamed from: g, reason: collision with root package name */
    public static final int f50144g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h, reason: collision with root package name */
    public static final j$.sun.misc.a f50145h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f50146i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f50147j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f50148k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f50149l;
    public static final long m;
    public static final int n;
    public static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a, reason: collision with root package name */
    public volatile transient k[] f50150a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient k[] f50151b;
    private volatile transient long baseCount;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient c[] f50152c;
    private volatile transient int cellsBusy;

    /* renamed from: d, reason: collision with root package name */
    public transient KeySetView f50153d;

    /* renamed from: e, reason: collision with root package name */
    public transient r f50154e;

    /* renamed from: f, reason: collision with root package name */
    public transient e f50155f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
    public static class KeySetView<K, V> extends b implements Set<K>, Serializable, j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;

        /* renamed from: b, reason: collision with root package name */
        public final Object f50156b;

        public KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f50156b = bool;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Object obj2 = this.f50156b;
            if (obj2 != null) {
                return this.f50170a.f(obj, obj2, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            Object obj = this.f50156b;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.f50170a.f(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f50170a.containsKey(obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (set != this) {
                return containsAll(set) && set.containsAll(this);
            }
            return true;
        }

        @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            k[] kVarArr = this.f50170a.f50150a;
            if (kVarArr == null) {
                return;
            }
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    return;
                } else {
                    consumer.accept(kVarA.f50181b);
                }
            }
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int iHashCode = 0;
            while (((a) it).hasNext()) {
                iHashCode += ((h) it).next().hashCode();
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f50170a;
            k[] kVarArr = concurrentHashMap.f50150a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new h(kVarArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // j$.util.concurrent.b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f50170a.remove(obj) != null;
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.a
        public final Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f50170a;
            long j2 = concurrentHashMap.j();
            k[] kVarArr = concurrentHashMap.f50150a;
            int length = kVarArr == null ? 0 : kVarArr.length;
            return new i(kVarArr, length, 0, length, j2 < 0 ? 0L : j2, 0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            return toArray((Object[]) intFunction.apply(0));
        }
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", m[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a aVar = j$.sun.misc.a.f49787b;
        f50145h = aVar;
        f50146i = aVar.a(ConcurrentHashMap.class, "sizeCtl");
        f50147j = aVar.a(ConcurrentHashMap.class, "transferIndex");
        f50148k = aVar.a(ConcurrentHashMap.class, "baseCount");
        f50149l = aVar.a(ConcurrentHashMap.class, "cellsBusy");
        m = aVar.a(c.class, "value");
        n = aVar.f49788a.arrayBaseOffset(k[].class);
        int iArrayIndexScale = aVar.f49788a.arrayIndexScale(k[].class);
        if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
    }

    public ConcurrentHashMap(int i2, float f2, int i3) {
        if (f2 <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f2) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    public static final boolean b(k[] kVarArr, int i2, k kVar) {
        return j$.com.android.tools.r8.a.K(f50145h.f49788a, kVarArr, (i2 << o) + n, null, kVar);
    }

    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls != String.class) {
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() != Comparable.class || (actualTypeArguments = parameterizedType.getActualTypeArguments()) == null || actualTypeArguments.length != 1 || actualTypeArguments[0] != cls) {
                    }
                }
            }
            return null;
        }
        return cls;
    }

    public static final void h(k[] kVarArr, int i2, k kVar) {
        f50145h.f49788a.putObjectVolatile(kVarArr, (i2 << o) + n, kVar);
    }

    public static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    public static final k k(k[] kVarArr, int i2) {
        return (k) f50145h.f49788a.getObjectVolatile(kVarArr, (i2 << o) + n);
    }

    public static final int l(int i2) {
        int iNumberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (iNumberOfLeadingZeros < 0) {
            return 1;
        }
        if (iNumberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return iNumberOfLeadingZeros + 1;
    }

    public static <K> KeySetView<K, Boolean> newKeySet() {
        return new KeySetView<>(new ConcurrentHashMap(), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.k] */
    public static k p(q qVar) {
        k kVar = null;
        k kVar2 = null;
        for (q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.f50183d) {
            k kVar3 = new k(qVar2.f50180a, qVar2.f50181b, qVar2.f50182c);
            if (kVar2 == null) {
                kVar = kVar3;
            } else {
                kVar2.f50183d = kVar3;
            }
            kVar2 = kVar3;
        }
        return kVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        long j2;
        long j3;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j4 = 0;
        long j5 = 0;
        k kVar = null;
        while (true) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            j2 = 1;
            if (object == null || object2 == null) {
                break;
            }
            j5++;
            kVar = new k(i(object.hashCode()), object, object2, kVar);
        }
        if (j5 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j6 = (long) ((j5 / 0.75f) + 1.0d);
        int iL = j6 >= 1073741824 ? 1073741824 : l((int) j6);
        k[] kVarArr = new k[iL];
        int i2 = iL - 1;
        while (kVar != null) {
            k kVar2 = kVar.f50183d;
            int i3 = kVar.f50180a;
            int i4 = i3 & i2;
            k kVarK = k(kVarArr, i4);
            boolean z = true;
            if (kVarK == null) {
                j3 = j2;
            } else {
                Object obj2 = kVar.f50181b;
                if (kVarK.f50180a < 0) {
                    if (((p) kVarK).e(i3, obj2, kVar.f50182c) == null) {
                        j4 += j2;
                    }
                    j3 = j2;
                } else {
                    j3 = j2;
                    int i5 = 0;
                    for (k kVar3 = kVarK; kVar3 != null; kVar3 = kVar3.f50183d) {
                        if (kVar3.f50180a == i3 && ((obj = kVar3.f50181b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    if (z && i5 >= 8) {
                        j4 += j3;
                        kVar.f50183d = kVarK;
                        k kVar4 = kVar;
                        q qVar = null;
                        q qVar2 = null;
                        while (kVar4 != null) {
                            q qVar3 = new q(kVar4.f50180a, kVar4.f50181b, kVar4.f50182c, null, null);
                            qVar3.f50204h = qVar2;
                            if (qVar2 == null) {
                                qVar = qVar3;
                            } else {
                                qVar2.f50183d = qVar3;
                            }
                            kVar4 = kVar4.f50183d;
                            qVar2 = qVar3;
                        }
                        h(kVarArr, i4, new p(qVar));
                    }
                }
                z = false;
            }
            if (z) {
                j4 += j3;
                kVar.f50183d = kVarK;
                h(kVarArr, i4, kVar);
            }
            kVar = kVar2;
            j2 = j3;
        }
        this.f50150a = kVarArr;
        this.sizeCtl = iL - (iL >>> 2);
        this.baseCount = j4;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i2 = 0;
        int i3 = 1;
        while (i3 < 16) {
            i2++;
            i3 <<= 1;
        }
        int i4 = 32 - i2;
        int i5 = i3 - 1;
        m[] mVarArr = new m[16];
        for (int i6 = 0; i6 < 16; i6++) {
            mVarArr[i6] = new m();
        }
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("segments", mVarArr);
        putFieldPutFields.put("segmentShift", i4);
        putFieldPutFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        k[] kVarArr = this.f50150a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                objectOutputStream.writeObject(kVarA.f50181b);
                objectOutputStream.writeObject(kVarA.f50182c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x014f, code lost:
    
        if (r1.f50152c != r6) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0151, code lost:
    
        r1.f50152c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r6, r7 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r25, int r27) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        k kVarK;
        k[] kVarArrD = this.f50150a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (kVarArrD != null && i2 < kVarArrD.length) {
                kVarK = k(kVarArrD, i2);
                if (kVarK == null) {
                    i2++;
                } else {
                    int i3 = kVarK.f50180a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (kVarK) {
                        try {
                            if (k(kVarArrD, i2) == kVarK) {
                                for (k kVar = i3 >= 0 ? kVarK : kVarK instanceof p ? ((p) kVarK).f50199f : null; kVar != null; kVar = kVar.f50183d) {
                                    j2--;
                                }
                                h(kVarArrD, i2, null);
                                i2++;
                            }
                        } finally {
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

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        k kVar;
        Object objApply;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i2 = i(obj.hashCode());
        k[] kVarArrE = this.f50150a;
        int i3 = 0;
        Object objApply2 = null;
        int i4 = 0;
        while (true) {
            if (kVarArrE != null) {
                int length = kVarArrE.length;
                if (length != 0) {
                    int i5 = (length - 1) & i2;
                    k kVarK = k(kVarArrE, i5);
                    if (kVarK == null) {
                        l lVar = new l();
                        synchronized (lVar) {
                            try {
                                if (b(kVarArrE, i5, lVar)) {
                                    try {
                                        objApply2 = biFunction.apply(obj, null);
                                        if (objApply2 != null) {
                                            kVar = new k(i2, obj, objApply2);
                                            i4 = 1;
                                        } else {
                                            kVar = null;
                                        }
                                        h(kVarArrE, i5, kVar);
                                        i3 = 1;
                                    } catch (Throwable th) {
                                        h(kVarArrE, i5, null);
                                        throw th;
                                    }
                                }
                            } finally {
                            }
                        }
                        if (i3 != 0) {
                        }
                    } else {
                        int i6 = kVarK.f50180a;
                        if (i6 == -1) {
                            kVarArrE = d(kVarArrE, kVarK);
                        } else {
                            synchronized (kVarK) {
                                try {
                                    if (k(kVarArrE, i5) == kVarK) {
                                        if (i6 >= 0) {
                                            k kVar2 = null;
                                            k kVar3 = kVarK;
                                            i3 = 1;
                                            while (true) {
                                                if (kVar3.f50180a == i2 && ((obj2 = kVar3.f50181b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                k kVar4 = kVar3.f50183d;
                                                if (kVar4 == null) {
                                                    objApply = biFunction.apply(obj, null);
                                                    if (objApply != null) {
                                                        if (kVar3.f50183d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        kVar3.f50183d = new k(i2, obj, objApply);
                                                        i4 = 1;
                                                    }
                                                } else {
                                                    i3++;
                                                    kVar2 = kVar3;
                                                    kVar3 = kVar4;
                                                }
                                            }
                                            Object objApply3 = biFunction.apply(obj, kVar3.f50182c);
                                            if (objApply3 != null) {
                                                kVar3.f50182c = objApply3;
                                                objApply2 = objApply3;
                                            } else {
                                                k kVar5 = kVar3.f50183d;
                                                if (kVar2 != null) {
                                                    kVar2.f50183d = kVar5;
                                                } else {
                                                    h(kVarArrE, i5, kVar5);
                                                }
                                                objApply2 = objApply3;
                                                i4 = -1;
                                            }
                                        } else if (kVarK instanceof p) {
                                            p pVar = (p) kVarK;
                                            q qVar = pVar.f50198e;
                                            q qVarB = qVar != null ? qVar.b(i2, obj, null) : null;
                                            objApply = biFunction.apply(obj, qVarB == null ? null : qVarB.f50182c);
                                            if (objApply != null) {
                                                if (qVarB != null) {
                                                    qVarB.f50182c = objApply;
                                                } else {
                                                    pVar.e(i2, obj, objApply);
                                                    i4 = 1;
                                                }
                                            } else if (qVarB != null) {
                                                if (pVar.f(qVarB)) {
                                                    h(kVarArrE, i5, p(pVar.f50199f));
                                                }
                                                i4 = -1;
                                            }
                                            i3 = 1;
                                            objApply2 = objApply;
                                        } else if (kVarK instanceof l) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    n(kVarArrE, i5);
                                }
                            }
                        }
                    }
                }
            }
            kVarArrE = e();
        }
        if (i4 != 0) {
            a(i4, i3);
        }
        return objApply2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x008c, code lost:
    
        r5 = r5.f50182c;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.k[] r2 = r13.f50150a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.k r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f50180a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.k[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.k r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f50180a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f50181b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r13 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f50182c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f50182c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.k r3 = r8.f50183d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f50183d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.k r10 = r8.f50183d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.p     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.p r4 = (j$.util.concurrent.p) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.q r8 = r4.f50198e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.q r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f50182c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f50182c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.q r3 = r4.f50199f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.k r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.l     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L4b
            throw r13     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r13
        Lb7:
            j$.util.concurrent.k[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        k[] kVarArr = this.f50150a;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                Object obj2 = kVarA.f50182c;
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

    public final k[] d(k[] kVarArr, k kVar) {
        int i2;
        if (!(kVar instanceof g)) {
            return this.f50150a;
        }
        k[] kVarArr2 = ((g) kVar).f50173e;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(kVarArr.length) | 32768;
        while (kVarArr2 == this.f50151b && this.f50150a == kVarArr && (i2 = this.sizeCtl) < 0 && (i2 >>> 16) == iNumberOfLeadingZeros && i2 != iNumberOfLeadingZeros + 1 && i2 != 65535 + iNumberOfLeadingZeros && this.transferIndex > 0) {
            ConcurrentHashMap<K, V> concurrentHashMap = this;
            if (f50145h.f49788a.compareAndSwapInt(concurrentHashMap, f50146i, i2, i2 + 1)) {
                concurrentHashMap.m(kVarArr, kVarArr2);
                return kVarArr2;
            }
            this = concurrentHashMap;
        }
        return kVarArr2;
    }

    public final k[] e() {
        while (true) {
            k[] kVarArr = this.f50150a;
            if (kVarArr != null && kVarArr.length != 0) {
                return kVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap = this;
                if (f50145h.f49788a.compareAndSwapInt(concurrentHashMap, f50146i, i2, -1)) {
                    try {
                        k[] kVarArr2 = concurrentHashMap.f50150a;
                        if (kVarArr2 == null || kVarArr2.length == 0) {
                            int i3 = i2 > 0 ? i2 : 16;
                            k[] kVarArr3 = new k[i3];
                            concurrentHashMap.f50150a = kVarArr3;
                            i2 = i3 - (i3 >>> 2);
                            kVarArr2 = kVarArr3;
                        }
                        concurrentHashMap.sizeCtl = i2;
                        return kVarArr2;
                    } catch (Throwable th) {
                        concurrentHashMap.sizeCtl = i2;
                        throw th;
                    }
                }
                this = concurrentHashMap;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e eVar = this.f50155f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f50155f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        k[] kVarArr = this.f50150a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj2 = kVarA.f50182c;
            Object obj3 = map.get(kVarA.f50181b);
            if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                break;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r7 = r6.f50182c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (r11 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        r6.f50182c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        k[] kVarArr = this.f50150a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            } else {
                biConsumer.accept(kVarA.f50181b, kVarA.f50182c);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        r9 = r5.f50182c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r15 == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r9 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        if (r15.equals(r9) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r14 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0055, code lost:
    
        r5.f50182c = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r5 = r5.f50183d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005a, code lost:
    
        if (r8 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005c, code lost:
    
        r8.f50183d = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005f, code lost:
    
        h(r1, r3, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.k[] r1 = r12.f50150a
        La:
            r2 = 0
            if (r1 == 0) goto Lbe
            int r3 = r1.length
            if (r3 == 0) goto Lbe
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.k r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lbe
        L1b:
            int r5 = r4.f50180a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.k[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.k r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Lad
            r7 = 1
            if (r5 < 0) goto L6c
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.f50180a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L63
            java.lang.Object r9 = r5.f50181b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L63
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L63
            goto L45
        L42:
            r12 = move-exception
            goto Lbc
        L45:
            java.lang.Object r9 = r5.f50182c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lae
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lae
        L53:
            if (r14 == 0) goto L58
            r5.f50182c = r14     // Catch: java.lang.Throwable -> L42
            goto Laf
        L58:
            j$.util.concurrent.k r5 = r5.f50183d
            if (r8 == 0) goto L5f
            r8.f50183d = r5     // Catch: java.lang.Throwable -> L42
            goto Laf
        L5f:
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Laf
        L63:
            j$.util.concurrent.k r8 = r5.f50183d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L68
            goto Lae
        L68:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6c:
            boolean r5 = r4 instanceof j$.util.concurrent.p     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La0
            r5 = r4
            j$.util.concurrent.p r5 = (j$.util.concurrent.p) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.q r8 = r5.f50198e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            j$.util.concurrent.q r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lae
            java.lang.Object r9 = r8.f50182c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8b
            if (r15 == r9) goto L8b
            if (r9 == 0) goto Lae
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lae
        L8b:
            if (r14 == 0) goto L90
            r8.f50182c = r14     // Catch: java.lang.Throwable -> L42
            goto Laf
        L90:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Laf
            j$.util.concurrent.q r5 = r5.f50199f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.k r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Laf
        La0:
            boolean r3 = r4 instanceof j$.util.concurrent.l     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La5
            goto Lad
        La5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r13 = "Recursive update"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L42
            throw r12     // Catch: java.lang.Throwable -> L42
        Lad:
            r7 = 0
        Lae:
            r9 = r2
        Laf:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lbe
            if (r14 != 0) goto Lbb
            r13 = -1
            r12.a(r13, r6)
        Lbb:
            return r9
        Lbc:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r12
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        int length;
        k kVarK;
        Object obj2;
        int i2 = i(obj.hashCode());
        k[] kVarArr = this.f50150a;
        if (kVarArr == null || (length = kVarArr.length) <= 0 || (kVarK = k(kVarArr, (length - 1) & i2)) == null) {
            return null;
        }
        int i3 = kVarK.f50180a;
        if (i3 == i2) {
            Object obj3 = kVarK.f50181b;
            if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                return (V) kVarK.f50182c;
            }
        } else if (i3 < 0) {
            k kVarA = kVarK.a(i2, obj);
            if (kVarA != null) {
                return (V) kVarA.f50182c;
            }
            return null;
        }
        while (true) {
            kVarK = kVarK.f50183d;
            if (kVarK == null) {
                return null;
            }
            if (kVarK.f50180a == i2 && ((obj2 = kVarK.f50181b) == obj || (obj2 != null && obj.equals(obj2)))) {
                break;
            }
        }
        return (V) kVarK.f50182c;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        k[] kVarArr = this.f50150a;
        int iHashCode = 0;
        if (kVarArr != null) {
            o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
            while (true) {
                k kVarA = oVar.a();
                if (kVarA == null) {
                    break;
                }
                iHashCode += kVarA.f50182c.hashCode() ^ kVarA.f50181b.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    public final long j() {
        c[] cVarArr = this.f50152c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        KeySetView keySetView = this.f50153d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f50153d = keySetView2;
        return keySetView2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r10v9, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r5v4, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r8v10, types: [j$.util.concurrent.k] */
    /* JADX WARN: Type inference failed for: r8v15, types: [j$.util.concurrent.k] */
    public final void m(k[] kVarArr, k[] kVarArr2) {
        k[] kVarArr3;
        int i2;
        boolean z;
        char c2;
        int i3;
        int i4;
        q kVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap = this;
        int length = kVarArr.length;
        int i6 = f50144g;
        boolean z2 = true;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        char c3 = 16;
        int i8 = i7 < 16 ? 16 : i7;
        if (kVarArr2 == null) {
            try {
                k[] kVarArr4 = new k[length << 1];
                concurrentHashMap.f50151b = kVarArr4;
                concurrentHashMap.transferIndex = length;
                kVarArr3 = kVarArr4;
            } catch (Throwable unused) {
                concurrentHashMap.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            kVarArr3 = kVarArr2;
        }
        int length2 = kVarArr3.length;
        g gVar = new g(kVarArr3);
        boolean zB = true;
        int i9 = 0;
        int i10 = 0;
        boolean z3 = false;
        while (true) {
            if (zB) {
                int i11 = i9 - 1;
                if (i11 >= i10 || z3) {
                    i10 = i10;
                    i9 = i11;
                    zB = false;
                } else {
                    int i12 = concurrentHashMap.transferIndex;
                    if (i12 <= 0) {
                        i9 = -1;
                    } else {
                        j$.sun.misc.a aVar = f50145h;
                        long j2 = f50147j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i10;
                        if (aVar.f49788a.compareAndSwapInt(concurrentHashMap, j2, i12, i13)) {
                            i9 = i12 - 1;
                            i10 = i13;
                        } else {
                            i10 = i14;
                            i9 = i11;
                        }
                    }
                    zB = false;
                }
            } else {
                int i15 = i10;
                q kVar2 = null;
                if (i9 < 0 || i9 >= length || (i4 = i9 + length) >= length2) {
                    i2 = length;
                    z = z2;
                    c2 = c3;
                    i3 = i8;
                    if (z3) {
                        concurrentHashMap.f50151b = null;
                        concurrentHashMap.f50150a = kVarArr3;
                        concurrentHashMap.sizeCtl = (i2 << 1) - (i2 >>> 1);
                        return;
                    }
                    j$.sun.misc.a aVar2 = f50145h;
                    long j3 = f50146i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i9;
                    if (!aVar2.f49788a.compareAndSwapInt(concurrentHashMap, j3, i16, i16 - 1)) {
                        i9 = i17;
                    } else {
                        if (i16 - 2 != ((Integer.numberOfLeadingZeros(i2) | 32768) << 16)) {
                            return;
                        }
                        zB = z;
                        z3 = zB;
                        i9 = i2;
                    }
                } else {
                    ?? K = k(kVarArr, i9);
                    if (K == 0) {
                        zB = b(kVarArr, i9, gVar);
                        i2 = length;
                        z = z2;
                        c2 = c3;
                        i3 = i8;
                    } else {
                        z = z2;
                        int i18 = K.f50180a;
                        if (i18 == -1) {
                            i2 = length;
                            c2 = c3;
                            i3 = i8;
                            zB = z;
                        } else {
                            synchronized (K) {
                                try {
                                    if (k(kVarArr, i9) == K) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            q qVar = K;
                                            for (q qVar2 = K.f50183d; qVar2 != null; qVar2 = qVar2.f50183d) {
                                                char c4 = c3;
                                                int i20 = qVar2.f50180a & length;
                                                if (i20 != i19) {
                                                    qVar = qVar2;
                                                    i19 = i20;
                                                }
                                                c3 = c4;
                                            }
                                            c2 = c3;
                                            if (i19 == 0) {
                                                kVar = null;
                                                kVar2 = qVar;
                                            } else {
                                                kVar = qVar;
                                            }
                                            k kVar3 = K;
                                            while (kVar3 != qVar) {
                                                int i21 = kVar3.f50180a;
                                                Object obj = kVar3.f50181b;
                                                int i22 = length;
                                                Object obj2 = kVar3.f50182c;
                                                if ((i21 & i22) == 0) {
                                                    i5 = i8;
                                                    kVar2 = new k(i21, obj, obj2, kVar2);
                                                } else {
                                                    i5 = i8;
                                                    kVar = new k(i21, obj, obj2, kVar);
                                                }
                                                kVar3 = kVar3.f50183d;
                                                length = i22;
                                                i8 = i5;
                                            }
                                            i2 = length;
                                            i3 = i8;
                                            h(kVarArr3, i9, kVar2);
                                            h(kVarArr3, i4, kVar);
                                            h(kVarArr, i9, gVar);
                                        } else {
                                            i2 = length;
                                            c2 = c3;
                                            i3 = i8;
                                            if (K instanceof p) {
                                                p pVar = (p) K;
                                                q qVar3 = null;
                                                q qVar4 = null;
                                                k kVar4 = pVar.f50199f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                q qVar5 = null;
                                                while (kVar4 != null) {
                                                    p pVar2 = pVar;
                                                    int i25 = kVar4.f50180a;
                                                    q qVar6 = new q(i25, kVar4.f50181b, kVar4.f50182c, null, null);
                                                    if ((i25 & i2) == 0) {
                                                        qVar6.f50204h = qVar4;
                                                        if (qVar4 == null) {
                                                            kVar2 = qVar6;
                                                        } else {
                                                            qVar4.f50183d = qVar6;
                                                        }
                                                        i23++;
                                                        qVar4 = qVar6;
                                                    } else {
                                                        qVar6.f50204h = qVar3;
                                                        if (qVar3 == null) {
                                                            qVar5 = qVar6;
                                                        } else {
                                                            qVar3.f50183d = qVar6;
                                                        }
                                                        i24++;
                                                        qVar3 = qVar6;
                                                    }
                                                    kVar4 = kVar4.f50183d;
                                                    pVar = pVar2;
                                                }
                                                p pVar3 = pVar;
                                                k kVarP = i23 <= 6 ? p(kVar2) : i24 != 0 ? new p(kVar2) : pVar3;
                                                k kVarP2 = i24 <= 6 ? p(qVar5) : i23 != 0 ? new p(qVar5) : pVar3;
                                                h(kVarArr3, i9, kVarP);
                                                h(kVarArr3, i4, kVarP2);
                                                h(kVarArr, i9, gVar);
                                            }
                                        }
                                        zB = z;
                                    } else {
                                        i2 = length;
                                        c2 = c3;
                                        i3 = i8;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                concurrentHashMap = this;
                i10 = i15;
                z2 = z;
                c3 = c2;
                length = i2;
                i8 = i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public final void n(k[] kVarArr, int i2) {
        int length = kVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        k kVarK = k(kVarArr, i2);
        if (kVarK == null || kVarK.f50180a < 0) {
            return;
        }
        synchronized (kVarK) {
            try {
                if (k(kVarArr, i2) == kVarK) {
                    q qVar = null;
                    k kVar = kVarK;
                    q qVar2 = null;
                    while (kVar != null) {
                        q qVar3 = new q(kVar.f50180a, kVar.f50181b, kVar.f50182c, null, null);
                        qVar3.f50204h = qVar2;
                        if (qVar2 == null) {
                            qVar = qVar3;
                        } else {
                            qVar2.f50183d = qVar3;
                        }
                        kVar = kVar.f50183d;
                        qVar2 = qVar3;
                    }
                    h(kVarArr, i2, new p(qVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(int i2) {
        ConcurrentHashMap<K, V> concurrentHashMap;
        int length;
        int iL = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            k[] kVarArr = this.f50150a;
            if (kVarArr == null || (length = kVarArr.length) == 0) {
                concurrentHashMap = this;
                int i4 = i3 > iL ? i3 : iL;
                if (f50145h.f49788a.compareAndSwapInt(concurrentHashMap, f50146i, i3, -1)) {
                    try {
                        if (concurrentHashMap.f50150a == kVarArr) {
                            concurrentHashMap.f50150a = new k[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        concurrentHashMap.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (iL <= i3 || length >= 1073741824) {
                    return;
                }
                if (kVarArr == this.f50150a) {
                    int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    j$.sun.misc.a aVar = f50145h;
                    long j2 = f50146i;
                    int i5 = (iNumberOfLeadingZeros << 16) + 2;
                    Unsafe unsafe = aVar.f49788a;
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
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        k[] kVarArr = this.f50150a;
        if (kVarArr == null) {
            return;
        }
        o oVar = new o(kVarArr, kVarArr.length, 0, kVarArr.length);
        while (true) {
            k kVarA = oVar.a();
            if (kVarA == null) {
                return;
            }
            Object obj = kVarA.f50182c;
            Object obj2 = kVarA.f50181b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (g(obj2, objApply, obj) == null) {
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
        if (j2 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        k[] kVarArr = this.f50150a;
        int length = kVarArr == null ? 0 : kVarArr.length;
        o oVar = new o(kVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        k kVarA = oVar.a();
        if (kVarA != null) {
            while (true) {
                Object obj = kVarA.f50181b;
                Object obj2 = kVarA.f50182c;
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
        r rVar = this.f50154e;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.f50154e = rVar2;
        return rVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return g(obj, obj2, null);
        }
        throw null;
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap() {
    }
}
