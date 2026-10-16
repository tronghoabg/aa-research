package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aihv extends defpackage.aigr {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihv(defpackage.aihw aihwVar) {
        super(aihwVar);
        aihwVar.getClass();
    }

    @Override // defpackage.aigq, defpackage.aihl
    public boolean isMarkedNullable() {
        return true;
    }

    @Override // defpackage.aigq
    public defpackage.aihv replaceDelegate(defpackage.aihw aihwVar) {
        aihwVar.getClass();
        return new defpackage.aihv(aihwVar);
    }
}
