package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public interface agax extends agav, agco {
    agax copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z);

    agaw getKind();

    @Override // defpackage.agav, defpackage.agbi
    agax getOriginal();

    @Override // defpackage.agav
    Collection<? extends agax> getOverriddenDescriptors();

    void setOverriddenDescriptors(Collection<? extends agax> collection);
}
