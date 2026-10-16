package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfk {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.nfk.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/system/data/DoNotDisturbManager;", 0)};
    public static final /* synthetic */ int b = 0;

    public static final boolean b(android.content.Context context) {
        int currentInterruptionFilter = ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getCurrentInterruptionFilter();
        return (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) ? false : true;
    }

    public final defpackage.nfn a() {
        return (defpackage.nfn) defpackage.nfn.b.getValue(this, a[0]);
    }
}
