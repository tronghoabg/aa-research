package Xf;

import A7.AbstractC0279p0;
import Wf.AbstractC1240b0;
import Wf.F;
import Wf.q0;
import Yf.G;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final F f16280a = AbstractC1240b0.a("kotlinx.serialization.json.JsonUnquotedLiteral", q0.f15625a);

    public static final kotlinx.serialization.json.d a(Number number) {
        return number == null ? JsonNull.INSTANCE : new p(number, false, null);
    }

    public static final kotlinx.serialization.json.d b(String str) {
        return str == null ? JsonNull.INSTANCE : new p(str, true, null);
    }

    public static final void c(String str, kotlinx.serialization.json.b bVar) {
        throw new IllegalArgumentException("Element " + H.f39741a.getOrCreateKotlinClass(bVar.getClass()) + " is not a " + str);
    }

    public static final kotlinx.serialization.json.d d(kotlinx.serialization.json.b bVar) {
        AbstractC3340k.e(bVar, "<this>");
        kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        c("JsonPrimitive", bVar);
        throw null;
    }

    public static final long e(kotlinx.serialization.json.d dVar) {
        AbstractC3340k.e(dVar, "<this>");
        G g9 = new G(dVar.a());
        long jI = g9.i();
        if (g9.f() == 10) {
            return jI;
        }
        int i5 = g9.f5633b;
        int i10 = i5 - 1;
        String str = g9.f16831f;
        J5.f.r(g9, AbstractC0279p0.l("Expected input to contain a single valid number, but got '", (i5 == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10)), "' after it"), i10, null, 4);
        throw null;
    }
}
