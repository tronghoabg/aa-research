package defpackage;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class oep extends ebf {
    public final /* synthetic */ oer a;

    public oep(oer oerVar) {
        this.a = oerVar;
    }

    private final Optional O() {
        List listL = this.a.l();
        if (listL.isEmpty()) {
            ((ype) ((ype) oer.a.h()).ai((char) 5611)).u("No audio routes available. Skipping audio route configuration");
            return Optional.empty();
        }
        if (jri.a()) {
            Stream stream = Collection.EL.stream(yfq.r(2, 4));
            listL.getClass();
            if (stream.noneMatch(new mqu(listL, 8))) {
                ((ype) ((ype) oer.a.f()).ai((char) 5610)).u("No high priority audio routes available. Skipping audio route configuration.");
                return Optional.empty();
            }
        }
        Integer num = (Integer) listL.get(0);
        ((ype) ((ype) oer.a.f()).ai((char) 5609)).w("Selected audioRoute=0x%x", num.intValue());
        return Optional.of(num);
    }

    private final void P(yzy yzyVar, yzy yzyVar2, boolean z) {
        Optional optionalOfNullable;
        oer oerVar = this.a;
        if (oerVar.k().size() > 1) {
            ((ype) ((ype) oer.a.f()).ai((char) 5620)).u("Call already in progress. Skipping audio route configuration.");
            return;
        }
        Optional optionalO = O();
        if (z) {
            mla mlaVar = new mla(this, 3);
            if (true == optionalO.isPresent()) {
                Object obj = optionalO.get();
                Object obj2 = mlaVar.a;
                ((ype) ((ype) oer.a.f()).ai((char) 5614)).y("Forcing audioRoute=0x%x", obj);
                ((oep) obj2).a.t(((Integer) obj).intValue());
            }
        }
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.PHONE_CALL;
        miq miqVar = new miq(yzyVar, 8);
        if (true != optionalO.isPresent()) {
            optionalOfNullable = optionalO;
        } else {
            optionalO.get();
            optionalOfNullable = Optional.ofNullable(miqVar.a);
        }
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, (yzy) optionalOfNullable.orElse(yzyVar2));
        abnp abnpVarF = rrbVarH.F();
        int i = oerVar.g;
        abnpVarF.t();
        yzn yznVar = (yzn) abnpVarF.b;
        yzn yznVar2 = yzn.a;
        yznVar.b |= 2;
        yznVar.d = i;
        abnpVarF.getClass();
        mla mlaVar2 = new mla(abnpVarF, 4);
        if (true == optionalO.isPresent()) {
            Object obj3 = optionalO.get();
            Object obj4 = mlaVar2.a;
            int iIntValue = ((Integer) obj3).intValue();
            abnp abnpVar = (abnp) obj4;
            abnpVar.t();
            yzn yznVar3 = (yzn) abnpVar.b;
            yznVar3.b |= 1;
            yznVar3.c = iIntValue;
        }
        ebf.j().F(rrbVarH.l());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q(defpackage.yzy r10, defpackage.yzy r11) {
        /*
            r9 = this;
            oer r0 = r9.a
            java.util.List r1 = r0.k()
            int r1 = r1.size()
            r2 = 1
            if (r1 <= r2) goto L1b
            yph r9 = defpackage.oer.a
            yop r9 = r9.f()
            java.lang.String r10 = "Call already in progress. Skipping audio route configuration."
            r11 = 5624(0x15f8, float:7.881E-42)
            defpackage.a.bs(r9, r10, r11)
            return
        L1b:
            j$.util.Optional r1 = r9.O()
            r3 = 0
            java.lang.Object r1 = r1.orElse(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = 2
            if (r1 == 0) goto L7c
            int r5 = r1.intValue()
            if (r5 != r4) goto L7c
            odk r0 = r0.c
            android.telecom.CallAudioState r5 = r0.d()
            java.util.Collection r5 = defpackage.jw$$ExternalSyntheticApiModelOutline3.m338m(r5)
            j$.util.stream.Stream r5 = j$.util.Collection.EL.stream(r5)
            mqu r6 = new mqu
            r7 = 9
            r6.<init>(r9, r7)
            j$.util.stream.Stream r5 = r5.filter(r6)
            j$.util.Optional r5 = r5.findAny()
            java.lang.Object r5 = r5.orElse(r3)
            android.bluetooth.BluetoothDevice r5 = (android.bluetooth.BluetoothDevice) r5
            if (r5 == 0) goto L6e
            yph r3 = defpackage.oer.a
            yop r3 = r3.f()
            java.lang.String r6 = r5.getAddress()
            r7 = 5623(0x15f7, float:7.88E-42)
            java.lang.String r8 = "Forcing bluetoothDevice=%s"
            defpackage.a.bF(r3, r8, r6, r7)
            r0.m(r5)     // Catch: java.lang.IllegalArgumentException -> L69
            goto L9a
        L69:
            r0 = move-exception
            defpackage.oer.I(r0)
            goto L9a
        L6e:
            yph r0 = defpackage.oer.a
            yop r0 = r0.f()
            java.lang.String r1 = "Car is not connected. Skipping audio route configuration."
            r5 = 5622(0x15f6, float:7.878E-42)
            defpackage.a.bs(r0, r1, r5)
            goto L9b
        L7c:
            if (r1 == 0) goto L9a
            int r0 = r1.intValue()
            if (r0 == r4) goto L9a
            yph r0 = defpackage.oer.a
            yop r0 = r0.f()
            java.lang.String r3 = "Forcing audioRoute=0x%x"
            r5 = 5621(0x15f5, float:7.877E-42)
            defpackage.a.bF(r0, r3, r1, r5)
            oer r0 = r9.a
            int r3 = r1.intValue()
            r0.t(r3)
        L9a:
            r3 = r1
        L9b:
            if (r3 != 0) goto L9e
            r10 = r11
        L9e:
            yxy r11 = defpackage.yxy.GEARHEAD
            yzz r0 = defpackage.yzz.PHONE_CALL
            rrb r10 = defpackage.rrc.h(r11, r0, r10)
            abnp r11 = r10.F()
            oer r9 = r9.a
            int r9 = r9.g
            r11.t()
            abnv r0 = r11.b
            yzn r0 = (defpackage.yzn) r0
            yzn r1 = defpackage.yzn.a
            int r1 = r0.b
            r1 = r1 | r4
            r0.b = r1
            r0.d = r9
            if (r3 == 0) goto Ld2
            int r9 = r3.intValue()
            r11.t()
            abnv r11 = r11.b
            yzn r11 = (defpackage.yzn) r11
            int r0 = r11.b
            r0 = r0 | r2
            r11.b = r0
            r11.c = r9
        Ld2:
            ohs r9 = defpackage.ebf.j()
            rqy r10 = r10.l()
            r9.F(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oep.Q(yzy, yzy):void");
    }

    private final void R(CarCall carCall, final odm odmVar) {
        int i = carCall.a;
        Integer numValueOf = Integer.valueOf(i);
        final oer oerVar = this.a;
        Map map = oerVar.f;
        odm odmVar2 = (odm) map.get(numValueOf);
        ((ype) ((ype) oer.a.f()).ai(5631)).R("Call state for %d changed from %s to %s", numValueOf, odmVar2, odmVar);
        if (odmVar == odm.DISCONNECTED) {
            map.remove(numValueOf);
        } else {
            map.put(numValueOf, odmVar);
        }
        if (!odmVar.equals(odmVar2)) {
            oerVar.K();
        }
        if (odn.a().N(odmVar2, odmVar) || odn.a().O(odmVar2, odmVar) || odn.a().C(odmVar2, odmVar) || odn.a().K(odmVar2, odmVar)) {
            oerVar.e.postDelayed(new Runnable() { // from class: oeo
                @Override // java.lang.Runnable
                public final void run() {
                    yzy yzyVar;
                    String str;
                    yzy yzyVar2;
                    boolean z;
                    int i2 = Build.VERSION.SDK_INT;
                    odm odmVar3 = odmVar;
                    oer oerVar2 = oerVar;
                    boolean z2 = false;
                    if (i2 >= 30 && (str = oerVar2.i) != null) {
                        odk odkVar = oerVar2.c;
                        Optional optionalOfNullable = Optional.ofNullable(odkVar.d().getActiveBluetoothDevice());
                        miq miqVar = new miq(str, 6);
                        if (true == optionalOfNullable.isPresent()) {
                            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((String) miqVar.a).equals(((BluetoothDevice) optionalOfNullable.get()).getAddress())));
                        }
                        boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(false)).booleanValue();
                        int iOrdinal = odmVar3.ordinal();
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 4) {
                                    throw new IllegalStateException("Audio route spot check performed in invalid state: ".concat(odmVar3.toString()));
                                }
                                if (zBooleanValue) {
                                    yzyVar2 = yzy.EB;
                                    z = true;
                                } else {
                                    yzyVar2 = yzy.EC;
                                    z = false;
                                }
                            } else if (zBooleanValue) {
                                yzyVar2 = yzy.Ez;
                                z = true;
                            } else {
                                yzyVar2 = yzy.EA;
                                z = false;
                            }
                        } else if (zBooleanValue) {
                            yzyVar2 = yzy.Ex;
                            z = true;
                        } else {
                            yzyVar2 = yzy.Ey;
                            z = false;
                        }
                        Optional optionalOfNullable2 = Optional.ofNullable(odkVar.d().getSupportedBluetoothDevices());
                        miq miqVar2 = new miq(str, 7);
                        if (true == optionalOfNullable2.isPresent()) {
                            optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(Collection.EL.stream((java.util.Collection) optionalOfNullable2.get()).anyMatch(new mqu(miqVar2.a, 7))));
                        }
                        boolean zBooleanValue2 = ((Boolean) optionalOfNullable2.orElse(false)).booleanValue();
                        if (Objects.equals(odmVar3, odm.RINGING)) {
                            ebf.j().F(odn.a().k(yzz.PHONE_CALL, zBooleanValue2 ? yzy.Kl : yzy.Km).l());
                        }
                        yzy yzyVar3 = z ? yzy.EF : zBooleanValue2 ? yzy.ED : yzy.EE;
                        ohs ohsVarJ = ebf.j();
                        odo odoVarA = odn.a();
                        yzz yzzVar = yzz.PHONE_CALL;
                        ohsVarJ.F(odoVarA.k(yzzVar, yzyVar2).l());
                        ebf.j().F(odn.a().k(yzzVar, yzyVar3).l());
                    }
                    int iA = oerVar2.a();
                    int iOrdinal2 = odmVar3.ordinal();
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            if (iOrdinal2 != 4) {
                                throw new IllegalStateException("Audio route spot check performed in invalid state: ".concat(odmVar3.toString()));
                            }
                            if (iA == 2) {
                                yzyVar = yzy.DI;
                                z2 = true;
                            } else {
                                yzyVar = yzy.DJ;
                            }
                        } else if (iA == 2) {
                            yzyVar = yzy.DG;
                            z2 = true;
                        } else {
                            yzyVar = yzy.DH;
                        }
                    } else if (iA == 2) {
                        yzyVar = yzy.DE;
                        z2 = true;
                    } else {
                        yzyVar = yzy.DF;
                    }
                    yzy yzyVar4 = z2 ? yzy.DM : oerVar2.l().contains(2) ? yzy.DK : yzy.DL;
                    ohs ohsVarJ2 = ebf.j();
                    odo odoVarA2 = odn.a();
                    yzz yzzVar2 = yzz.PHONE_CALL;
                    ohsVarJ2.F(odoVarA2.k(yzzVar2, yzyVar).l());
                    ebf.j().F(odn.a().k(yzzVar2, yzyVar4).l());
                }
            }, acqd.c());
        }
        rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.ag);
        rrbVarH.p(mcd.A().b(carCall));
        rrbVarH.h(i);
        abnp abnpVarF = rrbVarH.F();
        if (odmVar2 != null) {
            abnpVarF.t();
            yzn yznVar = (yzn) abnpVarF.b;
            yzn yznVar2 = yzn.a;
            yznVar.b |= 2;
            yznVar.d = odmVar2.l;
        }
        int i2 = odmVar.l;
        abnpVarF.t();
        yzn yznVar3 = (yzn) abnpVarF.b;
        yzn yznVar4 = yzn.a;
        yznVar3.b |= 1;
        yznVar3.c = i2;
        ebf.j().F(rrbVarH.l());
    }

    private static final BluetoothClass S(BluetoothDevice bluetoothDevice) {
        try {
            return bluetoothDevice.getBluetoothClass();
        } catch (SecurityException unused) {
            ((ype) ((ype) oer.a.f()).ai((char) 5608)).u("device class not available due to missing permissions");
            return null;
        }
    }

    private final int T(BluetoothDevice bluetoothDevice) {
        String str = this.a.i;
        if (str != null && str.equals(bluetoothDevice.getAddress())) {
            return 5;
        }
        try {
            byte[] bArrB = mjv.v().b(bluetoothDevice);
            if (bArrB == null) {
                return 6;
            }
            String str2 = new String(bArrB);
            int iHashCode = str2.hashCode();
            return iHashCode != -1085510111 ? iHashCode != 83350703 ? (iHashCode == 104438316 && str2.equals("Untethered Headset")) ? 4 : 1 : str2.equals("Watch") ? 3 : 1 : str2.equals("Default") ? 2 : 1;
        } catch (NoSuchMethodError unused) {
            ((ype) ((ype) oer.a.f()).ai((char) 5613)).u("device metadata is not available due to missing API");
            return 6;
        } catch (SecurityException unused2) {
            ((ype) ((ype) oer.a.f()).ai((char) 5612)).u("device metadata is not available due to missing permissions");
            return 6;
        }
    }

    private static final yyo U(BluetoothClass bluetoothClass, int i, int i2) {
        abnp abnpVarN = yyo.a.n();
        if (bluetoothClass != null) {
            int majorDeviceClass = bluetoothClass.getMajorDeviceClass();
            abnpVarN.t();
            yyo yyoVar = (yyo) abnpVarN.b;
            yyoVar.b |= 1;
            yyoVar.c = majorDeviceClass;
            int deviceClass = bluetoothClass.getDeviceClass();
            abnpVarN.t();
            yyo yyoVar2 = (yyo) abnpVarN.b;
            yyoVar2.b |= 2;
            yyoVar2.d = deviceClass;
        }
        abnpVarN.t();
        yyo yyoVar3 = (yyo) abnpVarN.b;
        yyoVar3.e = i - 1;
        yyoVar3.b |= 4;
        abnpVarN.t();
        yyo yyoVar4 = (yyo) abnpVarN.b;
        yyoVar4.b |= 8;
        yyoVar4.f = i2;
        return (yyo) abnpVarN.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00db  */
    @Override // defpackage.ebf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.telecom.CallAudioState r19) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oep.m(android.telecom.CallAudioState):void");
    }

    @Override // defpackage.ebf
    public final void n(CarCall carCall) {
        yph yphVar = oer.a;
        yop yopVarF = yphVar.f();
        int i = carCall.a;
        ((ype) ((ype) yopVarF).ai((char) 5627)).w("onCallAdded(%d)", i);
        if (mjv.C().g(carCall) && Build.VERSION.SDK_INT <= 33) {
            ((ype) ((ype) yphVar.f()).ai((char) 5628)).w("Closing call(%d) is requested by Do Not Disturb", i);
            this.a.y(i);
            mjv.C().b(carCall);
        }
        oer oerVar = this.a;
        if (oerVar.l().isEmpty()) {
            oerVar.j = true;
        } else if (Build.VERSION.SDK_INT < 30 || oerVar.i == null) {
            P(yzy.Dt, yzy.Du, true);
        } else {
            Q(yzy.EK, yzy.EL);
        }
        xya xyaVar = oerVar.d;
        if (!xyaVar.a) {
            ebf.j().F(odn.a().j(carCall, yzz.PHONE_CALL, oerVar.i != null ? yzy.EW : yzy.EX).l());
            xyaVar.e();
        }
        int i2 = carCall.e;
        R(carCall, odm.a(i2));
        ohs ohsVarJ = ebf.j();
        odo odoVarA = odn.a();
        yzz yzzVar = yzz.PHONE_CALL;
        ohsVarJ.F(odoVarA.j(carCall, yzzVar, yzy.El).l());
        if (i2 == 9 || i2 == 1) {
            ohs ohsVarJ2 = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVar, yzy.aH);
            rrbVarH.p(mcd.A().b(carCall));
            ohsVarJ2.F(rrbVarH.l());
        }
        if (odn.a().G(carCall)) {
            ComponentName componentNameB = mcd.A().b(carCall);
            ohs ohsVarJ3 = ebf.j();
            yxy yxyVar = yxy.GEARHEAD;
            rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.Ed);
            rrbVarH2.p(componentNameB);
            ohsVarJ3.F(rrbVarH2.l());
            Context context = oerVar.b;
            yzy yzyVar = yzy.a;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            audioManager.getClass();
            int ringerMode = audioManager.getRingerMode();
            yzy yzyVar2 = ringerMode != 0 ? ringerMode != 1 ? ringerMode != 2 ? yzyVar : yzy.Ei : yzy.Ej : yzy.Ek;
            if (yzyVar2 != yzyVar) {
                ohs ohsVarJ4 = ebf.j();
                rrb rrbVarH3 = rrc.h(yxyVar, yzzVar, yzyVar2);
                rrbVarH3.p(componentNameB);
                ohsVarJ4.F(rrbVarH3.l());
            }
            String strU = odn.a().u(carCall);
            if (!mcd.A().t(carCall) && TextUtils.isEmpty(odn.a().n(context.getContentResolver(), strU))) {
                ohs ohsVarJ5 = ebf.j();
                rrb rrbVarH4 = rrc.h(yxyVar, yzzVar, yzy.Ee);
                rrbVarH4.p(componentNameB);
                ohsVarJ5.F(rrbVarH4.l());
                String str = carCall.f.b;
                if (!TextUtils.isEmpty(str)) {
                    ohs ohsVarJ6 = ebf.j();
                    rrb rrbVarH5 = rrc.h(yxyVar, yzzVar, yzy.Ef);
                    rrbVarH5.p(componentNameB);
                    ohsVarJ6.F(rrbVarH5.l());
                    if (TextUtils.equals(str, strU)) {
                        yzy yzyVar3 = yzy.Eh;
                        ohs ohsVarJ7 = ebf.j();
                        rrb rrbVarH6 = rrc.h(yxyVar, yzzVar, yzyVar3);
                        rrbVarH6.p(componentNameB);
                        ohsVarJ7.F(rrbVarH6.l());
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (!TextUtils.isEmpty(strU) && PhoneNumberUtils.areSamePhoneNumber(str, strU, telephonyManager.getNetworkCountryIso())) {
                            ohs ohsVarJ8 = ebf.j();
                            rrb rrbVarH7 = rrc.h(yxyVar, yzzVar, yzy.Eg);
                            rrbVarH7.p(componentNameB);
                            ohsVarJ8.F(rrbVarH7.l());
                        }
                    }
                }
            }
        }
        if (acpl.k()) {
            Context context2 = oerVar.b;
            lbt lbtVar = lbt.p;
            context2.getClass();
            lbtVar.e(context2);
        }
        if (odn.a().G(carCall) && ogb.d().f() && mcd.A().b(carCall).equals(mkn.b)) {
            tgm tgmVar = tgm.a;
            tfj tfjVar = tfj.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
            tgk tgkVar = new tgk(Duration.ofSeconds(20L));
            aitx aitxVar = mkl.a;
            aitx aitxVar2 = mkl.a;
            aitxVar2.getClass();
            Map map = tgm.b;
            aivh aivhVar = (aivh) map.remove(tfjVar);
            if (aivhVar != null) {
                aivhVar.s(null);
            }
            tfk.a.b(tfjVar);
            map.put(tfjVar, ahnc.d(aitxVar2, null, 0, new nkn(tfjVar, tgkVar, (afck) null, 15), 3));
        }
    }

    @Override // defpackage.ebf
    public final void p(CarCall carCall) {
        ((ype) ((ype) oer.a.f()).ai(5629)).w("onCallRemoved(%d)", carCall.a);
        oer oerVar = this.a;
        if (oerVar.c.g().isEmpty() && oerVar.d.a) {
            oerVar.J(carCall);
        }
        R(carCall, odm.DISCONNECTED);
        if (oerVar.k().isEmpty()) {
            oerVar.g = 0;
            oerVar.h = Optional.empty();
            oerVar.j = false;
        }
    }

    @Override // defpackage.ebf
    public final void u(CarCall carCall, CarCall.Details details) {
        mnq mnqVarE;
        moa moaVarA;
        if (mcd.A().t(carCall) && odn.a().I(carCall.e) && (moaVarA = (mnqVarE = mlq.e()).a(yzr.CALL, carCall.a)) != null) {
            mnqVarE.l(moaVarA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    @Override // defpackage.ebf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(com.google.android.apps.auto.components.telecom.call.CarCall r9, int r10) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oep.y(com.google.android.apps.auto.components.telecom.call.CarCall, int):void");
    }
}
