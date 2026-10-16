package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kqx implements defpackage.rzb {
    public final java.lang.String d;
    private final java.util.function.Function g;
    private defpackage.xyn h;
    private defpackage.rzs i;
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ResetHandler");
    public static final java.util.concurrent.Executor b = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final j$.time.Duration e = j$.time.Duration.ofMinutes(1);
    static final j$.time.Duration c = j$.time.Duration.ofMinutes(1);
    private static final defpackage.yhe f = defpackage.yhe.p(defpackage.kqw.a, 0L, defpackage.kqw.b, 4L, defpackage.kqw.c, 16L, defpackage.kqw.d, 32L, defpackage.kqw.e, 8L, defpackage.kqw.f, 1024L);

    public kqx(java.lang.String str) {
        defpackage.mmf mmfVar = new defpackage.mmf(1);
        this.h = defpackage.xxe.a;
        this.d = str;
        this.g = mmfVar;
    }

    static final defpackage.whw e(android.content.Context context) {
        defpackage.whf whfVarA = defpackage.whg.a();
        java.util.regex.Pattern pattern = defpackage.wfx.a;
        defpackage.wfw wfwVar = new defpackage.wfw(context);
        wfwVar.b("connection_reset");
        wfwVar.c("connection_reset.pb");
        whfVarA.d(wfwVar.a());
        whfVarA.c(defpackage.kqp.a);
        whfVarA.a = defpackage.whi.a;
        return defpackage.vsl.g().d(whfVarA.a());
    }

    private static defpackage.yyo f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            defpackage.rox.o("GH.ResetHandler", "Origin cannot be UNKNOWN", new java.lang.Object[0]);
            return defpackage.yyo.CONNECTION_RESET_ORIGIN_UNSPECIFIED;
        }
        if (i2 == 1) {
            return defpackage.yyo.CONNECTION_RESET_ORIGIN_DEATH_RECIPIENT;
        }
        if (i2 != 2) {
            return i2 != 3 ? defpackage.yyo.CONNECTION_RESET_ORIGIN_PRE_SETUP : defpackage.yyo.CONNECTION_RESET_ORIGIN_USB_MONITOR;
        }
        return defpackage.yyo.CONNECTION_RESET_ORIGIN_CRASH_HANDLER;
    }

    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object, kqy] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object, kqy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kqy] */
    @Override // defpackage.rzb
    public final void a(android.content.Context context, rza rzaVar) {
        android.hardware.usb.UsbManager usbManager = (android.hardware.usb.UsbManager) context.getSystemService("usb");
        usbManager.getClass();
        if (defpackage.actq.i()) {
            android.widget.Toast.makeText(context, java.lang.String.format(java.util.Locale.ENGLISH, "USB reset triggered using method %s", rzaVar), 1).show();
        }
        switch (rzaVar.ordinal()) {
            case 1:
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    for (android.hardware.usb.UsbPort usbPort : usbManager.getPorts()) {
                        ((defpackage.yqj) a.l().ai((char) 3413)).u("Requesting USB port reset");
                        try {
                            defpackage.dlv.n(new defpackage.kqu(usbPort, 0)).get();
                        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3414)).u("Failed to get futures");
                        }
                    }
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 3396)).u("Can't call resetPort on Android S-");
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.yqj) a.l().ai((char) 3412)).u("Requesting USB gadget reset");
                usbManager.resetUsbGadget();
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                for (android.hardware.usb.UsbPort usbPort2 : usbManager.getPorts()) {
                    ((defpackage.yqj) a.l().ai((char) 3415)).u("Requesting USB roles reset");
                    usbPort2.setRoles(1, 1);
                }
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
                defpackage.yqm yqmVar = a;
                ((defpackage.yqj) yqmVar.l().ai((char) 3410)).u("Requesting USB function reset");
                defpackage.kqw kqwVar = defpackage.kqw.a;
                switch (rzaVar.ordinal()) {
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        kqwVar = defpackage.kqw.b;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        kqwVar = defpackage.kqw.c;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        kqwVar = defpackage.kqw.d;
                        break;
                    case 9:
                        kqwVar = defpackage.kqw.e;
                        break;
                    case 10:
                        kqwVar = defpackage.kqw.f;
                        break;
                    default:
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3411)).y("Unknown reset method %s", rzaVar.name());
                        break;
                }
                java.lang.Long l = (java.lang.Long) f.get(kqwVar);
                l.getClass();
                usbManager.setCurrentFunctions(l.longValue());
                break;
            case 11:
                if (this.h.f()) {
                    this.h.b().e();
                }
                defpackage.xyn xynVarH = defpackage.xyn.h((kqy) a$.ExternalSyntheticApiModelOutline2.m(this.g, context));
                this.h = xynVarH;
                xynVarH.b().d();
                if (this.i != null) {
                    this.h.b().a(this.i);
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kqy] */
    @Override // defpackage.rzb
    public final void b(defpackage.rzs rzsVar) {
        this.i = rzsVar;
        if (this.h.f()) {
            this.h.b().a(rzsVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rzb
    public final void c(android.content.Context context, long j) throws wfo {
        int iH;
        defpackage.wfp.c();
        if (android.os.Build.VERSION.SDK_INT < 30) {
            ((defpackage.yqj) a.l().ai((char) 3409)).u("USB reset not available on this version of Android, so recovery not possible");
            return;
        }
        defpackage.whw whwVarE = e(context);
        try {
            defpackage.kqp kqpVar = (defpackage.kqp) whwVarE.c().get();
            java.lang.String str = this.d;
            defpackage.kqq kqqVar = defpackage.kqq.a;
            defpackage.kqq kqqVar2 = (defpackage.kqq) kqpVar.b.get(str);
            if (kqqVar2 == null) {
                kqqVar2 = kqqVar;
            }
            defpackage.abqv abqvVar = kqqVar2.c;
            if (abqvVar == null) {
                abqvVar = defpackage.abqv.a;
            }
            long jA = defpackage.abrx.a(abqvVar);
            java.lang.String str2 = kqqVar2.d;
            boolean z = kqqVar2.e;
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(3404)).S("Reading timestamp: %d, origin: %s, recoveryRecorded: %b, callerKey: %s", java.lang.Long.valueOf(jA), str2, java.lang.Boolean.valueOf(z), str);
            if (jA <= 0) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3407)).u("Couldn't read last USB reset start");
                return;
            }
            if (z) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3406)).u("Recovery already recorded once, so not recording again");
                return;
            }
            whwVarE.a(new phr(this, kqqVar2, 1, (byte[]) null), defpackage.zgt.INSTANCE);
            j$.time.Duration durationMinusMillis = j$.time.Duration.ofMillis(j).minusMillis(jA);
            if (durationMinusMillis.toSeconds() > e.toSeconds()) {
                ((defpackage.yqj) yqmVar.l().ai(3405)).x("Last start duration of %d seconds considered too old to be a successful USB recovery", durationMinusMillis.toSeconds());
                return;
            }
            defpackage.ysr.bk(!str2.isEmpty(), "If startMillis is set, originString must also be set");
            try {
                iH = defpackage.rox.h(str2.toUpperCase(java.util.Locale.US));
            } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e2) {
                defpackage.rox.p("GH.ResetHandler", e2, "Unknown origin %s", str2);
                iH = 0;
            }
            defpackage.rqt rqtVarA = defpackage.rqt.a(context);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.LIFECYCLE_RECOVERY, defpackage.zbd.oT);
            rrvVarH.m(defpackage.acbk.G);
            rrvVarH.u(durationMinusMillis.toMillis());
            if (iH == 0) {
                throw null;
            }
            rrvVarH.s(f(iH));
            rqtVarA.c(rrvVarH.l());
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e3) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e3)).ai((char) 3408)).u("Failed to read from connection reset store");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rzb
    public final void d(android.content.Context context, int i, int i2, rza rzaVar) throws wfo {
        defpackage.wfp.c();
        if (i != 1) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 3395)).u("Connect type is not USB so cannot schedule a reset");
            return;
        }
        j$.time.Instant instantNow = j$.time.Instant.now();
        try {
            for (defpackage.kqq kqqVar : j$.util.DesugarCollections.unmodifiableMap(((defpackage.kqp) e(context).c().get()).b).values()) {
                if ((kqqVar.b & 1) != 0 && (rzaVar.name().equals(kqqVar.f) || !defpackage.rox.g(i2).equals(kqqVar.d))) {
                    defpackage.abqv abqvVar = kqqVar.c;
                    if (abqvVar == null) {
                        abqvVar = defpackage.abqv.a;
                    }
                    j$.time.Duration durationBetween = j$.time.Duration.between(defpackage.acmh.z(abqvVar), instantNow);
                    long seconds = durationBetween.toSeconds();
                    j$.time.Duration duration = c;
                    if (seconds < duration.toSeconds()) {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(3393)).G("Last reset was done %d seconds ago, but minimum elapsed time must be %d seconds", durationBetween.toSeconds(), duration.toSeconds());
                        return;
                    }
                }
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai(3403)).R("Writing timestamp: %d, origin: %s, recoveryRecorded: false, callerKey: %s", java.lang.Long.valueOf(instantNow.toEpochMilli()), defpackage.rox.g(i2), this.d);
            e(context).a(new kqv(this, instantNow, i2, rzaVar), defpackage.zgt.INSTANCE);
            defpackage.rqt rqtVarA = defpackage.rqt.a(context);
            defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
            defpackage.zbe zbeVar = defpackage.zbe.LIFECYCLE_RECOVERY;
            defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.oS);
            rrvVarH.m(defpackage.acbk.G);
            rrvVarH.s(f(i2));
            rqtVarA.c(rrvVarH.l());
            if (rzaVar == rza.a) {
                ((defpackage.yqj) yqmVar.l().ai((char) 3391)).u("No USB reset method set");
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3392)).y("Requesting USB reset method %s", rzaVar);
            a(context, rzaVar);
            defpackage.rqt.a(context).c(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.oV).l());
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 3394)).u("Failed to read from connection reset store");
        }
    }
}
