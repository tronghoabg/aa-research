package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eta extends android.database.ContentObserver {
    final /* synthetic */ defpackage.etb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eta(defpackage.etb etbVar) {
        super(new android.os.Handler());
        this.a = etbVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.o();
    }
}
