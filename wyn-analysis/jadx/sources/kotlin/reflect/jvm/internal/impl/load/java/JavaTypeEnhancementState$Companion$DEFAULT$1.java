package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.AbstractC3337h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.H;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tf.l;

/* loaded from: classes5.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends AbstractC3337h implements l {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 INSTANCE = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // kotlin.jvm.internal.AbstractC3332c, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final KDeclarationContainer getOwner() {
        return H.f39741a.getOrCreateKotlinPackage(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.AbstractC3332c
    @NotNull
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // tf.l
    @NotNull
    public final ReportLevel invoke(@NotNull FqName p02) {
        AbstractC3340k.e(p02, "p0");
        return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(p02);
    }
}
