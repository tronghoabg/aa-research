package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class agjh implements agsm {
    private final ClassLoader classLoader;

    public agjh(ClassLoader classLoader) {
        classLoader.getClass();
        this.classLoader = classLoader;
    }

    @Override // defpackage.agsm
    public agzj findClass(agsl agslVar) {
        agslVar.getClass();
        ahnd classId = agslVar.getClassId();
        ahnf packageFqName = classId.getPackageFqName();
        String strI = afyh.I(classId.getRelativeClassName().asString(), '.', '$');
        if (!packageFqName.isRoot()) {
            strI = packageFqName.asString() + '.' + strI;
        }
        Class<?> clsTryLoadClass = agji.tryLoadClass(this.classLoader, strI);
        if (clsTryLoadClass != null) {
            return new agkt(clsTryLoadClass);
        }
        return null;
    }

    @Override // defpackage.agsm
    public agzu findPackage(ahnf ahnfVar, boolean z) {
        ahnfVar.getClass();
        return new agle(ahnfVar);
    }

    @Override // defpackage.agsm
    public Set<String> knownClassNamesInPackage(ahnf ahnfVar) {
        ahnfVar.getClass();
        return null;
    }
}
