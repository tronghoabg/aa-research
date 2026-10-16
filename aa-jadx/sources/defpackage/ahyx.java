package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahyx extends defpackage.ahyu implements defpackage.ahza {
    private final defpackage.agbv descriptor;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i == 2) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyx(defpackage.agbv agbvVar, defpackage.aihl aihlVar, defpackage.ahza ahzaVar) {
        super(aihlVar, ahzaVar);
        if (agbvVar == null) {
            $$$reportNull$$$0(0);
        }
        if (aihlVar == null) {
            $$$reportNull$$$0(1);
        }
        this.descriptor = agbvVar;
    }

    public java.lang.String toString() {
        return getType() + ": Ext {" + this.descriptor + "}";
    }
}
