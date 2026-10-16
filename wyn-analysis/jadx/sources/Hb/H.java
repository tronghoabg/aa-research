package hb;

import A7.R0;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class H extends AbstractMap implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final R0 f36259i = new R0(15);

    /* renamed from: g, reason: collision with root package name */
    public E f36266g;

    /* renamed from: h, reason: collision with root package name */
    public E f36267h;

    /* renamed from: d, reason: collision with root package name */
    public int f36263d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f36264e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f36260a = f36259i;

    /* renamed from: c, reason: collision with root package name */
    public final G f36262c = new G();

    /* renamed from: b, reason: collision with root package name */
    public G[] f36261b = new G[16];

    /* renamed from: f, reason: collision with root package name */
    public int f36265f = 12;

    public final G a(Object obj, boolean z2) {
        int iCompareTo;
        G g9;
        boolean z10;
        G g10;
        G g11;
        G g12;
        G g13;
        G g14;
        G[] gArr = this.f36261b;
        int iHashCode = obj.hashCode();
        int i5 = iHashCode ^ ((iHashCode >>> 20) ^ (iHashCode >>> 12));
        int i10 = ((i5 >>> 7) ^ i5) ^ (i5 >>> 4);
        boolean z11 = true;
        int length = i10 & (gArr.length - 1);
        G g15 = gArr[length];
        R0 r02 = f36259i;
        G g16 = null;
        Comparator comparator = this.f36260a;
        if (g15 != null) {
            Comparable comparable = comparator == r02 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = g15.f36255f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return g15;
                }
                G g17 = iCompareTo < 0 ? g15.f36251b : g15.f36252c;
                if (g17 == null) {
                    break;
                }
                g15 = g17;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z2) {
            return null;
        }
        G g18 = this.f36262c;
        if (g15 != null) {
            G g19 = g15;
            g9 = new G(g19, obj, i10, g18, g18.f36254e);
            if (iCompareTo < 0) {
                g19.f36251b = g9;
            } else {
                g19.f36252c = g9;
            }
            c(g19, true);
        } else {
            if (comparator == r02 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            g9 = new G(g15, obj, i10, g18, g18.f36254e);
            gArr[length] = g9;
        }
        int i11 = this.f36263d;
        this.f36263d = i11 + 1;
        if (i11 > this.f36265f) {
            G[] gArr2 = this.f36261b;
            int length2 = gArr2.length;
            int i12 = length2 * 2;
            G[] gArr3 = new G[i12];
            G4.f fVar = new G4.f();
            G4.f fVar2 = new G4.f();
            int i13 = 0;
            while (i13 < length2) {
                G g20 = gArr2[i13];
                if (g20 == null) {
                    z10 = z11;
                    g11 = g16;
                } else {
                    G g21 = g16;
                    for (G g22 = g20; g22 != null; g22 = g22.f36251b) {
                        g22.f36250a = g21;
                        g21 = g22;
                    }
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (g21 != null) {
                            z10 = z11;
                            G g23 = g21.f36250a;
                            g21.f36250a = g16;
                            G g24 = g21.f36252c;
                            while (true) {
                                G g25 = g24;
                                g10 = g23;
                                g23 = g25;
                                if (g23 == null) {
                                    break;
                                }
                                g23.f36250a = g10;
                                g24 = g23.f36251b;
                            }
                        } else {
                            G g26 = g21;
                            g21 = g16;
                            g10 = g26;
                            z10 = z11;
                        }
                        if (g21 == null) {
                            break;
                        }
                        if ((g21.f36256g & length2) == 0) {
                            i14++;
                        } else {
                            i15++;
                        }
                        g21 = g10;
                        z11 = z10;
                        g16 = null;
                    }
                    fVar.f4233a = ((Integer.highestOneBit(i14) * 2) - 1) - i14;
                    fVar.f4235c = 0;
                    fVar.f4234b = 0;
                    g11 = null;
                    fVar.f4236d = null;
                    fVar2.f4233a = ((Integer.highestOneBit(i15) * 2) - 1) - i15;
                    fVar2.f4235c = 0;
                    fVar2.f4234b = 0;
                    fVar2.f4236d = null;
                    G g27 = null;
                    while (g20 != null) {
                        g20.f36250a = g27;
                        G g28 = g20;
                        g20 = g20.f36251b;
                        g27 = g28;
                    }
                    while (true) {
                        if (g27 != null) {
                            G g29 = g27.f36250a;
                            g27.f36250a = null;
                            G g30 = g27.f36252c;
                            while (true) {
                                G g31 = g30;
                                g12 = g29;
                                g29 = g31;
                                if (g29 == null) {
                                    break;
                                }
                                g29.f36250a = g12;
                                g30 = g29.f36251b;
                            }
                        } else {
                            g12 = g27;
                            g27 = null;
                        }
                        if (g27 == null) {
                            break;
                        }
                        if ((g27.f36256g & length2) == 0) {
                            fVar.b(g27);
                        } else {
                            fVar2.b(g27);
                        }
                        g27 = g12;
                    }
                    if (i14 > 0) {
                        g13 = (G) fVar.f4236d;
                        if (g13.f36250a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        g13 = null;
                    }
                    gArr3[i13] = g13;
                    int i16 = i13 + length2;
                    if (i15 > 0) {
                        g14 = (G) fVar2.f4236d;
                        if (g14.f36250a != null) {
                            throw new IllegalStateException();
                        }
                    } else {
                        g14 = null;
                    }
                    gArr3[i16] = g14;
                }
                i13++;
                g16 = g11;
                z11 = z10;
            }
            this.f36261b = gArr3;
            this.f36265f = (i12 / 4) + (i12 / 2);
        }
        this.f36264e++;
        return g9;
    }

    public final void c(G g9, boolean z2) {
        while (g9 != null) {
            G g10 = g9.f36251b;
            G g11 = g9.f36252c;
            int i5 = g10 != null ? g10.f36258i : 0;
            int i10 = g11 != null ? g11.f36258i : 0;
            int i11 = i5 - i10;
            if (i11 == -2) {
                G g12 = g11.f36251b;
                G g13 = g11.f36252c;
                int i12 = (g12 != null ? g12.f36258i : 0) - (g13 != null ? g13.f36258i : 0);
                if (i12 != -1 && (i12 != 0 || z2)) {
                    g(g11);
                }
                f(g9);
                if (z2) {
                    return;
                }
            } else if (i11 == 2) {
                G g14 = g10.f36251b;
                G g15 = g10.f36252c;
                int i13 = (g14 != null ? g14.f36258i : 0) - (g15 != null ? g15.f36258i : 0);
                if (i13 != 1 && (i13 != 0 || z2)) {
                    f(g10);
                }
                g(g9);
                if (z2) {
                    return;
                }
            } else if (i11 == 0) {
                g9.f36258i = i5 + 1;
                if (z2) {
                    return;
                }
            } else {
                g9.f36258i = Math.max(i5, i10) + 1;
                if (!z2) {
                    return;
                }
            }
            g9 = g9.f36250a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.f36261b, (Object) null);
        this.f36263d = 0;
        this.f36264e++;
        G g9 = this.f36262c;
        G g10 = g9.f36253d;
        while (g10 != g9) {
            G g11 = g10.f36253d;
            g10.f36254e = null;
            g10.f36253d = null;
            g10 = g11;
        }
        g9.f36254e = g9;
        g9.f36253d = g9;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        G gA = null;
        if (obj != null) {
            try {
                gA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return gA != null;
    }

    public final void d(G g9, boolean z2) {
        G g10;
        G g11;
        int i5;
        if (z2) {
            G g12 = g9.f36254e;
            g12.f36253d = g9.f36253d;
            g9.f36253d.f36254e = g12;
            g9.f36254e = null;
            g9.f36253d = null;
        }
        G g13 = g9.f36251b;
        G g14 = g9.f36252c;
        G g15 = g9.f36250a;
        int i10 = 0;
        if (g13 == null || g14 == null) {
            if (g13 != null) {
                e(g9, g13);
                g9.f36251b = null;
            } else if (g14 != null) {
                e(g9, g14);
                g9.f36252c = null;
            } else {
                e(g9, null);
            }
            c(g15, false);
            this.f36263d--;
            this.f36264e++;
            return;
        }
        if (g13.f36258i > g14.f36258i) {
            G g16 = g13.f36252c;
            while (true) {
                G g17 = g16;
                g11 = g13;
                g13 = g17;
                if (g13 == null) {
                    break;
                } else {
                    g16 = g13.f36252c;
                }
            }
        } else {
            G g18 = g14.f36251b;
            while (true) {
                g10 = g14;
                g14 = g18;
                if (g14 == null) {
                    break;
                } else {
                    g18 = g14.f36251b;
                }
            }
            g11 = g10;
        }
        d(g11, false);
        G g19 = g9.f36251b;
        if (g19 != null) {
            i5 = g19.f36258i;
            g11.f36251b = g19;
            g19.f36250a = g11;
            g9.f36251b = null;
        } else {
            i5 = 0;
        }
        G g20 = g9.f36252c;
        if (g20 != null) {
            i10 = g20.f36258i;
            g11.f36252c = g20;
            g20.f36250a = g11;
            g9.f36252c = null;
        }
        g11.f36258i = Math.max(i5, i10) + 1;
        e(g9, g11);
    }

    public final void e(G g9, G g10) {
        G g11 = g9.f36250a;
        g9.f36250a = null;
        if (g10 != null) {
            g10.f36250a = g11;
        }
        if (g11 == null) {
            this.f36261b[g9.f36256g & (r0.length - 1)] = g10;
        } else if (g11.f36251b == g9) {
            g11.f36251b = g10;
        } else {
            g11.f36252c = g10;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        E e7 = this.f36266g;
        if (e7 != null) {
            return e7;
        }
        E e10 = new E(this, 0);
        this.f36266g = e10;
        return e10;
    }

    public final void f(G g9) {
        G g10 = g9.f36251b;
        G g11 = g9.f36252c;
        G g12 = g11.f36251b;
        G g13 = g11.f36252c;
        g9.f36252c = g12;
        if (g12 != null) {
            g12.f36250a = g9;
        }
        e(g9, g11);
        g11.f36251b = g9;
        g9.f36250a = g11;
        int iMax = Math.max(g10 != null ? g10.f36258i : 0, g12 != null ? g12.f36258i : 0) + 1;
        g9.f36258i = iMax;
        g11.f36258i = Math.max(iMax, g13 != null ? g13.f36258i : 0) + 1;
    }

    public final void g(G g9) {
        G g10 = g9.f36251b;
        G g11 = g9.f36252c;
        G g12 = g10.f36251b;
        G g13 = g10.f36252c;
        g9.f36251b = g13;
        if (g13 != null) {
            g13.f36250a = g9;
        }
        e(g9, g10);
        g10.f36252c = g9;
        g9.f36250a = g10;
        int iMax = Math.max(g11 != null ? g11.f36258i : 0, g13 != null ? g13.f36258i : 0) + 1;
        g9.f36258i = iMax;
        g10.f36258i = Math.max(iMax, g12 != null ? g12.f36258i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        G gA;
        if (obj != null) {
            try {
                gA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            gA = null;
        }
        if (gA != null) {
            return gA.f36257h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        E e7 = this.f36267h;
        if (e7 != null) {
            return e7;
        }
        E e10 = new E(this, 1);
        this.f36267h = e10;
        return e10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        G gA = a(obj, true);
        Object obj3 = gA.f36257h;
        gA.f36257h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        G gA;
        if (obj != null) {
            try {
                gA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            gA = null;
        }
        if (gA != null) {
            d(gA, true);
        }
        if (gA != null) {
            return gA.f36257h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f36263d;
    }
}
