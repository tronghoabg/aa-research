package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ainz {
    public final defpackage.aiok check(defpackage.agdj agdjVar) {
        agdjVar.getClass();
        for (defpackage.aioo aiooVar : getChecks$org_jetbrains_kotlin_descriptors()) {
            if (aiooVar.isApplicable(agdjVar)) {
                return aiooVar.checkAll(agdjVar);
            }
        }
        return defpackage.aioh.INSTANCE;
    }

    public abstract java.util.List<defpackage.aioo> getChecks$org_jetbrains_kotlin_descriptors();
}
