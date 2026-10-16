package androidx.compose.runtime.retain.impl;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectListKt;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class SafeMultiValueMap<K, V> {
    private final MutableScatterMap<Object, Object> map;

    /* compiled from: WazeSource */
    public final class ValueSafetyWrapper {
        public static final int $stable = 8;
        private final Object value;

        public ValueSafetyWrapper(Object obj) {
            this.value = obj;
        }

        public final Object getValue() {
            return this.value;
        }
    }

    private /* synthetic */ SafeMultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m7593addimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, V v) {
        Object objMutableObjectListOf;
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k2);
        boolean z = iFindInsertIndex < 0;
        Object value = null;
        Object obj = z ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj == null) {
            objMutableObjectListOf = m7609safeWrapIfNecessaryimpl$runtime_retain(mutableScatterMap, v);
        } else if (obj instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            mutableObjectList.add(v);
            objMutableObjectListOf = mutableObjectList;
        } else {
            if (obj instanceof ValueSafetyWrapper) {
                value = ((ValueSafetyWrapper) obj).getValue();
            } else if (obj != SafeMultiValueMapKt.NULL_SENTINEL) {
                value = obj;
            }
            objMutableObjectListOf = ObjectListKt.mutableObjectListOf(value, v);
        }
        if (!z) {
            mutableScatterMap.values[iFindInsertIndex] = objMutableObjectListOf;
            return;
        }
        int i2 = ~iFindInsertIndex;
        mutableScatterMap.keys[i2] = k2;
        mutableScatterMap.values[i2] = objMutableObjectListOf;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SafeMultiValueMap m7594boximpl(MutableScatterMap mutableScatterMap) {
        return new SafeMultiValueMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m7595clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m7597constructorimpl$default(MutableScatterMap mutableScatterMap, int i2, o oVar) {
        return (i2 & 1) != 0 ? new MutableScatterMap(0, 1, null) : mutableScatterMap;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7598containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        return mutableScatterMap.contains(k2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7599equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof SafeMultiValueMap) && x.n(mutableScatterMap, ((SafeMultiValueMap) obj).m7613unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7600equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return x.n(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m7601forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, l<? super V, ab> lVar) {
        int i2;
        MutableScatterMap<Object, Object> mutableScatterMap2 = mutableScatterMap;
        Object[] objArr = mutableScatterMap2.values;
        long[] jArr = mutableScatterMap2.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i3 - length;
                int i5 = 0;
                while (true) {
                    i2 = 8 - ((~i4) >>> 31);
                    if (i5 >= i2) {
                        break;
                    }
                    if ((255 & j2) < 128) {
                        Object obj = objArr[(i3 << 3) + i5];
                        if (obj instanceof MutableObjectList) {
                            x.d(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                            MutableObjectList mutableObjectList = (MutableObjectList) obj;
                            Object[] objArr2 = mutableObjectList.content;
                            int i6 = mutableObjectList._size;
                            for (int i7 = 0; i7 < i6; i7++) {
                                lVar.invoke(objArr2[i7]);
                            }
                        } else {
                            lVar.invoke(obj);
                        }
                    }
                    j2 >>= 8;
                    i5++;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7603hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7604isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m7605isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m7606removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, V v) {
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        Object obj = mutableScatterMap.get(k2);
        if (obj == null) {
            return v;
        }
        if (!(obj instanceof MutableObjectList)) {
            V v2 = (V) mutableScatterMap.remove(k2);
            if (v2 instanceof ValueSafetyWrapper) {
                return (V) ((ValueSafetyWrapper) v2).getValue();
            }
            if (v2 == SafeMultiValueMapKt.NULL_SENTINEL) {
                return null;
            }
            return v2;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) obj;
        V v3 = (V) mutableObjectList.removeAt(0);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k2);
        }
        if (mutableObjectList.getSize() != 1) {
            return v3;
        }
        mutableScatterMap.set(k2, m7609safeWrapIfNecessaryimpl$runtime_retain(mutableScatterMap, mutableObjectList.first()));
        return v3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m7608removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, V v) {
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        V v2 = (V) mutableScatterMap.get(k2);
        if (v2 == 0) {
            return v;
        }
        if (!(v2 instanceof MutableObjectList)) {
            mutableScatterMap.remove(k2);
            if (v2 instanceof ValueSafetyWrapper) {
                return (V) ((ValueSafetyWrapper) v2).getValue();
            }
            if (v2 == SafeMultiValueMapKt.NULL_SENTINEL) {
                return null;
            }
            return v2;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v2;
        V v3 = (V) mutableObjectList.removeAt(mutableObjectList.getSize() - 1);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k2);
        }
        if (mutableObjectList.getSize() != 1) {
            return v3;
        }
        mutableScatterMap.set(k2, m7609safeWrapIfNecessaryimpl$runtime_retain(mutableScatterMap, mutableObjectList.first()));
        return v3;
    }

    /* renamed from: safeWrapIfNecessary-impl$runtime_retain, reason: not valid java name */
    public static final Object m7609safeWrapIfNecessaryimpl$runtime_retain(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return obj instanceof MutableObjectList ? new ValueSafetyWrapper(obj) : obj == null ? SafeMultiValueMapKt.NULL_SENTINEL : obj;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7610toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "SafeMultiValueMap(map=" + mutableScatterMap + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: unwrapSafeValue-impl$runtime_retain, reason: not valid java name */
    public static final V m7611unwrapSafeValueimpl$runtime_retain(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        if (obj instanceof ValueSafetyWrapper) {
            return (V) ((ValueSafetyWrapper) obj).getValue();
        }
        if (obj == SafeMultiValueMapKt.NULL_SENTINEL) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.ObjectList<V> m7612valuesimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r15) {
        /*
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto Lb
            androidx.collection.ObjectList r15 = androidx.collection.ObjectListKt.emptyObjectList()
            return r15
        Lb:
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 0
            r2 = 0
            r3 = 1
            r0.<init>(r2, r3, r1)
            androidx.collection.ScatterMap r15 = (androidx.collection.ScatterMap) r15
            java.lang.Object[] r1 = r15.values
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L68
            r4 = r2
        L1f:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L63
            int r7 = r4 - r3
            r8 = r2
        L32:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L61
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L5d
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            boolean r11 = r9 instanceof androidx.collection.MutableObjectList
            if (r11 == 0) goto L5a
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>"
            h.g.b.x.d(r9, r11)
            androidx.collection.MutableObjectList r9 = (androidx.collection.MutableObjectList) r9
            androidx.collection.ObjectList r9 = (androidx.collection.ObjectList) r9
            r0.addAll(r9)
            goto L5d
        L5a:
            r0.add(r9)
        L5d:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L32
        L61:
            if (r9 != r10) goto L68
        L63:
            if (r4 == r3) goto L68
            int r4 = r4 + 1
            goto L1f
        L68:
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.retain.impl.SafeMultiValueMap.m7612valuesimpl(androidx.collection.MutableScatterMap):androidx.collection.ObjectList");
    }

    public boolean equals(Object obj) {
        return m7599equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m7603hashCodeimpl(this.map);
    }

    public String toString() {
        return m7610toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m7613unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m7596constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m7607removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        V v = (V) mutableScatterMap.get(k2);
        if (v == 0) {
            return null;
        }
        if (v instanceof MutableObjectList) {
            MutableObjectList mutableObjectList = (MutableObjectList) v;
            V v2 = (V) mutableObjectList.removeAt(mutableObjectList.getSize() - 1);
            if (mutableObjectList.getSize() != 1) {
                return v2;
            }
            mutableScatterMap.set(k2, m7609safeWrapIfNecessaryimpl$runtime_retain(mutableScatterMap, mutableObjectList.first()));
            return v2;
        }
        mutableScatterMap.remove(k2);
        if (!(v instanceof ValueSafetyWrapper)) {
            if (v == SafeMultiValueMapKt.NULL_SENTINEL) {
                return null;
            }
            return v;
        }
        return (V) ((ValueSafetyWrapper) v).getValue();
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m7602forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, l<? super V, ab> lVar) {
        if (k2 == null) {
            k2 = (K) SafeMultiValueMapKt.NULL_SENTINEL;
        }
        Object value = mutableScatterMap.get(k2);
        if (value != null) {
            if (!(value instanceof MutableObjectList)) {
                if (!(value instanceof ValueSafetyWrapper)) {
                    if (value == SafeMultiValueMapKt.NULL_SENTINEL) {
                        value = null;
                    }
                } else {
                    value = ((ValueSafetyWrapper) value).getValue();
                }
                lVar.invoke(value);
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) value;
            Object[] objArr = mutableObjectList.content;
            int i2 = mutableObjectList._size;
            for (int i3 = 0; i3 < i2; i3++) {
                lVar.invoke(objArr[i3]);
            }
        }
    }
}
