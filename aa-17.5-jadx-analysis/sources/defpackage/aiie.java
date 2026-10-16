package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class aiie extends aiig {
    final /* synthetic */ boolean $approximateCapturedTypes;
    final /* synthetic */ Map<aiid, aiin> $map;

    /* JADX WARN: Multi-variable type inference failed */
    public aiie(Map<aiid, ? extends aiin> map, boolean z) {
        this.$map = map;
        this.$approximateCapturedTypes = z;
    }

    @Override // defpackage.aiit
    public boolean approximateCapturedTypes() {
        return this.$approximateCapturedTypes;
    }

    @Override // defpackage.aiig
    public aiin get(aiid aiidVar) {
        aiidVar.getClass();
        return this.$map.get(aiidVar);
    }

    @Override // defpackage.aiit
    public boolean isEmpty() {
        return this.$map.isEmpty();
    }
}
