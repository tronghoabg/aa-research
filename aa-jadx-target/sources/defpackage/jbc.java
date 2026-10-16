package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jbc extends defpackage.jbq implements defpackage.jbd {
    private static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.INST");
    private static final int c = 32769;
    private static final int d = 32771;
    private static final int e = 32770;
    private final defpackage.jbb b;

    public jbc(defpackage.jbb jbbVar, defpackage.jbu jbuVar) {
        super(11, jbbVar, jbuVar, 0);
        this.b = jbbVar;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, qxt] */
    @Override // defpackage.jbq
    public final void a(int i, java.nio.ByteBuffer byteBuffer) throws defpackage.abpp {
        int i2 = e;
        if (i2 == 0) {
            throw null;
        }
        if (i != i2) {
            a.g().ai(1750).w("Invalid message type: %d", i);
            return;
        }
        defpackage.abor aborVarN = xkz.a.n();
        aborVarN.t();
        xkz xkzVar = aborVarN.b;
        xkzVar.c = 0;
        xkzVar.b |= 1;
        aborVarN.l(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining());
        xkz xkzVarQ = aborVarN.q();
        defpackage.jbb jbbVar = this.b;
        int iAC = defpackage.a.aC(xkzVarQ.c);
        int i3 = iAC != 0 ? iAC : 1;
        synchronized (((defpackage.iwk) jbbVar).b) {
            try {
                defpackage.iko ikoVar = ((defpackage.iwk) jbbVar).d;
                ikoVar.getClass();
                ikoVar.a.e(i3 - 1);
            } catch (android.os.RemoteException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.iwk.a.g()).p(e2)).ai(1446)).u("Error calling onInput.");
            }
        }
    }

    @Override // defpackage.jbd
    public final void h(java.lang.String str, java.lang.String str2, java.lang.String str3, byte[] bArr, java.lang.String str4, int i, int i2) {
        defpackage.abor aborVarN = xlm.a.n();
        aborVarN.t();
        xlm xlmVar = aborVarN.b;
        xlmVar.b |= 32;
        xlmVar.h = i;
        aborVarN.t();
        xlm xlmVar2 = aborVarN.b;
        xlmVar2.b |= 64;
        xlmVar2.i = i2;
        if (str != null) {
            aborVarN.t();
            xlm xlmVar3 = aborVarN.b;
            xlmVar3.b |= 1;
            xlmVar3.c = str;
        }
        if (str2 != null) {
            aborVarN.t();
            xlm xlmVar4 = aborVarN.b;
            xlmVar4.b |= 2;
            xlmVar4.d = str2;
        }
        if (str3 != null) {
            aborVarN.t();
            xlm xlmVar5 = aborVarN.b;
            xlmVar5.b |= 4;
            xlmVar5.e = str3;
        }
        if (bArr != null) {
            defpackage.abnv abnvVarV = defpackage.abnv.v(bArr);
            aborVarN.t();
            xlm xlmVar6 = aborVarN.b;
            abnvVarV.getClass();
            xlmVar6.b |= 8;
            xlmVar6.f = abnvVarV;
        }
        if (str4 != null) {
            aborVarN.t();
            xlm xlmVar7 = aborVarN.b;
            xlmVar7.b |= 16;
            xlmVar7.g = str4;
        }
        int i3 = d;
        if (i3 == 0) {
            throw null;
        }
        k(i3, aborVarN.q());
    }

    @Override // defpackage.jbd
    public final void i(int i, java.lang.String str, int i2, boolean z, boolean z2, boolean z3) {
        defpackage.abor aborVarN = xln.a.n();
        if (i != 0) {
            aborVarN.t();
            xln xlnVar = aborVarN.b;
            xlnVar.c = i;
            xlnVar.b |= 1;
        }
        if (str != null) {
            aborVarN.t();
            xln xlnVar2 = aborVarN.b;
            xlnVar2.b |= 2;
            xlnVar2.d = str;
        }
        aborVarN.t();
        xln xlnVar3 = aborVarN.b;
        xlnVar3.b |= 4;
        xlnVar3.e = i2;
        aborVarN.t();
        xln xlnVar4 = aborVarN.b;
        xlnVar4.b |= 8;
        xlnVar4.f = z;
        aborVarN.t();
        xln xlnVar5 = aborVarN.b;
        xlnVar5.b |= 16;
        xlnVar5.g = z2;
        aborVarN.t();
        xln xlnVar6 = aborVarN.b;
        xlnVar6.b |= 32;
        xlnVar6.h = z3;
        int i3 = c;
        if (i3 == 0) {
            throw null;
        }
        k(i3, aborVarN.q());
    }

    @Override // defpackage.ize
    public final void b(int i) {
    }
}
