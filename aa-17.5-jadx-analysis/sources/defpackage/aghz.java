package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aghz implements aghy {
    private final List<agic> allDependencies;
    private final Set<agic> allExpectedByDependencies;
    private final List<agic> directExpectedByDependencies;
    private final Set<agic> modulesWhoseInternalsAreVisible;

    public aghz(List<agic> list, Set<agic> set, List<agic> list2, Set<agic> set2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        set2.getClass();
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.directExpectedByDependencies = list2;
        this.allExpectedByDependencies = set2;
    }

    @Override // defpackage.aghy
    public List<agic> getAllDependencies() {
        return this.allDependencies;
    }

    @Override // defpackage.aghy
    public List<agic> getDirectExpectedByDependencies() {
        return this.directExpectedByDependencies;
    }

    @Override // defpackage.aghy
    public Set<agic> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }
}
