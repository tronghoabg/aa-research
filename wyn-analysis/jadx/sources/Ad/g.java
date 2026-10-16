package Ad;

import Af.k;
import Bf.s;
import Cd.A;
import Cd.AbstractC0354w;
import Cd.B;
import Cd.C0333a;
import Cd.C0334b;
import Cd.C0336d;
import Cd.C0337e;
import Cd.C0344l;
import Cd.C0352u;
import Cd.C0355x;
import Cd.I;
import Cd.K;
import Cd.L;
import Cd.M;
import Cd.O;
import Cd.V;
import Cd.W;
import Cd.Y;
import Cd.a0;
import Cd.n0;
import Cd.q0;
import Cd.r;
import Cd.t0;
import Cd.w0;
import Cd.y0;
import Cd.z0;
import Wf.AbstractC1240b0;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.publisher.H;
import ef.C2515C;
import ef.C2527k;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.o;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import p7.AbstractC3772b;
import tf.l;
import vf.AbstractC4345a;
import wd.C4403d;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1280a;

    public /* synthetic */ g(int i5) {
        this.f1280a = i5;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f1280a) {
            case 0:
                AbstractC3340k.e((HttpsURLConnection) obj, "it");
                return C2515C.f34653a;
            case 1:
                AbstractC3340k.e((HttpURLConnection) obj, "<this>");
                return C2515C.f34653a;
            case 2:
                k it = (k) obj;
                AbstractC3340k.e(it, "it");
                return it.iterator();
            case 3:
                return obj;
            case 4:
                return Boolean.valueOf(obj == null);
            case 5:
                Dd.b createClientPlugin = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin, "$this$createClientPlugin");
                createClientPlugin.a(C0334b.f2072c, new C0336d(3, null));
                createClientPlugin.a(C0334b.f2071b, new C0337e(2, null));
                return C2515C.f34653a;
            case 6:
                C0355x HttpResponseValidator = (C0355x) obj;
                AbstractC3340k.e(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.f2188c = false;
                HttpResponseValidator.f2186a.add(new C0344l(2, null));
                return C2515C.f34653a;
            case 7:
                Dd.b createClientPlugin2 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin2, "$this$createClientPlugin");
                createClientPlugin2.f2636a.f47472h.f(Gd.b.f4712g, new C0333a(3, (InterfaceC3103c) null));
                return C2515C.f34653a;
            case 8:
                Dd.b createClientPlugin3 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin3, "$this$createClientPlugin");
                ((t0) createClientPlugin3.f2637b).getClass();
                AbstractC0354w.a().warn("The SaveBodyPlugin plugin is deprecated and can be safely removed. Request bodies are now saved in memory by default for all non-streaming responses.");
                return C2515C.f34653a;
            case 9:
                Dd.b createClientPlugin4 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin4, "$this$createClientPlugin");
                C0355x c0355x = (C0355x) createClientPlugin4.f2637b;
                List listG0 = o.G0(c0355x.f2186a);
                List listG02 = o.G0(c0355x.f2187b);
                InterfaceC3103c interfaceC3103c = null;
                createClientPlugin4.a(Dd.g.f2653d, new A(c0355x.f2188c, null));
                createClientPlugin4.a(Dd.g.f2652c, new C0333a(listG0, interfaceC3103c, 2));
                createClientPlugin4.a(C0334b.f2075f, new B(listG02, interfaceC3103c, 0));
                createClientPlugin4.a(C0334b.f2073d, new B(listG02, interfaceC3103c, 1));
                return C2515C.f34653a;
            case 10:
                Dd.b createClientPlugin5 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin5, "$this$createClientPlugin");
                I i5 = (I) createClientPlugin5.f2637b;
                List<C2527k> listM0 = o.M0(new M(1), AbstractC2640A.W(i5.f2005b));
                LinkedHashSet linkedHashSet = i5.f2004a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : linkedHashSet) {
                    if (!i5.f2005b.containsKey((Charset) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                List<Charset> listM02 = o.M0(new M(0), arrayList);
                StringBuilder sb2 = new StringBuilder();
                for (Charset charset : listM02) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(AbstractC3772b.A(charset));
                }
                for (C2527k c2527k : listM0) {
                    Charset charset2 = (Charset) c2527k.f34671a;
                    float fFloatValue = ((Number) c2527k.f34672b).floatValue();
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    double d3 = fFloatValue;
                    if (0.0d > d3 || d3 > 1.0d) {
                        throw new IllegalStateException("Check failed.");
                    }
                    sb2.append(AbstractC3772b.A(charset2) + ";q=" + (AbstractC4345a.H(100 * fFloatValue) / 100.0d));
                }
                int length = sb2.length();
                Charset charset3 = i5.f2006c;
                if (length == 0) {
                    sb2.append(AbstractC3772b.A(charset3));
                }
                String string = sb2.toString();
                Charset charset4 = (Charset) o.s0(listM02);
                if (charset4 == null) {
                    C2527k c2527k2 = (C2527k) o.s0(listM0);
                    charset4 = c2527k2 != null ? (Charset) c2527k2.f34671a : null;
                    if (charset4 == null) {
                        charset4 = Bf.a.f1670a;
                    }
                }
                createClientPlugin5.a(C0334b.f2074e, new K(string, charset4, null));
                createClientPlugin5.a(Dd.g.f2654e, new L(charset3, null));
                return C2515C.f34653a;
            case 11:
                Dd.b createClientPlugin6 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin6, "$this$createClientPlugin");
                ((O) createClientPlugin6.f2637b).getClass();
                createClientPlugin6.a(Dd.g.f2652c, new C0333a(createClientPlugin6, null, 3));
                return C2515C.f34653a;
            case 12:
                Dd.b createClientPlugin7 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin7, "$this$createClientPlugin");
                createClientPlugin7.a(C0334b.f2076g, new C0333a(createClientPlugin7, null, 4));
                return C2515C.f34653a;
            case 13:
                Dd.b createClientPlugin8 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin8, "$this$createClientPlugin");
                Y y10 = (Y) createClientPlugin8.f2637b;
                W w2 = y10.f2042a;
                if (w2 == null) {
                    AbstractC3340k.m("shouldRetry");
                    throw null;
                }
                V v2 = y10.f2043b;
                if (v2 == null) {
                    AbstractC3340k.m("shouldRetryOnException");
                    throw null;
                }
                s sVar = y10.f2044c;
                if (sVar == null) {
                    AbstractC3340k.m("delayMillis");
                    throw null;
                }
                createClientPlugin8.a(Dd.g.f2652c, new a0(w2, v2, y10.f2047f, sVar, y10.f2046e, createClientPlugin8, y10.f2045d, null));
                return C2515C.f34653a;
            case 14:
                Dd.b createClientPlugin9 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin9, "$this$createClientPlugin");
                n0 n0Var = (n0) createClientPlugin9.f2637b;
                createClientPlugin9.a(Dd.g.f2652c, new r(n0Var.f2142a, n0Var.f2143b, n0Var.f2144c, null));
                return C2515C.f34653a;
            case 15:
                Dd.b createClientPlugin10 = (Dd.b) obj;
                AbstractC3340k.e(createClientPlugin10, "$this$createClientPlugin");
                createClientPlugin10.a(Dd.g.f2651b, new y0(((w0) createClientPlugin10.f2637b).f2185a, null));
                return C2515C.f34653a;
            case 16:
                InterfaceC3106f interfaceC3106f = (InterfaceC3106f) obj;
                if (interfaceC3106f instanceof Ef.A) {
                    return (Ef.A) interfaceC3106f;
                }
                return null;
            case 17:
                C2527k it2 = (C2527k) obj;
                AbstractC3340k.e(it2, "it");
                String str = (String) it2.f34671a;
                Object obj3 = it2.f34672b;
                if (obj3 == null) {
                    return str;
                }
                return str + '=' + String.valueOf(obj3);
            case 18:
                CharSequence it3 = (CharSequence) obj;
                AbstractC3340k.e(it3, "it");
                return Integer.valueOf(it3.length());
            case 19:
                Jd.s it4 = (Jd.s) obj;
                AbstractC3340k.e(it4, "it");
                return Integer.valueOf(it4.f6070a.length());
            case 20:
                Map.Entry DelegatingMutableSet = (Map.Entry) obj;
                AbstractC3340k.e(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return new Nd.f(((Nd.c) DelegatingMutableSet.getKey()).f8657a, DelegatingMutableSet.getValue());
            case 21:
                Map.Entry DelegatingMutableSet2 = (Map.Entry) obj;
                AbstractC3340k.e(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return new Nd.f(A6.c.l((String) DelegatingMutableSet2.getKey()), DelegatingMutableSet2.getValue());
            case 22:
                Nd.c DelegatingMutableSet3 = (Nd.c) obj;
                AbstractC3340k.e(DelegatingMutableSet3, "$this$DelegatingMutableSet");
                return DelegatingMutableSet3.f8657a;
            case 23:
                String DelegatingMutableSet4 = (String) obj;
                AbstractC3340k.e(DelegatingMutableSet4, "$this$DelegatingMutableSet");
                return A6.c.l(DelegatingMutableSet4);
            case 24:
                KClass it5 = (KClass) obj;
                AbstractC3340k.e(it5, "it");
                KSerializer kSerializerO0 = H.o0(it5);
                if (kSerializerO0 != null) {
                    return kSerializerO0;
                }
                if (AbstractC1240b0.h(it5)) {
                    return new Sf.d(it5);
                }
                return null;
            case 25:
                KClass it6 = (KClass) obj;
                AbstractC3340k.e(it6, "it");
                KSerializer kSerializerO02 = H.o0(it6);
                if (kSerializerO02 == null) {
                    kSerializerO02 = AbstractC1240b0.h(it6) ? new Sf.d(it6) : null;
                }
                if (kSerializerO02 != null) {
                    return AbstractC2641B.u(kSerializerO02);
                }
                return null;
            case 26:
                Uf.a buildSerialDescriptor = (Uf.a) obj;
                AbstractC3340k.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                Uf.a.a(buildSerialDescriptor, "JsonPrimitive", new Xf.l(new C0352u(7)));
                Uf.a.a(buildSerialDescriptor, "JsonNull", new Xf.l(new C0352u(8)));
                Uf.a.a(buildSerialDescriptor, "JsonLiteral", new Xf.l(new C0352u(9)));
                Uf.a.a(buildSerialDescriptor, "JsonObject", new Xf.l(new C0352u(10)));
                Uf.a.a(buildSerialDescriptor, "JsonArray", new Xf.l(new C0352u(11)));
                return C2515C.f34653a;
            case 27:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3340k.e(entry, "<destruct>");
                String str2 = (String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                Yf.H.a(str2, sb3);
                sb3.append(':');
                sb3.append(bVar);
                return sb3.toString();
            case 28:
                C4403d HttpClient = (C4403d) obj;
                AbstractC3340k.e(HttpClient, "$this$HttpClient");
                HttpClient.a(z0.f2196b, new C1915d(28));
                HttpClient.a(q0.f2163b, new C1915d(28));
                return C2515C.f34653a;
            default:
                w0 install = (w0) obj;
                AbstractC3340k.e(install, "$this$install");
                String str3 = (String) ((com.moloco.sdk.xenoss.sdkdevkit.android.core.b) com.moloco.sdk.xenoss.sdkdevkit.android.core.a.f32401a.getValue()).f32402a.getValue();
                AbstractC3340k.e(str3, "<set-?>");
                install.f2185a = str3;
                return C2515C.f34653a;
        }
    }

    public /* synthetic */ g(C4403d c4403d) {
        this.f1280a = 6;
    }
}
