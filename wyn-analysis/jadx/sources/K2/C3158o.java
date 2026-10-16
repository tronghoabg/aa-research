package k2;

import U1.AbstractC0831a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: k2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3158o extends AbstractC0831a {

    /* renamed from: e, reason: collision with root package name */
    public final int f39131e;

    /* renamed from: f, reason: collision with root package name */
    public final int f39132f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f39133g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f39134h;

    /* renamed from: i, reason: collision with root package name */
    public final N1.N[] f39135i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f39136j;
    public final HashMap k;

    public C3158o(ArrayList arrayList, g0 g0Var) {
        super(g0Var);
        int size = arrayList.size();
        this.f39133g = new int[size];
        this.f39134h = new int[size];
        this.f39135i = new N1.N[size];
        this.f39136j = new Object[size];
        this.k = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i5 = 0;
        while (it.hasNext()) {
            r rVar = (r) it.next();
            N1.N[] nArr = this.f39135i;
            C3140B c3140b = rVar.f39139a.f38898o;
            nArr[i5] = c3140b;
            this.f39134h[i5] = iO;
            this.f39133g[i5] = iH;
            iO += c3140b.f39170b.o();
            iH += this.f39135i[i5].h();
            Object[] objArr = this.f39136j;
            Object obj = rVar.f39140b;
            objArr[i5] = obj;
            this.k.put(obj, Integer.valueOf(i5));
            i5++;
        }
        this.f39131e = iO;
        this.f39132f = iH;
    }

    @Override // N1.N
    public final int h() {
        return this.f39132f;
    }

    @Override // N1.N
    public final int o() {
        return this.f39131e;
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
        return Q1.x.d(this.f39133g, i5 + 1, false, false);
    }

    @Override // U1.AbstractC0831a
    public final int s(int i5) {
        return Q1.x.d(this.f39134h, i5 + 1, false, false);
    }

    @Override // U1.AbstractC0831a
    public final Object t(int i5) {
        return this.f39136j[i5];
    }

    @Override // U1.AbstractC0831a
    public final int u(int i5) {
        return this.f39133g[i5];
    }

    @Override // U1.AbstractC0831a
    public final int v(int i5) {
        return this.f39134h[i5];
    }

    @Override // U1.AbstractC0831a
    public final N1.N y(int i5) {
        return this.f39135i[i5];
    }
}
