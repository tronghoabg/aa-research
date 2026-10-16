package defpackage;

/* loaded from: classes3.dex */
public final class ahyz implements ahyn {
    private final agdd packageFragmentProvider;

    public ahyz(agdd agddVar) {
        agddVar.getClass();
        this.packageFragmentProvider = agddVar;
    }

    @Override // defpackage.ahyn
    public ahym findClassData(ahnd ahndVar) {
        ahym ahymVarFindClassData;
        ahndVar.getClass();
        for (agdc agdcVar : agdh.packageFragments(this.packageFragmentProvider, ahndVar.getPackageFqName())) {
            if ((agdcVar instanceof ahza) && (ahymVarFindClassData = ((ahza) agdcVar).getClassDataFinder().findClassData(ahndVar)) != null) {
                return ahymVarFindClassData;
            }
        }
        return null;
    }
}
