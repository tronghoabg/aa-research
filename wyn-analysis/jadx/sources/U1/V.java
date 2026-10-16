package U1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k2.g0;

/* loaded from: classes.dex */
public final class V extends AbstractC0831a {

    /* renamed from: e, reason: collision with root package name */
    public final int f12007e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12008f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f12009g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f12010h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.N[] f12011i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f12012j;
    public final HashMap k;

    public V(N1.N[] nArr, Object[] objArr, g0 g0Var) {
        super(g0Var);
        int length = nArr.length;
        this.f12011i = nArr;
        this.f12009g = new int[length];
        this.f12010h = new int[length];
        this.f12012j = objArr;
        this.k = new HashMap();
        int length2 = nArr.length;
        int i5 = 0;
        int iO = 0;
        int iH = 0;
        int i10 = 0;
        while (i5 < length2) {
            N1.N n10 = nArr[i5];
            this.f12011i[i10] = n10;
            this.f12010h[i10] = iO;
            this.f12009g[i10] = iH;
            iO += n10.o();
            iH += this.f12011i[i10].h();
            this.k.put(objArr[i10], Integer.valueOf(i10));
            i5++;
            i10++;
        }
        this.f12007e = iO;
        this.f12008f = iH;
    }

    @Override // N1.N
    public final int h() {
        return this.f12008f;
    }

    @Override // N1.N
    public final int o() {
        return this.f12007e;
    }

    @Override // U1.AbstractC0831a
    public final int q(Object obj) {
        Integer num = (Integer) this.k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // U1.AbstractC0831a
    public final int r(int i5) {
        return Q1.x.d(this.f12009g, i5 + 1, false, false);
    }

    @Override // U1.AbstractC0831a
    public final int s(int i5) {
        return Q1.x.d(this.f12010h, i5 + 1, false, false);
    }

    @Override // U1.AbstractC0831a
    public final Object t(int i5) {
        return this.f12012j[i5];
    }

    @Override // U1.AbstractC0831a
    public final int u(int i5) {
        return this.f12009g[i5];
    }

    @Override // U1.AbstractC0831a
    public final int v(int i5) {
        return this.f12010h[i5];
    }

    @Override // U1.AbstractC0831a
    public final N1.N y(int i5) {
        return this.f12011i[i5];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V(ArrayList arrayList, g0 g0Var) {
        N1.N[] nArr = new N1.N[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            nArr[i10] = ((H) it.next()).a();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i5] = ((H) it2.next()).getUid();
            i5++;
        }
        this(nArr, objArr, g0Var);
    }
}
