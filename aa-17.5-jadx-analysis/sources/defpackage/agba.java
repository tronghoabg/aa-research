package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface agba extends agbc, agbe {
    agba getCompanionObjectDescriptor();

    Collection<agaz> getConstructors();

    @Override // defpackage.agbj, defpackage.agbi
    agbi getContainingDeclaration();

    List<agdq> getContextReceivers();

    List<agee> getDeclaredTypeParameters();

    @Override // defpackage.agbd
    aigw getDefaultType();

    agbb getKind();

    ahxe getMemberScope(aiit aiitVar);

    agcq getModality();

    @Override // defpackage.agbi
    agba getOriginal();

    ahxe getStaticScope();

    agdq getThisAsReceiverParameter();

    ahxe getUnsubstitutedInnerClassesScope();

    ahxe getUnsubstitutedMemberScope();

    agaz getUnsubstitutedPrimaryConstructor();

    agej<aigw> getValueClassRepresentation();

    agcc getVisibility();

    boolean isCompanionObject();

    boolean isData();

    boolean isFun();

    boolean isInline();

    boolean isValue();
}
