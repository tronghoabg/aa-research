package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agca extends defpackage.agcc, defpackage.agce {
    defpackage.agca getCompanionObjectDescriptor();

    java.util.Collection<defpackage.agbz> getConstructors();

    @Override // defpackage.agcj, defpackage.agci
    defpackage.agci getContainingDeclaration();

    java.util.List<defpackage.ageq> getContextReceivers();

    java.util.List<defpackage.agfe> getDeclaredTypeParameters();

    @Override // defpackage.agcd
    defpackage.aihw getDefaultType();

    defpackage.agcb getKind();

    defpackage.ahye getMemberScope(defpackage.aijt aijtVar);

    defpackage.agdq getModality();

    @Override // defpackage.agci
    defpackage.agca getOriginal();

    defpackage.ahye getStaticScope();

    defpackage.ageq getThisAsReceiverParameter();

    defpackage.ahye getUnsubstitutedInnerClassesScope();

    defpackage.ahye getUnsubstitutedMemberScope();

    defpackage.agbz getUnsubstitutedPrimaryConstructor();

    defpackage.agfj<defpackage.aihw> getValueClassRepresentation();

    defpackage.agdc getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
