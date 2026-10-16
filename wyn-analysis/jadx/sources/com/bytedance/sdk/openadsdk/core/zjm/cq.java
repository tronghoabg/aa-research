package com.bytedance.sdk.openadsdk.core.zjm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cq {

    /* renamed from: oa, reason: collision with root package name */
    private static String f25844oa;
    private static final AtomicBoolean uef = new AtomicBoolean(false);
    private static String yo;

    public static String moa() {
        Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef;
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar;
        String strYo;
        if (yo == null) {
            yo = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tt_sp", "js_render_v3_ver", "");
        }
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarOa = com.bytedance.sdk.component.adexpress.uef.oa.bcc.oa();
        if (uefVarOa != null && (mapUef = uefVarOa.uef()) != null && (uefVar = mapUef.get("v3")) != null && (strYo = uefVar.yo()) != null && !strYo.equals(yo)) {
            yo = strYo;
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_sp", "js_render_v3_ver", strYo);
        }
        return yo;
    }

    public static void oa() {
        if (com.bytedance.sdk.openadsdk.core.dj.oa.uef().lw() || uef.getAndSet(true)) {
            return;
        }
        com.bytedance.sdk.component.adexpress.uef.oa.oa.uef();
    }

    public static void uef() {
        com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().uef(new com.bytedance.sdk.component.adexpress.uef.uef.oa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.1
            @Override // com.bytedance.sdk.component.adexpress.uef.uef.oa
            public int uef(String str, ContentValues contentValues, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.oib.oa.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), str, contentValues, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.oa
            public Cursor uef(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new com.bytedance.sdk.openadsdk.oib.uef.uef(com.bytedance.sdk.openadsdk.oib.oa.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.oa
            public int uef(String str, String str2, String[] strArr) {
                return com.bytedance.sdk.openadsdk.oib.oa.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), str, str2, strArr);
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.oa
            public void uef(String str, ContentValues contentValues) {
                com.bytedance.sdk.openadsdk.oib.oa.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), str, contentValues);
            }
        });
        com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().uef(new com.bytedance.sdk.component.adexpress.uef.uef.yo() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.2

            /* renamed from: com.bytedance.sdk.openadsdk.core.zjm.cq$2$1, reason: invalid class name */
            public class AnonymousClass1 implements Runnable {

                /* renamed from: oa, reason: collision with root package name */
                final /* synthetic */ int f25845oa;
                final /* synthetic */ MessageQueue[] uef;
                final /* synthetic */ int yo;

                public AnonymousClass1(MessageQueue[] messageQueueArr, int i5, int i10) {
                    this.uef = messageQueueArr;
                    this.f25845oa = i5;
                    this.yo = i10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.uef[0] = Looper.myQueue();
                    uef(this.uef[0], this.f25845oa, this.yo);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int ab() {
                return af.yo(com.bytedance.sdk.openadsdk.core.sy.uef());
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public String bcc() {
                return com.bytedance.sdk.openadsdk.core.zjm.oa().moa();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int bs() {
                return af.lw(com.bytedance.sdk.openadsdk.core.sy.uef());
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public ExecutorService cq() {
                return km.lw();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int cz() {
                return 1;
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int dj() {
                return com.bytedance.sdk.openadsdk.core.sy.moa().hnk();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public ExecutorService dz() {
                return km.zjm();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public com.bytedance.sdk.component.xs.oa.uef ivm() {
                com.bytedance.sdk.component.xs.oa.uef uefVarMoa = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().moa();
                uefVarMoa.uef(8);
                uefVarMoa.oa("express_down");
                return uefVarMoa;
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public com.bytedance.sdk.component.adexpress.uef.yo.uef lw() {
                return com.bytedance.sdk.openadsdk.core.sy.yo().uef();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public void moa() {
                int iOu = com.bytedance.sdk.openadsdk.core.sy.moa().ou();
                int iHnk = com.bytedance.sdk.openadsdk.core.sy.moa().hnk();
                if (iOu == 0 && iHnk == 0) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.lw.lw.uef().uef(iOu);
                com.bytedance.sdk.component.adexpress.lw.lw.uef().oa(iHnk);
                int iIvm = com.bytedance.sdk.openadsdk.gzw.lw.ivm();
                int iLw = com.bytedance.sdk.openadsdk.gzw.lw.lw();
                if (iIvm == 0 && iLw == 0) {
                    return;
                }
                uef(com.bytedance.sdk.openadsdk.core.wk.yo().getLooper().getQueue(), iLw, iIvm);
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int sy() {
                return com.bytedance.sdk.openadsdk.gzw.lw.uef("gaussian_blur_type", 0);
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public ScheduledExecutorService wk() {
                return km.uef();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int wrv() {
                return 0;
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public com.bytedance.sdk.component.xs.oa.oa xs() {
                com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
                oaVarYo.uef(8);
                oaVarYo.oa("express_get");
                return oaVarYo;
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public Handler yo() {
                return com.bytedance.sdk.openadsdk.core.wk.yo();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int zjm() {
                return com.bytedance.sdk.openadsdk.core.sy.moa().ou();
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public Context oa() {
                return com.bytedance.sdk.openadsdk.core.sy.uef();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void oa(final MessageQueue messageQueue, final int i5) {
                if (messageQueue == null || i5 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.2.4
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.uef.oa(i5, false, messageQueue).oa();
                        return false;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.adexpress.uef.uef.yo
            public int uef() {
                if (com.bytedance.sdk.openadsdk.core.sy.moa() == null) {
                    return 0;
                }
                return com.bytedance.sdk.openadsdk.core.sy.moa().lw();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void uef(final MessageQueue messageQueue, final int i5, final int i10) {
                if (messageQueue != null) {
                    final int iUef = com.bytedance.sdk.openadsdk.gzw.lw.uef("ad_load_and_render_opt", "w_p_delay", 500);
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            oa(messageQueue, i5);
                            uef(messageQueue, i10);
                        }
                    };
                    if (iUef > 0) {
                        com.bytedance.sdk.openadsdk.core.wk.yo().postDelayed(runnable, iUef);
                    } else {
                        runnable.run();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void uef(final MessageQueue messageQueue, final int i5) {
                if (messageQueue == null || i5 <= 0) {
                    return;
                }
                messageQueue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.2.3
                    @Override // android.os.MessageQueue.IdleHandler
                    public boolean queueIdle() {
                        new com.bytedance.sdk.openadsdk.core.widget.uef.oa(i5, true, messageQueue).oa();
                        return false;
                    }
                });
            }
        });
        com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().uef(new com.bytedance.sdk.component.adexpress.uef.uef.moa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.3
            @Override // com.bytedance.sdk.component.adexpress.uef.uef.moa
            public void uef(int i5) {
                com.bytedance.sdk.openadsdk.ab.moa.uef().uef(com.bytedance.sdk.openadsdk.ab.uef.moa.oa().oa(i5).ivm(com.bytedance.sdk.openadsdk.core.cz.uef(i5)));
            }
        });
        com.bytedance.sdk.component.cz.uef.uef.uef().uef(new com.bytedance.sdk.component.cz.uef.oa() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.4
            @Override // com.bytedance.sdk.component.cz.uef.oa
            public void uef(String str, String str2, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.moa.yo.yo(com.bytedance.sdk.openadsdk.utils.oa.moa(), str, str2, jSONObject);
            }

            @Override // com.bytedance.sdk.component.cz.uef.oa
            public void uef(com.bytedance.sdk.component.cz.oa.uef uefVar, String str, String str2, JSONObject jSONObject, long j8) {
                com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = new com.bytedance.sdk.openadsdk.core.model.gzw();
                gzwVar.pz(uefVar.uef());
                gzwVar.gr(uefVar.oa());
                gzwVar.gzw(uefVar.yo());
                gzwVar.gsd(uefVar.moa());
                com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, str, str2, jSONObject, j8);
            }

            @Override // com.bytedance.sdk.component.cz.uef.oa
            public void uef(com.bytedance.sdk.component.cz.oa.uef uefVar, String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
                if (uefVar != null) {
                    com.bytedance.sdk.openadsdk.core.model.gzw gzwVar = new com.bytedance.sdk.openadsdk.core.model.gzw();
                    gzwVar.pz(uefVar.uef());
                    gzwVar.gr(uefVar.oa());
                    gzwVar.gzw(uefVar.yo());
                    gzwVar.gsd(uefVar.moa());
                    com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), gzwVar, str, str2, new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.core.zjm.cq.4.1
                        @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                        public JSONObject uef() {
                            return jSONObject;
                        }

                        @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                        public JSONObject yo() {
                            return jSONObject2;
                        }
                    });
                }
            }
        });
    }

    public static String yo() {
        String strYo;
        if (f25844oa == null) {
            f25844oa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("tt_sp", "js_render_ver", "");
        }
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarOa = com.bytedance.sdk.component.adexpress.uef.oa.bcc.oa();
        if (uefVarOa != null && (strYo = uefVarOa.yo()) != null && !strYo.equals(f25844oa)) {
            f25844oa = strYo;
            com.bytedance.sdk.openadsdk.oib.moa.uef.uef("tt_sp", "js_render_ver", strYo);
        }
        return f25844oa;
    }
}
