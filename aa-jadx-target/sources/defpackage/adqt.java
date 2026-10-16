package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adqt extends android.os.Binder {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.adqt.class.getName());
    public adqs a;

    public adqt(adqs adqsVar) {
        this.a = adqsVar;
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        adqs adqsVar = this.a;
        if (adqsVar != null) {
            try {
                if ((i2 & 1) != 0) {
                    return adqsVar.a(i, parcel);
                }
                b.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", defpackage.a.bo(i2, "ignoring non-oneway transaction. flags="));
                return false;
            } catch (java.lang.RuntimeException e) {
                b.logp(java.util.logging.Level.WARNING, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", defpackage.a.bo(i, "failure sending transaction "), (java.lang.Throwable) e);
            }
        }
        return false;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final boolean pingBinder() {
        return this.a != null;
    }
}
