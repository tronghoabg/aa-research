package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertySetError;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class iyn extends jbj {
    public static final ypf a = ols.R("CAR.GAL.CAR_CONTROL");
    private final iym b;

    public iyn(iym iymVar, jbn jbnVar) {
        super(19, iymVar, jbnVar, 0);
        this.b = iymVar;
    }

    @Override // defpackage.jbj
    protected final void a(int i, ByteBuffer byteBuffer) throws abon {
        int iF = wox.F(i);
        if (iF == 0) {
            a.g().ai(1644).w("Received message type that did not match existing CarControlMessageId: %d", i);
            return;
        }
        ypf ypfVar = a;
        ypfVar.f().ai(1642).y("Received %s", wox.E(iF));
        switch (iF) {
            case 32770:
                xoe xoeVar = (xoe) abnv.A(xoe.a, byteBuffer, abnj.a());
                iym iymVar = this.b;
                if ((xoeVar.b & 4) == 0) {
                    ((ype) ((ype) ijv.a.h()).ai((char) 128)).u("No request ID specified, skipping");
                    return;
                }
                UUID uuidFromString = UUID.fromString(xoeVar.e);
                ijv ijvVar = (ijv) iymVar;
                Map map = ijvVar.c;
                if (!map.containsKey(uuidFromString)) {
                    ((ype) ((ype) ijv.a.h()).ai((char) 127)).u("Could not find matching request, not calling any callback.");
                    return;
                }
                xgi xgiVar = xoeVar.c;
                if (xgiVar == null) {
                    xgiVar = xgi.a;
                }
                CarProperty carPropertyZ = ijv.z(xgiVar);
                try {
                    ris risVar = (ris) map.get(uuidFromString);
                    xkr xkrVarB = xkr.b(xoeVar.d);
                    if (xkrVarB == null) {
                        xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
                    }
                    if (xkrVarB == xkr.STATUS_SUCCESS) {
                        risVar.f(carPropertyZ);
                    } else {
                        risVar.e(carPropertyZ, new CarPropertySetError(xoeVar.f));
                    }
                    return;
                } catch (RemoteException unused) {
                    return;
                } finally {
                    ijvVar.c.remove(uuidFromString);
                }
            case 32771:
            case 32774:
            default:
                ypfVar.g().ai(1643).y("Received unexpected car control message %s", wox.E(iF));
                return;
            case 32772:
                this.b.s(((xnn) abnv.A(xnn.a, byteBuffer, abnj.a())).b);
                return;
            case 32773:
                this.b.p((xin) abnv.A(xin.a, byteBuffer, abnj.a()));
                return;
            case 32775:
                xie xieVar = (xie) abnv.A(xie.a, byteBuffer, abnj.a());
                iym iymVar2 = this.b;
                xid xidVar = xieVar.b;
                if (xidVar == null) {
                    xidVar = xid.a;
                }
                iymVar2.o(xidVar);
                return;
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
