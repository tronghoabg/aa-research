package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agiz implements defpackage.agiy {
    private final java.util.List<defpackage.agjc> allDependencies;
    private final java.util.Set<defpackage.agjc> allExpectedByDependencies;
    private final java.util.List<defpackage.agjc> directExpectedByDependencies;
    private final java.util.Set<defpackage.agjc> modulesWhoseInternalsAreVisible;

    public agiz(java.util.List<defpackage.agjc> list, java.util.Set<defpackage.agjc> set, java.util.List<defpackage.agjc> list2, java.util.Set<defpackage.agjc> set2) {
        list.getClass();
        set.getClass();
        list2.getClass();
        set2.getClass();
        this.allDependencies = list;
        this.modulesWhoseInternalsAreVisible = set;
        this.directExpectedByDependencies = list2;
        this.allExpectedByDependencies = set2;
    }

    @Override // defpackage.agiy
    public java.util.List<defpackage.agjc> getAllDependencies() {
        return this.allDependencies;
    }

    @Override // defpackage.agiy
    public java.util.List<defpackage.agjc> getDirectExpectedByDependencies() {
        return this.directExpectedByDependencies;
    }

    @Override // defpackage.agiy
    public java.util.Set<defpackage.agjc> getModulesWhoseInternalsAreVisible() {
        return this.modulesWhoseInternalsAreVisible;
    }
}
