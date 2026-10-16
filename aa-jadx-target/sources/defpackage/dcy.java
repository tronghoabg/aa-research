package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final /* synthetic */ class dcy implements defpackage.affv {
    final /* synthetic */ defpackage.bvi a;

    public dcy(defpackage.bvi bviVar) {
        this.a = bviVar;
    }

    @Override // defpackage.affv
    public final defpackage.afan ed() {
        return new defpackage.affy(1, this.a, defpackage.bvi.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof defpackage.dcy) && (obj instanceof defpackage.affv)) {
            return defpackage.afga.f(ed(), ((defpackage.affv) obj).ed());
        }
        return false;
    }

    public final int hashCode() {
        return ed().hashCode();
    }
}
