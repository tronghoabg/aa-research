package Af;

import A7.AbstractC0279p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class n extends p {
    public static k S(Iterator it) {
        AbstractC3340k.e(it, "<this>");
        return new a(new o(it, 1));
    }

    public static int T(k kVar) {
        Iterator it = kVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            it.next();
            i5++;
            if (i5 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i5;
    }

    public static k U(k kVar, int i5) {
        AbstractC3340k.e(kVar, "<this>");
        if (i5 >= 0) {
            return i5 == 0 ? kVar : kVar instanceof d ? ((d) kVar).a(i5) : new c(kVar, i5, 0);
        }
        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested element count ", " is less than zero.").toString());
    }

    public static g V(k kVar, tf.l predicate) {
        AbstractC3340k.e(predicate, "predicate");
        return new g(kVar, true, predicate);
    }

    public static g W(k kVar, tf.l predicate) {
        AbstractC3340k.e(predicate, "predicate");
        return new g(kVar, false, predicate);
    }

    public static Object X(k kVar) {
        Iterator it = kVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static h Y(k kVar, tf.l transform) {
        AbstractC3340k.e(transform, "transform");
        return new h(kVar, transform, v.f1327a);
    }

    public static final h Z(k kVar) {
        Ad.g gVar = new Ad.g(2);
        if (!(kVar instanceof z)) {
            return new h(kVar, new Ad.g(3), gVar);
        }
        z zVar = (z) kVar;
        return new h(zVar.f1341a, zVar.f1342b, gVar);
    }

    public static k a0(Object obj, tf.l nextFunction) {
        AbstractC3340k.e(nextFunction, "nextFunction");
        return obj == null ? e.f1294a : new j(new q(obj, 0), nextFunction);
    }

    public static String b0(k kVar, String str) {
        AbstractC3340k.e(kVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i5 = 0;
        for (Object obj : kVar) {
            i5++;
            if (i5 > 1) {
                sb2.append((CharSequence) str);
            }
            AbstractC4345a.i(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }

    public static z c0(k kVar, tf.l transform) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(transform, "transform");
        return new z(kVar, transform);
    }

    public static g d0(k kVar, tf.l transform) {
        AbstractC3340k.e(transform, "transform");
        return W(new z(kVar, transform), new Ad.g(4));
    }

    public static List e0(k kVar) {
        AbstractC3340k.e(kVar, "<this>");
        Iterator it = kVar.iterator();
        if (!it.hasNext()) {
            return ff.v.f35432a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC3935e.C(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
