package defpackage;

/* loaded from: classes3.dex */
public final class aihg extends aieo implements aily {
    private final aiid constructor;
    private final ahxe memberScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihg(aikg aikgVar, boolean z, aiid aiidVar) {
        super(aikgVar, z);
        aikgVar.getClass();
        aiidVar.getClass();
        this.constructor = aiidVar;
        this.memberScope = aikgVar.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // defpackage.aigl
    public aiid getConstructor() {
        return this.constructor;
    }

    @Override // defpackage.aieo, defpackage.aigl
    public ahxe getMemberScope() {
        return this.memberScope;
    }

    @Override // defpackage.aieo
    public aieo materialize(boolean z) {
        return new aihg(getOriginalTypeVariable(), z, getConstructor());
    }

    @Override // defpackage.aigw
    public String toString() {
        StringBuilder sb = new StringBuilder("Stub (BI): ");
        sb.append(getOriginalTypeVariable());
        sb.append(true != isMarkedNullable() ? "" : "?");
        return sb.toString();
    }
}
