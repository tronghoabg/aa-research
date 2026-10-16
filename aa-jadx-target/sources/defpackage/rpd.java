package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rpd extends defpackage.qzf {
    private final java.lang.ref.WeakReference a;

    public rpd(defpackage.rpe rpeVar) {
        this.a = new java.lang.ref.WeakReference(rpeVar);
    }

    @Override // defpackage.qzg
    public final void b(com.google.android.gms.car.CarSensorEvent carSensorEvent) {
        defpackage.rpe rpeVar = (defpackage.rpe) this.a.get();
        if (rpeVar != null) {
            android.os.Handler handler = rpeVar.d;
            handler.sendMessage(handler.obtainMessage(0, carSensorEvent));
        }
    }
}
