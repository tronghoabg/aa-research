package defpackage;

import android.os.RemoteException;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class jbb extends jbj {
    public static final /* synthetic */ int a = 0;
    private final jba b;

    public jbb(jba jbaVar, jbn jbnVar) {
        super(10, jbaVar, jbnVar, 0);
        this.b = jbaVar;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, qxm] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, qxm] */
    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        if (i != 32769) {
            if (i != 32770) {
                throw new IllegalArgumentException(a.bp(i, "Invalid message type: "));
            }
            List list = ((ikg) this.b).b;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((ikf) it.next()).a.f();
                    } catch (RemoteException unused) {
                        ((ype) ((ype) ikg.a.h()).ai(162)).u("Error calling onStop()");
                    }
                }
            }
            return;
        }
        jba jbaVar = this.b;
        List list2 = ((ikg) jbaVar).b;
        synchronized (list2) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                try {
                    ?? r2 = ((ikf) it2.next()).a;
                    CarInstrumentClusterInfo carInstrumentClusterInfo = ((ikg) jbaVar).c;
                    r2.e(carInstrumentClusterInfo.a, carInstrumentClusterInfo.b, carInstrumentClusterInfo.d, carInstrumentClusterInfo.c, carInstrumentClusterInfo.e);
                } catch (RemoteException unused2) {
                    ((ype) ((ype) ikg.a.h()).ai(161)).u("Error calling onStart()");
                }
            }
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        abnp abnpVarN = xlh.a.n();
        abnpVarN.t();
        xlh xlhVar = (xlh) abnpVarN.b;
        xlhVar.b |= 1;
        xlhVar.c = i;
        abnpVarN.t();
        xlh xlhVar2 = (xlh) abnpVarN.b;
        xlhVar2.b |= 2;
        xlhVar2.d = i2;
        abnpVarN.t();
        xlh xlhVar3 = (xlh) abnpVarN.b;
        xlhVar3.b |= 4;
        xlhVar3.e = i3;
        abnpVarN.t();
        xlh xlhVar4 = (xlh) abnpVarN.b;
        xlhVar4.f = i4 - 1;
        xlhVar4.b |= 8;
        k(32773, (xlh) abnpVarN.q());
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
