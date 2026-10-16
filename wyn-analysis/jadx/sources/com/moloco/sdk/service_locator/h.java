package com.moloco.sdk.service_locator;

import Hf.j0;
import N.C0718d;
import N.P;
import a9.C1341a;
import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.C1940c;
import com.moloco.sdk.internal.services.C1944g;
import com.moloco.sdk.internal.services.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1980a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.AbstractC2012g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2033a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2034b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2035c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2036d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2037e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.C2038f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.z;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.I;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.o;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import fd.C2635f;
import ff.AbstractC2641B;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import kd.C3306b;
import kotlin.jvm.internal.AbstractC3340k;
import p3.C3761b;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29852a;

    public /* synthetic */ h(int i5) {
        this.f29852a = i5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ef.i, java.lang.Object] */
    @Override // tf.a
    public final Object invoke() {
        Class<?> returnType;
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.e eVarB;
        C2515C c2515c = C2515C.f34653a;
        int i5 = 0;
        switch (this.f29852a) {
            case 0:
                return new r(ic.d.e(null));
            case 1:
                return new C1880b();
            case 2:
                Object systemService = ic.d.e(null).getSystemService("activity");
                AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                return (ActivityManager) systemService;
            case 3:
                return wd.f.a(new com.moloco.sdk.internal.http.a(e.a().a(), e.b().a(), i5));
            case 4:
                return new C1940c(ic.d.e(null), e.b());
            case 5:
                return new o(ic.d.e(null));
            case 6:
                o worker = (o) j.f29860c.getValue();
                AbstractC3340k.e(worker, "worker");
                return new n(worker);
            case 7:
                SharedPreferences sharedPreferences = ic.d.e(null).getSharedPreferences("moloco_sdk_preferences", 0);
                AbstractC3340k.b(sharedPreferences);
                return new C1944g(sharedPreferences);
            case 8:
                return new com.moloco.sdk.internal.services.usertracker.a((C1944g) k.f29862a.getValue());
            case 9:
                return new com.moloco.sdk.internal.services.usertracker.c(new C1341a(), (com.moloco.sdk.internal.services.usertracker.a) l.f29863a.getValue());
            case 10:
                com.moloco.sdk.internal.services.events.e eVar = new com.moloco.sdk.internal.services.events.e();
                eVar.f29607a = com.moloco.sdk.internal.services.events.f.f29608a;
                return eVar;
            case 11:
                j0 j0Var = MraidActivity.f30371h;
                return l.a();
            case 12:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "MraidActivity", "Skip button shown in MraidActivity", null, false, 12, null);
                AbstractC2012g.f30410j.invoke();
                return c2515c;
            case 13:
                WeakReference weakReference = AbstractC2012g.f30401a;
                return c2515c;
            case 15:
                C1980a c1980a = StaticAdActivity.f30524g;
                if (c1980a != null) {
                    c1980a.invoke();
                }
            case 14:
                return c2515c;
            case 16:
                List listD = AbstractC3935e.D(C2033a.f30637e, z.f30665f, x.f30663f, y.f30664f, A.f30624f, B.f30625f, C.f30626f, D.f30627f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.j.f30646f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i.f30645f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.h.f30644f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.l.f30648e, C2034b.f30638f, C2036d.f30640f, C2037e.f30641f, C2035c.f30639f, C2038f.f30642f, t.f30659f, u.f30660f, m.f30649e, w.f30662e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.n.f30650f, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.o.f30651f, p.f30652f);
                int iD = AbstractC2641B.D(ff.p.a0(listD, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD >= 16 ? iD : 16);
                for (Object obj : listD) {
                    linkedHashMap.put(((s) obj).a(), obj);
                }
                return linkedHashMap;
            case 17:
                return new I();
            case 18:
                return new L0(j.b());
            case 19:
                return C0718d.G(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), P.f7730f);
            case 20:
                return C0718d.G(Boolean.TRUE, P.f7730f);
            case 21:
                return C0718d.G(Boolean.TRUE, P.f7730f);
            case 22:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.core.b();
            case 23:
                try {
                    eVarB = j.b();
                } catch (Exception e7) {
                    MolocoLogger.warn$default(MolocoLogger.INSTANCE, "BestAttemptHttpRequest", "Failed to create PersistentHttpRequest, invoking NonPersistendHttpRequest", e7, false, 8, null);
                    eVarB = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l) com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.m.f32463a.getValue();
                }
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c(eVarB);
            case 24:
                return new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l(j.a());
            case 25:
                return C2635f.f35333d;
            case 26:
                return new C3306b();
            case 27:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", new Class[0]);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 28:
                try {
                    Method method = (Method) C3761b.f43205d.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class<?> cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            default:
                return new Nd.d();
        }
    }
}
