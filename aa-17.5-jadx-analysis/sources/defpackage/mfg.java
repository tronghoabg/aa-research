package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.CrossProfileApps;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.biometrics.BiometricManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.UserManager;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mfg implements mff {
    private static final yph a = yph.c("GH.PhoneCapabilities");
    private static final Map b = yfy.l("video/avc", 1, "video/hevc", 2);
    private MediaCodecInfo[] c;

    @Override // defpackage.mff
    public final void a() throws PackageManager.NameNotFoundException {
        rrb rrbVar;
        MediaCodecInfo[] mediaCodecInfoArr;
        int i;
        int i2;
        yxy yxyVar = yxy.GEARHEAD;
        yzz yzzVar = yzz.PHONE_CAPABILITY;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.qQ);
        if (rrbVarH.u == null) {
            rrbVarH.u = yzc.a.n();
        }
        abnp abnpVar = rrbVarH.u;
        MediaCodecInfo[] mediaCodecInfoArrB = b();
        int length = mediaCodecInfoArrB.length;
        int i3 = 0;
        while (i3 < length) {
            MediaCodecInfo mediaCodecInfo = mediaCodecInfoArrB[i3];
            if (mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length2 = supportedTypes.length;
                int i4 = 0;
                while (i4 < length2) {
                    String str = supportedTypes[i4];
                    Map map = b;
                    if (map.containsKey(str)) {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        if (capabilitiesForType == null) {
                            rrbVar = rrbVarH;
                            ((ype) a.l().ai((char) 4839)).M("Couldn't get codec capabilities for %s:%s", mediaCodecInfo.getName(), str);
                            mediaCodecInfoArr = mediaCodecInfoArrB;
                            i = length;
                        } else {
                            rrbVar = rrbVarH;
                            HashMap map2 = new HashMap();
                            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                            int length3 = codecProfileLevelArr.length;
                            mediaCodecInfoArr = mediaCodecInfoArrB;
                            int i5 = 0;
                            while (i5 < length3) {
                                int i6 = i5;
                                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i6];
                                int i7 = length;
                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                if (codecProfileLevel.level > ((Integer) Map.EL.getOrDefault(map2, Integer.valueOf(codecProfileLevel.profile), 0)).intValue()) {
                                    map2.put(Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level));
                                }
                                i5 = i6 + 1;
                                length = i7;
                                codecProfileLevelArr = codecProfileLevelArr2;
                            }
                            i = length;
                            Iterator it = map2.keySet().iterator();
                            while (it.hasNext()) {
                                Integer num = (Integer) it.next();
                                abnp abnpVarN = yxe.a.n();
                                String name = mediaCodecInfo.getName();
                                abnpVarN.t();
                                Iterator it2 = it;
                                yxe yxeVar = (yxe) abnpVarN.b;
                                name.getClass();
                                int i8 = i3;
                                yxeVar.b |= 1;
                                yxeVar.c = name;
                                int iIntValue = ((Integer) map.get(capabilitiesForType.getMimeType())).intValue();
                                abnpVarN.t();
                                yxe yxeVar2 = (yxe) abnpVarN.b;
                                yxeVar2.b |= 2;
                                yxeVar2.d = iIntValue;
                                int iIntValue2 = num.intValue();
                                abnpVarN.t();
                                yxe yxeVar3 = (yxe) abnpVarN.b;
                                yxeVar3.b |= 4;
                                yxeVar3.e = iIntValue2;
                                int iIntValue3 = ((Integer) map2.get(num)).intValue();
                                abnpVarN.t();
                                yxe yxeVar4 = (yxe) abnpVarN.b;
                                yxeVar4.b |= 8;
                                yxeVar4.f = iIntValue3;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    boolean zIsHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                                    abnpVarN.t();
                                    yxe yxeVar5 = (yxe) abnpVarN.b;
                                    yxeVar5.b |= 32;
                                    yxeVar5.h = zIsHardwareAccelerated;
                                    boolean zIsVendor = mediaCodecInfo.isVendor();
                                    abnpVarN.t();
                                    yxe yxeVar6 = (yxe) abnpVarN.b;
                                    yxeVar6.b |= 16;
                                    yxeVar6.g = zIsVendor;
                                }
                                if (Build.VERSION.SDK_INT >= 35) {
                                    boolean zIsFeatureSupported = mediaCodecInfo.getCapabilitiesForType(capabilitiesForType.getMimeType()).isFeatureSupported("region-of-interest");
                                    abnpVarN.t();
                                    yxe yxeVar7 = (yxe) abnpVarN.b;
                                    yxeVar7.b |= 64;
                                    yxeVar7.i = zIsFeatureSupported;
                                }
                                yxe yxeVar8 = (yxe) abnpVarN.q();
                                abnpVar.t();
                                yzc yzcVar = (yzc) abnpVar.b;
                                yzc yzcVar2 = yzc.a;
                                yxeVar8.getClass();
                                aboh abohVar = yzcVar.c;
                                if (!abohVar.c()) {
                                    yzcVar.c = abnv.I(abohVar);
                                }
                                yzcVar.c.add(yxeVar8);
                                it = it2;
                                i3 = i8;
                            }
                        }
                        i2 = i3;
                    } else {
                        rrbVar = rrbVarH;
                        mediaCodecInfoArr = mediaCodecInfoArrB;
                        i = length;
                        i2 = i3;
                    }
                    i4++;
                    rrbVarH = rrbVar;
                    mediaCodecInfoArrB = mediaCodecInfoArr;
                    length = i;
                    i3 = i2;
                }
            }
            i3++;
            rrbVarH = rrbVarH;
            mediaCodecInfoArrB = mediaCodecInfoArrB;
            length = length;
        }
        rrb rrbVar2 = rrbVarH;
        int i9 = 4;
        int i10 = 2;
        int size = ((UserManager) mki.a.c.getSystemService("user")).getUserProfiles().size();
        abnpVar.t();
        yzc yzcVar3 = (yzc) abnpVar.b;
        yzc yzcVar4 = yzc.a;
        yzcVar3.b |= 1;
        yzcVar3.d = size;
        if (lgv.c().k()) {
            Context context = mki.a.c;
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            List<PhoneAccountHandle> callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts();
            Iterator<PhoneAccountHandle> it3 = callCapablePhoneAccounts.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it3.hasNext()) {
                PhoneAccount phoneAccount = telecomManager.getPhoneAccount(it3.next());
                if (phoneAccount != null && phoneAccount.hasCapabilities(i10)) {
                    i11++;
                    if (phoneAccount.hasCapabilities(i9)) {
                        i12++;
                    }
                }
                i9 = 4;
                i10 = 2;
            }
            abnp abnpVarN2 = yzb.a.n();
            int size2 = callCapablePhoneAccounts.size();
            abnpVarN2.t();
            yzb yzbVar = (yzb) abnpVarN2.b;
            yzbVar.b |= 1;
            yzbVar.c = size2;
            abnpVarN2.t();
            yzb yzbVar2 = (yzb) abnpVarN2.b;
            yzbVar2.b |= 2;
            yzbVar2.d = i11;
            abnpVarN2.t();
            yzb yzbVar3 = (yzb) abnpVarN2.b;
            yzbVar3.b |= 4;
            yzbVar3.e = i12;
            boolean zB = odn.a().B(context);
            abnpVarN2.t();
            yzb yzbVar4 = (yzb) abnpVarN2.b;
            yzbVar4.b |= 8;
            yzbVar4.f = zB;
            yzb yzbVar5 = (yzb) abnpVarN2.q();
            abnpVar.t();
            yzc yzcVar5 = (yzc) abnpVar.b;
            yzbVar5.getClass();
            yzcVar5.e = yzbVar5;
            yzcVar5.b |= 2;
            callCapablePhoneAccounts.size();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Context context2 = mki.a.c;
            qco qcoVar = kwo.b().d;
            boolean zD = qcoVar.d();
            boolean zD2 = qcoVar.f().d();
            boolean zO = mpl.f().a().o();
            CrossProfileApps crossProfileAppsM = jw$$ExternalSyntheticApiModelOutline3.m(context2.getSystemService(jw$$ExternalSyntheticApiModelOutline3.m$1()));
            Boolean boolValueOf = crossProfileAppsM != null ? Boolean.valueOf(crossProfileAppsM.canRequestInteractAcrossProfiles()) : null;
            abnp abnpVarN3 = zaf.a.n();
            abnpVarN3.t();
            zaf zafVar = (zaf) abnpVarN3.b;
            zafVar.b |= 1;
            zafVar.c = zD;
            abnpVarN3.t();
            zaf zafVar2 = (zaf) abnpVarN3.b;
            zafVar2.b |= 2;
            zafVar2.d = zD2;
            abnpVarN3.t();
            zaf zafVar3 = (zaf) abnpVarN3.b;
            zafVar3.b |= 4;
            zafVar3.e = zO;
            if (boolValueOf != null) {
                boolean zBooleanValue = boolValueOf.booleanValue();
                abnpVarN3.t();
                zaf zafVar4 = (zaf) abnpVarN3.b;
                zafVar4.b |= 8;
                zafVar4.f = zBooleanValue;
            }
            zaf zafVar5 = (zaf) abnpVarN3.q();
            abnpVar.t();
            yzc yzcVar6 = (yzc) abnpVar.b;
            zafVar5.getClass();
            yzcVar6.f = zafVar5;
            yzcVar6.b |= 4;
        }
        if (hnc.a()) {
            ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.qS).l());
        }
        rrc rrcVar = (rrc) rrbVar2.l();
        ebf.j().F(rrcVar);
        ((yzc) rrcVar.A.b()).c.size();
        try {
            ((TelephonyManager) mki.a.c.getSystemService("phone")).getDataState();
        } catch (SecurityException unused) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CAPABILITY, yzy.qR).l());
        }
        Context context3 = mki.a.c;
        TelecomManager telecomManager2 = (TelecomManager) context3.getSystemService("telecom");
        telecomManager2.getClass();
        String defaultDialerPackage = telecomManager2.getDefaultDialerPackage();
        if (defaultDialerPackage == null) {
            ((ype) ((ype) a.f()).ai((char) 4837)).u("No default dialer");
        } else {
            try {
                PackageInfo packageInfo = context3.getPackageManager().getPackageInfo(defaultDialerPackage, 0);
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH2 = rrc.h(yxy.GEARHEAD, yzz.PHONE_CAPABILITY, yzy.EV);
                rrbVarH2.p(new ComponentName(defaultDialerPackage, ""));
                rrbVarH2.r(packageInfo.versionCode);
                ohsVarJ.F(rrbVarH2.l());
            } catch (PackageManager.NameNotFoundException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 4836)).y("Package not found %s", defaultDialerPackage);
            }
        }
        if (woy.at("SAMSUNG", Build.MANUFACTURER)) {
            PackageManager packageManager = mki.a.c.getPackageManager();
            rrb rrbVarH3 = rrc.h(yxy.GEARHEAD, yzz.PHONE_CAPABILITY, yzy.EY);
            try {
                rrbVarH3.p(new ComponentName(packageManager.getPackageInfo("com.samsung.android.incallui", 0).packageName, ""));
                rrbVarH3.r(r0.versionCode);
            } catch (PackageManager.NameNotFoundException e2) {
                ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 4841)).y("Package not found %s", "com.samsung.android.incallui");
            }
            ebf.j().F(rrbVarH3.l());
        }
        if (Build.VERSION.SDK_INT >= 35) {
            BiometricManager biometricManagerM281m = ep$$ExternalSyntheticApiModelOutline0.m281m(mki.a.c.getSystemService(ep$$ExternalSyntheticApiModelOutline0.m285m()));
            if (biometricManagerM281m == null) {
                ((ype) a.l().ai((char) 4838)).u("Biometric manager not found");
                return;
            }
            long lastAuthenticationTime = biometricManagerM281m.getLastAuthenticationTime(32783);
            if (lastAuthenticationTime == -1) {
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_CAPABILITY, yzy.qU).l());
                return;
            }
            oit.a();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - lastAuthenticationTime;
            ohs ohsVarJ2 = ebf.j();
            rrb rrbVarH4 = rrc.h(yxy.GEARHEAD, yzz.PHONE_CAPABILITY, yzy.qT);
            rrbVarH4.u(jElapsedRealtime);
            ohsVarJ2.F(rrbVarH4.l());
        }
    }

    final synchronized MediaCodecInfo[] b() {
        MediaCodecInfo[] codecInfos;
        codecInfos = this.c;
        if (codecInfos == null) {
            codecInfos = new MediaCodecList(0).getCodecInfos();
            this.c = codecInfos;
        }
        return codecInfos;
    }
}
