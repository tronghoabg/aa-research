package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agfj {
    public static agfc findAnnotation(agfk agfkVar, ahnf ahnfVar) {
        agfc next;
        ahnfVar.getClass();
        Iterator<agfc> it = agfkVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (affa.f(next.getFqName(), ahnfVar)) {
                break;
            }
        }
        return next;
    }

    public static boolean hasAnnotation(agfk agfkVar, ahnf ahnfVar) {
        ahnfVar.getClass();
        return agfkVar.findAnnotation(ahnfVar) != null;
    }
}
