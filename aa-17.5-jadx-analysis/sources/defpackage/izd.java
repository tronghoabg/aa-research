package defpackage;

import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class izd implements izo {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public final int b;
    public final iyz c;
    public final iyx d;
    public final int e;
    public final jeb f;
    public final izl g;
    public final Handler m;
    public final AtomicInteger h = new AtomicInteger(4);
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicLong k = new AtomicLong(0);
    public final Object l = new Object();
    public final izb j = new izb(this);

    public izd(int i, int i2, jeb jebVar, izl izlVar, iyz iyzVar, iyx iyxVar, Handler handler) {
        this.b = i;
        this.e = i2;
        this.f = jebVar;
        this.d = iyxVar;
        this.g = izlVar;
        this.c = iyzVar;
        this.m = handler;
    }

    @Override // defpackage.izo
    public final int a() {
        throw null;
    }

    public final void b() {
        if (this.h.compareAndSet(0, 1)) {
            izl izlVar = this.g;
            int i = this.b;
            int i2 = this.e;
            abnp abnpVarN = xiq.a.n();
            int I = dlz.I(Integer.valueOf(i2));
            abnpVarN.t();
            xiq xiqVar = (xiq) abnpVarN.b;
            xiqVar.b |= 1;
            xiqVar.c = I;
            int I2 = dlz.I(Integer.valueOf(i));
            abnpVarN.t();
            xiq xiqVar2 = (xiq) abnpVarN.b;
            xiqVar2.b |= 2;
            xiqVar2.d = I2;
            xiq xiqVar3 = (xiq) abnpVarN.q();
            jcn jcnVar = new jcn(ByteBuffer.allocate(xiqVar3.e(null) + 2), null, false);
            jcnVar.v((short) 7);
            jcnVar.s(xiqVar3.h());
            izlVar.g(i, jcnVar, false, true, new izn(true, false, 0));
        }
    }

    public final void c() {
        a.l().ai(1669).w("Force closing channel %d", this.b);
        if (this.h.getAndSet(4) == 2) {
            this.d.P(1);
        }
    }

    @Override // defpackage.izo
    public final void d(jcn jcnVar, izn iznVar) {
        if (this.h.get() != 2) {
            throw new IllegalStateException("Channel must be open before sending a message.");
        }
        izl izlVar = this.g;
        int i = this.b;
        if (izlVar.f.get()) {
            jcnVar.close();
        } else {
            izlVar.g(i, jcnVar, true, false, iznVar);
        }
    }
}
