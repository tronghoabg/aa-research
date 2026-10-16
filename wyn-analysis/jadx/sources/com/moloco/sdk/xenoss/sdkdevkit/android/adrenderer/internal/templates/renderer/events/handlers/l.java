package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.H;
import Hf.j0;
import Hf.k0;
import R8.v;
import a9.C1342b;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30698a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30699b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f30700c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f30701d;

    public l(int i5, Kd.a aVar) {
        this.f30698a = i5;
        switch (i5) {
            case 1:
                this.f30699b = aVar;
                j0 j0VarB = k0.b(1, 0, 6);
                this.f30700c = j0VarB;
                this.f30701d = j0VarB;
                break;
            default:
                this.f30699b = aVar;
                j0 j0VarB2 = k0.b(0, 0, 7);
                this.f30700c = j0VarB2;
                this.f30701d = j0VarB2;
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.f30698a) {
            case 0:
                return tg.b.P("playlistItemDisplaying");
            default:
                return ff.m.P0(new String[]{"requiredContentLoaded", "requiredContentError"});
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.f30698a) {
            case 0:
                return "PlayListItemDisplayingEventHandler";
            default:
                return "RequiredContentEventHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) throws JSONException {
        j jVar;
        switch (this.f30698a) {
            case 0:
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", jSONObject + " displaying.", false, 4, null);
                if (!AbstractC3340k.a(jSONObject.getString("event"), ff.o.p0(tg.b.P("playlistItemDisplaying")))) {
                    MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    String string = jSONObject.getString("creativeType");
                    C1342b c1342b = j.f30691b;
                    AbstractC3340k.b(string);
                    c1342b.getClass();
                    j[] jVarArrValues = j.values();
                    int length = jVarArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            jVar = jVarArrValues[i5];
                            if (!jVar.f30694a.equals(string)) {
                                i5++;
                            }
                        } else {
                            jVar = null;
                        }
                    }
                    MolocoLogger.debug$default(molocoLogger, "PlayListItemDisplayingEventHandler", jVar + " displaying.", false, 4, null);
                    if (jVar != null) {
                        H.D(this.f30699b, null, new k(this, jVar, null), 3);
                        break;
                    }
                }
                break;
            default:
                String string2 = jSONObject.getString("event");
                boolean zA = AbstractC3340k.a(string2, "requiredContentLoaded");
                Kd.a aVar = this.f30699b;
                if (zA) {
                    H.D(aVar, null, new m(this, null), 3);
                    break;
                } else if (AbstractC3340k.a(string2, "requiredContentError")) {
                    H.D(aVar, null, new n(this, null), 3);
                    break;
                } else {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "RequiredContentEventHandler", v.f("Event not handled: ", string2), false, 4, null);
                    break;
                }
        }
    }
}
