package defpackage;

import defpackage.agcj;
import java.util.List;

/* loaded from: classes3.dex */
public interface agci<D extends agcj> {
    D build();

    <V> agci<D> putUserData(agau<V> agauVar, V v);

    agci<D> setAdditionalAnnotations(agfk agfkVar);

    agci<D> setCopyOverrides(boolean z);

    agci<D> setDispatchReceiverParameter(agdq agdqVar);

    agci<D> setDropOriginalInContainingParts();

    agci<D> setExtensionReceiverParameter(agdq agdqVar);

    agci<D> setHiddenForResolutionEverywhereBesideSupercalls();

    agci<D> setHiddenToOvercomeSignatureClash();

    agci<D> setKind(agaw agawVar);

    agci<D> setModality(agcq agcqVar);

    agci<D> setName(ahnj ahnjVar);

    agci<D> setOriginal(agax agaxVar);

    agci<D> setOwner(agbi agbiVar);

    agci<D> setPreserveSourceElement();

    agci<D> setReturnType(aigl aiglVar);

    agci<D> setSignatureChange();

    agci<D> setSubstitution(aiit aiitVar);

    agci<D> setTypeParameters(List<agee> list);

    agci<D> setValueParameters(List<agel> list);

    agci<D> setVisibility(agcc agccVar);
}
