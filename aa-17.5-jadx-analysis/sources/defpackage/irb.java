package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.car.CarAudioConfiguration;
import com.google.android.gms.car.CarInfo;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class irb implements jbo, irl {
    private static final abrs A;
    private static final abrs B;
    public static final yph a = yph.c("CAR.AUDIO");
    public static final ygr b;
    public static CountDownLatch c;
    private static final abrs z;
    private final iqk C;
    private final itk D;
    private final jes E;
    private final CarInfo F;
    private final ikz G;
    private final jgi H;
    private final irx I;
    private final boolean J;
    private final ipv K;
    public final iqx g;
    public final jfg h;
    public final jev i;
    protected final jew j;
    protected final Context k;
    public final boolean l;
    public final boolean m;
    final boolean n;
    public final imf o;
    public volatile isv q;
    final izj x;
    public final mko y;
    public final SparseArray d = new SparseArray();
    protected final ScheduledExecutorService e = Executors.newScheduledThreadPool(1);
    public final iqc[] v = new iqc[3];
    public final iqb[] f = new iqb[3];
    public final iqa[] w = new iqa[3];
    public final jfm p = new jfm("CarAudioService");
    public int r = 5;
    public boolean s = true;
    public boolean t = true;
    public boolean u = false;

    static {
        abnp abnpVarN = abrs.a.n();
        abnpVarN.ai(1);
        abnpVarN.ai(2);
        abnpVarN.ai(4);
        abrs abrsVar = (abrs) abnpVarN.q();
        z = abrsVar;
        A = abrsVar;
        abnp abnpVarN2 = abrs.a.n();
        abnpVarN2.ai(2);
        abnpVarN2.ai(4);
        abnpVarN2.ai(1);
        B = (abrs) abnpVarN2.q();
        b = ygr.p(3, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    public irb(ipz ipzVar, final jfg jfgVar, jes jesVar, jev jevVar, ikz ikzVar, jew jewVar, iqx iqxVar, itk itkVar, Context context, jgi jgiVar, irx irxVar, imf imfVar) {
        ?? r3;
        this.h = jfgVar;
        this.E = jesVar;
        this.D = itkVar;
        this.i = jevVar;
        this.G = ikzVar;
        this.j = jewVar;
        this.g = iqxVar;
        iqn iqnVar = ((iqw) iqxVar).b;
        this.C = iqnVar;
        this.k = context;
        this.H = jgiVar;
        this.I = irxVar;
        CarInfo carInfoT = jesVar.t();
        this.F = carInfoT;
        carInfoT.getClass();
        this.o = imfVar;
        abru abruVarB = acnd.a.gu().b();
        yph yphVar = kjf.a;
        Stream streamD = tgx.d(new ilq(17), abruVarB);
        int i = yfq.d;
        Collector collector = ycm.a;
        boolean zH = kjf.h(carInfoT, (yfq) streamD.collect(collector));
        this.l = zH;
        yph yphVar2 = a;
        ((ype) ((ype) yphVar2.f()).ai((char) 1206)).y("force single channel capturing:%b", Boolean.valueOf(zH));
        lab labVar = new lab(1 == true ? 1 : 0);
        jfgVar.getClass();
        this.y = new mko(labVar, new irh() { // from class: iqy
            @Override // defpackage.irh
            public final void a(rrc rrcVar) {
                jfgVar.b(rrcVar);
            }
        });
        this.q = c();
        izj izjVar = new izj(this);
        this.x = izjVar;
        int i2 = 17;
        this.K = new ipv(context, iqnVar, itkVar, izjVar, ipzVar, jewVar, jevVar, jesVar, jfgVar, zH, new iqo(2));
        if (ikzVar.l()) {
            ((ype) ((ype) yphVar2.f()).ai((char) 1208)).u("Clean up existing raw audio data on device");
            File fileB = qsu.b(context);
            yph yphVar3 = ivq.a;
            if (fileB == null) {
                ((ype) ((ype) ivq.a.g()).ai((char) 1424)).u("Failed to get directory");
            } else if (fileB.isDirectory()) {
                long jB = acng.b();
                File[] fileArrListFiles = fileB.listFiles();
                long length = 0;
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        length += file.length();
                    }
                }
                yph yphVar4 = ivq.a;
                ((ype) ((ype) yphVar4.f()).ai(1425)).R("Directory %s has size (in bytes): %d, clean up limit: %d", fileB.getPath(), Long.valueOf(length), Long.valueOf(jB));
                if (length > jB) {
                    ((ype) ((ype) yphVar4.f()).ai((char) 1422)).y("Remove all contents from directory: %s", fileB.getPath());
                    File[] fileArrListFiles2 = fileB.listFiles();
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            file2.delete();
                        }
                    }
                }
            } else {
                ((ype) ((ype) ivq.a.g()).ai((char) 1423)).y("File %s is not directory", fileB.getPath());
            }
        }
        if (c == null) {
            c = new CountDownLatch(1);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            r3 = 0;
            executorServiceNewSingleThreadExecutor.execute(new iqz(r3));
            executorServiceNewSingleThreadExecutor.shutdown();
        } else {
            r3 = 0;
        }
        CarInfo carInfo = this.F;
        boolean z2 = (carInfo == null || !kjf.h(carInfo, (yfq) tgx.d(new ilq(i2), acmj.a.gu().l()).collect(collector))) ? r3 : true;
        this.m = z2;
        boolean z3 = this.F.e >= 5 ? true : r3;
        this.J = z3;
        if (!z3) {
            this.n = (!acmx.h() || z2) ? r3 : true;
        } else {
            ((ype) ((ype) yphVar2.f()).ai((char) 1207)).u("Ackless audio enabled for PDK 5.0+");
            this.n = true;
        }
    }

    private static String e(int i) {
        return i != 1 ? i != 2 ? "UNKNOWN" : "WIFI" : "USB";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f  */
    @Override // defpackage.jbo
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.iyw a(defpackage.xnz r32) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irb.a(xnz):iyw");
    }

    @Override // defpackage.irl
    public final void b(qvn qvnVar) {
        this.p.b(qvnVar);
        ((ype) a.l().ai((char) 1227)).y("Removed listener %s", qvnVar);
    }

    public final isv c() {
        iqx iqxVar = this.g;
        iqxVar.getClass();
        jfg jfgVar = this.h;
        jfgVar.getClass();
        return new isv(this.l, ((iso) ((iqw) iqxVar).e).d, this.D, jfgVar);
    }

    public final void d(int i, iqb iqbVar, iqa iqaVar, isv isvVar) {
        int iAc = a.ac(i);
        CarAudioConfiguration carAudioConfiguration = iqbVar.b;
        isvVar.c(i, carAudioConfiguration.a);
        iqc iqcVar = new iqc(iqbVar.a, carAudioConfiguration, isvVar, iqbVar.c, iqbVar.d, iqbVar.i, iqbVar.e, iqbVar.g, iqbVar.h, iqbVar.f);
        this.v[iAc] = iqcVar;
        iqx iqxVar = this.g;
        iqxVar.getClass();
        iqxVar.o(iAc, iqcVar, iqaVar);
    }

    @Override // defpackage.irl
    public final void fn(qvn qvnVar) {
        qvnVar.getClass();
        if (this.p.c(qvnVar, new iwx(qvnVar, 1))) {
            ((ype) a.l().ai((char) 1210)).y("Added listener %s", qvnVar);
        } else {
            ((ype) ((ype) a.h()).ai((char) 1209)).y("Failed to add listener %s", qvnVar);
        }
    }
}
