package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahvj extends ahuc {
    private final aigl type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvj(List<? extends ahuh<?>> list, aigl aiglVar) {
        super(list, new ahvi(aiglVar));
        list.getClass();
        aiglVar.getClass();
        this.type = aiglVar;
    }

    private static final aigl _init_$lambda$0(aigl aiglVar, agcu agcuVar) {
        agcuVar.getClass();
        return aiglVar;
    }

    static /* synthetic */ aigl accessor$TypedArrayValue$lambda0(aigl aiglVar, agcu agcuVar) {
        _init_$lambda$0(aiglVar, agcuVar);
        return aiglVar;
    }

    public final aigl getType() {
        return this.type;
    }
}
