package Af;

import Ef.InterfaceC0501m0;
import Hf.C0588a0;
import Hf.k0;
import Hf.n0;
import Hf.p0;
import Wf.AbstractC1240b0;
import Wf.Y;
import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import ba.C1521a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.publisher.C1919h;
import com.moloco.sdk.internal.publisher.D;
import com.moloco.sdk.internal.publisher.L;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2002l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2028q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2138x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.R0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.qonversion.flutter.sdk.qonversion_flutter_sdk.QonversionPlugin;
import ef.C2515C;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s8.C4026b;

/* loaded from: classes5.dex */
public final /* synthetic */ class q implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1319b;

    public /* synthetic */ q(Object obj, int i5) {
        this.f1318a = i5;
        this.f1319b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [jf.c] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // tf.a
    public final Object invoke() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        int i5 = 10;
        p0 p0Var = n0.f5168a;
        int i10 = 3;
        C2515C c2515c = C2515C.f34653a;
        String str2 = 0;
        str2 = 0;
        Object obj = this.f1319b;
        switch (this.f1318a) {
            case 0:
                return obj;
            case 1:
                Sf.d dVar = (Sf.d) obj;
                Uf.g gVarS = Fe.g.s("kotlinx.serialization.Polymorphic", Uf.c.f12804p, new SerialDescriptor[0], new r(dVar, 9));
                KClass context = dVar.f11119a;
                AbstractC3340k.e(context, "context");
                return new Uf.b(gVarS, context);
            case 2:
                Uf.g gVar = (Uf.g) obj;
                return Integer.valueOf(AbstractC1240b0.f(gVar, gVar.k));
            case 3:
                return Fe.g.s("kotlin.Unit", Uf.j.f12834s, new SerialDescriptor[0], new r((Y) obj, i5));
            case 4:
                int i11 = ComponentActivity.f17695a;
                ((ComponentActivity) obj).reportFullyDrawn();
                return null;
            case 5:
                Object systemService = ((Context) ((C1521a) obj).f19414b).getSystemService("power");
                AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                return (PowerManager) systemService;
            case 6:
                C4026b c4026b = (C4026b) obj;
                c4026b.getClass();
                try {
                    Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "debug.moloco.internal_logging");
                    AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type kotlin.String");
                    String str3 = (String) objInvoke;
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                } catch (Exception unused) {
                }
                c4026b.f45322b = Boolean.parseBoolean(str2);
                return c2515c;
            case 7:
                return Boolean.valueOf(((com.moloco.sdk.internal.e) obj).f28505a.j());
            case 8:
                com.moloco.sdk.internal.ilrd.q qVar = ((com.moloco.sdk.internal.ilrd.r) obj).f28637b;
                if (qVar != null && (str = qVar.f28632a) != null) {
                    return str;
                }
                String string = UUID.randomUUID().toString();
                AbstractC3340k.d(string, "toString(...)");
                return string;
            case 9:
                C1919h c1919h = (C1919h) obj;
                if (c1919h.f29031e) {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - granting reward as skip button is now available (feature flag enabled)", null, false, 12, null);
                    c1919h.a(MolocoAdKt.createAdInfo$default(c1919h.f29030d, null, null, 6, null));
                } else {
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "RewardedInterstitialAdShowListenerImpl", "onCloseOrSkipButtonShown called - skip button shown but reward requires user click (feature flag disabled)", null, false, 12, null);
                }
                return c2515c;
            case 10:
                return ((C1906u) obj).f28867d.f28875d;
            case 11:
                String str4 = ((C1906u) ((C6.l) obj).f1844a).f28866c;
                if (str4 != null) {
                    return new D(str4);
                }
                return null;
            case 12:
                com.moloco.sdk.internal.publisher.nativead.model.n nVar = (com.moloco.sdk.internal.publisher.nativead.model.n) obj;
                return AbstractC2640A.T(AbstractC2640A.T(AbstractC2640A.T(nVar.f29197a, nVar.f29198b), nVar.f29199c), nVar.f29200d);
            case 13:
                return G.b((Context) obj);
            case 14:
                return Boolean.valueOf(((com.moloco.sdk.internal.services.v) obj).f29732a.getResources().getConfiguration().smallestScreenWidthDp >= 600);
            case 15:
                return C2002l.c((C2002l) obj);
            case 16:
                C2028q c2028q = (C2028q) obj;
                return k0.x(new C0588a0(c2028q.f30492h, c2028q.f30490f.f30544g, new L(i10, str2, i10)), c2028q.f30489e, p0Var, Boolean.FALSE);
            case 17:
                C2138x c2138x = (C2138x) obj;
                return k0.x(new C0588a0(c2138x.k, c2138x.f32351i.l(), new L(i10, str2, 4)), c2138x.f32346d, p0Var, Boolean.FALSE);
            case 18:
                kotlin.jvm.internal.G g9 = (kotlin.jvm.internal.G) obj;
                InterfaceC0501m0 interfaceC0501m0 = (InterfaceC0501m0) g9.f39740a;
                if (interfaceC0501m0 != null) {
                    interfaceC0501m0.cancel(null);
                }
                g9.f39740a = null;
                return c2515c;
            case 19:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) obj;
                cVar.getClass();
                cVar.f30326c = null;
                cVar.f30327d = null;
                cVar.f30328e = null;
                return c2515c;
            case 20:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) obj;
                return k0.x(new C0588a0(cVar2.f30579f, cVar2.f30576c.f30731g, new L(i10, str2, 5)), cVar2.f30574a, p0Var, Boolean.FALSE);
            case 21:
                G9.e eVar = (G9.e) obj;
                Set set = (Set) eVar.f4685b;
                ArrayList arrayList = new ArrayList();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ff.t.e0(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) it.next()).a(), arrayList);
                }
                int iD = AbstractC2641B.D(ff.p.a0(arrayList, 10));
                if (iD < 16) {
                    iD = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    String str5 = (String) next;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (Set) eVar.f4685b) {
                        if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a) obj2).a().contains(str5)) {
                            arrayList2.add(obj2);
                        }
                    }
                    linkedHashMap.put(next, arrayList2);
                }
                return linkedHashMap;
            case 22:
                ((tf.l) obj).invoke("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
                return c2515c;
            case 23:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.i) obj;
                iVar.f31693j.c(iVar.f31692i);
                iVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a.f31672a);
                return c2515c;
            case 24:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i adShowListener = ((R0) obj).getAdShowListener();
                if (adShowListener != null) {
                    adShowListener.b();
                }
                return c2515c;
            case 25:
                try {
                    String property = System.getProperty("http.agent");
                    if (property != null) {
                        if (!Bf.k.y0(property)) {
                            return property;
                        }
                    }
                } catch (Exception e7) {
                    MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                    ((com.moloco.sdk.xenoss.sdkdevkit.android.core.b) obj).getClass();
                    MolocoLogger.error$default(molocoLogger, "WebBrowserUserAgentService", e7.toString(), null, false, 12, null);
                }
                return "";
            case 26:
                return QonversionPlugin.qonversionSandwich_delegate$lambda$0((QonversionPlugin) obj);
            case 27:
                return AbstractC3340k.i((Object[]) obj);
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
