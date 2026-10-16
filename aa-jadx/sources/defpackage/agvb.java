package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agvb {
    public static java.nio.charset.Charset a(java.lang.String str) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            return java.nio.charset.Charset.forName(str);
        } catch (java.nio.charset.UnsupportedCharsetException unused) {
            throw new java.io.UnsupportedEncodingException(str);
        }
    }

    public static void b(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(str.concat(" is null"));
        }
    }

    public static final defpackage.aggc extractNullabilityAnnotationOnBoundedWildcard(defpackage.agwu agwuVar, defpackage.ahba ahbaVar) {
        defpackage.aggc next;
        agwuVar.getClass();
        ahbaVar.getClass();
        if (ahbaVar.getBound() == null) {
            throw new java.lang.IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        java.util.Iterator<defpackage.aggc> it = new defpackage.agwq(agwuVar, ahbaVar, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            defpackage.aggc aggcVar = next;
            for (defpackage.ahof ahofVar : defpackage.agty.getRXJAVA3_ANNOTATIONS()) {
                if (defpackage.afga.f(aggcVar.getFqName(), ahofVar)) {
                    return next;
                }
            }
        }
        next = null;
        return next;
    }

    public static final boolean hasErasedValueParameters(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return (agbxVar instanceof defpackage.agdj) && defpackage.afga.f(agbxVar.getUserData(defpackage.agwe.HAS_ERASED_VALUE_PARAMETERS), java.lang.Boolean.TRUE);
    }

    public static final boolean isJspecifyEnabledInStrictMode(defpackage.agud agudVar) {
        agudVar.getClass();
        return agudVar.getGetReportLevelForAnnotation().invoke(defpackage.agty.getJSPECIFY_ANNOTATIONS_PACKAGE()) == defpackage.aguq.STRICT;
    }

    public static final defpackage.agdc toDescriptorVisibility(defpackage.agfy agfyVar) {
        agfyVar.getClass();
        return defpackage.agtv.toDescriptorVisibility(agfyVar);
    }
}
