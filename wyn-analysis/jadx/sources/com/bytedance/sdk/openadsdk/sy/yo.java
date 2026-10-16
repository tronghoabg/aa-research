package com.bytedance.sdk.openadsdk.sy;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.component.bcc.uef.ivm;
import com.bytedance.sdk.component.utils.bcc;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class yo {
    private static volatile ivm moa;

    /* renamed from: oa, reason: collision with root package name */
    private static Boolean f26097oa;
    private static volatile uef uef;
    private static volatile HandlerThread yo = bcc.uef("pag__bus_monitor", 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static ivm lw() {
        if (yo == null || !yo.isAlive()) {
            synchronized (wk.class) {
                try {
                    if (yo == null || !yo.isAlive()) {
                        HandlerThread handlerThreadUef = bcc.uef("pag_init_handle", -1);
                        yo = handlerThreadUef;
                        moa = uef(handlerThreadUef.getLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (moa == null) {
            synchronized (wk.class) {
                try {
                    if (moa == null) {
                        moa = uef(yo.getLooper());
                    }
                } finally {
                }
            }
        }
        return moa;
    }

    public static void oa(moa moaVar) {
        uef().uef(new lw(moaVar, 0, 1, 0));
    }

    public static void oa() {
        uef().uef(true);
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (yo.class) {
                try {
                    if (uef == null) {
                        uef = uef.uef(new oa() { // from class: com.bytedance.sdk.openadsdk.sy.yo.1
                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public Context getContext() {
                                return sy.uef();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public ivm getHandler() {
                                return yo.lw();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public int getOnceLogCount() {
                                int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("bus_monitor_config", "once_count", 10);
                                if (iUef > 100 || iUef < 5) {
                                    return 10;
                                }
                                return iUef;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public int getOnceLogInterval() {
                                int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("bus_monitor_config", "once_interval", 10000);
                                if (iUef < 10000) {
                                    return 10000;
                                }
                                return iUef;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public HandlerThread getSafeHandlerThread(String str, int i5) {
                                return bcc.uef(str, i5);
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public int getUploadIntervalTime() {
                                int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("bus_monitor_config", "interval", 86400000);
                                if (iUef < 3600000) {
                                    return 86400000;
                                }
                                return iUef;
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public boolean isMonitorOpen() {
                                if (yo.f26097oa != null) {
                                    return yo.f26097oa.booleanValue();
                                }
                                Boolean unused = yo.f26097oa = Boolean.valueOf(com.bytedance.sdk.openadsdk.gzw.lw.uef("bus_monitor_config", "enable", 1) == 1);
                                return yo.f26097oa.booleanValue();
                            }

                            @Override // com.bytedance.sdk.openadsdk.sy.oa
                            public void onMonitorUpload(List<com.bytedance.sdk.openadsdk.sy.oa.uef> list) {
                                if (list == null || list.isEmpty()) {
                                    return;
                                }
                                for (final com.bytedance.sdk.openadsdk.sy.oa.uef uefVar : list) {
                                    com.bytedance.sdk.openadsdk.ab.moa.uef("bus_monitor", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.sy.yo.1.1
                                        @Override // com.bytedance.sdk.openadsdk.ab.oa
                                        public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("sdk_version", uefVar.oa());
                                                jSONObject.put("scene", uefVar.yo());
                                                jSONObject.put("start_count", uefVar.moa());
                                                jSONObject.put("success_count", uefVar.lw());
                                                jSONObject.put("fail_count", uefVar.ivm());
                                                jSONObject.put("rit", uefVar.xs());
                                                jSONObject.put("tag", uefVar.bcc());
                                                jSONObject.put("label", uefVar.cz());
                                                jSONObject.put("mediation", uefVar.dj());
                                                jSONObject.put("is_init", uefVar.wrv());
                                                jSONObject.put("extra", uefVar.cq());
                                                jSONObject.put("date_device", uefVar.zjm());
                                                return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("bus_monitor").oa(jSONObject.toString());
                                            } catch (Exception e7) {
                                                dhk.uef("BusMonitorUtils", "onMonitorUpload: ", e7);
                                                return null;
                                            }
                                        }
                                    });
                                }
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public static void yo(moa moaVar) {
        uef().uef(new lw(moaVar, 0, 0, 1));
    }

    public static void uef(moa moaVar) {
        uef().uef(new lw(moaVar, 1, 0, 0));
    }

    private static ivm uef(Looper looper) {
        return new ivm(new Handler(looper)) { // from class: com.bytedance.sdk.openadsdk.sy.yo.2
            @Override // com.bytedance.sdk.component.bcc.uef.ivm
            public boolean uef() {
                return com.bytedance.sdk.openadsdk.gzw.lw.uef("bus_handler_run_dispatch", 0) == 1;
            }
        };
    }
}
