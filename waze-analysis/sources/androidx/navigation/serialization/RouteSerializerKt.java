package androidx.navigation.serialization;

import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import h.a.r;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.l.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.b.a.q;
import kotlinx.b.a.y;
import kotlinx.b.b;
import kotlinx.b.f;
import kotlinx.b.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(b<T> bVar, a<ab> aVar) {
        if (bVar instanceof f) {
            aVar.invoke();
        }
    }

    private static final NavType<Object> computeNavType(q qVar, Map<s, ? extends NavType<?>> map) {
        Object next;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (NavTypeConverterKt.matchKType(qVar, (s) next)) {
                break;
            }
        }
        s sVar = (s) next;
        NavType<?> navType = sVar != null ? map.get(sVar) : null;
        if (true != (navType instanceof NavType)) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(qVar);
        }
        if (x.n(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        x.d(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    private static final <T> void forEachIndexedKType(b<T> bVar, Map<s, ? extends NavType> map, h.g.a.q<? super Integer, ? super String, ? super NavType, ab> qVar) {
        int iB = bVar.getDescriptor().b();
        for (int i2 = 0; i2 < iB; i2++) {
            String strC = bVar.getDescriptor().c(i2);
            NavType<Object> navTypeComputeNavType = computeNavType(bVar.getDescriptor().g(i2), map);
            if (navTypeComputeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(strC, bVar.getDescriptor().g(i2).d(), bVar.getDescriptor().d(), map.toString()));
            }
            qVar.invoke(Integer.valueOf(i2), strC, navTypeComputeNavType);
        }
    }

    static /* synthetic */ void forEachIndexedKType$default(b bVar, Map map, h.g.a.q qVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        forEachIndexedKType(bVar, map, qVar);
    }

    private static final <T> void forEachIndexedName(b<T> bVar, Map<String, ? extends NavType> map, h.g.a.q<? super Integer, ? super String, ? super NavType, ab> qVar) {
        int iB = bVar.getDescriptor().b();
        for (int i2 = 0; i2 < iB; i2++) {
            String strC = bVar.getDescriptor().c(i2);
            NavType navType = map.get(strC);
            if (navType == null) {
                throw new IllegalStateException("Cannot locate NavType for argument [" + strC + "]");
            }
            qVar.invoke(Integer.valueOf(i2), strC, navType);
        }
    }

    public static final <T> int generateHashCode(b<T> bVar) {
        x.f(bVar, "<this>");
        int iHashCode = bVar.getDescriptor().d().hashCode();
        int iB = bVar.getDescriptor().b();
        for (int i2 = 0; i2 < iB; i2++) {
            iHashCode = (iHashCode * 31) + bVar.getDescriptor().c(i2).hashCode();
        }
        return iHashCode;
    }

    public static final <T> List<NamedNavArgument> generateNavArguments(final b<T> bVar, final Map<s, ? extends NavType> map) {
        x.f(bVar, "<this>");
        x.f(map, "typeMap");
        assertNotAbstractClass(bVar, new a() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return RouteSerializerKt.generateNavArguments$lambda$0(bVar);
            }
        });
        int iB = bVar.getDescriptor().b();
        ArrayList arrayList = new ArrayList(iB);
        for (final int i2 = 0; i2 < iB; i2++) {
            final String strC = bVar.getDescriptor().c(i2);
            arrayList.add(NamedNavArgumentKt.navArgument(strC, new l() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RouteSerializerKt.generateNavArguments$lambda$1$0(bVar, i2, map, strC, (NavArgumentBuilder) obj);
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(b bVar, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        return generateNavArguments(bVar, map);
    }

    static final ab generateNavArguments$lambda$0(b bVar) {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + bVar + ". Arguments can only be generated from concrete classes or objects.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab generateNavArguments$lambda$1$0(b bVar, int i2, Map map, String str, NavArgumentBuilder navArgumentBuilder) {
        x.f(navArgumentBuilder, "$this$navArgument");
        q qVarG = bVar.getDescriptor().g(i2);
        boolean zK = qVarG.k();
        NavType<?> navTypeComputeNavType = computeNavType(qVarG, map);
        if (navTypeComputeNavType == null) {
            throw new IllegalArgumentException(unknownNavTypeErrorMessage(str, qVarG.d(), bVar.getDescriptor().d(), map.toString()));
        }
        navArgumentBuilder.setType(navTypeComputeNavType);
        navArgumentBuilder.setNullable(zK);
        if (bVar.getDescriptor().i(i2)) {
            navArgumentBuilder.setUnknownDefaultValuePresent$navigation_common(true);
        }
        return ab.f48028a;
    }

    public static final <T> String generateRoutePattern(final b<T> bVar, Map<s, ? extends NavType> map, String str) {
        x.f(bVar, "<this>");
        x.f(map, "typeMap");
        assertNotAbstractClass(bVar, new a() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return RouteSerializerKt.generateRoutePattern$lambda$0(bVar);
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, bVar) : new RouteBuilder(bVar);
        forEachIndexedKType(bVar, map, new h.g.a.q() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda1
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRoutePattern$lambda$1(routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(b bVar, Map map, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = r.j();
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(bVar, map, str);
    }

    static final ab generateRoutePattern$lambda$0(b bVar) {
        c cVarA = kotlinx.b.a.b.a(bVar.getDescriptor());
        throw new IllegalArgumentException("Cannot generate route pattern from polymorphic class " + (cVarA != null ? cVarA.c() : null) + ". Routes can only be generated from concrete classes or objects.");
    }

    static final ab generateRoutePattern$lambda$1(RouteBuilder routeBuilder, int i2, String str, NavType navType) {
        x.f(str, "argName");
        x.f(navType, "navType");
        routeBuilder.appendPattern(i2, str, navType);
        return ab.f48028a;
    }

    public static final <T> String generateRouteWithArgs(T t, Map<String, ? extends NavType> map) {
        x.f(t, "route");
        x.f(map, "typeMap");
        Class<?> cls = t.getClass();
        int i2 = ar.f48106a;
        b bVarA = p.a(new m(cls));
        final Map<String, List<String>> mapEncodeToArgMap = new RouteEncoder(bVarA, map).encodeToArgMap(t);
        final RouteBuilder routeBuilder = new RouteBuilder(bVarA);
        forEachIndexedName(bVarA, map, new h.g.a.q() { // from class: androidx.navigation.serialization.RouteSerializerKt$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return RouteSerializerKt.generateRouteWithArgs$lambda$0(mapEncodeToArgMap, routeBuilder, ((Integer) obj).intValue(), (String) obj2, (NavType) obj3);
            }
        });
        return routeBuilder.build();
    }

    static final ab generateRouteWithArgs$lambda$0(Map map, RouteBuilder routeBuilder, int i2, String str, NavType navType) {
        x.f(str, "argName");
        x.f(navType, "navType");
        Object obj = map.get(str);
        x.c(obj);
        routeBuilder.appendArg(i2, str, navType, (List) obj);
        return ab.f48028a;
    }

    public static final boolean isValueClass(q qVar) {
        x.f(qVar, "<this>");
        return x.n(qVar.h(), y.f50940a) && qVar.j() && qVar.b() == 1;
    }

    private static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
