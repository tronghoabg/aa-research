package android.support.v7.widget;

import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gr {

    /* renamed from: a, reason: collision with root package name */
    final SimpleArrayMap f1587a = new SimpleArrayMap();

    /* renamed from: b, reason: collision with root package name */
    final LongSparseArray f1588b = new LongSparseArray();

    gr() {
    }

    private final eg k(fe feVar, int i2) {
        gq gqVar;
        eg egVar;
        SimpleArrayMap simpleArrayMap = this.f1587a;
        int iIndexOfKey = simpleArrayMap.indexOfKey(feVar);
        if (iIndexOfKey >= 0 && (gqVar = (gq) simpleArrayMap.valueAt(iIndexOfKey)) != null) {
            int i3 = gqVar.f1584b;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                gqVar.f1584b = i4;
                if (i2 == 4) {
                    egVar = gqVar.f1585c;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    egVar = gqVar.f1586d;
                }
                if ((i4 & 12) == 0) {
                    simpleArrayMap.removeAt(iIndexOfKey);
                    gq.b(gqVar);
                }
                return egVar;
            }
        }
        return null;
    }

    final eg a(fe feVar) {
        return k(feVar, 8);
    }

    final eg b(fe feVar) {
        return k(feVar, 4);
    }

    final void c(fe feVar) {
        SimpleArrayMap simpleArrayMap = this.f1587a;
        gq gqVarA = (gq) simpleArrayMap.get(feVar);
        if (gqVarA == null) {
            gqVarA = gq.a();
            simpleArrayMap.put(feVar, gqVarA);
        }
        gqVarA.f1584b |= 1;
    }

    final void d(long j2, fe feVar) {
        this.f1588b.put(j2, feVar);
    }

    final void e(fe feVar, eg egVar) {
        SimpleArrayMap simpleArrayMap = this.f1587a;
        gq gqVarA = (gq) simpleArrayMap.get(feVar);
        if (gqVarA == null) {
            gqVarA = gq.a();
            simpleArrayMap.put(feVar, gqVarA);
        }
        gqVarA.f1586d = egVar;
        gqVarA.f1584b |= 8;
    }

    final void f(fe feVar, eg egVar) {
        SimpleArrayMap simpleArrayMap = this.f1587a;
        gq gqVarA = (gq) simpleArrayMap.get(feVar);
        if (gqVarA == null) {
            gqVarA = gq.a();
            simpleArrayMap.put(feVar, gqVarA);
        }
        gqVarA.f1585c = egVar;
        gqVarA.f1584b |= 4;
    }

    final void g() {
        this.f1587a.clear();
        this.f1588b.clear();
    }

    final void h(fe feVar) {
        gq gqVar = (gq) this.f1587a.get(feVar);
        if (gqVar == null) {
            return;
        }
        gqVar.f1584b &= -2;
    }

    final void i(fe feVar) {
        LongSparseArray longSparseArray = this.f1588b;
        int size = longSparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (feVar == longSparseArray.valueAt(size)) {
                longSparseArray.removeAt(size);
                break;
            }
        }
        gq gqVar = (gq) this.f1587a.remove(feVar);
        if (gqVar != null) {
            gq.b(gqVar);
        }
    }

    final boolean j(fe feVar) {
        gq gqVar = (gq) this.f1587a.get(feVar);
        return (gqVar == null || (gqVar.f1584b & 1) == 0) ? false : true;
    }
}
