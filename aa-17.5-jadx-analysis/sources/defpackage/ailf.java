package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ailf implements agcu {
    private static final List<agcu> allDependencyModules;
    private static final Set<agcu> allExpectedByModules;
    private static final aezr builtIns$delegate;
    private static final List<agcu> expectedByModules;
    public static final ailf INSTANCE = new ailf();
    private static final ahnj stableName = ahnj.special(ailb.ERROR_MODULE.getDebugText());

    static {
        afbe afbeVar = afbe.a;
        allDependencyModules = afbeVar;
        expectedByModules = afbeVar;
        allExpectedByModules = afbg.a;
        builtIns$delegate = woy.dG(aile.INSTANCE);
    }

    private ailf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afxw builtIns_delegate$lambda$0() {
        return afxw.Companion.getInstance();
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        agbkVar.getClass();
        return null;
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return agfk.Companion.getEMPTY();
    }

    @Override // defpackage.agcu
    public afye getBuiltIns() {
        return (afye) builtIns$delegate.a();
    }

    @Override // defpackage.agcu
    public <T> T getCapability(agcs<T> agcsVar) {
        agcsVar.getClass();
        return null;
    }

    @Override // defpackage.agbi
    public agbi getContainingDeclaration() {
        return null;
    }

    @Override // defpackage.agcu
    public List<agcu> getExpectedByModules() {
        return expectedByModules;
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        return getStableName();
    }

    @Override // defpackage.agcu
    public agdj getPackage(ahnf ahnfVar) {
        ahnfVar.getClass();
        throw new IllegalStateException("Should not be called!");
    }

    public ahnj getStableName() {
        return stableName;
    }

    @Override // defpackage.agcu
    public Collection<ahnf> getSubPackagesOf(ahnf ahnfVar, afec<? super ahnj, Boolean> afecVar) {
        ahnfVar.getClass();
        afecVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.agcu
    public boolean shouldSeeInternalsOf(agcu agcuVar) {
        agcuVar.getClass();
        return false;
    }

    @Override // defpackage.agbi
    public agbi getOriginal() {
        return this;
    }
}
