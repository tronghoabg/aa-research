package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class afrg {
    private afrg() {
    }

    public static final Iterator a(afeg afegVar) {
        airq airqVar = new airq();
        airqVar.a = affa.r(afegVar, airqVar, airqVar);
        return airqVar;
    }

    public static airp b(Iterator it) {
        return c(new afbb(it, 4));
    }

    public static airp c(airp airpVar) {
        return airpVar instanceof airg ? airpVar : new airg(airpVar);
    }

    public static airp d(airp airpVar) {
        xrw xrwVar = new xrw(20);
        if (!(airpVar instanceof aisd)) {
            return new airm(airpVar, new airt(1), xrwVar);
        }
        aisd aisdVar = (aisd) airpVar;
        return new airm(aisdVar.a, aisdVar.b, xrwVar);
    }

    public static airp e(afdr afdrVar) {
        return c(new airo(afdrVar, new tbq(afdrVar, 3)));
    }

    public static airp f(Object obj, afec afecVar) {
        afecVar.getClass();
        return obj == null ? airj.a : new airo(new tim(obj, 10), afecVar);
    }

    public static int g(airp airpVar) {
        Iterator itA = airpVar.a();
        int i = 0;
        while (itA.hasNext()) {
            itA.next();
            i++;
            if (i < 0) {
                woy.bn();
            }
        }
        return i;
    }

    public static Object h(airp airpVar) {
        airz airzVar = new airz((airk) airpVar, 1);
        if (airzVar.hasNext()) {
            return airzVar.next();
        }
        return null;
    }

    public static Object i(airp airpVar) {
        Iterator itA = airpVar.a();
        if (!itA.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = itA.next();
        while (itA.hasNext()) {
            next = itA.next();
        }
        return next;
    }

    public static List j(airp airpVar) {
        Iterator itA = airpVar.a();
        if (!itA.hasNext()) {
            return afbe.a;
        }
        Object next = itA.next();
        if (!itA.hasNext()) {
            return woy.bg(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (itA.hasNext()) {
            arrayList.add(itA.next());
        }
        return arrayList;
    }

    public static airp k(airp airpVar, int i) {
        if (i >= 0) {
            return i != 0 ? airpVar instanceof airi ? ((airi) airpVar).b(i) : new airx(airpVar, i, 1, null) : airpVar;
        }
        throw new IllegalArgumentException(a.bn(i, "Requested element count ", " is less than zero."));
    }

    public static airp l(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new airk(airpVar, true, afecVar);
    }

    public static airp m(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new airk(airpVar, false, afecVar);
    }

    public static airp n(airp airpVar) {
        return m(airpVar, new airt(0));
    }

    public static airp o(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new airm(airpVar, afecVar, airw.a);
    }

    public static airp p(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new airm(airpVar, afecVar, airv.a);
    }

    public static airp q(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new aisd(airpVar, afecVar);
    }

    public static airp r(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return n(new aisd(airpVar, afecVar));
    }

    public static airp s(airp airpVar, Object obj) {
        return d(woy.dk(new airp[]{airpVar, new afbb(obj, 5)}));
    }

    public static airp t(airp airpVar, afec afecVar) {
        afecVar.getClass();
        return new aisb(airpVar, afecVar, 1);
    }

    public static String u(airp airpVar, CharSequence charSequence) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Iterator itA = airpVar.a();
        int i = 0;
        while (itA.hasNext()) {
            Object next = itA.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            a.k(sb, next, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void v(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(a.bp(i, "Expected positive parallelism level, but got "));
        }
    }

    public static final aizz w(aiyk aiykVar, aitx aitxVar, aizu aizuVar, Object obj) {
        aiyk aiykVar2;
        afco afcoVar;
        ajal ajalVar;
        aiyk aiykVarF;
        boolean z = aitz.a;
        int i = aixl.Ni;
        if (!(aiykVar instanceof ajal) || (aiykVarF = (ajalVar = (ajal) aiykVar).f()) == null) {
            aiykVar2 = aiykVar;
            afcoVar = afcp.a;
        } else {
            afcoVar = ajalVar.a;
            aiykVar2 = aiykVarF;
        }
        ajab ajabVarA = ajac.a(obj);
        return new aizl(ajabVarA, ahnc.c(aitxVar, afcoVar, true != affa.f(aizuVar, aizt.a) ? 4 : 1, new foz(aizuVar, aiykVar2, ajabVarA, obj, (afck) null, 8)));
    }

    public /* synthetic */ afrg(afeu afeuVar) {
        this();
    }
}
