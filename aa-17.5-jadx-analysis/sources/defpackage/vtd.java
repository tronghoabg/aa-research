package defpackage;

import android.app.Activity;
import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class vtd extends vta implements vsa, vqj, vqa {
    volatile vky a;
    public final ackk b;
    public final aezk d;
    public final aezk e;
    public final vsq f;
    public final vsy g;
    public final rob h;
    private final Executor j;
    private final vry k;
    private final xxh l;
    private final vqk m;
    private final vqe n;
    private final aezk s;
    private final xxh t;
    private final aezk u;
    private final aezk v;
    private final rod w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicInteger q = new AtomicInteger();
    private final AtomicBoolean r = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public vtd(wci wciVar, Executor executor, ackk ackkVar, xxh xxhVar, vqk vqkVar, vqe vqeVar, rod rodVar, aezk aezkVar, aezk aezkVar2, aezk aezkVar3, vsq vsqVar, vsy vsyVar, xxh xxhVar2, aezk aezkVar4, aezk aezkVar5, rob robVar) {
        this.b = ackkVar;
        this.l = xxhVar;
        this.m = vqkVar;
        this.n = vqeVar;
        this.w = rodVar;
        this.k = wciVar.d(zfq.a, ackkVar, null);
        this.j = executor;
        this.s = aezkVar;
        this.d = aezkVar2;
        this.e = aezkVar3;
        this.f = vsqVar;
        this.g = vsyVar;
        this.t = xxhVar2;
        this.u = aezkVar4;
        this.v = aezkVar5;
        this.h = robVar;
    }

    private final void s(int i, AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        this.j.execute(new zhk(new vvg(this, atomicInteger, i, 1)));
    }

    @Override // defpackage.vqj
    public final void c(Activity activity) {
        this.j.execute(new zhk(new vtb(this, 2)));
    }

    @Override // defpackage.vqj
    public final void d(Activity activity) {
        this.a = vky.c(null, activity.getClass());
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        this.a = null;
    }

    @Override // defpackage.vqj
    public final void h() {
        ((ynz) ((ynz) vlj.a.e()).ai((char) 9812)).u("onActivityCreated");
        if (this.r.getAndSet(true)) {
            return;
        }
        s(4, this.p);
    }

    @Override // defpackage.vsa
    public final void k() {
        xxh xxhVar = this.l;
        if (xxhVar.f()) {
            ((vtk) ((aezk) xxhVar.b()).a()).a();
        }
        this.m.a(this);
        this.n.a(this);
        s(3, this.o);
        this.j.execute(new zhk(new vtb(this, 0)));
    }

    @Override // defpackage.vta
    public final Thread.UncaughtExceptionHandler l(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new vtc(this, uncaughtExceptionHandler);
    }

    @Override // defpackage.vta
    public final void m() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new vtc(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    @Override // defpackage.vta
    public final void n() {
        s(5, this.q);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:5|(1:7)(1:8)|9|(21:11|(1:13)(2:15|(1:17)(18:18|(4:20|(1:53)(2:23|(1:25)(2:26|(5:28|(7:96|29|93|30|31|106|47)|48|49|(1:51)(1:52))(3:48|49|(0)(0))))|54|(1:58))(0)|89|61|62|(1:64)(1:65)|66|100|(2:71|69)|99|72|(1:77)|102|(2:86|78)|101|(2:82|80)|103|(2:84|85)(1:107)))|14|54|(0)(1:58)|89|61|62|(0)(0)|66|100|(1:69)|99|72|(2:75|77)|102|(1:78)|101|(1:80)|103|(0)(0))(1:59)|60|89|61|62|(0)(0)|66|100|(1:69)|99|72|(0)|102|(1:78)|101|(1:80)|103|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0249, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cf A[PHI: r8 r17
  0x01cf: PHI (r8v2 ajgh) = (r8v1 ajgh), (r8v22 ajgh), (r8v22 ajgh) binds: [B:59:0x01cb, B:55:0x01c3, B:57:0x01c6] A[DONT_GENERATE, DONT_INLINE]
  0x01cf: PHI (r17v1 boolean) = (r17v0 boolean), (r17v11 boolean), (r17v11 boolean) binds: [B:59:0x01cb, B:55:0x01c3, B:57:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9 A[Catch: InterruptedException -> 0x0249, TRY_ENTER, TryCatch #6 {InterruptedException -> 0x0249, blocks: (B:61:0x01d1, B:64:0x01d9, B:66:0x01ea, B:65:0x01e2), top: B:89:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2 A[Catch: InterruptedException -> 0x0249, TryCatch #6 {InterruptedException -> 0x0249, blocks: (B:61:0x01d1, B:64:0x01d9, B:66:0x01ea, B:65:0x01e2), top: B:89:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0258 A[LOOP:0: B:69:0x0250->B:71:0x0258, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028a A[LOOP:2: B:80:0x0282->B:82:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0293 A[LOOP:1: B:78:0x027a->B:86:0x0293, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.ajgh r19, defpackage.vtx r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vtd.o(ajgh, vtx):void");
    }

    public final boolean p() {
        return ((vsr) this.e.a()).b;
    }

    public final zgp q(int i, vso vsoVar) {
        return r(i, vsoVar, vsoVar.a / 100.0f);
    }

    public final zgp r(int i, vso vsoVar, float f) {
        if (!vsoVar.c()) {
            return zgl.a;
        }
        if (!this.w.b(f).a()) {
            return zgl.a;
        }
        vry vryVar = this.k;
        vrt vrtVarA = vru.a();
        abnp abnpVarN = ajgu.a.n();
        abnp abnpVarN2 = ajgr.a.n();
        float f2 = 1.0f / f;
        abnpVarN2.t();
        ajgr ajgrVar = (ajgr) abnpVarN2.b;
        ajgrVar.b |= 2;
        ajgrVar.d = (int) f2;
        abnpVarN2.t();
        ajgr ajgrVar2 = (ajgr) abnpVarN2.b;
        ajgrVar2.c = i - 1;
        ajgrVar2.b |= 1;
        abnpVarN.t();
        ajgu ajguVar = (ajgu) abnpVarN.b;
        ajgr ajgrVar3 = (ajgr) abnpVarN2.q();
        ajgrVar3.getClass();
        ajguVar.A = ajgrVar3;
        ajguVar.b |= 8388608;
        vrtVarA.g((ajgu) abnpVarN.q());
        return vryVar.a(vrtVarA.a());
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.vqj
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.vqa
    public final /* synthetic */ void j(vky vkyVar) {
    }
}
