package Xf;

import A.C0230x;
import A.e0;
import Yf.C1301g;
import Yf.D;
import Yf.G;
import Yf.I;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.KSerializer;
import za.C4658a;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16251d = new b(new h(false, false, false, false, false, true, "    ", "type", true, a.f16249b), Zf.a.f17089a);

    /* renamed from: a, reason: collision with root package name */
    public final h f16252a;

    /* renamed from: b, reason: collision with root package name */
    public final C4658a f16253b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f16254c = new e0(26);

    public c(h hVar, C4658a c4658a) {
        this.f16252a = hVar;
        this.f16253b = c4658a;
    }

    public final Object a(String string, KSerializer deserializer) {
        AbstractC3340k.e(deserializer, "deserializer");
        AbstractC3340k.e(string, "string");
        G g9 = new G(string);
        Object objZ = new D(this, I.f16834c, g9, deserializer.getDescriptor()).z(deserializer);
        g9.p();
        return objZ;
    }

    public final String b(KSerializer serializer, Object obj) {
        AbstractC3340k.e(serializer, "serializer");
        C0230x c0230x = new C0230x(12, (char) 0);
        C1301g c1301g = C1301g.f16857c;
        c0230x.f188c = c1301g.f(128);
        try {
            Yf.r.h(this, c0230x, serializer, obj);
            String string = c0230x.toString();
            char[] array = (char[]) c0230x.f188c;
            c1301g.getClass();
            AbstractC3340k.e(array, "array");
            c1301g.e(array);
            return string;
        } catch (Throwable th) {
            C1301g c1301g2 = C1301g.f16857c;
            char[] array2 = (char[]) c0230x.f188c;
            c1301g2.getClass();
            AbstractC3340k.e(array2, "array");
            c1301g2.e(array2);
            throw th;
        }
    }
}
