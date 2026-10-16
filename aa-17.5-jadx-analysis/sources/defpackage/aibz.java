package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
interface aibz {
    void addFunctionsAndPropertiesTo(Collection<agbi> collection, ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar, aglo agloVar);

    Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar);

    Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar);

    Set<ahnj> getFunctionNames();

    aged getTypeAliasByName(ahnj ahnjVar);

    Set<ahnj> getTypeAliasNames();

    Set<ahnj> getVariableNames();
}
