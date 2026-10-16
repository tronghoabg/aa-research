package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers;

import Ef.H;
import Hf.C0594d0;
import Hf.j0;
import Hf.k0;
import com.moloco.sdk.internal.MolocoLogger;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30677a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30678b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f30679c;

    /* renamed from: d, reason: collision with root package name */
    public final C0594d0 f30680d;

    public e(int i5, Kd.a aVar) {
        this.f30677a = i5;
        switch (i5) {
            case 1:
                this.f30678b = aVar;
                j0 j0VarB = k0.b(0, 0, 7);
                this.f30679c = j0VarB;
                this.f30680d = new C0594d0(j0VarB);
                break;
            case 2:
                this.f30678b = aVar;
                j0 j0VarB2 = k0.b(0, 0, 7);
                this.f30679c = j0VarB2;
                this.f30680d = new C0594d0(j0VarB2);
                break;
            default:
                this.f30678b = aVar;
                j0 j0VarB3 = k0.b(0, 0, 7);
                this.f30679c = j0VarB3;
                this.f30680d = new C0594d0(j0VarB3);
                break;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final Set a() {
        switch (this.f30677a) {
            case 0:
                return tg.b.P("closeButtonShown");
            case 1:
                return tg.b.P("close");
            default:
                return tg.b.P("skipButtonShown");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final String b() {
        switch (this.f30677a) {
            case 0:
                return "CloseButtonEventHandler";
            case 1:
                return "CloseHandler";
            default:
                return "SkipButtonEventHandler";
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a
    public final void a(JSONObject jSONObject) {
        switch (this.f30677a) {
            case 0:
                if (!AbstractC3340k.a(jSONObject.getString("event"), ff.o.p0(tg.b.P("closeButtonShown")))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CloseButtonEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "CloseButtonEventHandler", "Close button shown event received from JavaScript", null, false, 12, null);
                    H.D(this.f30678b, null, new d(this, null), 3);
                    break;
                }
            case 1:
                if (!AbstractC3340k.a(jSONObject.getString("event"), ff.o.p0(tg.b.P("close")))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "CloseHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    H.D(this.f30678b, null, new f(this, null), 3);
                    break;
                }
            default:
                if (!AbstractC3340k.a(jSONObject.getString("event"), ff.o.p0(tg.b.P("skipButtonShown")))) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, "SkipButtonEventHandler", "Event not supported: " + jSONObject.getString("event"), false, 4, null);
                    break;
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "SkipButtonEventHandler", "Skip button shown event received from JavaScript", null, false, 12, null);
                    H.D(this.f30678b, null, new o(this, null), 3);
                    break;
                }
        }
    }
}
