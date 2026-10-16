package kotlinx.b.d.a;

import androidx.autofill.HintConstants;
import com.waze.ui.m.cq;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlinx.coroutines.d.d f51170a = new kotlinx.coroutines.d.d();

    public static final int a(kotlinx.b.a.q qVar, kotlinx.b.d.b bVar, String str) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        e(qVar, bVar);
        int iA = qVar.a(str);
        if (iA != -3) {
            return iA;
        }
        Integer num = (Integer) c(bVar, qVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(kotlinx.b.a.q qVar, kotlinx.b.d.b bVar, String str, String str2) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(bVar, "json");
        h.g.b.x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        h.g.b.x.f(str2, "suffix");
        int iA = a(qVar, bVar, str);
        if (iA != -3) {
            return iA;
        }
        throw new kotlinx.b.k(qVar.d() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final Map c(kotlinx.b.d.b bVar, kotlinx.b.a.q qVar) {
        h.g.b.x.f(bVar, "<this>");
        h.g.b.x.f(qVar, "descriptor");
        return (Map) kotlinx.b.d.aa.f(bVar).j(qVar, f51170a, new cq(qVar, bVar, 2));
    }

    public static final boolean d(kotlinx.b.a.q qVar, kotlinx.b.d.b bVar) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(bVar, "json");
        List listE = qVar.e();
        if ((listE instanceof Collection) && listE.isEmpty()) {
            return false;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof kotlinx.b.d.p) {
                return true;
            }
        }
        return false;
    }

    public static final void e(kotlinx.b.a.q qVar, kotlinx.b.d.b bVar) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(bVar, "json");
        if (h.g.b.x.n(qVar.h(), kotlinx.b.a.y.f50940a)) {
            bVar.a();
        }
    }

    public static final kotlinx.coroutines.d.d f() {
        return f51170a;
    }
}
