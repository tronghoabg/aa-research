package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jeo implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jeo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: jfw */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, jhl] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.lang.Object, jhb] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws jfw {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                jer jerVar = (jer) this.a;
                jerVar.a();
                jerVar.b.shutdownNow();
                return;
            case 1:
                defpackage.jpd jpdVar = (defpackage.jpd) this.a;
                if (!jpdVar.c.compareAndSet(true, false)) {
                    ((defpackage.yqj) defpackage.jpd.a.l().ai((char) 2554)).u("MTMC byte counting not started, nothing to do on stop.");
                    return;
                }
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - jpdVar.f;
                java.util.concurrent.atomic.AtomicLong atomicLong = jpdVar.d;
                java.util.concurrent.atomic.AtomicLong atomicLong2 = jpdVar.e;
                long j = atomicLong.get();
                long j2 = atomicLong2.get();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.CAR_SERVICE, defpackage.zbd.ud);
                defpackage.abor aborVarN = defpackage.yzz.a.n();
                aborVarN.t();
                defpackage.yzz yzzVar = (defpackage.yzz) aborVarN.b;
                yzzVar.b = 1 | yzzVar.b;
                yzzVar.c = j;
                aborVarN.t();
                defpackage.yzz yzzVar2 = (defpackage.yzz) aborVarN.b;
                yzzVar2.b |= 2;
                yzzVar2.d = j2;
                aborVarN.t();
                defpackage.yzz yzzVar3 = (defpackage.yzz) aborVarN.b;
                yzzVar3.b |= 4;
                yzzVar3.e = jElapsedRealtime;
                rrvVarH.q = defpackage.xyn.h((defpackage.yzz) aborVarN.q());
                jpdVar.b.b((defpackage.rrw) rrvVarH.l());
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.jpd.a.f()).ai(2553);
                java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.R("MTMC byte counting stopped. Read %s bytes and wrote %s bytes over %s milliseconds.", new defpackage.zkf(zkeVar, lValueOf), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(j2)), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(jElapsedRealtime)));
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.jfx.a;
                throw new jfw((java.lang.Throwable) this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                android.view.Choreographer.getInstance().postFrameCallback(((jgt) this.a).r);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ?? r11 = this.a;
                ((defpackage.inh) ((defpackage.jha) r11).c).al.d(r11);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r12 = this.a;
                ((defpackage.inh) ((defpackage.jha) r12).c).al.c(r12);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.jhe) this.a).A();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.jhe jheVar = (defpackage.jhe) this.a;
                if (jheVar.r) {
                    ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2086)).y("%s.hideTransient()", jheVar.b);
                    jheVar.x(jheVar.v());
                    jheVar.r = false;
                    return;
                }
                return;
            case 9:
                defpackage.jhe jheVar2 = (defpackage.jhe) this.a;
                ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2126)).y("%s.requestFocus", jheVar2.b);
                jheVar2.d.Z(jheVar2.h);
                return;
            case 10:
                if (defpackage.acqh.m()) {
                    ?? r13 = this.a;
                    defpackage.jhe jheVar3 = (defpackage.jhe) r13;
                    if (jheVar3.q) {
                        ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2134)).y("%s.showTransient() ignored because it is held open", jheVar3.b);
                        return;
                    }
                    if (jheVar3.t == null) {
                        jheVar3.t = new defpackage.jeo(r13, 8);
                    }
                    if (!jheVar3.l) {
                        ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2133)).y("%s already transiently showing, resetting timer.", jheVar3.b);
                        android.os.Handler handler = jheVar3.s;
                        handler.removeCallbacks(jheVar3.t);
                        handler.postDelayed(jheVar3.t, defpackage.acqh.c());
                        return;
                    }
                    ((defpackage.yqj) defpackage.jhe.a.l().ai((char) 2132)).y("%s.showTransient()", jheVar3.b);
                    jheVar3.l = false;
                    jheVar3.h.getClass();
                    jheVar3.r = true;
                    jheVar3.B(jheVar3.g);
                    if (jheVar3.d.aj(r13, jheVar3.p)) {
                        jheVar3.m = true;
                        jheVar3.n = true;
                        jheVar3.o = null;
                    }
                    android.os.Handler handler2 = jheVar3.s;
                    handler2.removeCallbacks(jheVar3.t);
                    handler2.postDelayed(jheVar3.t, defpackage.acqh.c());
                    return;
                }
                return;
            case 11:
                ((defpackage.jhe) this.a).A();
                return;
            case 12:
                defpackage.jjj jjjVar = (defpackage.jjj) this.a;
                defpackage.jjd jjdVar = jjjVar.c;
                if (jjdVar == null) {
                    return;
                }
                jjjVar.c = null;
                ((defpackage.yqj) defpackage.jjj.a.h()).u("Screenshot request timed out waiting for frame; returning fallback.");
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(1, 1, android.graphics.Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                jjdVar.a(bitmapCreateBitmap);
                return;
            case 13:
                ((defpackage.jkv) this.a).d();
                return;
            case 14:
                jld jldVar = (jld) this.a;
                jldVar.c.removeCallbacksAndMessages(null);
                jldVar.d.shutdownNow();
                return;
            case 15:
                java.lang.Object obj = this.a;
                jlu jluVar = (jlu) obj;
                jlt jltVar = jluVar.j;
                if (jltVar.a) {
                    defpackage.rxo rxoVar = jltVar.f;
                    if (rxoVar != null) {
                        try {
                            rxoVar.m(((jlu) obj).c);
                        } catch (android.os.RemoteException e) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) jlu.a.f()).p(e)).ai(2316)).y("Couldn't stop %s, but it could be fine.", jluVar.j.e);
                        }
                        break;
                    }
                    jluVar.b.unbindService(jluVar.i);
                    jluVar.j.a = false;
                    return;
                }
                return;
            case 16:
                ((jlu) this.a).h();
                return;
            case 17:
                jlu jluVar2 = (jlu) this.a;
                jluVar2.h.a((android.content.ComponentName) null, jluVar2.d);
                return;
            case 18:
                jlu jluVar3 = (jlu) this.a;
                jlt jltVar2 = jluVar3.j;
                jltVar2.a();
                jltVar2.b.addAll(jluVar3.f);
                jluVar3.h();
                return;
            case 19:
                jlu jluVar4 = (jlu) this.a;
                jlt jltVar3 = jluVar4.j;
                if (jltVar3.a) {
                    jluVar4.b.unbindService(jluVar4.i);
                    jltVar3.a();
                    return;
                }
                return;
            default:
                pcs pcsVar = (pcs) this.a;
                if (pcsVar.b) {
                    ((defpackage.kof) pcsVar.r.e).d(defpackage.yyn.WIRELESS_WIFI_STARTUP_MANAGER_ON_CAR_SERVICE_STARTED);
                } else {
                    defpackage.omv.i(pcsVar.c, defpackage.yyn.STARTUP_MANAGER_ON_CAR_SERVICE_STARTED);
                }
                pcsVar.g.post(pcsVar.h);
                return;
        }
        while (true) {
            java.lang.Object obj2 = this.a;
            jgd jgdVar = (jgd) obj2;
            if (!jgdVar.c) {
                return;
            }
            try {
                java.lang.Thread.sleep(((jgd) obj2).d);
                jgdVar.y("2 | TIME: " + new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US).format(java.util.Calendar.getInstance().getTime()) + "\n");
                java.util.ArrayList arrayList = jgdVar.e;
                int size = arrayList.size();
                for (int i = 0; i < arrayList.size(); i++) {
                    jga jgaVar = (jga) arrayList.get(i);
                    jgaVar.b(jgdVar.b, jgaVar.a(jgdVar.d));
                    if (i < size - 1) {
                        try {
                            jgdVar.b.append((java.lang.CharSequence) " | ");
                        } catch (java.io.IOException unused) {
                            ((defpackage.yqj) jga.a.l().ai((char) 2002)).u("couldn't write to log file");
                        }
                    }
                }
                jgdVar.y("\n");
            } catch (java.lang.InterruptedException unused2) {
                ((defpackage.yqj) jgd.a.l().ai((char) 2006)).u("Wifi reporting thread interrupted");
                return;
            }
        }
    }
}
