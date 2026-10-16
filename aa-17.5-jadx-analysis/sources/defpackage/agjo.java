package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class agjo implements ahzh {
    public static final agjo INSTANCE = new agjo();

    private agjo() {
    }

    @Override // defpackage.ahzh
    public void reportCannotInferVisibility(agax agaxVar) {
        agaxVar.getClass();
        Objects.toString(agaxVar);
        throw new IllegalStateException("Cannot infer visibility for ".concat(agaxVar.toString()));
    }

    @Override // defpackage.ahzh
    public void reportIncompleteHierarchy(agba agbaVar, List<String> list) {
        agbaVar.getClass();
        list.getClass();
        throw new IllegalStateException("Incomplete hierarchy for class " + agbaVar.getName() + ", unresolved classes " + list);
    }
}
