package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aihu extends defpackage.aigr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihu(defpackage.aihw aihwVar) {
        super(aihwVar);
        aihwVar.getClass();
    }

    @Override // defpackage.aigq, defpackage.aihl
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // defpackage.aigq
    public defpackage.aihu replaceDelegate(defpackage.aihw aihwVar) {
        aihwVar.getClass();
        return new defpackage.aihu(aihwVar);
    }
}
