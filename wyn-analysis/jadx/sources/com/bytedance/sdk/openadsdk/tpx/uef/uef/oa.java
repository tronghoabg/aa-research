package com.bytedance.sdk.openadsdk.tpx.uef.uef;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.ab;
import com.bytedance.sdk.openadsdk.core.model.cq;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.ivm;
import com.bytedance.sdk.openadsdk.core.model.pz;
import com.bytedance.sdk.openadsdk.core.pu;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.gsd;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.lw;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa implements yo {

    /* renamed from: oa, reason: collision with root package name */
    protected int f26102oa;
    protected String uef;
    private final WeakReference<Context> yo;

    public oa(Context context, String str) {
        this.yo = new WeakReference<>(context);
        this.uef = str;
        "====tag===".concat(String.valueOf(str));
        if (sy.uef() == null) {
            sy.oa(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw(gzw gzwVar) {
        if (oa(gzwVar)) {
            gzwVar.ivm(true);
            lw.uef(gzwVar);
            return;
        }
        if (moa(gzwVar)) {
            gzwVar.ivm(true);
            lw.uef(gzwVar);
            return;
        }
        if (uef(gzwVar, false)) {
            lw.uef(gzwVar);
            return;
        }
        if (yo(gzwVar)) {
            gzwVar.ivm(true);
            lw.uef(gzwVar);
        } else {
            if (gzwVar.no() != null || gzwVar.cc() == null) {
                return;
            }
            pu.uef(uef(), gzwVar.cc(), gzwVar, gb.uef(this.uef), this.uef, true);
            gzwVar.ivm(true);
            lw.uef(gzwVar);
        }
    }

    private static boolean oa() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.tpx.uef.uef.yo
    public boolean moa(gzw gzwVar) {
        ivm ivmVarNo;
        if (gzwVar == null || (ivmVarNo = gzwVar.no()) == null || gzwVar.pp() == 0) {
            return false;
        }
        String strYo = ivmVarNo.yo();
        if (TextUtils.isEmpty(strYo)) {
            return false;
        }
        return uef(gzwVar, strYo, uef(), this.uef, new HashMap());
    }

    @Override // com.bytedance.sdk.openadsdk.tpx.uef.uef.yo
    public boolean yo(gzw gzwVar) {
        ivm ivmVarNo;
        if (gzwVar == null || (ivmVarNo = gzwVar.no()) == null) {
            return false;
        }
        return uef(uef(), gzwVar, ivmVarNo.uef(), ivmVarNo.yo());
    }

    public static boolean uef(Context context, String str, String str2, String str3, gzw gzwVar) {
        if (!TextUtils.isEmpty(str3) && str3.contains("_landingpage")) {
            str3 = str3.replace("_landingpage", "");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                context.startActivity(intent);
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str3, "store_open", (JSONObject) null);
                lw.uef(gzwVar);
                return true;
            } catch (Throwable unused) {
            }
        }
        if (context != null && str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                Uri uri = Uri.parse("market://details?id=".concat(str2));
                intent2.setData(uri);
                Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                while (it.hasNext()) {
                    if (it.next().activityInfo.packageName.equals("com.android.vending") && context.getPackageManager().getLaunchIntentForPackage("com.android.vending") != null) {
                        Intent intent3 = new Intent("android.intent.action.VIEW");
                        intent3.setData(uri);
                        intent3.setPackage("com.android.vending");
                        if (!(context instanceof Activity)) {
                            intent3.setFlags(268435456);
                        }
                        context.startActivity(intent3);
                        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str3, "store_open", (JSONObject) null);
                        lw.uef(gzwVar);
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                ApmHelper.reportCustomError("gotoGooglePlayByPackageNameAndUrl error", "gotoGooglePlay", th);
            }
        }
        return false;
    }

    public boolean oa(gzw gzwVar) {
        cq cqVarAgr = gzwVar.agr();
        if (cqVarAgr == null) {
            return false;
        }
        HashMap map = new HashMap();
        uef(gzwVar, map);
        if (uef.uef(uef(), cqVarAgr.uef(), gzwVar, gb.oa(gzwVar), map, true)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, this.uef, "open_fallback_url", map);
        return false;
    }

    public static boolean oa(gzw gzwVar, Context context, boolean z2) {
        String strYo;
        IPBroadcastReceiver iPBroadcastReceiverUef;
        if (gzwVar != null && context != null) {
            try {
                pz pzVarAzx = gzwVar.azx();
                if (pzVarAzx != null && !TextUtils.isEmpty(pzVarAzx.zjm())) {
                    if (pzVarAzx.cz() && uef(gzwVar, context, z2)) {
                        return true;
                    }
                    if (pzVarAzx.xs() || pzVarAzx.bcc()) {
                        if (gzwVar.sy() == 1) {
                            strYo = pzVarAzx.uef();
                        } else {
                            strYo = (gzwVar.no() == null || TextUtils.isEmpty(gzwVar.no().yo())) ? null : gzwVar.no().yo();
                        }
                        if (!TextUtils.isEmpty(strYo) && (iPBroadcastReceiverUef = IPBroadcastReceiver.uef(context, gzwVar)) != null) {
                            iPBroadcastReceiverUef.uef(strYo, gzwVar);
                        }
                    }
                    final boolean zUef = uef.uef(context, pzVarAzx.zjm(), gzwVar, gb.oa(gzwVar), uef(gzwVar, z2, pzVarAzx), true);
                    km.yo((Runnable) new com.bytedance.sdk.component.bcc.oa.yo("task_oem_store") { // from class: com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.4
                        @Override // java.lang.Runnable
                        public void run() throws JSONException {
                            if (zUef) {
                                zjm.uef("oem_store", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                            } else {
                                zjm.uef("oem_store", "-2");
                            }
                        }
                    });
                    return zUef;
                }
            } catch (Throwable th) {
                dhk.yo("GPDownLoader", th.getMessage());
            }
        }
        return false;
    }

    public static boolean uef(gzw gzwVar, String str, Context context, String str2, Map<String, Object> map) {
        Intent intentUef;
        if (gzwVar != null && gzwVar.pp() == 0) {
            return false;
        }
        try {
            if (TextUtils.isEmpty(str) || (intentUef = gb.uef(context, str)) == null) {
                return false;
            }
            intentUef.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(context instanceof Activity)) {
                intentUef.addFlags(268435456);
            }
            context.startActivity(intentUef);
            if (map == null) {
                map = new HashMap<>();
            }
            if (gzwVar != null && gzwVar.orw() == 0) {
                map.put("auto_click", Boolean.valueOf(!gzwVar.oib()));
            }
            map.put("can_query_install", Integer.valueOf(oa() ? 1 : 0));
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, str2, "click_open", map);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.tpx.uef.uef.yo
    public void uef(int i5) {
        this.f26102oa = i5;
    }

    public boolean uef(Context context, gzw gzwVar, String str, String str2) {
        return uef(context, str, str2, this.uef, gzwVar);
    }

    public Context uef() {
        WeakReference<Context> weakReference = this.yo;
        return (weakReference == null || weakReference.get() == null) ? sy.uef() : this.yo.get();
    }

    @Override // com.bytedance.sdk.openadsdk.tpx.uef.uef.yo
    public void uef(final gzw gzwVar) {
        if (uef() == null || gzwVar == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("gp_downloader_async", 0) == 1) {
            km.cz().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.1
                @Override // java.lang.Runnable
                public void run() {
                    oa.this.lw(gzwVar);
                }
            });
        } else {
            lw(gzwVar);
        }
    }

    private void uef(gzw gzwVar, Map<String, Object> map) {
        if (gzwVar != null && gzwVar.orw() == 0) {
            map.put("auto_click", Boolean.valueOf(!gzwVar.oib()));
        }
        if (gzwVar != null && gzwVar.orw() == 0) {
            map.put("dpl_probability_jump", Boolean.valueOf(this.f26102oa >= 11));
        }
        map.put("can_query_install", Integer.valueOf(oa() ? 1 : 0));
    }

    public boolean uef(gzw gzwVar, boolean z2) {
        return oa(gzwVar, uef(), z2);
    }

    private static void uef(final JSONObject jSONObject, gzw gzwVar, String str, final int i5) {
        try {
            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.2
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject uef() {
                    try {
                        jSONObject.put("status", i5);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static boolean uef(gzw gzwVar, Context context, boolean z2) {
        if (gzwVar != null && gzwVar.azx() != null && gzwVar.azx().cz() && !TextUtils.isEmpty(gzwVar.azx().zjm()) && context != null) {
            try {
                pz pzVarAzx = gzwVar.azx();
                String strUef = gb.uef(gzwVar);
                final JSONObject jSONObjectDj = pzVarAzx.dj();
                jSONObjectDj.put("from_web", z2 ? 1 : 0);
                jSONObjectDj.put("is_w2a", gzwVar.sy());
                com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, strUef, "gp_mini_card_status", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.tpx.uef.uef.oa.3
                    @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                    public JSONObject uef() {
                        try {
                            jSONObjectDj.put("status", 0);
                        } catch (Throwable unused) {
                        }
                        return jSONObjectDj;
                    }
                });
                Intent intentUef = uef(context, pzVarAzx);
                if (intentUef == null) {
                    uef(jSONObjectDj, gzwVar, strUef, -2);
                    return false;
                }
                if (context instanceof Activity) {
                    if (!gsd.uef((Activity) context)) {
                        context = null;
                    }
                } else {
                    Activity activityOa = ab.uef().lw().oa();
                    if (activityOa != null && gsd.uef(activityOa)) {
                        context = activityOa;
                    }
                }
                if (!(context instanceof Activity)) {
                    uef(jSONObjectDj, gzwVar, strUef, -5);
                    return false;
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && intentUef.resolveActivity(packageManager) != null) {
                    try {
                        ((Activity) context).startActivityForResult(intentUef, 0);
                        uef(jSONObjectDj, gzwVar, strUef, 1);
                        return true;
                    } catch (Throwable unused) {
                        uef(jSONObjectDj, gzwVar, strUef, -3);
                        return false;
                    }
                }
                uef(jSONObjectDj, gzwVar, strUef, -4);
                return false;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    private static Intent uef(Context context, pz pzVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            String strMoa = pzVar.moa();
            if (!TextUtils.isEmpty(strMoa)) {
                intent.setPackage(strMoa);
            } else {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(pzVar.zjm()));
            boolean z2 = true;
            if (pzVar.oa() != 1) {
                z2 = false;
            }
            intent.putExtra("overlay", z2);
            if (TextUtils.isEmpty(pzVar.yo())) {
                intent.putExtra("callerId", context.getPackageName());
            } else {
                intent.putExtra("callerId", pzVar.yo());
            }
            pzVar.uef(intent);
            return intent;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private static Map<String, Object> uef(gzw gzwVar, boolean z2, pz pzVar) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oem_vendor_type", pzVar.ivm());
            jSONObject.put("from_web", z2 ? 1 : 0);
            jSONObject.put("is_w2a", gzwVar.sy());
            map.put("pag_json_data", jSONObject.toString());
        } catch (Throwable unused) {
        }
        return map;
    }

    public static boolean uef(String str, gzw gzwVar) {
        String queryParameter;
        if (str != null && !str.isEmpty()) {
            try {
                Uri uri = Uri.parse(str);
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if ("market".equals(scheme) && "details".equals(host)) {
                    return true;
                }
                if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || (!"play.google.com".equals(host) && !"market.android.com".equals(host))) {
                    if ("market".equals(scheme) && "webstoreredirect".equals(host) && (queryParameter = uri.getQueryParameter("uri")) != null) {
                        return uef(queryParameter, gzwVar);
                    }
                }
                return true;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }

    public static boolean uef(gzw gzwVar, String str) {
        if (gzwVar == null || gzwVar.azx() == null) {
            return false;
        }
        String strLw = gzwVar.azx().lw();
        if (TextUtils.isEmpty(strLw)) {
            return false;
        }
        return Pattern.compile(strLw).matcher(str).matches();
    }
}
