package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import h.a.c;
import h.g.b.x;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SparseArrayCompatKt {
    private static final Object DELETED = new Object();

    public static final <E> void commonAppend(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        x.f(sparseArrayCompat, "<this>");
        int i3 = sparseArrayCompat.size;
        if (i3 != 0 && i2 <= sparseArrayCompat.keys[i3 - 1]) {
            sparseArrayCompat.put(i2, e2);
            return;
        }
        if (sparseArrayCompat.garbage && i3 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
        }
        int i4 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        if (i4 >= iArr.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i4 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
            x.e(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i4] = i2;
        sparseArrayCompat.values[i4] = e2;
        sparseArrayCompat.size = i4 + 1;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        int i2 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i2) >= 0;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> sparseArrayCompat, E e2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (sparseArrayCompat.values[i3] != e2) {
                i3++;
            } else if (i3 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        E e2;
        x.f(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch < 0 || (e2 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) {
            return null;
        }
        return e2;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> sparseArrayCompat, E e2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (sparseArrayCompat.values[i3] == e2) {
                return i3;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        if (i2 >= sparseArrayCompat.size || i2 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return sparseArrayCompat.keys[i2];
    }

    public static final <E> void commonPut(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        x.f(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e2;
            return;
        }
        int i3 = ~iBinarySearch;
        int i4 = sparseArrayCompat.size;
        if (i3 < i4) {
            Object[] objArr = sparseArrayCompat.values;
            if (objArr[i3] == DELETED) {
                sparseArrayCompat.keys[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (sparseArrayCompat.garbage && i4 >= sparseArrayCompat.keys.length) {
            gc(sparseArrayCompat);
            i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        }
        int i5 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        if (i5 >= iArr.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i5 + 1);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
            x.e(iArrCopyOf, "copyOf(...)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            x.e(objArrCopyOf, "copyOf(...)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i6 = sparseArrayCompat.size;
        if (i6 - i3 != 0) {
            int[] iArr2 = sparseArrayCompat.keys;
            int i7 = i3 + 1;
            c.ar(iArr2, iArr2, i7, i3, i6);
            Object[] objArr2 = sparseArrayCompat.values;
            c.at(objArr2, objArr2, i7, i3, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i3] = i2;
        sparseArrayCompat.values[i3] = e2;
        sparseArrayCompat.size++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> void commonPutAll(androidx.collection.SparseArrayCompat<E> r9, androidx.collection.SparseArrayCompat<? extends E> r10) {
        /*
            java.lang.String r0 = "<this>"
            h.g.b.x.f(r9, r0)
            java.lang.String r0 = "other"
            h.g.b.x.f(r10, r0)
            int r0 = r10.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L9c
            int r2 = r10.keyAt(r1)
            java.lang.Object r3 = r10.valueAt(r1)
            int[] r4 = r9.keys
            int r5 = r9.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            if (r4 < 0) goto L28
            java.lang.Object[] r2 = r9.values
            r2[r4] = r3
            goto L98
        L28:
            int r4 = ~r4
            int r5 = r9.size
            if (r4 >= r5) goto L3e
            java.lang.Object[] r6 = r9.values
            r7 = r6[r4]
            java.lang.Object r8 = access$getDELETED$p()
            if (r7 != r8) goto L3e
            int[] r5 = r9.keys
            r5[r4] = r2
            r6[r4] = r3
            goto L98
        L3e:
            boolean r6 = r9.garbage
            if (r6 == 0) goto L53
            int[] r6 = r9.keys
            int r6 = r6.length
            if (r5 < r6) goto L53
            access$gc(r9)
            int[] r4 = r9.keys
            int r5 = r9.size
            int r4 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r4, r5, r2)
            int r4 = ~r4
        L53:
            int r5 = r9.size
            int[] r6 = r9.keys
            int r7 = r6.length
            if (r5 < r7) goto L76
            int r5 = r5 + 1
            int r5 = androidx.collection.internal.ContainerHelpersKt.idealIntArraySize(r5)
            int[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r7 = "copyOf(...)"
            h.g.b.x.e(r6, r7)
            r9.keys = r6
            java.lang.Object[] r6 = r9.values
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r6, r5)
            h.g.b.x.e(r5, r7)
            r9.values = r5
        L76:
            int r5 = r9.size
            int r6 = r5 - r4
            if (r6 == 0) goto L8a
            int[] r6 = r9.keys
            int r7 = r4 + 1
            h.a.c.ar(r6, r6, r7, r4, r5)
            java.lang.Object[] r5 = r9.values
            int r6 = r9.size
            h.a.c.at(r5, r5, r7, r4, r6)
        L8a:
            int[] r5 = r9.keys
            r5[r4] = r2
            java.lang.Object[] r2 = r9.values
            r2[r4] = r3
            int r2 = r9.size
            int r2 = r2 + 1
            r9.size = r2
        L98:
            int r1 = r1 + 1
            goto Lf
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SparseArrayCompatKt.commonPutAll(androidx.collection.SparseArrayCompat, androidx.collection.SparseArrayCompat):void");
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        x.f(sparseArrayCompat, "<this>");
        E e3 = (E) commonGet(sparseArrayCompat, i2);
        if (e3 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e2;
                return e3;
            }
            int i3 = ~iBinarySearch;
            int i4 = sparseArrayCompat.size;
            if (i3 < i4) {
                Object[] objArr = sparseArrayCompat.values;
                if (objArr[i3] == DELETED) {
                    sparseArrayCompat.keys[i3] = i2;
                    objArr[i3] = e2;
                    return e3;
                }
            }
            if (sparseArrayCompat.garbage && i4 >= sparseArrayCompat.keys.length) {
                gc(sparseArrayCompat);
                i3 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
            }
            int i5 = sparseArrayCompat.size;
            int[] iArr = sparseArrayCompat.keys;
            if (i5 >= iArr.length) {
                int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i5 + 1);
                int[] iArrCopyOf = Arrays.copyOf(iArr, iIdealIntArraySize);
                x.e(iArrCopyOf, "copyOf(...)");
                sparseArrayCompat.keys = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                x.e(objArrCopyOf, "copyOf(...)");
                sparseArrayCompat.values = objArrCopyOf;
            }
            int i6 = sparseArrayCompat.size;
            if (i6 - i3 != 0) {
                int[] iArr2 = sparseArrayCompat.keys;
                int i7 = i3 + 1;
                c.ar(iArr2, iArr2, i7, i3, i6);
                Object[] objArr2 = sparseArrayCompat.values;
                c.at(objArr2, objArr2, i7, i3, sparseArrayCompat.size);
            }
            sparseArrayCompat.keys[i3] = i2;
            sparseArrayCompat.values[i3] = e2;
            sparseArrayCompat.size++;
        }
        return e3;
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        Object[] objArr = sparseArrayCompat.values;
        if (objArr[i2] != DELETED) {
            objArr[i2] = DELETED;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> sparseArrayCompat, int i2, int i3) {
        x.f(sparseArrayCompat, "<this>");
        int iMin = Math.min(i3, i2 + i3);
        while (i2 < iMin) {
            sparseArrayCompat.removeAt(i2);
            i2++;
        }
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2, E e3) {
        x.f(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !x.n(sparseArrayCompat.values[iIndexOfKey], e2)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e3;
        return true;
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i2] = e2;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    public static final <E> String commonToString(SparseArrayCompat<E> sparseArrayCompat) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(sparseArrayCompat.size * 28);
        sb.append('{');
        int i2 = sparseArrayCompat.size;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(sparseArrayCompat.keyAt(i3));
            sb.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i3);
            if (eValueAt != sparseArrayCompat) {
                sb.append(eValueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> sparseArrayCompat, int i2) {
        x.f(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            gc(sparseArrayCompat);
        }
        if (i2 >= sparseArrayCompat.size || i2 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E) sparseArrayCompat.values[i2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> sparseArrayCompat) {
        int i2 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != DELETED) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i3;
    }

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> sparseArrayCompat, int i2, T t) {
        T t2;
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || (t2 = (T) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? t : t2;
    }

    public static final <E> E commonGet(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        E e3;
        x.f(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i2);
        return (iBinarySearch < 0 || (e3 = (E) sparseArrayCompat.values[iBinarySearch]) == DELETED) ? e2 : e3;
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> sparseArrayCompat, int i2, Object obj) {
        x.f(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0 || !x.n(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> sparseArrayCompat, int i2, E e2) {
        x.f(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i2);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e3 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e2;
        return e3;
    }
}
