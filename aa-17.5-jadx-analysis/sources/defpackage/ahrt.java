package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public interface ahrt {
    ahql getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    Set<ahnf> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(ahql ahqlVar);

    void setClassifierNamePolicy(ahqp ahqpVar);

    void setDebugMode(boolean z);

    void setExcludedTypeAnnotationClasses(Set<ahnf> set);

    void setModifiers(Set<? extends ahrr> set);

    void setParameterNameRenderingPolicy(ahsc ahscVar);

    void setReceiverAfterName(boolean z);

    void setRenderCompanionObjectName(boolean z);

    void setStartFromName(boolean z);

    void setTextFormat(ahsg ahsgVar);

    void setVerbose(boolean z);

    void setWithDefinedIn(boolean z);

    void setWithoutSuperTypes(boolean z);

    void setWithoutTypeParameters(boolean z);
}
