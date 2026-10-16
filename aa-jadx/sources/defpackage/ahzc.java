package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahzc extends defpackage.ahyu {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i != 2) {
            objArr[0] = com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA;
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahzc(defpackage.aihl aihlVar) {
        this(aihlVar, null);
        if (aihlVar == null) {
            $$$reportNull$$$0(0);
        }
    }

    public java.lang.String toString() {
        defpackage.aihl type = getType();
        java.util.Objects.toString(type);
        return "{Transient} : ".concat(java.lang.String.valueOf(type));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ahzc(defpackage.aihl aihlVar, defpackage.ahza ahzaVar) {
        super(aihlVar, ahzaVar);
        if (aihlVar == null) {
            $$$reportNull$$$0(1);
        }
    }
}
