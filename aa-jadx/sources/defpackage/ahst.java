package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface ahst {
    defpackage.ahrl getAnnotationArgumentsRenderingPolicy();

    boolean getDebugMode();

    boolean getEnhancedTypes();

    java.util.Set<defpackage.ahof> getExcludedTypeAnnotationClasses();

    void setAnnotationArgumentsRenderingPolicy(defpackage.ahrl ahrlVar);

    void setClassifierNamePolicy(defpackage.ahrp ahrpVar);

    void setDebugMode(boolean z);

    void setExcludedTypeAnnotationClasses(java.util.Set<defpackage.ahof> set);

    void setModifiers(java.util.Set<? extends defpackage.ahsr> set);

    void setParameterNameRenderingPolicy(defpackage.ahtc ahtcVar);

    void setReceiverAfterName(boolean z);

    void setRenderCompanionObjectName(boolean z);

    void setStartFromName(boolean z);

    void setTextFormat(defpackage.ahtg ahtgVar);

    void setVerbose(boolean z);

    void setWithDefinedIn(boolean z);

    void setWithoutSuperTypes(boolean z);

    void setWithoutTypeParameters(boolean z);
}
