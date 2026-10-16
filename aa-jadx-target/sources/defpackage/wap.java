package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class wap extends android.database.ContentObserver {
    final /* synthetic */ defpackage.waq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wap(defpackage.waq waqVar) {
        super(null);
        this.a = waqVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        defpackage.waq waqVar = this.a;
        synchronized (waqVar.g) {
            waqVar.h = null;
            defpackage.wbn.e();
        }
        synchronized (waqVar) {
            java.util.Iterator it = waqVar.i.iterator();
            while (it.hasNext()) {
                ((war) it.next()).a();
            }
        }
    }
}
