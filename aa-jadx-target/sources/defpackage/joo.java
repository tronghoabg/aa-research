package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class joo implements java.lang.Runnable {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ defpackage.jaa e;
    final /* synthetic */ defpackage.joq f;

    public joo(defpackage.joq joqVar, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, defpackage.jaa jaaVar) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = jaaVar;
        this.f = joqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.joq joqVar = this.f;
        joqVar.n = this.a;
        joqVar.o = this.b;
        java.util.Iterator it = joqVar.g.iterator();
        while (it.hasNext()) {
            try {
                ((defpackage.rxr) it.next()).a();
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.joq.a.h()).p(e)).ai((char) 2454)).u("Can't callback to startup service client");
            }
        }
        defpackage.joq joqVar2 = this.f;
        defpackage.jfo jfoVar = joqVar2.f.O;
        jfoVar.g((int) joqVar2.c);
        java.lang.String str = this.a;
        long j = this.b;
        java.lang.String str2 = this.c;
        java.lang.String str3 = this.d;
        defpackage.abor aborVarN = defpackage.zar.a.n();
        aborVarN.t();
        defpackage.zar zarVar = (defpackage.zar) aborVarN.b;
        zarVar.b |= 8;
        zarVar.f = j;
        if (str != null) {
            aborVarN.t();
            defpackage.zar zarVar2 = (defpackage.zar) aborVarN.b;
            zarVar2.b |= 1;
            zarVar2.c = str;
        }
        if (str2 != null) {
            aborVarN.t();
            defpackage.zar zarVar3 = (defpackage.zar) aborVarN.b;
            zarVar3.b |= 2;
            zarVar3.d = str2;
        }
        if (str3 != null) {
            aborVarN.t();
            defpackage.zar zarVar4 = (defpackage.zar) aborVarN.b;
            zarVar4.b |= 4;
            zarVar4.e = str3;
        }
        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
        aborVarN2.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
        defpackage.zar zarVar5 = (defpackage.zar) aborVarN.q();
        zarVar5.getClass();
        yygVar.i = zarVar5;
        yygVar.b |= 32;
        defpackage.yyh yyhVar = defpackage.yyh.SSL_HANDSHAKE;
        int i = defpackage.ygw.d;
        ((defpackage.jfp) jfoVar).m(aborVarN2, yyhVar, defpackage.ymx.a);
        java.lang.Object obj = this.e;
        defpackage.jab jabVar = (defpackage.jab) obj;
        if (jabVar.i(5, defpackage.pbp.GAL_READ_WRITE_MESSAGE_RAND)) {
            return;
        }
        defpackage.abor aborVarN3 = defpackage.xpb.a.n();
        byte[] bArr = jabVar.g;
        if (bArr != null) {
            int length = bArr.length;
            defpackage.abnv abnvVar = defpackage.abnv.d;
            try {
                defpackage.abnv abnvVarE = defpackage.abnv.E(bArr, 0, length);
                aborVarN3.t();
                defpackage.xpb xpbVar = (defpackage.xpb) aborVarN3.b;
                abnvVarE.getClass();
                xpbVar.b |= 1;
                xpbVar.c = abnvVarE;
            } catch (defpackage.abpp e2) {
                throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e2);
            }
        }
        byte[] bArr2 = jabVar.h;
        if (bArr2 != null) {
            int length2 = bArr2.length;
            defpackage.abnv abnvVar2 = defpackage.abnv.d;
            try {
                defpackage.abnv abnvVarE2 = defpackage.abnv.E(bArr2, 0, length2);
                aborVarN3.t();
                defpackage.xpb xpbVar2 = (defpackage.xpb) aborVarN3.b;
                abnvVarE2.getClass();
                xpbVar2.b |= 2;
                xpbVar2.d = abnvVarE2;
            } catch (defpackage.abpp e3) {
                throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e3);
            }
        }
        byte[] bArr3 = jabVar.i;
        if (bArr3 != null) {
            int length3 = bArr3.length;
            defpackage.abnv abnvVar3 = defpackage.abnv.d;
            try {
                defpackage.abnv abnvVarE3 = defpackage.abnv.E(bArr3, 0, length3);
                aborVarN3.t();
                defpackage.xpb xpbVar3 = (defpackage.xpb) aborVarN3.b;
                abnvVarE3.getClass();
                xpbVar3.b |= 4;
                xpbVar3.e = abnvVarE3;
            } catch (defpackage.abpp e4) {
                throw new java.lang.AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e4);
            }
        }
        java.lang.String str4 = jabVar.f;
        if (str4 != null) {
            aborVarN3.t();
            defpackage.xpb xpbVar4 = (defpackage.xpb) aborVarN3.b;
            xpbVar4.b |= 8;
            xpbVar4.f = str4;
        }
        if (jabVar.s.D(defpackage.jab.c) && jabVar.j != null) {
            defpackage.abor aborVarN4 = defpackage.xht.a.n();
            java.lang.String str5 = jabVar.j;
            aborVarN4.t();
            defpackage.xht xhtVar = (defpackage.xht) aborVarN4.b;
            str5.getClass();
            xhtVar.b |= 1;
            xhtVar.c = str5;
            defpackage.xht xhtVar2 = (defpackage.xht) aborVarN4.q();
            aborVarN3.t();
            defpackage.xpb xpbVar5 = (defpackage.xpb) aborVarN3.b;
            xhtVar2.getClass();
            xpbVar5.h = xhtVar2;
            xpbVar5.b |= 32;
        }
        jabVar.g = null;
        jabVar.h = null;
        jabVar.i = null;
        jabVar.f = null;
        defpackage.omv.g(jabVar.k, "com.google.android.gms.car.SDP_NEGOTIATION", defpackage.rsr.a.ordinal(), null);
        java.lang.String str6 = android.os.Build.MANUFACTURER;
        java.lang.String strBI = android.os.Build.MODEL;
        if (!strBI.startsWith(str6)) {
            strBI = defpackage.a.bI(strBI, str6, " ");
        }
        aborVarN3.t();
        defpackage.xpb xpbVar6 = (defpackage.xpb) aborVarN3.b;
        strBI.getClass();
        xpbVar6.b |= 16;
        xpbVar6.g = strBI;
        ((defpackage.jbq) obj).k(5, aborVarN3.q());
    }
}
