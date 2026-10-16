package md;

import com.google.protobuf.MessageLite;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: md.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3537e {

    /* renamed from: a, reason: collision with root package name */
    public static final C3533a f40634a = new C3533a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* renamed from: b, reason: collision with root package name */
    public static final C3533a f40635b = new C3533a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* renamed from: c, reason: collision with root package name */
    public static final C3533a f40636c = new C3533a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    public static List f(Class cls, List list, ClassLoader classLoader, i0 i0Var) throws ClassNotFoundException {
        ?? Load;
        Object objNewInstance;
        int i5 = 1;
        try {
            Class.forName("android.app.Application", false, classLoader);
            Load = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                try {
                    objNewInstance = cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassCastException unused) {
                    objNewInstance = null;
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (objNewInstance != null) {
                    Load.add(objNewInstance);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
            Load = !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Load) {
            if (i0Var.c(obj)) {
                arrayList.add(obj);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new O7.d(i0Var, i5)));
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public md.C3552u a() {
        /*
            r4 = this;
            java.util.List r0 = r4.b()
            r1 = 0
            if (r0 == 0) goto Lf
            int r2 = r0.size()
            r3 = 1
            if (r2 != r3) goto Lf
            goto L10
        Lf:
            r3 = r1
        L10:
            java.lang.String r2 = "%s does not have exactly one group"
            Fe.e.y(r3, r2, r0)
            java.lang.Object r0 = r0.get(r1)
            md.u r0 = (md.C3552u) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: md.AbstractC3537e.a():md.u");
    }

    public abstract List b();

    public abstract C3534b c();

    public abstract AbstractC3537e d();

    public abstract Object e();

    public abstract void g(int i5, String str);

    public abstract void h(int i5, String str, Object... objArr);

    public abstract void i(k0 k0Var, b0 b0Var);

    public abstract void j(k0 k0Var);

    public abstract void l(MessageLite messageLite);

    public abstract void n(e0 e0Var);

    public abstract void o();

    public abstract void p();

    public abstract void q(N n10);

    public abstract void r(List list);

    public void m() {
    }

    public void k(b0 b0Var) {
    }
}
