package tc;

import Ef.C0502n;
import android.content.Context;
import android.content.res.Configuration;
import ef.C2523g;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Request;
import vc.C4337a;
import zg.InterfaceC4664c;
import zg.InterfaceC4667f;
import zg.Q;
import zg.r;

/* loaded from: classes5.dex */
public final class j implements InterfaceC4667f {

    /* renamed from: a, reason: collision with root package name */
    public Object f46015a;

    public /* synthetic */ j(Object obj) {
        this.f46015a = obj;
    }

    public String a(String str, String str2) {
        C4337a c4337a = (C4337a) this.f46015a;
        Context contextCreateConfigurationContext = c4337a.f47158b;
        if (str2 != null) {
            Locale localeA = C4337a.a(str2);
            Configuration configuration = new Configuration(c4337a.f47158b.getResources().getConfiguration());
            configuration.setLocale(localeA);
            contextCreateConfigurationContext = c4337a.f47158b.createConfigurationContext(configuration);
        }
        int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", c4337a.f47158b.getPackageName());
        if (identifier != 0) {
            return contextCreateConfigurationContext.getResources().getString(identifier);
        }
        return null;
    }

    @Override // zg.InterfaceC4667f
    public void onFailure(InterfaceC4664c call, Throwable th) {
        AbstractC3340k.f(call, "call");
        ((C0502n) this.f46015a).resumeWith(Fe.e.z(th));
    }

    @Override // zg.InterfaceC4667f
    public void onResponse(InterfaceC4664c call, Q q4) {
        AbstractC3340k.f(call, "call");
        boolean zD = q4.f48595a.d();
        C0502n c0502n = (C0502n) this.f46015a;
        if (!zD) {
            c0502n.resumeWith(Fe.e.z(new E5.Q(q4)));
            return;
        }
        Object obj = q4.f48596b;
        if (obj != null) {
            c0502n.resumeWith(obj);
            return;
        }
        Request request = call.request();
        request.getClass();
        Object objCast = r.class.cast(request.f42380e.get(r.class));
        if (objCast == null) {
            C2523g c2523g = new C2523g();
            AbstractC3340k.j(c2523g, AbstractC3340k.class.getName());
            throw c2523g;
        }
        StringBuilder sb2 = new StringBuilder("Response from ");
        Method method = ((r) objCast).f48636a;
        Class<?> declaringClass = method.getDeclaringClass();
        if (declaringClass == null) {
            IllegalStateException illegalStateException = new IllegalStateException("method.declaringClass".concat(" must not be null"));
            AbstractC3340k.j(illegalStateException, AbstractC3340k.class.getName());
            throw illegalStateException;
        }
        sb2.append(declaringClass.getName());
        sb2.append('.');
        sb2.append(method.getName());
        sb2.append(" was null but response body type was declared as non-null");
        c0502n.resumeWith(Fe.e.z(new C2523g(sb2.toString())));
    }
}
