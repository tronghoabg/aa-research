package com.moloco.sdk.internal.services.encryption;

import Ef.H;
import Ef.S;
import Va.X7;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import androidx.lifecycle.J;
import ba.C1521a;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.B;
import com.moloco.sdk.internal.ilrd.s;
import com.moloco.sdk.internal.services.E;
import com.moloco.sdk.internal.services.events.e;
import com.moloco.sdk.internal.services.init.f;
import com.moloco.sdk.internal.services.init.k;
import com.moloco.sdk.internal.services.l;
import com.moloco.sdk.internal.services.m;
import com.moloco.sdk.internal.services.n;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.internal.services.v;
import com.moloco.sdk.internal.services.x;
import com.moloco.sdk.internal.services.y;
import com.moloco.sdk.internal.services.z;
import com.moloco.sdk.internal.unity_bridge.MolocoUnityPlugin;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.service_locator.g;
import com.moloco.sdk.service_locator.i;
import com.moloco.sdk.service_locator.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.q;
import ef.C2532p;
import ic.d;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import wd.C4402c;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29584a;

    public /* synthetic */ a(int i5) {
        this.f29584a = i5;
    }

    @Override // tf.a
    public final Object invoke() {
        byte b5 = 0;
        switch (this.f29584a) {
            case 0:
                return new IvParameterSpec(Base64.decode(BuildConfig.MOLOCO_SDK_BIDTOKEN_SALT, 0));
            case 1:
                return MolocoUnityPlugin.context_delegate$lambda$0();
            case 2:
                return MolocoUnityPlugin.adManager_delegate$lambda$1();
            case 3:
                return new B(j.b());
            case 4:
                return Moloco.initializationHandler_delegate$lambda$7();
            case 5:
                return Moloco.bidTokenHandler_delegate$lambda$8();
            case 6:
                return Moloco.adCreator_delegate$lambda$9();
            case 7:
                return Moloco.scope_delegate$lambda$10();
            case 8:
                Context contextE = d.e(null);
                b.Companion.getClass();
                return new l(contextE, new c(null));
            case 9:
                return new com.moloco.sdk.internal.services.analytics.c(j.b(), com.moloco.sdk.service_locator.l.a(), (e) com.moloco.sdk.service_locator.l.f29865c.getValue());
            case 10:
                return new m((com.moloco.sdk.internal.services.analytics.c) com.moloco.sdk.service_locator.b.f29831a.getValue(), i.b());
            case 11:
                return new u(J.f18589i.f18595f, (m) com.moloco.sdk.service_locator.b.f29832b.getValue());
            case 12:
                return new com.moloco.sdk.internal.error.b((com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.f29836a.getValue(), new X2.j(i.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.f32437a.getValue()));
            case 13:
                return new s(d.e(null));
            case 14:
                return new com.moloco.sdk.internal.services.config.a();
            case 15:
                List listC = AbstractC3935e.C(new com.moloco.sdk.internal.error.crash.filters.a());
                X2.j jVar = new X2.j(i.b(), (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.f32437a.getValue());
                b.Companion.getClass();
                return new com.moloco.sdk.internal.error.crash.c(new C1521a(listC, jVar, new c(null), 4));
            case 16:
                return new x(d.e(null));
            case 17:
                return new v(d.e(null));
            case 18:
                return new y(d.e(null));
            case 19:
                return new com.moloco.sdk.internal.services.i(d.e(null));
            case 20:
                return new E(d.e(null));
            case 21:
                return new z(d.e(null));
            case 22:
                return new n(d.e(null));
            case 23:
                return new com.moloco.sdk.internal.services.init.u((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.d.f32437a.getValue());
            case 24:
                return new f(com.moloco.sdk.service_locator.e.b(), com.moloco.sdk.service_locator.e.a(), (com.moloco.sdk.internal.services.usertracker.c) com.moloco.sdk.service_locator.l.f29864b.getValue(), j.a());
            case 25:
                f fVar = (f) com.moloco.sdk.service_locator.f.f29848d.getValue();
                SharedPreferences sharedPreferences = d.e(null).getSharedPreferences("moloco_sdk_init_cache", 0);
                AbstractC3340k.d(sharedPreferences, "getSharedPreferences(...)");
                Lf.e eVar = S.f3698a;
                Lf.d dVar = Lf.d.f7120b;
                return new com.moloco.sdk.internal.services.init.s(fVar, new k(sharedPreferences, dVar), H.c(dVar.plus(H.f())));
            case 26:
                return (p) ((com.moloco.sdk.internal.services.config.a) com.moloco.sdk.service_locator.c.f29836a.getValue()).a(p.class, q.f30318a);
            case 27:
                p mediaConfig = g.a();
                C2532p c2532p = com.moloco.sdk.service_locator.e.f29842e;
                E connectivityService = (E) c2532p.getValue();
                com.moloco.sdk.internal.error.b errorReportingService = com.moloco.sdk.service_locator.b.b();
                C4402c httpClient = j.a();
                AbstractC3340k.e(mediaConfig, "mediaConfig");
                AbstractC3340k.e(connectivityService, "connectivityService");
                AbstractC3340k.e(errorReportingService, "errorReportingService");
                AbstractC3340k.e(httpClient, "httpClient");
                X7 x72 = new X7();
                x72.f13841a = mediaConfig;
                x72.f13842b = connectivityService;
                x72.f13843c = errorReportingService;
                x72.f13844d = httpClient;
                return new o(g.a(), new Dd.c((E) c2532p.getValue(), com.moloco.sdk.service_locator.b.b(), j.a()), x72, new G4.c(d.e(null), b5));
            case 28:
                return new com.moloco.sdk.internal.services.k();
            default:
                return new com.moloco.sdk.internal.services.proto.a();
        }
    }
}
