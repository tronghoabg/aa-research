package N;

import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;

/* renamed from: N.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0719d0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7761a;

    public C0719d0(ArrayList arrayList) {
        this.f7761a = arrayList;
    }

    public void a(int i5) {
        ArrayList arrayList = this.f7761a;
        if (arrayList.isEmpty() || !(((Number) arrayList.get(0)).intValue() == i5 || ((Number) AbstractC3256n.e(arrayList, 1)).intValue() == i5)) {
            int size = arrayList.size();
            arrayList.add(Integer.valueOf(i5));
            while (size > 0) {
                int i10 = ((size + 1) >>> 1) - 1;
                int iIntValue = ((Number) arrayList.get(i10)).intValue();
                if (i5 <= iIntValue) {
                    break;
                }
                arrayList.set(size, Integer.valueOf(iIntValue));
                size = i10;
            }
            arrayList.set(size, Integer.valueOf(i5));
        }
    }

    public synchronized B4.j b(Class cls) {
        int size = this.f7761a.size();
        for (int i5 = 0; i5 < size; i5++) {
            T4.d dVar = (T4.d) this.f7761a.get(i5);
            if (dVar.f11465a.isAssignableFrom(cls)) {
                return dVar.f11466b;
            }
        }
        return null;
    }

    public synchronized Q4.a c(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return Q4.c.f9845b;
        }
        Iterator it = this.f7761a.iterator();
        while (it.hasNext()) {
            Q4.b bVar = (Q4.b) it.next();
            if (bVar.f9842a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f9843b)) {
                return bVar.f9844c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f7761a.iterator();
        while (it.hasNext()) {
            Q4.b bVar = (Q4.b) it.next();
            if (bVar.f9842a.isAssignableFrom(cls) && cls2.isAssignableFrom(bVar.f9843b)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    public int e() {
        int iIntValue;
        ArrayList arrayList = this.f7761a;
        if (arrayList.size() <= 0) {
            C0718d.v("Set is empty");
            throw null;
        }
        int iIntValue2 = ((Number) arrayList.get(0)).intValue();
        while (!arrayList.isEmpty() && ((Number) arrayList.get(0)).intValue() == iIntValue2) {
            arrayList.set(0, ff.o.y0(arrayList));
            arrayList.remove(arrayList.size() - 1);
            int size = arrayList.size();
            int size2 = arrayList.size() >>> 1;
            int i5 = 0;
            while (i5 < size2) {
                int iIntValue3 = ((Number) arrayList.get(i5)).intValue();
                int i10 = (i5 + 1) * 2;
                int i11 = i10 - 1;
                int iIntValue4 = ((Number) arrayList.get(i11)).intValue();
                if (i10 >= size || (iIntValue = ((Number) arrayList.get(i10)).intValue()) <= iIntValue4) {
                    if (iIntValue4 > iIntValue3) {
                        arrayList.set(i5, Integer.valueOf(iIntValue4));
                        arrayList.set(i11, Integer.valueOf(iIntValue3));
                        i5 = i11;
                    }
                } else if (iIntValue > iIntValue3) {
                    arrayList.set(i5, Integer.valueOf(iIntValue));
                    arrayList.set(i10, Integer.valueOf(iIntValue3));
                    i5 = i10;
                }
            }
        }
        return iIntValue2;
    }

    public C0719d0(int i5) {
        switch (i5) {
            case 1:
                this.f7761a = new ArrayList();
                break;
            case 2:
                this.f7761a = new ArrayList();
                break;
            default:
                this.f7761a = new ArrayList();
                break;
        }
    }
}
