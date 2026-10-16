package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import Bf.r;
import Ef.H;
import ac.C1346a;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.bumptech.glide.f;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.C2006a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.G;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30609a;

    /* renamed from: b, reason: collision with root package name */
    public final f f30610b;

    public d(Context context, f fVar) {
        this.f30609a = context;
        this.f30610b = fVar;
    }

    @JavascriptInterface
    public final void close() {
        f fVar = this.f30610b;
        if (((G) fVar.f24236g) == G.f30351c) {
            fVar.f24236g = G.f30350b;
        }
    }

    @JavascriptInterface
    public final void expand(@NotNull String url) {
        AbstractC3340k.e(url, "url");
    }

    @JavascriptInterface
    public final void open(@NotNull String jsonParams) throws JSONException {
        AbstractC3340k.e(jsonParams, "jsonParams");
        String string = new JSONObject(jsonParams).getString("url");
        AbstractC3340k.b(string);
        f fVar = this.f30610b;
        C1346a c1346a = (C1346a) fVar.f24234e;
        JSONObject jSONObject = new JSONObject();
        if (r.k0(string, "itms-apps://", false)) {
            string = r.h0(string, "itms-apps://", "https://", false);
        }
        jSONObject.put("event", "clickthrough");
        jSONObject.put("contentType", "mraid");
        jSONObject.put("url", string);
        try {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c) fVar.f24232c).a(jSONObject);
            c1346a.getClass();
            c1346a.J("mraidbridge.nativeCallComplete(" + JSONObject.quote("open") + ')');
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TAG", "Ad clicked: ".concat(string), false, 4, null);
        } catch (Exception unused) {
            c1346a.getClass();
            c1346a.J("mraidbridge.notifyErrorEvent(" + JSONObject.quote("open") + ", " + JSONObject.quote("Can't open links when mraid container is not visible to the user") + ')');
        }
    }

    @JavascriptInterface
    public final void resize(@NotNull String url) {
        AbstractC3340k.e(url, "url");
    }

    @JavascriptInterface
    public final void setOrientationProperties(@NotNull String jsonParams) {
        AbstractC3340k.e(jsonParams, "jsonParams");
        try {
            JSONObject jSONObject = new JSONObject(jsonParams);
            boolean zOptBoolean = jSONObject.optBoolean("allowOrientationChange", true);
            String strOptString = jSONObject.optString("forceOrientation", "none");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Orientation Set from JSON: " + zOptBoolean + ", " + strOptString, false, 4, null);
            D.f30340a.getClass();
            D dA = C2006a.a(strOptString);
            if (dA != null) {
                f fVar = this.f30610b;
                H.D((Kd.a) fVar.f24233d, null, new a(fVar, zOptBoolean, dA, null), 3);
            }
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidJsEventReceiver", "Error parsing orientation properties JSON", e7, false, 8, null);
        }
    }
}
