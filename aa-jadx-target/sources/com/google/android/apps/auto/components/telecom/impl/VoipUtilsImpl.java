package com.google.android.apps.auto.components.telecom.impl;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class VoipUtilsImpl implements defpackage.oej {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.VoipUtilsImpl");
    private static final defpackage.ygj b = new defpackage.ymw(new java.lang.Object[]{"vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "com.whatsapp", "vnd.android.cursor.item/com.google.android.apps.tachyon.phone.audio", "com.google.android.apps.tachyon"}, 2);
    private defpackage.yhx c = null;
    private final java.util.HashMap d = new java.util.HashMap();

    @Override // defpackage.oej
    public final android.content.ComponentName a(android.content.Context context, java.lang.String str) {
        if (defpackage.a.N() && defpackage.mdp.d().k()) {
            j$.util.stream.Stream map = j$.util.Collection.-EL.stream(defpackage.jva.a().b(defpackage.kit.b().e(), defpackage.nze.b())).map(new defpackage.ngh(8)).filter(new mrx(15)).map(new defpackage.ngh(9));
            int i = defpackage.ygw.d;
            android.content.ComponentName componentName = (android.content.ComponentName) j$.util.Collection.-EL.stream((defpackage.ygw) map.collect(defpackage.yds.a)).filter(new defpackage.mpw(str, 12)).findFirst().orElse((java.lang.Object) null);
            if (componentName != null) {
                return componentName;
            }
            if (r(context, str)) {
                return (android.content.ComponentName) j$.util.Collection.-EL.stream(defpackage.luv.e().b(defpackage.kit.b().e(), defpackage.nze.b())).map(new defpackage.ngh(8)).filter(new mrx(15)).map(new defpackage.ngh(9)).filter(new defpackage.mpw(str, 13)).findFirst().orElse((java.lang.Object) null);
            }
        }
        return null;
    }

    @Override // defpackage.oej
    public final android.content.ComponentName b(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        com.google.android.apps.auto.components.telecom.call.CarCall.Details details;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        return (!t(carCall) || (details = carCall.f) == null || (phoneAccountHandle = details.h) == null) ? defpackage.mkt.b : phoneAccountHandle.getComponentName();
    }

    @Override // defpackage.lhn
    public final void d() {
        this.c = null;
        this.d.clear();
    }

    @Override // defpackage.oej
    public final android.graphics.Bitmap e(android.content.pm.PackageManager packageManager, java.lang.String str) {
        android.graphics.drawable.Drawable applicationIcon;
        java.util.HashMap map = this.d;
        if (map.containsKey(str)) {
            return (android.graphics.Bitmap) map.get(str);
        }
        java.lang.String strL = l(str);
        if (strL != null) {
            try {
                applicationIcon = packageManager.getApplicationIcon(strL);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5837)).y("Could not find package for mimetype: %s", str);
                applicationIcon = null;
            }
        } else {
            applicationIcon = null;
        }
        if (applicationIcon == null) {
            this.d.put(str, null);
            return null;
        }
        android.graphics.Bitmap bitmapB = defpackage.kfn.b(applicationIcon, applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight());
        java.util.HashMap map2 = this.d;
        if (bitmapB == null) {
            map2.put(str, null);
            return null;
        }
        map2.put(str, bitmapB);
        return bitmapB;
    }

    @Override // defpackage.oej
    public final android.net.Uri f(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (!defpackage.a.N() || !t(carCall)) {
            return null;
        }
        if (defpackage.acrf.m()) {
            return defpackage.omf.w().b(carCall);
        }
        android.os.Bundle bundle = carCall.f.j;
        if (bundle == null || !(bundle.get("android.telecom.extra.CALL_IMAGE_URI") instanceof android.net.Uri)) {
            return null;
        }
        return (android.net.Uri) bundle.get("android.telecom.extra.CALL_IMAGE_URI");
    }

    @Override // defpackage.oej
    public final android.telecom.PhoneAccountHandle g(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5830)).u("Could not create phone account handle with empty component or accountId string");
            return null;
        }
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
        if (componentNameUnflattenFromString != null) {
            return new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, str2);
        }
        ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5831)).y("Could not unflatten component name \"%s\" from string", null);
        return null;
    }

    @Override // defpackage.oej
    public final java.lang.Integer h(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (!defpackage.a.N() || !t(carCall)) {
            return null;
        }
        if (defpackage.acrf.m()) {
            return defpackage.omf.w().f(carCall);
        }
        android.os.Bundle bundle = carCall.f.j;
        if (bundle == null || !bundle.containsKey("android.telecom.extra.PARTICIPANT_COUNT")) {
            return null;
        }
        return java.lang.Integer.valueOf(bundle.getInt("android.telecom.extra.PARTICIPANT_COUNT"));
    }

    @Override // defpackage.oej
    public final java.lang.String i(android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            java.lang.String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            if (true == android.text.TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5832)).y("Could not find package info for package name %s", str);
            return null;
        }
    }

    @Override // defpackage.oej
    public final java.lang.String j(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (!defpackage.a.N() || !t(carCall)) {
            return null;
        }
        if (defpackage.acrf.m()) {
            return defpackage.omf.w().g(carCall);
        }
        android.os.Bundle bundle = carCall.f.j;
        if (bundle != null) {
            return bundle.getString("android.telecom.extra.CURRENT_SPEAKER");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oej
    public final java.lang.String k(java.lang.String str) {
        return (java.lang.String) ((defpackage.ymw) b).d.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oej
    public final java.lang.String l(java.lang.String str) {
        return (java.lang.String) b.get(str);
    }

    @Override // defpackage.oej
    public final java.lang.String m(java.lang.String str) {
        if (j$.util.Objects.equals(str, "com.whatsapp")) {
            return "vnd.android.cursor.item/vnd.com.whatsapp.profile";
        }
        return null;
    }

    @Override // defpackage.oej
    public final java.lang.String n(android.content.Context context, java.lang.Integer num, java.lang.String str) {
        java.lang.String string = null;
        if (num == null && str == null) {
            return null;
        }
        java.lang.String string2 = num == null ? null : num.toString();
        if (str != null && !"null".equals(str)) {
            string = context.getString(2132083895, str);
        }
        if (string2 == null || string == null) {
            return num != null ? string2 : string;
        }
        return context.getString(2132084781, string2, string);
    }

    @Override // defpackage.oej
    public final void o(android.content.Context context, long j, defpackage.zbe zbeVar, java.lang.String str) {
        java.lang.String strL = l(str);
        strL.getClass();
        java.lang.String strBM = defpackage.a.bM(j, "content://com.android.contacts/data/");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage(strL);
        intent.setDataAndType(android.net.Uri.parse(strBM), str);
        intent.addFlags(268435456);
        defpackage.yzd yzdVar = defpackage.yzd.GEARHEAD;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.Q);
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5844)).y("No valid package list for intent to MIME-type: %s", str);
            rrvVarH.v(defpackage.zbf.TELECOM_NO_VALID_VOIP_PACKAGE);
        } else {
            android.content.pm.ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            android.content.ComponentName componentName = new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
            rrvVarH.p(componentName);
            if (!defpackage.mdp.d().v(componentName.getPackageName())) {
                java.lang.String strI = i(context.getPackageManager(), componentName.getPackageName());
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai((char) 5829)).y("Outgoing Call - Mic permission is missing for: %s", strI);
                defpackage.ocn.a().g(context, componentName, context.getString(2132085457, strI), 1);
                defpackage.oim oimVarU = defpackage.omf.u();
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.DY);
                rrvVarH2.p(componentName);
                oimVarU.F(rrvVarH2.l());
            }
        }
        defpackage.omf.u().F(rrvVarH.l());
        context.startActivity(intent, defpackage.luq.c());
    }

    @Override // defpackage.oej
    public final void p(android.content.Context context, android.content.ComponentName componentName) {
        componentName.getClass();
        defpackage.ysr.aX(!defpackage.mkt.b.equals(componentName));
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5845)).u("postAppMicPermissionMissingNotification");
        java.lang.String strI = i(context.getPackageManager(), componentName.getPackageName());
        java.lang.String string = context.getString(2132085456, strI);
        java.lang.String string2 = context.getString(2132085455, strI);
        defpackage.maz.c();
        defpackage.dte dteVar = new defpackage.dte(context, "gearhead_tips_and_tricks");
        dteVar.n(2131231121);
        dteVar.i(string);
        dteVar.h(string2);
        dteVar.l();
        dteVar.e(16, true);
        java.lang.String packageName = componentName.getPackageName();
        android.app.PendingIntent pendingIntentC = null;
        android.content.Intent flags = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(android.net.Uri.fromParts("package", packageName, null)).addCategory("android.intent.category.DEFAULT").setFlags(276824064);
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(flags, 65536);
        if (listQueryIntentActivities.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 5842)).y("No valid package list for handling intent for ACTION_APPLICATION_DETAILS_SETTINGS for package: %s", packageName);
        } else {
            android.content.pm.ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            flags.setComponent(new android.content.ComponentName(activityInfo.packageName, activityInfo.name));
            android.content.Intent intentPutExtra = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.apps.auto.components.telecom.impl.VoipUtilsImpl.VoipSettingsBroadcastReceiver.class).setAction("voip_app_settings_intent_action").putExtra("extra_voip_app_settings_intent_key", flags);
            android.content.ClipData clipData = wer.a;
            pendingIntentC = wer.c(context, 0, intentPutExtra, 201326592);
        }
        dteVar.g = pendingIntentC;
        dtd dtdVar = new dtd();
        dtdVar.d(string2);
        dteVar.o(dtdVar);
        new defpackage.dun(context).b(java.lang.String.format("gearhead_missing_mic_permission_for_package_%s", componentName.getPackageName()), 333, dteVar.a());
    }

    @Override // defpackage.oej
    public final boolean q(java.lang.String str) {
        if (!defpackage.a.N() || !defpackage.mdp.d().k()) {
            return false;
        }
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(defpackage.jva.a().b(defpackage.kit.b().e(), defpackage.nze.b())).map(new defpackage.ngh(8)).filter(new mrx(15)).map(new defpackage.ngh(9)).map(new defpackage.ngh(10));
        str.getClass();
        return map.anyMatch(new defpackage.mpw(str, 11));
    }

    @Override // defpackage.oej
    public final boolean r(android.content.Context context, java.lang.String str) {
        return defpackage.kmv.c(aczy.b(), str) && s(context, str);
    }

    @Override // defpackage.oej
    public final boolean s(android.content.Context context, java.lang.String str) {
        defpackage.yhx yhxVarN;
        defpackage.yhx yhxVar = this.c;
        if (yhxVar == null) {
            if (defpackage.a.N() && defpackage.mdp.d().k()) {
                android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
                telecomManager.getClass();
                java.util.List listM = a$.ExternalSyntheticApiModelOutline1.m(telecomManager);
                if (listM == null) {
                    yhxVarN = defpackage.ynd.a;
                } else {
                    defpackage.ths thsVar = new defpackage.ths(context, aczy.c());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = listM.iterator();
                    while (it.hasNext()) {
                        java.lang.String packageName = ((android.telecom.PhoneAccountHandle) it.next()).getComponentName().getPackageName();
                        if (defpackage.kmv.c(defpackage.acrf.g(), packageName) || thsVar.a(packageName)) {
                            arrayList.add(packageName);
                        }
                    }
                    yhxVarN = defpackage.yhx.n(arrayList);
                }
            } else {
                yhxVarN = defpackage.ynd.a;
            }
            yhxVar = yhxVarN;
            this.c = yhxVar;
        }
        return yhxVar.contains(str);
    }

    @Override // defpackage.oej
    public final boolean t(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        com.google.android.apps.auto.components.telecom.call.CarCall.Details details = carCall.f;
        return details != null && (details.i & 256) == 256;
    }

    @Override // defpackage.oej
    public final boolean u() {
        return defpackage.a.N();
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
