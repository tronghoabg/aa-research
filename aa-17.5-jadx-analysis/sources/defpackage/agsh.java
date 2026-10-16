package defpackage;

/* loaded from: classes3.dex */
public final class agsh {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1 || i == 2) {
            objArr[0] = "companionObject";
        } else if (i != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean hasJvmFieldAnnotation(agax agaxVar) {
        agce backingField;
        if (agaxVar == null) {
            $$$reportNull$$$0(3);
        }
        if ((agaxVar instanceof agdn) && (backingField = ((agdn) agaxVar).getBackingField()) != null && backingField.getAnnotations().hasAnnotation(agth.JVM_FIELD_ANNOTATION_FQ_NAME)) {
            return true;
        }
        return agaxVar.getAnnotations().hasAnnotation(agth.JVM_FIELD_ANNOTATION_FQ_NAME);
    }

    public static boolean isClassCompanionObjectWithBackingFieldsInOuter(agbi agbiVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(1);
        }
        return ahst.isCompanionObject(agbiVar) && ahst.isClassOrEnumClass(agbiVar.getContainingDeclaration()) && !isMappedIntrinsicCompanionObject((agba) agbiVar);
    }

    public static boolean isMappedIntrinsicCompanionObject(agba agbaVar) {
        if (agbaVar == null) {
            $$$reportNull$$$0(2);
        }
        return afxt.isMappedIntrinsicCompanionObject(afxs.INSTANCE, agbaVar);
    }

    public static boolean isPropertyWithBackingFieldInOuterClass(agdn agdnVar) {
        if (agdnVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agdnVar.getKind() == agaw.FAKE_OVERRIDE) {
            return false;
        }
        if (isClassCompanionObjectWithBackingFieldsInOuter(agdnVar.getContainingDeclaration())) {
            return true;
        }
        return ahst.isCompanionObject(agdnVar.getContainingDeclaration()) && hasJvmFieldAnnotation(agdnVar);
    }
}
