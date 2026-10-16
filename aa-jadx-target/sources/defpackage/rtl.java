package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rtl implements defpackage.rtn {
    final /* synthetic */ defpackage.rtm a;
    private final /* synthetic */ int b;

    public rtl(defpackage.rtm rtmVar, int i) {
        this.b = i;
        this.a = rtmVar;
    }

    @Override // defpackage.rtn
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int i = this.b;
        defpackage.rtm rtmVar = this.a;
        if (i == 0) {
            com.google.android.gms.car.senderprotocol.Channel channel = rtmVar.b;
            channel.h = 3;
            channel.c.u(0);
            synchronized (channel.k) {
                int i2 = channel.h;
                if (i2 == 0) {
                    channel.d.u(0);
                    return;
                }
                if (i2 == 1) {
                    channel.i = true;
                } else if (i2 != 2) {
                    return;
                }
                defpackage.rtt rttVar = channel.g;
                int i3 = channel.b;
                xjq xjqVar = xjq.a;
                java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(xjqVar.e(null) + 2);
                byteBufferA.putShort((short) 9);
                try {
                    defpackage.aboa aboaVar = new defpackage.aboa(byteBufferA.array(), byteBufferA.arrayOffset() + 2, xjqVar.e(null), null);
                    xjqVar.R(aboaVar);
                    aboaVar.I();
                    byteBufferA.position(xjqVar.e(null) + 2);
                    rttVar.h(i3, byteBufferA, false, true, new defpackage.rtu(true, false, 0));
                    channel.d.u(0);
                    channel.h = 4;
                    return;
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Serializing " + xjqVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        }
        com.google.android.gms.car.senderprotocol.Channel channel2 = rtmVar.b;
        if (channel2.h != 1) {
            if (!channel2.i) {
                com.google.android.gms.car.senderprotocol.Channel.a.h().ai(8274).u("Received unexpected channel control message");
                defpackage.rtt rttVar2 = channel2.g;
                int i4 = channel2.b;
                java.nio.ByteBuffer byteBufferA2 = defpackage.rwc.a.a(2);
                byteBufferA2.putShort((short) 255);
                rttVar2.h(i4, byteBufferA2, false, false, new defpackage.rtu(false, false, 0));
                return;
            }
            channel2.i = false;
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
            defpackage.rtm rtmVar2 = this.a;
            if (!zEquals) {
                com.google.android.gms.car.senderprotocol.Channel channel3 = rtmVar2.b;
                channel3.c.u(1);
                channel3.d();
            } else {
                com.google.android.gms.car.senderprotocol.Channel channel4 = rtmVar2.b;
                channel4.h = 2;
                channel4.d.v();
                channel4.c.v();
            }
        } catch (java.io.IOException unused) {
            com.google.android.gms.car.senderprotocol.Channel.a.h().ai(8273).u("Received invalid protocol buffer");
        }
    }
}
