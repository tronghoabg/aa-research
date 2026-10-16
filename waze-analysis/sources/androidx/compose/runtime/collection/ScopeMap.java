package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {
    private final MutableScatterMap<Object, Object> map;

    private /* synthetic */ ScopeMap(MutableScatterMap mutableScatterMap) {
        this.map = mutableScatterMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.collection.MutableScatterSet] */
    /* renamed from: add-impl, reason: not valid java name */
    public static final void m7376addimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        int iFindInsertIndex = mutableScatterMap.findInsertIndex(key);
        int i2 = 1;
        int i3 = 0;
        boolean z = iFindInsertIndex < 0;
        o oVar = null;
        Scope scope2 = z ? null : mutableScatterMap.values[iFindInsertIndex];
        if (scope2 != null) {
            if (scope2 instanceof MutableScatterSet) {
                ((MutableScatterSet) scope2).add(scope);
            } else if (scope2 != scope) {
                ?? mutableScatterSet = new MutableScatterSet(i3, i2, oVar);
                mutableScatterSet.add(scope2);
                mutableScatterSet.add(scope);
                scope = mutableScatterSet;
            }
            scope = scope2;
        }
        if (!z) {
            mutableScatterMap.values[iFindInsertIndex] = scope;
            return;
        }
        int i4 = ~iFindInsertIndex;
        mutableScatterMap.keys[i4] = key;
        mutableScatterMap.values[i4] = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* renamed from: addAll-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7377addAllimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r5, Key r6, androidx.collection.ScatterSet<Scope> r7) {
        /*
            int r0 = r5.findInsertIndex(r6)
            r1 = 1
            if (r0 >= 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto Le
            r3 = 0
            goto L12
        Le:
            java.lang.Object[] r3 = r5.values
            r3 = r3[r0]
        L12:
            if (r3 != 0) goto L1c
            androidx.collection.MutableScatterSet r3 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            r3.addAll(r7)
            goto L3d
        L1c:
            boolean r4 = r3 instanceof androidx.collection.MutableScatterSet
            if (r4 == 0) goto L26
            androidx.collection.MutableScatterSet r3 = (androidx.collection.MutableScatterSet) r3
            r3.addAll(r7)
            goto L3d
        L26:
            int r4 = r7.getSize()
            if (r4 != r1) goto L32
            boolean r1 = r7.contains(r3)
            if (r1 != 0) goto L3d
        L32:
            androidx.collection.MutableScatterSet r1 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            r1.addAll(r7)
            r1.add(r3)
            r3 = r1
        L3d:
            if (r2 == 0) goto L49
            int r7 = ~r0
            java.lang.Object[] r0 = r5.keys
            r0[r7] = r6
            java.lang.Object[] r5 = r5.values
            r5[r7] = r3
            return
        L49:
            java.lang.Object[] r5 = r5.values
            r5[r0] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m7377addAllimpl(androidx.collection.MutableScatterMap, java.lang.Object, androidx.collection.ScatterSet):void");
    }

    /* renamed from: anyScopeOf-impl, reason: not valid java name */
    public static final boolean m7378anyScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, l<? super Scope, Boolean> lVar) {
        Object obj = mutableScatterMap.get(key);
        if (obj != null) {
            if (obj instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        } else {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                int i5 = 8 - ((~i3) >>> 31);
                                if (i4 >= i5) {
                                    if (i5 != 8) {
                                        break;
                                    }
                                } else {
                                    if ((255 & j2) < 128 && lVar.invoke(objArr[(i2 << 3) + i4]).booleanValue()) {
                                        return true;
                                    }
                                    j2 >>= 8;
                                    i4++;
                                }
                            }
                        }
                    }
                }
            } else if (lVar.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* renamed from: asMap-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<Key, java.util.Set<Scope>> m7379asMapimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r17) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r17
            androidx.collection.ScatterMap r1 = (androidx.collection.ScatterMap) r1
            java.lang.Object[] r2 = r1.keys
            java.lang.Object[] r3 = r1.values
            long[] r1 = r1.metadata
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L76
            r5 = 0
            r6 = r5
        L16:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L71
            int r9 = r6 - r4
            r10 = r5
        L29:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L6b
            int r11 = r6 << 3
            int r11 = r11 + r10
            r13 = r2[r11]
            r11 = r3[r11]
            r14 = r0
            java.util.Map r14 = (java.util.Map) r14
            java.lang.String r15 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap"
            h.g.b.x.d(r13, r15)
            boolean r15 = r11 instanceof androidx.collection.MutableScatterSet
            if (r15 == 0) goto L5a
            java.lang.String r15 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            h.g.b.x.d(r11, r15)
            androidx.collection.MutableScatterSet r11 = (androidx.collection.MutableScatterSet) r11
            java.util.Set r11 = r11.asSet()
            goto L68
        L5a:
            java.lang.String r15 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap"
            h.g.b.x.d(r11, r15)
            r15 = 1
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r15[r5] = r11
            java.util.Set r11 = e.c.d.a.q(r15)
        L68:
            r14.put(r13, r11)
        L6b:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L29
        L6f:
            if (r11 != r12) goto L76
        L71:
            if (r6 == r4) goto L76
            int r6 = r6 + 1
            goto L16
        L76:
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m7379asMapimpl(androidx.collection.MutableScatterMap):java.util.Map");
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ScopeMap m7380boximpl(MutableScatterMap mutableScatterMap) {
        return new ScopeMap(mutableScatterMap);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m7381clearimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        mutableScatterMap.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableScatterMap m7383constructorimpl$default(MutableScatterMap mutableScatterMap, int i2, o oVar) {
        return (i2 & 1) != 0 ? ScatterMapKt.mutableScatterMapOf() : mutableScatterMap;
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7384containsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key) {
        return mutableScatterMap.containsKey(key);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7385equalsimpl(MutableScatterMap<Object, Object> mutableScatterMap, Object obj) {
        return (obj instanceof ScopeMap) && x.n(mutableScatterMap, ((ScopeMap) obj).m7402unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7386equalsimpl0(MutableScatterMap<Object, Object> mutableScatterMap, MutableScatterMap<Object, Object> mutableScatterMap2) {
        return x.n(mutableScatterMap, mutableScatterMap2);
    }

    /* renamed from: forEach-impl, reason: not valid java name */
    public static final void m7387forEachimpl(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Key, Object, ab> pVar) {
        int i2;
        MutableScatterMap<Object, Object> mutableScatterMap2 = mutableScatterMap;
        Object[] objArr = mutableScatterMap2.keys;
        Object[] objArr2 = mutableScatterMap2.values;
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
                        int i6 = (i3 << 3) + i5;
                        Object obj = objArr[i6];
                        Object obj2 = objArr2[i6];
                        x.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                        pVar.invoke(obj, obj2);
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

    /* renamed from: forEachKey-impl, reason: not valid java name */
    public static final void m7388forEachKeyimpl(MutableScatterMap<Object, Object> mutableScatterMap, l<? super Key, ab> lVar) {
        int i2;
        MutableScatterMap<Object, Object> mutableScatterMap2 = mutableScatterMap;
        x.d(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        au.h(lVar, 1);
        Object[] objArr = mutableScatterMap2.keys;
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
                        lVar.invoke(objArr[(i3 << 3) + i5]);
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

    /* renamed from: forEachScopeOf-impl, reason: not valid java name */
    public static final void m7389forEachScopeOfimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, l<? super Scope, ab> lVar) {
        int i2;
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return;
        }
        if (!(obj instanceof MutableScatterSet)) {
            lVar.invoke(obj);
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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
                        lVar.invoke(objArr[(i3 << 3) + i5]);
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
    public static final Object m7390getimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key) {
        return mutableScatterMap.get(key);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m7391getSizeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.getSize();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7392hashCodeimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7393isEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m7394isNotEmptyimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap.isNotEmpty();
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m7396removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        Object obj = mutableScatterMap.get(key);
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableScatterSet)) {
            if (!x.n(obj, scope)) {
                return false;
            }
            mutableScatterMap.remove(key);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
        boolean zRemove = mutableScatterSet.remove(scope);
        if (!zRemove || !mutableScatterSet.isEmpty()) {
            return zRemove;
        }
        mutableScatterMap.remove(key);
        return true;
    }

    /* renamed from: removeIf-impl, reason: not valid java name */
    public static final void m7397removeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, p<? super Key, ? super Scope, Boolean> pVar) {
        long[] jArr;
        int i2;
        long[] jArr2;
        long j2;
        int i3;
        int i4;
        char c2;
        long j3;
        char c3;
        boolean zBooleanValue;
        long[] jArr3;
        long j4;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr4[i5];
            char c4 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = i5 - length;
                int i7 = 0;
                while (true) {
                    i2 = 8 - ((~i6) >>> 31);
                    if (i7 >= i2) {
                        break;
                    }
                    if ((j5 & 255) < 128) {
                        int i8 = (i5 << 3) + i7;
                        Object obj = mutableScatterMap.keys[i8];
                        c2 = c4;
                        Object obj2 = mutableScatterMap.values[i8];
                        j3 = j6;
                        x.d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                        if (obj2 instanceof MutableScatterSet) {
                            x.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            long[] jArr5 = mutableScatterSet.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                j2 = j5;
                                int i9 = 8;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr5[i10];
                                    i3 = i6;
                                    i4 = i7;
                                    if ((((~j7) << c2) & j7 & j3) != j3) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j7 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i13 = (i10 << 3) + i12;
                                                j4 = j7;
                                                if (pVar.invoke(obj, objArr[i13]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i13);
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                            i12++;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i11 != i9) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    i6 = i3;
                                    i7 = i4;
                                    jArr4 = jArr2;
                                    i9 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j2 = j5;
                                i3 = i6;
                                i4 = i7;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j2 = j5;
                            i3 = i6;
                            i4 = i7;
                            x.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = pVar.invoke(obj, obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i8);
                        }
                        c3 = '\b';
                    } else {
                        jArr2 = jArr4;
                        j2 = j5;
                        i3 = i6;
                        i4 = i7;
                        c2 = c4;
                        j3 = j6;
                        c3 = '\b';
                    }
                    j5 = j2 >> c3;
                    i7 = i4 + 1;
                    c4 = c2;
                    j6 = j3;
                    i6 = i3;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i2 != 8) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i5 == length) {
                return;
            }
            i5++;
            jArr4 = jArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* renamed from: removeScope-impl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7398removeScopeimpl(androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r14, Scope r15) {
        /*
            r0 = r14
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            long[] r0 = r0.metadata
            int r1 = r0.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L61
            r2 = 0
            r3 = r2
        Lc:
            r4 = r0[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L5c
            int r6 = r3 - r1
            r7 = r2
        L1f:
            int r8 = ~r6
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            if (r7 >= r8) goto L5a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r4
            r12 = 128(0x80, double:6.3E-322)
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L56
            int r8 = r3 << 3
            int r8 = r8 + r7
            java.lang.Object[] r10 = r14.keys
            r10 = r10[r8]
            java.lang.Object[] r10 = r14.values
            r10 = r10[r8]
            boolean r11 = r10 instanceof androidx.collection.MutableScatterSet
            if (r11 == 0) goto L51
            java.lang.String r11 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>"
            h.g.b.x.d(r10, r11)
            androidx.collection.MutableScatterSet r10 = (androidx.collection.MutableScatterSet) r10
            r10.remove(r15)
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L56
            goto L53
        L51:
            if (r10 != r15) goto L56
        L53:
            r14.removeValueAt(r8)
        L56:
            long r4 = r4 >> r9
            int r7 = r7 + 1
            goto L1f
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r3 == r1) goto L61
            int r3 = r3 + 1
            goto Lc
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.m7398removeScopeimpl(androidx.collection.MutableScatterMap, java.lang.Object):void");
    }

    /* renamed from: removeScopeIf-impl, reason: not valid java name */
    public static final void m7399removeScopeIfimpl(MutableScatterMap<Object, Object> mutableScatterMap, l<? super Scope, Boolean> lVar) {
        long[] jArr;
        int i2;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        char c3;
        boolean zBooleanValue;
        long[] jArr3;
        int i3;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c4 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = i4 - length;
                int i6 = 0;
                while (true) {
                    i2 = 8 - ((~i5) >>> 31);
                    if (i6 >= i2) {
                        break;
                    }
                    if ((j4 & 255) < 128) {
                        int i7 = (i4 << 3) + i6;
                        Object obj = mutableScatterMap.keys[i7];
                        Object obj2 = mutableScatterMap.values[i7];
                        c2 = c4;
                        if (obj2 instanceof MutableScatterSet) {
                            x.d(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                            Object[] objArr = mutableScatterSet.elements;
                            j3 = j5;
                            long[] jArr5 = mutableScatterSet.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i8 = 0;
                                int i9 = 8;
                                while (true) {
                                    long j6 = jArr5[i8];
                                    j2 = j4;
                                    if ((((~j6) << c2) & j6 & j3) != j3) {
                                        int i10 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i11 = 0;
                                        while (i11 < i10) {
                                            if ((j6 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i12 = (i8 << 3) + i11;
                                                i3 = i11;
                                                if (lVar.invoke(objArr[i12]).booleanValue()) {
                                                    mutableScatterSet.removeElementAt(i12);
                                                }
                                            } else {
                                                jArr3 = jArr4;
                                                i3 = i11;
                                            }
                                            j6 >>= i9;
                                            i11 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i10 != i9) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    int i13 = i8;
                                    if (i13 == length2) {
                                        break;
                                    }
                                    i8 = i13 + 1;
                                    j4 = j2;
                                    jArr4 = jArr2;
                                    i9 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j2 = j4;
                            }
                            zBooleanValue = mutableScatterSet.isEmpty();
                        } else {
                            jArr2 = jArr4;
                            j2 = j4;
                            j3 = j5;
                            x.d(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                            zBooleanValue = lVar.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            mutableScatterMap.removeValueAt(i7);
                        }
                        c3 = '\b';
                    } else {
                        jArr2 = jArr4;
                        j2 = j4;
                        c2 = c4;
                        j3 = j5;
                        c3 = '\b';
                    }
                    j4 = j2 >> c3;
                    i6++;
                    c4 = c2;
                    j5 = j3;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i2 != 8) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            jArr4 = jArr;
        }
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m7400setimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key, Scope scope) {
        mutableScatterMap.set(key, scope);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7401toStringimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return "ScopeMap(map=" + mutableScatterMap + ')';
    }

    public boolean equals(Object obj) {
        return m7385equalsimpl(this.map, obj);
    }

    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public int hashCode() {
        return m7392hashCodeimpl(this.map);
    }

    public String toString() {
        return m7401toStringimpl(this.map);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableScatterMap m7402unboximpl() {
        return this.map;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <Key, Scope> MutableScatterMap<Object, Object> m7382constructorimpl(MutableScatterMap<Object, Object> mutableScatterMap) {
        return mutableScatterMap;
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final Object m7395removeimpl(MutableScatterMap<Object, Object> mutableScatterMap, Key key) {
        return mutableScatterMap.remove(key);
    }
}
