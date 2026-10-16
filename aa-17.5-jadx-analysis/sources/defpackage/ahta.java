package defpackage;

/* loaded from: classes3.dex */
final class ahta implements aijo {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.aijo
    public boolean equals(aiid aiidVar, aiid aiidVar2) {
        if (aiidVar == null) {
            $$$reportNull$$$0(0);
        }
        if (aiidVar2 == null) {
            $$$reportNull$$$0(1);
        }
        return aiidVar.equals(aiidVar2);
    }
}
