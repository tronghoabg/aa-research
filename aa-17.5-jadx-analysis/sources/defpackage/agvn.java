package defpackage;

/* loaded from: classes3.dex */
public final class agvn implements agvo {
    public static final agvn INSTANCE = new agvn();

    private agvn() {
    }

    @Override // defpackage.agvo
    public boolean getCorrectNullabilityForNotNullTypeParameter() {
        return false;
    }

    @Override // defpackage.agvo
    public boolean getEnhancePrimitiveArrays() {
        return false;
    }

    @Override // defpackage.agvo
    public boolean getIgnoreNullabilityForErasedValueParameters() {
        return false;
    }

    @Override // defpackage.agvo
    public boolean getTypeEnhancementImprovementsInStrictMode() {
        return false;
    }
}
