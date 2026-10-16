package defpackage;

import android.os.IBinder;
import android.util.ArrayMap;
import android.util.SparseArray;

/* loaded from: classes2.dex */
final class rsj implements IBinder.DeathRecipient {
    final /* synthetic */ rsk a;
    final qwi b;
    private volatile boolean c = true;

    public rsj(rsk rskVar, qwi qwiVar) {
        this.a = rskVar;
        this.b = qwiVar;
    }

    public final void a() {
        if (this.c) {
            this.b.asBinder().unlinkToDeath(this, 0);
            this.c = false;
        }
    }

    public final boolean b(IBinder iBinder) {
        return this.b.asBinder() == iBinder;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        a();
        rsk.a.l().ai(8233).y("CarGalMonitorService listener died %s", this.b);
        rsk rskVar = this.a;
        synchronized (rskVar.b) {
            int i = 0;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = rskVar.c;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((ArrayMap) sparseArray.valueAt(i2)).remove(this);
                i2++;
            }
            while (true) {
                SparseArray sparseArray2 = rskVar.d;
                if (i < sparseArray2.size()) {
                    ((ArrayMap) sparseArray2.valueAt(i)).remove(this);
                    i++;
                } else {
                    rskVar.e = null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rsj) && this.b.asBinder() == ((rsj) obj).b.asBinder();
    }

    public final int hashCode() {
        return this.b.asBinder().hashCode();
    }
}
