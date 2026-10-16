package defpackage;

import android.os.RemoteException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jav extends jbj implements jaw {
    private static final ypf a = ols.R("CAR.GAL.INST");
    private static final int c = 32769;
    private static final int d = 32771;
    private static final int e = 32770;
    private final jau b;

    public jav(jau jauVar, jbn jbnVar) {
        super(11, jauVar, jbnVar, 0);
        this.b = jauVar;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, qwx] */
    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        int i2 = e;
        if (i2 == 0) {
            throw null;
        }
        if (i != i2) {
            a.g().ai(1750).w("Invalid message type: %d", i);
            return;
        }
        abnp abnpVarN = xjy.a.n();
        abnpVarN.t();
        xjy xjyVar = (xjy) abnpVarN.b;
        xjyVar.c = 0;
        xjyVar.b |= 1;
        abnpVarN.l(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining());
        xjy xjyVar2 = (xjy) abnpVarN.q();
        jau jauVar = this.b;
        int iAD = a.aD(xjyVar2.c);
        int i3 = iAD != 0 ? iAD : 1;
        synchronized (((iwc) jauVar).b) {
            try {
                ikf ikfVar = ((iwc) jauVar).d;
                ikfVar.getClass();
                ikfVar.a.e(i3 - 1);
            } catch (RemoteException e2) {
                ((ype) ((ype) ((ype) iwc.a.g()).p(e2)).ai(1446)).u("Error calling onInput.");
            }
        }
    }

    @Override // defpackage.jaw
    public final void h(String str, String str2, String str3, byte[] bArr, String str4, int i, int i2) {
        abnp abnpVarN = xkl.a.n();
        abnpVarN.t();
        xkl xklVar = (xkl) abnpVarN.b;
        xklVar.b |= 32;
        xklVar.h = i;
        abnpVarN.t();
        xkl xklVar2 = (xkl) abnpVarN.b;
        xklVar2.b |= 64;
        xklVar2.i = i2;
        if (str != null) {
            abnpVarN.t();
            xkl xklVar3 = (xkl) abnpVarN.b;
            xklVar3.b |= 1;
            xklVar3.c = str;
        }
        if (str2 != null) {
            abnpVarN.t();
            xkl xklVar4 = (xkl) abnpVarN.b;
            xklVar4.b |= 2;
            xklVar4.d = str2;
        }
        if (str3 != null) {
            abnpVarN.t();
            xkl xklVar5 = (xkl) abnpVarN.b;
            xklVar5.b |= 4;
            xklVar5.e = str3;
        }
        if (bArr != null) {
            abms abmsVarV = abms.v(bArr);
            abnpVarN.t();
            xkl xklVar6 = (xkl) abnpVarN.b;
            abmsVarV.getClass();
            xklVar6.b |= 8;
            xklVar6.f = abmsVarV;
        }
        if (str4 != null) {
            abnpVarN.t();
            xkl xklVar7 = (xkl) abnpVarN.b;
            xklVar7.b |= 16;
            xklVar7.g = str4;
        }
        int i3 = d;
        if (i3 == 0) {
            throw null;
        }
        k(i3, abnpVarN.q());
    }

    @Override // defpackage.jaw
    public final void i(int i, String str, int i2, boolean z, boolean z2, boolean z3) {
        abnp abnpVarN = xkm.a.n();
        if (i != 0) {
            abnpVarN.t();
            xkm xkmVar = (xkm) abnpVarN.b;
            xkmVar.c = i;
            xkmVar.b |= 1;
        }
        if (str != null) {
            abnpVarN.t();
            xkm xkmVar2 = (xkm) abnpVarN.b;
            xkmVar2.b |= 2;
            xkmVar2.d = str;
        }
        abnpVarN.t();
        xkm xkmVar3 = (xkm) abnpVarN.b;
        xkmVar3.b |= 4;
        xkmVar3.e = i2;
        abnpVarN.t();
        xkm xkmVar4 = (xkm) abnpVarN.b;
        xkmVar4.b |= 8;
        xkmVar4.f = z;
        abnpVarN.t();
        xkm xkmVar5 = (xkm) abnpVarN.b;
        xkmVar5.b |= 16;
        xkmVar5.g = z2;
        abnpVarN.t();
        xkm xkmVar6 = (xkm) abnpVarN.b;
        xkmVar6.b |= 32;
        xkmVar6.h = z3;
        int i3 = c;
        if (i3 == 0) {
            throw null;
        }
        k(i3, abnpVarN.q());
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
