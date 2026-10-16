package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ofj extends defpackage.omf {
    public final /* synthetic */ defpackage.ofl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofj(defpackage.ofl oflVar) {
        super(null);
        this.a = oflVar;
    }

    private final void A(com.google.android.apps.auto.components.telecom.call.CarCall carCall, defpackage.oeg oegVar) {
        int i = carCall.a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        defpackage.ofl oflVar = this.a;
        java.util.Map map = oflVar.f;
        defpackage.oeg oegVar2 = (defpackage.oeg) map.get(numValueOf);
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5657)).R("Call state for %d changed from %s to %s", numValueOf, oegVar2, oegVar);
        if (oegVar == defpackage.oeg.DISCONNECTED) {
            map.remove(numValueOf);
        } else {
            map.put(numValueOf, oegVar);
        }
        if (!oegVar.equals(oegVar2)) {
            oflVar.K();
        }
        if (defpackage.oeh.a().N(oegVar2, oegVar) || defpackage.oeh.a().O(oegVar2, oegVar) || defpackage.oeh.a().C(oegVar2, oegVar) || defpackage.oeh.a().K(oegVar2, oegVar)) {
            oflVar.e.postDelayed(new ofi(oflVar, oegVar), defpackage.acrf.c());
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.ag);
        rrvVarH.p(defpackage.mkc.R().b(carCall));
        rrvVarH.h(i);
        defpackage.abor aborVarF = rrvVarH.F();
        if (oegVar2 != null) {
            aborVarF.t();
            defpackage.zas zasVar = (defpackage.zas) aborVarF.b;
            defpackage.zas zasVar2 = defpackage.zas.a;
            zasVar.b |= 2;
            zasVar.d = oegVar2.l;
        }
        int i2 = oegVar.l;
        aborVarF.t();
        defpackage.zas zasVar3 = (defpackage.zas) aborVarF.b;
        defpackage.zas zasVar4 = defpackage.zas.a;
        zasVar3.b |= 1;
        zasVar3.c = i2;
        defpackage.omf.u().F(rrvVarH.l());
    }

    private static final android.bluetooth.BluetoothClass B(android.bluetooth.BluetoothDevice bluetoothDevice) {
        try {
            return bluetoothDevice.getBluetoothClass();
        } catch (java.lang.SecurityException unused) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5634)).u("device class not available due to missing permissions");
            return null;
        }
    }

    private final int C(android.bluetooth.BluetoothDevice bluetoothDevice) {
        java.lang.String str = this.a.i;
        if (str != null && str.equals(bluetoothDevice.getAddress())) {
            return 5;
        }
        try {
            byte[] bArrB = defpackage.mkc.J().b(bluetoothDevice);
            if (bArrB == null) {
                return 6;
            }
            java.lang.String str2 = new java.lang.String(bArrB);
            int iHashCode = str2.hashCode();
            if (iHashCode == -1085510111) {
                return str2.equals("Default") ? 2 : 1;
            }
            if (iHashCode != 83350703) {
                return (iHashCode == 104438316 && str2.equals("Untethered Headset")) ? 4 : 1;
            }
            return str2.equals("Watch") ? 3 : 1;
        } catch (java.lang.NoSuchMethodError unused) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5639)).u("device metadata is not available due to missing API");
            return 6;
        } catch (java.lang.SecurityException unused2) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5638)).u("device metadata is not available due to missing permissions");
            return 6;
        }
    }

    private static final yzt D(android.bluetooth.BluetoothClass bluetoothClass, int i, int i2) {
        defpackage.abor aborVarN = yzt.a.n();
        if (bluetoothClass != null) {
            int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
            aborVarN.t();
            yzt yztVar = aborVarN.b;
            yztVar.b |= 1;
            yztVar.c = majorDeviceClass;
            int deviceClass = bluetoothClass.getDeviceClass();
            aborVarN.t();
            yzt yztVar2 = aborVarN.b;
            yztVar2.b |= 2;
            yztVar2.d = deviceClass;
        }
        aborVarN.t();
        yzt yztVar3 = aborVarN.b;
        yztVar3.e = i - 1;
        yztVar3.b |= 4;
        aborVarN.t();
        yzt yztVar4 = aborVarN.b;
        yztVar4.b |= 8;
        yztVar4.f = i2;
        return aborVarN.q();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    private final j$.util.Optional p() throws wfo {
        java.util.List listL = this.a.l();
        if (listL.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.h()).ai((char) 5637)).u("No audio routes available. Skipping audio route configuration");
            return j$.util.Optional.empty();
        }
        if (defpackage.jrj.a()) {
            j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(defpackage.ygw.r(2, 4));
            listL.getClass();
            if (stream.noneMatch(new defpackage.mpw(listL, 9))) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5636)).u("No high priority audio routes available. Skipping audio route configuration.");
                return j$.util.Optional.empty();
            }
        }
        java.lang.Integer num = (java.lang.Integer) listL.get(0);
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5635)).w("Selected audioRoute=0x%x", num.intValue());
        return j$.util.Optional.of(num);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    private final void y(defpackage.zbd zbdVar, defpackage.zbd zbdVar2, boolean z) throws wfo {
        j$.util.Optional optionalOfNullable;
        defpackage.ofl oflVar = this.a;
        if (oflVar.k().size() > 1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5646)).u("Call already in progress. Skipping audio route configuration.");
            return;
        }
        j$.util.Optional optionalP = p();
        if (z) {
            mlc mlcVar = new mlc(this, 4);
            if (true == optionalP.isPresent()) {
                java.lang.Object obj = optionalP.get();
                java.lang.Object obj2 = mlcVar.a;
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5640)).y("Forcing audioRoute=0x%x", obj);
                ((defpackage.ofj) obj2).a.t(((java.lang.Integer) obj).intValue());
            }
        }
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.PHONE_CALL;
        miv mivVar = new miv(zbdVar, 8);
        if (true != optionalP.isPresent()) {
            optionalOfNullable = optionalP;
        } else {
            optionalP.get();
            optionalOfNullable = j$.util.Optional.ofNullable(mivVar.a);
        }
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, (defpackage.zbd) optionalOfNullable.orElse(zbdVar2));
        defpackage.abor aborVarF = rrvVarH.F();
        int i = oflVar.g;
        aborVarF.t();
        defpackage.zas zasVar = (defpackage.zas) aborVarF.b;
        defpackage.zas zasVar2 = defpackage.zas.a;
        zasVar.b |= 2;
        zasVar.d = i;
        aborVarF.getClass();
        mlc mlcVar2 = new mlc(aborVarF, 5);
        if (true == optionalP.isPresent()) {
            java.lang.Object obj3 = optionalP.get();
            java.lang.Object obj4 = mlcVar2.a;
            int iIntValue = ((java.lang.Integer) obj3).intValue();
            defpackage.abor aborVar = (defpackage.abor) obj4;
            aborVar.t();
            defpackage.zas zasVar3 = (defpackage.zas) aborVar.b;
            zasVar3.b |= 1;
            zasVar3.c = iIntValue;
        }
        defpackage.omf.u().F(rrvVarH.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    private final void z(defpackage.zbd zbdVar, defpackage.zbd zbdVar2) throws wfo {
        defpackage.abor aborVarF;
        defpackage.ofl oflVar = this.a;
        if (oflVar.k().size() > 1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5650)).u("Call already in progress. Skipping audio route configuration.");
            return;
        }
        java.lang.Integer num = null;
        java.lang.Integer num2 = (java.lang.Integer) p().orElse((java.lang.Object) null);
        if (num2 != null && num2.intValue() == 2) {
            defpackage.oee oeeVar = oflVar.c;
            android.bluetooth.BluetoothDevice bluetoothDevice = (android.bluetooth.BluetoothDevice) j$.util.Collection.-EL.stream(jx$.ExternalSyntheticApiModelOutline3.m(oeeVar.d())).filter(new defpackage.mpw(this, 10)).findAny().orElse((java.lang.Object) null);
            if (bluetoothDevice != null) {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5649)).y("Forcing bluetoothDevice=%s", bluetoothDevice.getAddress());
                try {
                    oeeVar.m(bluetoothDevice);
                } catch (java.lang.IllegalArgumentException e) {
                    defpackage.ofl.I(e);
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5648)).u("Car is not connected. Skipping audio route configuration.");
            }
            if (num == null) {
                zbdVar = zbdVar2;
            }
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, zbdVar);
            aborVarF = rrvVarH.F();
            int i = this.a.g;
            aborVarF.t();
            defpackage.zas zasVar = (defpackage.zas) aborVarF.b;
            defpackage.zas zasVar2 = defpackage.zas.a;
            zasVar.b |= 2;
            zasVar.d = i;
            if (num != null) {
                int iIntValue = num.intValue();
                aborVarF.t();
                defpackage.zas zasVar3 = (defpackage.zas) aborVarF.b;
                zasVar3.b |= 1;
                zasVar3.c = iIntValue;
            }
            defpackage.omf.u().F(rrvVarH.l());
        }
        if (num2 != null && num2.intValue() != 2) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai((char) 5647)).y("Forcing audioRoute=0x%x", num2);
            this.a.t(num2.intValue());
        }
        num = num2;
        if (num == null) {
            zbdVar = zbdVar2;
        }
        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, zbdVar);
        aborVarF = rrvVarH2.F();
        int i2 = this.a.g;
        aborVarF.t();
        defpackage.zas zasVar4 = (defpackage.zas) aborVarF.b;
        defpackage.zas zasVar5 = defpackage.zas.a;
        zasVar4.b |= 2;
        zasVar4.d = i2;
        if (num != null) {
            int iIntValue2 = num.intValue();
            aborVarF.t();
            defpackage.zas zasVar6 = (defpackage.zas) aborVarF.b;
            zasVar6.b |= 1;
            zasVar6.c = iIntValue2;
        }
        defpackage.omf.u().F(rrvVarH2.l());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.omf
    public final void a(com.google.android.apps.auto.components.telecom.call.CarCall carCall) throws wfo {
        defpackage.zbd zbdVar;
        defpackage.yqm yqmVar = defpackage.ofl.a;
        defpackage.ypu ypuVarF = yqmVar.f();
        int i = carCall.a;
        ((defpackage.yqj) ((defpackage.yqj) ypuVarF).ai((char) 5653)).w("onCallAdded(%d)", i);
        if (defpackage.mkc.Q().g(carCall) && android.os.Build.VERSION.SDK_INT <= 33) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5654)).w("Closing call(%d) is requested by Do Not Disturb", i);
            this.a.y(i);
            defpackage.mkc.Q().b(carCall);
        }
        defpackage.ofl oflVar = this.a;
        if (oflVar.l().isEmpty()) {
            oflVar.j = true;
        } else if (android.os.Build.VERSION.SDK_INT < 30 || oflVar.i == null) {
            y(defpackage.zbd.Dx, defpackage.zbd.Dy, true);
        } else {
            z(defpackage.zbd.EP, defpackage.zbd.EQ);
        }
        defpackage.xzg xzgVar = oflVar.d;
        if (!xzgVar.a) {
            defpackage.omf.u().F(defpackage.oeh.a().j(carCall, defpackage.zbe.PHONE_CALL, oflVar.i != null ? defpackage.zbd.Fa : defpackage.zbd.Fb).l());
            xzgVar.e();
        }
        int i2 = carCall.e;
        A(carCall, defpackage.oeg.a(i2));
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.oei oeiVarA = defpackage.oeh.a();
        defpackage.zbe zbeVar = defpackage.zbe.PHONE_CALL;
        oimVarU.F(oeiVarA.j(carCall, zbeVar, defpackage.zbd.Ep).l());
        if (i2 == 9 || i2 == 1) {
            defpackage.oim oimVarU2 = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, defpackage.zbd.aH);
            rrvVarH.p(defpackage.mkc.R().b(carCall));
            oimVarU2.F(rrvVarH.l());
        }
        if (defpackage.oeh.a().G(carCall)) {
            android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCall);
            defpackage.oim oimVarU3 = defpackage.omf.u();
            defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.Eh);
            rrvVarH2.p(componentNameB);
            oimVarU3.F(rrvVarH2.l());
            android.content.Context context = oflVar.b;
            defpackage.zbd zbdVar2 = defpackage.zbd.a;
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            int ringerMode = audioManager.getRingerMode();
            if (ringerMode == 0) {
                zbdVar = defpackage.zbd.Eo;
            } else if (ringerMode != 1) {
                zbdVar = ringerMode != 2 ? zbdVar2 : defpackage.zbd.Em;
            } else {
                zbdVar = defpackage.zbd.En;
            }
            if (zbdVar != zbdVar2) {
                defpackage.oim oimVarU4 = defpackage.omf.u();
                defpackage.rrv rrvVarH3 = defpackage.rrw.h(yzdVar, zbeVar, zbdVar);
                rrvVarH3.p(componentNameB);
                oimVarU4.F(rrvVarH3.l());
            }
            java.lang.String strU = defpackage.oeh.a().u(carCall);
            if (!defpackage.mkc.R().t(carCall) && android.text.TextUtils.isEmpty(defpackage.oeh.a().n(context.getContentResolver(), strU))) {
                defpackage.oim oimVarU5 = defpackage.omf.u();
                defpackage.rrv rrvVarH4 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.Ei);
                rrvVarH4.p(componentNameB);
                oimVarU5.F(rrvVarH4.l());
                java.lang.String str = carCall.f.b;
                if (!android.text.TextUtils.isEmpty(str)) {
                    defpackage.oim oimVarU6 = defpackage.omf.u();
                    defpackage.rrv rrvVarH5 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.Ej);
                    rrvVarH5.p(componentNameB);
                    oimVarU6.F(rrvVarH5.l());
                    if (android.text.TextUtils.equals(str, strU)) {
                        defpackage.zbd zbdVar3 = defpackage.zbd.El;
                        defpackage.oim oimVarU7 = defpackage.omf.u();
                        defpackage.rrv rrvVarH6 = defpackage.rrw.h(yzdVar, zbeVar, zbdVar3);
                        rrvVarH6.p(componentNameB);
                        oimVarU7.F(rrvVarH6.l());
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) context.getSystemService("phone");
                        if (!android.text.TextUtils.isEmpty(strU) && a$.ExternalSyntheticApiModelOutline0.m(str, strU, telephonyManager.getNetworkCountryIso())) {
                            defpackage.oim oimVarU8 = defpackage.omf.u();
                            defpackage.rrv rrvVarH7 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.Ek);
                            rrvVarH7.p(componentNameB);
                            oimVarU8.F(rrvVarH7.l());
                        }
                    }
                }
            }
        }
        if (defpackage.acqn.k()) {
            android.content.Context context2 = oflVar.b;
            defpackage.lby lbyVar = defpackage.lby.p;
            context2.getClass();
            lbyVar.e(context2);
        }
        if (defpackage.oeh.a().G(carCall) && defpackage.ogv.d().f() && defpackage.mkc.R().b(carCall).equals(defpackage.mkt.b)) {
            thi thiVar = thi.a;
            defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
            thg thgVar = new thg(j$.time.Duration.ofSeconds(20L));
            aiuw aiuwVar = mkr.a;
            aiuw aiuwVar2 = mkr.a;
            aiuwVar2.getClass();
            java.util.Map map = thi.b;
            aiwg aiwgVar = (aiwg) map.remove(tgfVar);
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            defpackage.tgg.a.b(tgfVar);
            map.put(tgfVar, ahoc.d(aiuwVar2, (defpackage.afdo) null, 0, new defpackage.nle(tgfVar, thgVar, (defpackage.afdk) null, 16), 3));
        }
    }

    @Override // defpackage.omf
    public final void b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5655)).w("onCallRemoved(%d)", carCall.a);
        defpackage.ofl oflVar = this.a;
        if (oflVar.c.g().isEmpty() && oflVar.d.a) {
            oflVar.J(carCall);
        }
        A(carCall, defpackage.oeg.DISCONNECTED);
        if (oflVar.k().isEmpty()) {
            oflVar.g = 0;
            oflVar.h = j$.util.Optional.empty();
            oflVar.j = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Code duplicated, block: B:75:0x0151  */
    @Override // defpackage.omf
    public final void c(com.google.android.apps.auto.components.telecom.call.CarCall carCall, int i) throws wfo {
        defpackage.zbd zbdVar;
        defpackage.mkc.Q().f(carCall);
        defpackage.oeg oegVarA = defpackage.oeg.a(i);
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5656);
        int i2 = carCall.a;
        yqjVar.D("Call state for %d changed to %s", i2, oegVarA);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i2);
        defpackage.ofl oflVar = this.a;
        defpackage.oeg oegVar = (defpackage.oeg) oflVar.f.get(numValueOf);
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG != null) {
            android.content.ComponentName componentNameA = defpackage.mkt.b;
            if (defpackage.mkc.R().t(carCallG)) {
                android.content.ComponentName componentNameB = defpackage.mkc.R().b(carCallG);
                android.content.Context context = oflVar.b;
                defpackage.oej oejVarR = defpackage.mkc.R();
                context.getClass();
                componentNameA = oejVarR.a(context, componentNameB.getPackageName());
            }
            if (componentNameA != null && (oegVarA == defpackage.oeg.CONNECTING || oegVarA == defpackage.oeg.DIALING || oegVarA == defpackage.oeg.ACTIVE)) {
                defpackage.lhc.a().f(defpackage.mqg.PHONE, componentNameA);
            }
        }
        defpackage.oeg oegVar2 = defpackage.oeg.ACTIVE;
        if (j$.util.Objects.equals(oegVar, oegVar2) && (j$.util.Objects.equals(oegVarA, defpackage.oeg.DISCONNECTED) || j$.util.Objects.equals(oegVarA, defpackage.oeg.DISCONNECTING))) {
            ngv ngvVar = ngu.d;
            if (defpackage.mkc.R().u() && defpackage.mkc.R().t(carCall)) {
                ngvVar = new ngv(defpackage.mkc.R().b(carCall));
            }
            defpackage.ngr.a().c(ngvVar);
        }
        if (defpackage.oeh.a().C(oegVar, oegVarA)) {
            if (android.os.Build.VERSION.SDK_INT < 30 || oflVar.i == null) {
                y(defpackage.zbd.DB, defpackage.zbd.DC, true);
            } else {
                z(defpackage.zbd.EN, defpackage.zbd.EO);
            }
        } else if (defpackage.oeh.a().N(oegVar, oegVarA)) {
            if (android.os.Build.VERSION.SDK_INT < 30 || oflVar.i == null) {
                y(defpackage.zbd.Dz, defpackage.zbd.DA, android.os.Build.VERSION.SDK_INT >= 30);
            } else {
                z(defpackage.zbd.ET, defpackage.zbd.EU);
            }
        } else if (defpackage.oeh.a().K(oegVar, oegVarA)) {
            if (android.os.Build.VERSION.SDK_INT < 30 || oflVar.i == null) {
                y(defpackage.zbd.DD, defpackage.zbd.DE, true);
            } else {
                z(defpackage.zbd.EK, defpackage.zbd.EL);
            }
        }
        if (oegVar == defpackage.oeg.RINGING) {
            if (oegVarA == oegVar2) {
                zbdVar = defpackage.zbd.Ff;
            } else if (oegVarA == defpackage.oeg.DISCONNECTED || oegVarA == defpackage.oeg.DISCONNECTING) {
                zbdVar = defpackage.zbd.Fg;
            }
            if (zbdVar != null) {
                defpackage.omf.u().F(defpackage.oeh.a().j(carCall, defpackage.zbe.PHONE_CALL, zbdVar).l());
            }
        } else {
            if (oegVar != defpackage.oeg.DIALING) {
                zbdVar = null;
            } else if (oegVarA == oegVar2) {
                zbdVar = defpackage.zbd.Fh;
            } else if (oegVarA == defpackage.oeg.DISCONNECTED || oegVarA == defpackage.oeg.DISCONNECTING) {
                zbdVar = defpackage.zbd.Fi;
            }
            if (zbdVar != null) {
                defpackage.omf.u().F(defpackage.oeh.a().j(carCall, defpackage.zbe.PHONE_CALL, zbdVar).l());
            }
        }
        A(carCall, oegVarA);
        if (j$.util.Objects.equals(oegVarA, defpackage.oeg.DISCONNECTED)) {
            android.telecom.DisconnectCause disconnectCause = carCall.f.c;
            if (disconnectCause.getCode() == 5) {
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.Eg);
                rrvVarH.p(defpackage.mkc.R().b(carCall));
                oimVarU.F(rrvVarH.l());
            }
            defpackage.oim oimVarU2 = defpackage.omf.u();
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, defpackage.zbd.Eq);
            rrvVarH2.s = defpackage.xyn.h(java.lang.Integer.valueOf(disconnectCause.getCode()));
            rrvVarH2.h(i2);
            rrvVarH2.p(defpackage.mkc.R().b(carCall));
            oimVarU2.F(rrvVarH2.l());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.omf
    public final void e(android.telecom.CallAudioState callAudioState) throws wfo {
        defpackage.zbd zbdVar;
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            defpackage.rrv rrvVarK = defpackage.oeh.a().k(defpackage.zbe.PHONE_CALL, defpackage.zbd.DH);
            defpackage.abor aborVarD = rrvVarK.D();
            int route = callAudioState.getRoute();
            aborVarD.t();
            defpackage.yzu yzuVar = (defpackage.yzu) aborVarD.b;
            defpackage.yzu yzuVar2 = defpackage.yzu.a;
            yzuVar.b |= 2;
            yzuVar.e = route;
            int supportedRouteMask = callAudioState.getSupportedRouteMask();
            aborVarD.t();
            defpackage.yzu yzuVar3 = (defpackage.yzu) aborVarD.b;
            yzuVar3.b |= 4;
            yzuVar3.f = supportedRouteMask;
            android.bluetooth.BluetoothDevice bluetoothDeviceM = jx$.ExternalSyntheticApiModelOutline3.m(callAudioState);
            if (bluetoothDeviceM != null) {
                try {
                    android.bluetooth.BluetoothClass bluetoothClassB = B(bluetoothDeviceM);
                    int iC = C(bluetoothDeviceM);
                    int iA = defpackage.mkc.J().a(bluetoothDeviceM);
                    if (bluetoothClassB != null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5645)).T("active device: %x %x. type: %s. battery: %d. addr: %s", java.lang.Integer.valueOf(bluetoothClassB.getMajorDeviceClass()), java.lang.Integer.valueOf(bluetoothClassB.getDeviceClass()), defpackage.ytn.p(iC), java.lang.Integer.valueOf(iA), bluetoothDeviceM.getAddress());
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5644)).R("active device: no device class specified. type: %s. battery: %d. addr: %s", defpackage.ytn.p(iC), java.lang.Integer.valueOf(iA), bluetoothDeviceM.getAddress());
                    }
                    defpackage.abor aborVarD2 = rrvVarK.D();
                    yzt yztVarD = D(bluetoothClassB, iC, iA);
                    aborVarD2.t();
                    defpackage.yzu yzuVar4 = (defpackage.yzu) aborVarD2.b;
                    yztVarD.getClass();
                    yzuVar4.c = yztVarD;
                    yzuVar4.b |= 1;
                } catch (java.lang.IllegalArgumentException e) {
                    defpackage.ofl.I(e);
                }
            }
            for (android.bluetooth.BluetoothDevice bluetoothDevice : jx$.ExternalSyntheticApiModelOutline3.m(callAudioState)) {
                try {
                    android.bluetooth.BluetoothClass bluetoothClassB2 = B(bluetoothDevice);
                    int iC2 = C(bluetoothDevice);
                    int iA2 = defpackage.mkc.J().a(bluetoothDevice);
                    if (bluetoothClassB2 != null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5643)).T("found device: %x %x. type: %s. battery: %d. addr: %s", java.lang.Integer.valueOf(bluetoothClassB2.getMajorDeviceClass()), java.lang.Integer.valueOf(bluetoothClassB2.getDeviceClass()), defpackage.ytn.p(iC2), java.lang.Integer.valueOf(iA2), bluetoothDevice.getAddress());
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.ofl.a.f()).ai(5642)).R("found device: no device class specified. type: %s. battery: %d. addr: %s", defpackage.ytn.p(iC2), java.lang.Integer.valueOf(iA2), bluetoothDevice.getAddress());
                    }
                    defpackage.abor aborVarD3 = rrvVarK.D();
                    yzt yztVarD2 = D(bluetoothClassB2, iC2, iA2);
                    aborVarD3.t();
                    defpackage.yzu yzuVar5 = (defpackage.yzu) aborVarD3.b;
                    yztVarD2.getClass();
                    defpackage.abpj abpjVar = yzuVar5.d;
                    if (!abpjVar.c()) {
                        yzuVar5.d = defpackage.abox.I(abpjVar);
                    }
                    yzuVar5.d.add(yztVarD2);
                } catch (java.lang.IllegalArgumentException e2) {
                    defpackage.ofl.I(e2);
                }
            }
            defpackage.omf.u().F(rrvVarK.l());
        }
        defpackage.ofl oflVar = this.a;
        int i = oflVar.g;
        oflVar.g = callAudioState.getRoute();
        defpackage.yqm yqmVar = defpackage.ofl.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5651)).B("Audio route changed from %d to %d", i, callAudioState.getRoute());
        int route2 = callAudioState.getRoute();
        if (route2 == 0) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5641)).u("Should not receive audio change to state uninitialized");
            route2 = 0;
        }
        boolean z = route2 == 2;
        if (i == 0) {
            zbdVar = z ? defpackage.zbd.DT : defpackage.zbd.DU;
        } else {
            boolean z2 = i == 2;
            zbdVar = (!z2 || z) ? (z2 || !z) ? null : defpackage.zbd.DR : defpackage.zbd.DS;
        }
        if (zbdVar != null) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CALL, zbdVar).l());
        }
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.PHONE_CALL;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.ai);
        defpackage.abor aborVarF = rrvVarH.F();
        aborVarF.t();
        defpackage.zas zasVar = (defpackage.zas) aborVarF.b;
        defpackage.zas zasVar2 = defpackage.zas.a;
        zasVar.b |= 2;
        zasVar.d = i;
        aborVarF.t();
        defpackage.zas zasVar3 = (defpackage.zas) aborVarF.b;
        zasVar3.b |= 1;
        zasVar3.c = route2;
        defpackage.omf.u().F(rrvVarH.l());
        j$.util.Optional optional = oflVar.h;
        oflVar.h = j$.util.Optional.of(java.lang.Integer.valueOf(callAudioState.getSupportedRouteMask()));
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5652)).B("Audio route mask changed from %d to %d", ((java.lang.Integer) optional.orElse(0)).intValue(), callAudioState.getSupportedRouteMask());
        int supportedRouteMask2 = callAudioState.getSupportedRouteMask();
        defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.aS);
        mlc mlcVar = new mlc(rrvVarH2, 3);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            defpackage.abor aborVarF2 = ((defpackage.rrv) mlcVar.a).F();
            int iIntValue = ((java.lang.Integer) obj).intValue();
            aborVarF2.t();
            defpackage.zas zasVar4 = (defpackage.zas) aborVarF2.b;
            zasVar4.b = 2 | zasVar4.b;
            zasVar4.d = iIntValue;
        }
        defpackage.abor aborVarF3 = rrvVarH2.F();
        aborVarF3.t();
        defpackage.zas zasVar5 = (defpackage.zas) aborVarF3.b;
        zasVar5.b |= 1;
        zasVar5.c = supportedRouteMask2;
        defpackage.omf.u().F(rrvVarH2.l());
        if (oflVar.j) {
            if (android.os.Build.VERSION.SDK_INT < 30 || oflVar.i == null) {
                y(defpackage.zbd.DF, defpackage.zbd.DG, android.os.Build.VERSION.SDK_INT >= 30);
            } else {
                z(defpackage.zbd.ER, defpackage.zbd.ES);
            }
            oflVar.j = false;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCallG = defpackage.oeh.a().g();
        if (carCallG == null || !defpackage.oeh.a().I(carCallG.e)) {
            return;
        }
        defpackage.mnw mnwVarO = defpackage.lxy.o();
        java.util.Iterator it = mnwVarO.b(defpackage.zaw.CALL).iterator();
        while (it.hasNext()) {
            mnwVarO.l((mog) it.next());
        }
    }

    @Override // defpackage.omf
    public final void k(com.google.android.apps.auto.components.telecom.call.CarCall carCall, com.google.android.apps.auto.components.telecom.call.CarCall.Details details) {
        defpackage.mnw mnwVarO;
        mog mogVarA;
        if (defpackage.mkc.R().t(carCall) && defpackage.oeh.a().I(carCall.e) && (mogVarA = (mnwVarO = defpackage.lxy.o()).a(defpackage.zaw.CALL, carCall.a)) != null) {
            mnwVarO.l(mogVarA);
        }
    }
}
