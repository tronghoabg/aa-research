package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class aiig extends aiit {
    public static final aiif Companion = new aiif(null);

    public static final aiit create(aiid aiidVar, List<? extends aiin> list) {
        return Companion.create(aiidVar, list);
    }

    public static final aiig createByConstructorsMap(Map<aiid, ? extends aiin> map) {
        return Companion.createByConstructorsMap(map);
    }

    @Override // defpackage.aiit
    public aiin get(aigl aiglVar) {
        aiglVar.getClass();
        return get(aiglVar.getConstructor());
    }

    public abstract aiin get(aiid aiidVar);
}
