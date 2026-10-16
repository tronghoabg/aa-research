package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import j$.util.Collection;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class uec implements ucf, uiu, tqu, uct, uba {
    private final rjs A;
    private final qsb B;
    private final qsb C;
    private final uel a;
    private final tqv b;
    private final uiw c;
    private final upr d;
    private final ucm e;
    private final ucy f;
    private final aezk g;
    private ucp h;
    private Runnable i;
    private boolean j;
    private volatile udd k;
    private final vaa l;
    private final vaa m;
    private final AtomicBoolean n;
    private final AtomicBoolean o;
    private final Resources p;
    private ttn q;
    private ttn r;
    private ujk s;
    private int t;
    private boolean u;
    private Map v;
    private int w;
    private final uaj x;
    private uvg y;
    private usy z;

    static {
        abnp abnpVarN = abal.a.n();
        abnp abnpVarN2 = abbw.a.n();
        abnp abnpVarN3 = abbx.a.n();
        abnpVarN3.t();
        abbx abbxVar = (abbx) abnpVarN3.b;
        abbxVar.b |= 1;
        abbxVar.c = 300;
        abnp abnpVarN4 = abam.a.n();
        abnpVarN4.U();
        abnpVarN4.U();
        abnpVarN3.t();
        abbx abbxVar2 = (abbx) abnpVarN3.b;
        abam abamVar = (abam) abnpVarN4.q();
        abamVar.getClass();
        abbxVar2.d = abamVar;
        abbxVar2.b |= 2;
        abnpVarN2.t();
        abbw abbwVar = (abbw) abnpVarN2.b;
        abbx abbxVar3 = (abbx) abnpVarN3.q();
        abbxVar3.getClass();
        abbwVar.g = abbxVar3;
        abbwVar.b |= 2;
        abnpVarN.t();
        abal abalVar = (abal) abnpVarN.b;
        abbw abbwVar2 = (abbw) abnpVarN2.q();
        abbwVar2.getClass();
        abalVar.c = abbwVar2;
        abalVar.b |= 1;
        abnp abnpVarN5 = abev.a.n();
        abnp abnpVarN6 = abex.a.n();
        abnpVarN6.t();
        abex abexVar = (abex) abnpVarN6.b;
        abexVar.b |= 1;
        abexVar.c = 300;
        abnp abnpVarN7 = abam.a.n();
        abnpVarN7.U();
        abnpVarN7.U();
        abnpVarN6.t();
        abex abexVar2 = (abex) abnpVarN6.b;
        abam abamVar2 = (abam) abnpVarN7.q();
        abamVar2.getClass();
        abexVar2.d = abamVar2;
        abexVar2.b |= 2;
        abnpVarN5.t();
        abev abevVar = (abev) abnpVarN5.b;
        abex abexVar3 = (abex) abnpVarN6.q();
        abexVar3.getClass();
        abevVar.d = abexVar3;
        abevVar.b |= 2;
        abnpVarN.t();
        abal abalVar2 = (abal) abnpVarN.b;
        abev abevVar2 = (abev) abnpVarN5.q();
        abevVar2.getClass();
        abalVar2.d = abevVar2;
        abalVar2.b |= 2;
        yfq.q((abal) abnpVarN.q());
    }

    public uec(uel uelVar, aezk aezkVar, uiw uiwVar, upr uprVar, rjs rjsVar, tqv tqvVar, ufe ufeVar, aezk aezkVar2, rjr rjrVar, ucy ucyVar, qsb qsbVar, qsb qsbVar2, ucm ucmVar, Resources resources, uaj uajVar) {
        new HashMap();
        this.z = null;
        this.j = false;
        this.l = new vaa(false);
        this.m = new vaa(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
        this.s = null;
        this.t = -1;
        this.u = false;
        this.v = null;
        this.w = -1;
        this.a = uelVar;
        this.b = tqvVar;
        this.c = uiwVar;
        this.d = uprVar;
        this.A = rjsVar;
        this.f = ucyVar;
        this.B = qsbVar;
        this.C = qsbVar2;
        this.e = ucmVar;
        this.g = aezkVar;
        this.p = resources;
        this.x = uajVar;
        new ucc(ufeVar, aezkVar, aezkVar2);
    }

    private final void J() {
        if (this.u) {
            uiw uiwVar = this.c;
            int i = this.t;
            ujk ujkVar = this.s;
            if (ujkVar == null) {
                ujkVar = ujk.a;
            }
            uel uelVar = this.a;
            if (uiwVar.l(i, ujkVar, uelVar.z)) {
                return;
            }
            int i2 = this.t;
            abnp abnpVarN = abib.a.n();
            abhl abhlVar = abhl.a;
            abnp abnpVarN2 = abhlVar.n();
            abnpVarN2.t();
            abhl abhlVar2 = (abhl) abnpVarN2.b;
            abhlVar2.b |= 1;
            abhlVar2.c = i2;
            abnpVarN.t();
            abib abibVar = (abib) abnpVarN.b;
            abhl abhlVar3 = (abhl) abnpVarN2.q();
            abhlVar3.getClass();
            abibVar.c = abhlVar3;
            abibVar.b |= 1;
            abib abibVar2 = (abib) abnpVarN.q();
            ynz ynzVar = (ynz) ((ynz) uel.a.e()).ai(9290);
            abhl abhlVar4 = abibVar2.c;
            if (abhlVar4 != null) {
                abhlVar = abhlVar4;
            }
            ynzVar.w("[App thread] schedule epoch update %s", abhlVar.c);
            uelVar.i(new txo(uelVar, abibVar2, 15, null));
            this.u = false;
        }
    }

    private final void K(int i) {
        if (this.t != i) {
            this.t = i;
            this.u = true;
        }
        J();
    }

    private final synchronized void L() throws Throwable {
        usz uszVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        try {
            usy usyVar = this.z;
            if (usyVar == null) {
                return;
            }
            boolean zD = usyVar.D();
            usz uszVarP = usyVar.p();
            abnp abnpVarN = abkb.a.n();
            ttn ttnVar = uszVarP.a;
            float f = uszVarP.d;
            float f2 = uszVarP.g;
            int i6 = uszVarP.b;
            int i7 = uszVarP.c;
            ttn ttnVar2 = ttn.a;
            abnp abnpVarN2 = aaig.a.n();
            float f3 = i6 / f;
            int i8 = (int) (i7 / f);
            try {
                if (ttnVar != null) {
                    float f4 = ttnVar.j;
                    toi toiVar = ttnVar.g;
                    i3 = 2;
                    float f5 = ttnVar.l;
                    int i9 = tog.a;
                    i4 = 8;
                    double radians = Math.toRadians(f4) / 2.0d;
                    double d = toiVar.a;
                    double radians2 = Math.toRadians(d);
                    double dTan = 1.0d / Math.tan(radians);
                    i5 = 1;
                    uszVar = uszVarP;
                    i2 = i7;
                    double dPow = (((dTan * (6.283185307179586d / (Math.pow(2.0d, f5) * 256.0d))) * i8) / 2.0d) * 6371010.0d * Math.cos(radians2);
                    abnp abnpVarN3 = aaih.a.n();
                    abnpVarN3.t();
                    aaih aaihVar = (aaih) abnpVarN3.b;
                    i = i6;
                    aaihVar.b |= 2;
                    aaihVar.d = d;
                    abnpVarN3.t();
                    aaih aaihVar2 = (aaih) abnpVarN3.b;
                    aaihVar2.b |= 1;
                    aaihVar2.c = toiVar.b;
                    abnpVarN3.t();
                    aaih aaihVar3 = (aaih) abnpVarN3.b;
                    aaihVar3.b |= 4;
                    aaihVar3.e = dPow;
                    abnpVarN2.t();
                    aaig aaigVar = (aaig) abnpVarN2.b;
                    aaih aaihVar4 = (aaih) abnpVarN3.q();
                    aaihVar4.getClass();
                    aaigVar.c = aaihVar4;
                    aaigVar.b |= 1;
                    abnp abnpVarN4 = aaij.a.n();
                    abnpVarN4.t();
                    aaij aaijVar = (aaij) abnpVarN4.b;
                    aaijVar.b |= 1;
                    aaijVar.c = ttnVar.n;
                    abnpVarN4.t();
                    aaij aaijVar2 = (aaij) abnpVarN4.b;
                    aaijVar2.b |= 2;
                    aaijVar2.d = ttnVar.m;
                    abnpVarN4.t();
                    aaij aaijVar3 = (aaij) abnpVarN4.b;
                    aaijVar3.b |= 4;
                    aaijVar3.e = BitmapDescriptorFactory.HUE_RED;
                    abnpVarN2.t();
                    aaig aaigVar2 = (aaig) abnpVarN2.b;
                    aaij aaijVar4 = (aaij) abnpVarN4.q();
                    aaijVar4.getClass();
                    aaigVar2.d = aaijVar4;
                    aaigVar2.b |= 2;
                    tto ttoVar = tto.a;
                    tto ttoVar2 = ttnVar.o;
                    if (!ttoVar.equals(ttoVar2)) {
                        abnp abnpVarN5 = aaii.a.n();
                        float f6 = ttoVar2.b;
                        abnpVarN5.t();
                        aaii aaiiVar = (aaii) abnpVarN5.b;
                        aaiiVar.b |= 1;
                        aaiiVar.c = f6;
                        float f7 = ttoVar2.c;
                        abnpVarN5.t();
                        aaii aaiiVar2 = (aaii) abnpVarN5.b;
                        aaiiVar2.b |= 2;
                        aaiiVar2.d = f7;
                        abnpVarN2.t();
                        aaig aaigVar3 = (aaig) abnpVarN2.b;
                        aaii aaiiVar3 = (aaii) abnpVarN5.q();
                        aaiiVar3.getClass();
                        aaigVar3.g = aaiiVar3;
                        aaigVar3.b |= 32;
                    }
                    abnpVarN2.t();
                    aaig aaigVar4 = (aaig) abnpVarN2.b;
                    aaigVar4.b |= 8;
                    aaigVar4.f = f4;
                } else {
                    uszVar = uszVarP;
                    i = i6;
                    i2 = i7;
                    i3 = 2;
                    i4 = 8;
                    i5 = 1;
                    abnpVarN2.t();
                    aaig aaigVar5 = (aaig) abnpVarN2.b;
                    aaigVar5.b |= 8;
                    aaigVar5.f = f2;
                }
                abnp abnpVarN6 = aaik.a.n();
                abnpVarN6.t();
                aaik aaikVar = (aaik) abnpVarN6.b;
                aaikVar.b |= 1;
                aaikVar.c = (int) f3;
                abnpVarN6.t();
                aaik aaikVar2 = (aaik) abnpVarN6.b;
                aaikVar2.b |= 2;
                aaikVar2.d = i8;
                abnpVarN2.t();
                aaig aaigVar6 = (aaig) abnpVarN2.b;
                aaik aaikVar3 = (aaik) abnpVarN6.q();
                aaikVar3.getClass();
                aaigVar6.e = aaikVar3;
                aaigVar6.b |= 4;
                aaig aaigVar7 = (aaig) abnpVarN2.q();
                abnpVarN.t();
                abkb abkbVar = (abkb) abnpVarN.b;
                aaigVar7.getClass();
                abkbVar.c = aaigVar7;
                abkbVar.b |= 1;
                float f8 = ttnVar.l;
                abnpVarN.t();
                abkb abkbVar2 = (abkb) abnpVarN.b;
                abkbVar2.b |= 4;
                abkbVar2.e = f8;
                abnpVarN.t();
                abkb abkbVar3 = (abkb) abnpVarN.b;
                abkbVar3.b |= 8;
                abkbVar3.f = zD;
                abnp abnpVarN7 = abhp.a.n();
                abnpVarN7.t();
                abhp abhpVar = (abhp) abnpVarN7.b;
                abhpVar.n = 3;
                abhpVar.b |= 32768;
                abnpVarN7.t();
                abhp abhpVar2 = (abhp) abnpVarN7.b;
                abhpVar2.o = aclh.c(3);
                abhpVar2.b |= 65536;
                abnpVarN7.t();
                abhp abhpVar3 = (abhp) abnpVarN7.b;
                abhpVar3.b |= 1;
                abhpVar3.c = i;
                abnpVarN7.t();
                abhp abhpVar4 = (abhp) abnpVarN7.b;
                abhpVar4.b |= 2;
                abhpVar4.d = i2;
                usz uszVar2 = uszVar;
                int i10 = uszVar2.k;
                int i11 = uszVar2.h;
                abnpVarN7.t();
                abhp abhpVar5 = (abhp) abnpVarN7.b;
                abhpVar5.b |= 4;
                abhpVar5.e = i10 - i11;
                int i12 = uszVar2.l;
                int i13 = uszVar2.i;
                abnpVarN7.t();
                abhp abhpVar6 = (abhp) abnpVarN7.b;
                abhpVar6.b |= 8;
                abhpVar6.f = i12 - i13;
                int i14 = uszVar2.m;
                abnpVarN7.t();
                abhp abhpVar7 = (abhp) abnpVarN7.b;
                abhpVar7.b |= 16;
                abhpVar7.g = i14;
                double d2 = i11;
                abnpVarN7.t();
                abhp abhpVar8 = (abhp) abnpVarN7.b;
                abhpVar8.b |= 32;
                abhpVar8.h = d2;
                abnpVarN7.t();
                abhp abhpVar9 = (abhp) abnpVarN7.b;
                abhpVar9.b |= 64;
                abhpVar9.i = i13;
                double d3 = uszVar2.j;
                abnpVarN7.t();
                abhp abhpVar10 = (abhp) abnpVarN7.b;
                abhpVar10.b |= 128;
                abhpVar10.j = d3;
                abnpVarN7.t();
                abhp abhpVar11 = (abhp) abnpVarN7.b;
                abhpVar11.b |= 16384;
                abhpVar11.m = f;
                float[] fArr = new float[16];
                System.arraycopy(uszVar2.x, 0, fArr, 0, 16);
                float f9 = i14;
                fArr[12] = fArr[12] / f9;
                fArr[13] = fArr[13] / f9;
                fArr[14] = fArr[14] / f9;
                fArr[15] = fArr[15] / f9;
                float[] fArr2 = new float[16];
                Matrix.invertM(fArr2, 0, fArr, 0);
                for (int i15 = 0; i15 < 16; i15++) {
                    double d4 = fArr[i15];
                    abnpVarN7.t();
                    abhp abhpVar12 = (abhp) abnpVarN7.b;
                    abny abnyVar = abhpVar12.l;
                    if (!abnyVar.c()) {
                        abhpVar12.l = abnv.E(abnyVar);
                    }
                    abhpVar12.l.g(d4);
                    double d5 = fArr2[i15];
                    abnpVarN7.t();
                    abhp abhpVar13 = (abhp) abnpVarN7.b;
                    abny abnyVar2 = abhpVar13.k;
                    if (!abnyVar2.c()) {
                        abhpVar13.k = abnv.E(abnyVar2);
                    }
                    abhpVar13.k.g(d5);
                }
                abhp abhpVar14 = (abhp) abnpVarN7.q();
                abnpVarN.t();
                abkb abkbVar4 = (abkb) abnpVarN.b;
                abhpVar14.getClass();
                abkbVar4.d = abhpVar14;
                abkbVar4.b |= 2;
                abnpVarN.t();
                abkb abkbVar5 = (abkb) abnpVarN.b;
                abkbVar5.g = i5;
                abkbVar5.b |= 32;
                if (this.o.get()) {
                    abnpVarN.t();
                    abkb abkbVar6 = (abkb) abnpVarN.b;
                    abkbVar6.h = aclh.g(3);
                    abkbVar6.b |= 128;
                } else {
                    abnpVarN.t();
                    abkb abkbVar7 = (abkb) abnpVarN.b;
                    abkbVar7.h = aclh.g(i3);
                    abkbVar7.b |= 128;
                }
                if (c() != null) {
                    boolean z = c().f;
                }
                uel uelVar = this.a;
                abkb abkbVar8 = (abkb) abnpVarN.q();
                ((ynz) ((ynz) uel.a.e()).ai((char) 9294)).u("[App thread] schedule viewport update");
                synchronized (uelVar) {
                    uelVar.u++;
                }
                uelVar.i(new txo(uelVar, abkbVar8, i4, null));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void M(ujk ujkVar, int i) {
        uel uelVar = this.a;
        byte[] bArr = null;
        uelVar.i(new txo(uelVar, ujkVar, 14, bArr));
        abnp abnpVarN = abjs.a.n();
        abnpVarN.t();
        abjs abjsVar = (abjs) abnpVarN.b;
        abjsVar.b = 1;
        abjsVar.c = Integer.valueOf(i);
        abjs abjsVar2 = (abjs) abnpVarN.q();
        ((ynz) ((ynz) uel.a.e()).ai(9292)).w("[App thread] schedule style update %s", abjsVar2.b == 1 ? ((Integer) abjsVar2.c).intValue() : 0);
        synchronized (uelVar) {
            uelVar.u++;
        }
        uelVar.i(new txo(uelVar, abjsVar2, 12, bArr));
    }

    private final void N(ujk ujkVar) {
        if (this.s != ujkVar) {
            this.s = ujkVar;
            M(ujkVar, this.a.a(ujkVar, true));
        }
    }

    @Override // defpackage.ucf
    public final void A(ufs ufsVar) {
        Set set = this.a.r;
        synchronized (set) {
            set.add(ufsVar);
        }
    }

    @Override // defpackage.ucf
    public final void B(ufs ufsVar) {
        Set set = this.a.r;
        synchronized (set) {
            set.remove(ufsVar);
        }
    }

    @Override // defpackage.ucf
    public final void C(uqm uqmVar) {
        this.a.A = uqmVar;
    }

    @Override // defpackage.ucf
    public final synchronized void E(uvg uvgVar, usy usyVar) throws Throwable {
        aezk aezkVar;
        tqv tqvVar;
        try {
            if (this.j) {
                return;
            }
            qsb qsbVar = this.B;
            qsb qsbVar2 = this.C;
            ucy ucyVar = this.f;
            tqv tqvVar2 = this.b;
            aezk aezkVar2 = this.g;
            aezkVar2.a();
            try {
                this.k = new udd(usyVar, uvgVar, qsbVar, qsbVar2, ucyVar, this.l, this.m, this, this);
                int i = 0;
                this.k.b = false;
                this.k.c = false;
                uvgVar.H = this.k;
                this.h = new ucp(uvgVar, aezkVar2);
                final uel uelVar = this.a;
                uiw uiwVar = this.c;
                upr uprVar = this.d;
                rjs rjsVar = this.A;
                udd uddVar = this.k;
                ucp ucpVar = this.h;
                ucm ucmVar = this.e;
                Resources resources = this.p;
                uaj uajVar = this.x;
                Object objA = aezkVar2.a();
                if (uelVar.p == null) {
                    aezkVar = aezkVar2;
                    tqvVar = tqvVar2;
                    uelVar.p = new ueg(uelVar, uiwVar, uprVar, rjsVar, new Paint(), uddVar, ucpVar, ucyVar, ucmVar, resources);
                } else {
                    aezkVar = aezkVar2;
                    tqvVar = tqvVar2;
                }
                if (uelVar.i == null) {
                    uelVar.i = new SharedLabelerJni(uelVar, (tra) objA, uajVar);
                }
                uelVar.h.r(uelVar.g.submit(new Callable() { // from class: uei
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        yob yobVar;
                        boolean z;
                        abjo abjoVar;
                        uel uelVar2 = uelVar;
                        try {
                            yobVar = uel.a;
                            ((ynz) ((ynz) yobVar.e()).ai((char) 9300)).u("[Labeler thread] Started");
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new AssertionError();
                        }
                        while (true) {
                            Object obj = uelVar2.b;
                            synchronized (obj) {
                                while (true) {
                                    if ((!uelVar2.c && uelVar2.d) || uelVar2.e) {
                                        break;
                                    }
                                    ((ynz) ((ynz) yobVar.e()).ai(9316)).y("[Labeler thread] Wait, because %s", uelVar2.c ? "paused" : "idle");
                                    obj.wait();
                                }
                                if (uelVar2.e) {
                                    yob yobVar2 = uel.a;
                                    ((ynz) ((ynz) yobVar2.e()).ai(9315)).u("[Labeler thread] Don't wait, shutdown requested");
                                    ((ynz) ((ynz) yobVar2.e()).ai((char) 9301)).u("[Labeler thread] Shutdown complete");
                                    SharedLabelerJni sharedLabelerJni = uelVar2.i;
                                    sharedLabelerJni.getClass();
                                    sharedLabelerJni.b();
                                    return null;
                                }
                                if (uelVar2.d) {
                                    ((ynz) ((ynz) yobVar.e()).ai(9314)).u("[Labeler thread] Don't wait, because work is pending");
                                    uelVar2.d = false;
                                }
                                Thread.currentThread().interrupt();
                                throw new AssertionError();
                            }
                            synchronized (uelVar2) {
                                uelVar2.v = true;
                            }
                            ((ynz) ((ynz) yobVar.e()).ai((char) 9302)).u("[Labeler thread] Run tasks");
                            while (true) {
                                Runnable runnable = (Runnable) uelVar2.q.poll();
                                if (runnable == null) {
                                    break;
                                }
                                vaq.d();
                                runnable.run();
                                Thread.currentThread().interrupt();
                                throw new AssertionError();
                            }
                            if (uelVar2.f) {
                                uelVar2.f = false;
                                SharedLabelerJni sharedLabelerJni2 = uelVar2.i;
                                sharedLabelerJni2.getClass();
                                sharedLabelerJni2.nativeReportMajorLabelingInputChangeEvent(sharedLabelerJni2.b);
                            }
                            SharedLabelerJni sharedLabelerJni3 = uelVar2.i;
                            sharedLabelerJni3.getClass();
                            Iterator it = uelVar2.j.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                uda udaVar = (uda) it.next();
                                if (udaVar instanceof ueo) {
                                    ueo ueoVar = (ueo) udaVar;
                                    if (ueoVar.a() != abgl.GMM_INDOOR && ueoVar.a() != abgl.GMM_SPOTLIT && ueoVar.f()) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            try {
                                abjoVar = (abjo) abnv.B(abjo.a, sharedLabelerJni3.nativeRunTasks(sharedLabelerJni3.b, z), abnj.a());
                            } catch (abon e) {
                                ((ynz) ((ynz) ((ynz) SharedLabelerJni.a.h()).p(e)).ai((char) 9328)).u("Unable to parse RunTasksResponse");
                                abjoVar = abjo.a;
                            }
                            synchronized (uelVar2) {
                                int iAt = a.at(abjoVar.c);
                                if (iAt == 0) {
                                    iAt = 1;
                                }
                                uelVar2.C = iAt;
                            }
                            long j = abjoVar.b;
                            if (j >= 0) {
                                ((ynz) ((ynz) uel.a.e()).ai(9303)).x("[Labeler thread] Waiting %d ms before running tasks", j);
                                Object obj2 = uelVar2.b;
                                synchronized (obj2) {
                                    if (j > 0) {
                                        obj2.wait(j);
                                    }
                                    uelVar2.d = true;
                                }
                            }
                            synchronized (uelVar2) {
                                uelVar2.v = false;
                            }
                        }
                    }
                }));
                ((ynz) ((ynz) uel.a.e()).ai((char) 9298)).u("[App thread] Resume labeler");
                Object obj = uelVar.b;
                synchronized (obj) {
                    uelVar.d = true;
                    uelVar.c = false;
                    obj.notifyAll();
                }
                ((ynz) ((ynz) uel.a.e()).ai(9293)).y("[App thread] schedule update annotation experiment ids %s", ((tra) aezkVar.a()).a);
                uelVar.i(new ueh(uelVar, i));
                tqvVar.d(this);
                uiwVar.c(this);
                txo txoVar = new txo(this, usyVar, 6, null);
                this.i = txoVar;
                this.y = uvgVar;
                uvgVar.e(txoVar);
                this.j = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.Set] */
    @Override // defpackage.ucf
    public final zdh G(uda udaVar, rfe rfeVar) {
        vat vatVar = uqb.c;
        uel uelVar = this.a;
        uaj uajVar = uelVar.B;
        if (uajVar != null && uajVar.d()) {
            ?? r0 = rfeVar.g;
            if (!r0.isEmpty()) {
                int[] array = Collection.EL.stream(r0).mapToInt(new mim(11)).toArray();
                r0.clear();
                SharedLabelerJni sharedLabelerJni = uelVar.i;
                sharedLabelerJni.getClass();
                sharedLabelerJni.nativeAddLabelTags(sharedLabelerJni.b, array);
            }
        }
        return uel.n(udaVar) ? uelVar.r(udaVar, rfeVar) : uelVar.q(udaVar, rfeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uct
    public final void H(ygr ygrVar) {
        yfq yfqVarO;
        Set set = this.a.r;
        synchronized (set) {
            yfqVarO = yfq.o(set);
        }
        int size = yfqVarO.size();
        for (int i = 0; i < size; i++) {
            ((ufs) yfqVarO.get(i)).z(ygrVar);
        }
    }

    public final synchronized void I(usy usyVar) {
        usz uszVarP = usyVar.p();
        ttn ttnVar = uszVarP.a;
        usy usyVar2 = this.z;
        ttn ttnVar2 = usyVar2 == null ? null : usyVar2.p().a;
        if (ttnVar.equals(this.r)) {
            this.r.equals(this.q);
        }
        this.g.a();
        int i = uszVarP.c;
        if (qrv.E(ttnVar2, ttnVar, i, uszVarP.d)) {
            this.z = new usy(usyVar);
            L();
        }
        this.q = this.r;
        this.r = ttnVar;
        this.f.l = new uev(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, uszVarP.b, i);
    }

    @Override // defpackage.upw
    public final void a(upy upyVar) {
        if (!upyVar.l() || upyVar.c() == null) {
            return;
        }
        v();
    }

    @Override // defpackage.ucf
    public final ueu c() {
        return (ueu) this.a.o.get();
    }

    @Override // defpackage.ucf
    public final uzy d() {
        return this.a.x.a;
    }

    @Override // defpackage.ucf
    public final void f(trz trzVar) {
        this.a.b(trzVar);
    }

    @Override // defpackage.ucf
    public final void g(tqj tqjVar) {
        this.f.c(tqjVar);
    }

    @Override // defpackage.tqu
    public final void gq(abgx abgxVar, int i) {
        synchronized (this) {
            N(ujk.a(abgxVar));
            K(i);
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        printWriter.println(str.concat("SharedLabelerControllerImpl:"));
        uek uekVar = this.a.w;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - uekVar.e;
        printWriter.println(str.concat(" total/placed/removed"));
        printWriter.println(str + " " + uekVar.a + " / " + uekVar.b + " / " + uekVar.c);
        printWriter.println(str.concat(" last pass duration/time since"));
        printWriter.println(str + " " + Duration.ofNanos(uekVar.d).toMillis() + " / " + jElapsedRealtime);
    }

    @Override // defpackage.ucf
    public final void h(uda udaVar) {
        ((ynz) ((ynz) uel.a.e()).ai((char) 9269)).y("[App thread] added addLabelSource[%s]", uel.p(udaVar));
        uel uelVar = this.a;
        if (uel.n(udaVar)) {
            uelVar.j.putIfAbsent(udaVar, new HashMap());
            uelVar.l(udaVar);
        } else {
            uelVar.k.putIfAbsent(udaVar, zdh.a);
        }
        udaVar.gr(this);
    }

    @Override // defpackage.ucf
    public final void i(abcw abcwVar, trt trtVar) {
        ((ynz) ((ynz) uel.a.e()).ai(9270)).x("[App thread] added addLabelingHint[%d] to pending work queue", trtVar.a);
        uel uelVar = this.a;
        synchronized (uelVar) {
            uelVar.u++;
        }
        uelVar.i(new rdz(uelVar, trtVar, abcwVar, 11, (char[]) null));
    }

    @Override // defpackage.ucf
    public final synchronized void k() {
        uvg uvgVar;
        ((ynz) ((ynz) uel.a.e()).ai((char) 9271)).u("[App thread] Destroy labeler");
        uel uelVar = this.a;
        uelVar.q.clear();
        Object obj = uelVar.b;
        synchronized (obj) {
            uelVar.d = false;
            uelVar.e = true;
            obj.notifyAll();
        }
        ucp ucpVar = this.h;
        if (ucpVar != null) {
            ucpVar.b();
        }
        this.b.g(this);
        this.c.i(this);
        Runnable runnable = this.i;
        if (runnable == null || (uvgVar = this.y) == null) {
            return;
        }
        uvgVar.j(runnable);
    }

    @Override // defpackage.ucf
    public final void l() {
        uel uelVar = this.a;
        Iterator it = uelVar.k.keySet().iterator();
        while (it.hasNext()) {
            uelVar.l((uda) it.next());
        }
    }

    @Override // defpackage.ucf
    public final void m(uda udaVar) {
        this.a.l(udaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:30:0x004f, B:31:0x0052, B:6:0x0007, B:8:0x0017, B:17:0x002b, B:20:0x0031, B:22:0x0035, B:23:0x0037, B:15:0x0025, B:25:0x0041, B:29:0x004d, B:28:0x0049), top: B:36:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:3:0x0001, B:30:0x004f, B:31:0x0052, B:6:0x0007, B:8:0x0017, B:17:0x002b, B:20:0x0031, B:22:0x0035, B:23:0x0037, B:15:0x0025, B:25:0x0041, B:29:0x004d, B:28:0x0049), top: B:36:0x0001 }] */
    @Override // defpackage.ucf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.t     // Catch: java.lang.Throwable -> L54
            r1 = -1
            if (r0 != r1) goto L7
            goto L4f
        L7:
            uiw r1 = r5.c     // Catch: java.lang.Throwable -> L54
            uel r2 = r5.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = r2.z     // Catch: java.lang.Throwable -> L54
            java.util.Map r0 = r1.a(r0, r3)     // Catch: java.lang.Throwable -> L54
            int r1 = r5.w     // Catch: java.lang.Throwable -> L54
            int r3 = r5.t     // Catch: java.lang.Throwable -> L54
            if (r1 != r3) goto L41
            java.util.Map r1 = r5.v     // Catch: java.lang.Throwable -> L54
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L22
            if (r0 == 0) goto L20
            goto L2b
        L20:
            r4 = r3
            goto L2b
        L22:
            if (r0 != 0) goto L25
            goto L2b
        L25:
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L20
        L2b:
            java.util.Map r1 = r5.v     // Catch: java.lang.Throwable -> L54
            if (r1 == 0) goto L3f
            if (r4 == 0) goto L4f
            ujk r1 = r5.s     // Catch: java.lang.Throwable -> L54
            if (r1 != 0) goto L37
            ujk r1 = defpackage.ujk.a     // Catch: java.lang.Throwable -> L54
        L37:
            int r2 = r2.a(r1, r3)     // Catch: java.lang.Throwable -> L54
            r5.M(r1, r2)     // Catch: java.lang.Throwable -> L54
            goto L41
        L3f:
            if (r4 == 0) goto L4f
        L41:
            int r1 = r5.t     // Catch: java.lang.Throwable -> L54
            r5.w = r1     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L49
            r0 = 0
            goto L4d
        L49:
            yfy r0 = defpackage.yfy.j(r0)     // Catch: java.lang.Throwable -> L54
        L4d:
            r5.v = r0     // Catch: java.lang.Throwable -> L54
        L4f:
            r5.J()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            return
        L54:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uec.n():void");
    }

    @Override // defpackage.ucf
    public final void o(Runnable runnable, Executor executor) {
        boolean z;
        int i;
        uel uelVar = this.a;
        synchronized (uelVar) {
            z = false;
            if (uelVar.u == 0 && !uelVar.v && (i = uelVar.C) != 5 && i != 3) {
                z = true;
            }
        }
        if (z) {
            runnable.run();
            return;
        }
        synchronized (uelVar) {
            if (uelVar.u != 0) {
                uelVar.t.add(new rjs(runnable, executor));
            } else {
                uelVar.s.add(new rjs(runnable, executor));
            }
        }
    }

    @Override // defpackage.ucf
    public final void q(trz trzVar) {
        this.a.c(trzVar);
    }

    @Override // defpackage.ucf
    public final void r(uda udaVar) {
        ((ynz) ((ynz) uel.a.e()).ai((char) 9283)).y("[App thread] added removeLabelSource[%s] to pending work queue", uel.p(udaVar));
        uel uelVar = this.a;
        synchronized (uelVar) {
            uelVar.u++;
        }
        uelVar.i(new txo(uelVar, udaVar, 7));
        udaVar.c(this);
    }

    @Override // defpackage.ucf
    public final void s(trt trtVar) {
        ((ynz) ((ynz) uel.a.e()).ai(9284)).x("[App thread] added removeLabelingHint[%d] to pending work queue", trtVar.a);
        uel uelVar = this.a;
        synchronized (uelVar) {
            uelVar.u++;
        }
        uelVar.i(new txo(uelVar, trtVar, 11));
    }

    @Override // defpackage.uiu
    public final void t(int i) {
        synchronized (this) {
            K(i);
        }
    }

    @Override // defpackage.ucf
    public final void u(uda udaVar, uda udaVar2) {
        r(udaVar);
        h(udaVar2);
    }

    @Override // defpackage.ucf
    public final void v() {
        if (this.n.get()) {
            return;
        }
        this.a.e();
    }

    @Override // defpackage.ucf
    public final void w(Runnable runnable) {
        this.a.h(runnable);
    }

    @Override // defpackage.ucf
    public final void x(ueu ueuVar) {
        uel uelVar = this.a;
        AtomicReference atomicReference = uelVar.o;
        if (atomicReference.get() != ueuVar) {
            atomicReference.set(ueuVar);
            synchronized (uelVar) {
                uelVar.u++;
            }
            uelVar.i(new ueh(uelVar, 3));
        }
    }

    @Override // defpackage.ucf
    public final void y(ujk ujkVar) {
        synchronized (this) {
            N(ujkVar);
        }
    }

    @Override // defpackage.ucf
    public final boolean z() {
        boolean z;
        boolean z2;
        if (this.k != null && !this.k.k()) {
            return false;
        }
        uel uelVar = this.a;
        synchronized (uelVar) {
            int i = uelVar.C;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                z = false;
            } else {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            throw new RuntimeException(null, null);
                        }
                    }
                    z = false;
                }
                z = true;
            }
            z2 = uelVar.v;
        }
        synchronized (uelVar.b) {
            if (!uelVar.d && !z2 && !z) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.ucf
    public final void D() {
    }

    @Override // defpackage.ucf
    public final void F() {
    }

    @Override // defpackage.ucf
    public final void j() {
    }

    @Override // defpackage.ucf
    public final void e(tqg tqgVar) {
    }

    @Override // defpackage.ucf
    public final void p(tqg tqgVar) {
    }
}
