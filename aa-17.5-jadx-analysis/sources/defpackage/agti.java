package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public final class agti {
    public static final ahnj DEFAULT_ANNOTATION_MEMBER_NAME;
    public static final ahnf DEPRECATED_ANNOTATION;
    public static final ahnf DOCUMENTED_ANNOTATION;
    public static final ahnf ELEMENT_TYPE_ENUM;
    public static final ahnf ENHANCED_MUTABILITY_ANNOTATION;
    public static final ahnf ENHANCED_NULLABILITY_ANNOTATION;
    public static final ahnf INHERITED_ANNOTATION;
    public static final ahnf JETBRAINS_MUTABLE_ANNOTATION;
    public static final ahnf JETBRAINS_NOT_NULL_ANNOTATION;
    public static final ahnf JETBRAINS_NULLABLE_ANNOTATION;
    public static final ahnf JETBRAINS_READONLY_ANNOTATION;
    public static final ahnf JETBRAINS_UNMODIFIABLE_ANNOTATION;
    public static final ahnf JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION;
    public static final ahnf KOTLIN_JVM_INTERNAL;
    public static final String METADATA_DESC;
    public static final ahnf METADATA_FQ_NAME;
    public static final ahnf MUTABLE_ANNOTATION;
    public static final ahnf OVERRIDE_ANNOTATION;
    public static final ahnf PURELY_IMPLEMENTS_ANNOTATION;
    public static final ahnf READONLY_ANNOTATION;
    public static final ahnf REPEATABLE_ANNOTATION;
    public static final ahnf RETENTION_ANNOTATION;
    public static final ahnf RETENTION_POLICY_ENUM;
    public static final ahnf TARGET_ANNOTATION;

    static {
        ahnf ahnfVar = new ahnf("kotlin.Metadata");
        METADATA_FQ_NAME = ahnfVar;
        METADATA_DESC = "L" + ahwd.byFqNameWithoutInnerClasses(ahnfVar).getInternalName() + ";";
        DEFAULT_ANNOTATION_MEMBER_NAME = ahnj.identifier("value");
        TARGET_ANNOTATION = new ahnf(Target.class.getName());
        ELEMENT_TYPE_ENUM = new ahnf(ElementType.class.getName());
        RETENTION_ANNOTATION = new ahnf(Retention.class.getName());
        RETENTION_POLICY_ENUM = new ahnf(RetentionPolicy.class.getName());
        DEPRECATED_ANNOTATION = new ahnf(Deprecated.class.getName());
        DOCUMENTED_ANNOTATION = new ahnf(Documented.class.getName());
        REPEATABLE_ANNOTATION = new ahnf("java.lang.annotation.Repeatable");
        INHERITED_ANNOTATION = new ahnf("java.lang.annotation.Inherited");
        OVERRIDE_ANNOTATION = new ahnf(Override.class.getName());
        JETBRAINS_NOT_NULL_ANNOTATION = new ahnf("org.jetbrains.annotations.NotNull");
        JETBRAINS_NULLABLE_ANNOTATION = new ahnf("org.jetbrains.annotations.Nullable");
        JETBRAINS_MUTABLE_ANNOTATION = new ahnf("org.jetbrains.annotations.Mutable");
        JETBRAINS_READONLY_ANNOTATION = new ahnf("org.jetbrains.annotations.ReadOnly");
        JETBRAINS_UNMODIFIABLE_ANNOTATION = new ahnf("org.jetbrains.annotations.Unmodifiable");
        JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION = new ahnf("org.jetbrains.annotations.UnmodifiableView");
        READONLY_ANNOTATION = new ahnf("kotlin.annotations.jvm.ReadOnly");
        MUTABLE_ANNOTATION = new ahnf("kotlin.annotations.jvm.Mutable");
        PURELY_IMPLEMENTS_ANNOTATION = new ahnf("kotlin.jvm.PurelyImplements");
        KOTLIN_JVM_INTERNAL = new ahnf("kotlin.jvm.internal");
        ENHANCED_NULLABILITY_ANNOTATION = new ahnf("kotlin.jvm.internal.EnhancedNullability");
        ENHANCED_MUTABILITY_ANNOTATION = new ahnf("kotlin.jvm.internal.EnhancedMutability");
    }
}
