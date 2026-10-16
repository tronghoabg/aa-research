package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class ahyu implements defpackage.ahza {
    private final defpackage.ahza original;
    protected final defpackage.aihl receiverType;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public ahyu(defpackage.aihl aihlVar, defpackage.ahza ahzaVar) {
        if (aihlVar == null) {
            $$$reportNull$$$0(0);
        }
        this.receiverType = aihlVar;
        this.original = ahzaVar == null ? this : ahzaVar;
    }

    @Override // defpackage.ahza
    public defpackage.aihl getType() {
        defpackage.aihl aihlVar = this.receiverType;
        if (aihlVar == null) {
            $$$reportNull$$$0(1);
        }
        return aihlVar;
    }
}
