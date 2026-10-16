package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes3.dex */
public interface ahxe extends ahxi {
    public static final ahxb Companion = ahxb.$$INSTANCE;

    Set<ahnj> getClassifierNames();

    @Override // defpackage.ahxi
    Collection<? extends agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar);

    Collection<? extends agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar);

    Set<ahnj> getFunctionNames();

    Set<ahnj> getVariableNames();
}
