package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface agdn extends agax, agen {
    List<agdm> getAccessors();

    agce getBackingField();

    agce getDelegateField();

    agdo getGetter();

    @Override // defpackage.agax, defpackage.agav, defpackage.agbi
    agdn getOriginal();

    @Override // defpackage.agax, defpackage.agav
    Collection<? extends agdn> getOverriddenDescriptors();

    agdp getSetter();

    @Override // defpackage.agea
    agdn substitute(aiiy aiiyVar);
}
