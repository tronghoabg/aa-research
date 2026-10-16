package defpackage;

/* loaded from: classes3.dex */
public final class agsy {
    private static final ahnf CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE;
    private static final ahnf JSPECIFY_ANNOTATIONS_PACKAGE;
    private static final ahnf JSPECIFY_OLD_ANNOTATIONS_PACKAGE;
    private static final agta JSR_305_DEFAULT_SETTINGS;
    private static final agtl<agta> NULLABILITY_ANNOTATION_SETTINGS;
    private static final ahnf[] RXJAVA3_ANNOTATIONS;
    private static final ahnf RXJAVA3_ANNOTATIONS_PACKAGE;
    private static final String RXJAVA3_ANNOTATIONS_PACKAGE_NAME;

    static {
        ahnf ahnfVar = new ahnf("org.jspecify.nullness");
        JSPECIFY_OLD_ANNOTATIONS_PACKAGE = ahnfVar;
        ahnf ahnfVar2 = new ahnf("org.jspecify.annotations");
        JSPECIFY_ANNOTATIONS_PACKAGE = ahnfVar2;
        ahnf ahnfVar3 = new ahnf("io.reactivex.rxjava3.annotations");
        RXJAVA3_ANNOTATIONS_PACKAGE = ahnfVar3;
        ahnf ahnfVar4 = new ahnf("org.checkerframework.checker.nullness.compatqual");
        CHECKER_FRAMEWORK_COMPATQUAL_ANNOTATIONS_PACKAGE = ahnfVar4;
        String strAsString = ahnfVar3.asString();
        RXJAVA3_ANNOTATIONS_PACKAGE_NAME = strAsString;
        RXJAVA3_ANNOTATIONS = new ahnf[]{new ahnf(String.valueOf(strAsString).concat(".Nullable")), new ahnf(String.valueOf(strAsString).concat(".NonNull"))};
        int i = 4;
        afeu afeuVar = null;
        aezq aezqVar = null;
        agtq agtqVar = null;
        NULLABILITY_ANNOTATION_SETTINGS = new agtn(woy.ba(new aezu(new ahnf("org.jetbrains.annotations"), agta.Companion.getDEFAULT()), new aezu(new ahnf("kotlin.annotations.jvm"), agta.Companion.getDEFAULT()), new aezu(new ahnf("androidx.annotation"), agta.Companion.getDEFAULT()), new aezu(new ahnf("android.support.annotation"), agta.Companion.getDEFAULT()), new aezu(new ahnf("android.annotation"), agta.Companion.getDEFAULT()), new aezu(new ahnf("com.android.annotations"), agta.Companion.getDEFAULT()), new aezu(new ahnf("org.eclipse.jdt.annotation"), agta.Companion.getDEFAULT()), new aezu(new ahnf("org.checkerframework.checker.nullness.qual"), agta.Companion.getDEFAULT()), new aezu(ahnfVar4, agta.Companion.getDEFAULT()), new aezu(new ahnf("javax.annotation"), agta.Companion.getDEFAULT()), new aezu(new ahnf("edu.umd.cs.findbugs.annotations"), agta.Companion.getDEFAULT()), new aezu(new ahnf("io.reactivex.annotations"), agta.Companion.getDEFAULT()), new aezu(new ahnf("androidx.annotation.RecentlyNullable"), new agta(agtq.WARN, aezqVar, agtqVar, i, afeuVar)), new aezu(new ahnf("androidx.annotation.RecentlyNonNull"), new agta(agtq.WARN, aezqVar, agtqVar, i, afeuVar)), new aezu(new ahnf("lombok"), agta.Companion.getDEFAULT()), new aezu(ahnfVar, new agta(agtq.WARN, new aezq(2, 1), agtq.STRICT)), new aezu(ahnfVar2, new agta(agtq.WARN, new aezq(2, 1), agtq.STRICT)), new aezu(ahnfVar3, new agta(agtq.WARN, new aezq(1, 8), agtq.STRICT)), new aezu(new ahnf("jakarta.annotation"), new agta(agtq.WARN, new aezq(2, 4), agtq.STRICT)), new aezu(agti.JETBRAINS_UNMODIFIABLE_ANNOTATION, new agta(agtq.WARN, new aezq(2, 5), agtq.STRICT)), new aezu(agti.JETBRAINS_UNMODIFIABLE_VIEW_ANNOTATION, new agta(agtq.WARN, new aezq(2, 5), agtq.STRICT)), new aezu(new ahnf("io.vertx.codegen.annotations"), new agta(agtq.WARN, new aezq(2, 5), agtq.STRICT))));
        JSR_305_DEFAULT_SETTINGS = new agta(agtq.WARN, null, null, 4, null);
    }

    public static final agtg getDefaultJsr305Settings(aezq aezqVar) {
        aezqVar.getClass();
        agta agtaVar = JSR_305_DEFAULT_SETTINGS;
        agtq reportLevelBefore = (agtaVar.getSinceVersion() == null || agtaVar.getSinceVersion().compareTo(aezqVar) > 0) ? agtaVar.getReportLevelBefore() : agtaVar.getReportLevelAfter();
        return new agtg(reportLevelBefore, getDefaultMigrationJsr305ReportLevelForGivenGlobal(reportLevelBefore), null, 4, null);
    }

    public static final agtq getDefaultMigrationJsr305ReportLevelForGivenGlobal(agtq agtqVar) {
        agtqVar.getClass();
        if (agtqVar == agtq.WARN) {
            return null;
        }
        return agtqVar;
    }

    public static final agtq getDefaultReportLevelForAnnotation(ahnf ahnfVar, aezq aezqVar) {
        ahnfVar.getClass();
        aezqVar.getClass();
        return getReportLevelForAnnotation(ahnfVar, agtl.Companion.getEMPTY(), aezqVar);
    }

    public static final ahnf getJSPECIFY_ANNOTATIONS_PACKAGE() {
        return JSPECIFY_ANNOTATIONS_PACKAGE;
    }

    public static final ahnf[] getRXJAVA3_ANNOTATIONS() {
        return RXJAVA3_ANNOTATIONS;
    }

    public static final agtq getReportLevelForAnnotation(ahnf ahnfVar, agtl<? extends agtq> agtlVar, aezq aezqVar) {
        ahnfVar.getClass();
        agtlVar.getClass();
        aezqVar.getClass();
        agtq agtqVar = agtlVar.get(ahnfVar);
        if (agtqVar != null) {
            return agtqVar;
        }
        agta agtaVar = NULLABILITY_ANNOTATION_SETTINGS.get(ahnfVar);
        return agtaVar == null ? agtq.IGNORE : (agtaVar.getSinceVersion() == null || agtaVar.getSinceVersion().compareTo(aezqVar) > 0) ? agtaVar.getReportLevelBefore() : agtaVar.getReportLevelAfter();
    }
}
