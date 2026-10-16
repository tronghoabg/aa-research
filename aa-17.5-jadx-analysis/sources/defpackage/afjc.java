package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class afjc {
    private static final afiv<afqw<? extends Object>> K_CLASS_CACHE = afiw.createCache(afix.INSTANCE);
    private static final afiv<afrt> K_PACKAGE_CACHE = afiw.createCache(afiy.INSTANCE);
    private static final afiv<afib> CACHE_FOR_BASE_CLASSIFIERS = afiw.createCache(afiz.INSTANCE);
    private static final afiv<afib> CACHE_FOR_NULLABLE_BASE_CLASSIFIERS = afiw.createCache(afja.INSTANCE);
    private static final afiv<ConcurrentHashMap<aezu<List<afid>, Boolean>, afib>> CACHE_FOR_GENERIC_CLASSIFIERS = afiw.createCache(afjb.INSTANCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib CACHE_FOR_BASE_CLASSIFIERS$lambda$0(Class cls) {
        cls.getClass();
        afqw orCreateKotlinClass = getOrCreateKotlinClass(cls);
        afbe afbeVar = afbe.a;
        return afik.h(orCreateKotlinClass, afbeVar, false, afbeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConcurrentHashMap CACHE_FOR_GENERIC_CLASSIFIERS$lambda$0(Class cls) {
        cls.getClass();
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib CACHE_FOR_NULLABLE_BASE_CLASSIFIERS$lambda$0(Class cls) {
        cls.getClass();
        afqw orCreateKotlinClass = getOrCreateKotlinClass(cls);
        afbe afbeVar = afbe.a;
        return afik.h(orCreateKotlinClass, afbeVar, true, afbeVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afqw K_CLASS_CACHE$lambda$0(Class cls) {
        cls.getClass();
        return new afqw(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afrt K_PACKAGE_CACHE$lambda$0(Class cls) {
        cls.getClass();
        return new afrt(cls);
    }

    public static final void clearCaches() {
        K_CLASS_CACHE.clear();
        K_PACKAGE_CACHE.clear();
        CACHE_FOR_BASE_CLASSIFIERS.clear();
        CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.clear();
        CACHE_FOR_GENERIC_CLASSIFIERS.clear();
    }

    public static final <T> afib getOrCreateKType(Class<T> cls, List<afid> list, boolean z) {
        cls.getClass();
        list.getClass();
        return list.isEmpty() ? z ? CACHE_FOR_NULLABLE_BASE_CLASSIFIERS.get(cls) : CACHE_FOR_BASE_CLASSIFIERS.get(cls) : getOrCreateKTypeWithTypeArguments(cls, list, z);
    }

    private static final <T> afib getOrCreateKTypeWithTypeArguments(Class<T> cls, List<afid> list, boolean z) {
        afib afibVarPutIfAbsent;
        ConcurrentHashMap<aezu<List<afid>, Boolean>, afib> concurrentHashMap = CACHE_FOR_GENERIC_CLASSIFIERS.get(cls);
        aezu<List<afid>, Boolean> aezuVar = new aezu<>(list, Boolean.valueOf(z));
        afib afibVarH = concurrentHashMap.get(aezuVar);
        if (afibVarH == null && (afibVarPutIfAbsent = concurrentHashMap.putIfAbsent(aezuVar, (afibVarH = afik.h(getOrCreateKotlinClass(cls), list, z, afbe.a)))) != null) {
            afibVarH = afibVarPutIfAbsent;
        }
        return afibVarH;
    }

    public static final <T> afqw<T> getOrCreateKotlinClass(Class<T> cls) {
        cls.getClass();
        afrj afrjVar = K_CLASS_CACHE.get(cls);
        afrjVar.getClass();
        return (afqw) afrjVar;
    }

    public static final <T> afhg getOrCreateKotlinPackage(Class<T> cls) {
        cls.getClass();
        return K_PACKAGE_CACHE.get(cls);
    }
}
