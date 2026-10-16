package defpackage;

/* loaded from: classes3.dex */
public class ahxu implements ahya {
    private final ahya original;
    protected final aigl receiverType;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
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
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public ahxu(aigl aiglVar, ahya ahyaVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(0);
        }
        this.receiverType = aiglVar;
        this.original = ahyaVar == null ? this : ahyaVar;
    }

    @Override // defpackage.ahya
    public aigl getType() {
        aigl aiglVar = this.receiverType;
        if (aiglVar == null) {
            $$$reportNull$$$0(1);
        }
        return aiglVar;
    }
}
