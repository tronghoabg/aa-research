package kotlinx.b.d;

import h.g.b.ar;
import h.g.b.at;
import kotlinx.b.c.ca;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51213a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final kotlinx.b.a.q f51214b = ca.d("kotlinx.serialization.json.JsonUnquotedLiteral", kotlinx.b.a.b.u(at.f48108a));

    public static final long a(y yVar) {
        h.g.b.x.f(yVar, "<this>");
        kotlinx.b.d.a.a aVar = new kotlinx.b.d.a.a(yVar.a());
        long jC = aVar.c();
        if (aVar.l() == 10) {
            return jC;
        }
        int i2 = aVar.f51108a;
        int i3 = i2 - 1;
        kotlinx.b.d.a.a.s(aVar, "Expected input to contain a single valid number, but got '" + ((i2 == aVar.o().length() || i3 < 0) ? "EOF" : String.valueOf(aVar.o().charAt(i3))) + "' after it", i3, null, 4);
        throw new h.e();
    }

    public static final String b(y yVar) {
        h.g.b.x.f(yVar, "<this>");
        if (yVar instanceof t) {
            return null;
        }
        return yVar.a();
    }

    public static final kotlinx.b.a.q c() {
        return f51214b;
    }

    public static final v d(k kVar) {
        h.g.b.x.f(kVar, "<this>");
        v vVar = kVar instanceof v ? (v) kVar : null;
        if (vVar != null) {
            return vVar;
        }
        f(kVar, "JsonObject");
        throw new h.e();
    }

    public static final y e(k kVar) {
        h.g.b.x.f(kVar, "<this>");
        y yVar = kVar instanceof y ? (y) kVar : null;
        if (yVar != null) {
            return yVar;
        }
        f(kVar, "JsonPrimitive");
        throw new h.e();
    }

    private static final void f(k kVar, String str) {
        StringBuilder sb = new StringBuilder("Element ");
        Class<?> cls = kVar.getClass();
        int i2 = ar.f48106a;
        sb.append(new h.g.b.m(cls));
        sb.append(" is not a ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
