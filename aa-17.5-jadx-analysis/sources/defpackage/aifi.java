package defpackage;

/* loaded from: classes3.dex */
public final class aifi {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aifi.class, "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lkotlin/reflect/jvm/internal/impl/types/AnnotationsTypeAttribute;", 1)};
    private static final afgl annotationsAttribute$delegate = aihr.Companion.generateNullableAccessor(affw.b(aifh.class));

    public static final agfk getAnnotations(aihr aihrVar) {
        agfk annotations;
        aihrVar.getClass();
        aifh annotationsAttribute = getAnnotationsAttribute(aihrVar);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? agfk.Companion.getEMPTY() : annotations;
    }

    public static final aifh getAnnotationsAttribute(aihr aihrVar) {
        aihrVar.getClass();
        return (aifh) annotationsAttribute$delegate.getValue(aihrVar, $$delegatedProperties[0]);
    }
}
