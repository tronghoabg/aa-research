package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public interface agbh extends agcj {
    agba getConstructedClass();

    @Override // defpackage.agcj, defpackage.agbj, defpackage.agbi
    agbe getContainingDeclaration();

    @Override // defpackage.agav
    aigl getReturnType();

    @Override // defpackage.agav
    List<agee> getTypeParameters();

    boolean isPrimary();

    @Override // defpackage.agcj, defpackage.agea
    agbh substitute(aiiy aiiyVar);
}
