package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class iyv implements android.os.IBinder.DeathRecipient {
    final /* synthetic */ defpackage.iyw a;
    final defpackage.qxe b;
    private volatile boolean c = true;

    public iyv(defpackage.iyw iywVar, defpackage.qxe qxeVar) {
        this.a = iywVar;
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
        defpackage.iyw.a.l().ai(1648).y("CarGalMonitorService listener died %s", this.b);
        defpackage.iyw iywVar = this.a;
        synchronized (iywVar.b) {
            int i = 0;
            int i2 = 0;
            while (true) {
                android.util.SparseArray sparseArray = iywVar.c;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((android.util.ArrayMap) sparseArray.valueAt(i2)).remove(this);
                i2++;
            }
            while (true) {
                android.util.SparseArray sparseArray2 = iywVar.d;
                if (i < sparseArray2.size()) {
                    ((android.util.ArrayMap) sparseArray2.valueAt(i)).remove(this);
                    i++;
                } else {
                    iywVar.e = null;
                }
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.iyv) && this.b.asBinder() == ((defpackage.iyv) obj).b.asBinder();
    }

    public final int hashCode() {
        return this.b.asBinder().hashCode();
    }
}
