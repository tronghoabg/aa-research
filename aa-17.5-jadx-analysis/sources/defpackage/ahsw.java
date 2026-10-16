package defpackage;

/* loaded from: classes3.dex */
public final class ahsw {
    private static final ahnd JVM_INLINE_ANNOTATION_CLASS_ID;
    private static final ahnf JVM_INLINE_ANNOTATION_FQ_NAME;
    private static final ahnf JVM_NAME_ANNOTATION_FQ_NAME;

    static {
        ahnf ahnfVar = new ahnf("kotlin.jvm.JvmInline");
        JVM_INLINE_ANNOTATION_FQ_NAME = ahnfVar;
        JVM_INLINE_ANNOTATION_CLASS_ID = ahnd.Companion.topLevel(ahnfVar);
        JVM_NAME_ANNOTATION_FQ_NAME = new ahnf("kotlin.jvm.JvmName");
    }

    public static final boolean isInlineClass(agbi agbiVar) {
        agbiVar.getClass();
        return (agbiVar instanceof agba) && (((agba) agbiVar).getValueClassRepresentation() instanceof agck);
    }

    public static final boolean isInlineClassType(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return isInlineClass(declarationDescriptor);
        }
        return false;
    }

    public static final boolean isMultiFieldValueClass(agbi agbiVar) {
        agbiVar.getClass();
        return (agbiVar instanceof agba) && (((agba) agbiVar).getValueClassRepresentation() instanceof agcv);
    }

    public static final boolean isUnderlyingPropertyOfInlineClass(agem agemVar) {
        agck<aigw> inlineClassRepresentation;
        agemVar.getClass();
        if (agemVar.getExtensionReceiverParameter() != null || !agemVar.getContextReceiverParameters().isEmpty()) {
            return false;
        }
        agbi containingDeclaration = agemVar.getContainingDeclaration();
        ahnj underlyingPropertyName = null;
        agba agbaVar = containingDeclaration instanceof agba ? (agba) containingDeclaration : null;
        if (agbaVar != null && (inlineClassRepresentation = ahvz.getInlineClassRepresentation(agbaVar)) != null) {
            underlyingPropertyName = inlineClassRepresentation.getUnderlyingPropertyName();
        }
        return affa.f(underlyingPropertyName, agemVar.getName());
    }

    public static final boolean isValueClass(agbi agbiVar) {
        agbiVar.getClass();
        return isInlineClass(agbiVar) || isMultiFieldValueClass(agbiVar);
    }

    public static final boolean needsMfvcFlattening(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return (declarationDescriptor == null || !isMultiFieldValueClass(declarationDescriptor) || aikj.INSTANCE.isNullableType(aiglVar)) ? false : true;
    }

    public static final aigl unsubstitutedUnderlyingType(aigl aiglVar) {
        agck<aigw> inlineClassRepresentation;
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
        if (agbaVar == null || (inlineClassRepresentation = ahvz.getInlineClassRepresentation(agbaVar)) == null) {
            return null;
        }
        return (aigw) inlineClassRepresentation.getUnderlyingType();
    }
}
