package defpackage;

/* loaded from: classes.dex */
final /* synthetic */ class dcq implements afev {
    final /* synthetic */ bvb a;

    public dcq(bvb bvbVar) {
        this.a = bvbVar;
    }

    @Override // defpackage.afev
    public final aezn eV() {
        return new afey(1, this.a, bvb.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof dcq) && (obj instanceof afev)) {
            return affa.f(eV(), ((afev) obj).eV());
        }
        return false;
    }

    public final int hashCode() {
        return eV().hashCode();
    }
}
