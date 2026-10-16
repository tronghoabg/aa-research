package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class izh implements defpackage.izj {
    final /* synthetic */ defpackage.izi a;
    private final /* synthetic */ int b;

    public izh(defpackage.izi iziVar, int i) {
        this.b = i;
        this.a = iziVar;
    }

    @Override // defpackage.izj
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int i = this.b;
        defpackage.izi iziVar = this.a;
        if (i == 0) {
            defpackage.izk izkVar = iziVar.b;
            java.util.concurrent.atomic.AtomicInteger atomicInteger = izkVar.h;
            atomicInteger.set(3);
            izkVar.c.P(0);
            synchronized (izkVar.l) {
                int i2 = atomicInteger.get();
                if (i2 == 0) {
                    izkVar.d.P(0);
                    return;
                }
                if (i2 == 1) {
                    izkVar.i.set(true);
                } else if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new java.lang.RuntimeException("Unhandled Channel State");
                    }
                    return;
                }
                defpackage.izs izsVar = izkVar.g;
                int i3 = izkVar.b;
                xjq xjqVar = xjq.a;
                defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(xjqVar.e(null) + 2), null, false);
                jcuVar.v((short) 9);
                try {
                    defpackage.aboa aboaVar = new defpackage.aboa(jcuVar.l(), jcuVar.b() + 2, xjqVar.e(null), null);
                    xjqVar.R(aboaVar);
                    aboaVar.I();
                    jcuVar.q(xjqVar.e(null) + 2);
                    izsVar.g(i3, jcuVar, false, true, new defpackage.izu(true, false, 0));
                    izkVar.d.P(0);
                    izkVar.h.set(4);
                    return;
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Serializing " + xjqVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        }
        defpackage.izk izkVar2 = iziVar.b;
        if (izkVar2.h.get() != 1 && !izkVar2.i.compareAndSet(true, false)) {
            defpackage.izk.a.h().ai(1668).u("Received unexpected channel control message");
            defpackage.izs izsVar2 = izkVar2.g;
            int i4 = izkVar2.b;
            defpackage.jcu jcuVar2 = new defpackage.jcu(java.nio.ByteBuffer.allocate(2), null, false);
            jcuVar2.v((short) 255);
            izsVar2.g(i4, jcuVar2, false, false, new defpackage.izu(false, false, 0));
            return;
        }
        try {
            defpackage.abor aborVarN = defpackage.xjs.a.n();
            defpackage.xls xlsVar = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
            aborVarN.t();
            defpackage.xjs xjsVar = (defpackage.xjs) aborVarN.b;
            xjsVar.c = xlsVar.I;
            xjsVar.b |= 1;
            aborVarN.x(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), defpackage.abol.a());
            defpackage.xjs xjsVar2 = (defpackage.xjs) aborVarN.q();
            defpackage.xls xlsVar2 = defpackage.xls.STATUS_SUCCESS;
            defpackage.xls xlsVarB = defpackage.xls.b(xjsVar2.c);
            if (xlsVarB == null) {
                xlsVarB = defpackage.xls.STATUS_UNSOLICITED_MESSAGE;
            }
            boolean zEquals = xlsVar2.equals(xlsVarB);
            defpackage.izi iziVar2 = this.a;
            if (!zEquals) {
                defpackage.izk izkVar3 = iziVar2.b;
                izkVar3.c.P(1);
                izkVar3.c();
                return;
            }
            defpackage.izk izkVar4 = iziVar2.b;
            izkVar4.h.set(2);
            izkVar4.d.Q();
            defpackage.ypu ypuVarAi = defpackage.izs.a.f().ai(1672);
            defpackage.izn iznVar = (defpackage.izn) izkVar4.c;
            ypuVarAi.w("onChannelOpened: %d", iznVar.a);
            new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null).post(new defpackage.ire(iznVar.b.z, 10));
        } catch (java.io.IOException unused) {
            defpackage.izk.a.h().ai(1667).u("Received invalid protocol buffer");
        }
    }
}
