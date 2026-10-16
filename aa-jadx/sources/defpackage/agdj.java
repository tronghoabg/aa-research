package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agdj extends defpackage.agbx {
    @Override // defpackage.agcj, defpackage.agci
    defpackage.agci getContainingDeclaration();

    defpackage.agdj getInitialSignatureDescriptor();

    @Override // defpackage.agbx, defpackage.agbv, defpackage.agci
    defpackage.agdj getOriginal();

    @Override // defpackage.agbx, defpackage.agbv
    java.util.Collection<? extends defpackage.agdj> getOverriddenDescriptors();

    boolean isHiddenForResolutionEverywhereBesideSupercalls();

    boolean isHiddenToOvercomeSignatureClash();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    boolean isTailrec();

    defpackage.agdi<? extends defpackage.agdj> newCopyBuilder();

    defpackage.agdj substitute(defpackage.aijy aijyVar);
}
