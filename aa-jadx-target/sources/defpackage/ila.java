package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ila implements android.os.IBinder.DeathRecipient {
    public final defpackage.qzg a;
    final /* synthetic */ defpackage.ild d;
    public final java.util.Map b = new java.util.HashMap();
    public final java.util.Map c = new java.util.HashMap();
    private volatile boolean e = true;

    public ila(defpackage.ild ildVar, defpackage.qzg qzgVar) {
        this.d = ildVar;
        this.a = qzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void a(com.google.android.gms.car.CarSensorEvent carSensorEvent) {
        defpackage.ini iniVar;
        try {
            if (!this.e) {
                ((defpackage.yqj) defpackage.ild.a.l().ai(197)).u("sensor update while client is already released");
            }
            int i = carSensorEvent.b;
            defpackage.you youVarListIterator = defpackage.jex.b(i).listIterator(0);
            while (youVarListIterator.hasNext()) {
                defpackage.xoz xozVar = (defpackage.xoz) youVarListIterator.next();
                defpackage.ild ildVar = this.d;
                if (ildVar.d && ildVar.c.contains(xozVar.name()) && (iniVar = (defpackage.ini) this.c.get(java.lang.Integer.valueOf(i))) != null) {
                    double d = iniVar.a;
                    if (java.lang.Math.abs(d + 0.0d) >= 1.0E-6d) {
                        j$.time.Instant instantNow = j$.time.Instant.now();
                        double millis = j$.time.Duration.between(iniVar.d, instantNow).toMillis() * d;
                        if (millis > 0.0d) {
                            iniVar.c = java.lang.Math.min(iniVar.b, iniVar.c + millis);
                            iniVar.d = instantNow;
                        }
                        double d2 = iniVar.c;
                        if (d2 < 1.0d) {
                            return;
                        } else {
                            iniVar.c = d2 - 1.0d;
                        }
                    }
                }
            }
            this.a.b(carSensorEvent);
        } catch (android.os.RemoteException unused) {
        }
    }

    final void b() {
        if (this.e) {
            this.a.asBinder().unlinkToDeath(this, 0);
            this.b.clear();
            this.c.clear();
            this.e = false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        defpackage.qzg qzgVar = this.a;
        qzgVar.asBinder().unlinkToDeath(this, 0);
        defpackage.ild ildVar = this.d;
        ildVar.e.lock();
        try {
            for (int i : d()) {
                ildVar.fl(i, qzgVar);
            }
            ildVar.f.remove(this);
        } finally {
            ildVar.e.unlock();
        }
    }

    final void c(int i) {
        java.util.Map map = this.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        map.remove(numValueOf);
        this.c.remove(numValueOf);
    }

    final int[] d() {
        return j$.util.Collection.-EL.stream(this.b.keySet()).mapToInt(new mir(1)).toArray();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.ila) && this.a.asBinder() == ((defpackage.ila) obj).a.asBinder();
    }

    public final int hashCode() {
        return this.a.asBinder().hashCode();
    }
}
