package k2;

import N1.C0769s;
import N1.C0771u;
import N1.C0773w;
import a9.C1342b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import l8.C3441w;

/* loaded from: classes.dex */
public final class Q extends AbstractC3155l {

    /* renamed from: s, reason: collision with root package name */
    public static final C0773w f38932s;
    public final AbstractC3144a[] k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f38933l;

    /* renamed from: m, reason: collision with root package name */
    public final N1.N[] f38934m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f38935n;

    /* renamed from: o, reason: collision with root package name */
    public final C1342b f38936o;

    /* renamed from: p, reason: collision with root package name */
    public int f38937p;

    /* renamed from: q, reason: collision with root package name */
    public long[][] f38938q;

    /* renamed from: r, reason: collision with root package name */
    public io.ktor.utils.io.T f38939r;

    static {
        J5.n nVar = new J5.n(3);
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        List list = Collections.EMPTY_LIST;
        l8.e0 e0Var2 = l8.e0.f40101e;
        E5.Y y10 = new E5.Y();
        f38932s = new C0773w("MergingMediaSource", new N1.r(nVar), null, new C0769s(y10), N1.z.f8304B, C0771u.f8270a);
    }

    public Q(AbstractC3144a... abstractC3144aArr) {
        C1342b c1342b = new C1342b();
        this.k = abstractC3144aArr;
        this.f38936o = c1342b;
        this.f38935n = new ArrayList(Arrays.asList(abstractC3144aArr));
        this.f38937p = -1;
        this.f38933l = new ArrayList(abstractC3144aArr.length);
        for (int i5 = 0; i5 < abstractC3144aArr.length; i5++) {
            this.f38933l.add(new ArrayList());
        }
        this.f38934m = new N1.N[abstractC3144aArr.length];
        this.f38938q = new long[0][];
        new HashMap();
        AbstractC3437s.d(8, "expectedKeys");
        AbstractC3437s.d(2, "expectedValuesPerKey");
        new l8.a0(C3441w.c(8)).f40083f = new l8.Z();
    }

    @Override // k2.AbstractC3144a
    public final F b(H h10, o2.e eVar, long j8) {
        AbstractC3144a[] abstractC3144aArr = this.k;
        int length = abstractC3144aArr.length;
        F[] fArr = new F[length];
        N1.N[] nArr = this.f38934m;
        int iB = nArr[0].b(h10.f38903a);
        for (int i5 = 0; i5 < length; i5++) {
            H hA = h10.a(nArr[i5].l(iB));
            fArr[i5] = abstractC3144aArr[i5].b(hA, eVar, j8 - this.f38938q[iB][i5]);
            ((List) this.f38933l.get(i5)).add(new P(hA, fArr[i5]));
        }
        return new O(this.f38936o, this.f38938q[iB], fArr);
    }

    @Override // k2.AbstractC3144a
    public final C0773w h() {
        AbstractC3144a[] abstractC3144aArr = this.k;
        return abstractC3144aArr.length > 0 ? abstractC3144aArr[0].h() : f38932s;
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void j() throws io.ktor.utils.io.T {
        io.ktor.utils.io.T t10 = this.f38939r;
        if (t10 != null) {
            throw t10;
        }
        super.j();
    }

    @Override // k2.AbstractC3144a
    public final void l(S1.A a5) {
        this.f39117j = a5;
        this.f39116i = Q1.x.m(null);
        int i5 = 0;
        while (true) {
            AbstractC3144a[] abstractC3144aArr = this.k;
            if (i5 >= abstractC3144aArr.length) {
                return;
            }
            y(Integer.valueOf(i5), abstractC3144aArr[i5]);
            i5++;
        }
    }

    @Override // k2.AbstractC3144a
    public final void n(F f10) {
        O o7 = (O) f10;
        int i5 = 0;
        while (true) {
            AbstractC3144a[] abstractC3144aArr = this.k;
            if (i5 >= abstractC3144aArr.length) {
                return;
            }
            List list = (List) this.f38933l.get(i5);
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((P) list.get(i10)).f38931b.equals(f10)) {
                    list.remove(i10);
                    break;
                }
                i10++;
            }
            AbstractC3144a abstractC3144a = abstractC3144aArr[i5];
            F f11 = o7.f38921a[i5];
            if (f11 instanceof m0) {
                f11 = ((m0) f11).f39122a;
            }
            abstractC3144a.n(f11);
            i5++;
        }
    }

    @Override // k2.AbstractC3155l, k2.AbstractC3144a
    public final void p() {
        super.p();
        Arrays.fill(this.f38934m, (Object) null);
        this.f38937p = -1;
        this.f38939r = null;
        ArrayList arrayList = this.f38935n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // k2.AbstractC3144a
    public final void s(C0773w c0773w) {
        this.k[0].s(c0773w);
    }

    @Override // k2.AbstractC3155l
    public final H t(Object obj, H h10) {
        ArrayList arrayList = this.f38933l;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (((P) list.get(i5)).f38930a.equals(h10)) {
                return ((P) ((List) arrayList.get(0)).get(i5)).f38930a;
            }
        }
        return null;
    }

    @Override // k2.AbstractC3155l
    public final void x(Object obj, AbstractC3144a abstractC3144a, N1.N n10) {
        Integer num = (Integer) obj;
        if (this.f38939r != null) {
            return;
        }
        if (this.f38937p == -1) {
            this.f38937p = n10.h();
        } else if (n10.h() != this.f38937p) {
            this.f38939r = new io.ktor.utils.io.T();
            return;
        }
        int length = this.f38938q.length;
        N1.N[] nArr = this.f38934m;
        if (length == 0) {
            this.f38938q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f38937p, nArr.length);
        }
        ArrayList arrayList = this.f38935n;
        arrayList.remove(abstractC3144a);
        nArr[num.intValue()] = n10;
        if (arrayList.isEmpty()) {
            m(nArr[0]);
        }
    }
}
