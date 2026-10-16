package androidx.compose.runtime.collection;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.k.j;
import h.k.n;
import java.util.Arrays;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class MultiValueMap<K, V> {
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ MultiValueMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m7356addimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, V v) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(k2);
        boolean z = iFindInsertIndex < 0;
        Object obj = z ? null : mutableScatterMap.values[iFindInsertIndex];
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                MutableObjectList mutableObjectList = (MutableObjectList) obj;
                mutableObjectList.add(v);
                v = mutableObjectList;
            } else {
                v = (V) ObjectListKt.mutableObjectListOf(obj, v);
            }
        }
        if (!z) {
            mutableScatterMap.values[iFindInsertIndex] = v;
            return;
        }
        int i2 = ~iFindInsertIndex;
        mutableScatterMap.keys[i2] = k2;
        mutableScatterMap.values[i2] = v;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ MultiValueMap m7357boximpl(MutableScatterMap mutableScatterMap) {
        return new MultiValueMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m7358clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m7360constructorimpl$default(MutableScatterMap mutableScatterMap, int i2, o oVar) {
        return (i2 & 1) != 0 ? new MutableScatterMap(0, 1, null) : mutableScatterMap;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7361containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        return mutableScatterMap.contains(k2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7362equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof MultiValueMap) && x.n(mutableScatterMap, ((MultiValueMap) obj).m7375unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7363equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return x.n(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m7364forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, l<? super V, ab> lVar) {
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
                            ObjectList objectList = (ObjectList) obj;
                            Object[] objArr2 = objectList.content;
                            int i6 = objectList._size;
                            for (int i7 = 0; i7 < i6; i7++) {
                                Object obj2 = objArr2[i7];
                                x.d(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                lVar.invoke(obj2);
                            }
                        } else {
                            x.d(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
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

    /* renamed from: get-impl, reason: not valid java name */
    public static final ObjectList<V> m7366getimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        Object obj = mutableScatterMap.get(k2);
        return obj == null ? ObjectListKt.emptyObjectList() : obj instanceof MutableObjectList ? (ObjectList) obj : ObjectListKt.objectListOf(obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7367hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7368isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m7369isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeFirst-impl, reason: not valid java name */
    public static final V m7370removeFirstimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        V v = (V) mutableScatterMap.get(k2);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof MutableObjectList)) {
            mutableScatterMap.remove(k2);
            return v;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v;
        V v2 = (V) mutableObjectList.removeAt(0);
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k2);
        }
        if (mutableObjectList.getSize() != 1) {
            return v2;
        }
        mutableScatterMap.set(k2, mutableObjectList.first());
        return v2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: removeLast-impl, reason: not valid java name */
    public static final V m7371removeLastimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2) {
        V v = (V) mutableScatterMap.get(k2);
        if (v == 0) {
            return null;
        }
        if (!(v instanceof MutableObjectList)) {
            mutableScatterMap.remove(k2);
            return v;
        }
        MutableObjectList mutableObjectList = (MutableObjectList) v;
        V v2 = (V) ExtensionsKt.removeLast(mutableObjectList);
        x.d(v2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (mutableObjectList.isEmpty()) {
            mutableScatterMap.remove(k2);
        }
        if (mutableObjectList.getSize() != 1) {
            return v2;
        }
        mutableScatterMap.set(k2, mutableObjectList.first());
        return v2;
    }

    /* renamed from: removeValueIf-impl, reason: not valid java name */
    public static final void m7372removeValueIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, l<? super V, Boolean> lVar) {
        Object obj = mutableScatterMap.get(k2);
        if (obj != null) {
            if (!(obj instanceof MutableObjectList)) {
                if (lVar.invoke(obj).booleanValue()) {
                    mutableScatterMap.remove(k2);
                    return;
                }
                return;
            }
            MutableObjectList mutableObjectList = (MutableObjectList) obj;
            int i2 = mutableObjectList._size;
            Object[] objArr = mutableObjectList.content;
            int i3 = 0;
            j jVarU = n.u(0, mutableObjectList._size);
            int iA = jVarU.a();
            int iB = jVarU.b();
            if (iA <= iB) {
                while (true) {
                    objArr[iA - i3] = objArr[iA];
                    if (lVar.invoke(objArr[iA]).booleanValue()) {
                        i3++;
                    }
                    if (iA == iB) {
                        break;
                    } else {
                        iA++;
                    }
                }
            }
            x.f(objArr, "<this>");
            Arrays.fill(objArr, i2 - i3, i2, (Object) null);
            mutableObjectList._size -= i3;
            if (mutableObjectList.isEmpty()) {
                mutableScatterMap.remove(k2);
            }
            if (mutableObjectList.getSize() == 1) {
                mutableScatterMap.set(k2, mutableObjectList.first());
            }
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7373toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "MultiValueMap(map=" + mutableScatterMap + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* renamed from: values-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.collection.ObjectList<V> m7374valuesimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r15) {
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
            if (r3 < 0) goto L6d
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
            if (r7 == 0) goto L68
            int r7 = r4 - r3
            r8 = r2
        L32:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L62
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            boolean r11 = r9 instanceof androidx.collection.MutableObjectList
            if (r11 == 0) goto L5a
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>"
            h.g.b.x.d(r9, r11)
            androidx.collection.MutableObjectList r9 = (androidx.collection.MutableObjectList) r9
            androidx.collection.ObjectList r9 = (androidx.collection.ObjectList) r9
            r0.addAll(r9)
            goto L62
        L5a:
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap"
            h.g.b.x.d(r9, r11)
            r0.add(r9)
        L62:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L32
        L66:
            if (r9 != r10) goto L6d
        L68:
            if (r4 == r3) goto L6d
            int r4 = r4 + 1
            goto L1f
        L6d:
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.MultiValueMap.m7374valuesimpl(androidx.collection.MutableScatterMap):androidx.collection.ObjectList");
    }

    public boolean equals(Object obj) {
        return m7362equalsimpl(this.map, obj);
    }

    public int hashCode() {
        return m7367hashCodeimpl(this.map);
    }

    public String toString() {
        return m7373toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m7375unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <K, V> MutableScatterMap<Object, Object> m7359constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: forEachValue-impl, reason: not valid java name */
    public static final void m7365forEachValueimpl(MutableScatterMap<Object, Object> mutableScatterMap, K k2, l<? super V, ab> lVar) {
        Object obj = mutableScatterMap.get(k2);
        if (obj != null) {
            if (obj instanceof MutableObjectList) {
                ObjectList objectList = (ObjectList) obj;
                Object[] objArr = objectList.content;
                int i2 = objectList._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object obj2 = objArr[i3];
                    x.d(obj2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                    lVar.invoke(obj2);
                }
                return;
            }
            lVar.invoke(obj);
        }
    }
}
