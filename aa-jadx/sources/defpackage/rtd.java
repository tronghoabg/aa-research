package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rtd implements android.os.IBinder.DeathRecipient {
    final /* synthetic */ defpackage.rte a;
    final defpackage.qxe b;
    private volatile boolean c = true;

    public rtd(defpackage.rte rteVar, defpackage.qxe qxeVar) {
        this.a = rteVar;
        this.b = qxeVar;
    }

    public final void a() {
        if (this.c) {
            this.b.asBinder().unlinkToDeath(this, 0);
            this.c = false;
        }
    }

    public final boolean b(android.os.IBinder iBinder) {
        return this.b.asBinder() == iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
        defpackage.rte.a.l().ai(8258).y("CarGalMonitorService listener died %s", this.b);
        defpackage.rte rteVar = this.a;
        synchronized (rteVar.b) {
            int i = 0;
            int i2 = 0;
            while (true) {
                android.util.SparseArray sparseArray = rteVar.c;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((android.util.ArrayMap) sparseArray.valueAt(i2)).remove(this);
                i2++;
            }
            while (true) {
                android.util.SparseArray sparseArray2 = rteVar.d;
                if (i < sparseArray2.size()) {
                    ((android.util.ArrayMap) sparseArray2.valueAt(i)).remove(this);
                    i++;
                } else {
                    rteVar.e = null;
                }
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.rtd) && this.b.asBinder() == ((defpackage.rtd) obj).b.asBinder();
    }

    public final int hashCode() {
        return this.b.asBinder().hashCode();
    }
}
