package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface agcu extends agbi {
    afye getBuiltIns();

    <T> T getCapability(agcs<T> agcsVar);

    List<agcu> getExpectedByModules();

    agdj getPackage(ahnf ahnfVar);

    Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar);

    boolean shouldSeeInternalsOf(agcu agcuVar);
}
