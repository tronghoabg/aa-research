package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwn implements defpackage.agwo {
    public static final defpackage.agwn INSTANCE = new defpackage.agwn();

    private agwn() {
    }

    @Override // defpackage.agwo
    public boolean getCorrectNullabilityForNotNullTypeParameter() {
        return false;
    }

    @Override // defpackage.agwo
    public boolean getEnhancePrimitiveArrays() {
        return false;
    }

    @Override // defpackage.agwo
    public boolean getIgnoreNullabilityForErasedValueParameters() {
        return false;
    }

    @Override // defpackage.agwo
    public boolean getTypeEnhancementImprovementsInStrictMode() {
        return false;
    }
}
