package defpackage;

/* loaded from: classes3.dex */
public final class agvk {
    private static final agvu child(agvu agvuVar, agbi agbiVar, agzy agzyVar, int i, aezr<agte> aezrVar) {
        return new agvu(agvuVar.getComponents(), agzyVar != null ? new agvw(agvuVar, agbiVar, agzyVar, i) : agvuVar.getTypeParameterResolver(), aezrVar);
    }

    public static final agvu childForClassOrPackage(agvu agvuVar, agbc agbcVar, agzy agzyVar, int i) {
        agvuVar.getClass();
        agbcVar.getClass();
        return child(agvuVar, agbcVar, agzyVar, i, woy.dH(3, new agvi(agvuVar, agbcVar)));
    }

    public static /* synthetic */ agvu childForClassOrPackage$default(agvu agvuVar, agbc agbcVar, agzy agzyVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            agzyVar = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForClassOrPackage(agvuVar, agbcVar, agzyVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agte childForClassOrPackage$lambda$0(agvu agvuVar, agbc agbcVar) {
        return computeNewDefaultTypeQualifiers(agvuVar, agbcVar.getAnnotations());
    }

    public static final agvu childForMethod(agvu agvuVar, agbi agbiVar, agzy agzyVar, int i) {
        agvuVar.getClass();
        agbiVar.getClass();
        agzyVar.getClass();
        return child(agvuVar, agbiVar, agzyVar, i, agvuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }

    public static /* synthetic */ agvu childForMethod$default(agvu agvuVar, agbi agbiVar, agzy agzyVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return childForMethod(agvuVar, agbiVar, agzyVar, i);
    }

    public static final agte computeNewDefaultTypeQualifiers(agvu agvuVar, agfk agfkVar) {
        agvuVar.getClass();
        agfkVar.getClass();
        return agru.extractAndMergeDefaultQualifiers$default(agvuVar.getComponents().getAnnotationTypeQualifierResolver(), agvuVar.getDefaultTypeQualifiers(), agfkVar, false, 4, null);
    }

    public static final agvu copyWithNewDefaultTypeQualifiers(agvu agvuVar, agfk agfkVar) {
        agvuVar.getClass();
        agfkVar.getClass();
        return agfkVar.isEmpty() ? agvuVar : new agvu(agvuVar.getComponents(), agvuVar.getTypeParameterResolver(), woy.dH(3, new agvj(agvuVar, agfkVar)));
    }

    public static final agvu replaceComponents(agvu agvuVar, agvl agvlVar) {
        agvuVar.getClass();
        agvlVar.getClass();
        return new agvu(agvlVar, agvuVar.getTypeParameterResolver(), agvuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }

    public static final agvu child(agvu agvuVar, agwa agwaVar) {
        agvuVar.getClass();
        agwaVar.getClass();
        return new agvu(agvuVar.getComponents(), agwaVar, agvuVar.getDelegateForDefaultTypeQualifiers$org_jetbrains_kotlin_descriptors_jvm());
    }
}
