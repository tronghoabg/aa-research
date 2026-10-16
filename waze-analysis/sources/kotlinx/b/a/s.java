package kotlinx.b.a;

import androidx.autofill.HintConstants;
import h.a.ag;
import h.a.ah;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.b.c.bp;
import kotlinx.b.c.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements q, kotlinx.b.c.m {

    /* renamed from: a, reason: collision with root package name */
    private final String f50921a;

    /* renamed from: b, reason: collision with root package name */
    private final x f50922b;

    /* renamed from: c, reason: collision with root package name */
    private final int f50923c;

    /* renamed from: d, reason: collision with root package name */
    private final List f50924d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f50925e;

    /* renamed from: f, reason: collision with root package name */
    private final String[] f50926f;

    /* renamed from: g, reason: collision with root package name */
    private final q[] f50927g;

    /* renamed from: h, reason: collision with root package name */
    private final List[] f50928h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f50929i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f50930j;

    /* renamed from: k, reason: collision with root package name */
    private final q[] f50931k;

    /* renamed from: l, reason: collision with root package name */
    private final h.f f50932l;

    public s(String str, x xVar, int i2, List list, a aVar) {
        h.g.b.x.f(str, "serialName");
        h.g.b.x.f(xVar, "kind");
        h.g.b.x.f(list, "typeParameters");
        h.g.b.x.f(aVar, "builder");
        this.f50921a = str;
        this.f50922b = xVar;
        this.f50923c = i2;
        this.f50924d = aVar.a();
        this.f50925e = h.a.i.Z(aVar.d());
        String[] strArr = (String[]) aVar.d().toArray(new String[0]);
        this.f50926f = strArr;
        this.f50927g = bp.c(aVar.c());
        this.f50928h = (List[]) aVar.b().toArray(new List[0]);
        this.f50929i = h.a.i.aC(aVar.e());
        h.g.b.x.f(strArr, "<this>");
        ah<ag> ahVar = new ah(new com.waze.uid.state_impl.email.n(strArr, 9));
        ArrayList arrayList = new ArrayList(h.a.i.q(ahVar, 10));
        for (ag agVar : ahVar) {
            arrayList.add(new h.k(agVar.d(), Integer.valueOf(agVar.b())));
        }
        this.f50930j = h.a.r.q(arrayList);
        this.f50931k = bp.c(list);
        this.f50932l = h.g.a(new h.g.a.a() { // from class: kotlinx.b.a.r
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(s.l(this.f50920a));
            }
        });
    }

    static final int l(s sVar) {
        return ca.a(sVar, sVar.f50931k);
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer num = (Integer) this.f50930j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return this.f50923c;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return this.f50926f[i2];
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f50921a;
    }

    @Override // kotlinx.b.a.q
    public final List e() {
        return this.f50924d;
    }

    public final boolean equals(Object obj) {
        s sVar = this;
        if (sVar == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        q qVar = (q) obj;
        if (!h.g.b.x.n(sVar.d(), qVar.d()) || !Arrays.equals(this.f50931k, ((s) obj).f50931k) || sVar.b() != qVar.b()) {
            return false;
        }
        int iB = sVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (!h.g.b.x.n(sVar.g(i2).d(), qVar.g(i2).d()) || !h.g.b.x.n(sVar.g(i2).h(), qVar.g(i2).h())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        return this.f50928h[i2];
    }

    @Override // kotlinx.b.a.q
    public final q g(int i2) {
        return this.f50927g[i2];
    }

    @Override // kotlinx.b.a.q
    public final x h() {
        return this.f50922b;
    }

    public final int hashCode() {
        return ((Number) this.f50932l.getValue()).intValue();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return this.f50929i[i2];
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // kotlinx.b.c.m
    public final Set m() {
        return this.f50925e;
    }

    public final String toString() {
        return ca.b(this);
    }
}
