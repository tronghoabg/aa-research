package defpackage;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.carsetup.setup.UsbConnectionHelper;
import j$.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class sgk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sgk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final void a() {
        Object obj = this.a;
        Object obj2 = this.b;
        synchronized (UsbConnectionHelper.TrackedParcelFileDescriptor.d) {
            if (((AtomicBoolean) obj).compareAndSet(false, true) && UsbConnectionHelper.TrackedParcelFileDescriptor.b.decrementAndGet() == 0) {
                sgm sgmVar = UsbConnectionHelper.TrackedParcelFileDescriptor.e;
                sgmVar.getClass();
                UsbConnectionHelper.TrackedParcelFileDescriptor.e = null;
                UsbConnectionHelper.TrackedParcelFileDescriptor.c.incrementAndGet();
                Handler handler = UsbConnectionHelper.TrackedParcelFileDescriptor.g;
                handler.getClass();
                handler.postDelayed(new jpx(obj2, sgmVar, 12), 10000L);
            }
        }
    }

    public final rjx b() throws RemoteException {
        qup qupVarC = ((rdj) this.a).C();
        Object obj = this.b;
        if (omc.c("CAR.CLIENT", 3)) {
            rrd.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplay for: %s", new zjd(zjc.a, obj));
        }
        rjx rjxVarE = qupVarC.S().e((CarDisplayId) obj);
        rjxVarE.getClass();
        return rjxVarE;
    }

    public final void c(CarDisplay carDisplay) {
        ((ype) nss.a.l().ai((char) 5414)).y("%s changed", carDisplay);
        wer.c();
        Object obj = this.b;
        CarDisplayId carDisplayId = carDisplay.a;
        nso nsoVar = ((nss) obj).b;
        if (Objects.equals(nsoVar.o, carDisplayId)) {
            String str = carDisplay.g;
            UUID uuid = nsoVar.p;
            uuid.getClass();
            if (Objects.equals(str, uuid.toString())) {
                ((ype) nso.a.l().ai(5405)).y("onCarDisplayChanged called with already existing configurationId: %s, ignoring", nsoVar.p);
            } else {
                kgq.d(new mja(nsoVar, (Object) carDisplay, (qrn) this.a, 4), "GH.DisplayLayout", yzz.DISPLAY_LAYOUT, yzy.rJ, "Car not connected during display change", new Object[0]);
            }
        }
    }

    public /* synthetic */ sgk(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }
}
