package ad;

import Ef.H0;
import G5.C0522c;
import android.content.Context;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import cg.C1618g;
import cg.C1621j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import g2.C2678H;
import g2.InterfaceC2683d;
import g2.InterfaceC2684e;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import od.AbstractC3669a0;
import od.U1;
import org.apache.tika.metadata.TikaCoreProperties;
import r7.InterfaceC3932b;
import r7.InterfaceC3933c;

/* loaded from: classes5.dex */
public final class r implements d0, InterfaceC2683d, i3.a, U1, InterfaceC3933c, L8.e {
    public static void b() {
        H0 h02 = VastActivity.f31304j;
        if (h02 == null || !h02.isActive()) {
            return;
        }
        H0 h03 = VastActivity.f31304j;
        if (h03 != null) {
            h03.cancel(null);
        }
        VastActivity.f31304j = null;
    }

    public static cg.y g(String str) {
        AbstractC3340k.e(str, "<this>");
        C1621j c1621j = dg.c.f34290a;
        C1618g c1618g = new C1618g();
        c1618g.d0(str);
        return dg.c.d(c1618g, false);
    }

    public static cg.y i(File file) {
        String str = cg.y.f19937b;
        String string = file.toString();
        AbstractC3340k.d(string, "toString(...)");
        return g(string);
    }

    public static String k(StackTraceElement stackTraceElement) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackTraceElement.getClassName());
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            sb2.append("(Native Method)");
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            sb2.append("(Unknown Source)");
        } else {
            sb2.append("(");
            sb2.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                sb2.append(stackTraceElement.getLineNumber());
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // od.U1
    public Object c() {
        return Executors.newCachedThreadPool(AbstractC3669a0.e("grpc-okhttp-%d"));
    }

    @Override // r7.InterfaceC3933c
    public C0522c e(Context context, String str, InterfaceC3932b interfaceC3932b) {
        C0522c c0522c = new C0522c();
        int iD = interfaceC3932b.d(context, str);
        c0522c.f4405a = iD;
        if (iD != 0) {
            c0522c.f4407c = -1;
            return c0522c;
        }
        int iA = interfaceC3932b.a(context, str, true);
        c0522c.f4406b = iA;
        if (iA != 0) {
            c0522c.f4407c = 1;
        }
        return c0522c;
    }

    @Override // g2.InterfaceC2683d
    public InterfaceC2684e f(int i5) {
        C2678H c2678h = new C2678H();
        c2678h.y(A6.c.y(i5 * 2));
        return c2678h;
    }

    @Override // od.U1
    public void h(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // androidx.lifecycle.d0
    public b0 j(Class cls, H1.c cVar) {
        return new androidx.lifecycle.X();
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return new ya.b(0);
    }

    @Override // androidx.lifecycle.d0
    public b0 p(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    @Override // androidx.lifecycle.d0
    public b0 q(KClass kClass, H1.c cVar) {
        return j(Fe.b.y(kClass), cVar);
    }

    @Override // i3.a
    public void d() {
    }

    @Override // i3.a
    public void a(int i5, Serializable serializable) {
    }
}
