package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.car.CarAudioConfiguration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class qpl extends Thread implements qpj {
    private final ykd A;
    public final rei a;
    public long b;
    public volatile boolean c;
    public volatile boolean d;
    public volatile rek e;
    private final Context f;
    private final rej g;
    private final rwe h;
    private final qpu i;
    private final ren j;
    private final int k;
    private final String l;
    private final CarAudioConfiguration m;
    private final boolean n;
    private final ruf o;
    private final rwz p;
    private final ypf q;
    private final AtomicInteger r;
    private final AtomicReference s;
    private boolean t;
    private boolean u;
    private final int v;
    private final int w;
    private final qpo x;
    private final int y;
    private final wyd z;

    public qpl(qpo qpoVar, Context context, rej rejVar, rwe rweVar, wyd wydVar, qpu qpuVar, ren renVar, int i, String str, CarAudioConfiguration carAudioConfiguration, boolean z, qrv qrvVar, ruf rufVar, rwz rwzVar, ypf ypfVar, ykd ykdVar, AtomicInteger atomicInteger, AtomicReference atomicReference) {
        super("AudioCapture-".concat(str));
        this.t = false;
        this.b = 0L;
        this.c = false;
        this.d = false;
        this.x = qpoVar;
        this.f = context;
        this.g = rejVar;
        this.h = rweVar;
        this.z = wydVar;
        this.i = qpuVar;
        this.j = renVar;
        this.k = i;
        this.l = str;
        this.m = carAudioConfiguration;
        this.n = z;
        this.o = rufVar;
        this.p = rwzVar;
        this.q = ypfVar;
        this.A = ykdVar;
        this.a = new rei(roc.d(carAudioConfiguration));
        this.r = atomicInteger;
        this.s = atomicReference;
        if (i == 3) {
            this.v = 12;
            this.w = 3;
            this.y = 2;
        } else {
            this.v = 8;
            this.w = 3;
            this.y = carAudioConfiguration.a != 16000 ? 4 : 3;
        }
    }

    private final rfy b(int i, int i2) throws RemoteException {
        boolean zC = spu.c();
        ypf ypfVar = this.q;
        if (zC) {
            ypfVar.f().ai(7541).u("Mixing media and guidance audio on Q+");
            ren renVar = this.j;
            renVar.getClass();
            return renVar.b(i2);
        }
        ypfVar.f().ai(7545).u("Set up fixed volume capture in P and below");
        ren renVar2 = this.j;
        renVar2.getClass();
        renVar2.d();
        rge rgeVarB = roc.b(i, i2);
        AudioManager audioManager = (AudioManager) this.f.getSystemService("audio");
        audioManager.getClass();
        boolean zIsStreamMute = audioManager.isStreamMute(3);
        this.u = zIsStreamMute;
        if (zIsStreamMute) {
            audioManager.adjustStreamVolume(3, 100, 0);
        }
        return rgeVarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca A[Catch: RemoteException -> 0x0134, TryCatch #10 {RemoteException -> 0x0134, blocks: (B:7:0x003e, B:9:0x0042, B:11:0x0046, B:13:0x005b, B:15:0x0071, B:17:0x0077, B:20:0x0090, B:24:0x00c4, B:29:0x00f5, B:32:0x00fa, B:26:0x00ca, B:28:0x00e0, B:33:0x0124, B:21:0x00a5), top: B:207:0x003e, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0 A[Catch: RemoteException -> 0x0134, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x0134, blocks: (B:7:0x003e, B:9:0x0042, B:11:0x0046, B:13:0x005b, B:15:0x0071, B:17:0x0077, B:20:0x0090, B:24:0x00c4, B:29:0x00f5, B:32:0x00fa, B:26:0x00ca, B:28:0x00e0, B:33:0x0124, B:21:0x00a5), top: B:207:0x003e, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124 A[Catch: RemoteException -> 0x0134, TRY_LEAVE, TryCatch #10 {RemoteException -> 0x0134, blocks: (B:7:0x003e, B:9:0x0042, B:11:0x0046, B:13:0x005b, B:15:0x0071, B:17:0x0077, B:20:0x0090, B:24:0x00c4, B:29:0x00f5, B:32:0x00fa, B:26:0x00ca, B:28:0x00e0, B:33:0x0124, B:21:0x00a5), top: B:207:0x003e, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpl.c():void");
    }

    private final void d() {
        int iA;
        if (this.d) {
            ypf ypfVar = this.q;
            if (ypfVar.l().Z() && (iA = this.a.a()) > 0) {
                ypfVar.l().ai(7544).w("system capture Q has entries: %d", iA);
            }
            if (this.t) {
                int i = this.k;
                wyd wydVar = this.z;
                long j = (wydVar.k() && wydVar.h() == 2) ? i == 3 ? 8L : 4L : 0L;
                float f = i == 3 ? 23.4375f : 15.625f;
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.b;
                rei reiVar = this.a;
                long jMin = Math.min(j, (int) (((jElapsedRealtime / 1000.0d) * f) - 0.5d));
                if (reiVar.a() < jMin) {
                    rek rekVar = this.e;
                    rekVar.getClass();
                    for (long jA = jMin - reiVar.a(); jA > 0; jA--) {
                        ajki ajkiVarC = reiVar.c();
                        int iD = ajkiVarC.d();
                        byte[] bArrArray = ((ByteBuffer) ajkiVarC.b).array();
                        for (int i2 = 0; i2 < ajkiVarC.e(); i2++) {
                            bArrArray[iD + i2] = 0;
                        }
                        rekVar.A(ajkiVarC);
                        this.b = SystemClock.elapsedRealtime();
                    }
                }
                this.t = false;
            }
            rei reiVar2 = this.a;
            rek rekVar2 = this.e;
            rekVar2.getClass();
            for (ajki ajkiVarD = reiVar2.d(); ajkiVarD != null; ajkiVarD = reiVar2.d()) {
                rekVar2.A(ajkiVarD);
                this.b = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void a(rfy rfyVar) {
        try {
            rfyVar.c();
        } catch (RemoteException | IOException e) {
            this.p.d(yzz.AUDIO_SERVICE_MIGRATION, yzy.yu);
            this.q.h().p(e).ai(7542).u("Failure stopping and releasing remote audio record; ignoring due to shutdown.");
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws ExecutionException, InterruptedException, TimeoutException, SecurityException, IllegalArgumentException {
        ypf ypfVar = qqv.a;
        try {
            CountDownLatch countDownLatch = qqv.b;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            qqv.a.g().p(e).ai(7648).u("Interrupted waiting for JNI to load");
        }
        Process.setThreadPriority(-19);
        c();
    }
}
