package e.a.f.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends l {

    /* renamed from: b, reason: collision with root package name */
    private final Method f47577b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f47578c;

    /* synthetic */ i(Provider provider, Method method, Method method2) {
        super(provider);
        this.f47577b = method;
        this.f47578c = method2;
    }

    @Override // e.a.f.a.l
    public final String a(SSLSocket sSLSocket) {
        try {
            return (String) this.f47578c.invoke(sSLSocket, null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // e.a.f.a.l
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar != m.HTTP_1_0) {
                arrayList.add(mVar.toString());
            }
        }
        try {
            this.f47577b.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // e.a.f.a.l
    public final int c() {
        return 1;
    }
}
