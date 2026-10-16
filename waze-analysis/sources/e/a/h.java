package e.a;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f47759a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f47760b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f47761c;

    /* renamed from: d, reason: collision with root package name */
    private final e f47762d;

    /* renamed from: e, reason: collision with root package name */
    private final String f47763e;

    /* renamed from: f, reason: collision with root package name */
    private final Object[][] f47764f;

    /* renamed from: g, reason: collision with root package name */
    private final List f47765g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f47766h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f47767i;

    /* renamed from: j, reason: collision with root package name */
    private final Integer f47768j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f47769k;

    static {
        f fVar = new f();
        fVar.f47459e = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        fVar.f47460f = Collections.EMPTY_LIST;
        f47759a = new h(fVar);
    }

    /* synthetic */ h(f fVar) {
        this.f47760b = fVar.f47455a;
        this.f47761c = fVar.f47456b;
        this.f47762d = fVar.f47457c;
        this.f47763e = fVar.f47458d;
        this.f47764f = fVar.f47459e;
        this.f47765g = fVar.f47460f;
        this.f47766h = fVar.f47461g;
        this.f47767i = fVar.f47462h;
        this.f47768j = fVar.f47463i;
        this.f47769k = fVar.f47464j;
    }

    private static f v(h hVar) {
        f fVar = new f();
        fVar.f47455a = hVar.f47760b;
        fVar.f47456b = hVar.f47761c;
        fVar.f47457c = hVar.f47762d;
        fVar.f47458d = hVar.f47763e;
        fVar.f47459e = hVar.f47764f;
        fVar.f47460f = hVar.f47765g;
        fVar.f47461g = hVar.f47766h;
        fVar.f47462h = hVar.f47767i;
        fVar.f47463i = hVar.f47768j;
        fVar.f47464j = hVar.f47769k;
        return fVar;
    }

    public final e a() {
        return this.f47762d;
    }

    public final h b(e eVar) {
        f fVarV = v(this);
        fVarV.f47457c = eVar;
        return new h(fVarV);
    }

    public final h c(String str) {
        f fVarV = v(this);
        fVarV.f47458d = str;
        return new h(fVarV);
    }

    public final h d(ad adVar) {
        f fVarV = v(this);
        fVarV.f47455a = adVar;
        return new h(fVarV);
    }

    public final h e(Executor executor) {
        f fVarV = v(this);
        fVarV.f47456b = executor;
        return new h(fVarV);
    }

    public final h f(int i2) {
        com.google.d.b.an.o(i2 >= 0, "invalid maxsize %s", i2);
        f fVarV = v(this);
        fVarV.f47462h = Integer.valueOf(i2);
        return new h(fVarV);
    }

    public final h g(int i2) {
        com.google.d.b.an.o(i2 >= 0, "invalid maxsize %s", i2);
        f fVarV = v(this);
        fVarV.f47463i = Integer.valueOf(i2);
        return new h(fVarV);
    }

    public final h h(int i2) {
        com.google.d.b.an.o(i2 > 0, "numBytes must be positive: %s", i2);
        f fVarV = v(this);
        fVarV.f47464j = Integer.valueOf(i2);
        return new h(fVarV);
    }

    public final h i(g gVar, Object obj) {
        Object[][] objArr;
        int length;
        com.google.d.b.an.C(gVar, "key");
        com.google.d.b.an.C(obj, "value");
        f fVarV = v(this);
        int i2 = 0;
        while (true) {
            objArr = this.f47764f;
            length = objArr.length;
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (gVar.equals(objArr[i2][0])) {
                break;
            }
            i2++;
        }
        fVarV.f47459e = (Object[][]) Array.newInstance((Class<?>) Object.class, (i2 == -1 ? 1 : 0) + length, 2);
        System.arraycopy(objArr, 0, fVarV.f47459e, 0, length);
        if (i2 == -1) {
            fVarV.f47459e[length] = new Object[]{gVar, obj};
        } else {
            fVarV.f47459e[i2] = new Object[]{gVar, obj};
        }
        return new h(fVarV);
    }

    public final h j() {
        f fVarV = v(this);
        fVarV.f47461g = Boolean.TRUE;
        return new h(fVarV);
    }

    public final h k() {
        f fVarV = v(this);
        fVarV.f47461g = Boolean.FALSE;
        return new h(fVarV);
    }

    public final ad l() {
        return this.f47760b;
    }

    public final Integer m() {
        return this.f47767i;
    }

    public final Integer n() {
        return this.f47768j;
    }

    public final Integer o() {
        return this.f47769k;
    }

    public final Object p(g gVar) {
        com.google.d.b.an.C(gVar, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.f47764f;
            if (i2 >= objArr.length) {
                return gVar.f47750b;
            }
            if (gVar.equals(objArr[i2][0])) {
                return objArr[i2][1];
            }
            i2++;
        }
    }

    public final String q() {
        return this.f47763e;
    }

    public final List r() {
        return this.f47765g;
    }

    public final Executor s() {
        return this.f47761c;
    }

    public final boolean t() {
        return Boolean.TRUE.equals(this.f47766h);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("deadline", this.f47760b);
        zVarH.d("authority", null);
        zVarH.d("callCredentials", this.f47762d);
        Executor executor = this.f47761c;
        zVarH.d("executor", executor != null ? executor.getClass() : null);
        zVarH.d("compressorName", this.f47763e);
        zVarH.d("customOptions", Arrays.deepToString(this.f47764f));
        zVarH.e("waitForReady", t());
        zVarH.d("maxInboundMessageSize", this.f47767i);
        zVarH.d("maxOutboundMessageSize", this.f47768j);
        zVarH.d("onReadyThreshold", this.f47769k);
        zVarH.d("streamTracerFactories", this.f47765g);
        return zVarH.toString();
    }

    public final h u(dt dtVar) {
        List list = this.f47765g;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(dtVar);
        f fVarV = v(this);
        fVarV.f47460f = DesugarCollections.unmodifiableList(arrayList);
        return new h(fVarV);
    }
}
