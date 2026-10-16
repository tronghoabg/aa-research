package kotlin.reflect.jvm.internal.impl.load.java;

import N0.a;
import ef.C2524h;
import ef.C2527k;
import ff.AbstractC2640A;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class JavaNullabilityAnnotationSettingsKt {

    @NotNull
    private static final FqName CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final FqName JSPECIFY_OLD_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final JavaNullabilityAnnotationsStatus JSR_305_DEFAULT_SETTINGS;

    @NotNull
    private static final NullabilityAnnotationStates<JavaNullabilityAnnotationsStatus> NULLABILITY_ANNOTATION_SETTINGS;

    @NotNull
    private static final FqName[] RXJAVA3_ANNOTATIONS;

    @NotNull
    private static final FqName RXJAVA3_ANNOTATIONS_PACKAGE;

    @NotNull
    private static final String RXJAVA3_ANNOTATIONS_PACKAGE_NAME;

    static {
        FqName fqName = new FqName("org.jspecify.nullness");
        JSPECIFY_OLD_ANNOTATIONS_PACKAGE = fqName;
        FqName fqName2 = new FqName("org.jspecify.annotations");
        JSPECIFY_ANNOTATIONS_PACKAGE = fqName2;
        FqName fqName3 = new FqName("io.reactivex.rxjava3.annotations");
        RXJAVA3_ANNOTATIONS_PACKAGE = fqName3;
        FqName fqName4 = new FqName("org.checkerframework.checker.nullness.compatqual");
        CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE = fqName4;
        String strAsString = fqName3.asString();
        AbstractC3340k.d(strAsString, "asString(...)");
        RXJAVA3_ANNOTATIONS_PACKAGE_NAME = strAsString;
        RXJAVA3_ANNOTATIONS = new FqName[]{new FqName(a.f(strAsString, ".Nullable")), new FqName(a.f(strAsString, ".NonNull"))};
        FqName fqName5 = new FqName("org.jetbrains.annotations");
        JavaNullabilityAnnotationsStatus.Companion companion = JavaNullabilityAnnotationsStatus.Companion;
        C2527k c2527k = new C2527k(fqName5, companion.getDEFAULT());
        C2527k c2527k2 = new C2527k(new FqName("androidx.annotation"), companion.getDEFAULT());
        C2527k c2527k3 = new C2527k(new FqName("android.support.annotation"), companion.getDEFAULT());
        C2527k c2527k4 = new C2527k(new FqName("android.annotation"), companion.getDEFAULT());
        C2527k c2527k5 = new C2527k(new FqName("com.android.annotations"), companion.getDEFAULT());
        C2527k c2527k6 = new C2527k(new FqName("org.eclipse.jdt.annotation"), companion.getDEFAULT());
        C2527k c2527k7 = new C2527k(new FqName("org.checkerframework.checker.nullness.qual"), companion.getDEFAULT());
        C2527k c2527k8 = new C2527k(fqName4, companion.getDEFAULT());
        C2527k c2527k9 = new C2527k(new FqName("javax.annotation"), companion.getDEFAULT());
        C2527k c2527k10 = new C2527k(new FqName("edu.umd.cs.findbugs.annotations"), companion.getDEFAULT());
        C2527k c2527k11 = new C2527k(new FqName("io.reactivex.annotations"), companion.getDEFAULT());
        FqName fqName6 = new FqName("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        C2527k c2527k12 = new C2527k(fqName6, new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        C2527k c2527k13 = new C2527k(new FqName("androidx.annotation.RecentlyNonNull"), new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null));
        C2527k c2527k14 = new C2527k(new FqName("lombok"), companion.getDEFAULT());
        C2524h c2524h = new C2524h(2, 0, 0);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        NULLABILITY_ANNOTATION_SETTINGS = new NullabilityAnnotationStatesImpl(AbstractC2640A.R(c2527k, c2527k2, c2527k3, c2527k4, c2527k5, c2527k6, c2527k7, c2527k8, c2527k9, c2527k10, c2527k11, c2527k12, c2527k13, c2527k14, new C2527k(fqName, new JavaNullabilityAnnotationsStatus(reportLevel, c2524h, reportLevel2)), new C2527k(fqName2, new JavaNullabilityAnnotationsStatus(reportLevel, new C2524h(2, 0, 0), reportLevel2)), new C2527k(fqName3, new JavaNullabilityAnnotationsStatus(reportLevel, new C2524h(1, 8, 0), reportLevel2))));
        JSR_305_DEFAULT_SETTINGS = new JavaNullabilityAnnotationsStatus(reportLevel, null, null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings getDefaultJsr305Settings(@org.jetbrains.annotations.NotNull ef.C2524h r6) {
        /*
            java.lang.String r0 = "configuredKotlinVersion"
            kotlin.jvm.internal.AbstractC3340k.e(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationsStatus r0 = kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.JSR_305_DEFAULT_SETTINGS
            ef.h r1 = r0.getSinceVersion()
            if (r1 == 0) goto L21
            ef.h r1 = r0.getSinceVersion()
            r1.getClass()
            int r1 = r1.f34666d
            int r6 = r6.f34666d
            int r1 = r1 - r6
            if (r1 > 0) goto L21
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelAfter()
        L1f:
            r1 = r6
            goto L26
        L21:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.getReportLevelBefore()
            goto L1f
        L26:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = getDefaultMigrationJsr305ReportLevelForGivenGlobal(r1)
            kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings r0 = new kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings
            r5 = 0
            r3 = 0
            r4 = 4
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaNullabilityAnnotationSettingsKt.getDefaultJsr305Settings(ef.h):kotlin.reflect.jvm.internal.impl.load.java.Jsr305Settings");
    }

    public static /* synthetic */ Jsr305Settings getDefaultJsr305Settings$default(C2524h c2524h, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            c2524h = C2524h.f34662e;
        }
        return getDefaultJsr305Settings(c2524h);
    }

    @Nullable
    public static final ReportLevel getDefaultMigrationJsr305ReportLevelForGivenGlobal(@NotNull ReportLevel globalReportLevel) {
        AbstractC3340k.e(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @NotNull
    public static final ReportLevel getDefaultReportLevelForAnnotation(@NotNull FqName annotationFqName) {
        AbstractC3340k.e(annotationFqName, "annotationFqName");
        return getReportLevelForAnnotation$default(annotationFqName, NullabilityAnnotationStates.Companion.getEMPTY(), null, 4, null);
    }

    @NotNull
    public static final FqName getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JSPECIFY_ANNOTATIONS_PACKAGE;
    }

    @NotNull
    public static final FqName[] getRXJAVA3_ANNOTATIONS() {
        return RXJAVA3_ANNOTATIONS;
    }

    @NotNull
    public static final ReportLevel getReportLevelForAnnotation(@NotNull FqName annotation, @NotNull NullabilityAnnotationStates<? extends ReportLevel> configuredReportLevels, @NotNull C2524h configuredKotlinVersion) {
        AbstractC3340k.e(annotation, "annotation");
        AbstractC3340k.e(configuredReportLevels, "configuredReportLevels");
        AbstractC3340k.e(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel reportLevel = configuredReportLevels.get(annotation);
        if (reportLevel != null) {
            return reportLevel;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = NULLABILITY_ANNOTATION_SETTINGS.get(annotation);
        if (javaNullabilityAnnotationsStatus == null) {
            return ReportLevel.IGNORE;
        }
        if (javaNullabilityAnnotationsStatus.getSinceVersion() != null) {
            C2524h sinceVersion = javaNullabilityAnnotationsStatus.getSinceVersion();
            sinceVersion.getClass();
            if (sinceVersion.f34666d - configuredKotlinVersion.f34666d <= 0) {
                return javaNullabilityAnnotationsStatus.getReportLevelAfter();
            }
        }
        return javaNullabilityAnnotationsStatus.getReportLevelBefore();
    }

    public static /* synthetic */ ReportLevel getReportLevelForAnnotation$default(FqName fqName, NullabilityAnnotationStates nullabilityAnnotationStates, C2524h c2524h, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            c2524h = new C2524h(1, 7, 20);
        }
        return getReportLevelForAnnotation(fqName, nullabilityAnnotationStates, c2524h);
    }
}
