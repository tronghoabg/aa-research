package Cd;

import Ef.I0;
import R8.C0805a;
import Wf.AbstractC1240b0;
import ad.C1355I;
import android.app.ActivityManager;
import android.os.Build;
import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1888b;
import com.moloco.sdk.internal.ortb.model.C1894h;
import com.moloco.sdk.internal.ortb.model.C1903q;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.EnumC1897k;
import com.moloco.sdk.internal.ortb.model.F;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.services.C1940c;
import com.moloco.sdk.internal.services.bidtoken.AbstractC1939a;
import com.moloco.sdk.publisher.Moloco;
import com.moloco.sdk.publisher.privacy.InternalMolocoPrivacySettingsImpl;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C2121s;
import ef.C2515C;
import ef.C2532p;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import wd.C4402c;

/* renamed from: Cd.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0352u implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2179a;

    public /* synthetic */ C0352u(int i5) {
        this.f2179a = i5;
    }

    @Override // tf.a
    public final Object invoke() {
        int i5 = 21;
        int i10 = 3;
        int i11 = 0;
        switch (this.f2179a) {
            case 0:
                return vg.d.c("io.ktor.client.plugins.SaveBody");
            case 1:
                return new LinkedHashMap();
            case 2:
                return new ArrayList();
            case 3:
                return new ArrayList();
            case 4:
                Qd.f[] values = Qd.f.values();
                AbstractC3340k.e(values, "values");
                return new Sf.a("io.ktor.util.date.WeekDay", values);
            case 5:
                Qd.e[] values2 = Qd.e.values();
                AbstractC3340k.e(values2, "values");
                return new Sf.a("io.ktor.util.date.Month", values2);
            case 6:
                return defpackage.f.f34728d;
            case 7:
                return Xf.v.f16297b;
            case 8:
                return Xf.s.f16290b;
            case 9:
                return Xf.q.f16288b;
            case 10:
                return Xf.u.f16295b;
            case 11:
                return Xf.e.f16259b;
            case 12:
                C4402c c4402c = com.moloco.sdk.acm.http.b.f28426a;
                if (c4402c == null) {
                    AbstractC3340k.m("httpClient");
                    throw null;
                }
                String str = com.moloco.sdk.acm.http.b.f28427b;
                if (str != null) {
                    return new com.moloco.sdk.acm.http.g(c4402c, str);
                }
                AbstractC3340k.m("apiUrl");
                throw null;
            case 13:
                return wd.f.a(new Ad.g(28));
            case 14:
                C1906u.a aVar = com.moloco.sdk.internal.ortb.model.X.Companion;
                F.a aVar2 = EnumC1897k.Companion;
                long j8 = com.moloco.sdk.internal.i.f28532c;
                C1894h c1894h = new C1894h(j8);
                return new com.moloco.sdk.internal.ortb.model.h0(c1894h, c1894h, new C1888b(j8), new com.moloco.sdk.internal.ortb.model.f0(j8), new C1903q());
            case 15:
                return new com.moloco.sdk.internal.j(com.moloco.sdk.service_locator.j.b());
            case 16:
                return new com.moloco.sdk.internal.ortb.e((Xf.c) com.moloco.sdk.internal.q.f29362a.getValue());
            case 17:
                return AbstractC1240b0.e("com.moloco.sdk.internal.ortb.model.VerticalAlignment", EnumC1897k.values(), new String[]{"top", "center", "bottom"}, new Annotation[][]{null, null, null});
            case 18:
                return AbstractC1240b0.e("com.moloco.sdk.internal.ortb.model.HorizontalAlignment", com.moloco.sdk.internal.ortb.model.X.values(), new String[]{"start", "center", "end", "left", "right"}, new Annotation[][]{null, null, null, null, null});
            case 19:
                return new C2121s(new C0352u(i5), null, null);
            case 20:
                return new C2121s(new C0352u(i5), new C0352u(i5), new C0352u(i5));
            case 21:
                C2532p c2532p = com.moloco.sdk.internal.p.f28883a;
                return C2515C.f34653a;
            case 22:
                return Fe.e.a(new C1915d(3));
            case 23:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
                C4402c c4402cA = wd.f.a(new com.moloco.sdk.internal.http.a(com.moloco.sdk.service_locator.e.a().a(), com.moloco.sdk.service_locator.e.b().a(), i11));
                com.moloco.sdk.internal.services.bidtoken.l lVar = new com.moloco.sdk.internal.services.bidtoken.l();
                String language = Locale.getDefault().getLanguage();
                AbstractC3340k.d(language, "getLanguage(...)");
                String RELEASE = Build.VERSION.RELEASE;
                AbstractC3340k.d(RELEASE, "RELEASE");
                String str2 = Build.MANUFACTURER;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = Build.MODEL;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = Build.HARDWARE;
                a2.v vVar = new a2.v(c4402cA, lVar, new com.moloco.sdk.internal.services.bidtoken.h(language, str2, str3, str4 != null ? str4 : ""));
                I0 i0F = Ef.H.f();
                Lf.e eVar = Ef.S.f3698a;
                return new com.moloco.sdk.internal.services.bidtoken.A(vVar, Ef.H.c(Fe.e.O(i0F, Lf.d.f7120b)), new G9.e(new C1355I(i10), new com.moloco.sdk.internal.services.k()));
            case 24:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
                com.moloco.sdk.internal.services.bidtoken.A a5 = (com.moloco.sdk.internal.services.bidtoken.A) AbstractC1939a.f29414a.getValue();
                com.moloco.sdk.internal.services.k timeProviderService = com.moloco.sdk.service_locator.i.b();
                com.moloco.sdk.internal.services.v vVarB = com.moloco.sdk.service_locator.e.b();
                C2532p c2532p2 = com.moloco.sdk.service_locator.e.f29841d;
                com.moloco.sdk.internal.services.bidtoken.r rVar = new com.moloco.sdk.internal.services.bidtoken.r(vVarB, (com.moloco.sdk.internal.services.i) c2532p2.getValue());
                C8.i iVar = new C8.i(9);
                com.moloco.sdk.internal.services.bidtoken.providers.v vVar2 = new com.moloco.sdk.internal.services.bidtoken.providers.v();
                vVar2.f29527a = Moloco.isInitialized();
                com.moloco.sdk.internal.services.bidtoken.providers.l lVar2 = new com.moloco.sdk.internal.services.bidtoken.providers.l(AbstractC3935e.D(vVar2, new com.moloco.sdk.internal.services.bidtoken.providers.u(new com.moloco.sdk.internal.services.bidtoken.t(new InternalMolocoPrivacySettingsImpl(ic.d.e(null)))), new com.moloco.sdk.internal.services.bidtoken.providers.r((ActivityManager) com.moloco.sdk.service_locator.i.f29857e.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.e(ic.d.e(null)), new com.moloco.sdk.internal.services.bidtoken.providers.t((C1940c) com.moloco.sdk.service_locator.j.f29859b.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.i((com.moloco.sdk.internal.services.z) com.moloco.sdk.service_locator.e.f29843f.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.c((com.moloco.sdk.internal.services.q) com.moloco.sdk.service_locator.i.f29855c.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.n(com.moloco.sdk.service_locator.e.b(), (com.moloco.sdk.internal.services.i) c2532p2.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.g((com.moloco.sdk.internal.services.y) com.moloco.sdk.service_locator.e.f29840c.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.b((com.moloco.sdk.internal.services.n) com.moloco.sdk.service_locator.e.f29844g.getValue()), new com.moloco.sdk.internal.services.bidtoken.providers.p(new C0352u(25)), new com.moloco.sdk.internal.services.bidtoken.providers.x(ic.d.e(null))));
                AbstractC3340k.e(timeProviderService, "timeProviderService");
                C0805a c0805a = new C0805a();
                c0805a.f10438c = timeProviderService;
                c0805a.f10439d = rVar;
                c0805a.f10440e = iVar;
                c0805a.f10441f = lVar2;
                c0805a.f10436a = "";
                c0805a.f10437b = "";
                c0805a.f10442g = com.moloco.sdk.internal.services.bidtoken.f.f29434a;
                c0805a.f10443h = Nf.e.a();
                return new com.moloco.sdk.internal.services.bidtoken.o(a5, c0805a);
            case 25:
                return ((com.moloco.sdk.internal.ilrd.s) com.moloco.sdk.service_locator.b.f29835e.getValue()).f28643b;
            case 26:
                byte[] bArrDecode = Base64.decode(new byte[]{85, 108, 78, 66}, 0);
                AbstractC3340k.d(bArrDecode, "decode(...)");
                return Bf.r.a0(bArrDecode);
            case 27:
                return Bf.r.a0(new byte[]{82, 83, 65, 47, 69, 67, 66, 47, 79, 65, 69, 80, 87, 105, 116, 104, 83, 72, 65, 45, 50, 53, 54, 65, 110, 100, 77, 71, 70, 49, 80, 97, 100, 100, 105, 110, 103});
            case 28:
                return Bf.r.a0(new byte[]{65, 69, 83});
            default:
                byte[] bArrDecode2 = Base64.decode(new byte[]{81, 85, 86, 84, 76, 48, 100, 68, 84, 83, 57, 79, 98, 49, 66, 104, 90, 71, 82, 112, 98, 109, 99, 61}, 0);
                AbstractC3340k.d(bArrDecode2, "decode(...)");
                return Bf.r.a0(bArrDecode2);
        }
    }
}
