package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Looper;
import android.os.Message;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class qpm extends rbj {
    public volatile boolean a;
    public final Semaphore b;
    public boolean c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    final /* synthetic */ qpn f;
    private rei g;
    private rfo h;
    private final boolean i;
    private rlb j;
    private final Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpm(qpn qpnVar, Looper looper, Context context, boolean z) {
        super(null, looper);
        this.f = qpnVar;
        this.a = false;
        this.b = new Semaphore(0);
        this.c = false;
        this.d = new AtomicInteger();
        this.e = new AtomicInteger();
        this.k = context;
        this.i = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e() throws android.media.MediaCodec.CryptoException, java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpm.e():void");
    }

    public final synchronized void a() {
        if (this.c) {
            this.f.i(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else {
            sendMessage(obtainMessage(4));
        }
    }

    public final synchronized void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        sendMessage(obtainMessage(5));
    }

    public final synchronized void c() {
        if (this.c) {
            return;
        }
        sendMessage(obtainMessage(2));
    }

    public final synchronized boolean d(boolean z, boolean z2) {
        if (this.c) {
            return false;
        }
        if (z) {
            if (hasMessages(4)) {
                this.f.i(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPING_IMMEDIATELY);
            }
            removeMessages(4);
        }
        sendMessage(obtainMessage(3, z ? 1 : 0, z2 ? 1 : 0));
        return true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws MediaCodec.CryptoException, InterruptedException, IOException {
        rlb rlbVar;
        rlb rlbVar2;
        ouf oufVar;
        qpn qpnVar = this.f;
        char c = 3;
        if (!qpnVar.l && message.what != 1 && message.what != 3 && message.what != 5) {
            if (message.what == 4) {
                qpnVar.i(oui.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
                return;
            }
            ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_MESSAGE_IGNORED;
            abnp abnpVarW = qpnVar.w();
            int i = message.what;
            if (i == 1) {
                oufVar = ouf.INIT;
            } else if (i == 2) {
                oufVar = ouf.START;
            } else if (i == 3) {
                oufVar = ouf.STOP;
            } else if (i == 4) {
                oufVar = ouf.SEND_STREAM;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.bp(i, "Unsupported message "));
                }
                oufVar = ouf.SHUTDOWN;
            }
            abnpVarW.t();
            ouk oukVar = (ouk) abnpVarW.b;
            ouk oukVar2 = ouk.a;
            oukVar.p = oufVar.g;
            oukVar.b |= 8192;
            qpnVar.x(ouoVar, abnpVarW);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            int i3 = message.arg1;
            if (i3 == 0) {
                c = 1;
            } else if (i3 == 1) {
                c = 2;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException(a.bp(i3, "Unknown format type: "));
                }
                c = 4;
            }
            xkj xkjVar = (xkj) message.obj;
            int i4 = qpnVar.e;
            qpnVar.j = new rei(i4);
            boolean zT = qpn.t(xkjVar);
            int i5 = c == 2 ? 2 : 1;
            int i6 = c != 4 ? c == 2 ? 48000 : sk.AUDIO_CONTENT_SAMPLING_RATE : 48000;
            if (zT) {
                rei reiVar = this.g;
                if (reiVar != null) {
                    reiVar.b();
                }
                this.g = new rei(4096);
                rfo rfoVar = this.h;
                if (rfoVar != null) {
                    rfoVar.b();
                }
                this.h = new rfo(i6, i5, this.g, xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC_ADTS);
            }
            yop yopVarAi = qpn.a.l().ai(7546);
            Integer numValueOf = Integer.valueOf(i6);
            Integer numValueOf2 = Integer.valueOf(i5);
            Integer numValueOf3 = Integer.valueOf(i4);
            ypf ypfVar = rug.a;
            String strO = roc.o(xkjVar);
            int i7 = qpnVar.c;
            ypf ypfVar2 = qqv.a;
            yopVarAi.U("init, samplingRate: %d, numberOfBits: %d, numberOfChannels: %d, bufferSize: %d, encoding: %s stream %s", numValueOf, 16, numValueOf2, numValueOf3, strO, roc.O(i7));
            qpnVar.h(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_INITIALIZED);
            this.b.release();
            return;
        }
        if (i2 == 2) {
            if (this.a) {
                qpn.a.f().ai(7547).u("stream already started");
                qpnVar.h(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED);
                return;
            }
            vqk vqkVar = rlc.c;
            rlc.a(vqkVar);
            this.a = true;
            qpnVar.p = -1L;
            qpnVar.h(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED);
            rsd rsdVar = qpnVar.g;
            rsdVar.getClass();
            rsdVar.j(qpnVar.d);
            this.d.set(0);
            xkj xkjVar2 = qpnVar.f;
            if (qpn.t(xkjVar2)) {
                rfo rfoVar2 = this.h;
                if (!rfoVar2.k) {
                    rfoVar2.k = true;
                    rfoVar2.g = ByteBuffer.allocate(1024);
                    rfoVar2.h.drainPermits();
                    rfoVar2.f.drainPermits();
                    rfoVar2.j = new rfn(rfoVar2.b, rfoVar2.c, rfoVar2.d);
                    rfoVar2.j.f(rfoVar2.l);
                }
            }
            rlc.a(vqkVar);
            if (this.i) {
                this.j = new rlb(this.k, qpnVar.c, qpnVar.r, xkjVar2);
                return;
            }
            return;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                if (this.a) {
                    e();
                    return;
                }
                yop yopVarAi2 = qpn.a.l().ai(7549);
                int i8 = qpnVar.c;
                ypf ypfVar3 = qqv.a;
                yopVarAi2.y("stream send requested while stopped %s", roc.O(i8));
                qpnVar.i(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED);
                return;
            }
            if (i2 != 5) {
                throw new IllegalStateException(a.cc(message, "Unsupported message "));
            }
            if (qpn.t(qpnVar.f)) {
                rfo rfoVar3 = this.h;
                if (rfoVar3 != null) {
                    rfoVar3.b();
                }
                rei reiVar2 = this.g;
                if (reiVar2 != null) {
                    reiVar2.b();
                }
            }
            if (this.i && (rlbVar2 = this.j) != null) {
                rlbVar2.a();
                this.j = null;
            }
            qpnVar.g();
            return;
        }
        boolean z = message.arg1 == 1;
        boolean z2 = message.arg2 == 1;
        ouo ouoVar2 = ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
        abnp abnpVarW2 = qpnVar.w();
        abnpVarW2.t();
        ouk oukVar3 = (ouk) abnpVarW2.b;
        ouk oukVar4 = ouk.a;
        oukVar3.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        oukVar3.l = z;
        abnpVarW2.t();
        ouk oukVar5 = (ouk) abnpVarW2.b;
        oukVar5.b |= 1024;
        oukVar5.m = z2;
        AtomicInteger atomicInteger = this.d;
        int i9 = atomicInteger.get();
        abnpVarW2.t();
        ouk oukVar6 = (ouk) abnpVarW2.b;
        oukVar6.b |= 2048;
        oukVar6.n = i9;
        int i10 = this.e.get();
        abnpVarW2.t();
        ouk oukVar7 = (ouk) abnpVarW2.b;
        oukVar7.b = 4096 | oukVar7.b;
        oukVar7.o = i10;
        qpnVar.x(ouoVar2, abnpVarW2);
        if (this.a) {
            if (!z) {
                e();
            }
            vqk vqkVar2 = rlc.c;
            rlc.a(vqkVar2);
            rsd rsdVar2 = qpnVar.g;
            rsdVar2.getClass();
            rsdVar2.c();
            rlc.a(vqkVar2);
            yop yopVarAi3 = qpn.a.f().ai(7548);
            int i11 = qpnVar.c;
            ypf ypfVar4 = qqv.a;
            yopVarAi3.M("stopping, sent %s for stream %s", atomicInteger, roc.O(i11));
            this.a = false;
            qpnVar.g();
            qpnVar.j();
            if (this.i && (rlbVar = this.j) != null) {
                rlbVar.a();
                this.j = null;
            }
        }
        qpnVar.e(z2);
    }
}
