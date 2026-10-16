package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zfq {
    public static final defpackage.xyj a;
    public static final defpackage.xyj b;

    static {
        defpackage.xyj xyjVar = new defpackage.xyj(", ");
        a = new defpackage.xyg(xyjVar, xyjVar, "null");
        b = new defpackage.xyj(" & ");
    }

    static java.lang.Class a(java.lang.Class cls) {
        return java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 0).getClass();
    }

    static java.lang.String b(java.lang.reflect.Type type) {
        return type instanceof java.lang.Class ? ((java.lang.Class) type).getName() : type.toString();
    }

    public static java.lang.reflect.Type c(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.reflect.WildcardType)) {
            return defpackage.zfk.e.c(type);
        }
        java.lang.reflect.WildcardType wildcardType = (java.lang.reflect.WildcardType) type;
        java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
        int length = lowerBounds.length;
        defpackage.ysr.aY(length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (length == 1) {
            return new defpackage.zfp(new java.lang.reflect.Type[]{c(lowerBounds[0])}, new java.lang.reflect.Type[]{java.lang.Object.class});
        }
        java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
        defpackage.ysr.aY(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return new defpackage.zfp(new java.lang.reflect.Type[0], new java.lang.reflect.Type[]{c(upperBounds[0])});
    }

    static java.lang.reflect.TypeVariable d(java.lang.reflect.GenericDeclaration genericDeclaration, java.lang.String str, java.lang.reflect.Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new java.lang.reflect.Type[]{java.lang.Object.class};
        }
        defpackage.zfo zfoVar = new defpackage.zfo(new defpackage.zfn(genericDeclaration, str, typeArr));
        defpackage.ysr.bc(java.lang.reflect.TypeVariable.class.isInterface(), "%s is not an interface", java.lang.reflect.TypeVariable.class);
        return (java.lang.reflect.TypeVariable) java.lang.reflect.TypeVariable.class.cast(java.lang.reflect.Proxy.newProxyInstance(java.lang.reflect.TypeVariable.class.getClassLoader(), new java.lang.Class[]{java.lang.reflect.TypeVariable.class}, zfoVar));
    }

    public static void e(java.lang.reflect.Type[] typeArr, java.lang.String str) {
        for (java.lang.reflect.Type type : typeArr) {
            if (type instanceof java.lang.Class) {
                java.lang.Class cls = (java.lang.Class) type;
                defpackage.ysr.bg(!cls.isPrimitive(), "Primitive type '%s' used as %s", cls, str);
            }
        }
    }

    public static java.lang.reflect.Type[] f(java.util.Collection collection) {
        return (java.lang.reflect.Type[]) collection.toArray(new java.lang.reflect.Type[0]);
    }
}
