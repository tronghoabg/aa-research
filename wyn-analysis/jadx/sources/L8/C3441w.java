package l8;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: l8.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3441w extends AbstractMap implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f40171j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public transient Object f40172a;

    /* renamed from: b, reason: collision with root package name */
    public transient int[] f40173b;

    /* renamed from: c, reason: collision with root package name */
    public transient Object[] f40174c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object[] f40175d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f40176e;

    /* renamed from: f, reason: collision with root package name */
    public transient int f40177f;

    /* renamed from: g, reason: collision with root package name */
    public transient C3439u f40178g;

    /* renamed from: h, reason: collision with root package name */
    public transient C3439u f40179h;

    /* renamed from: i, reason: collision with root package name */
    public transient C3433o f40180i;

    public static C3441w a() {
        C3441w c3441w = new C3441w();
        c3441w.f40176e = Math.min(Math.max(3, 1), 1073741823);
        return c3441w;
    }

    public static C3441w c(int i5) {
        C3441w c3441w = new C3441w();
        Fe.e.p("Expected size must be >= 0", i5 >= 0);
        c3441w.f40176e = Math.min(Math.max(i5, 1), 1073741823);
        return c3441w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.f40176e += 32;
        Map mapD = d();
        if (mapD != null) {
            this.f40176e = Math.min(Math.max(size(), 3), 1073741823);
            mapD.clear();
            this.f40172a = null;
            this.f40177f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f40177f, (Object) null);
        Arrays.fill(l(), 0, this.f40177f, (Object) null);
        Object obj = this.f40172a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f40177f, 0);
        this.f40177f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        return mapD != null ? mapD.containsKey(obj) : f(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i5 = 0; i5 < this.f40177f; i5++) {
            if (Fe.b.v(obj, l()[i5])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.f40172a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.f40176e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3439u c3439u = this.f40179h;
        if (c3439u != null) {
            return c3439u;
        }
        C3439u c3439u2 = new C3439u(this, 0);
        this.f40179h = c3439u2;
        return c3439u2;
    }

    public final int f(Object obj) {
        if (h()) {
            return -1;
        }
        int iS = AbstractC3437s.s(obj);
        int iE = e();
        Object obj2 = this.f40172a;
        Objects.requireNonNull(obj2);
        int iT = AbstractC3437s.t(iS & iE, obj2);
        if (iT == 0) {
            return -1;
        }
        int i5 = ~iE;
        int i10 = iS & i5;
        do {
            int i11 = iT - 1;
            int i12 = j()[i11];
            if ((i12 & i5) == i10 && Fe.b.v(obj, k()[i11])) {
                return i11;
            }
            iT = i12 & iE;
        } while (iT != 0);
        return -1;
    }

    public final void g(int i5, int i10) {
        Object obj = this.f40172a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i11 = size - 1;
        if (i5 >= i11) {
            objArrK[i5] = null;
            objArrL[i5] = null;
            iArrJ[i5] = 0;
            return;
        }
        Object obj2 = objArrK[i11];
        objArrK[i5] = obj2;
        objArrL[i5] = objArrL[i11];
        objArrK[i11] = null;
        objArrL[i11] = null;
        iArrJ[i5] = iArrJ[i11];
        iArrJ[i11] = 0;
        int iS = AbstractC3437s.s(obj2) & i10;
        int iT = AbstractC3437s.t(iS, obj);
        if (iT == size) {
            AbstractC3437s.u(iS, i5 + 1, obj);
            return;
        }
        while (true) {
            int i12 = iT - 1;
            int i13 = iArrJ[i12];
            int i14 = i13 & i10;
            if (i14 == size) {
                iArrJ[i12] = AbstractC3437s.m(i13, i5 + 1, i10);
                return;
            }
            iT = i14;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return l()[iF];
    }

    public final boolean h() {
        return this.f40172a == null;
    }

    public final Object i(Object obj) {
        boolean zH = h();
        Object obj2 = f40171j;
        if (!zH) {
            int iE = e();
            Object obj3 = this.f40172a;
            Objects.requireNonNull(obj3);
            int iP = AbstractC3437s.p(obj, null, iE, obj3, j(), k(), null);
            if (iP != -1) {
                Object obj4 = l()[iP];
                g(iP, iE);
                this.f40177f--;
                this.f40176e += 32;
                return obj4;
            }
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.f40173b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f40174c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3439u c3439u = this.f40178g;
        if (c3439u != null) {
            return c3439u;
        }
        C3439u c3439u2 = new C3439u(this, 1);
        this.f40178g = c3439u2;
        return c3439u2;
    }

    public final Object[] l() {
        Object[] objArr = this.f40175d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i5, int i10, int i11, int i12) {
        Object objE = AbstractC3437s.e(i10);
        int i13 = i10 - 1;
        if (i12 != 0) {
            AbstractC3437s.u(i11 & i13, i12 + 1, objE);
        }
        Object obj = this.f40172a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i14 = 0; i14 <= i5; i14++) {
            int iT = AbstractC3437s.t(i14, obj);
            while (iT != 0) {
                int i15 = iT - 1;
                int i16 = iArrJ[i15];
                int i17 = ((~i5) & i16) | i14;
                int i18 = i17 & i13;
                int iT2 = AbstractC3437s.t(i18, objE);
                AbstractC3437s.u(i18, iT, objE);
                iArrJ[i15] = AbstractC3437s.m(i17, iT2, i13);
                iT = i16 & i5;
            }
        }
        this.f40172a = objE;
        this.f40176e = AbstractC3437s.m(this.f40176e, 32 - Integer.numberOfLeadingZeros(i13), 31);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.C3441w.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objI = i(obj);
        if (objI == f40171j) {
            return null;
        }
        return objI;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.f40177f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C3433o c3433o = this.f40180i;
        if (c3433o != null) {
            return c3433o;
        }
        C3433o c3433o2 = new C3433o(1, this);
        this.f40180i = c3433o2;
        return c3433o2;
    }
}
