package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class irf implements defpackage.itf, defpackage.iqt, defpackage.irg, defpackage.izx, defpackage.isu, defpackage.ita {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.FOCUS");
    private volatile java.lang.Long A;
    private boolean B;
    private final android.os.HandlerThread C;
    private final android.os.HandlerThread D;
    private volatile boolean E;
    private final boolean F;
    private java.lang.Runnable G;
    private long H;
    private final java.lang.Runnable I;
    public final defpackage.iqu b;
    public final defpackage.xzi c;
    public final defpackage.jfe d;
    public final defpackage.ist e;
    public final defpackage.itg f;
    public final defpackage.isj g;
    public defpackage.xik h;
    public volatile java.lang.String i;
    public volatile defpackage.xij j;
    public final java.util.concurrent.atomic.AtomicBoolean k;
    volatile defpackage.jaa l;
    public defpackage.ird m;
    public final java.lang.Object n;
    public final android.media.AudioManager o;
    public volatile java.lang.Integer p;
    public volatile boolean q;
    public volatile java.lang.Runnable r;
    public final java.util.Set s;
    public int t;
    public int u;
    public int v;
    public long w;
    public int x;
    private final defpackage.jfo y;
    private final defpackage.jfa z;

    public irf(android.content.Context context, defpackage.jfo jfoVar, defpackage.xzi xziVar, defpackage.jfe jfeVar, defpackage.jfa jfaVar) {
        android.media.AudioManager audioManager = (android.media.AudioManager) defpackage.jfr.c(context).getSystemService("audio");
        audioManager.getClass();
        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) defpackage.jfr.c(context).getSystemService("phone");
        telephonyManager.getClass();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("FOCUS_HANDLER", -16);
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("FOCUS_RELEASE");
        defpackage.isj isjVar = new defpackage.isj(jfoVar);
        this.A = null;
        this.h = defpackage.xik.AUDIO_FOCUS_STATE_INVALID;
        this.j = null;
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.B = false;
        this.n = new java.lang.Object();
        this.s = new java.util.concurrent.CopyOnWriteArraySet();
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = -1L;
        this.H = 0L;
        this.x = 0;
        this.I = new defpackage.ire(this, 0);
        this.C = handlerThread;
        this.D = handlerThread2;
        this.y = jfoVar;
        this.c = xziVar;
        this.d = jfeVar;
        this.o = audioManager;
        this.z = jfaVar;
        com.google.android.gms.car.CarInfo carInfoT = jfaVar.t();
        defpackage.absx absxVarB = defpackage.acof.a.fF().b();
        defpackage.yqm yqmVar = defpackage.kjl.a;
        j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(16), absxVarB);
        int i = defpackage.ygw.d;
        boolean zH = defpackage.kjl.h(carInfoT, (defpackage.ygw) streamD.collect(defpackage.yds.a));
        this.F = zH;
        this.b = new defpackage.iqu(this, zH);
        this.g = isjVar;
        this.f = new defpackage.iti(audioManager, telephonyManager, this);
        this.e = new defpackage.isw(audioManager, this, new defpackage.isz(this, jfoVar));
    }

    public static boolean n(java.lang.String str, android.media.AudioAttributes audioAttributes) {
        return (audioAttributes.getUsage() == 16 && str != null && defpackage.kmv.c(acoc.c(), str)) || (audioAttributes.getUsage() == 12 && str != null && str.equals("com.google.android.googlequicksearchbox"));
    }

    private final void q() {
        android.os.Looper looper = this.D.getLooper();
        if (looper == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1190)).u("Already stopped, skip sending focus request to release car audio focus to HU");
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 1189)).u("Send focus request to release car audio focus to HU");
        new defpackage.stq(looper).post(this.I);
    }

    private final synchronized void r() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1200)).u("Stop audio focus handler");
        if (!this.B) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1204)).u("Car audio focus handler didn't start or already stopped");
            return;
        }
        java.lang.Integer num = this.p;
        if (num != null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1202)).y("Restoring media stream volume to: %d", num);
            try {
                this.o.setStreamVolume(3, num.intValue(), 0);
            } catch (java.lang.SecurityException e) {
                if (defpackage.sqs.e()) {
                    throw e;
                }
                defpackage.yqm yqmVar2 = a;
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar2.h()).p(e)).ai((char) 1203)).u("Could not restore media stream volume. Continuing shutdown.");
                this.y.e(defpackage.zbe.AUDIO_FOCUS_HANDLER, defpackage.zbd.yC);
                yqmVar = yqmVar2;
            }
        }
        if (this.k.getAndSet(false)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1201)).u("Disconnected while waiting for HU to recover from transient loss");
            defpackage.isj isjVar = this.g;
            defpackage.zbd zbdVar = defpackage.zbd.zy;
            defpackage.ysr.bl(defpackage.isj.a.contains(zbdVar), "Unsupported UiAction: %s", zbdVar.a());
            isjVar.c(defpackage.zbe.AUDIO_FOCUS_UNSOLICITED_LOSS_TRANSIENT, zbdVar);
        }
        this.p = null;
        this.B = false;
        defpackage.ist istVar = this.e;
        android.os.Handler handler = ((defpackage.isw) istVar).c;
        if (handler != null) {
            ((defpackage.isw) istVar).d.c = null;
            handler.post(new defpackage.iqv(istVar, 10));
        }
        ((defpackage.isw) istVar).c = null;
        defpackage.iqu iquVar = this.b;
        defpackage.iqs iqsVar = iquVar.d;
        iqsVar.getClass();
        iqsVar.b();
        iquVar.i(3);
        iquVar.i(5);
        iquVar.i(1);
        iquVar.j();
        this.s.clear();
        defpackage.ird irdVar = this.m;
        irdVar.getClass();
        irdVar.e();
        this.C.quitSafely();
        this.D.quit();
    }

    @Override // defpackage.izx
    public final synchronized void a(defpackage.jaa jaaVar) {
        this.l = jaaVar;
    }

    @Override // defpackage.izx
    public final synchronized void b() {
        r();
        defpackage.itg itgVar = this.f;
        ((defpackage.iti) itgVar).b.listen(((defpackage.iti) itgVar).e, 0);
        this.l = null;
    }

    @Override // defpackage.izx
    public final void c(defpackage.xik xikVar, boolean z) {
        synchronized (this) {
            if (!this.B) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(1188)).y("Ignoring focus change from HU while focus handling is not started: %s", new defpackage.zkf(defpackage.zke.a, xikVar.name()));
                return;
            }
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1187);
            java.lang.String strName = xikVar.name();
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("Received focus change from HU: %s, unsolicited: %s", new defpackage.zkf(zkeVar, strName), new defpackage.zkf(zkeVar, java.lang.Boolean.valueOf(z)));
            if (this.H > 0 && !z) {
                defpackage.jfo jfoVar = this.y;
                if (jfoVar != null) {
                    defpackage.xij xijVar = this.j;
                    long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.H;
                    if (xijVar != null) {
                        defpackage.abor aborVarN = defpackage.yxs.a.n();
                        aborVarN.t();
                        defpackage.yxs yxsVar = (defpackage.yxs) aborVarN.b;
                        yxsVar.b |= 1;
                        yxsVar.c = xijVar.e;
                        aborVarN.t();
                        defpackage.yxs yxsVar2 = (defpackage.yxs) aborVarN.b;
                        yxsVar2.b |= 2;
                        yxsVar2.d = (int) jElapsedRealtime;
                        defpackage.yxs yxsVar3 = (defpackage.yxs) aborVarN.q();
                        defpackage.abor aborVarN2 = defpackage.yyg.a.n();
                        aborVarN2.t();
                        defpackage.yyg yygVar = (defpackage.yyg) aborVarN2.b;
                        yxsVar3.getClass();
                        yygVar.k = yxsVar3;
                        yygVar.b |= 128;
                        defpackage.yyh yyhVar = defpackage.yyh.AUDIO_FOCUS_REQUEST;
                        int i = defpackage.ygw.d;
                        ((defpackage.jfp) jfoVar).m(aborVarN2, yyhVar, defpackage.ymx.a);
                    }
                }
                this.H = 0L;
            }
            defpackage.ird irdVar = this.m;
            irdVar.getClass();
            irdVar.a();
            defpackage.ird irdVar2 = this.m;
            irdVar2.getClass();
            irdVar2.c(xikVar, z, false);
        }
    }

    @Override // defpackage.izx
    public final synchronized void d() {
        if (defpackage.a.N()) {
            this.b.e();
        }
    }

    @Override // defpackage.izx
    public final synchronized void e(int i) {
        if (i == 2) {
            this.E = false;
            this.A = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
            if (this.F) {
                this.b.c(new irc(0), j$.time.Duration.ZERO);
                return;
            }
            synchronized (this.n) {
                if (this.x == 1) {
                    this.x = 0;
                    this.b.c(new irb(this), j$.time.Duration.ofMillis(500L));
                } else {
                    this.b.c(new irc(1), j$.time.Duration.ZERO);
                }
            }
        }
    }

    @Override // defpackage.izx
    public final synchronized void f(int i) {
        if (i == 1) {
            this.E = true;
            this.b.d();
            this.A = null;
        }
    }

    @Override // defpackage.iqt
    public final void g(defpackage.xik xikVar) {
        defpackage.ird irdVar = this.m;
        irdVar.getClass();
        irdVar.c(xikVar, false, true);
    }

    public final void h() {
        defpackage.ysr.bk(android.os.Looper.myLooper() == this.C.getLooper(), "Expecting focus handler thread");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:111:0x027b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0295  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:123:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:128:0x0308  */
    /* JADX WARN: Code duplicated, block: B:130:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f  */
    /* JADX WARN: Code duplicated, block: B:51:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0163  */
    /* JADX WARN: Code duplicated, block: B:54:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x019f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01af  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01db  */
    /* JADX WARN: Code duplicated, block: B:81:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:87:0x0209  */
    /* JADX WARN: Code duplicated, block: B:95:0x0223  */
    /* JADX WARN: Code duplicated, block: B:96:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0250  */
    /* JADX WARN: Code duplicated, block: B:99:0x0253  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i(defpackage.xik xikVar, boolean z, boolean z2) {
        int i;
        defpackage.xik xikVar2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zB;
        defpackage.xij xijVar;
        boolean zB2;
        defpackage.xij xijVar2;
        boolean z6;
        defpackage.xij xijVar3;
        boolean z7;
        ?? r4;
        boolean z8;
        synchronized (this.n) {
            i = this.x;
            this.x = 0;
        }
        defpackage.xik xikVar3 = this.h;
        defpackage.xik xikVar4 = true == z2 ? xikVar3 : xikVar;
        defpackage.iqz iqzVar = new defpackage.iqz();
        iqzVar.c(false);
        iqzVar.a(false);
        iqzVar.b(0);
        iqzVar.a = this.i;
        iqzVar.b = this.j;
        if (xikVar4 == null) {
            throw new java.lang.NullPointerException("Null audioFocusStateType");
        }
        iqzVar.c = xikVar4;
        iqzVar.c(z);
        iqzVar.a(z2);
        iqzVar.b(i);
        if (iqzVar.g != 7 || (xikVar2 = iqzVar.c) == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (iqzVar.c == null) {
                sb.append(" audioFocusStateType");
            }
            if ((iqzVar.g & 1) == 0) {
                sb.append(" unsolicitedResponse");
            }
            if ((iqzVar.g & 2) == 0) {
                sb.append(" gearheadForcedResponse");
            }
            if ((iqzVar.g & 4) == 0) {
                sb.append(" pendingRequest");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        defpackage.ira iraVar = new defpackage.ira(iqzVar.a, iqzVar.b, xikVar2, iqzVar.d, iqzVar.e, iqzVar.f);
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1154);
        java.lang.String str = iraVar.a;
        defpackage.xij xijVar4 = iraVar.b;
        java.lang.String strB = xijVar4 == null ? "null" : defpackage.tna.B(xijVar4);
        defpackage.zke zkeVar = defpackage.zke.a;
        defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, strB);
        defpackage.xik xikVar5 = iraVar.c;
        defpackage.zkf zkfVar2 = new defpackage.zkf(zkeVar, defpackage.tna.C(xikVar5));
        boolean z9 = iraVar.d;
        boolean z10 = iraVar.e;
        int i3 = iraVar.f;
        yqjVar.U("Handling CarAudioFocusEvent from HU: packageName=%s, audioFocusRequestType=%s, audioFocusStateType=%s, unsolicitedResponse=%b, gearheadForcedResponse=%b, pendingRequest=%s", str, zkfVar, zkfVar2, java.lang.Boolean.valueOf(z9), java.lang.Boolean.valueOf(z10), new defpackage.zkf(zkeVar, defpackage.ere.f(i3)));
        defpackage.ish ishVarA = defpackage.isi.a();
        if (!z10 && xikVar5 != defpackage.xik.AUDIO_FOCUS_STATE_GAIN && this.k.getAndSet(false)) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1191)).u("Reset pending recovery from transient loss due to unexpected focus notification");
            ishVarA.d = 3;
        }
        if (!z2) {
            if (i == 0) {
                i2 = 0;
            } else {
                i2 = i;
                z3 = false;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1155)).y("changeAndroidFocus: %b", java.lang.Boolean.valueOf(z3));
            switch (xikVar4.ordinal()) {
                case defpackage.abnt.b /* 0 */:
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1157)).u("Not handling invalid focus change from HU");
                    this.j = null;
                    this.A = null;
                    return;
                case 1:
                    this.b.b(true, true, iraVar);
                    if (z9) {
                        z5 = true;
                    } else {
                        if (this.j != null && this.j != defpackage.xij.AUDIO_FOCUS_GAIN && this.j != defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT && this.j != defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK) {
                            zB = this.f.b();
                            xijVar = this.j;
                            if (!zB) {
                                ((defpackage.yqj) yqmVar.l().ai((char) 1161)).y("Focus GAIN from HU does not match focus request sent to HU: %s", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar)));
                                this.e.b(1);
                                q();
                                z4 = false;
                                if (!z10) {
                                    ishVarA.e(z4);
                                    ishVarA.a = xijVar4;
                                    ishVarA.b = xikVar5;
                                    this.g.a(ishVarA.a());
                                }
                                this.j = null;
                                this.i = null;
                                this.A = null;
                                if (z2) {
                                    return;
                                }
                                this.h = xikVar4;
                                if (i2 != 0) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                                    m(i2);
                                    return;
                                }
                                return;
                            }
                            ((defpackage.yqj) yqmVar.l().ai((char) 1160)).y("Requested %s but received GAIN from HU while in phone call. Not releasing focus.", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar)));
                        }
                        z5 = false;
                    }
                    if (z3) {
                        this.e.a();
                    }
                    if (this.k.compareAndSet(true, false)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1158)).u("HU restored GAIN after transient loss");
                        ishVarA.d = 2;
                        ((defpackage.yqj) yqmVar.l().ai((char) 1159)).u("Remove recovery callback after phone call");
                        defpackage.ird irdVar = this.m;
                        irdVar.getClass();
                        java.lang.Runnable runnable = this.r;
                        runnable.getClass();
                        irdVar.removeCallbacks(runnable);
                    }
                    z4 = z5;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    this.b.b(defpackage.kjl.f(this.z.t(), acoc.d()), true, iraVar);
                    if (z9) {
                        z4 = true;
                    } else {
                        if (this.j != null && this.j != defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT && this.j != defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK) {
                            zB2 = this.f.b();
                            xijVar2 = this.j;
                            if (zB2) {
                                ((defpackage.yqj) yqmVar.l().ai((char) 1162)).y("Requested %s but received GAIN_TR from HU while in phone call. Not releasing focus.", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar2)));
                            } else {
                                ((defpackage.yqj) yqmVar.l().ai((char) 1163)).y("Focus GAIN_TR from HU does not match focus request sent to HU: %s", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar2)));
                                this.e.b(1);
                                q();
                            }
                        }
                        z4 = false;
                    }
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    if (z10) {
                        z6 = true;
                    } else {
                        ((defpackage.isw) this.e).d.b();
                        z6 = false;
                    }
                    this.b.b(false, false, iraVar);
                    xijVar3 = this.j;
                    if (z6) {
                        if (i3 != 0) {
                            z4 = z9;
                        } else if (!z9) {
                            z4 = true;
                        } else if (xijVar3 != defpackage.xij.AUDIO_FOCUS_RELEASE) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        ishVarA.c = this.A;
                        if (!z10) {
                            ishVarA.e(z4);
                            ishVarA.a = xijVar4;
                            ishVarA.b = xikVar5;
                            this.g.a(ishVarA.a());
                        }
                        this.j = null;
                        this.i = null;
                        this.A = null;
                        if (z2) {
                            this.h = xikVar4;
                            if (i2 != 0) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                                m(i2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    z4 = z9;
                    ((defpackage.yqj) yqmVar.l().ai((char) 1167)).u("Request Android audio focus upon loss from HU.");
                    this.e.b(1);
                    ishVarA.c = this.A;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    this.b.b(true, false, iraVar);
                    if (z3) {
                        this.e.b(3);
                    }
                    z4 = z9;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    if (z9) {
                        ((defpackage.isw) this.e).d.b();
                        if (xikVar3 == defpackage.xik.AUDIO_FOCUS_STATE_GAIN && !z10 && this.k.compareAndSet(false, true)) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1168)).u("Expecting HU to recover from transient loss");
                            ishVarA.d = 1;
                        }
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.b.b(false, false, iraVar);
                    if (z3) {
                        this.e.b(2);
                    }
                    z4 = z7;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.b.b(true, false, iraVar);
                    if (z3) {
                        this.e.a();
                    }
                    z4 = z9;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (z9) {
                        if (defpackage.qtq.e(this.z.t(), acoc.f())) {
                            r4 = 1;
                            z8 = false;
                            z7 = true;
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1166)).u("Received unsolicited GAIN_TRANSIENT_GUIDANCE_ONLY focus change from HU");
                            z4 = true;
                            this.e.b(1);
                            this.b.b(false, true, iraVar);
                        }
                        if (!z10) {
                            ishVarA.e(z4);
                            ishVarA.a = xijVar4;
                            ishVarA.b = xikVar5;
                            this.g.a(ishVarA.a());
                        }
                        this.j = null;
                        this.i = null;
                        this.A = null;
                        if (z2) {
                            this.h = xikVar4;
                            if (i2 != 0) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                                m(i2);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    r4 = 1;
                    z8 = false;
                    z7 = false;
                    this.b.b(z8, r4, iraVar);
                    if (this.j == defpackage.xij.AUDIO_FOCUS_GAIN) {
                        if (this.f.b()) {
                            ((defpackage.yqj) yqmVar.l().ai((char) 1164)).u("Requested GAIN but received GAIN_TRANSIENT_GUIDANCE_ONLY from HU while in phone call. Not releasing focus.");
                        } else {
                            ((defpackage.yqj) yqmVar.l().ai((char) 1165)).u("Requested GAIN but received GAIN_TRANSIENT_GUIDANCE_ONLY from HU");
                            this.e.b(r4);
                            q();
                        }
                    }
                    z4 = z7;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    z4 = z9;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        i2 = i;
        z3 = true;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1155)).y("changeAndroidFocus: %b", java.lang.Boolean.valueOf(z3));
        switch (xikVar4.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1157)).u("Not handling invalid focus change from HU");
                this.j = null;
                this.A = null;
                return;
            case 1:
                this.b.b(true, true, iraVar);
                if (z9) {
                    if (this.j != null) {
                        zB = this.f.b();
                        xijVar = this.j;
                        if (!zB) {
                            ((defpackage.yqj) yqmVar.l().ai((char) 1161)).y("Focus GAIN from HU does not match focus request sent to HU: %s", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar)));
                            this.e.b(1);
                            q();
                            z4 = false;
                            if (!z10) {
                                ishVarA.e(z4);
                                ishVarA.a = xijVar4;
                                ishVarA.b = xikVar5;
                                this.g.a(ishVarA.a());
                            }
                            this.j = null;
                            this.i = null;
                            this.A = null;
                            if (z2) {
                                this.h = xikVar4;
                                if (i2 != 0) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                                    m(i2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        ((defpackage.yqj) yqmVar.l().ai((char) 1160)).y("Requested %s but received GAIN from HU while in phone call. Not releasing focus.", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar)));
                    }
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z3) {
                    this.e.a();
                }
                if (this.k.compareAndSet(true, false)) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1158)).u("HU restored GAIN after transient loss");
                    ishVarA.d = 2;
                    ((defpackage.yqj) yqmVar.l().ai((char) 1159)).u("Remove recovery callback after phone call");
                    defpackage.ird irdVar2 = this.m;
                    irdVar2.getClass();
                    java.lang.Runnable runnable2 = this.r;
                    runnable2.getClass();
                    irdVar2.removeCallbacks(runnable2);
                }
                z4 = z5;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                this.b.b(defpackage.kjl.f(this.z.t(), acoc.d()), true, iraVar);
                if (z9) {
                    if (this.j != null) {
                        zB2 = this.f.b();
                        xijVar2 = this.j;
                        if (zB2) {
                            ((defpackage.yqj) yqmVar.l().ai((char) 1163)).y("Focus GAIN_TR from HU does not match focus request sent to HU: %s", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar2)));
                            this.e.b(1);
                            q();
                        } else {
                            ((defpackage.yqj) yqmVar.l().ai((char) 1162)).y("Requested %s but received GAIN_TR from HU while in phone call. Not releasing focus.", new defpackage.zkf(zkeVar, defpackage.tna.B(xijVar2)));
                        }
                    }
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                if (z10) {
                    ((defpackage.isw) this.e).d.b();
                    z6 = false;
                } else {
                    z6 = true;
                }
                this.b.b(false, false, iraVar);
                xijVar3 = this.j;
                if (z6) {
                    if (i3 != 0) {
                        z4 = z9;
                    } else if (!z9) {
                        z4 = true;
                    } else if (xijVar3 != defpackage.xij.AUDIO_FOCUS_RELEASE) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    ishVarA.c = this.A;
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                z4 = z9;
                ((defpackage.yqj) yqmVar.l().ai((char) 1167)).u("Request Android audio focus upon loss from HU.");
                this.e.b(1);
                ishVarA.c = this.A;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                this.b.b(true, false, iraVar);
                if (z3) {
                    this.e.b(3);
                }
                z4 = z9;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (z9) {
                    ((defpackage.isw) this.e).d.b();
                    if (xikVar3 == defpackage.xik.AUDIO_FOCUS_STATE_GAIN) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1168)).u("Expecting HU to recover from transient loss");
                        ishVarA.d = 1;
                    }
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.b.b(false, false, iraVar);
                if (z3) {
                    this.e.b(2);
                }
                z4 = z7;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                this.b.b(true, false, iraVar);
                if (z3) {
                    this.e.a();
                }
                z4 = z9;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                if (z9) {
                    if (defpackage.qtq.e(this.z.t(), acoc.f())) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1166)).u("Received unsolicited GAIN_TRANSIENT_GUIDANCE_ONLY focus change from HU");
                        z4 = true;
                        this.e.b(1);
                        this.b.b(false, true, iraVar);
                    } else {
                        r4 = 1;
                        z8 = false;
                        z7 = true;
                    }
                    if (!z10) {
                        ishVarA.e(z4);
                        ishVarA.a = xijVar4;
                        ishVarA.b = xikVar5;
                        this.g.a(ishVarA.a());
                    }
                    this.j = null;
                    this.i = null;
                    this.A = null;
                    if (z2) {
                        this.h = xikVar4;
                        if (i2 != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                            m(i2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                r4 = 1;
                z8 = false;
                z7 = false;
                this.b.b(z8, r4, iraVar);
                if (this.j == defpackage.xij.AUDIO_FOCUS_GAIN) {
                    if (this.f.b()) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 1165)).u("Requested GAIN but received GAIN_TRANSIENT_GUIDANCE_ONLY from HU");
                        this.e.b(r4);
                        q();
                    } else {
                        ((defpackage.yqj) yqmVar.l().ai((char) 1164)).u("Requested GAIN but received GAIN_TRANSIENT_GUIDANCE_ONLY from HU while in phone call. Not releasing focus.");
                    }
                }
                z4 = z7;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
            default:
                z4 = z9;
                if (!z10) {
                    ishVarA.e(z4);
                    ishVarA.a = xijVar4;
                    ishVarA.b = xikVar5;
                    this.g.a(ishVarA.a());
                }
                this.j = null;
                this.i = null;
                this.A = null;
                if (z2) {
                    this.h = xikVar4;
                    if (i2 != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1156)).y("Handling pending focus request: %s", new defpackage.zkf(zkeVar, defpackage.ere.f(i2)));
                        m(i2);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void j(java.lang.String str) {
        if (defpackage.a.N()) {
            h();
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(1175)).E("usageAssistantFocusGains: %d. inVoiceSession: %b", this.t, this.E);
            int i = this.t;
            if (i != 1) {
                if (i == 0 && this.E) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 1177)).u("Queuing asr stop runnable.");
                    defpackage.ird irdVar = this.m;
                    irdVar.getClass();
                    irdVar.postDelayed(this.G, acoc.b());
                    return;
                }
                if (this.t < 0) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 1176)).u("Usage assistant focus gains are negative. Resetting to 0.");
                    this.t = 0;
                    return;
                }
                return;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 1178)).u("Removing stop ASR callbacks");
            defpackage.ird irdVar2 = this.m;
            irdVar2.getClass();
            irdVar2.removeCallbacks(this.G);
            if (this.E) {
                return;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 1179)).y("Starting ASR for package: %s", str);
            if (str != null) {
                defpackage.jfo jfoVar = this.y;
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.AUDIO_FOCUS_REQUEST_GAIN, defpackage.zbd.zz);
                rrvVarH.d(new android.content.ComponentName(str, ""));
                jfoVar.b(rrvVarH.l());
            }
            p(1);
        }
    }

    @Override // defpackage.isu
    public final void k() {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 1181)).u("onAllExternalAppsLoseAudioFocus");
        if (this.q) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1183)).u("Ignoring Android audio focus loss.");
            return;
        }
        if (defpackage.a.N()) {
            if (defpackage.acnf.a.fF().F()) {
                j$.lang.Iterable.-EL.forEach(this.s, new defpackage.nyj(1));
            } else {
                ((defpackage.yqj) yqmVar.l().ai((char) 1182)).u("usageAssistantFocusGains: 0");
                this.t = 0;
                j(null);
            }
        }
        q();
    }

    public final void l(defpackage.xij xijVar, int i) {
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1193);
        java.lang.String strB = defpackage.tna.B(xijVar);
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("Send focus request to HU: %s, attempt#: %s", new defpackage.zkf(zkeVar, strB), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(i)));
        java.lang.Object obj = this.l;
        if (obj == null) {
            return;
        }
        this.u++;
        this.H = android.os.SystemClock.elapsedRealtime();
        this.j = xijVar;
        defpackage.ird irdVar = this.m;
        irdVar.getClass();
        irdVar.b(xijVar, i);
        defpackage.jab.b.f().ai(1702).y("sent audio focus request: %s", xijVar.name());
        defpackage.abor aborVarN = defpackage.xii.a.n();
        aborVarN.t();
        defpackage.xii xiiVar = (defpackage.xii) aborVarN.b;
        xiiVar.c = xijVar.e;
        xiiVar.b |= 1;
        ((defpackage.jbq) obj).k(18, (defpackage.xii) aborVarN.q());
        if (i == 1) {
            defpackage.ish ishVarA = defpackage.isi.a();
            ishVarA.a = this.j;
            if (xijVar != defpackage.xij.AUDIO_FOCUS_GAIN && this.k.getAndSet(false)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1194)).u("Reset pending recovery from transient loss due to unexpected focus request");
                ishVarA.d = 4;
            }
            this.g.a(ishVarA.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    public final void m(int i) {
        defpackage.xij xijVar;
        defpackage.ird irdVar = this.m;
        irdVar.getClass();
        if (!irdVar.f() && this.j != null) {
            synchronized (this.n) {
                this.x = i;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1199)).y("Received new focus while waiting for HU response, external app focus: %s", new defpackage.zkf(defpackage.zke.a, defpackage.ere.f(i)));
            return;
        }
        if (!this.F) {
            defpackage.ird irdVar2 = this.m;
            irdVar2.getClass();
            if (!irdVar2.f() && this.E && i == 1) {
                synchronized (this.n) {
                    this.x = 1;
                }
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1198)).u("Deferring GAIN focus request received during voice session.");
                return;
            }
        }
        if (i == -1) {
            xijVar = defpackage.xij.AUDIO_FOCUS_RELEASE;
        } else if (i == 1) {
            xijVar = defpackage.xij.AUDIO_FOCUS_GAIN;
        } else if (i == 2) {
            xijVar = defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT;
        } else if (i == 3) {
            xijVar = defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT_MAY_DUCK;
        } else if (i != 4) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1174)).w("Unexpected Android focus state: %d", i);
            xijVar = defpackage.xij.AUDIO_FOCUS_RELEASE;
        } else {
            xijVar = defpackage.xij.AUDIO_FOCUS_GAIN_TRANSIENT;
        }
        if (!defpackage.tna.ab(this.h, xijVar)) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1197)).y("Not sending focus request to HU as MD already hold sufficient focus: %s", new defpackage.zkf(defpackage.zke.a, defpackage.tna.B(xijVar)));
            this.i = null;
            return;
        }
        if (((defpackage.iti) this.f).d && (xijVar == defpackage.xij.AUDIO_FOCUS_GAIN || this.h == defpackage.xik.AUDIO_FOCUS_STATE_LOSS_TRANSIENT)) {
            defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1196);
            java.lang.String strB = defpackage.tna.B(xijVar);
            defpackage.zke zkeVar = defpackage.zke.a;
            yqjVar.M("Focus request %s to HU not allowed while in call. Current focus state from MD: %s", new defpackage.zkf(zkeVar, strB), new defpackage.zkf(zkeVar, defpackage.tna.C(this.h)));
            return;
        }
        defpackage.yqj yqjVar2 = (defpackage.yqj) ((defpackage.yqj) a.f()).ai(1195);
        java.lang.String strB2 = defpackage.tna.B(xijVar);
        defpackage.zke zkeVar2 = defpackage.zke.a;
        yqjVar2.R("Sending %s to HU for app %s due to Android focus change: %s", new defpackage.zkf(zkeVar2, strB2), this.i, new defpackage.zkf(zkeVar2, defpackage.ere.f(i)));
        l(xijVar, 1);
    }

    @Override // defpackage.irg
    public final synchronized void o(int i, defpackage.iqj iqjVar, defpackage.iqh iqhVar) {
        defpackage.iqu iquVar = this.b;
        iquVar.f[i] = iqjVar;
        iquVar.g[i] = iqhVar;
        boolean z = true;
        char c = 1;
        iquVar.l(1);
        if (this.B) {
            return;
        }
        this.B = true;
        this.D.start();
        android.os.HandlerThread handlerThread = this.C;
        handlerThread.start();
        android.os.Looper looper = handlerThread.getLooper();
        looper.getClass();
        iquVar.d = new defpackage.iqs(iquVar, looper);
        this.G = new defpackage.bgf(this, 20);
        this.m = new defpackage.ird(this, looper);
        defpackage.ist istVar = this.e;
        ((defpackage.yqj) defpackage.isw.a.l().ai((char) 1306)).u("Start Android audio focus manager");
        defpackage.stq stqVar = new defpackage.stq(looper, (byte[]) null);
        ((defpackage.isw) istVar).c = stqVar;
        stqVar.post(new defpackage.ire(istVar, 5));
        this.r = new defpackage.ire((java.lang.Object) this, (int) (c == true ? 1 : 0));
        defpackage.itg itgVar = this.f;
        ((defpackage.iti) itgVar).b.listen(((defpackage.iti) itgVar).e, 32);
        if (((defpackage.iti) itgVar).c() == 0) {
            z = false;
        }
        ((defpackage.iti) itgVar).d = z;
    }

    public final synchronized void p(int i) {
        if (this.l != null) {
            this.l.f(i);
        }
    }
}
