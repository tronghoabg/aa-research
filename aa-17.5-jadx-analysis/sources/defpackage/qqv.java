package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInfo;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class qqv extends qva implements ruu {
    public static CountDownLatch b;
    private static final abrs o;
    private static final abrs p;
    public final SparseArray c = new SparseArray();
    protected final ScheduledExecutorService d;
    final rek[] e;
    public final qqu f;
    protected final Context g;
    public final boolean h;
    public final rzi i;
    public volatile ren j;
    final qpo[] k;
    public final qsb l;
    protected final wyd m;
    private final String q;
    private final qpu r;
    private final rej s;
    private final rwz t;
    private final rwc u;
    private final rwe v;
    private final rfs w;
    private final erb x;
    public static final ypf a = ols.R("CAR.AUDIO");
    private static final yfq n = yfq.o(qsu.c("KIA,,1.0,,,avn_40:HYUNDAI,,1.0,,,avn_40:HYUNDAI,daudio,1.0:KIA,daudio,1.0:SYNC,,1.0"));

    static {
        abnp abnpVarN = abrs.a.n();
        abnpVarN.ai(1);
        abnpVarN.ai(2);
        abnpVarN.ai(4);
        o = (abrs) abnpVarN.q();
        abnp abnpVarN2 = abrs.a.n();
        abnpVarN2.ai(2);
        abnpVarN2.ai(4);
        abnpVarN2.ai(1);
        p = (abrs) abnpVarN2.q();
    }

    public qqv(rej rejVar, rwz rwzVar, rwc rwcVar, rwe rweVar, rfs rfsVar, wyd wydVar, qqu qquVar, erb erbVar, Context context) {
        ypf ypfVar;
        spu spuVar = ssr.a;
        this.d = spu.aE();
        this.k = new qpo[3];
        this.e = new rek[3];
        this.i = new rzi();
        this.s = rejVar;
        this.t = rwzVar;
        this.u = rwcVar;
        this.v = rweVar;
        this.w = rfsVar;
        this.m = wydVar;
        this.f = qquVar;
        this.x = erbVar;
        this.r = ((qqt) qquVar).b;
        this.g = context;
        CarInfo carInfoL = rwcVar.l();
        if (carInfoL == null) {
            ypfVar = a;
            ypfVar.g().ai(7644).u("car info null");
            this.h = false;
        } else {
            boolean zF = qsu.f(n, carInfoL);
            this.h = zF;
            ypf ypfVar2 = a;
            ypfVar2.f().ai(7642).y("force single channel capturing:%b", Boolean.valueOf(zF));
            ypfVar = ypfVar2;
        }
        this.l = new qsb(new qrv(null), new ykd(rwzVar));
        String string = ((qst) rfsVar).b.getString("audio_guidance_sample_rate", "");
        this.q = (string.equals("16000") || string.equals("48000")) ? string : "";
        if (rfsVar.e()) {
            ypfVar.f().ai(7643).u("Clean up existing raw audio data on device");
            File fileB = qsu.b(context);
            ypf ypfVar3 = rlb.a;
            if (fileB == null) {
                rlb.a.g().ai(8179).u("Failed to get directory");
            } else if (fileB.isDirectory()) {
                long jA = adao.a.gu().a();
                File[] fileArrListFiles = fileB.listFiles();
                long length = 0;
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        length += file.length();
                    }
                }
                ypf ypfVar4 = rlb.a;
                ypfVar4.f().ai(8180).R("Directory %s has size (in bytes): %d, clean up limit: %d", fileB.getPath(), Long.valueOf(length), Long.valueOf(jA));
                if (length > jA) {
                    ypfVar4.f().ai(8177).y("Remove all contents from directory: %s", fileB.getPath());
                    File[] fileArrListFiles2 = fileB.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            file2.delete();
                        }
                    }
                }
            } else {
                rlb.a.g().ai(8178).y("File %s is not directory", fileB.getPath());
            }
        }
        if (b == null) {
            b = new CountDownLatch(1);
            spu spuVar2 = ssr.a;
            ExecutorService executorServiceAF = spu.aF(1);
            executorServiceAF.execute(new oyx(5));
            executorServiceAF.shutdown();
        }
    }

    private static boolean i(rwc rwcVar) {
        CarInfo carInfoL = rwcVar.l();
        if (carInfoL == null) {
            return false;
        }
        int i = carInfoL.e;
        int i2 = carInfoL.f;
        if (i <= 1) {
            return i == 1 && i2 > 5;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0220  */
    @Override // defpackage.ruu
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rso a(defpackage.xnz r35) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqv.a(xnz):rso");
    }

    @Override // defpackage.qvb
    public final int b(int i, int i2) {
        this.m.j();
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final int c(int i, int i2) {
        int iD;
        this.m.j();
        SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            ajnt ajntVar = (ajnt) sparseArray.get(i);
            if (ajntVar == null) {
                throw new IllegalStateException("CarNotSupported");
            }
            iD = roc.d(((CarAudioConfiguration[]) ajntVar.b)[i2]);
        }
        return iD;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration d(int i, int i2) {
        this.m.j();
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration f(int i, int i2) {
        CarAudioConfiguration carAudioConfiguration;
        this.m.j();
        SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            ajnt ajntVar = (ajnt) sparseArray.get(i);
            if (ajntVar == null) {
                throw new IllegalStateException("CarNotSupported");
            }
            carAudioConfiguration = ((CarAudioConfiguration[]) ajntVar.b)[i2];
        }
        return carAudioConfiguration;
    }

    @Override // defpackage.qvb
    public final void g(qvn qvnVar) {
        qvnVar.getClass();
        ykd ykdVar = new ykd(qvnVar);
        rzi rziVar = this.i;
        synchronized (rziVar.b) {
            IBinder iBinderAsBinder = qvnVar.asBinder();
            rzh rzhVarA = rziVar.a(iBinderAsBinder);
            if (rzhVarA != null) {
                Object obj = rzhVarA.c;
                if (!ykdVar.equals(obj)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "%s: Can't register listener %s: host is already associated with listener %s", rziVar.c, ykdVar, obj));
                }
            } else {
                rzh rzhVar = new rzh(rziVar, iBinderAsBinder, ykdVar, 0);
                try {
                    iBinderAsBinder.linkToDeath(rzhVar, 0);
                    rziVar.b.add(rzhVar);
                } catch (RemoteException e) {
                    rzi.a.h().p(e).ai(8578).M("%s: RemoteException setting death recipient for listener %s", rziVar.c, ykdVar);
                    a.h().ai(7645).y("Failed to add listener %s", qvnVar);
                    return;
                }
            }
        }
        a.l().ai(7646).y("Added listener %s", qvnVar);
    }

    @Override // defpackage.qvb
    public final void h(qxg qxgVar) {
        a.l().ai(7647).u("Not adding microphone diagnostics listener: feature is disabled");
    }

    @Override // defpackage.qvb
    public final void k(qvn qvnVar) {
        rzi rziVar = this.i;
        CopyOnWriteArrayList copyOnWriteArrayList = rziVar.b;
        synchronized (copyOnWriteArrayList) {
            IBinder iBinderAsBinder = qvnVar.asBinder();
            rzh rzhVarA = rziVar.a(iBinderAsBinder);
            if (rzhVarA != null) {
                copyOnWriteArrayList.remove(rzhVarA);
                iBinderAsBinder.unlinkToDeath(rzhVarA, 0);
            }
        }
        a.l().ai(7659).y("Removed listener %s", qvnVar);
    }

    @Override // defpackage.qvb
    public final void l(qxg qxgVar) {
        a.l().ai(7660).u("Not removing microphone diagnostics listener: feature is disabled");
    }

    @Override // defpackage.qvb
    @ResultIgnorabilityUnspecified
    public final boolean m(long j) throws InterruptedException {
        this.m.j();
        qpx qpxVar = (qpx) this.r;
        if (!qpxVar.i()) {
            return true;
        }
        if (j <= 0) {
            return false;
        }
        long j2 = j / 10;
        for (int i = 0; i < ((int) j2) && qpxVar.i(); i++) {
            try {
                Thread.sleep(10L);
            } catch (InterruptedException unused) {
            }
        }
        return !qpxVar.i();
    }

    @Override // defpackage.qvb
    @ResultIgnorabilityUnspecified
    public final boolean n(long j) {
        this.m.j();
        qpx qpxVar = (qpx) this.r;
        if (qpxVar.i()) {
            qpx.a.d().ai(7606).u("Already silent");
            return true;
        }
        if (j <= 0) {
            return false;
        }
        qpx.a.d().ai(7605).u("Waiting for silence");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qpxVar.k(3, j);
        long jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
        if (jElapsedRealtime2 > 0) {
            qpxVar.k(5, jElapsedRealtime2);
        }
        return qpxVar.i();
    }

    @Override // defpackage.qvb
    public final int[] o() {
        this.m.j();
        return new int[0];
    }

    @Override // defpackage.qvb
    public final int[] p() {
        int[] iArr;
        this.m.j();
        SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            iArr = new int[sparseArray.size()];
            int size = sparseArray.size();
            while (true) {
                size--;
                if (size >= 0) {
                    iArr[size] = ((ajnt) sparseArray.valueAt(size)).a;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] q(int i) {
        this.m.j();
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final CarAudioConfiguration[] r(int i) {
        Object obj;
        this.m.j();
        SparseArray sparseArray = this.c;
        synchronized (sparseArray) {
            ajnt ajntVar = (ajnt) sparseArray.get(i);
            if (ajntVar == null) {
                throw new IllegalStateException("CarNotSupported");
            }
            obj = ajntVar.b;
        }
        return (CarAudioConfiguration[]) obj;
    }

    @Override // defpackage.qvb
    public final qvh s(qve qveVar, int i) {
        this.m.j();
        throw new IllegalStateException("CarNotSupported");
    }

    @Override // defpackage.qvb
    public final qvo t() {
        this.m.j();
        throw new UnsupportedOperationException();
    }
}
