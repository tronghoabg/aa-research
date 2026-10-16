package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class gyx implements hem {
    public final Map a = new LinkedHashMap();

    public final Object a(Object obj, geu geuVar) {
        afeg afegVar = (afeg) this.a.get(obj.getClass());
        Object objInvoke = afegVar != null ? afegVar.invoke(obj, geuVar) : null;
        if (objInvoke != null) {
            return objInvoke;
        }
        gnf gnfVar = (gnf) geuVar.F(gnf.class);
        ((ynz) ((ynz) gno.a.g().o(ypi.a, "CarApp.H.Converter")).ai(58)).M("%s has no mapping for input type [%s]", gnfVar.b(getClass()), gnfVar.b(obj.getClass()));
        Class<?> cls = getClass();
        Class<?> cls2 = obj.getClass();
        throw new IllegalArgumentException(cls.getSimpleName() + " has no mapping for input type " + cls2.getSimpleName());
    }

    public final void b(Class cls, afeg afegVar) {
        this.a.put(cls, new gsl(afegVar, 8));
    }
}
