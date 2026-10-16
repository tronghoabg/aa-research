package defpackage;

import android.os.Looper;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class iza implements izc {
    final /* synthetic */ izb a;
    private final /* synthetic */ int b;

    public iza(izb izbVar, int i) {
        this.b = i;
        this.a = izbVar;
    }

    @Override // defpackage.izc
    public final void a(ByteBuffer byteBuffer) {
        int i = this.b;
        izb izbVar = this.a;
        byte[] bArr = null;
        if (i == 0) {
            izd izdVar = izbVar.b;
            AtomicInteger atomicInteger = izdVar.h;
            atomicInteger.set(3);
            izdVar.c.P(0);
            synchronized (izdVar.l) {
                int i2 = atomicInteger.get();
                if (i2 == 0) {
                    izdVar.d.P(0);
                    return;
                }
                if (i2 == 1) {
                    izdVar.i.set(true);
                } else if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new RuntimeException("Unhandled Channel State");
                    }
                    return;
                }
                izl izlVar = izdVar.g;
                int i3 = izdVar.b;
                xip xipVar = xip.a;
                jcn jcnVar = new jcn(ByteBuffer.allocate(xipVar.e(null) + 2), null, false);
                jcnVar.v((short) 9);
                try {
                    abmy abmyVar = new abmy(jcnVar.l(), jcnVar.b() + 2, xipVar.e(null), null);
                    xipVar.R(abmyVar);
                    abmyVar.I();
                    jcnVar.q(xipVar.e(null) + 2);
                    izlVar.g(i3, jcnVar, false, true, new izn(true, false, 0));
                    izdVar.d.P(0);
                    izdVar.h.set(4);
                    return;
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + xipVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        }
        izd izdVar2 = izbVar.b;
        if (izdVar2.h.get() != 1 && !izdVar2.i.compareAndSet(true, false)) {
            izd.a.h().ai(1668).u("Received unexpected channel control message");
            izl izlVar2 = izdVar2.g;
            int i4 = izdVar2.b;
            jcn jcnVar2 = new jcn(ByteBuffer.allocate(2), null, false);
            jcnVar2.v((short) 255);
            izlVar2.g(i4, jcnVar2, false, false, new izn(false, false, 0));
            return;
        }
        try {
            abnp abnpVarN = xir.a.n();
            xkr xkrVar = xkr.STATUS_UNSOLICITED_MESSAGE;
            abnpVarN.t();
            xir xirVar = (xir) abnpVarN.b;
            xirVar.c = xkrVar.I;
            xirVar.b |= 1;
            abnpVarN.x(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), abnj.a());
            xir xirVar2 = (xir) abnpVarN.q();
            xkr xkrVar2 = xkr.STATUS_SUCCESS;
            xkr xkrVarB = xkr.b(xirVar2.c);
            if (xkrVarB == null) {
                xkrVarB = xkr.STATUS_UNSOLICITED_MESSAGE;
            }
            boolean zEquals = xkrVar2.equals(xkrVarB);
            izb izbVar2 = this.a;
            if (!zEquals) {
                izd izdVar3 = izbVar2.b;
                izdVar3.c.P(1);
                izdVar3.c();
                return;
            }
            izd izdVar4 = izbVar2.b;
            izdVar4.h.set(2);
            izdVar4.d.Q();
            yop yopVarAi = izl.a.f().ai(1672);
            izg izgVar = (izg) izdVar4.c;
            yopVarAi.w("onChannelOpened: %d", izgVar.a);
            new sss(Looper.getMainLooper(), (byte[]) null).post(new imt(izgVar.b.z, 16, bArr));
        } catch (IOException unused) {
            izd.a.h().ai(1667).u("Received invalid protocol buffer");
        }
    }
}
