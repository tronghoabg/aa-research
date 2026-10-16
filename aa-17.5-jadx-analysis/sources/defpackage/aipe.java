package defpackage;

/* loaded from: classes3.dex */
public final class aipe {
    public static final Object a(afco afcoVar, Object obj, Object obj2, afeg afegVar, afck afckVar) {
        Object objInvoke;
        Object objB = ajdb.b(afcoVar, obj2);
        try {
            ajbg ajbgVar = new ajbg(afckVar, afcoVar);
            if (afegVar instanceof afcy) {
                affz.g(afegVar, 2);
                objInvoke = afegVar.invoke(obj, ajbgVar);
            } else {
                objInvoke = affa.q(afegVar, obj, ajbgVar);
            }
            ajdb.c(afcoVar, objB);
            if (objInvoke == afcr.a) {
                afckVar.getClass();
            }
            return objInvoke;
        } catch (Throwable th) {
            ajdb.c(afcoVar, objB);
            throw th;
        }
    }

    public static final boolean isProcessCanceledException(Throwable th) {
        th.getClass();
        Class<?> superclass = th.getClass();
        while (!affa.f(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    public static final RuntimeException rethrow(Throwable th) throws Throwable {
        th.getClass();
        throw th;
    }
}
