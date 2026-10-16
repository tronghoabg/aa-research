package defpackage;

import android.os.IBinder;
import android.util.ArrayMap;
import android.util.SparseArray;

/* loaded from: classes2.dex */
final class iyo implements IBinder.DeathRecipient {
    final /* synthetic */ iyp a;
    final qwi b;
    private volatile boolean c = true;

    public iyo(iyp iypVar, qwi qwiVar) {
        this.a = iypVar;
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
        iyp.a.l().ai(1648).y("CarGalMonitorService listener died %s", this.b);
        iyp iypVar = this.a;
        synchronized (iypVar.b) {
            int i = 0;
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = iypVar.c;
                if (i2 >= sparseArray.size()) {
                    break;
                }
                ((ArrayMap) sparseArray.valueAt(i2)).remove(this);
                i2++;
            }
            while (true) {
                SparseArray sparseArray2 = iypVar.d;
                if (i < sparseArray2.size()) {
                    ((ArrayMap) sparseArray2.valueAt(i)).remove(this);
                    i++;
                } else {
                    iypVar.e = null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof iyo) && this.b.asBinder() == ((iyo) obj).b.asBinder();
    }

    public final int hashCode() {
        return this.b.asBinder().hashCode();
    }
}
