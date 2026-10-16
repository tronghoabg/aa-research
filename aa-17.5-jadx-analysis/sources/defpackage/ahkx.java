package defpackage;

/* loaded from: classes3.dex */
public final class ahkx extends ahkz<Boolean> {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
    }

    public ahkx(int i) {
        super(i, 1, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ahkz
    public Boolean get(int i) {
        return Boolean.valueOf(((1 << this.offset) & i) != 0);
    }

    @Override // defpackage.ahkz
    public int toFlags(Boolean bool) {
        if (bool.booleanValue()) {
            return 1 << this.offset;
        }
        return 0;
    }
}
