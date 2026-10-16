package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aimf implements defpackage.agdu {
    private static final java.util.List<defpackage.agdu> allDependencyModules;
    private static final java.util.Set<defpackage.agdu> allExpectedByModules;
    private static final defpackage.afar builtIns$delegate;
    private static final java.util.List<defpackage.agdu> expectedByModules;
    public static final defpackage.aimf INSTANCE = new defpackage.aimf();
    private static final defpackage.ahoj stableName = defpackage.ahoj.special(defpackage.aimb.ERROR_MODULE.getDebugText());

    static {
        defpackage.afce afceVar = defpackage.afce.a;
        allDependencyModules = afceVar;
        expectedByModules = afceVar;
        allExpectedByModules = defpackage.afcg.a;
        builtIns$delegate = defpackage.afga.cA(defpackage.aime.INSTANCE);
    }

    private aimf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afyw builtIns_delegate$lambda$0() {
        return defpackage.afyw.Companion.getInstance();
    }

    @Override // defpackage.agci
    public <R, D> R accept(defpackage.agck<R, D> agckVar, D d) {
        agckVar.getClass();
        return null;
    }

    @Override // defpackage.agfz
    public defpackage.aggk getAnnotations() {
        return defpackage.aggk.Companion.getEMPTY();
    }

    @Override // defpackage.agdu
    public defpackage.afze getBuiltIns() {
        return (defpackage.afze) builtIns$delegate.a();
    }

    @Override // defpackage.agdu
    public <T> T getCapability(defpackage.agds<T> agdsVar) {
        agdsVar.getClass();
        return null;
    }

    @Override // defpackage.agci
    public defpackage.agci getContainingDeclaration() {
        return null;
    }

    @Override // defpackage.agdu
    public java.util.List<defpackage.agdu> getExpectedByModules() {
        return expectedByModules;
    }

    @Override // defpackage.agdw
    public defpackage.ahoj getName() {
        return getStableName();
    }

    @Override // defpackage.agdu
    public defpackage.agej getPackage(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    public defpackage.ahoj getStableName() {
        return stableName;
    }

    @Override // defpackage.agdu
    public java.util.Collection<defpackage.ahof> getSubPackagesOf(defpackage.ahof ahofVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahofVar.getClass();
        affcVar.getClass();
        return defpackage.afce.a;
    }

    @Override // defpackage.agdu
    public boolean shouldSeeInternalsOf(defpackage.agdu agduVar) {
        agduVar.getClass();
        return false;
    }

    @Override // defpackage.agci
    public defpackage.agci getOriginal() {
        return this;
    }
}
