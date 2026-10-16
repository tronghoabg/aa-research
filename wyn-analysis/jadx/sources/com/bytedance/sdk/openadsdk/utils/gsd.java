package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.oa;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import java.util.HashMap;
import p9.C3778C;
import u.k;

/* loaded from: classes3.dex */
public class gsd {
    /* JADX INFO: Access modifiers changed from: private */
    public static com.bytedance.sdk.openadsdk.ab.uef.oa oa(String str, int i5, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar) {
        com.bytedance.sdk.openadsdk.ab.uef.oa oaVar = new com.bytedance.sdk.openadsdk.ab.uef.oa();
        oaVar.uef(str);
        oaVar.uef(gzwVar);
        oaVar.oa(gb.uef(gzwVar));
        oaVar.uef(i5);
        oaVar.uef(false);
        oaVar.oa(gzwVar.ykf());
        return oaVar;
    }

    public static boolean uef(Context context, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str2, boolean z2) {
        if (!(context instanceof Activity)) {
            Activity activityOa = com.bytedance.sdk.openadsdk.core.ab.uef().lw().oa();
            if (activityOa != null && uef(activityOa)) {
                context = activityOa;
            }
        } else if (!uef((Activity) context)) {
            context = null;
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sy.uef();
        }
        if (context == null) {
            return false;
        }
        gb.uef(gzwVar);
        if (!com.bytedance.sdk.component.utils.sy.uef(str)) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(oa(str2, 5, gzwVar));
            return false;
        }
        String strOa = com.bytedance.sdk.openadsdk.core.model.gzw.oa(context, gzwVar);
        if (TextUtils.isEmpty(strOa)) {
            return oa(context, str, gzwVar, str2, z2);
        }
        try {
            C3778C c3778c = new C3778C();
            ((Intent) c3778c.f43324c).putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", false);
            c3778c.e(2);
            try {
                k kVarB = c3778c.b();
                if (!(context instanceof Activity)) {
                    kVarB.f46072a.addFlags(268435456);
                }
                com.bytedance.sdk.openadsdk.core.uef.uef.uef(context, strOa, kVarB, Uri.parse(str));
                if (context instanceof TTBaseActivity) {
                    ((TTBaseActivity) context).yo(true);
                }
                com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa = oa(str2, 100, gzwVar);
                oaVarOa.uef(true);
                oaVarOa.oa(8);
                com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa);
                return true;
            } catch (Throwable th) {
                String message = th.getMessage();
                com.bytedance.sdk.component.utils.dhk.yo("OpenUtils", message);
                com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa2 = oa(str2, 13, gzwVar);
                oaVarOa2.yo(message);
                com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa2);
                oa(context, str, gzwVar, str2, true);
                return true;
            }
        } catch (Throwable th2) {
            String message2 = th2.getMessage();
            com.bytedance.sdk.component.utils.dhk.yo("OpenUtils", message2);
            com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa3 = oa(str2, 12, gzwVar);
            oaVarOa3.yo(message2);
            com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa3);
            return oa(context, str, gzwVar, str2, z2);
        }
    }

    private static boolean oa(Context context, String str, final com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, final String str2, boolean z2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return com.bytedance.sdk.component.utils.oa.uef(context, intent, new oa.InterfaceC0066oa() { // from class: com.bytedance.sdk.openadsdk.utils.gsd.1
                @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
                public void uef() {
                    com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa = gsd.oa(str2, 100, gzwVar);
                    oaVarOa.uef(true);
                    oaVarOa.oa(2);
                    com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa);
                }

                @Override // com.bytedance.sdk.component.utils.oa.InterfaceC0066oa
                public void uef(Throwable th) {
                    String message = th.getMessage();
                    com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa = gsd.oa(str2, 7, gzwVar);
                    oaVarOa.yo(message);
                    oaVarOa.oa(2);
                    com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa);
                }
            }, z2);
        } catch (Throwable th) {
            String message = th.getMessage();
            com.bytedance.sdk.openadsdk.ab.uef.oa oaVarOa = oa(str2, 6, gzwVar);
            oaVarOa.yo(message);
            oaVarOa.oa(2);
            com.bytedance.sdk.openadsdk.moa.yo.uef(oaVarOa);
            return false;
        }
    }

    public static boolean uef(Context context, String str, com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str2) {
        if (context instanceof Activity) {
            if (!uef((Activity) context)) {
                context = null;
            }
        } else {
            Activity activityOa = com.bytedance.sdk.openadsdk.core.ab.uef().lw().oa();
            if (activityOa != null && uef(activityOa)) {
                context = activityOa;
            }
        }
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sy.uef();
        }
        Context context2 = context;
        if (context2 == null || !uef(str)) {
            return false;
        }
        new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
        HashMap map = new HashMap();
        map.put("deeplink_url", str);
        map.put("jsb_deeplink", 1);
        return com.bytedance.sdk.openadsdk.tpx.uef.uef.uef.uef(context2, str, gzwVar, gb.oa(gzwVar), map, true);
    }

    public static boolean uef(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean uef(Activity activity) {
        return (activity == null || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}
