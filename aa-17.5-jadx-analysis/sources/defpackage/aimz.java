package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class aimz {
    public final aink check(agcj agcjVar) {
        agcjVar.getClass();
        for (aino ainoVar : getChecks$org_jetbrains_kotlin_descriptors()) {
            if (ainoVar.isApplicable(agcjVar)) {
                return ainoVar.checkAll(agcjVar);
            }
        }
        return ainh.INSTANCE;
    }

    public abstract List<aino> getChecks$org_jetbrains_kotlin_descriptors();
}
