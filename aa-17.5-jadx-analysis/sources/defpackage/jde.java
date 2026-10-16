package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class jde implements jcz {
    public static final ypf a = ols.R("CAR.XFER");
    static final jcw b = new jdb();
    public final jbn c;
    public final jcx d;
    public final Executor e;
    public final Executor f;
    public final Map g;
    public final Object h = new Object();
    public int i;
    public final int j;
    private final Executor k;
    private jdc l;
    private jdd m;

    public jde(int i, jbn jbnVar, jcx jcxVar, Map map) {
        this.j = i;
        this.c = jbnVar;
        this.d = jcxVar;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f = executorServiceNewSingleThreadExecutor;
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        this.k = executorServiceNewSingleThreadExecutor2;
        this.g = map;
        if (jcxVar == null) {
            this.e = null;
            return;
        }
        ExecutorService executorServiceNewSingleThreadExecutor3 = Executors.newSingleThreadExecutor();
        this.e = executorServiceNewSingleThreadExecutor3;
        boolean z = false;
        if (executorServiceNewSingleThreadExecutor3 != executorServiceNewSingleThreadExecutor && executorServiceNewSingleThreadExecutor3 != executorServiceNewSingleThreadExecutor2) {
            z = true;
        }
        woy.aa(z, "byteCounterExecutor must not be same executor as read/write executors");
    }

    @Override // defpackage.jcz
    public final void a(int i, jcw jcwVar) {
        synchronized (this.h) {
            if (this.j == 0) {
                throw null;
            }
            this.g.put(Integer.valueOf(i), jcwVar);
        }
    }

    @Override // defpackage.jcz
    public final void b(int i) {
        synchronized (this.h) {
            if (this.j == 0) {
                throw null;
            }
            Integer numValueOf = Integer.valueOf(i);
            Map map = this.g;
            map.remove(numValueOf);
            map.put(numValueOf, b);
        }
    }

    @Override // defpackage.jcz
    public final void c(ParcelFileDescriptor parcelFileDescriptor) {
        byte[] bArr = null;
        if (this.j == 0) {
            throw null;
        }
        synchronized (this.h) {
            jdc jdcVar = this.l;
            if (jdcVar != null) {
                jdcVar.c();
            }
            jdd jddVar = this.m;
            if (jddVar != null) {
                jddVar.a();
            }
            this.l = new jdc(this, parcelFileDescriptor);
            this.m = new jdd(this, parcelFileDescriptor);
            jdc jdcVar2 = this.l;
            yop yopVarAi = a.f().ai(1892);
            Object obj = jdcVar2.a;
            int i = ((jde) obj).j;
            String strL = dlz.L(i);
            if (i == 0) {
                throw null;
            }
            yopVarAi.y("%s Start executor and read messages", strL);
            ((jde) obj).f.execute(new imt(jdcVar2, 18, bArr));
        }
        jcx jcxVar = this.d;
        if (jcxVar != null) {
            Executor executor = this.e;
            executor.getClass();
            executor.execute(new imt(jcxVar, 17, bArr));
        }
    }

    @Override // defpackage.jcz
    public final void d() {
        if (this.j == 0) {
            throw null;
        }
        synchronized (this.h) {
            jdc jdcVar = this.l;
            jdd jddVar = this.m;
            this.l = null;
            this.m = null;
            this.i = 0;
            if (jdcVar != null) {
                this.f.execute(new ire(jdcVar, 12));
            }
            if (jddVar != null) {
                this.k.execute(new ire(jddVar, 13));
            }
        }
        jcx jcxVar = this.d;
        if (jcxVar != null) {
            Executor executor = this.e;
            executor.getClass();
            executor.execute(new ire(jcxVar, 14));
        }
    }

    @Override // defpackage.jcz
    public final boolean e(int i, izn iznVar, int i2, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        abnp abnpVarN = qtk.a.n();
        abnpVarN.t();
        qtk qtkVar = (qtk) abnpVarN.b;
        qtkVar.b |= 8;
        qtkVar.f = i;
        abnpVarN.t();
        qtk qtkVar2 = (qtk) abnpVarN.b;
        qtkVar2.b |= 4;
        qtkVar2.e = iznVar.a;
        abnpVarN.t();
        qtk qtkVar3 = (qtk) abnpVarN.b;
        qtkVar3.b |= 32;
        qtkVar3.h = iznVar.b;
        int iRemaining = byteBufferDuplicate.remaining();
        abnpVarN.t();
        qtk qtkVar4 = (qtk) abnpVarN.b;
        qtkVar4.b |= 1;
        qtkVar4.c = iRemaining;
        abnpVarN.t();
        qtk qtkVar5 = (qtk) abnpVarN.b;
        qtkVar5.b |= 2;
        qtkVar5.d = i2;
        abnpVarN.t();
        qtk qtkVar6 = (qtk) abnpVarN.b;
        qtkVar6.b |= 64;
        qtkVar6.i = iznVar.c;
        qtk qtkVar7 = (qtk) abnpVarN.q();
        synchronized (this.h) {
            jdd jddVar = this.m;
            if (jddVar == null) {
                return false;
            }
            int i3 = this.i;
            if (i3 >= 1024) {
                throw new jcy();
            }
            this.i = i3 + 1;
            this.k.execute(new xx(this, jddVar, qtkVar7, byteBufferDuplicate, 10));
            return true;
        }
    }

    @Override // defpackage.jcz
    public final boolean f(int i, int i2) {
        abnp abnpVarN = qtk.a.n();
        abnpVarN.t();
        qtk qtkVar = (qtk) abnpVarN.b;
        qtkVar.b |= 8;
        qtkVar.f = i;
        abnp abnpVarN2 = qtj.a.n();
        abnpVarN2.t();
        qtj qtjVar = (qtj) abnpVarN2.b;
        qtjVar.c = 2;
        int i3 = 1;
        qtjVar.b |= 1;
        abnpVarN2.t();
        qtj qtjVar2 = (qtj) abnpVarN2.b;
        qtjVar2.b = 2 | qtjVar2.b;
        qtjVar2.d = i2;
        abnpVarN.t();
        qtk qtkVar2 = (qtk) abnpVarN.b;
        qtj qtjVar3 = (qtj) abnpVarN2.q();
        qtjVar3.getClass();
        qtkVar2.g = qtjVar3;
        qtkVar2.b |= 16;
        qtk qtkVar3 = (qtk) abnpVarN.q();
        synchronized (this.h) {
            jdd jddVar = this.m;
            if (jddVar != null) {
                int i4 = this.i;
                if (i4 >= 1024) {
                    throw new jcy();
                }
                this.i = i4 + 1;
                this.k.execute(new jda(this, jddVar, qtkVar3, i3));
                return true;
            }
            yop yopVarAi = a.g().ai(1898);
            int i5 = this.j;
            String strL = dlz.L(i5);
            if (i5 == 0) {
                throw null;
            }
            yopVarAi.K("%s Send channel closed control message: failed writer null %d", strL, i);
            return false;
        }
    }

    @Override // defpackage.jcz
    public final boolean g(int i) {
        abnp abnpVarN = qtk.a.n();
        abnpVarN.t();
        qtk qtkVar = (qtk) abnpVarN.b;
        qtkVar.b |= 8;
        qtkVar.f = i;
        abnp abnpVarN2 = qtj.a.n();
        abnpVarN2.t();
        qtj qtjVar = (qtj) abnpVarN2.b;
        qtjVar.c = 1;
        qtjVar.b |= 1;
        abnpVarN.t();
        qtk qtkVar2 = (qtk) abnpVarN.b;
        qtj qtjVar2 = (qtj) abnpVarN2.q();
        qtjVar2.getClass();
        qtkVar2.g = qtjVar2;
        qtkVar2.b |= 16;
        qtk qtkVar3 = (qtk) abnpVarN.q();
        synchronized (this.h) {
            jdd jddVar = this.m;
            if (jddVar != null) {
                int i2 = this.i;
                if (i2 >= 1024) {
                    throw new jcy();
                }
                this.i = i2 + 1;
                this.k.execute(new imp(this, jddVar, qtkVar3, 4, (short[]) null));
                return true;
            }
            if (i != 0) {
                yop yopVarAi = a.g().ai(1899);
                int i3 = this.j;
                String strL = dlz.L(i3);
                if (i3 == 0) {
                    throw null;
                }
                yopVarAi.K("%s Send channel opened control message: failed writer null %d", strL, i);
            }
            return false;
        }
    }

    @Override // defpackage.jcz
    public final boolean h(int i, int i2) {
        abnp abnpVarN = qtk.a.n();
        abnpVarN.t();
        qtk qtkVar = (qtk) abnpVarN.b;
        qtkVar.b |= 8;
        qtkVar.f = i;
        abnp abnpVarN2 = qtj.a.n();
        abnpVarN2.t();
        qtj qtjVar = (qtj) abnpVarN2.b;
        qtjVar.c = 3;
        qtjVar.b |= 1;
        abnpVarN2.t();
        qtj qtjVar2 = (qtj) abnpVarN2.b;
        qtjVar2.b |= 4;
        qtjVar2.e = i2;
        abnpVarN.t();
        qtk qtkVar2 = (qtk) abnpVarN.b;
        qtj qtjVar3 = (qtj) abnpVarN2.q();
        qtjVar3.getClass();
        qtkVar2.g = qtjVar3;
        qtkVar2.b |= 16;
        qtk qtkVar3 = (qtk) abnpVarN.q();
        synchronized (this.h) {
            jdd jddVar = this.m;
            int i3 = 0;
            if (jddVar != null) {
                int i4 = this.i;
                if (i4 >= 1024) {
                    throw new jcy();
                }
                this.i = i4 + 1;
                this.k.execute(new jda(this, jddVar, qtkVar3, i3));
                return true;
            }
            yop yopVarAi = a.g().ai(1900);
            int i5 = this.j;
            String strL = dlz.L(i5);
            if (i5 == 0) {
                throw null;
            }
            yopVarAi.K("%s Send message sent control message: failed writer null %d", strL, i);
            return false;
        }
    }
}
