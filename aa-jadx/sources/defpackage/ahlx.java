package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahlx extends defpackage.ahlz<java.lang.Boolean> {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
    }

    public ahlx(int i) {
        super(i, 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.ahlz
    public java.lang.Boolean get(int i) {
        return java.lang.Boolean.valueOf(((1 << this.offset) & i) != 0);
    }

    @Override // defpackage.ahlz
    public int toFlags(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            return 1 << this.offset;
        }
        return 0;
    }
}
