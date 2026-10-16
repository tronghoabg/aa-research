package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.H;
import Hf.j0;
import Hf.k0;
import R8.v;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.B;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final B f30671a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30672b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f30673c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f30674d;

    public c(B b5, Kd.a aVar) {
        this.f30671a = b5;
        this.f30672b = aVar;
        j0 j0VarB = k0.b(0, 0, 7);
        this.f30673c = j0VarB;
        this.f30674d = j0VarB;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        return tg.b.P("clickthrough");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        return "ClickthroughEventHandler";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) throws JSONException {
        if (AbstractC3340k.a(jSONObject.getString("event"), ff.o.p0(tg.b.P("clickthrough")))) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughEventHandler", v.f("Ad clicked on ", jSONObject.getString("contentType")), false, 4, null);
            H.D(this.f30672b, null, new b(this, jSONObject.getString("url"), null), 3);
            return;
        }
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ClickthroughEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
    }
}
