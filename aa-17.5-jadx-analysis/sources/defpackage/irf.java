package defpackage;

import android.os.SystemClock;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.MediaOptions;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class irf implements ipx {
    public final irj a;
    public final ipy b;
    private final CarInfo c;
    private final imf d;
    private final int e;
    private final String f;
    private final int g;
    private final int h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final AtomicInteger j = new AtomicInteger();
    private final AtomicInteger k = new AtomicInteger();
    private final yph l;
    private final iqa m;
    private final iru n;

    public irf(iqa iqaVar, CarInfo carInfo, imf imfVar, iru iruVar, irj irjVar, ipy ipyVar, int i, int i2, int i3) {
        this.m = iqaVar;
        this.c = carInfo;
        this.d = imfVar;
        this.n = iruVar;
        this.a = irjVar;
        this.b = ipyVar;
        this.e = i;
        String strO = roc.O(i);
        this.f = strO;
        this.g = i2;
        this.h = i3;
        this.l = yph.c("CAR.AUDIO.".concat(strO));
    }

    @Override // defpackage.ipx
    public final ipr a() {
        return new ipr(this.h, new ird(0));
    }

    @Override // defpackage.ipx
    public final void b(PrintWriter printWriter) {
        printWriter.println("SynchronousAudioProcessor:");
        printWriter.println("  streamName=".concat(this.f));
        AtomicBoolean atomicBoolean = this.i;
        printWriter.println("  started=" + atomicBoolean.get());
        int i = this.j.get();
        printWriter.println(a.bp(i, "  framesSentSinceStart="));
        boolean z = atomicBoolean.get();
        AtomicInteger atomicInteger = this.k;
        if (z) {
            printWriter.println("  totalFramesSent=" + (atomicInteger.get() + i));
        } else {
            printWriter.println("  totalFramesSent=" + atomicInteger.get());
        }
        printWriter.println("  mediaOptionsOverride=".concat(String.valueOf(String.valueOf(this.m.e()))));
    }

    @Override // defpackage.ipx
    public final void c(ipr iprVar) {
        boolean z = this.i.get();
        iqa iqaVar = this.m;
        if (!z) {
            iqaVar.h(oui.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED);
            return;
        }
        jch jchVar = iqaVar.i;
        if (jchVar == null) {
            ((ype) ((ype) this.l.h()).ai((char) 1234)).u("Endpoint is null, dropping frame.");
            return;
        }
        ByteBuffer byteBuffer = iprVar.h;
        int iB = iprVar.b();
        int iA = iprVar.a();
        if (iB == 0) {
            ((ype) ((ype) this.l.h()).ai((char) 1233)).u("Received buffer with zero dataSize!");
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        iprVar.d = jElapsedRealtime;
        iprVar.e = jElapsedRealtime;
        iprVar.f = jElapsedRealtime;
        byteBuffer.position(iA);
        byteBuffer.limit(iA + iB);
        byteBuffer.position(byteBuffer.limit());
        ipy ipyVar = this.b;
        if (ipyVar != null) {
            ipyVar.b();
        }
        jchVar.E(iprVar.a, new jcn(byteBuffer, null, false), new ire(this, 0));
        iprVar.g = SystemClock.elapsedRealtime();
        this.n.x(iprVar);
        this.j.getAndIncrement();
    }

    @Override // defpackage.ipx
    public final void d() {
        jch jchVar;
        ((ype) ((ype) this.l.f()).ai((char) 1235)).u("Shutting down SynchronousAudioProcessor.");
        if (!this.i.getAndSet(false) || (jchVar = this.m.i) == null) {
            return;
        }
        jchVar.y();
    }

    @Override // defpackage.ipx
    public final void e() {
        if (this.i.getAndSet(true)) {
            ((ype) ((ype) this.l.h()).ai((char) 1237)).u("Audio processor already started.");
            this.m.g(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_ALREADY_STARTED);
            return;
        }
        abnp abnpVarN = xoh.a.n();
        int i = this.g;
        abnpVarN.t();
        xoh xohVar = (xoh) abnpVarN.b;
        xohVar.b |= 2;
        xohVar.d = i;
        if (this.c.e >= 5) {
            abnpVarN.t();
            xoh xohVar2 = (xoh) abnpVarN.b;
            xohVar2.e = 2;
            xohVar2.b |= 4;
            imf imfVar = this.d;
            int i2 = this.e;
            MediaOptions mediaOptionsE = this.m.e();
            xkk xkkVarB = imfVar.b(i2, mediaOptionsE != null ? Boolean.valueOf(mediaOptionsE.a) : null);
            abnpVarN.t();
            xoh xohVar3 = (xoh) abnpVarN.b;
            xkkVarB.getClass();
            xohVar3.f = xkkVarB;
            xohVar3.b |= 8;
        }
        iqa iqaVar = this.m;
        jch jchVar = iqaVar.i;
        if (jchVar != null) {
            jchVar.G(abnpVarN);
            iqaVar.g(ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STARTED);
        } else {
            ((ype) ((ype) this.l.h()).ai((char) 1236)).u("Endpoint is null, cannot start.");
        }
        this.j.set(0);
    }

    @Override // defpackage.ipx
    public final void f(xkk xkkVar) {
        jch jchVar;
        CarInfo carInfo = this.c;
        int i = carInfo.e;
        if ((i > 5 || (i == 5 && carInfo.f > 0)) && (jchVar = this.m.i) != null) {
            jchVar.k(32788, xkkVar);
        }
    }

    @Override // defpackage.ipx
    public final boolean g(boolean z, boolean z2) {
        if (!this.i.getAndSet(false)) {
            return false;
        }
        AtomicInteger atomicInteger = this.k;
        AtomicInteger atomicInteger2 = this.j;
        atomicInteger.addAndGet(atomicInteger2.get());
        iqa iqaVar = this.m;
        ouo ouoVar = ouo.AUDIO_BOTTOM_HALF_TRANSMISSION_HANDLER_STOPPED;
        abnp abnpVarW = iqaVar.w();
        abnpVarW.t();
        ouk oukVar = (ouk) abnpVarW.b;
        ouk oukVar2 = ouk.a;
        oukVar.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        oukVar.l = z;
        abnpVarW.t();
        ouk oukVar3 = (ouk) abnpVarW.b;
        oukVar3.b |= 1024;
        oukVar3.m = z2;
        int i = atomicInteger2.get();
        abnpVarW.t();
        ouk oukVar4 = (ouk) abnpVarW.b;
        oukVar4.b |= 2048;
        oukVar4.n = i;
        int i2 = atomicInteger.get();
        abnpVarW.t();
        ouk oukVar5 = (ouk) abnpVarW.b;
        oukVar5.b |= 4096;
        oukVar5.o = i2;
        iqaVar.x(ouoVar, abnpVarW);
        jch jchVar = iqaVar.i;
        if (jchVar != null) {
            jchVar.y();
        }
        iqaVar.k(z2);
        iqaVar.i();
        return true;
    }
}
