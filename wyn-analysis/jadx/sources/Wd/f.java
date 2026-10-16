package wd;

import Ad.g;
import Ad.h;
import Af.n;
import Ef.C0499l0;
import Ef.InterfaceC0501m0;
import com.moloco.sdk.internal.publisher.C1915d;
import io.ktor.client.engine.android.AndroidEngineContainer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import jf.InterfaceC3106f;
import kotlin.jvm.internal.AbstractC3340k;
import qf.j;
import tf.l;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Ad.a f47481a;

    static {
        try {
            Iterator it = Arrays.asList(new AndroidEngineContainer()).iterator();
            AbstractC3340k.d(it, "iterator(...)");
            if (((e) n.X(n.S(it))) == null) {
                throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
            }
            f47481a = Ad.a.f1259a;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final C4402c a(l lVar) {
        Ad.a engineFactory = f47481a;
        AbstractC3340k.e(engineFactory, "engineFactory");
        C4403d c4403d = new C4403d();
        lVar.invoke(c4403d);
        C1915d block = c4403d.f47478d;
        AbstractC3340k.e(block, "block");
        h hVar = new h();
        hVar.f1281a = new g(0);
        hVar.f1282b = new g(1);
        block.invoke(hVar);
        Ad.e eVar = new Ad.e(hVar);
        C4402c c4402c = new C4402c(eVar, c4403d);
        InterfaceC3106f interfaceC3106f = c4402c.f47468d.get(C0499l0.f3748a);
        AbstractC3340k.b(interfaceC3106f);
        ((InterfaceC0501m0) interfaceC3106f).invokeOnCompletion(new j(eVar, 2));
        return c4402c;
    }
}
