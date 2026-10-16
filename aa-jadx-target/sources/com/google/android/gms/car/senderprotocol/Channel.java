package com.google.android.gms.car.senderprotocol;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class Channel implements defpackage.rtv {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.GAL");
    private static final defpackage.kwv m = new defpackage.kwv("debug.car.channel_lock_latency");
    private static final defpackage.kwv n = new defpackage.kwv("debug.car.channel_send_latency");
    public final int b;
    public final defpackage.rtk c;
    public final defpackage.rtj d;
    public final int e;
    public final defpackage.rws f;
    public final defpackage.rtt g;
    public boolean i;
    public final android.os.Handler l;
    public final java.lang.Object k = new java.lang.Object();
    public final defpackage.rtm j = new defpackage.rtm(this);
    public int h = 4;

    public Channel(int i, int i2, defpackage.rws rwsVar, defpackage.rtt rttVar, defpackage.rtk rtkVar, defpackage.rtj rtjVar, android.os.Handler handler) {
        this.b = i;
        this.e = i2;
        this.f = rwsVar;
        this.d = rtjVar;
        this.g = rttVar;
        this.c = rtkVar;
        this.l = handler;
    }

    @Override // defpackage.rtv
    public final int a() {
        return this.b;
    }

    public final void b() {
        synchronized (this.k) {
            if (this.h != 0) {
                return;
            }
            this.h = 1;
            defpackage.rtt rttVar = this.g;
            int i = this.b;
            int i2 = this.e;
            defpackage.abor aborVarN = defpackage.xjr.a.n();
            int iL = defpackage.ooa.l(java.lang.Integer.valueOf(i2));
            aborVarN.t();
            defpackage.xjr xjrVar = (defpackage.xjr) aborVarN.b;
            xjrVar.b |= 1;
            xjrVar.c = iL;
            int iL2 = defpackage.ooa.l(java.lang.Integer.valueOf(i));
            aborVarN.t();
            defpackage.xjr xjrVar2 = (defpackage.xjr) aborVarN.b;
            xjrVar2.b |= 2;
            xjrVar2.d = iL2;
            defpackage.xjr xjrVar3 = (defpackage.xjr) aborVarN.q();
            java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(xjrVar3.e(null) + 2);
            byteBufferA.putShort((short) 7);
            byteBufferA.put(xjrVar3.h());
            rttVar.h(i, byteBufferA, false, true, new defpackage.rtu(true, false, 0));
        }
    }

    public final void c() {
        this.h = 2;
    }

    public final void d() {
        int i;
        synchronized (this.k) {
            a.l().ai(8275).w("Force closing channel %d", this.b);
            i = this.h;
            this.h = 4;
        }
        if (i == 2) {
            this.d.u(1);
        }
    }

    @Override // defpackage.rtv
    public final void e(java.nio.ByteBuffer byteBuffer, defpackage.rtu rtuVar) {
        java.nio.ByteBuffer byteBuffer2;
        defpackage.kwv kwvVar = m;
        long jElapsedRealtime = (defpackage.rly.a(kwvVar) || defpackage.rly.a(n)) ? android.os.SystemClock.elapsedRealtime() : 0L;
        synchronized (this.k) {
            if (defpackage.rly.a(kwvVar)) {
                long jElapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 > 5) {
                    a.l().ai(8278).x("sendMessage lock delayed %d", jElapsedRealtime2);
                }
            }
            if (this.h != 2) {
                throw new java.lang.IllegalStateException("Channel must be open before sending a message.");
            }
            defpackage.rtt rttVar = this.g;
            int i = this.b;
            if (rttVar.f) {
                byteBuffer2 = byteBuffer;
            } else {
                byteBuffer2 = byteBuffer;
                rttVar.h(i, byteBuffer2, true, false, rtuVar);
            }
            if (defpackage.rly.a(n)) {
                long jElapsedRealtime3 = android.os.SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime3 > 10) {
                    a.l().ai(8277).F("sendMessage sending delayed %d size %d", jElapsedRealtime3, byteBuffer2.position());
                }
            }
        }
    }
}
