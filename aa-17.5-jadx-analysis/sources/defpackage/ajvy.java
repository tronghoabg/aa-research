package defpackage;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ajvy extends ajwf {
    private ajqs backoffManager;
    private ajso connManager;
    private ajqv connectionBackoffStrategy;
    private ajqw cookieStore;
    private ajqx credsProvider;
    private akas defaultParams;
    private ajss keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    private akax mutableProcessor;
    private akbe protocolProcessor;
    private ajqr proxyAuthStrategy;
    private ajre redirectStrategy;
    private akbd requestExec;
    private ajqz retryHandler;
    private ajow reuseStrategy;
    private ajth routePlanner;
    private ajqc supportedAuthSchemes;
    private ajus supportedCookieSpecs;
    private ajqr targetAuthStrategy;
    private ajrh userTokenHandler;

    protected ajvy(ajso ajsoVar, akas akasVar) {
        this.defaultParams = akasVar;
        this.connManager = ajsoVar;
    }

    private synchronized akbc getProtocolProcessor() {
        akbe akbeVar;
        akbeVar = this.protocolProcessor;
        if (akbeVar == null) {
            akax httpProcessor = getHttpProcessor();
            int iC = httpProcessor.c();
            ajpi[] ajpiVarArr = new ajpi[iC];
            for (int i = 0; i < iC; i++) {
                ajpiVarArr[i] = httpProcessor.e(i);
            }
            int iD = httpProcessor.d();
            ajpl[] ajplVarArr = new ajpl[iD];
            for (int i2 = 0; i2 < iD; i2++) {
                ajplVarArr[i2] = httpProcessor.f(i2);
            }
            akbeVar = new akbe(ajpiVarArr, ajplVarArr);
            this.protocolProcessor = akbeVar;
        }
        return akbeVar;
    }

    public synchronized void addRequestInterceptor(ajpi ajpiVar, int i) {
        akax httpProcessor = getHttpProcessor();
        if (ajpiVar != null) {
            httpProcessor.a.add(i, ajpiVar);
        }
        this.protocolProcessor = null;
    }

    public synchronized void addResponseInterceptor(ajpl ajplVar, int i) {
        akax httpProcessor = getHttpProcessor();
        if (ajplVar != null) {
            httpProcessor.b.add(i, ajplVar);
        }
        this.protocolProcessor = null;
    }

    public synchronized void clearRequestInterceptors() {
        getHttpProcessor().a.clear();
        this.protocolProcessor = null;
    }

    public synchronized void clearResponseInterceptors() {
        getHttpProcessor().b.clear();
        this.protocolProcessor = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getConnectionManager().d();
    }

    protected ajqc createAuthSchemeRegistry() {
        ajqc ajqcVar = new ajqc();
        ajqcVar.b("Basic", new ajvk(1));
        ajqcVar.b("Digest", new ajvk(0));
        ajqcVar.b("NTLM", new ajvk(3));
        ajqcVar.b("Negotiate", new ajvk(4));
        ajqcVar.b("Kerberos", new ajvk(2));
        return ajqcVar;
    }

    protected ajso createClientConnectionManager() {
        ajsp ajspVar;
        ajtt ajttVar = new ajtt();
        ajttVar.b(new ajtp("http", 80, new ajto()));
        ajttVar.b(new ajtp("https", 443, ajuc.g()));
        String str = (String) getParams().a("http.connection-manager.factory-class-name");
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (str != null) {
            try {
                ajspVar = (ajsp) (contextClassLoader != null ? Class.forName(str, true, contextClassLoader) : Class.forName(str)).newInstance();
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: ".concat(str));
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            ajspVar = null;
        }
        return ajspVar != null ? ajspVar.a() : new ajxe(ajttVar);
    }

    @Deprecated
    protected ajrf createClientRequestDirector(akbd akbdVar, ajso ajsoVar, ajow ajowVar, ajss ajssVar, ajth ajthVar, akbc akbcVar, ajqz ajqzVar, ajrd ajrdVar, ajqq ajqqVar, ajqq ajqqVar2, ajrh ajrhVar, akas akasVar) {
        return new ajwo(LogFactory.getLog(ajwo.class), akbdVar, ajsoVar, ajowVar, ajssVar, ajthVar, akbcVar, ajqzVar, new ajwn(ajrdVar), new ajvz(ajqqVar), new ajvz(ajqqVar2), ajrhVar, akasVar);
    }

    protected ajss createConnectionKeepAliveStrategy() {
        return new ajwh();
    }

    protected ajow createConnectionReuseStrategy() {
        return new ajvd();
    }

    protected ajus createCookieSpecRegistry() {
        ajus ajusVar = new ajus();
        ajusVar.b("default", new ajyj());
        ajusVar.b("best-match", new ajyj());
        ajusVar.b("compatibility", new ajyl());
        ajusVar.b("netscape", new ajyt());
        ajusVar.b("rfc2109", new ajyw());
        ajusVar.b("rfc2965", new ajzb());
        ajusVar.b("ignoreCookies", new ajyp());
        return ajusVar;
    }

    protected ajqw createCookieStore() {
        return new ajwc();
    }

    protected ajqx createCredentialsProvider() {
        return new ajwd();
    }

    protected akba createHttpContext() {
        akaw akawVar = new akaw();
        akawVar.x("http.scheme-registry", getConnectionManager().b());
        akawVar.x("http.authscheme-registry", getAuthSchemes());
        akawVar.x("http.cookiespec-registry", getCookieSpecs());
        akawVar.x("http.cookie-store", getCookieStore());
        akawVar.x("http.auth.credentials-provider", getCredentialsProvider());
        return akawVar;
    }

    protected abstract akas createHttpParams();

    protected abstract akax createHttpProcessor();

    protected ajqz createHttpRequestRetryHandler() {
        return new ajwj();
    }

    protected ajth createHttpRoutePlanner() {
        return new ajxj(getConnectionManager().b());
    }

    @Deprecated
    protected ajqq createProxyAuthenticationHandler() {
        return new ajwk();
    }

    protected ajqr createProxyAuthenticationStrategy() {
        return new ajwu();
    }

    @Deprecated
    protected ajrd createRedirectHandler() {
        return new ajwl();
    }

    protected akbd createRequestExecutor() {
        return new akbd();
    }

    @Deprecated
    protected ajqq createTargetAuthenticationHandler() {
        return new ajwp();
    }

    protected ajqr createTargetAuthenticationStrategy() {
        return new ajwy();
    }

    protected ajrh createUserTokenHandler() {
        return new ajwq();
    }

    protected akas determineParams(ajph ajphVar) {
        return new ajwe(getParams(), ajphVar.hX());
    }

    @Override // defpackage.ajwf
    protected final ajrn doExecute(ajpe ajpeVar, ajph ajphVar, akba akbaVar) throws ajpd, IOException {
        akba akayVar;
        ajrf ajrfVarCreateClientRequestDirector;
        ajth routePlanner;
        ajqv connectionBackoffStrategy;
        ajqs backoffManager;
        ahgm.e(ajphVar, "HTTP request");
        synchronized (this) {
            akba akbaVarCreateHttpContext = createHttpContext();
            akayVar = akbaVar == null ? akbaVarCreateHttpContext : new akay(akbaVar, akbaVarCreateHttpContext);
            akas akasVarDetermineParams = determineParams(ajphVar);
            ajri ajriVar = ajri.a;
            boolean z = ajriVar.b;
            ajpe ajpeVar2 = ajriVar.c;
            InetAddress inetAddress = ajriVar.d;
            boolean z2 = ajriVar.e;
            String str = ajriVar.f;
            boolean z3 = ajriVar.g;
            boolean z4 = ajriVar.h;
            boolean z5 = ajriVar.i;
            int i = ajriVar.j;
            boolean z6 = ajriVar.k;
            Collection collection = ajriVar.l;
            Collection collection2 = ajriVar.m;
            int i2 = ajriVar.n;
            int i3 = ajriVar.o;
            int iC = akasVarDetermineParams.c("http.socket.timeout", ajriVar.p);
            boolean zD = akasVarDetermineParams.d("http.connection.stalecheck", z2);
            int iC2 = akasVarDetermineParams.c("http.connection.timeout", i3);
            boolean zD2 = akasVarDetermineParams.d("http.protocol.expect-continue", z);
            boolean zD3 = akasVarDetermineParams.d("http.protocol.handle-authentication", z6);
            boolean zD4 = akasVarDetermineParams.d("http.protocol.allow-circular-redirects", z5);
            int iE = (int) akasVarDetermineParams.e(i2);
            int iC3 = akasVarDetermineParams.c("http.protocol.max-redirects", i);
            boolean zD5 = akasVarDetermineParams.d("http.protocol.handle-redirects", z3);
            boolean z7 = !akasVarDetermineParams.d("http.protocol.reject-relative-redirect", !z4);
            ajpe ajpeVar3 = (ajpe) akasVarDetermineParams.a("http.route.default-proxy");
            ajpe ajpeVar4 = ajpeVar3 == null ? ajpeVar2 : ajpeVar3;
            InetAddress inetAddress2 = (InetAddress) akasVarDetermineParams.a("http.route.local-address");
            InetAddress inetAddress3 = inetAddress2 == null ? inetAddress : inetAddress2;
            Collection collection3 = (Collection) akasVarDetermineParams.a("http.auth.target-scheme-pref");
            Collection collection4 = collection3 == null ? collection : collection3;
            Collection collection5 = (Collection) akasVarDetermineParams.a("http.auth.proxy-scheme-pref");
            Collection collection6 = collection5 == null ? collection2 : collection5;
            String str2 = (String) akasVarDetermineParams.a("http.protocol.cookie-policy");
            akayVar.x("http.request-config", new ajri(zD2, ajpeVar4, inetAddress3, zD, str2 == null ? str : str2, zD5, z7, zD4, iC3, zD3, collection4, collection6, iE, iC2, iC));
            ajrfVarCreateClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), getProtocolProcessor(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), akasVarDetermineParams);
            routePlanner = getRoutePlanner();
            connectionBackoffStrategy = getConnectionBackoffStrategy();
            backoffManager = getBackoffManager();
        }
        try {
            if (connectionBackoffStrategy == null || backoffManager == null) {
                return ajwg.a(ajrfVarCreateClientRequestDirector.a(ajpeVar, ajphVar, akayVar));
            }
            routePlanner.a(ajpeVar != null ? ajpeVar : (ajpe) determineParams(ajphVar).a("http.default-host"), ajphVar);
            try {
                ajrn ajrnVarA = ajwg.a(ajrfVarCreateClientRequestDirector.a(ajpeVar, ajphVar, akayVar));
                if (connectionBackoffStrategy.b()) {
                    backoffManager.a();
                    return ajrnVarA;
                }
                backoffManager.b();
                return ajrnVarA;
            } catch (RuntimeException e) {
                if (connectionBackoffStrategy.a()) {
                    backoffManager.a();
                }
                throw e;
            } catch (Exception e2) {
                if (connectionBackoffStrategy.a()) {
                    backoffManager.a();
                }
                if (e2 instanceof ajpd) {
                    throw ((ajpd) e2);
                }
                if (e2 instanceof IOException) {
                    throw ((IOException) e2);
                }
                throw new UndeclaredThrowableException(e2);
            }
        } catch (ajpd e3) {
            throw new ajqu(e3);
        }
    }

    public final synchronized ajqc getAuthSchemes() {
        ajqc ajqcVarCreateAuthSchemeRegistry;
        ajqcVarCreateAuthSchemeRegistry = this.supportedAuthSchemes;
        if (ajqcVarCreateAuthSchemeRegistry == null) {
            ajqcVarCreateAuthSchemeRegistry = createAuthSchemeRegistry();
            this.supportedAuthSchemes = ajqcVarCreateAuthSchemeRegistry;
        }
        return ajqcVarCreateAuthSchemeRegistry;
    }

    public final synchronized ajqs getBackoffManager() {
        return this.backoffManager;
    }

    public final synchronized ajqv getConnectionBackoffStrategy() {
        return this.connectionBackoffStrategy;
    }

    public final synchronized ajss getConnectionKeepAliveStrategy() {
        ajss ajssVarCreateConnectionKeepAliveStrategy;
        ajssVarCreateConnectionKeepAliveStrategy = this.keepAliveStrategy;
        if (ajssVarCreateConnectionKeepAliveStrategy == null) {
            ajssVarCreateConnectionKeepAliveStrategy = createConnectionKeepAliveStrategy();
            this.keepAliveStrategy = ajssVarCreateConnectionKeepAliveStrategy;
        }
        return ajssVarCreateConnectionKeepAliveStrategy;
    }

    public final synchronized ajso getConnectionManager() {
        ajso ajsoVarCreateClientConnectionManager;
        ajsoVarCreateClientConnectionManager = this.connManager;
        if (ajsoVarCreateClientConnectionManager == null) {
            ajsoVarCreateClientConnectionManager = createClientConnectionManager();
            this.connManager = ajsoVarCreateClientConnectionManager;
        }
        return ajsoVarCreateClientConnectionManager;
    }

    public final synchronized ajow getConnectionReuseStrategy() {
        ajow ajowVarCreateConnectionReuseStrategy;
        ajowVarCreateConnectionReuseStrategy = this.reuseStrategy;
        if (ajowVarCreateConnectionReuseStrategy == null) {
            ajowVarCreateConnectionReuseStrategy = createConnectionReuseStrategy();
            this.reuseStrategy = ajowVarCreateConnectionReuseStrategy;
        }
        return ajowVarCreateConnectionReuseStrategy;
    }

    public final synchronized ajus getCookieSpecs() {
        ajus ajusVarCreateCookieSpecRegistry;
        ajusVarCreateCookieSpecRegistry = this.supportedCookieSpecs;
        if (ajusVarCreateCookieSpecRegistry == null) {
            ajusVarCreateCookieSpecRegistry = createCookieSpecRegistry();
            this.supportedCookieSpecs = ajusVarCreateCookieSpecRegistry;
        }
        return ajusVarCreateCookieSpecRegistry;
    }

    public final synchronized ajqw getCookieStore() {
        ajqw ajqwVarCreateCookieStore;
        ajqwVarCreateCookieStore = this.cookieStore;
        if (ajqwVarCreateCookieStore == null) {
            ajqwVarCreateCookieStore = createCookieStore();
            this.cookieStore = ajqwVarCreateCookieStore;
        }
        return ajqwVarCreateCookieStore;
    }

    public final synchronized ajqx getCredentialsProvider() {
        ajqx ajqxVarCreateCredentialsProvider;
        ajqxVarCreateCredentialsProvider = this.credsProvider;
        if (ajqxVarCreateCredentialsProvider == null) {
            ajqxVarCreateCredentialsProvider = createCredentialsProvider();
            this.credsProvider = ajqxVarCreateCredentialsProvider;
        }
        return ajqxVarCreateCredentialsProvider;
    }

    protected final synchronized akax getHttpProcessor() {
        akax akaxVarCreateHttpProcessor;
        akaxVarCreateHttpProcessor = this.mutableProcessor;
        if (akaxVarCreateHttpProcessor == null) {
            akaxVarCreateHttpProcessor = createHttpProcessor();
            this.mutableProcessor = akaxVarCreateHttpProcessor;
        }
        return akaxVarCreateHttpProcessor;
    }

    public final synchronized ajqz getHttpRequestRetryHandler() {
        ajqz ajqzVarCreateHttpRequestRetryHandler;
        ajqzVarCreateHttpRequestRetryHandler = this.retryHandler;
        if (ajqzVarCreateHttpRequestRetryHandler == null) {
            ajqzVarCreateHttpRequestRetryHandler = createHttpRequestRetryHandler();
            this.retryHandler = ajqzVarCreateHttpRequestRetryHandler;
        }
        return ajqzVarCreateHttpRequestRetryHandler;
    }

    public final synchronized akas getParams() {
        akas akasVarCreateHttpParams;
        akasVarCreateHttpParams = this.defaultParams;
        if (akasVarCreateHttpParams == null) {
            akasVarCreateHttpParams = createHttpParams();
            this.defaultParams = akasVarCreateHttpParams;
        }
        return akasVarCreateHttpParams;
    }

    @Deprecated
    public final synchronized ajqq getProxyAuthenticationHandler() {
        return createProxyAuthenticationHandler();
    }

    public final synchronized ajqr getProxyAuthenticationStrategy() {
        ajqr ajqrVarCreateProxyAuthenticationStrategy;
        ajqrVarCreateProxyAuthenticationStrategy = this.proxyAuthStrategy;
        if (ajqrVarCreateProxyAuthenticationStrategy == null) {
            ajqrVarCreateProxyAuthenticationStrategy = createProxyAuthenticationStrategy();
            this.proxyAuthStrategy = ajqrVarCreateProxyAuthenticationStrategy;
        }
        return ajqrVarCreateProxyAuthenticationStrategy;
    }

    @Deprecated
    public final synchronized ajrd getRedirectHandler() {
        return createRedirectHandler();
    }

    public final synchronized ajre getRedirectStrategy() {
        if (this.redirectStrategy == null) {
            this.redirectStrategy = new ajwm();
        }
        return this.redirectStrategy;
    }

    public final synchronized akbd getRequestExecutor() {
        akbd akbdVarCreateRequestExecutor;
        akbdVarCreateRequestExecutor = this.requestExec;
        if (akbdVarCreateRequestExecutor == null) {
            akbdVarCreateRequestExecutor = createRequestExecutor();
            this.requestExec = akbdVarCreateRequestExecutor;
        }
        return akbdVarCreateRequestExecutor;
    }

    public synchronized ajpi getRequestInterceptor(int i) {
        return getHttpProcessor().e(i);
    }

    public synchronized int getRequestInterceptorCount() {
        return getHttpProcessor().c();
    }

    public synchronized ajpl getResponseInterceptor(int i) {
        return getHttpProcessor().f(i);
    }

    public synchronized int getResponseInterceptorCount() {
        return getHttpProcessor().d();
    }

    public final synchronized ajth getRoutePlanner() {
        ajth ajthVarCreateHttpRoutePlanner;
        ajthVarCreateHttpRoutePlanner = this.routePlanner;
        if (ajthVarCreateHttpRoutePlanner == null) {
            ajthVarCreateHttpRoutePlanner = createHttpRoutePlanner();
            this.routePlanner = ajthVarCreateHttpRoutePlanner;
        }
        return ajthVarCreateHttpRoutePlanner;
    }

    @Deprecated
    public final synchronized ajqq getTargetAuthenticationHandler() {
        return createTargetAuthenticationHandler();
    }

    public final synchronized ajqr getTargetAuthenticationStrategy() {
        ajqr ajqrVarCreateTargetAuthenticationStrategy;
        ajqrVarCreateTargetAuthenticationStrategy = this.targetAuthStrategy;
        if (ajqrVarCreateTargetAuthenticationStrategy == null) {
            ajqrVarCreateTargetAuthenticationStrategy = createTargetAuthenticationStrategy();
            this.targetAuthStrategy = ajqrVarCreateTargetAuthenticationStrategy;
        }
        return ajqrVarCreateTargetAuthenticationStrategy;
    }

    public final synchronized ajrh getUserTokenHandler() {
        ajrh ajrhVarCreateUserTokenHandler;
        ajrhVarCreateUserTokenHandler = this.userTokenHandler;
        if (ajrhVarCreateUserTokenHandler == null) {
            ajrhVarCreateUserTokenHandler = createUserTokenHandler();
            this.userTokenHandler = ajrhVarCreateUserTokenHandler;
        }
        return ajrhVarCreateUserTokenHandler;
    }

    public synchronized void removeRequestInterceptorByClass(Class<? extends ajpi> cls) {
        Iterator it = getHttpProcessor().a.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
        this.protocolProcessor = null;
    }

    public synchronized void removeResponseInterceptorByClass(Class<? extends ajpl> cls) {
        Iterator it = getHttpProcessor().b.iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                it.remove();
            }
        }
        this.protocolProcessor = null;
    }

    public synchronized void setAuthSchemes(ajqc ajqcVar) {
        this.supportedAuthSchemes = ajqcVar;
    }

    public synchronized void setBackoffManager(ajqs ajqsVar) {
        this.backoffManager = ajqsVar;
    }

    public synchronized void setConnectionBackoffStrategy(ajqv ajqvVar) {
        this.connectionBackoffStrategy = ajqvVar;
    }

    public synchronized void setCookieSpecs(ajus ajusVar) {
        this.supportedCookieSpecs = ajusVar;
    }

    public synchronized void setCookieStore(ajqw ajqwVar) {
        this.cookieStore = ajqwVar;
    }

    public synchronized void setCredentialsProvider(ajqx ajqxVar) {
        this.credsProvider = ajqxVar;
    }

    public synchronized void setHttpRequestRetryHandler(ajqz ajqzVar) {
        this.retryHandler = ajqzVar;
    }

    public synchronized void setKeepAliveStrategy(ajss ajssVar) {
        this.keepAliveStrategy = ajssVar;
    }

    public synchronized void setParams(akas akasVar) {
        this.defaultParams = akasVar;
    }

    @Deprecated
    public synchronized void setProxyAuthenticationHandler(ajqq ajqqVar) {
        this.proxyAuthStrategy = new ajvz(ajqqVar);
    }

    public synchronized void setProxyAuthenticationStrategy(ajqr ajqrVar) {
        this.proxyAuthStrategy = ajqrVar;
    }

    @Deprecated
    public synchronized void setRedirectHandler(ajrd ajrdVar) {
        this.redirectStrategy = new ajwn(ajrdVar);
    }

    public synchronized void setRedirectStrategy(ajre ajreVar) {
        this.redirectStrategy = ajreVar;
    }

    public synchronized void setReuseStrategy(ajow ajowVar) {
        this.reuseStrategy = ajowVar;
    }

    public synchronized void setRoutePlanner(ajth ajthVar) {
        this.routePlanner = ajthVar;
    }

    @Deprecated
    public synchronized void setTargetAuthenticationHandler(ajqq ajqqVar) {
        this.targetAuthStrategy = new ajvz(ajqqVar);
    }

    public synchronized void setTargetAuthenticationStrategy(ajqr ajqrVar) {
        this.targetAuthStrategy = ajqrVar;
    }

    public synchronized void setUserTokenHandler(ajrh ajrhVar) {
        this.userTokenHandler = ajrhVar;
    }

    public synchronized void addRequestInterceptor(ajpi ajpiVar) {
        getHttpProcessor().g(ajpiVar);
        this.protocolProcessor = null;
    }

    public synchronized void addResponseInterceptor(ajpl ajplVar) {
        getHttpProcessor().h(ajplVar);
        this.protocolProcessor = null;
    }

    @Deprecated
    protected ajrf createClientRequestDirector(akbd akbdVar, ajso ajsoVar, ajow ajowVar, ajss ajssVar, ajth ajthVar, akbc akbcVar, ajqz ajqzVar, ajre ajreVar, ajqq ajqqVar, ajqq ajqqVar2, ajrh ajrhVar, akas akasVar) {
        return new ajwo(LogFactory.getLog(ajwo.class), akbdVar, ajsoVar, ajowVar, ajssVar, ajthVar, akbcVar, ajqzVar, ajreVar, new ajvz(ajqqVar), new ajvz(ajqqVar2), ajrhVar, akasVar);
    }

    protected ajrf createClientRequestDirector(akbd akbdVar, ajso ajsoVar, ajow ajowVar, ajss ajssVar, ajth ajthVar, akbc akbcVar, ajqz ajqzVar, ajre ajreVar, ajqr ajqrVar, ajqr ajqrVar2, ajrh ajrhVar, akas akasVar) {
        return new ajwo(this.log, akbdVar, ajsoVar, ajowVar, ajssVar, ajthVar, akbcVar, ajqzVar, ajreVar, ajqrVar, ajqrVar2, ajrhVar, akasVar);
    }
}
