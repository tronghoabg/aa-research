package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.MediaOptions;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class iqp extends rbj {
    private final int A;
    public final Semaphore a;
    public final irj b;
    public final ipy c;
    public final ipt d;
    volatile boolean e;
    volatile boolean f;
    private final HandlerThread g;
    private final yph h;
    private final CarInfo i;
    private final imf j;
    private final xkj k;
    private final int l;
    private final String m;
    private final int n;
    private final int o;
    private final boolean p;
    private final boolean q;
    private final Context r;
    private final boolean s;
    private ivq t;
    private ipt u;
    private isk v;
    private final AtomicInteger w;
    private final AtomicInteger x;
    private final iqa y;
    private final iru z;

    public iqp(iqa iqaVar, CarInfo carInfo, imf imfVar, iru iruVar, irj irjVar, ipy ipyVar, int i, xkj xkjVar, int i2, int i3, int i4, boolean z, boolean z2, Context context, boolean z3) {
        HandlerThread handlerThread = new HandlerThread("AUDIO_BH-".concat(roc.O(i2)), -19);
        handlerThread.start();
        super(iqaVar, handlerThread.getLooper());
        this.a = new Semaphore(0);
        this.e = false;
        this.f = false;
        this.w = new AtomicInteger();
        this.x = new AtomicInteger();
        this.y = iqaVar;
        this.i = carInfo;
        this.j = imfVar;
        this.z = iruVar;
        this.b = irjVar;
        this.c = ipyVar;
        this.A = i;
        this.k = xkjVar;
        this.l = i2;
        String strO = roc.O(i2);
        this.m = strO;
        this.n = i3;
        this.o = i4;
        this.p = z;
        this.q = z2;
        this.r = context;
        this.s = z3;
        this.g = handlerThread;
        this.h = yph.c("CAR.AUDIO.".concat(String.valueOf(strO)));
        this.d = new ipt(i4, new iqo(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0237 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqp.h():void");
    }

    private final void i(ByteBuffer byteBuffer, int i, int i2) {
        ivq ivqVar = this.t;
        if (ivqVar != null) {
            ivqVar.b(byteBuffer.array(), i, i2);
        }
    }

    public final void a(PrintWriter printWriter) {
        AtomicInteger atomicInteger = this.x;
        printWriter.println("frames sent since start:" + String.valueOf(this.w) + " total frames sent:" + String.valueOf(atomicInteger));
        printWriter.println("mediaOptionsOverride:".concat(String.valueOf(String.valueOf(this.y.e()))));
    }

    public final void b(ipr iprVar) {
        if (this.f) {
            this.y.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else {
            this.d.e(iprVar);
            sendMessage(obtainMessage(4));
        }
    }

    public final synchronized void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        sendMessage(obtainMessage(5));
        this.g.quitSafely();
    }

    public final synchronized void d() {
        if (this.f) {
            return;
        }
        ipt iptVar = this.d;
        if (iptVar != null && iptVar.a() > 0) {
            ((ype) ((ype) this.h.h()).ai((char) 1146)).w("Transmission queue has %d buffers from last stream", iptVar.a());
            iptVar.f();
        }
        sendMessage(obtainMessage(2));
    }

    public final void e() {
        if (this.f) {
            this.y.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_SHUTTING_DOWN);
        } else {
            sendMessage(obtainMessage(4));
        }
    }

    public final synchronized void f(xkk xkkVar) {
        if (this.f) {
            return;
        }
        sendMessage(obtainMessage(6, xkkVar));
    }

    public final synchronized boolean g(boolean z, boolean z2, boolean z3) {
        if (this.f) {
            return false;
        }
        if (z) {
            removeMessages(4);
            this.y.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPING_IMMEDIATELY);
        }
        sendMessage(obtainMessage(3, z ? 1 : 0, z2 ? 1 : 0, Boolean.valueOf(z3)));
        return true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        iqa iqaVar = this.y;
        if (!iqaVar.o && message.what != 1 && message.what != 3 && message.what != 5) {
            if (message.what == 4) {
                iqaVar.h(oui.AUDIO_BOTTOM_HALF_CAR_NOT_READY);
                return;
            }
            ype ypeVar = (ype) ((ype) this.h.h()).ai(1145);
            int i = message.what;
            ypeVar.y("Car is not ready yet. Ignore: %s", (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? ouf.AUDIO_BOTTOM_HALF_UNSPECIFIED : ouf.SHUTDOWN : ouf.SEND_STREAM : ouf.STOP : ouf.START : ouf.INIT).name());
            return;
        }
        switch (message.what) {
            case 1:
                int i2 = this.A;
                int i3 = i2 == 2 ? 2 : 1;
                int i4 = i2 == 4 ? 48000 : i2 == 2 ? 48000 : sk.AUDIO_CONTENT_SAMPLING_RATE;
                xkj xkjVar = this.k;
                if (itb.a(xkjVar)) {
                    ipt iptVar = this.u;
                    if (iptVar != null) {
                        iptVar.f();
                    }
                    this.u = new ipt(4096, new iqo(0));
                    isk iskVar = this.v;
                    if (iskVar != null) {
                        iskVar.c();
                    }
                    this.v = new isk(this.m, i4, i3, this.u, xkjVar == xkj.MEDIA_CODEC_AUDIO_AAC_LC_ADTS);
                    ((ype) ((ype) this.h.e()).ai((char) 1137)).u("Starting AAC encoder early");
                    this.v.b();
                }
                ype ypeVar2 = (ype) this.h.l().ai(1136);
                Integer numValueOf = Integer.valueOf(i4);
                Integer numValueOf2 = Integer.valueOf(i3);
                Integer numValueOf3 = Integer.valueOf(this.o);
                int i5 = jdk.k;
                ypeVar2.T("init, samplingRate: %d, numberOfBits: %d, numberOfChannels: %d, bufferSize: %d, encoding: %s", numValueOf, 16, numValueOf2, numValueOf3, roc.o(xkjVar));
                iqaVar.g(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_INITIALIZED);
                this.a.release();
                return;
            case 2:
                if (this.e) {
                    this.y.g(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED);
                    return;
                }
                this.e = true;
                iqa iqaVar2 = this.y;
                if (iqaVar2.u) {
                    iqaVar2.t = -1L;
                }
                iqaVar2.g(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED);
                abnp abnpVarN = xoh.a.n();
                int i6 = this.n;
                abnpVarN.t();
                xoh xohVar = (xoh) abnpVarN.b;
                xohVar.b |= 2;
                xohVar.d = i6;
                if (this.i.e >= 5) {
                    if (this.p) {
                        abnpVarN.t();
                        xoh xohVar2 = (xoh) abnpVarN.b;
                        xohVar2.e = 2;
                        xohVar2.b = 4 | xohVar2.b;
                    }
                    imf imfVar = this.j;
                    int i7 = this.l;
                    MediaOptions mediaOptionsE = iqaVar2.e();
                    xkk xkkVarB = imfVar.b(i7, mediaOptionsE != null ? Boolean.valueOf(mediaOptionsE.a) : null);
                    abnpVarN.t();
                    xoh xohVar3 = (xoh) abnpVarN.b;
                    xkkVarB.getClass();
                    xohVar3.f = xkkVarB;
                    xohVar3.b |= 8;
                }
                ipt iptVar2 = this.u;
                if (iptVar2 != null) {
                    iptVar2.f();
                }
                jch jchVar = iqaVar2.i;
                jchVar.getClass();
                jchVar.G(abnpVarN);
                this.w.set(0);
                xkj xkjVar2 = this.k;
                if (itb.a(xkjVar2)) {
                    ((ype) ((ype) this.h.e()).ai(1138)).u("Starting AAC encoder");
                    this.v.b();
                }
                ivq ivqVar = this.t;
                if (ivqVar != null) {
                    ivqVar.a();
                    this.t = null;
                }
                if (this.s) {
                    this.t = new ivq(this.r, this.l, this.A, xkjVar2);
                    return;
                }
                return;
            case 3:
                boolean z = message.arg1 == 1;
                boolean z2 = message.arg2 == 1;
                boolean z3 = (message.obj instanceof Boolean) && ((Boolean) message.obj).booleanValue();
                iqa iqaVar3 = this.y;
                ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
                abnp abnpVarW = iqaVar3.w();
                abnpVarW.t();
                ouk oukVar = (ouk) abnpVarW.b;
                ouk oukVar2 = ouk.a;
                oukVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
                oukVar.l = z;
                abnpVarW.t();
                ouk oukVar3 = (ouk) abnpVarW.b;
                oukVar3.b |= 1024;
                oukVar3.m = z2;
                int i8 = this.w.get();
                abnpVarW.t();
                ouk oukVar4 = (ouk) abnpVarW.b;
                oukVar4.b |= 2048;
                oukVar4.n = i8;
                int i9 = this.x.get();
                abnpVarW.t();
                ouk oukVar5 = (ouk) abnpVarW.b;
                oukVar5.b = 4096 | oukVar5.b;
                oukVar5.o = i9;
                iqaVar3.x(ouoVar, abnpVarW);
                if (this.e) {
                    if (!z) {
                        if (itb.a(this.k) && !z3) {
                            ((ype) this.h.l().ai(1142)).u("Injecting extra silent buffer into AAC encoder.");
                            ipt iptVar3 = this.d;
                            iptVar3.getClass();
                            ipr iprVarB = iptVar3.b();
                            int iA = iprVarB.a();
                            Arrays.fill(iprVarB.h.array(), iA, iprVarB.b() + iA, (byte) 0);
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iprVarB.b = jElapsedRealtime;
                            iprVarB.a = 1000 * jElapsedRealtime;
                            iprVarB.c = jElapsedRealtime;
                            iptVar3.getClass();
                            iptVar3.e(iprVarB);
                        }
                        h();
                    }
                    jch jchVar2 = iqaVar3.i;
                    jchVar2.getClass();
                    jchVar2.y();
                    yph yphVar = this.h;
                    ((ype) ((ype) yphVar.f()).ai((char) 1139)).w("stopping, captured and queued %d frames since start for stream", this.w.get());
                    this.e = false;
                    ipt iptVar4 = this.d;
                    if (iptVar4 != null) {
                        ((ype) ((ype) yphVar.f()).ai((char) 1141)).u("clearing transmission queue in bottom half");
                        iptVar4.f();
                    }
                    ipt iptVar5 = this.u;
                    if (iptVar5 != null) {
                        ((ype) ((ype) yphVar.f()).ai((char) 1140)).u("clearing encoded buffer queue in bottom half");
                        iptVar5.f();
                    }
                    this.y.i();
                    ivq ivqVar2 = this.t;
                    if (ivqVar2 != null) {
                        ivqVar2.a();
                        this.t = null;
                    }
                }
                this.y.k(z2);
                return;
            case 4:
                if (this.e) {
                    h();
                    return;
                }
                ((ype) this.h.l().ai(1143)).u("stream send requested while stopped");
                this.y.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED);
                ipt iptVar6 = this.d;
                if (iptVar6 != null) {
                    iptVar6.f();
                    return;
                }
                return;
            case 5:
                if (itb.a(this.k)) {
                    isk iskVar2 = this.v;
                    if (iskVar2 != null) {
                        iskVar2.c();
                    }
                    ipt iptVar7 = this.u;
                    if (iptVar7 != null) {
                        iptVar7.f();
                    }
                }
                this.d.f();
                ivq ivqVar3 = this.t;
                if (ivqVar3 != null) {
                    ivqVar3.a();
                    this.t = null;
                    return;
                }
                return;
            case 6:
                CarInfo carInfo = this.i;
                int i10 = carInfo.e;
                if (i10 <= 5 && (i10 != 5 || carInfo.f <= 0)) {
                    ((ype) this.h.l().ai(1144)).u("PDK version less than 5.1. Not sending MediaOptions.");
                    return;
                }
                xkk xkkVar = (xkk) message.obj;
                jch jchVar3 = this.y.i;
                jchVar3.getClass();
                jchVar3.k(32788, xkkVar);
                return;
            default:
                throw new IllegalStateException(a.cc(message, "Unsupported message "));
        }
    }
}
