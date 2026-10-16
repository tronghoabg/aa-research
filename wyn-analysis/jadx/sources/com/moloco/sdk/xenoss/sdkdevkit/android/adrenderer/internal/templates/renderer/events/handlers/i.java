package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.H;
import Ef.S;
import Jd.C0672f;
import R8.v;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class i implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f30689a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30690b;

    public i(com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest) {
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        this.f30689a = persistentHttpRequest;
        Lf.e eVar = S.f3698a;
        this.f30690b = H.c(Lf.d.f7120b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        return ff.m.P0(new String[]{"sendGet", "sendPost"});
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        return "HttpEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) throws JSONException, Ya.a {
        String string = jSONObject.getString("event");
        boolean zA = AbstractC3340k.a(string, "sendGet");
        Kd.a aVar = this.f30690b;
        if (zA) {
            String string2 = jSONObject.getString("url");
            AbstractC3340k.b(string2);
            H.D(aVar, null, new g(this, string2, null), 3);
        } else {
            if (AbstractC3340k.a(string, "sendPost")) {
                String string3 = jSONObject.getString("url");
                String string4 = jSONObject.getString("body");
                String strOptString = jSONObject.optString("contentType", C0672f.f6051f.toString());
                AbstractC3340k.d(strOptString, "optString(...)");
                C0672f c0672fU = AbstractC3230e0.u(strOptString);
                AbstractC3340k.b(string3);
                AbstractC3340k.b(string4);
                H.D(aVar, null, new h(string4, this, string3, c0672fU, null), 3);
                return;
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpEventHandler", v.f("Unsupported event type: ", string), null, false, 12, null);
        }
    }
}
