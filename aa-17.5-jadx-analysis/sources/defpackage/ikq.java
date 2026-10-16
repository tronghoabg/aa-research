package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class ikq implements IBinder.DeathRecipient {
    public final qyk a;
    final /* synthetic */ ikt d;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    private volatile boolean e = true;

    public ikq(ikt iktVar, qyk qykVar) {
        this.d = iktVar;
        this.a = qykVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void a(CarSensorEvent carSensorEvent) {
        inb inbVar;
        try {
            if (!this.e) {
                ((ype) ikt.a.l().ai(197)).u("sensor update while client is already released");
            }
            int i = carSensorEvent.b;
            ynp ynpVarListIterator = jep.b(i).listIterator(0);
            while (ynpVarListIterator.hasNext()) {
                xny xnyVar = (xny) ynpVarListIterator.next();
                ikt iktVar = this.d;
                if (iktVar.d && iktVar.c.contains(xnyVar.name()) && (inbVar = (inb) this.c.get(Integer.valueOf(i))) != null) {
                    double d = inbVar.a;
                    if (Math.abs(d + 0.0d) >= 1.0E-6d) {
                        Instant instantNow = Instant.now();
                        double millis = Duration.between(inbVar.d, instantNow).toMillis() * d;
                        if (millis > 0.0d) {
                            inbVar.c = Math.min(inbVar.b, inbVar.c + millis);
                            inbVar.d = instantNow;
                        }
                        double d2 = inbVar.c;
                        if (d2 < 1.0d) {
                            return;
                        } else {
                            inbVar.c = d2 - 1.0d;
                        }
                    }
                }
            }
            this.a.b(carSensorEvent);
        } catch (RemoteException unused) {
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
        qyk qykVar = this.a;
        qykVar.asBinder().unlinkToDeath(this, 0);
        ikt iktVar = this.d;
        iktVar.e.lock();
        try {
            for (int i : d()) {
                iktVar.gd(i, qykVar);
            }
            iktVar.f.remove(this);
        } finally {
            iktVar.e.unlock();
        }
    }

    final void c(int i) {
        Map map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        map.remove(numValueOf);
        this.c.remove(numValueOf);
    }

    final int[] d() {
        return Collection.EL.stream(this.b.keySet()).mapToInt(new mim(1)).toArray();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ikq) && this.a.asBinder() == ((ikq) obj).a.asBinder();
    }

    public final int hashCode() {
        return this.a.asBinder().hashCode();
    }
}
