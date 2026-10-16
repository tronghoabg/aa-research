package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import R8.v;
import ad.r;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30666a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30667b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f30666a = i5;
        this.f30667b = obj;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.f30666a) {
            case 0:
                return tg.b.P("metric");
            default:
                return tg.b.P("launchUrl");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.f30666a) {
            case 0:
                return "ACMHandler";
            default:
                return "LaunchUrlHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) throws JSONException, NumberFormatException {
        switch (this.f30666a) {
            case 0:
                String string = jSONObject.getString("event");
                String string2 = jSONObject.getString("metricName");
                String string3 = jSONObject.getString("type");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tags");
                String string4 = jSONObject.getString(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                boolean zA = AbstractC3340k.a(string3, "counter");
                com.moloco.sdk.acm.recorder.c cVar = (com.moloco.sdk.acm.recorder.c) this.f30667b;
                if (zA) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ACMHandler", N0.a.h("Count metric recorded: ", string2, " = ", string4), false, 4, null);
                    AbstractC3340k.b(string2);
                    com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h(string2);
                    AbstractC3340k.b(string4);
                    int i5 = Integer.parseInt(string4);
                    if (i5 >= 0) {
                        hVar.f28419c = i5;
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            AbstractC3340k.d(itKeys, "keys(...)");
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                AbstractC3340k.b(next);
                                String string5 = jSONObjectOptJSONObject.getString(next);
                                AbstractC3340k.d(string5, "getString(...)");
                                hVar.a(next, string5);
                            }
                        }
                        cVar.a(hVar);
                        return;
                    }
                    throw new IllegalArgumentException("Count cannot be negative");
                }
                if (AbstractC3340k.a(string3, "timer")) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "ACMHandler", N0.a.h("Timer metric recorded: ", string2, " = ", string4), false, 4, null);
                    com.moloco.sdk.acm.k kVar = com.moloco.sdk.acm.l.Companion;
                    AbstractC3340k.b(string2);
                    kVar.getClass();
                    com.moloco.sdk.acm.l lVar = new com.moloco.sdk.acm.l(string2, new com.moloco.sdk.acm.services.f(new r()));
                    AbstractC3340k.b(string4);
                    long j8 = Long.parseLong(string4);
                    if (j8 >= 0) {
                        lVar.f28450b = j8;
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                            AbstractC3340k.d(itKeys2, "keys(...)");
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                AbstractC3340k.b(next2);
                                String string6 = jSONObjectOptJSONObject.getString(next2);
                                AbstractC3340k.d(string6, "getString(...)");
                                lVar.a(next2, string6);
                            }
                        }
                        cVar.b(lVar);
                        return;
                    }
                    throw new IllegalArgumentException("Count cannot be negative");
                }
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "ACMHandler", v.f("Unknown event type: ", string), null, false, 12, null);
                return;
            default:
                String string7 = jSONObject.getString("url");
                AbstractC3340k.b(string7);
                ((G0) this.f30667b).a(string7);
                return;
        }
    }
}
