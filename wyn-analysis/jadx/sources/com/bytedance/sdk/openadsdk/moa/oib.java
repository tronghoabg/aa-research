package com.bytedance.sdk.openadsdk.moa;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oib implements com.bytedance.sdk.openadsdk.moa.moa.lw {
    private JSONArray bcc;
    private JSONObject ivm;
    private AtomicBoolean lw;
    private Boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private gzw f25972oa;
    private String uef;
    private JSONArray xs;
    private Boolean yo;

    public oib(int i5, String str, gzw gzwVar) throws JSONException {
        this.uef = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.yo = bool;
        this.moa = bool;
        this.lw = new AtomicBoolean(false);
        this.uef = str;
        this.f25972oa = gzwVar;
        this.ivm = new JSONObject();
        this.xs = new JSONArray();
        this.bcc = new JSONArray();
        uef(this.ivm, "webview_source", Integer.valueOf(i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ab() {
        return this.moa.booleanValue() || this.yo.booleanValue();
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.yo
    public void bcc() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.3
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "type", "native_enterBackground");
                oib oibVar = oib.this;
                oibVar.uef(oibVar.xs, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.oa
    public void cq() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.15
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "no_native_render", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.yo
    public void cz() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "type", "native_enterForeground");
                oib oibVar = oib.this;
                oibVar.uef(oibVar.xs, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.lw
    public void dj() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.10
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (oib.this.ab()) {
                    if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(oib.this.f25972oa) && oib.this.lw.get()) {
                        return;
                    }
                    if (oib.this.xs != null && oib.this.xs.length() != 0) {
                        try {
                            oib.this.ivm.put("native_switchBackgroundAndForeground", oib.this.xs);
                        } catch (Exception unused) {
                        }
                    }
                    if (oib.this.bcc != null && oib.this.bcc.length() != 0) {
                        try {
                            oib.this.ivm.put("intercept_source", oib.this.bcc);
                        } catch (Exception unused2) {
                        }
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("webview_time_track", oib.this.ivm);
                    } catch (JSONException e7) {
                        dhk.uef("WebviewTimeTrack", "trySendTrackInfo json error", e7);
                    }
                    if (com.bytedance.sdk.openadsdk.core.zjm.oa().wk() && oib.this.ivm != null) {
                        JSONObject unused3 = oib.this.ivm;
                    }
                    oib.this.lw.set(true);
                    yo.oa(oib.this.f25972oa, oib.this.uef, "webview_time_track", jSONObject);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.moa
    public void dz() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.16
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "render_failed", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.moa
    public void wk() {
        try {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.17
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, "render_did_finish", jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.oa
    public void wrv() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.14
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "native_render_end", jSONObject);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                oib.this.uef(jSONObject2, "ts", Long.valueOf(jCurrentTimeMillis2));
                oib oibVar2 = oib.this;
                oibVar2.uef(oibVar2.ivm, "render_success", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.lw
    public void zjm() {
        this.yo = Boolean.TRUE;
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.yo
    public void ivm() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.31
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "native_endcard_show", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void lw() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.29
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "webview_load_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void moa() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.28
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "webview_load_start", (Object) jSONObject, false);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.moa
    public void oa() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.12
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "render_success", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.yo
    public void xs() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.2
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "native_endcard_close", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.yo
    public void yo() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.27
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "native_render_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void ivm(final String str) {
        try {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.21
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void lw(final String str) {
        try {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.20
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void moa(final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.18
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void oa(final String str, final long j8, final long j10, final int i5) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.6
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j10 < j8) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "start_ts", Long.valueOf(j8));
                oib.this.uef(jSONObject, "end_ts", Long.valueOf(j10));
                oib.this.uef(jSONObject, "intercept_type", Integer.valueOf(i5));
                oib.this.uef(jSONObject, "type", "intercept_js");
                oib.this.uef(jSONObject, "url", str);
                oib.this.uef(jSONObject, "duration", Long.valueOf(j10 - j8));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.bcc, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void xs(final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.24
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void yo(final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.11
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void oa(final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.8
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "jsb", str);
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "webview_jsb_end", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void yo(final int i5, final String str) {
        try {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.22
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    oib.this.uef(jSONObject, "code", Integer.valueOf(i5));
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void oa(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.9
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2;
                if (oib.this.ivm == null || (jSONObject2 = jSONObject) == null) {
                    return;
                }
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, next, jSONObject.opt(next));
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.moa
    public void uef() {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.1
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib oibVar = oib.this;
                oibVar.uef(jSONObject, "render_sequence", Integer.valueOf(oibVar.f25972oa.ix()));
                if (oib.this.f25972oa != null) {
                    if (oib.this.f25972oa.vep() != null) {
                        if (oib.this.f25972oa.vep().wrv()) {
                            oib.this.uef(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().moa()));
                            oib.this.uef(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().moa()));
                        } else {
                            oib.this.uef(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().yo()));
                            oib.this.uef(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().yo()));
                        }
                    } else if (oib.this.f25972oa.aje() != null) {
                        oib.this.uef(jSONObject, "webview_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().moa()));
                        oib.this.uef(jSONObject, "available_cache_count", Integer.valueOf(com.bytedance.sdk.component.adexpress.lw.lw.uef().moa()));
                    }
                }
                oib oibVar2 = oib.this;
                oibVar2.uef(oibVar2.ivm, "render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void oa(final int i5, final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.13
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "code", Integer.valueOf(i5));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, str, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.moa
    public void uef(final int i5, final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.23
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "code", Integer.valueOf(i5));
                String str2 = str;
                if (str2 != null) {
                    oib.this.uef(jSONObject, "reason", str2);
                }
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "render_error", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void oa(final int i5) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.25
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "isWebViewCache", Integer.valueOf(i5));
                if (oib.this.f25972oa != null) {
                    if (oib.this.f25972oa.uu()) {
                        oib.this.uef(jSONObject, "engine_version", "v3");
                    } else {
                        oib.this.uef(jSONObject, "engine_version", "v1");
                    }
                }
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "before_webview_request", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.oa
    public void uef(final int i5) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.26
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "backup_type", Integer.valueOf(i5));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "native_render_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void uef(final JSONObject jSONObject) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.30
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                oib.this.uef(jSONObject2, "ts", Long.valueOf(System.currentTimeMillis()));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "webview_load_error", jSONObject2);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void uef(final String str, final long j8, final long j10, final int i5) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str) || j10 < j8) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "start_ts", Long.valueOf(j8));
                oib.this.uef(jSONObject, "end_ts", Long.valueOf(j10));
                oib.this.uef(jSONObject, "intercept_type", Integer.valueOf(i5));
                oib.this.uef(jSONObject, "type", "intercept_html");
                oib.this.uef(jSONObject, "url", str);
                oib.this.uef(jSONObject, "duration", Long.valueOf(j10 - j8));
                oib oibVar = oib.this;
                oibVar.uef(oibVar.bcc, jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.ivm
    public void uef(final String str) {
        com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.7
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                oib.this.uef(jSONObject, "jsb", str);
                oib oibVar = oib.this;
                oibVar.uef(oibVar.ivm, "webview_jsb_start", jSONObject);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.lw
    public void uef(boolean z2) {
        this.moa = Boolean.valueOf(z2);
    }

    public oib() {
        this.uef = "embeded_ad";
        Boolean bool = Boolean.FALSE;
        this.yo = bool;
        this.moa = bool;
        this.lw = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONObject jSONObject, String str, Object obj, boolean z2) throws JSONException {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!z2) {
            try {
                if (jSONObject.has(str)) {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        jSONObject.put(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONObject jSONObject, String str, Object obj) throws JSONException {
        uef(jSONObject, str, obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(JSONArray jSONArray, Object obj) {
        if (jSONArray == null || jSONArray.length() >= 10) {
            return;
        }
        try {
            jSONArray.put(obj);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.moa.moa.uef
    public void uef(final String str, final boolean z2) {
        try {
            com.bytedance.sdk.component.utils.cz.uef().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.moa.oib.19
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    oib.this.uef(jSONObject, "ts", Long.valueOf(jCurrentTimeMillis));
                    oib.this.uef(jSONObject, "isReuse", Integer.valueOf(z2 ? 1 : 0));
                    oib oibVar = oib.this;
                    oibVar.uef(oibVar.ivm, str, jSONObject);
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
