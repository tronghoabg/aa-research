package com.bytedance.sdk.openadsdk.oem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.bcc.oa.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.pz;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.gzw.lw;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IPBroadcastReceiver extends BroadcastReceiver {
    private static volatile IPBroadcastReceiver uef;
    private int moa = 0;

    /* renamed from: oa, reason: collision with root package name */
    private final LruCache<String, gzw> f26048oa;
    private uef yo;

    private IPBroadcastReceiver() {
        int i5 = 10;
        int iUef = lw.uef("ip_data_config", "ip_ad_cache_count", 10);
        if (iUef > 0 && iUef <= 200) {
            i5 = iUef;
        }
        this.f26048oa = new LruCache<>(i5);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT".equals(intent.getAction())) {
            uef(intent);
        } else if ("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED".equals(intent.getAction())) {
            oa(intent);
        }
    }

    private void oa(final Intent intent) {
        if (intent == null) {
            return;
        }
        km.oa(new yo("ip-oppo") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int intExtra = intent.getIntExtra("event_type", 0);
                    final String stringExtra = intent.getStringExtra("event_track");
                    if (intExtra != 7 && intExtra != 9 && stringExtra != null) {
                        final String stringExtra2 = intent.getStringExtra("event_id");
                        final String stringExtra3 = intent.getStringExtra("app_package_name");
                        final String stringExtra4 = intent.getStringExtra("market_version");
                        final String stringExtra5 = intent.getStringExtra("caller");
                        final int iUef = oa.uef(intExtra);
                        final int iOa = oa.oa(intExtra);
                        uef uefVar = IPBroadcastReceiver.this.yo;
                        if (iUef > 0 && uefVar != null) {
                            uefVar.uef(stringExtra3, iUef);
                        }
                        final gzw gzwVarUef = IPBroadcastReceiver.this.uef(stringExtra3);
                        if (gzwVarUef != null) {
                            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVarUef, gb.uef(gzwVarUef), "ip_listener_log", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.2.1
                                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                                public JSONObject uef() {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("ip_error_code", iUef);
                                        jSONObject.put("ip_market_version", stringExtra4);
                                        jSONObject.put("ip_app_pkg", stringExtra3);
                                        jSONObject.put("ip_caller_pkg", stringExtra5);
                                        jSONObject.put("ip_event_id", stringExtra2);
                                        jSONObject.put("ip_event_track", stringExtra);
                                        jSONObject.put("ip_status", iOa);
                                        jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.moa);
                                        gzw gzwVar = gzwVarUef;
                                        if (gzwVar != null) {
                                            jSONObject.put("ip_is_w2a", gzwVar.sy());
                                            if (gzwVarUef.azx() != null) {
                                                jSONObject.put("ip_oem_type", gzwVarUef.azx().ivm());
                                                return jSONObject;
                                            }
                                        }
                                        return jSONObject;
                                    } catch (Throwable th) {
                                        dhk.uef("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                                        return null;
                                    }
                                }
                            });
                        }
                    }
                } catch (Throwable th) {
                    dhk.uef("IPMiBroadcastReceiver", "handleOppoInstallResult error = ", th);
                    IPBroadcastReceiver.this.moa = 2;
                }
            }
        });
    }

    public static void oa(final Context context, final gzw gzwVar) {
        pz pzVarAzx;
        if (uef != null || gzwVar == null || (pzVarAzx = gzwVar.azx()) == null) {
            return;
        }
        if (pzVarAzx.xs() || pzVarAzx.bcc()) {
            wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IPBroadcastReceiver.uef(sy.uef(context), gzwVar);
                    } catch (Throwable th) {
                        dhk.uef("IPMiBroadcastReceiver", "registerBroadcastReceiverAsy error ", th);
                    }
                }
            });
        }
    }

    public void uef(String str, gzw gzwVar) {
        if (TextUtils.isEmpty(str) || gzwVar == null || this.f26048oa.get(str) != null) {
            return;
        }
        this.f26048oa.put(str, gzwVar);
    }

    public gzw uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f26048oa.get(str);
    }

    public void uef(uef uefVar) {
        this.yo = uefVar;
    }

    public void uef() {
        this.yo = null;
    }

    private void uef(final Intent intent) {
        if (intent == null) {
            return;
        }
        km.oa(new yo("ip-mi") { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                final int i5;
                final int i10;
                final int i11;
                try {
                    int intExtra = 0;
                    final int intExtra2 = intent.getIntExtra("errorCode", 0);
                    if (intExtra2 < 0) {
                        int intExtra3 = intent.getIntExtra("reason", 0);
                        if (intExtra2 == -4 && intExtra3 == -1) {
                            return;
                        } else {
                            i5 = intExtra3;
                        }
                    } else {
                        i5 = 0;
                    }
                    if (intExtra2 == 5) {
                        int intExtra4 = intent.getIntExtra("status", 0);
                        if (intExtra4 == -2) {
                            try {
                                intExtra = intent.getIntExtra("progress", 0);
                            } catch (Throwable unused) {
                                IPBroadcastReceiver.this.moa = 1;
                            }
                            if (intExtra < 100) {
                                return;
                            }
                        }
                        i10 = intExtra4;
                        i11 = intExtra;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                    uef uefVar = IPBroadcastReceiver.this.yo;
                    if (intExtra2 > 0 && uefVar != null) {
                        uefVar.uef(stringExtra, intExtra2);
                    }
                    final gzw gzwVarUef = IPBroadcastReceiver.this.uef(stringExtra);
                    if (gzwVarUef != null) {
                        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVarUef, gb.uef(gzwVarUef), "ip_listener_log", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver.1.1
                            @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                            public JSONObject uef() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("ip_error_code", intExtra2);
                                    gzw gzwVar = gzwVarUef;
                                    if (gzwVar != null) {
                                        jSONObject.put("ip_is_w2a", gzwVar.sy());
                                    }
                                    int i12 = intExtra2;
                                    if (i12 > 0) {
                                        if (i12 == 5) {
                                            jSONObject.put("ip_status", i10);
                                            jSONObject.put("ip_exec_type", IPBroadcastReceiver.this.moa);
                                        }
                                        if (i10 == -2) {
                                            jSONObject.put("ip_progress", i11);
                                        }
                                    }
                                    if (intExtra2 < 0) {
                                        jSONObject.put("ip_reason", i5);
                                    }
                                    return jSONObject;
                                } catch (Throwable th) {
                                    dhk.uef("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                                    return null;
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    dhk.uef("IPMiBroadcastReceiver", "handleXiaomiInstallResult error ", th);
                }
            }
        });
    }

    public static IPBroadcastReceiver uef(Context context, gzw gzwVar) {
        pz pzVarAzx;
        if (lw.uef("ip_data_config", "ip_link_listener", 0) == 0 || gzwVar == null || (pzVarAzx = gzwVar.azx()) == null) {
            return null;
        }
        if (uef == null) {
            synchronized (IPBroadcastReceiver.class) {
                try {
                    if (uef == null) {
                        uef = new IPBroadcastReceiver();
                        IntentFilter intentFilter = new IntentFilter();
                        if (pzVarAzx.xs()) {
                            intentFilter.addAction("com.xiaomi.market.DOWNLOAD_INSTALL_RESULT");
                        } else if (pzVarAzx.bcc()) {
                            intentFilter.addAction("com.oplus.market.intent.action.ADD_APP_STATUS_CHANGED");
                        }
                        if (Build.VERSION.SDK_INT >= 34 && gb.ivm(context) >= 34) {
                            context.registerReceiver(uef, intentFilter, 2);
                        } else {
                            context.registerReceiver(uef, intentFilter);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }
}
