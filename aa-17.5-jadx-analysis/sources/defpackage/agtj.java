package defpackage;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agtj {
    private static final Set<ahnf> BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS;
    private static final Set<ahnf> FORCE_FLEXIBILITY_ANNOTATIONS;
    private static final ahnf JAVAX_CHECK_FOR_NULL_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_NONNULL_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_NULLABLE_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME;
    private static final ahnf JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_NON_NULL_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_NULLABLE_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_NULLNESS_UNSPECIFIED_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_OLD_NULLABLE_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_OLD_NULLNESS_UNSPECIFIED_ANNOTATION_FQ_NAME;
    private static final ahnf JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME;
    private static final Set<ahnf> MUTABLE_ANNOTATIONS;
    private static final Set<ahnf> NOT_NULL_ANNOTATIONS;
    private static final Set<ahnf> NULLABILITY_ANNOTATIONS;
    private static final Set<ahnf> NULLABLE_ANNOTATIONS;
    private static final Set<ahnf> READ_ONLY_ANNOTATIONS;
    private static final ahnf UNDER_MIGRATION_ANNOTATION_FQ_NAME;
    private static final Map<ahnf, ahnf> javaToKotlinNameMap;

    static {
        ahnf ahnfVar = new ahnf("org.jspecify.nullness.Nullable");
        JSPECIFY_OLD_NULLABLE_ANNOTATION_FQ_NAME = ahnfVar;
        ahnf ahnfVar2 = new ahnf("org.jspecify.nullness.NullMarked");
        JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME = ahnfVar2;
        ahnf ahnfVar3 = new ahnf("org.jspecify.nullness.NullnessUnspecified");
        JSPECIFY_OLD_NULLNESS_UNSPECIFIED_ANNOTATION_FQ_NAME = ahnfVar3;
        ahnf ahnfVar4 = new ahnf("org.jspecify.annotations.NonNull");
        JSPECIFY_NON_NULL_ANNOTATION_FQ_NAME = ahnfVar4;
        ahnf ahnfVar5 = new ahnf("org.jspecify.annotations.Nullable");
        JSPECIFY_NULLABLE_ANNOTATION_FQ_NAME = ahnfVar5;
        ahnf ahnfVar6 = new ahnf("org.jspecify.annotations.NullMarked");
        JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME = ahnfVar6;
        ahnf ahnfVar7 = new ahnf("org.jspecify.annotations.NullnessUnspecified");
        JSPECIFY_NULLNESS_UNSPECIFIED_ANNOTATION_FQ_NAME = ahnfVar7;
        ahnf ahnfVar8 = new ahnf("org.jspecify.annotations.NullUnmarked");
        JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME = ahnfVar8;
        JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME = new ahnf("javax.annotation.meta.TypeQualifier");
        JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME = new ahnf("javax.annotation.meta.TypeQualifierNickname");
        JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME = new ahnf("javax.annotation.meta.TypeQualifierDefault");
        ahnf ahnfVar9 = new ahnf("javax.annotation.Nonnull");
        JAVAX_NONNULL_ANNOTATION_FQ_NAME = ahnfVar9;
        ahnf ahnfVar10 = new ahnf("javax.annotation.Nullable");
        JAVAX_NULLABLE_ANNOTATION_FQ_NAME = ahnfVar10;
        ahnf ahnfVar11 = new ahnf("javax.annotation.CheckForNull");
        JAVAX_CHECK_FOR_NULL_ANNOTATION_FQ_NAME = ahnfVar11;
        JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME = new ahnf("javax.annotation.ParametersAreNonnullByDefault");
        JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME = new ahnf("javax.annotation.ParametersAreNullableByDefault");
        BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS = woy.di(new ahnf[]{ahnfVar9, ahnfVar11});
        ahnf ahnfVar12 = agti.JETBRAINS_NOT_NULL_ANNOTATION;
        ahnfVar12.getClass();
        Set<ahnf> setDi = woy.di(new ahnf[]{ahnfVar12, ahnfVar4, new ahnf("android.annotation.NonNull"), new ahnf("androidx.annotation.NonNull"), new ahnf("androidx.annotation.RecentlyNonNull"), new ahnf("android.support.annotation.NonNull"), new ahnf("com.android.annotations.NonNull"), new ahnf("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new ahnf("org.checkerframework.checker.nullness.qual.NonNull"), new ahnf("edu.umd.cs.findbugs.annotations.NonNull"), new ahnf("io.reactivex.annotations.NonNull"), new ahnf("io.reactivex.rxjava3.annotations.NonNull"), new ahnf("org.eclipse.jdt.annotation.NonNull"), new ahnf("lombok.NonNull"), new ahnf("jakarta.annotation.Nonnull")});
        NOT_NULL_ANNOTATIONS = setDi;
        ahnf ahnfVar13 = agti.JETBRAINS_NULLABLE_ANNOTATION;
        ahnfVar13.getClass();
        Set<ahnf> setDi2 = woy.di(new ahnf[]{ahnfVar13, ahnfVar, ahnfVar5, ahnfVar10, ahnfVar11, new ahnf("android.annotation.Nullable"), new ahnf("androidx.annotation.Nullable"), new ahnf("androidx.annotation.RecentlyNullable"), new ahnf("android.support.annotation.Nullable"), new ahnf("com.android.annotations.Nullable"), new ahnf("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new ahnf("org.checkerframework.checker.nullness.qual.Nullable"), new ahnf("edu.umd.cs.findbugs.annotations.Nullable"), new ahnf("edu.umd.cs.findbugs.annotations.PossiblyNull"), new ahnf("edu.umd.cs.findbugs.annotations.CheckForNull"), new ahnf("io.reactivex.annotations.Nullable"), new ahnf("io.reactivex.rxjava3.annotations.Nullable"), new ahnf("org.eclipse.jdt.annotation.Nullable"), new ahnf("jakarta.annotation.Nullable"), new ahnf("io.vertx.codegen.annotations.Nullable")});
        NULLABLE_ANNOTATIONS = setDi2;
        FORCE_FLEXIBILITY_ANNOTATIONS = woy.di(new ahnf[]{ahnfVar3, ahnfVar7});
        NULLABILITY_ANNOTATIONS = woy.aT(woy.aT(woy.aT(woy.aT(woy.aS(woy.aS(new LinkedHashSet(), setDi), setDi2), ahnfVar9), ahnfVar2), ahnfVar6), ahnfVar8);
        READ_ONLY_ANNOTATIONS = woy.di(new ahnf[]{agti.JETBRAINS_READONLY_ANNOTATION, agti.READONLY_ANNOTATION, agti.JETBRAINS_UNMODIFIABLE_ANNOTATION, agti.JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION});
        MUTABLE_ANNOTATIONS = woy.di(new ahnf[]{agti.JETBRAINS_MUTABLE_ANNOTATION, agti.MUTABLE_ANNOTATION});
        javaToKotlinNameMap = woy.ba(new aezu(agti.TARGET_ANNOTATION, afyn.target), new aezu(agti.RETENTION_ANNOTATION, afyn.retention), new aezu(agti.DEPRECATED_ANNOTATION, afyn.deprecated), new aezu(agti.DOCUMENTED_ANNOTATION, afyn.mustBeDocumented));
        UNDER_MIGRATION_ANNOTATION_FQ_NAME = new ahnf("kotlin.annotations.jvm.UnderMigration");
    }

    public static final Set<ahnf> getBUILT_IN_TYPE_QUALIFIER_ANNOTATIONS() {
        return BUILT_IN_TYPE_QUALIFIER_ANNOTATIONS;
    }

    public static final Set<ahnf> getFORCE_FLEXIBILITY_ANNOTATIONS() {
        return FORCE_FLEXIBILITY_ANNOTATIONS;
    }

    public static final ahnf getJAVAX_NONNULL_ANNOTATION_FQ_NAME() {
        return JAVAX_NONNULL_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_DEFAULT_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME() {
        return JAVAX_TYPE_QUALIFIER_NICKNAME_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME;
    }

    public static final ahnf getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME() {
        return JSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME;
    }

    public static final Set<ahnf> getMUTABLE_ANNOTATIONS() {
        return MUTABLE_ANNOTATIONS;
    }

    public static final Set<ahnf> getNOT_NULL_ANNOTATIONS() {
        return NOT_NULL_ANNOTATIONS;
    }

    public static final Set<ahnf> getNULLABLE_ANNOTATIONS() {
        return NULLABLE_ANNOTATIONS;
    }

    public static final Set<ahnf> getREAD_ONLY_ANNOTATIONS() {
        return READ_ONLY_ANNOTATIONS;
    }

    public static final ahnf getUNDER_MIGRATION_ANNOTATION_FQ_NAME() {
        return UNDER_MIGRATION_ANNOTATION_FQ_NAME;
    }
}
