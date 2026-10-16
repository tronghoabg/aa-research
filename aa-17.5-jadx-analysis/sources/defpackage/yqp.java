package defpackage;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class yqp {
    public static final yrm a;
    private static final Set b;

    static {
        Set setSingleton = Collections.singleton(yof.a);
        b = setSingleton;
        a = new yqo(setSingleton);
    }

    public static boolean a(ypo ypoVar, yqk yqkVar, Set set) {
        return (ypoVar.d() == null && yqkVar.a() <= set.size() && set.containsAll(yqkVar.c())) ? false : true;
    }

    public static void b(yqk yqkVar, yqa yqaVar, StringBuilder sb) {
        ypn ypnVar = new ypn(sb);
        yqkVar.d(yqaVar, ypnVar);
        if (ypnVar.c) {
            ypnVar.b.append(ypnVar.a);
        }
    }
}
