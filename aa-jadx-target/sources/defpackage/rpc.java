package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rpc extends defpackage.stq {
    final /* synthetic */ defpackage.rpe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpc(defpackage.rpe rpeVar, android.os.Looper looper) {
        super(looper);
        this.a = rpeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        if (message.what == 0) {
            android.util.SparseArray sparseArray = this.a.c;
            synchronized (sparseArray) {
                com.google.android.gms.car.CarSensorEvent carSensorEvent = (com.google.android.gms.car.CarSensorEvent) message.obj;
                int i = carSensorEvent.b;
                defpackage.skb skbVar = (defpackage.skb) sparseArray.get(i);
                if (skbVar != null) {
                    java.util.Iterator it = ((java.util.LinkedList) skbVar.b).iterator();
                    while (it.hasNext()) {
                        ((defpackage.qsy) it.next()).d(i, carSensorEvent.c, carSensorEvent.d, carSensorEvent.e);
                    }
                }
            }
        }
    }
}
