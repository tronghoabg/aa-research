package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes2.dex */
final class qsg implements IBinder.DeathRecipient {
    public final qyk a;
    final /* synthetic */ qsj c;
    public final SparseBooleanArray b = new SparseBooleanArray();
    private volatile boolean d = true;

    public qsg(qsj qsjVar, qyk qykVar) {
        this.c = qsjVar;
        this.a = qykVar;
    }

    final void a(CarSensorEvent carSensorEvent) {
        try {
            if (this.d) {
                this.a.b(carSensorEvent);
            } else {
                qsj.a.l().ai(7804).u("sensor update while client is already released");
            }
        } catch (RemoteException unused) {
        }
    }

    final void b() {
        if (this.d) {
            this.a.asBinder().unlinkToDeath(this, 0);
            this.b.clear();
            this.d = false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        qyk qykVar = this.a;
        qykVar.asBinder().unlinkToDeath(this, 0);
        qsj qsjVar = this.c;
        qsjVar.b.lock();
        try {
            for (int i : d()) {
                qsjVar.gd(i, qykVar);
            }
            qsjVar.c.remove(this);
        } finally {
            qsjVar.b.unlock();
        }
    }

    final void c(int i) {
        this.b.delete(i);
    }

    final int[] d() {
        SparseBooleanArray sparseBooleanArray = this.b;
        int size = sparseBooleanArray.size();
        int[] iArr = new int[size];
        while (true) {
            size--;
            if (size < 0) {
                return iArr;
            }
            iArr[size] = sparseBooleanArray.keyAt(size);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qsg) && this.a.asBinder() == ((qsg) obj).a.asBinder();
    }

    public final int hashCode() {
        return this.a.asBinder().hashCode();
    }
}
