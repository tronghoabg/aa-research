package com.google.android.apps.auto.components.telecom.impl;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.acqd;
import defpackage.acyw;
import defpackage.dsw;
import defpackage.dsx;
import defpackage.dug;
import defpackage.ebf;
import defpackage.juv;
import defpackage.kfl;
import defpackage.kio;
import defpackage.kmo;
import defpackage.lgv;
import defpackage.luk;
import defpackage.lup;
import defpackage.mas;
import defpackage.mdd;
import defpackage.mkn;
import defpackage.mqu;
import defpackage.mrw;
import defpackage.nsb;
import defpackage.nyj;
import defpackage.obs;
import defpackage.odp;
import defpackage.ohs;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.tgw;
import defpackage.vky;
import defpackage.wdu;
import defpackage.woy;
import defpackage.ycm;
import defpackage.yfd;
import defpackage.yfq;
import defpackage.ygr;
import defpackage.ylr;
import defpackage.yly;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zaa;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class VoipUtilsImpl implements odp {
    public static final yph a = yph.c("GH.VoipUtilsImpl");
    private static final yfd b = new ylr(new Object[]{"vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "com.whatsapp", "vnd.android.cursor.item/com.google.android.apps.tachyon.phone.audio", "com.google.android.apps.tachyon"}, 2);
    private ygr c = null;
    private final HashMap d = new HashMap();

    /* loaded from: classes2.dex */
    public static class VoipSettingsBroadcastReceiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("VoipSettingsBroadcastReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            ((ype) ((ype) VoipUtilsImpl.a.f()).ai((char) 5802)).u("Opening permission settings");
            Intent intent2 = (Intent) intent.getParcelableExtra("extra_voip_app_settings_intent_key");
            intent2.getClass();
            ComponentName component = intent2.getComponent();
            component.getClass();
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.PHONE_CALL, yzy.DW);
            rrbVarH.p(component);
            ohsVarJ.F(rrbVarH.l());
            context.startActivity(intent2);
        }
    }

    @Override // defpackage.odp
    public final ComponentName a(Context context, String str) {
        if (a.O() && lgv.c().k()) {
            Stream map = Collection.EL.stream(juv.a().b(kio.b().e(), nyj.b())).map(new nsb(7)).filter(new mrw(14)).map(new nsb(8));
            int i = yfq.d;
            ComponentName componentName = (ComponentName) Collection.EL.stream((yfq) map.collect(ycm.a)).filter(new mqu(str, 11)).findFirst().orElse(null);
            if (componentName != null) {
                return componentName;
            }
            if (r(context, str)) {
                return (ComponentName) Collection.EL.stream(lup.e().b(kio.b().e(), nyj.b())).map(new nsb(7)).filter(new mrw(14)).map(new nsb(8)).filter(new mqu(str, 12)).findFirst().orElse(null);
            }
        }
        return null;
    }

    @Override // defpackage.odp
    public final ComponentName b(CarCall carCall) {
        CarCall.Details details;
        PhoneAccountHandle phoneAccountHandle;
        return (!t(carCall) || (details = carCall.f) == null || (phoneAccountHandle = details.h) == null) ? mkn.b : phoneAccountHandle.getComponentName();
    }

    @Override // defpackage.lhg
    public final void d() {
        this.c = null;
        this.d.clear();
    }

    @Override // defpackage.odp
    public final Bitmap e(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        Drawable applicationIcon;
        HashMap map = this.d;
        if (map.containsKey(str)) {
            return (Bitmap) map.get(str);
        }
        String strL = l(str);
        if (strL != null) {
            try {
                applicationIcon = packageManager.getApplicationIcon(strL);
            } catch (PackageManager.NameNotFoundException unused) {
                ((ype) ((ype) a.g()).ai((char) 5811)).y("Could not find package for mimetype: %s", str);
            }
        } else {
            applicationIcon = null;
        }
        if (applicationIcon == null) {
            this.d.put(str, null);
            return null;
        }
        Bitmap bitmapB = kfl.b(applicationIcon, applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight());
        HashMap map2 = this.d;
        if (bitmapB == null) {
            map2.put(str, null);
            return null;
        }
        map2.put(str, bitmapB);
        return bitmapB;
    }

    @Override // defpackage.odp
    public final Uri f(CarCall carCall) {
        if (!a.O() || !t(carCall)) {
            return null;
        }
        if (acqd.m()) {
            return ebf.A().b(carCall);
        }
        Bundle bundle = carCall.f.j;
        if (bundle == null || !(bundle.get("android.telecom.extra.CALL_IMAGE_URI") instanceof Uri)) {
            return null;
        }
        return (Uri) bundle.get("android.telecom.extra.CALL_IMAGE_URI");
    }

    @Override // defpackage.odp
    public final PhoneAccountHandle g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            ((ype) ((ype) a.g()).ai((char) 5804)).u("Could not create phone account handle with empty component or accountId string");
            return null;
        }
        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
        if (componentNameUnflattenFromString != null) {
            return new PhoneAccountHandle(componentNameUnflattenFromString, str2);
        }
        ((ype) ((ype) a.g()).ai((char) 5805)).y("Could not unflatten component name \"%s\" from string", null);
        return null;
    }

    @Override // defpackage.odp
    public final Integer h(CarCall carCall) {
        if (!a.O() || !t(carCall)) {
            return null;
        }
        if (acqd.m()) {
            return ebf.A().f(carCall);
        }
        Bundle bundle = carCall.f.j;
        if (bundle == null || !bundle.containsKey("android.telecom.extra.PARTICIPANT_COUNT")) {
            return null;
        }
        return Integer.valueOf(bundle.getInt("android.telecom.extra.PARTICIPANT_COUNT"));
    }

    @Override // defpackage.odp
    public final String i(PackageManager packageManager, String str) {
        try {
            String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            if (true == TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        } catch (PackageManager.NameNotFoundException unused) {
            ((ype) ((ype) a.g()).ai((char) 5806)).y("Could not find package info for package name %s", str);
            return null;
        }
    }

    @Override // defpackage.odp
    public final String j(CarCall carCall) {
        if (!a.O() || !t(carCall)) {
            return null;
        }
        if (acqd.m()) {
            return ebf.A().g(carCall);
        }
        Bundle bundle = carCall.f.j;
        if (bundle != null) {
            return bundle.getString("android.telecom.extra.CURRENT_SPEAKER");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odp
    public final String k(String str) {
        return (String) ((ylr) b).d.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.odp
    public final String l(String str) {
        return (String) b.get(str);
    }

    @Override // defpackage.odp
    public final String m(String str) {
        if (Objects.equals(str, "com.whatsapp")) {
            return "vnd.android.cursor.item/vnd.com.whatsapp.profile";
        }
        return null;
    }

    @Override // defpackage.odp
    public final String n(Context context, Integer num, String str) {
        String string = null;
        if (num == null && str == null) {
            return null;
        }
        String string2 = num == null ? null : num.toString();
        if (str != null && !"null".equals(str)) {
            string = context.getString(R.string.current_speaker, str);
        }
        return (string2 == null || string == null) ? num != null ? string2 : string : context.getString(R.string.phone_label_with_info, string2, string);
    }

    @Override // defpackage.odp
    public final void o(Context context, long j, yzz yzzVar, String str) {
        String strL = l(str);
        strL.getClass();
        String strBN = a.bN(j, "content://com.android.contacts/data/");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(strL);
        intent.setDataAndType(Uri.parse(strBN), str);
        intent.addFlags(268435456);
        yxy yxyVar = yxy.GEARHEAD;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.Q);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (listQueryIntentActivities.isEmpty()) {
            ((ype) ((ype) a.g()).ai((char) 5818)).y("No valid package list for intent to MIME-type: %s", str);
            rrbVarH.v(zaa.TELECOM_NO_VALID_VOIP_PACKAGE);
        } else {
            ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            rrbVarH.p(componentName);
            if (!lgv.c().v(componentName.getPackageName())) {
                String strI = i(context.getPackageManager(), componentName.getPackageName());
                ((ype) ((ype) a.g()).ai((char) 5803)).y("Outgoing Call - Mic permission is missing for: %s", strI);
                obs.a().g(context, componentName, context.getString(R.string.voip_app_requires_microphone_permission_toast, strI), 1);
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.DU);
                rrbVarH2.p(componentName);
                ohsVarJ.F(rrbVarH2.l());
            }
        }
        ebf.j().F(rrbVarH.l());
        context.startActivity(intent, luk.c());
    }

    @Override // defpackage.odp
    public final void p(Context context, ComponentName componentName) {
        componentName.getClass();
        woy.N(!mkn.b.equals(componentName));
        yph yphVar = a;
        ((ype) ((ype) yphVar.h()).ai((char) 5819)).u("postAppMicPermissionMissingNotification");
        String strI = i(context.getPackageManager(), componentName.getPackageName());
        String string = context.getString(R.string.voip_app_requires_microphone_permission_notification_title, strI);
        String string2 = context.getString(R.string.voip_app_requires_microphone_permission_notification_text, strI);
        mas.c();
        dsx dsxVar = new dsx(context, "gearhead_tips_and_tricks");
        dsxVar.n(2131231121);
        dsxVar.i(string);
        dsxVar.h(string2);
        dsxVar.l();
        dsxVar.e(16, true);
        String packageName = componentName.getPackageName();
        PendingIntent pendingIntentC = null;
        Intent flags = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", packageName, null)).addCategory("android.intent.category.DEFAULT").setFlags(276824064);
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(flags, 65536);
        if (listQueryIntentActivities.isEmpty()) {
            ((ype) ((ype) yphVar.g()).ai((char) 5816)).y("No valid package list for handling intent for ACTION_APPLICATION_DETAILS_SETTINGS for package: %s", packageName);
        } else {
            ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
            flags.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            Intent intentPutExtra = new Intent(context, (Class<?>) VoipSettingsBroadcastReceiver.class).setAction("voip_app_settings_intent_action").putExtra("extra_voip_app_settings_intent_key", flags);
            ClipData clipData = wdu.a;
            pendingIntentC = wdu.c(context, 0, intentPutExtra, 201326592);
        }
        dsxVar.g = pendingIntentC;
        dsw dswVar = new dsw();
        dswVar.d(string2);
        dsxVar.o(dswVar);
        new dug(context).b(String.format("gearhead_missing_mic_permission_for_package_%s", componentName.getPackageName()), 333, dsxVar.a());
    }

    @Override // defpackage.odp
    public final boolean q(String str) {
        if (!a.O() || !lgv.c().k()) {
            return false;
        }
        Stream map = Collection.EL.stream(juv.a().b(kio.b().e(), nyj.b())).map(new nsb(7)).filter(new mrw(14)).map(new nsb(8)).map(new nsb(9));
        str.getClass();
        return map.anyMatch(new mqu(str, 10));
    }

    @Override // defpackage.odp
    public final boolean r(Context context, String str) {
        return kmo.c(acyw.b(), str) && s(context, str);
    }

    @Override // defpackage.odp
    public final boolean s(Context context, String str) {
        ygr ygrVarN;
        ygr ygrVar = this.c;
        if (ygrVar == null) {
            if (a.O() && lgv.c().k()) {
                TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
                telecomManager.getClass();
                List selfManagedPhoneAccounts = telecomManager.getSelfManagedPhoneAccounts();
                if (selfManagedPhoneAccounts == null) {
                    ygrVarN = yly.a;
                } else {
                    tgw tgwVar = new tgw(context, acyw.c());
                    ArrayList arrayList = new ArrayList();
                    Iterator it = selfManagedPhoneAccounts.iterator();
                    while (it.hasNext()) {
                        String packageName = ((PhoneAccountHandle) it.next()).getComponentName().getPackageName();
                        if (kmo.c(acqd.g(), packageName) || tgwVar.a(packageName)) {
                            arrayList.add(packageName);
                        }
                    }
                    ygrVarN = ygr.n(arrayList);
                }
            } else {
                ygrVarN = yly.a;
            }
            ygrVar = ygrVarN;
            this.c = ygrVar;
        }
        return ygrVar.contains(str);
    }

    @Override // defpackage.odp
    public final boolean t(CarCall carCall) {
        CarCall.Details details = carCall.f;
        return details != null && (details.i & 256) == 256;
    }

    @Override // defpackage.odp
    public final boolean u() {
        return a.O();
    }

    @Override // defpackage.lhg
    public final void c() {
    }
}
