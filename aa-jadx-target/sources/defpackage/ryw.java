package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class ryw implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ryw(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: sai */
    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:121:0x0385  */
    @Override // java.lang.Runnable
    public final void run() throws wfo, sai {
        long j;
        defpackage.rpm rpmVar;
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ryx ryxVar = (ryx) this.a;
                java.lang.Runnable runnable = ryxVar.j;
                android.os.Handler handler = ryxVar.e;
                handler.removeCallbacks(runnable);
                if (ryxVar.m) {
                    j = ryxVar.g;
                    if (j > 0) {
                        ryxVar.n = j;
                        ryxVar.m = false;
                    } else {
                        j = ryxVar.f;
                        ryxVar.n = j;
                    }
                } else {
                    j = ryxVar.f;
                    ryxVar.n = j;
                }
                handler.postDelayed(ryxVar.j, j);
                return;
            case 1:
                defpackage.wfp.c();
                java.lang.Object obj = this.a;
                defpackage.ryu ryuVar = (defpackage.ryu) obj;
                if (ryuVar.g) {
                    if (ryuVar.f && ryuVar.e < android.os.SystemClock.elapsedRealtime() - ryuVar.d) {
                        ryuVar.g();
                        ryuVar.f = false;
                        defpackage.omv.h(ryuVar.a, "com.google.android.gms.car.USB_ISSUE_FOUND", defpackage.rst.k, null);
                    }
                    ryuVar.b.postDelayed(new defpackage.ryw(obj, i), ryuVar.d);
                    return;
                }
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ryx ryxVar2 = (ryx) this.a;
                if (ryxVar2.l) {
                    if ((ryxVar2.d.getCurrentFunctions() & 2) != 0) {
                        ryx.a.l().ai(8571).u("Accessory connected, canceling device mode switch.");
                        return;
                    }
                    defpackage.yqk yqkVar = ryx.a;
                    yqkVar.l().ai(8570).x("No accessory mode connection within %d ms", ryxVar2.n);
                    if (ryxVar2.i) {
                        defpackage.omv.i(ryxVar2.c, defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE_TIMEOUT);
                    }
                    int i2 = ryxVar2.k;
                    ryxVar2.k = i2 + 1;
                    ajmp ajmpVar = ryx.q;
                    if (i2 < ((defpackage.ymx) ajmpVar.b).c) {
                        yqkVar.l().ai(8574).w("Attempting to switch to USB mode %d", i2);
                        ryxVar2.h(((java.lang.Long) ajmpVar.n(i2)).longValue());
                        ryxVar2.g();
                        ryxVar2.p = 2;
                        return;
                    }
                    yqkVar.l().ai(8573).u("Ran out of USB modes to attempt.");
                    ajnd ajndVar = ryxVar2.r;
                    if (ajndVar != null) {
                        java.lang.Object obj2 = ajndVar.a;
                        android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj2;
                        defpackage.omv.i(fragment.requireContext(), defpackage.yyn.INTERACTIVE_TROUBLESHOOTER_NO_RESOLUTION);
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("title_string_resource", 2132085429);
                        android.text.SpannedString spannedString = (android.text.SpannedString) fragment.requireContext().getText(2132085428);
                        android.text.SpannedString spannedString2 = new android.text.SpannedString(spannedString);
                        android.text.Annotation[] annotationArr = (android.text.Annotation[]) spannedString2.getSpans(0, spannedString2.length(), android.text.Annotation.class);
                        android.text.SpannableString spannableString = new android.text.SpannableString(spannedString);
                        for (android.text.Annotation annotation : annotationArr) {
                            if (annotation.getKey().equals("link")) {
                                if (annotation.getValue().equals("feedback")) {
                                    spannableString.setSpan(new mmd((com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment) obj2), spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
                                } else if (annotation.getValue().equals("help_center")) {
                                    spannableString.setSpan(new mme((com.google.android.apps.auto.components.settings.interactivetroubleshooter.UsbConfigFragment) obj2), spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 33);
                                }
                            }
                        }
                        bundle.putCharSequence("message_key", spannableString);
                        androidx.navigation.fragment.NavHostFragment.b(fragment).f(2131427447, bundle);
                    }
                    android.content.Context context = ryxVar2.c;
                    defpackage.omv.i(context, defpackage.yyn.USB_ISSUE_NO_ACCESSORY_MODE_FAILED_TO_FIND_USB_FUNCTION);
                    ryxVar2.p = 3;
                    defpackage.ryk.a(context).f();
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Runnable runnable2 = ((sah) this.a).a;
                defpackage.yqk yqkVar2 = saj.a;
                try {
                    runnable2.run();
                    return;
                } catch (java.lang.Throwable th) {
                    saj.a.g().p(th).ai(8604).u("Error occurred in periodic task.");
                    new defpackage.stq(android.os.Looper.getMainLooper()).post(new defpackage.ryw(th, 4));
                    throw new sai(th);
                }
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqk yqkVar3 = saj.a;
                throw new sai((java.lang.Throwable) this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.sau) this.a).o();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Object obj3 = this.a;
                if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                    defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s removeWindow", ((defpackage.sau) obj3).a);
                }
                try {
                    ((defpackage.sau) obj3).i.k();
                    break;
                } catch (android.os.RemoteException e) {
                    defpackage.rrx.b("CAR.CLIENT.WM.WIN", e, "finish RemoteException");
                }
                ((defpackage.sau) obj3).o();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.sau sauVar = (defpackage.sau) ((defpackage.qzx) this.a).a.get();
                if (sauVar != null) {
                    defpackage.rpm rpmVar2 = sauVar.g;
                    if (rpmVar2 != null) {
                        rpmVar2.x(null);
                    }
                    if (defpackage.omv.c("CAR.CLIENT.WM.WIN", 3)) {
                        defpackage.rrx.d(3, "CAR.CLIENT.WM.WIN", null, "%s onWindowRemoved", sauVar.a);
                    }
                    if (!sauVar.o && (rpmVar = sauVar.g) != null) {
                        rpmVar.n();
                    }
                    sauVar.t = false;
                    sauVar.n();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return;
            case 9:
                defpackage.sax saxVar = (defpackage.sax) this.a;
                java.util.Iterator it = new java.util.HashSet(saxVar.g.keySet()).iterator();
                while (it.hasNext()) {
                    saxVar.i((defpackage.rct) it.next());
                }
                return;
            case 10:
                ((sbo) this.a).a.k();
                return;
            case 11:
                defpackage.sbq sbqVar = (defpackage.sbq) this.a;
                sbqVar.c.removeCallbacks(sbqVar.b);
                defpackage.yqk yqkVar4 = com.google.android.gms.carsetup.CarSetupServiceImpl.a;
                sbqVar.d.i.h();
                return;
            case 12:
                ((sby) this.a).c();
                return;
            case 13:
                defpackage.sci sciVar = (defpackage.sci) this.a;
                java.util.concurrent.ScheduledFuture scheduledFuture = sciVar.g;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                sciVar.e.removeCallbacksAndMessages(null);
                sciVar.f.shutdownNow();
                return;
            case 14:
                rxy.m(((sff) this.a).a, yyt.d);
                return;
            case 15:
                com.google.android.gms.carsetup.frx.SetupFsm.a.f().ai(8824).u("AutoIntroState / broadcasting delayed acknowledgement due to phone unlock");
                ((sff) this.a).b.f("EVENT_INTRO_ACKNOWLEDGED", (android.os.Parcelable) null);
                return;
            case 16:
                com.google.android.gms.carsetup.frx.SetupFsm.a.g().ai(8823).u("Critical error: user didn't unlock to proceed within 30s.");
                ((sff) this.a).b.f("EVENT_INTRO_LOCK_TIMEOUT", (android.os.Parcelable) null);
                return;
            case 17:
                ((set) this.a).a.a.f();
                return;
            case 18:
                sgh.m.g().ai(8887).u("Critical error: user didn't unlock to proceed within 30s.");
                sgw sgwVar = ((sgh) this.a).r;
                sgwVar.getClass();
                if (sgwVar.c) {
                    return;
                }
                sgwVar.g.M(defpackage.zbe.FRX_PRESETUP_EXIT_CONDITIONS, defpackage.zbd.pV);
                sgwVar.g();
                return;
            case 19:
                java.lang.Object obj4 = this.a;
                sgp sgpVar = (sgp) obj4;
                sgpVar.c = true;
                sgpVar.b.c();
                ((sgs) obj4).c().h(12);
                return;
            default:
                defpackage.shp shpVar = ((defpackage.shu) this.a).g;
                if (shpVar != null) {
                    defpackage.yqk yqkVar5 = defpackage.shu.a;
                    yqkVar5.f().ai(8957).u("Tearing down connection");
                    if (shpVar.i == 1) {
                        shpVar.i = 2;
                        defpackage.rxo rxoVar = shpVar.f;
                        if (rxoVar == null) {
                            defpackage.rit ritVar = defpackage.rit.INSTANCE;
                            yqkVar5.h().ai(8959).u("Skipping stopping startup service when null");
                        } else {
                            try {
                                rxoVar.m(shpVar.b);
                            } catch (android.os.RemoteException e2) {
                                defpackage.shu.a.f().p(e2).ai(8958).y("Couldn't stop %s, but it could be fine.", shpVar.c);
                            }
                        }
                        break;
                    }
                    if (shpVar.i == 2) {
                        shpVar.i = 3;
                        defpackage.sqf.a().c(shpVar.h.b, shpVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ryw(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
