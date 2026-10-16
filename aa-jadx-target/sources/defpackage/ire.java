package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ire implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public ire(defpackage.irf irfVar, int i) {
        this.b = i;
        this.a = irfVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: jfw */
    /* JADX WARN: Type inference failed for: r9v34, types: [ivo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v54, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() throws jfw {
        defpackage.jik jikVarB;
        int i = 5;
        int i2 = 2;
        boolean z = true;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = defpackage.irf.a;
                ((defpackage.yqj) yqmVar.l().ai((char) 1148)).u("Running focusReleaseRunnable");
                defpackage.irf irfVar = (defpackage.irf) this.a;
                defpackage.ist istVar = irfVar.e;
                istVar.getClass();
                if (istVar.c()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 1151)).u("App on MD has audio focus, so not waiting for MEDIA stream to stop.");
                    return;
                }
                defpackage.iqu iquVar = irfVar.b;
                iquVar.g(3, true);
                if (istVar.c()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 1150)).u("App on MD has audio focus, so not waiting for TTS stream to stop.");
                    return;
                }
                iquVar.g(5, true);
                if (istVar.c()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 1149)).u("App on MD has audio focus, so not requesting to release focus to HU.");
                    return;
                }
                defpackage.ird irdVar = irfVar.m;
                irdVar.getClass();
                irdVar.d();
                return;
            case 1:
                java.lang.Object obj = this.a;
                defpackage.irf irfVar2 = (defpackage.irf) obj;
                if (irfVar2.k.get()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.irf.a.f()).ai((char) 1192)).u("Send GAIN focus request to HU to recover from transient loss");
                    irfVar2.m(1);
                    defpackage.ird irdVar2 = irfVar2.m;
                    irdVar2.getClass();
                    irdVar2.postDelayed(new defpackage.iqv(obj, i), 1000L);
                    irfVar2.g.b(defpackage.zbd.zo);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.iro iroVar = (defpackage.iro) this.a;
                if (iroVar.g) {
                    ((defpackage.yqj) defpackage.iro.a.l().ai((char) 1243)).u("stopping ASR.");
                    iroVar.b.p(2);
                    iroVar.g = false;
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.isc) this.a).y();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.isn) this.a).d();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.isw iswVar = (defpackage.isw) this.a;
                android.os.Handler handler = iswVar.c;
                if (handler == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.isw.a.h()).ai((char) 1305)).u("Skip requesting initial focus because focus manager has stopped");
                    return;
                }
                defpackage.yqm yqmVar2 = defpackage.isw.a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 1302)).u("Requesting initial Android audio focus");
                int iD = iswVar.d(1, new android.media.AudioAttributes.Builder().setUsage(0).setContentType(0).build());
                if (iD == 0) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.g()).ai((char) 1304)).u("Got unexpected AUDIOFOCUS_REQUEST_FAILED");
                } else if (iD == 1) {
                    iswVar.b.k();
                } else if (iD != 2) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar2.g()).ai((char) 1303)).w("Unrecognized focus hint in doRequestInitialAndroidFocus: %d", iD);
                }
                iswVar.d.c = handler;
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj2 = this.a;
                synchronized (obj2) {
                    if (((defpackage.iuz) obj2).d) {
                        ((defpackage.iuz) obj2).a.n(((defpackage.iuz) obj2).e);
                        ((defpackage.iuz) obj2).b.postDelayed(((defpackage.iuz) obj2).c, 1000L);
                    } else {
                        ((defpackage.iuz) obj2).c();
                    }
                    break;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.jgq) this.a).l();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                this.a.C();
                return;
            case 9:
                defpackage.ixi ixiVar = (defpackage.ixi) this.a;
                if (ixiVar.g) {
                    ((defpackage.yqj) defpackage.ixi.a.l().ai(1517)).x("microphone timed out; no data received for %d", 2000L);
                    ixiVar.j.b("MicInputService", defpackage.ouz.TIMEOUT_ERROR);
                    ixiVar.e();
                    return;
                }
                return;
            case 10:
                defpackage.jbw jbwVar = (defpackage.jbw) ((defpackage.wyz) this.a).a;
                defpackage.jbt jbtVar = jbwVar.f;
                if (jbtVar != null) {
                    int i3 = jbwVar.e - 1;
                    jbwVar.e = i3;
                    if (i3 != 0) {
                        defpackage.jbw.a.l().ai(1793).w("%d services remaining", i3);
                        return;
                    } else {
                        jbwVar.f = null;
                        jbtVar.a();
                        return;
                    }
                }
                return;
            case 11:
                defpackage.jpd jpdVar = (defpackage.jpd) this.a;
                if (!jpdVar.c.compareAndSet(false, true)) {
                    ((defpackage.yqj) defpackage.jpd.a.l().ai((char) 2552)).u("Already started, skip starting again.");
                    return;
                }
                ((defpackage.yqj) ((defpackage.yqj) defpackage.jpd.a.f()).ai((char) 2551)).u("MTMC byte counting started.");
                jpdVar.f = android.os.SystemClock.elapsedRealtime();
                jpdVar.d.set(0L);
                jpdVar.e.set(0L);
                return;
            case 12:
                ((defpackage.jdj) this.a).b();
                return;
            case 13:
                java.lang.Runnable runnable = ((defpackage.jfv) this.a).a;
                defpackage.yqm yqmVar3 = defpackage.jfx.a;
                try {
                    runnable.run();
                    return;
                } catch (java.lang.Throwable th) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.jfx.a.g()).p(th)).ai((char) 2000)).u("Error occurred in periodic task.");
                    new defpackage.stq(android.os.Looper.getMainLooper(), (byte[]) null).post(new defpackage.jeo(th, i2));
                    throw new jfw(th);
                }
            case 14:
                android.os.Process.setThreadPriority(-10);
                this.a.run();
                return;
            case 15:
                defpackage.jha jhaVar = (defpackage.jha) this.a;
                defpackage.jhm jhmVarBk = jhaVar.bk(jhaVar.p);
                float f = jhaVar.f.a;
                float f2 = jhaVar.f.b;
                float f3 = jhaVar.f.f;
                float f4 = jhaVar.f.e;
                com.google.android.gms.car.ProjectionWindowDecorationParams projectionWindowDecorationParams = jhaVar.k;
                if (!projectionWindowDecorationParams.h) {
                    f += projectionWindowDecorationParams.a;
                    f2 += projectionWindowDecorationParams.d;
                    f3 -= projectionWindowDecorationParams.b;
                    f4 -= projectionWindowDecorationParams.c;
                }
                float f5 = jhmVarBk.a - f;
                float f6 = f3 - jhmVarBk.d;
                float f7 = f4 - jhmVarBk.c;
                float f8 = jhmVarBk.b - f2;
                android.graphics.Rect rect = new android.graphics.Rect((defpackage.tis.f(f5, jhaVar.g.left, 1.0E-4f) ? jhaVar.g : jhaVar.h).left, (defpackage.tis.f(f6, (float) jhaVar.g.top, 1.0E-4f) ? jhaVar.g : jhaVar.h).top, (defpackage.tis.f(f7, jhaVar.g.right, 1.0E-4f) ? jhaVar.g : jhaVar.h).right, (defpackage.tis.f(f8, (float) jhaVar.g.bottom, 1.0E-4f) ? jhaVar.g : jhaVar.h).bottom);
                if (jhaVar.h.equals(rect)) {
                    ((defpackage.yqj) defpackage.jha.a.l().ai(2016)).M("Render bounds don't fully cover insets, not sending non-drawable insets %s. Render bounds: %s", jhaVar.g, jhaVar.p);
                    return;
                }
                ((defpackage.yqj) defpackage.jha.a.l().ai(2017)).y("Render bounds fully cover insets, sending non-drawable insets %s", jhaVar.g);
                jhaVar.h = rect;
                defpackage.jgz jgzVar = jhaVar.r;
                jgzVar.e(jhaVar.p());
                jhaVar.j = false;
                jgzVar.removeCallbacks(jhaVar.B);
                return;
            case 16:
                defpackage.jhe jheVar = (defpackage.jhe) this.a;
                ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2104)).y("%s.onWindowAttachComplete", jheVar.b);
                defpackage.ill.d();
                if (jheVar.m && !jheVar.n) {
                    z = false;
                }
                jheVar.m = false;
                defpackage.jkr jkrVar = jheVar.d;
                defpackage.jhl jhlVar = jheVar.h;
                if (jheVar.o != null || jheVar.g.v.a > 0) {
                    defpackage.inh inhVar = (defpackage.inh) jkrVar;
                    defpackage.jip jipVar = inhVar.Y;
                    android.content.Context contextAQ = defpackage.tna.aQ(inhVar.l, jheVar.c);
                    com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = jheVar.o;
                    if (projectionWindowAnimationParams == null) {
                        projectionWindowAnimationParams = jheVar.g.v;
                    }
                    jikVarB = jipVar.b(contextAQ, projectionWindowAnimationParams, jheVar.t(), jheVar.s());
                    jheVar.o = null;
                } else {
                    jikVarB = null;
                }
                jkrVar.L(jhlVar, z, null, jikVarB);
                return;
            case 17:
                java.lang.Object obj3 = this.a;
                defpackage.jhh jhhVar = (defpackage.jhh) obj3;
                jhhVar.K = true;
                ((defpackage.jha) obj3).c.T();
                jhhVar.F = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
                jhhVar.F.setDuration(800L);
                jhhVar.F.addUpdateListener(new nv(obj3, 3, (byte[]) null));
                jhhVar.F.addListener(new jhg(jhhVar));
                jhhVar.F.start();
                return;
            case 18:
                ((defpackage.yqj) defpackage.jkg.a.f()).u("Loading timed out");
                ((defpackage.jkg) this.a).i();
                return;
            case 19:
                ((defpackage.yqj) defpackage.jkg.a.f()).u("Minimum time reached");
                ((defpackage.jkg) this.a).i();
                return;
            default:
                ((defpackage.yqj) defpackage.jkg.a.f()).u("Loading timed out waiting for screen to get filled");
                ((defpackage.jkg) this.a).i();
                return;
        }
    }

    public /* synthetic */ ire(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
