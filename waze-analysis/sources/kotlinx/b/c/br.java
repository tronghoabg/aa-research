package kotlinx.b.c;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class br implements kotlinx.b.a.q, m {

    /* renamed from: a, reason: collision with root package name */
    private final String f51008a;

    /* renamed from: b, reason: collision with root package name */
    private final ak f51009b;

    /* renamed from: c, reason: collision with root package name */
    private final int f51010c;

    /* renamed from: d, reason: collision with root package name */
    private int f51011d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f51012e;

    /* renamed from: f, reason: collision with root package name */
    private final List[] f51013f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f51014g;

    /* renamed from: h, reason: collision with root package name */
    private Map f51015h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f51016i;

    /* renamed from: j, reason: collision with root package name */
    private final h.f f51017j;

    /* renamed from: k, reason: collision with root package name */
    private final h.f f51018k;

    public br(String str, ak akVar, int i2) {
        h.g.b.x.f(str, "serialName");
        this.f51008a = str;
        this.f51009b = akVar;
        this.f51010c = i2;
        this.f51011d = -1;
        String[] strArr = new String[i2];
        final int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.f51012e = strArr;
        int i5 = this.f51010c;
        this.f51013f = new List[i5];
        this.f51014g = new boolean[i5];
        this.f51015h = h.a.r.j();
        h.h hVar = h.h.f48131b;
        final int i6 = 1;
        this.f51016i = h.g.b(hVar, new h.g.a.a(this) { // from class: kotlinx.b.c.bq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ br f51006a;

            {
                this.f51006a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i7 = i6;
                br brVar = this.f51006a;
                return i7 != 0 ? br.n(brVar) : br.p(brVar);
            }
        });
        this.f51017j = h.g.b(hVar, new h.g.a.a(this) { // from class: kotlinx.b.c.bq

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ br f51006a;

            {
                this.f51006a = this;
            }

            @Override // h.g.a.a
            public final Object invoke() {
                int i7 = i3;
                br brVar = this.f51006a;
                return i7 != 0 ? br.n(brVar) : br.p(brVar);
            }
        });
        this.f51018k = h.g.b(hVar, new com.waze.uid.state_impl.email.n(this, 14));
    }

    static final kotlinx.b.b[] n(br brVar) {
        ak akVar = brVar.f51009b;
        return akVar != null ? akVar.childSerializers() : bs.f51019a;
    }

    static final kotlinx.b.a.q[] p(br brVar) {
        ArrayList arrayList;
        ak akVar = brVar.f51009b;
        if (akVar != null) {
            kotlinx.b.b<?>[] bVarArrTypeParametersSerializers = akVar.typeParametersSerializers();
            int length = bVarArrTypeParametersSerializers.length;
            ArrayList arrayList2 = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2 = 1) {
                arrayList2.add(bVarArrTypeParametersSerializers[0].getDescriptor());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return bp.c(arrayList);
    }

    @Override // kotlinx.b.a.q
    public final int a(String str) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        Integer num = (Integer) this.f51015h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.b.a.q
    public final int b() {
        return this.f51010c;
    }

    @Override // kotlinx.b.a.q
    public final String c(int i2) {
        return this.f51012e[i2];
    }

    @Override // kotlinx.b.a.q
    public final String d() {
        return this.f51008a;
    }

    @Override // kotlinx.b.a.q
    public final List e() {
        return h.a.i.h();
    }

    public boolean equals(Object obj) {
        br brVar = this;
        if (brVar == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return false;
        }
        kotlinx.b.a.q qVar = (kotlinx.b.a.q) obj;
        if (!h.g.b.x.n(brVar.d(), qVar.d()) || !Arrays.equals(o(), ((br) obj).o()) || brVar.b() != qVar.b()) {
            return false;
        }
        int iB = brVar.b();
        for (int i2 = 0; i2 < iB; i2++) {
            if (!h.g.b.x.n(brVar.g(i2).d(), qVar.g(i2).d()) || !h.g.b.x.n(brVar.g(i2).h(), qVar.g(i2).h())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.b.a.q
    public final List f(int i2) {
        List list = this.f51013f[i2];
        return list == null ? h.a.i.h() : list;
    }

    @Override // kotlinx.b.a.q
    public kotlinx.b.a.q g(int i2) {
        return ((kotlinx.b.b[]) this.f51016i.getValue())[i2].getDescriptor();
    }

    @Override // kotlinx.b.a.q
    public kotlinx.b.a.x h() {
        return kotlinx.b.a.y.f50940a;
    }

    public int hashCode() {
        return ((Number) this.f51018k.getValue()).intValue();
    }

    @Override // kotlinx.b.a.q
    public final boolean i(int i2) {
        return this.f51014g[i2];
    }

    @Override // kotlinx.b.a.q
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // kotlinx.b.a.q
    public final /* synthetic */ boolean k() {
        return false;
    }

    public final void l(String str, boolean z) {
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        int i2 = this.f51011d + 1;
        this.f51011d = i2;
        String[] strArr = this.f51012e;
        strArr[i2] = str;
        this.f51014g[i2] = z;
        this.f51013f[i2] = null;
        if (i2 == this.f51010c - 1) {
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < strArr.length; i3++) {
                map.put(strArr[i3], Integer.valueOf(i3));
            }
            this.f51015h = map;
        }
    }

    @Override // kotlinx.b.c.m
    public final Set m() {
        return this.f51015h.keySet();
    }

    public final kotlinx.b.a.q[] o() {
        return (kotlinx.b.a.q[]) this.f51017j.getValue();
    }

    public String toString() {
        return ca.b(this);
    }
}
