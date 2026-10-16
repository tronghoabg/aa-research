package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface agcj extends agax {
    @Override // defpackage.agbj, defpackage.agbi
    agbi getContainingDeclaration();

    agcj getInitialSignatureDescriptor();

    @Override // defpackage.agax, defpackage.agav, defpackage.agbi
    agcj getOriginal();

    @Override // defpackage.agax, defpackage.agav
    Collection<? extends agcj> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    agci<? extends agcj> newCopyBuilder();

    agcj substitute(aiiy aiiyVar);
}
