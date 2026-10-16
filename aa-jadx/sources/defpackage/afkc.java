package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class afkc {
    private static final defpackage.afjv<defpackage.afrw<? extends java.lang.Object>> K_CLASS_CACHE = defpackage.afjw.createCache(defpackage.afjx.INSTANCE);
    private static final defpackage.afjv<defpackage.afst> K_PACKAGE_CACHE = defpackage.afjw.createCache(defpackage.afjy.INSTANCE);
    private static final defpackage.afjv<defpackage.afjb> CACHE_FOR_BASE_CLASSIFIERS = defpackage.afjw.createCache(defpackage.afjz.INSTANCE);
    private static final defpackage.afjv<defpackage.afjb> CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = defpackage.afjw.createCache(defpackage.afka.INSTANCE);
    private static final defpackage.afjv<j$.util.concurrent.ConcurrentHashMap<defpackage.afau<java.util.List<defpackage.afjd>, java.lang.Boolean>, defpackage.afjb>> CACHE_FOR_GENERIC_CLASSIFIERS = defpackage.afjw.createCache(defpackage.afkb.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb CACHE_FOR_BASE_CLASSIFIERS$lambda$0(java.lang.Class cls) {
        cls.getClass();
        defpackage.afrw orCreateKotlinClass = getOrCreateKotlinClass(cls);
        defpackage.afce afceVar = defpackage.afce.a;
        return defpackage.afjr.d(orCreateKotlinClass, afceVar, false, afceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j$.util.concurrent.ConcurrentHashMap CACHE_FOR_GENERIC_CLASSIFIERS$lambda$0(java.lang.Class cls) {
        cls.getClass();
        return new j$.util.concurrent.ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afjb CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$lambda$0(java.lang.Class cls) {
        cls.getClass();
        defpackage.afrw orCreateKotlinClass = getOrCreateKotlinClass(cls);
        defpackage.afce afceVar = defpackage.afce.a;
        return defpackage.afjr.d(orCreateKotlinClass, afceVar, true, afceVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afrw K_CLASS_CACHE$lambda$0(java.lang.Class cls) {
        cls.getClass();
        return new defpackage.afrw(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afst K_PACKAGE_CACHE$lambda$0(java.lang.Class cls) {
        cls.getClass();
        return new defpackage.afst(cls);
    }

    public static final void clearCaches() {
        K_CLASS_CACHE.clear();
        K_PACKAGE_CACHE.clear();
        CACHE_FOR_BASE_CLASSIFIERS.clear();
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.clear();
        CACHE_FOR_GENERIC_CLASSIFIERS.clear();
    }

    public static final <T> defpackage.afjb getOrCreateKType(java.lang.Class<T> cls, java.util.List<defpackage.afjd> list, boolean z) {
        cls.getClass();
        list.getClass();
        if (list.isEmpty()) {
            return z ? CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(cls) : CACHE_FOR_BASE_CLASSIFIERS.get(cls);
        }
        return getOrCreateKTypeWithTypeArguments(cls, list, z);
    }

    private static final <T> defpackage.afjb getOrCreateKTypeWithTypeArguments(java.lang.Class<T> cls, java.util.List<defpackage.afjd> list, boolean z) {
        defpackage.afjb afjbVarPutIfAbsent;
        j$.util.concurrent.ConcurrentHashMap<defpackage.afau<java.util.List<defpackage.afjd>, java.lang.Boolean>, defpackage.afjb> concurrentHashMap = CACHE_FOR_GENERIC_CLASSIFIERS.get(cls);
        defpackage.afau<java.util.List<defpackage.afjd>, java.lang.Boolean> afauVar = new defpackage.afau<>(list, java.lang.Boolean.valueOf(z));
        defpackage.afjb afjbVarD = concurrentHashMap.get(afauVar);
        if (afjbVarD == null && (afjbVarPutIfAbsent = concurrentHashMap.putIfAbsent(afauVar, (afjbVarD = defpackage.afjr.d(getOrCreateKotlinClass(cls), list, z, defpackage.afce.a)))) != null) {
            afjbVarD = afjbVarPutIfAbsent;
        }
        return afjbVarD;
    }

    public static final <T> defpackage.afrw<T> getOrCreateKotlinClass(java.lang.Class<T> cls) {
        cls.getClass();
        defpackage.afsj afsjVar = K_CLASS_CACHE.get(cls);
        afsjVar.getClass();
        return (defpackage.afrw) afsjVar;
    }

    public static final <T> defpackage.afig getOrCreateKotlinPackage(java.lang.Class<T> cls) {
        cls.getClass();
        return K_PACKAGE_CACHE.get(cls);
    }
}
