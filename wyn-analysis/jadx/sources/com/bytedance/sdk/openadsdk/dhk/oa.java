package com.bytedance.sdk.openadsdk.dhk;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.oa.uef.bcc;
import com.bytedance.sdk.component.oa.uef.dz;
import com.bytedance.sdk.component.oa.uef.uef.uef.lw;
import com.bytedance.sdk.component.oa.uef.uef.uef.zjm;
import com.bytedance.sdk.component.oa.uef.wrv;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.sy;
import com.bytedance.sdk.component.xs.uef;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.rt;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.dhk.uef.yo;
import com.bytedance.sdk.openadsdk.sy.moa;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.km;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa {
    private static volatile oa uef;
    private final Map<String, JSONObject> moa = new HashMap();

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.sdk.component.xs.uef f25879oa;
    private yo yo;

    public class uef implements bcc {
        public uef() {
        }

        @Override // com.bytedance.sdk.component.oa.uef.bcc
        public dz uef(bcc.uef uefVar) throws IOException {
            JSONObject jSONObjectUef;
            wrv wrvVarUef = uefVar.uef();
            if (wrvVarUef.moa() != null && !wrvVarUef.moa().moa().isEmpty()) {
                List<String> listMoa = wrvVarUef.moa().moa();
                StringBuilder sb2 = new StringBuilder();
                for (String str : listMoa) {
                    sb2.append("/");
                    sb2.append(str);
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string)) {
                    if (string.equals("/monitor/collect/c/session")) {
                        return uefVar.uef(wrvVarUef);
                    }
                    if (string.equals("/api/ad/union/sdk/register_status/") || string.equals("/api/ad/union/sdk/compliance_status/")) {
                        return uefVar.uef(wrvVarUef);
                    }
                }
            }
            wrv.uef uefVarDj = wrvVarUef.dj();
            String strOa = com.bytedance.sdk.openadsdk.oib.moa.uef.oa("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!TextUtils.isEmpty(strOa) && (jSONObjectUef = oa.this.uef(strOa)) != null) {
                uefVarDj.oa("transfer-param", jSONObjectUef.optString(PglCryptUtils.KEY_MESSAGE));
                if (jSONObjectUef.optInt("cypher") == 4) {
                    uefVarDj.oa("cypher", "4");
                } else {
                    uefVarDj.oa("cypher", "3");
                }
            }
            try {
                uefVarDj.oa("x-pangle-target-idc", dj.oa().jp());
            } catch (Throwable unused) {
            }
            return uefVar.uef(uefVarDj.oa());
        }
    }

    private oa() {
        int iUef = uef();
        uef.C0068uef c0068uef = new uef.C0068uef();
        long j8 = iUef;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uef.C0068uef c0068uefUef = c0068uef.uef(j8, timeUnit).oa(j8, timeUnit).yo(j8, timeUnit).uef(new uef());
        if (com.bytedance.sdk.openadsdk.utils.oa.uef()) {
            c0068uefUef.uef(new uef.oa() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.1
                @Override // com.bytedance.sdk.component.xs.uef.oa
                public void oa(moa moaVar) {
                    moaVar.uef().yo();
                    moaVar.hashCode();
                    com.bytedance.sdk.openadsdk.sy.yo.oa(moaVar);
                }

                @Override // com.bytedance.sdk.component.xs.uef.oa
                public void uef(moa moaVar) {
                    moaVar.uef().yo();
                    moaVar.hashCode();
                    com.bytedance.sdk.openadsdk.sy.yo.uef(moaVar);
                }

                @Override // com.bytedance.sdk.component.xs.uef.oa
                public void yo(moa moaVar) {
                    moaVar.uef().yo();
                    moaVar.hashCode();
                    com.bytedance.sdk.openadsdk.sy.yo.yo(moaVar);
                }
            });
        }
        com.bytedance.sdk.component.xs.uef uefVarUef = c0068uefUef.uef(true).uef();
        this.f25879oa = uefVarUef;
        com.bytedance.sdk.component.oa.uef.uef.uef.uef.uef(new zjm() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.2
            @Override // com.bytedance.sdk.component.oa.uef.uef.uef.zjm
            public boolean oa() {
                return dj.oa().dh();
            }

            @Override // com.bytedance.sdk.component.oa.uef.uef.uef.zjm
            public ExecutorService uef() {
                if (dj.oa().dh()) {
                    return km.dj();
                }
                return null;
            }
        });
        com.bytedance.sdk.component.xs.uef.uef(new lw() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.3
            @Override // com.bytedance.sdk.component.oa.uef.uef.uef.lw
            public boolean uef() {
                return com.bytedance.sdk.openadsdk.gzw.lw.uef("net_http_protocol", 0) == 1;
            }
        });
        com.bytedance.sdk.component.xs.uef.uef(new uef.yo() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.4
            @Override // com.bytedance.sdk.component.xs.uef.yo
            public boolean oa() {
                return sy.bcc(com.bytedance.sdk.openadsdk.core.sy.uef());
            }

            @Override // com.bytedance.sdk.component.xs.uef.yo
            public boolean uef() {
                return com.bytedance.sdk.openadsdk.utils.oa.oa();
            }

            @Override // com.bytedance.sdk.component.xs.uef.yo
            public void uef(final String str, final String str2, final String str3, final int i5, final String str4, final boolean z2, final int i10, final int i11) {
                try {
                    if (TextUtils.isEmpty(str3) || !str3.contains("/api/ad/union/sdk/stats/batch/")) {
                        com.bytedance.sdk.openadsdk.ab.moa.uef("net_call_fail", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.4.1
                            /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
                            @Override // com.bytedance.sdk.openadsdk.ab.oa
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws java.lang.Exception {
                                /*
                                    r5 = this;
                                    org.json.JSONObject r0 = new org.json.JSONObject
                                    r0.<init>()
                                    java.lang.String r1 = "fail_url"
                                    java.lang.String r2 = r2
                                    r0.put(r1, r2)
                                    java.lang.String r1 = ""
                                    java.lang.String r2 = r2     // Catch: java.lang.Throwable -> L1d
                                    android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L1d
                                    java.lang.String r3 = r2.getHost()     // Catch: java.lang.Throwable -> L1d
                                    java.lang.String r2 = r2.getPath()     // Catch: java.lang.Throwable -> L1e
                                    goto L1f
                                L1d:
                                    r3 = r1
                                L1e:
                                    r2 = r1
                                L1f:
                                    boolean r4 = android.text.TextUtils.isEmpty(r3)
                                    if (r4 != 0) goto L2a
                                    java.lang.String r4 = "error_domain"
                                    r0.put(r4, r3)
                                L2a:
                                    boolean r3 = android.text.TextUtils.isEmpty(r2)
                                    if (r3 != 0) goto L35
                                    java.lang.String r3 = "error_path"
                                    r0.put(r3, r2)
                                L35:
                                    java.lang.String r2 = "error_code"
                                    int r3 = r3
                                    r0.put(r2, r3)
                                    java.lang.String r2 = "trace_id"
                                    java.lang.String r3 = r4
                                    r0.put(r2, r3)
                                    java.lang.String r2 = "error_msg"
                                    java.lang.String r3 = r5
                                    r0.put(r2, r3)
                                    java.lang.String r2 = "is_retry_enabled"
                                    boolean r3 = r6
                                    r0.put(r2, r3)
                                    boolean r2 = r6
                                    if (r2 == 0) goto L98
                                    java.lang.String r2 = "primary_url"
                                    java.lang.String r3 = r7
                                    r0.put(r2, r3)
                                    java.lang.String r2 = r7
                                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                                    if (r2 != 0) goto L8a
                                    java.lang.String r2 = r7     // Catch: java.lang.Throwable -> L73
                                    android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L73
                                    java.lang.String r3 = r2.getHost()     // Catch: java.lang.Throwable -> L73
                                    java.lang.String r1 = r2.getPath()     // Catch: java.lang.Throwable -> L74
                                    goto L74
                                L73:
                                    r3 = r1
                                L74:
                                    boolean r2 = android.text.TextUtils.isEmpty(r3)
                                    if (r2 != 0) goto L7f
                                    java.lang.String r2 = "primary_domain"
                                    r0.put(r2, r3)
                                L7f:
                                    boolean r2 = android.text.TextUtils.isEmpty(r1)
                                    if (r2 != 0) goto L8a
                                    java.lang.String r2 = "primary_path"
                                    r0.put(r2, r1)
                                L8a:
                                    java.lang.String r1 = "attempt_index"
                                    int r2 = r8
                                    r0.put(r1, r2)
                                    java.lang.String r1 = "total_attempts"
                                    int r2 = r9
                                    r0.put(r1, r2)
                                L98:
                                    com.bytedance.sdk.openadsdk.ab.uef.moa r1 = com.bytedance.sdk.openadsdk.ab.uef.moa.oa()
                                    java.lang.String r2 = "net_call_fail"
                                    com.bytedance.sdk.openadsdk.ab.uef.moa r1 = r1.uef(r2)
                                    java.lang.String r0 = r0.toString()
                                    com.bytedance.sdk.openadsdk.ab.uef.moa r0 = r1.oa(r0)
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dhk.oa.AnonymousClass4.AnonymousClass1.uef():com.bytedance.sdk.openadsdk.ab.uef.yo");
                            }
                        });
                    }
                } catch (Throwable unused) {
                }
            }
        });
        com.bytedance.sdk.component.xs.yo.yo.uef().uef(com.bytedance.sdk.openadsdk.utils.oa.lw());
        com.bytedance.sdk.component.oa.uef.moa moaVarOa = uefVarUef.bcc().oa();
        if (moaVarOa != null) {
            moaVarOa.uef(32);
        }
    }

    private void lw() {
        if (this.yo == null) {
            this.yo = new yo();
        }
    }

    public static oa oa() {
        if (uef == null) {
            synchronized (oa.class) {
                try {
                    if (uef == null) {
                        uef = new oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public yo moa() {
        lw();
        return this.yo;
    }

    public com.bytedance.sdk.component.xs.uef yo() {
        return this.f25879oa;
    }

    public int uef() {
        try {
            return com.bytedance.sdk.openadsdk.gzw.lw.uef("net_time_out", 10000);
        } catch (Throwable unused) {
            return 10000;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uef(String str) throws JSONException {
        JSONObject jSONObject = this.moa.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ipv6", str);
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject2, new rt(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        this.moa.put(str, jSONObjectEncryptType4);
        return jSONObjectEncryptType4;
    }

    public void uef(String str, int i5, int i10, ImageView imageView, gzw gzwVar) {
        com.bytedance.sdk.openadsdk.zjm.moa.uef(str).uef(i5).oa(i10).lw(af.lw(com.bytedance.sdk.openadsdk.core.sy.uef())).moa(af.yo(com.bytedance.sdk.openadsdk.core.sy.uef())).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(gzwVar, str, imageView));
    }

    public void uef(int i5, final ImageView imageView, final gzw gzwVar) {
        if (gzwVar == null || !TextUtils.isEmpty(gzwVar.tpx())) {
            com.bytedance.sdk.openadsdk.zjm.moa.uef(gzwVar.tpx()).uef(i5).oa(i5).lw(af.lw(com.bytedance.sdk.openadsdk.core.sy.uef())).moa(af.yo(com.bytedance.sdk.openadsdk.core.sy.uef())).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(gzwVar, gzwVar.tpx(), imageView));
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (imageView.getDrawable() != null) {
                            Intent intent = new Intent();
                            String strOrq = gzwVar.orq();
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse(strOrq));
                            try {
                                com.bytedance.sdk.component.utils.oa.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), intent, null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.sy syVar, ImageView imageView, gzw gzwVar) {
        if (syVar == null || TextUtils.isEmpty(syVar.uef()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zjm.moa.uef(syVar).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(gzwVar, syVar.uef(), imageView));
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.sy syVar, ImageView imageView, gzw gzwVar, ab abVar) {
        if (syVar == null || TextUtils.isEmpty(syVar.uef()) || imageView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zjm.moa.uef(syVar).yo(1).uef(com.bytedance.sdk.openadsdk.zjm.yo.uef(gzwVar, syVar.uef(), imageView, abVar));
    }

    public void uef(String str, View view) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        com.bytedance.sdk.openadsdk.zjm.moa.uef(str).yo(2).uef(new com.bytedance.sdk.component.lw.bcc() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.7
            @Override // com.bytedance.sdk.component.lw.bcc
            public Bitmap uef(Bitmap bitmap) {
                View view2 = (View) weakReference.get();
                if (view2 == null) {
                    return null;
                }
                return com.bytedance.sdk.component.adexpress.moa.uef.uef(view2.getContext(), bitmap, 10);
            }
        }).uef(new ab() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.6
            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(int i5, String str2, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.lw.ab
            public void uef(com.bytedance.sdk.component.lw.dj djVar) {
                final View view2;
                if (djVar == null) {
                    return;
                }
                final Object objOa = djVar.oa();
                if (!(objOa instanceof Bitmap) || (view2 = (View) weakReference.get()) == null) {
                    return;
                }
                if (!km.ivm()) {
                    view2.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dhk.oa.6.1
                        @Override // java.lang.Runnable
                        public void run() {
                            View view3 = view2;
                            if (view3 instanceof ImageView) {
                                ((ImageView) view3).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objOa));
                            } else {
                                view3.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objOa));
                            }
                        }
                    });
                } else if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable(new BitmapDrawable(view2.getResources(), (Bitmap) objOa));
                } else {
                    view2.setBackground(new BitmapDrawable(view2.getResources(), (Bitmap) objOa));
                }
            }
        });
    }
}
