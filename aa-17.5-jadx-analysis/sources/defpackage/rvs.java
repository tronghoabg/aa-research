package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rvs implements rvo {
    public static final ypf a = ols.R("CAR.XFER");
    static final rvm b = new rvp();
    public final rut c;
    public final Executor d;
    public final Map e;
    public final Object f = new Object();
    public int g;
    public final int h;
    private final Executor i;
    private rvq j;
    private rvr k;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public rvs(int i, rut rutVar, xyc xycVar, Map map) {
        this.h = i;
        this.c = rutVar;
        this.d = xycVar.gu();
        this.i = xycVar.gu();
        this.e = map;
    }

    @Override // defpackage.rvo
    public final void a(int i, rvm rvmVar) {
        synchronized (this.f) {
            if (this.h == 0) {
                throw null;
            }
            this.e.put(Integer.valueOf(i), rvmVar);
        }
    }

    @Override // defpackage.rvo
    public final void b(int i) {
        synchronized (this.f) {
            if (this.h == 0) {
                throw null;
            }
            Integer numValueOf = Integer.valueOf(i);
            Map map = this.e;
            map.remove(numValueOf);
            map.put(numValueOf, b);
        }
    }

    @Override // defpackage.rvo
    public final void c(ParcelFileDescriptor parcelFileDescriptor) {
        if (this.h == 0) {
            throw null;
        }
        synchronized (this.f) {
            rvq rvqVar = this.j;
            if (rvqVar != null) {
                rvqVar.c();
            }
            rvr rvrVar = this.k;
            if (rvrVar != null) {
                rvrVar.a();
            }
            this.j = new rvq(this, parcelFileDescriptor);
            this.k = new rvr(this, parcelFileDescriptor);
            rvq rvqVar2 = this.j;
            yop yopVarAi = a.f().ai(8414);
            rvs rvsVar = rvqVar2.a;
            int i = rvsVar.h;
            String strG = ols.G(i);
            if (i == 0) {
                throw null;
            }
            yopVarAi.y("%s Start executor and read messages", strG);
            rvsVar.d.execute(new rsv(rvqVar2, 2));
        }
    }

    @Override // defpackage.rvo
    public final void d() {
        if (this.h == 0) {
            throw null;
        }
        synchronized (this.f) {
            rvq rvqVar = this.j;
            rvr rvrVar = this.k;
            this.j = null;
            this.k = null;
            this.g = 0;
            if (rvqVar != null) {
                this.d.execute(new rnq(rvqVar, 9));
            }
            if (rvrVar != null) {
                this.i.execute(new rnq(rvrVar, 10));
            }
        }
    }

    @Override // defpackage.rvo
    @ResultIgnorabilityUnspecified
    public final boolean e(int i, rtb rtbVar, int i2, ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        abnp abnpVarN = qtk.a.n();
        abnpVarN.t();
        qtk qtkVar = (qtk) abnpVarN.b;
        qtkVar.b |= 8;
        qtkVar.f = i;
        abnpVarN.t();
        qtk qtkVar2 = (qtk) abnpVarN.b;
        qtkVar2.b |= 4;
        qtkVar2.e = rtbVar.a;
        abnpVarN.t();
        qtk qtkVar3 = (qtk) abnpVarN.b;
        qtkVar3.b |= 32;
        qtkVar3.h = rtbVar.b;
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
        qtkVar6.i = rtbVar.c;
        qtk qtkVar7 = (qtk) abnpVarN.q();
        synchronized (this.f) {
            rvr rvrVar = this.k;
            if (rvrVar == null) {
                return false;
            }
            int i3 = this.g;
            if (i3 >= 1024) {
                throw new rvn();
            }
            this.g = i3 + 1;
            this.i.execute(new saq(this, rvrVar, qtkVar7, byteBufferDuplicate, 1));
            return true;
        }
    }
}
