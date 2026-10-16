package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class affw {
    public static final affx a;

    static {
        affx affxVar = null;
        try {
            affxVar = (affx) Class.forName("afux").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (affxVar == null) {
            affxVar = new affx();
        }
        a = affxVar;
    }

    public static String a(afew afewVar) {
        return a.renderLambdaToString(afewVar);
    }

    public static afhe b(Class cls) {
        return a.getOrCreateKotlinClass(cls);
    }

    public static afhg c(Class cls) {
        return a.getOrCreateKotlinPackage(cls, "");
    }

    public static afib d(afib afibVar) {
        return a.mutableCollectionType(afibVar);
    }

    public static afib e(Class cls) {
        return a.typeOf(b(cls), Collections.EMPTY_LIST, true);
    }

    public static afib f(Class cls) {
        return a.typeOf(b(cls), Collections.EMPTY_LIST, false);
    }

    public static afib g(Class cls, afid afidVar) {
        return a.typeOf(b(cls), Collections.singletonList(afidVar), false);
    }
}
