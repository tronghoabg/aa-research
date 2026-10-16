package defpackage;

import android.os.RemoteException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class jbh extends jbj {
    private static final ypf a = ols.R("CAR.GAL.INST");
    private final jbg b;

    public jbh(jbg jbgVar, jbn jbnVar) {
        super(13, jbgVar, jbnVar, 0);
        this.b = jbgVar;
    }

    @Override // defpackage.jbj
    public final void a(int i, ByteBuffer byteBuffer) throws abon {
        if (i != 32770) {
            a.g().ai(1780).w("Invalid message type: %d", i);
            return;
        }
        xme xmeVar = (xme) abnv.A(xme.a, byteBuffer, abnj.a());
        jbg jbgVar = this.b;
        String str = xmeVar.c;
        String str2 = xmeVar.d;
        xjy xjyVar = xmeVar.b;
        if (xjyVar == null) {
            xjyVar = xjy.a;
        }
        int iAD = a.aD(xjyVar.c);
        if (iAD == 0) {
            iAD = 1;
        }
        aat aatVar = ((iki) jbgVar).b;
        synchronized (aatVar) {
            for (int i2 = 0; i2 < aatVar.d; i2++) {
                try {
                    ((ikh) aatVar.g(i2)).a.f(str, str2, iAD - 1);
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) iki.a.h()).p(e)).ai(173)).u("Error calling onInput()");
                }
            }
        }
    }

    @Override // defpackage.iyx
    public final void b(int i) {
    }
}
