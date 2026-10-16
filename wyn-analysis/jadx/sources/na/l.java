package na;

import A7.R0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class l extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final R0 f40985i = new R0(16);

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f40986a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f40987b;

    /* renamed from: c, reason: collision with root package name */
    public k f40988c;

    /* renamed from: d, reason: collision with root package name */
    public int f40989d;

    /* renamed from: e, reason: collision with root package name */
    public int f40990e;

    /* renamed from: f, reason: collision with root package name */
    public final k f40991f;

    /* renamed from: g, reason: collision with root package name */
    public j f40992g;

    /* renamed from: h, reason: collision with root package name */
    public j f40993h;

    public l(boolean z2) {
        R0 r02 = f40985i;
        this.f40989d = 0;
        this.f40990e = 0;
        this.f40986a = r02;
        this.f40987b = z2;
        this.f40991f = new k(z2);
    }

    public final k a(Object obj, boolean z2) {
        int iCompareTo;
        k kVar;
        k kVar2 = this.f40988c;
        R0 r02 = f40985i;
        Comparator comparator = this.f40986a;
        if (kVar2 != null) {
            Comparable comparable = comparator == r02 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = kVar2.f40981f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return kVar2;
                }
                k kVar3 = iCompareTo < 0 ? kVar2.f40977b : kVar2.f40978c;
                if (kVar3 == null) {
                    break;
                }
                kVar2 = kVar3;
            }
        } else {
            iCompareTo = 0;
        }
        k kVar4 = kVar2;
        if (!z2) {
            return null;
        }
        k kVar5 = this.f40991f;
        if (kVar4 != null) {
            kVar = new k(this.f40987b, kVar4, obj, kVar5, kVar5.f40980e);
            if (iCompareTo < 0) {
                kVar4.f40977b = kVar;
            } else {
                kVar4.f40978c = kVar;
            }
            c(kVar4, true);
        } else {
            if (comparator == r02 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f40987b, kVar4, obj, kVar5, kVar5.f40980e);
            this.f40988c = kVar;
        }
        this.f40989d++;
        this.f40990e++;
        return kVar;
    }

    public final void c(k kVar, boolean z2) {
        while (kVar != null) {
            k kVar2 = kVar.f40977b;
            k kVar3 = kVar.f40978c;
            int i5 = kVar2 != null ? kVar2.f40984i : 0;
            int i10 = kVar3 != null ? kVar3.f40984i : 0;
            int i11 = i5 - i10;
            if (i11 == -2) {
                k kVar4 = kVar3.f40977b;
                k kVar5 = kVar3.f40978c;
                int i12 = (kVar4 != null ? kVar4.f40984i : 0) - (kVar5 != null ? kVar5.f40984i : 0);
                if (i12 == -1 || (i12 == 0 && !z2)) {
                    f(kVar);
                } else {
                    g(kVar3);
                    f(kVar);
                }
                if (z2) {
                    return;
                }
            } else if (i11 == 2) {
                k kVar6 = kVar2.f40977b;
                k kVar7 = kVar2.f40978c;
                int i13 = (kVar6 != null ? kVar6.f40984i : 0) - (kVar7 != null ? kVar7.f40984i : 0);
                if (i13 == 1 || (i13 == 0 && !z2)) {
                    g(kVar);
                } else {
                    f(kVar2);
                    g(kVar);
                }
                if (z2) {
                    return;
                }
            } else if (i11 == 0) {
                kVar.f40984i = i5 + 1;
                if (z2) {
                    return;
                }
            } else {
                kVar.f40984i = Math.max(i5, i10) + 1;
                if (!z2) {
                    return;
                }
            }
            kVar = kVar.f40976a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f40988c = null;
        this.f40989d = 0;
        this.f40990e++;
        k kVar = this.f40991f;
        kVar.f40980e = kVar;
        kVar.f40979d = kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        k kVarA = null;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return kVarA != null;
    }

    public final void d(k kVar, boolean z2) {
        k kVar2;
        k kVar3;
        int i5;
        if (z2) {
            k kVar4 = kVar.f40980e;
            kVar4.f40979d = kVar.f40979d;
            kVar.f40979d.f40980e = kVar4;
        }
        k kVar5 = kVar.f40977b;
        k kVar6 = kVar.f40978c;
        k kVar7 = kVar.f40976a;
        int i10 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                e(kVar, kVar5);
                kVar.f40977b = null;
            } else if (kVar6 != null) {
                e(kVar, kVar6);
                kVar.f40978c = null;
            } else {
                e(kVar, null);
            }
            c(kVar7, false);
            this.f40989d--;
            this.f40990e++;
            return;
        }
        if (kVar5.f40984i > kVar6.f40984i) {
            k kVar8 = kVar5.f40978c;
            while (true) {
                k kVar9 = kVar8;
                kVar3 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                } else {
                    kVar8 = kVar5.f40978c;
                }
            }
        } else {
            k kVar10 = kVar6.f40977b;
            while (true) {
                kVar2 = kVar6;
                kVar6 = kVar10;
                if (kVar6 == null) {
                    break;
                } else {
                    kVar10 = kVar6.f40977b;
                }
            }
            kVar3 = kVar2;
        }
        d(kVar3, false);
        k kVar11 = kVar.f40977b;
        if (kVar11 != null) {
            i5 = kVar11.f40984i;
            kVar3.f40977b = kVar11;
            kVar11.f40976a = kVar3;
            kVar.f40977b = null;
        } else {
            i5 = 0;
        }
        k kVar12 = kVar.f40978c;
        if (kVar12 != null) {
            i10 = kVar12.f40984i;
            kVar3.f40978c = kVar12;
            kVar12.f40976a = kVar3;
            kVar.f40978c = null;
        }
        kVar3.f40984i = Math.max(i5, i10) + 1;
        e(kVar, kVar3);
    }

    public final void e(k kVar, k kVar2) {
        k kVar3 = kVar.f40976a;
        kVar.f40976a = null;
        if (kVar2 != null) {
            kVar2.f40976a = kVar3;
        }
        if (kVar3 == null) {
            this.f40988c = kVar2;
        } else if (kVar3.f40977b == kVar) {
            kVar3.f40977b = kVar2;
        } else {
            kVar3.f40978c = kVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f40992g;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f40992g = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        k kVar2 = kVar.f40977b;
        k kVar3 = kVar.f40978c;
        k kVar4 = kVar3.f40977b;
        k kVar5 = kVar3.f40978c;
        kVar.f40978c = kVar4;
        if (kVar4 != null) {
            kVar4.f40976a = kVar;
        }
        e(kVar, kVar3);
        kVar3.f40977b = kVar;
        kVar.f40976a = kVar3;
        int iMax = Math.max(kVar2 != null ? kVar2.f40984i : 0, kVar4 != null ? kVar4.f40984i : 0) + 1;
        kVar.f40984i = iMax;
        kVar3.f40984i = Math.max(iMax, kVar5 != null ? kVar5.f40984i : 0) + 1;
    }

    public final void g(k kVar) {
        k kVar2 = kVar.f40977b;
        k kVar3 = kVar.f40978c;
        k kVar4 = kVar2.f40977b;
        k kVar5 = kVar2.f40978c;
        kVar.f40977b = kVar5;
        if (kVar5 != null) {
            kVar5.f40976a = kVar;
        }
        e(kVar, kVar2);
        kVar2.f40978c = kVar;
        kVar.f40976a = kVar2;
        int iMax = Math.max(kVar3 != null ? kVar3.f40984i : 0, kVar5 != null ? kVar5.f40984i : 0) + 1;
        kVar.f40984i = iMax;
        kVar2.f40984i = Math.max(iMax, kVar4 != null ? kVar4.f40984i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            return kVarA.f40983h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f40993h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f40993h = jVar2;
        return jVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f40987b) {
            throw new NullPointerException("value == null");
        }
        k kVarA = a(obj, true);
        Object obj3 = kVarA.f40983h;
        kVarA.f40983h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            d(kVarA, true);
        }
        if (kVarA != null) {
            return kVarA.f40983h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f40989d;
    }
}
