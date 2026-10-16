package defpackage;

import android.os.Build;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jog implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ izt e;
    final /* synthetic */ joi f;

    public jog(joi joiVar, String str, long j, String str2, String str3, izt iztVar) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = iztVar;
        this.f = joiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        joi joiVar = this.f;
        joiVar.n = this.a;
        joiVar.o = this.b;
        Iterator it = joiVar.g.iterator();
        while (it.hasNext()) {
            try {
                ((rwy) it.next()).a();
            } catch (RemoteException e) {
                ((ype) ((ype) ((ype) joi.a.h()).p(e)).ai((char) 2453)).u("Can't callback to startup service client");
            }
        }
        joi joiVar2 = this.f;
        jfg jfgVar = joiVar2.f.O;
        jfgVar.g((int) joiVar2.c);
        String str = this.a;
        long j = this.b;
        String str2 = this.c;
        String str3 = this.d;
        abnp abnpVarN = yzm.a.n();
        abnpVarN.t();
        yzm yzmVar = (yzm) abnpVarN.b;
        yzmVar.b |= 8;
        yzmVar.f = j;
        if (str != null) {
            abnpVarN.t();
            yzm yzmVar2 = (yzm) abnpVarN.b;
            yzmVar2.b |= 1;
            yzmVar2.c = str;
        }
        if (str2 != null) {
            abnpVarN.t();
            yzm yzmVar3 = (yzm) abnpVarN.b;
            yzmVar3.b |= 2;
            yzmVar3.d = str2;
        }
        if (str3 != null) {
            abnpVarN.t();
            yzm yzmVar4 = (yzm) abnpVarN.b;
            yzmVar4.b |= 4;
            yzmVar4.e = str3;
        }
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzm yzmVar5 = (yzm) abnpVarN.q();
        yzmVar5.getClass();
        yxbVar.i = yzmVar5;
        yxbVar.b |= 32;
        yxc yxcVar = yxc.SSL_HANDSHAKE;
        int i = yfq.d;
        ((jfh) jfgVar).m(abnpVarN2, yxcVar, yls.a);
        Object obj = this.e;
        izu izuVar = (izu) obj;
        if (izuVar.i(5, par.GAL_READ_WRITE_MESSAGE_RAND)) {
            return;
        }
        abnp abnpVarN3 = xoa.a.n();
        byte[] bArr = izuVar.g;
        if (bArr != null) {
            int length = bArr.length;
            abms abmsVar = abms.d;
            try {
                abms abmsVarE = abms.E(bArr, 0, length);
                abnpVarN3.t();
                xoa xoaVar = (xoa) abnpVarN3.b;
                abmsVarE.getClass();
                xoaVar.b |= 1;
                xoaVar.c = abmsVarE;
            } catch (abon e2) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            }
        }
        byte[] bArr2 = izuVar.h;
        if (bArr2 != null) {
            int length2 = bArr2.length;
            abms abmsVar2 = abms.d;
            try {
                abms abmsVarE2 = abms.E(bArr2, 0, length2);
                abnpVarN3.t();
                xoa xoaVar2 = (xoa) abnpVarN3.b;
                abmsVarE2.getClass();
                xoaVar2.b |= 2;
                xoaVar2.d = abmsVarE2;
            } catch (abon e3) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
            }
        }
        byte[] bArr3 = izuVar.i;
        if (bArr3 != null) {
            int length3 = bArr3.length;
            abms abmsVar3 = abms.d;
            try {
                abms abmsVarE3 = abms.E(bArr3, 0, length3);
                abnpVarN3.t();
                xoa xoaVar3 = (xoa) abnpVarN3.b;
                abmsVarE3.getClass();
                xoaVar3.b |= 4;
                xoaVar3.e = abmsVarE3;
            } catch (abon e4) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e4);
            }
        }
        String str4 = izuVar.f;
        if (str4 != null) {
            abnpVarN3.t();
            xoa xoaVar4 = (xoa) abnpVarN3.b;
            xoaVar4.b |= 8;
            xoaVar4.f = str4;
        }
        if (izuVar.s.s(izu.c) && izuVar.j != null) {
            abnp abnpVarN4 = xgs.a.n();
            String str5 = izuVar.j;
            abnpVarN4.t();
            xgs xgsVar = (xgs) abnpVarN4.b;
            str5.getClass();
            xgsVar.b |= 1;
            xgsVar.c = str5;
            xgs xgsVar2 = (xgs) abnpVarN4.q();
            abnpVarN3.t();
            xoa xoaVar5 = (xoa) abnpVarN3.b;
            xgsVar2.getClass();
            xoaVar5.h = xgsVar2;
            xoaVar5.b |= 32;
        }
        izuVar.g = null;
        izuVar.h = null;
        izuVar.i = null;
        izuVar.f = null;
        ols.K(izuVar.k, "com.google.android.gms.car.SDP_NEGOTIATION", rrx.a.ordinal(), null);
        String str6 = Build.MANUFACTURER;
        String strBJ = Build.MODEL;
        if (!strBJ.startsWith(str6)) {
            strBJ = a.bJ(strBJ, str6, " ");
        }
        abnpVarN3.t();
        xoa xoaVar6 = (xoa) abnpVarN3.b;
        strBJ.getClass();
        xoaVar6.b |= 16;
        xoaVar6.g = strBJ;
        ((jbj) obj).k(5, abnpVarN3.q());
    }
}
