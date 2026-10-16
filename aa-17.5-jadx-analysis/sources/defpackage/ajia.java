package defpackage;

import java.net.ProxySelector;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class ajia implements ajhh {
    public static final List a = ajis.e(new ajib[]{ajib.d, ajib.b});
    public static final List b = ajis.e(new ajhm[]{ajhm.a, ajhm.b});
    public final ajhq c;
    public final List d;
    public final List e;
    public final ajhp f;
    public final ajhs g;
    public final ProxySelector h;
    public final ajhe i;
    public final SocketFactory j;
    public final SSLSocketFactory k;
    public final List l;
    public final List m;
    public final HostnameVerifier n;
    public final ajhj o;
    public final ajix p;
    public final ajmd q;
    public final erb r;
    public final erb s;
    private final X509TrustManager t;
    private final ajmn u;

    public ajia() throws NoSuchAlgorithmException, KeyStoreException {
        ajhq ajhqVar = new ajhq();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ajht ajhtVar = ajht.a;
        TimeZone timeZone = ajis.a;
        ajmd ajmdVar = new ajmd(ajhtVar);
        ajhe ajheVar = ajhe.a;
        ajhp ajhpVar = ajhp.a;
        ajhs ajhsVar = ajhs.a;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        List list = b;
        List list2 = a;
        ajmo ajmoVar = ajmo.a;
        ajhj ajhjVar = ajhj.a;
        this.c = ajhqVar;
        this.d = ajis.d(arrayList);
        this.e = ajis.d(arrayList2);
        this.q = ajmdVar;
        this.f = ajhpVar;
        this.g = ajhsVar;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.h = proxySelector == null ? ajmh.a : proxySelector;
        this.i = ajheVar;
        this.j = socketFactory;
        this.l = list;
        this.m = list2;
        this.n = ajmoVar;
        this.r = new erb((boolean[]) null);
        this.p = ajix.a;
        this.s = new erb((byte[]) null, (byte[]) null, (char[]) null);
        if ((list instanceof Collection) && list.isEmpty()) {
            this.k = null;
            this.u = null;
            this.t = null;
            this.o = ajhjVar;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ajhm) it.next()).c) {
                    ajly ajlyVar = ajly.c;
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            trustManager.getClass();
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.t = x509TrustManager;
                            this.k = ajly.c.j(x509TrustManager);
                            x509TrustManager.getClass();
                            ajmn ajmnVarB = ajly.c.b(x509TrustManager);
                            this.u = ajmnVarB;
                            ajmnVarB.getClass();
                            this.o = affa.f(ajhjVar.c, ajmnVarB) ? ajhjVar : new ajhj(ajhjVar.b, ajmnVarB);
                        }
                    }
                    String string = Arrays.toString(trustManagers);
                    string.getClass();
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(string));
                }
            }
            this.k = null;
            this.u = null;
            this.t = null;
            this.o = ajhjVar;
        }
        List list3 = this.d;
        list3.getClass();
        if (list3.contains(null)) {
            List list4 = this.d;
            Objects.toString(list4);
            throw new IllegalStateException("Null interceptor: ".concat(String.valueOf(list4)));
        }
        List list5 = this.e;
        list5.getClass();
        if (list5.contains(null)) {
            List list6 = this.e;
            Objects.toString(list6);
            throw new IllegalStateException("Null network interceptor: ".concat(String.valueOf(list6)));
        }
        List list7 = this.l;
        if (!(list7 instanceof Collection) || !list7.isEmpty()) {
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                if (((ajhm) it2.next()).c) {
                    if (this.k == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.u == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.t == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.k != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.u != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.t != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!affa.f(this.o, ajhjVar)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // defpackage.ajhh
    public final ajjm a(ajid ajidVar) {
        ajidVar.getClass();
        return new ajjm(this, ajidVar);
    }
}
