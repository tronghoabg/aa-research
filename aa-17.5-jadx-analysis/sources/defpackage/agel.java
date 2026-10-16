package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface agel extends agdk, agem {
    agel copy(agav agavVar, ahnj ahnjVar, int i);

    boolean declaresDefaultValue();

    @Override // defpackage.agek, defpackage.agbj, defpackage.agbi
    agav getContainingDeclaration();

    int getIndex();

    @Override // defpackage.agav, defpackage.agbi
    agel getOriginal();

    @Override // defpackage.agav
    Collection<agel> getOverriddenDescriptors();

    aigl getVarargElementType();

    boolean isCrossinline();

    boolean isNoinline();
}
