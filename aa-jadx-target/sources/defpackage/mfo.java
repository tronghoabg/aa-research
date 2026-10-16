package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mfo implements defpackage.mfn {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.PhoneCapabilities");
    private static final java.util.Map b = defpackage.yhe.l("video/avc", 1, "video/hevc", 2);
    private android.media.MediaCodecInfo[] c;

    @Override // defpackage.mfn
    public final void a() {
        int i;
        int i2;
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.zbe zbeVar = defpackage.zbe.PHONE_CAPABILITY;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.qS);
        if (rrvVarH.u == null) {
            rrvVarH.u = defpackage.zah.a.n();
        }
        defpackage.abor aborVar = rrvVarH.u;
        android.media.MediaCodecInfo[] mediaCodecInfoArrB = b();
        int length = mediaCodecInfoArrB.length;
        int i3 = 0;
        while (i3 < length) {
            android.media.MediaCodecInfo mediaCodecInfo = mediaCodecInfoArrB[i3];
            if (mediaCodecInfo.isEncoder()) {
                java.lang.String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i4 = 0;
                while (i4 < length2) {
                    java.lang.String str = supportedTypes[i4];
                    java.util.Map map = b;
                    if (map.containsKey(str)) {
                        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (capabilitiesForType == null) {
                            ((defpackage.yqj) a.l().ai((char) 4842)).M("Couldn't get codec capabilities for %s:%s", mediaCodecInfo.getName(), str);
                            i = length;
                        } else {
                            java.util.HashMap map2 = new java.util.HashMap();
                            android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                            int length3 = codecProfileLevelArr.length;
                            int i5 = 0;
                            while (i5 < length3) {
                                int i6 = i5;
                                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i6];
                                int i7 = length;
                                android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                if (codecProfileLevel.level > ((java.lang.Integer) j$.util.Map.-EL.getOrDefault(map2, java.lang.Integer.valueOf(codecProfileLevel.profile), 0)).intValue()) {
                                    map2.put(java.lang.Integer.valueOf(codecProfileLevel.profile), java.lang.Integer.valueOf(codecProfileLevel.level));
                                }
                                i5 = i6 + 1;
                                length = i7;
                                codecProfileLevelArr = codecProfileLevelArr2;
                            }
                            i = length;
                            java.util.Iterator it = map2.keySet().iterator();
                            while (it.hasNext()) {
                                java.lang.Integer num = (java.lang.Integer) it.next();
                                defpackage.abor aborVarN = defpackage.yyj.a.n();
                                java.lang.String name = mediaCodecInfo.getName();
                                aborVarN.t();
                                java.util.Iterator it2 = it;
                                defpackage.yyj yyjVar = (defpackage.yyj) aborVarN.b;
                                name.getClass();
                                int i8 = i3;
                                yyjVar.b |= 1;
                                yyjVar.c = name;
                                int iIntValue = ((java.lang.Integer) map.get(capabilitiesForType.getMimeType())).intValue();
                                aborVarN.t();
                                defpackage.yyj yyjVar2 = (defpackage.yyj) aborVarN.b;
                                yyjVar2.b |= 2;
                                yyjVar2.d = iIntValue;
                                int iIntValue2 = num.intValue();
                                aborVarN.t();
                                defpackage.yyj yyjVar3 = (defpackage.yyj) aborVarN.b;
                                yyjVar3.b |= 4;
                                yyjVar3.e = iIntValue2;
                                int iIntValue3 = ((java.lang.Integer) map2.get(num)).intValue();
                                aborVarN.t();
                                defpackage.yyj yyjVar4 = (defpackage.yyj) aborVarN.b;
                                yyjVar4.b |= 8;
                                yyjVar4.f = iIntValue3;
                                if (android.os.Build.VERSION.SDK_INT >= 29) {
                                    boolean zM = ep$.ExternalSyntheticApiModelOutline0.m(mediaCodecInfo);
                                    aborVarN.t();
                                    defpackage.yyj yyjVar5 = (defpackage.yyj) aborVarN.b;
                                    yyjVar5.b |= 32;
                                    yyjVar5.h = zM;
                                    boolean zM$1 = ep$.ExternalSyntheticApiModelOutline0.m$1(mediaCodecInfo);
                                    aborVarN.t();
                                    defpackage.yyj yyjVar6 = (defpackage.yyj) aborVarN.b;
                                    yyjVar6.b |= 16;
                                    yyjVar6.g = zM$1;
                                }
                                if (android.os.Build.VERSION.SDK_INT >= 35) {
                                    boolean zIsFeatureSupported = mediaCodecInfo.getCapabilitiesForType(capabilitiesForType.getMimeType()).isFeatureSupported("region-of-interest");
                                    aborVarN.t();
                                    defpackage.yyj yyjVar7 = (defpackage.yyj) aborVarN.b;
                                    yyjVar7.b |= 64;
                                    yyjVar7.i = zIsFeatureSupported;
                                }
                                defpackage.yyj yyjVar8 = (defpackage.yyj) aborVarN.q();
                                aborVar.t();
                                defpackage.zah zahVar = (defpackage.zah) aborVar.b;
                                defpackage.zah zahVar2 = defpackage.zah.a;
                                yyjVar8.getClass();
                                defpackage.abpj abpjVar = zahVar.c;
                                if (!abpjVar.c()) {
                                    zahVar.c = defpackage.abox.I(abpjVar);
                                }
                                zahVar.c.add(yyjVar8);
                                it = it2;
                                i3 = i8;
                            }
                        }
                        i2 = i3;
                    } else {
                        rrvVarH = rrvVarH;
                        mediaCodecInfoArrB = mediaCodecInfoArrB;
                        i = length;
                        i2 = i3;
                    }
                    i4++;
                    rrvVarH = rrvVarH;
                    mediaCodecInfoArrB = mediaCodecInfoArrB;
                    length = i;
                    i3 = i2;
                }
            }
            i3++;
            rrvVarH = rrvVarH;
            mediaCodecInfoArrB = mediaCodecInfoArrB;
            length = length;
        }
        defpackage.rrv rrvVar = rrvVarH;
        int i9 = 4;
        int i10 = 2;
        int size = ((android.os.UserManager) defpackage.mkp.a.c.getSystemService("user")).getUserProfiles().size();
        aborVar.t();
        defpackage.zah zahVar3 = (defpackage.zah) aborVar.b;
        defpackage.zah zahVar4 = defpackage.zah.a;
        zahVar3.b |= 1;
        zahVar3.d = size;
        if (defpackage.mdp.d().k()) {
            android.content.Context context = defpackage.mkp.a.c;
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            java.util.List<android.telecom.PhoneAccountHandle> callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts();
            java.util.Iterator<android.telecom.PhoneAccountHandle> it3 = callCapablePhoneAccounts.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it3.hasNext()) {
                android.telecom.PhoneAccount phoneAccount = telecomManager.getPhoneAccount(it3.next());
                if (phoneAccount != null && phoneAccount.hasCapabilities(i10)) {
                    i11++;
                    if (phoneAccount.hasCapabilities(i9)) {
                        i12++;
                    }
                }
                i9 = 4;
                i10 = 2;
            }
            defpackage.abor aborVarN2 = defpackage.zag.a.n();
            int size2 = callCapablePhoneAccounts.size();
            aborVarN2.t();
            defpackage.zag zagVar = (defpackage.zag) aborVarN2.b;
            zagVar.b |= 1;
            zagVar.c = size2;
            aborVarN2.t();
            defpackage.zag zagVar2 = (defpackage.zag) aborVarN2.b;
            zagVar2.b |= 2;
            zagVar2.d = i11;
            aborVarN2.t();
            defpackage.zag zagVar3 = (defpackage.zag) aborVarN2.b;
            zagVar3.b |= 4;
            zagVar3.e = i12;
            boolean zB = defpackage.oeh.a().B(context);
            aborVarN2.t();
            defpackage.zag zagVar4 = (defpackage.zag) aborVarN2.b;
            zagVar4.b |= 8;
            zagVar4.f = zB;
            defpackage.zag zagVar5 = (defpackage.zag) aborVarN2.q();
            aborVar.t();
            defpackage.zah zahVar5 = (defpackage.zah) aborVar.b;
            zagVar5.getClass();
            zahVar5.e = zagVar5;
            zahVar5.b |= 2;
            callCapablePhoneAccounts.size();
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.content.Context context2 = defpackage.mkp.a.c;
            defpackage.qdn qdnVar = defpackage.kwu.b().d;
            boolean zD = qdnVar.d();
            boolean zC = qdnVar.f().c();
            boolean zO = defpackage.mpr.f().a().o();
            android.content.pm.CrossProfileApps crossProfileAppsM = jx$.ExternalSyntheticApiModelOutline3.m(context2.getSystemService(jx$.ExternalSyntheticApiModelOutline3.m$1()));
            java.lang.Boolean boolValueOf = crossProfileAppsM != null ? java.lang.Boolean.valueOf(bgp$.ExternalSyntheticApiModelOutline0.m(crossProfileAppsM)) : null;
            defpackage.abor aborVarN3 = defpackage.zbk.a.n();
            aborVarN3.t();
            defpackage.zbk zbkVar = (defpackage.zbk) aborVarN3.b;
            zbkVar.b |= 1;
            zbkVar.c = zD;
            aborVarN3.t();
            defpackage.zbk zbkVar2 = (defpackage.zbk) aborVarN3.b;
            zbkVar2.b |= 2;
            zbkVar2.d = zC;
            aborVarN3.t();
            defpackage.zbk zbkVar3 = (defpackage.zbk) aborVarN3.b;
            zbkVar3.b |= 4;
            zbkVar3.e = zO;
            if (boolValueOf != null) {
                boolean zBooleanValue = boolValueOf.booleanValue();
                aborVarN3.t();
                defpackage.zbk zbkVar4 = (defpackage.zbk) aborVarN3.b;
                zbkVar4.b |= 8;
                zbkVar4.f = zBooleanValue;
            }
            defpackage.zbk zbkVar5 = (defpackage.zbk) aborVarN3.q();
            aborVar.t();
            defpackage.zah zahVar6 = (defpackage.zah) aborVar.b;
            zbkVar5.getClass();
            zahVar6.f = zbkVar5;
            zahVar6.b |= 4;
        }
        if (defpackage.hnj.a()) {
            defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.qU).l());
        }
        defpackage.rrw rrwVar = (defpackage.rrw) rrvVar.l();
        defpackage.omf.u().F(rrwVar);
        ((defpackage.zah) rrwVar.A.b()).c.size();
        try {
            ((android.telephony.TelephonyManager) defpackage.mkp.a.c.getSystemService("phone")).getDataState();
        } catch (java.lang.SecurityException unused) {
            defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CAPABILITY, defpackage.zbd.qT).l());
        }
        android.content.Context context3 = defpackage.mkp.a.c;
        android.telecom.TelecomManager telecomManager2 = (android.telecom.TelecomManager) context3.getSystemService("telecom");
        telecomManager2.getClass();
        java.lang.String defaultDialerPackage = telecomManager2.getDefaultDialerPackage();
        if (defaultDialerPackage == null) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4840)).u("No default dialer");
        } else {
            try {
                android.content.pm.PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(defaultDialerPackage, 0);
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CAPABILITY, defpackage.zbd.EZ);
                rrvVarH2.p(new android.content.ComponentName(defaultDialerPackage, ""));
                rrvVarH2.r(packageInfo.versionCode);
                oimVarU.F(rrvVarH2.l());
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 4839)).y("Package not found %s", defaultDialerPackage);
            }
        }
        if (defpackage.ysr.bD("SAMSUNG", android.os.Build.MANUFACTURER)) {
            android.content.pm.PackageManager packageManager = defpackage.mkp.a.c.getPackageManager();
            defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CAPABILITY, defpackage.zbd.Fc);
            try {
                android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.samsung.android.incallui", 0);
                rrvVarH3.p(new android.content.ComponentName(packageInfo2.packageName, ""));
                rrvVarH3.r(packageInfo2.versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 4844)).y("Package not found %s", "com.samsung.android.incallui");
            }
            defpackage.omf.u().F(rrvVarH3.l());
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            android.hardware.biometrics.BiometricManager biometricManagerM = ep$.ExternalSyntheticApiModelOutline0.m(defpackage.mkp.a.c.getSystemService(ep$.ExternalSyntheticApiModelOutline0.m()));
            if (biometricManagerM == null) {
                ((defpackage.yqj) a.l().ai((char) 4841)).u("Biometric manager not found");
                return;
            }
            long jM = hz$.ExternalSyntheticApiModelOutline2.m(biometricManagerM, 32783);
            if (jM == -1) {
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CAPABILITY, defpackage.zbd.qW).l());
                return;
            }
            defpackage.ojm.a();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() - jM;
            defpackage.oim oimVarU2 = defpackage.omf.u();
            defpackage.rrv rrvVarH4 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.PHONE_CAPABILITY, defpackage.zbd.qV);
            rrvVarH4.u(jElapsedRealtime);
            oimVarU2.F(rrvVarH4.l());
        }
    }

    final synchronized android.media.MediaCodecInfo[] b() {
        android.media.MediaCodecInfo[] codecInfos;
        codecInfos = this.c;
        if (codecInfos == null) {
            codecInfos = new android.media.MediaCodecList(0).getCodecInfos();
            this.c = codecInfos;
        }
        return codecInfos;
    }
}
