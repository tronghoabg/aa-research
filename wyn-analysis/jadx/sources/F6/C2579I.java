package f6;

import E5.C0442b0;
import E5.C0446d0;
import E5.C0450f0;
import E5.J0;
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
import l8.e0;

/* renamed from: f6.I, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2579I extends AbstractC2596i {

    /* renamed from: r, reason: collision with root package name */
    public static final C0446d0 f34892r;
    public final AbstractC2588a[] k;

    /* renamed from: l, reason: collision with root package name */
    public final J0[] f34893l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f34894m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.fragment.app.X f34895n;

    /* renamed from: o, reason: collision with root package name */
    public int f34896o;

    /* renamed from: p, reason: collision with root package name */
    public long[][] f34897p;

    /* renamed from: q, reason: collision with root package name */
    public io.ktor.utils.io.T f34898q;

    static {
        E5.V v2 = new E5.V();
        C3407I c3407i = AbstractC3409K.f40056b;
        e0 e0Var = e0.f40101e;
        List list = Collections.EMPTY_LIST;
        e0 e0Var2 = e0.f40101e;
        f34892r = new C0446d0("MergingMediaSource", new E5.X(v2), null, new E5.Z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C0450f0.f3356G, C0442b0.f3293c);
    }

    public C2579I(AbstractC2588a... abstractC2588aArr) {
        androidx.fragment.app.X x5 = new androidx.fragment.app.X(5);
        this.k = abstractC2588aArr;
        this.f34895n = x5;
        this.f34894m = new ArrayList(Arrays.asList(abstractC2588aArr));
        this.f34896o = -1;
        this.f34893l = new J0[abstractC2588aArr.length];
        this.f34897p = new long[0][];
        new HashMap();
        AbstractC3437s.d(8, "expectedKeys");
        AbstractC3437s.d(2, "expectedValuesPerKey");
        new l8.a0(C3441w.c(8)).f40083f = new l8.Z();
    }

    @Override // f6.AbstractC2588a
    public final InterfaceC2610w a(C2613z c2613z, o2.e eVar, long j8) {
        AbstractC2588a[] abstractC2588aArr = this.k;
        int length = abstractC2588aArr.length;
        InterfaceC2610w[] interfaceC2610wArr = new InterfaceC2610w[length];
        J0[] j0Arr = this.f34893l;
        int iB = j0Arr[0].b(c2613z.f35112a);
        for (int i5 = 0; i5 < length; i5++) {
            interfaceC2610wArr[i5] = abstractC2588aArr[i5].a(c2613z.b(j0Arr[i5].l(iB)), eVar, j8 - this.f34897p[iB][i5]);
        }
        return new C2578H(this.f34895n, this.f34897p[iB], interfaceC2610wArr);
    }

    @Override // f6.AbstractC2588a
    public final C0446d0 g() {
        AbstractC2588a[] abstractC2588aArr = this.k;
        return abstractC2588aArr.length > 0 ? abstractC2588aArr[0].g() : f34892r;
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void i() throws io.ktor.utils.io.T {
        io.ktor.utils.io.T t10 = this.f34898q;
        if (t10 != null) {
            throw t10;
        }
        super.i();
    }

    @Override // f6.AbstractC2588a
    public final void k(t6.K k) {
        this.f35065j = k;
        this.f35064i = u6.v.j(null);
        int i5 = 0;
        while (true) {
            AbstractC2588a[] abstractC2588aArr = this.k;
            if (i5 >= abstractC2588aArr.length) {
                return;
            }
            v(Integer.valueOf(i5), abstractC2588aArr[i5]);
            i5++;
        }
    }

    @Override // f6.AbstractC2588a
    public final void m(InterfaceC2610w interfaceC2610w) {
        C2578H c2578h = (C2578H) interfaceC2610w;
        int i5 = 0;
        while (true) {
            AbstractC2588a[] abstractC2588aArr = this.k;
            if (i5 >= abstractC2588aArr.length) {
                return;
            }
            AbstractC2588a abstractC2588a = abstractC2588aArr[i5];
            InterfaceC2610w interfaceC2610w2 = c2578h.f34883a[i5];
            if (interfaceC2610w2 instanceof C2576F) {
                interfaceC2610w2 = ((C2576F) interfaceC2610w2).f34878a;
            }
            abstractC2588a.m(interfaceC2610w2);
            i5++;
        }
    }

    @Override // f6.AbstractC2596i, f6.AbstractC2588a
    public final void o() {
        super.o();
        Arrays.fill(this.f34893l, (Object) null);
        this.f34896o = -1;
        this.f34898q = null;
        ArrayList arrayList = this.f34894m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // f6.AbstractC2596i
    public final C2613z r(Object obj, C2613z c2613z) {
        if (((Integer) obj).intValue() == 0) {
            return c2613z;
        }
        return null;
    }

    @Override // f6.AbstractC2596i
    public final void u(Object obj, AbstractC2588a abstractC2588a, J0 j02) {
        Integer num = (Integer) obj;
        if (this.f34898q != null) {
            return;
        }
        if (this.f34896o == -1) {
            this.f34896o = j02.h();
        } else if (j02.h() != this.f34896o) {
            this.f34898q = new io.ktor.utils.io.T();
            return;
        }
        int length = this.f34897p.length;
        J0[] j0Arr = this.f34893l;
        if (length == 0) {
            this.f34897p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f34896o, j0Arr.length);
        }
        ArrayList arrayList = this.f34894m;
        arrayList.remove(abstractC2588a);
        j0Arr[num.intValue()] = j02;
        if (arrayList.isEmpty()) {
            l(j0Arr[0]);
        }
    }
}
