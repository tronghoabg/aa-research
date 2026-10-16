package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lva extends defpackage.lxy {
    final /* synthetic */ defpackage.lvb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lva(defpackage.lvb lvbVar) {
        super(null);
        this.a = lvbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lxy
    public final void a() {
        defpackage.ygw ygwVarB = defpackage.mca.a().b();
        int size = ygwVarB.size();
        for (int i = 0; i < size; i++) {
            this.a.e((android.service.notification.StatusBarNotification) ygwVarB.get(i));
        }
    }

    @Override // defpackage.lxy
    public final void b(android.service.notification.StatusBarNotification statusBarNotification) {
        this.a.e(statusBarNotification);
    }
}
