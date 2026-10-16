package qd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class h extends k {

    /* renamed from: e, reason: collision with root package name */
    public final Method f44231e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f44232f;

    public h(Provider provider, Method method, Method method2) {
        super(provider);
        this.f44231e = method;
        this.f44232f = method2;
    }

    @Override // qd.k
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar != l.HTTP_1_0) {
                arrayList.add(lVar.f44250a);
            }
        }
        try {
            this.f44231e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // qd.k
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f44232f.invoke(sSLSocket, new Object[0]);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // qd.k
    public final int e() {
        return 1;
    }
}
