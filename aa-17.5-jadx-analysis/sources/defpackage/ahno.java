package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ahno {
    public static void a(int i, afeg afegVar, Object obj, afck afckVar) {
        Object objInvoke;
        int i2 = i - 1;
        if (i2 == 0) {
            afus.d(afegVar, obj, afckVar);
            return;
        }
        if (i2 == 2) {
            afegVar.getClass();
            affa.s(affa.r(afegVar, obj, afckVar)).w(afak.a);
            return;
        }
        if (i2 != 3) {
            return;
        }
        try {
            afco afcoVarHH = afckVar.hH();
            Object objB = ajdb.b(afcoVarHH, null);
            try {
                if (afegVar instanceof afcy) {
                    affz.g(afegVar, 2);
                    objInvoke = afegVar.invoke(obj, afckVar);
                } else {
                    objInvoke = affa.q(afegVar, obj, afckVar);
                }
                if (objInvoke != afcr.a) {
                    afckVar.w(objInvoke);
                }
            } finally {
                ajdb.c(afcoVarHH, objB);
            }
        } catch (Throwable th) {
            th = th;
            if (th instanceof aiui) {
                th = ((aiui) th).a;
            }
            th.getClass();
            afckVar.w(new aezv(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd annotationId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_ANNOTATION_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd atomicsId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_CONCURRENT_ATOMICS_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd baseId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_KOTLIN_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd collectionsId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_COLLECTIONS_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd coroutinesId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_COROUTINES_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd enumsId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_ENUMS_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> inverseMap(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        int iAV = woy.aV(woy.bp(setEntrySet, 10));
        if (iAV < 16) {
            iAV = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iAV);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aezu aezuVar = new aezu(entry.getValue(), entry.getKey());
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd primitiveArrayId(ahnj ahnjVar) {
        return new ahnd(ahnn.INSTANCE.getArray().getPackageFqName(), ahnj.identifier(String.valueOf(ahnjVar.getIdentifier()).concat(String.valueOf(ahnn.INSTANCE.getArray().getShortClassName().getIdentifier()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd rangesId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_RANGES_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd reflectId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_REFLECT_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd sequencesId(String str) {
        return new ahnd(ahnn.INSTANCE.getBASE_SEQUENCES_PACKAGE(), ahnj.identifier(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahnd unsignedId(ahnd ahndVar) {
        return new ahnd(ahnn.INSTANCE.getBASE_KOTLIN_PACKAGE(), ahnj.identifier("U" + ahndVar.getShortClassName().getIdentifier()));
    }
}
