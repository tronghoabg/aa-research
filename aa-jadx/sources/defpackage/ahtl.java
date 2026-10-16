package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahtl implements defpackage.ahus {
    public static final defpackage.ahtl INSTANCE = new defpackage.ahtl();

    private ahtl() {
    }

    @Override // defpackage.ahus
    public defpackage.agca findEnumEntriesClass(defpackage.agdu agduVar) {
        agduVar.getClass();
        return defpackage.agdh.findClassAcrossModuleDependencies(agduVar, defpackage.ahon.INSTANCE.getEnumEntries());
    }
}
