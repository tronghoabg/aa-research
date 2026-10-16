package com.google.d.f.c;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator f7804a = new e(0);

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f7805b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7806c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7807d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7808e;

    /* renamed from: f, reason: collision with root package name */
    private String f7809f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.d.f.c.h, java.util.AbstractMap] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.d.f.c.h] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    h(h hVar, h hVar2) {
        int i2;
        Object objC;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f7807d = new g(abstractMap, -1);
        abstractMap.f7808e = null;
        abstractMap.f7809f = null;
        int size = hVar.size() + hVar2.size();
        int iE = hVar.e() + hVar2.e();
        int i3 = size + 1;
        Object[] objArr2 = new Object[iE];
        int[] iArr = new int[i3];
        int i4 = 0;
        iArr[0] = size;
        Map.Entry entryF = hVar.f(0);
        Map.Entry entryF2 = hVar2.f(0);
        int i5 = 0;
        int i6 = 0;
        int iD = size;
        Map.Entry entryF3 = entryF;
        int i7 = 0;
        while (true) {
            int i8 = 1;
            if (entryF3 == null && entryF2 == null) {
                break;
            }
            int i9 = i7 + 1;
            if (entryF3 != null) {
                if (entryF2 != null) {
                    int iCompareTo = ((String) entryF3.getKey()).compareTo((String) entryF2.getKey());
                    if (iCompareTo == 0) {
                        int i10 = i5 + 1;
                        int i11 = i6 + 1;
                        objArr2[i7] = abstractMap.g((String) entryF3.getKey(), i7);
                        g gVar = (g) entryF3.getValue();
                        g gVar2 = (g) entryF2.getValue();
                        int i12 = 0;
                        int i13 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            if (i12 >= gVar.size() && i13 >= gVar2.size()) {
                                break;
                            }
                            int iCompare = i12 == gVar.size() ? i8 : i13 == gVar2.size() ? -1 : 0;
                            iCompare = iCompare == 0 ? j.f7815a.compare(gVar.c(i12), gVar2.c(i13)) : iCompare;
                            if (iCompare < 0) {
                                i2 = i12 + 1;
                                objC = gVar.c(i12);
                            } else {
                                int i14 = i13 + 1;
                                Object objC2 = gVar2.c(i13);
                                i13 = i14;
                                i2 = iCompare == 0 ? i12 + 1 : i12;
                                objC = objC2;
                            }
                            objArr2[iD] = objC;
                            i12 = i2;
                            iD++;
                            i8 = 1;
                            abstractMap = this;
                        }
                        iArr[i9] = iD;
                        entryF3 = hVar.f(i10);
                        entryF2 = hVar2.f(i11);
                        i6 = i11;
                        i5 = i10;
                        i7 = i9;
                        i4 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i7 = i9;
                        i4 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iD = d(entryF3, i7, iD, objArr2, iArr);
                entryF3 = hVar.f(i5);
                i7 = i9;
                i4 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryF3;
            i6++;
            int iD2 = d(entryF2, i7, iD, objArr2, iArr);
            entryF2 = hVar2.f(i6);
            iD = iD2;
            entryF3 = entry;
            i7 = i9;
            i4 = 0;
            abstractMap = this;
        }
        int i15 = iArr[i4];
        int i16 = i15 - i7;
        if (i16 != 0) {
            for (int i17 = i4; i17 <= i7; i17++) {
                iArr[i17] = iArr[i17] - i16;
            }
            int i18 = iArr[i7];
            int i19 = i18 - i7;
            if (h(iE, i18)) {
                objArr = new Object[i18];
                System.arraycopy(objArr2, i4, objArr, i4, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i15, objArr, i7, i19);
            objArr2 = objArr;
        }
        abstractMap.f7805b = objArr2;
        int i20 = iArr[i4] + 1;
        abstractMap.f7806c = h(i3, i20) ? Arrays.copyOf(iArr, i20) : iArr;
    }

    private final int d(Map.Entry entry, int i2, int i3, Object[] objArr, int[] iArr) {
        g gVar = (g) entry.getValue();
        int iA = gVar.a() - gVar.b();
        System.arraycopy(gVar.f7803b.f7805b, gVar.b(), objArr, i3, iA);
        objArr[i2] = g((String) entry.getKey(), i2);
        int i4 = i3 + iA;
        iArr[i2 + 1] = i4;
        return i4;
    }

    private final int e() {
        return this.f7806c[size()];
    }

    private final Map.Entry f(int i2) {
        if (i2 < this.f7806c[0]) {
            return (Map.Entry) this.f7805b[i2];
        }
        return null;
    }

    private final Map.Entry g(String str, int i2) {
        return new AbstractMap.SimpleImmutableEntry(str, new g(this, i2));
    }

    private static boolean h(int i2, int i3) {
        return i2 > 16 && i2 * 9 > i3 * 10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, Set<Object>>> entrySet() {
        return this.f7807d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Integer numValueOf = this.f7808e;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(super.hashCode());
            this.f7808e = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        String str = this.f7809f;
        if (str != null) {
            return str;
        }
        String string = super.toString();
        this.f7809f = string;
        return string;
    }

    h(List list) {
        this.f7807d = new g(this, -1);
        this.f7808e = null;
        this.f7809f = null;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((d) it.next()).f7798a;
            throw null;
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            ((d) it2.next()).f7798a;
            throw null;
        }
        int[] iArr = {0};
        this.f7805b = h(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
        this.f7806c = iArr;
    }
}
