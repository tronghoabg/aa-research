package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agfl extends defpackage.agek, defpackage.agfm {
    defpackage.agfl copy(defpackage.agbv agbvVar, defpackage.ahoj ahojVar, int i);

    boolean declaresDefaultValue();

    @Override // defpackage.agfk, defpackage.agcj, defpackage.agci
    defpackage.agbv getContainingDeclaration();

    int getIndex();

    @Override // defpackage.agbv, defpackage.agci
    defpackage.agfl getOriginal();

    @Override // defpackage.agbv
    java.util.Collection<defpackage.agfl> getOverriddenDescriptors();

    defpackage.aihl getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
