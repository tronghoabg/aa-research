package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qta implements android.os.IBinder.DeathRecipient {
    public final defpackage.qzg a;
    final /* synthetic */ defpackage.qtd c;
    public final android.util.SparseBooleanArray b = new android.util.SparseBooleanArray();
    private volatile boolean d = true;

    public qta(defpackage.qtd qtdVar, defpackage.qzg qzgVar) {
        this.c = qtdVar;
        this.a = qzgVar;
    }

    final void a(com.google.android.gms.car.CarSensorEvent carSensorEvent) {
        try {
            if (this.d) {
                this.a.b(carSensorEvent);
            } else {
                defpackage.qtd.a.l().ai(7829).u("sensor update while client is already released");
            }
        } catch (android.os.RemoteException unused) {
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
        defpackage.qzg qzgVar = this.a;
        qzgVar.asBinder().unlinkToDeath(this, 0);
        defpackage.qtd qtdVar = this.c;
        qtdVar.b.lock();
        try {
            for (int i : d()) {
                qtdVar.fl(i, qzgVar);
            }
            qtdVar.c.remove(this);
        } finally {
            qtdVar.b.unlock();
        }
    }

    final void c(int i) {
        this.b.delete(i);
    }

    final int[] d() {
        android.util.SparseBooleanArray sparseBooleanArray = this.b;
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

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.qta) && this.a.asBinder() == ((defpackage.qta) obj).a.asBinder();
    }

    public final int hashCode() {
        return this.a.asBinder().hashCode();
    }
}
