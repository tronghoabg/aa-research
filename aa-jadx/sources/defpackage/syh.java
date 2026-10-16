package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class syh extends android.database.ContentObserver {
    final /* synthetic */ defpackage.syj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syh(defpackage.syj syjVar) {
        super(null);
        this.a = syjVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.f = (byte) 1;
    }
}
