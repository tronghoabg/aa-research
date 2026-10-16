package defpackage;

/* loaded from: classes3.dex */
public final class agfb {
    public static ahnf getFqName(agfc agfcVar) {
        agba annotationClass = ahvz.getAnnotationClass(agfcVar);
        if (annotationClass != null) {
            ailm ailmVar = ailm.INSTANCE;
            if (true == ailm.isError(annotationClass)) {
                annotationClass = null;
            }
            if (annotationClass != null) {
                return ahvz.fqNameOrNull(annotationClass);
            }
        }
        return null;
    }
}
