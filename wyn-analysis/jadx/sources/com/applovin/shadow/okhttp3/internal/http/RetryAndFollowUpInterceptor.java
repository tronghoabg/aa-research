package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Interceptor;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.Route;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.connection.Exchange;
import com.applovin.shadow.okhttp3.internal.connection.RealCall;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.google.android.gms.common.api.f;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lcom/applovin/shadow/okhttp3/Interceptor;", "client", "Lcom/applovin/shadow/okhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lcom/applovin/shadow/okhttp3/Request;", "userResponse", "Lcom/applovin/shadow/okhttp3/Response;", "method", "", "followUpRequest", "exchange", "Lcom/applovin/shadow/okhttp3/internal/connection/Exchange;", "intercept", "chain", "Lcom/applovin/shadow/okhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lcom/applovin/shadow/okhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;

    @NotNull
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(@NotNull OkHttpClient client) {
        AbstractC3340k.e(client, "client");
        this.client = client;
    }

    private final Request buildRedirectRequest(Response userResponse, String method) {
        String strHeader$default;
        HttpUrl httpUrlResolve;
        if (!this.client.followRedirects() || (strHeader$default = Response.header$default(userResponse, org.apache.tika.metadata.HttpHeaders.LOCATION, null, 2, null)) == null || (httpUrlResolve = userResponse.request().url().resolve(strHeader$default)) == null) {
            return null;
        }
        if (!AbstractC3340k.a(httpUrlResolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder builderNewBuilder = userResponse.request().newBuilder();
        if (HttpMethod.permitsRequestBody(method)) {
            int iCode = userResponse.code();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z2 = httpMethod.redirectsWithBody(method) || iCode == 308 || iCode == 307;
            if (!httpMethod.redirectsToGet(method) || iCode == 308 || iCode == 307) {
                builderNewBuilder.method(method, z2 ? userResponse.request().body() : null);
            } else {
                builderNewBuilder.method("GET", null);
            }
            if (!z2) {
                builderNewBuilder.removeHeader("Transfer-Encoding");
                builderNewBuilder.removeHeader(org.apache.tika.metadata.HttpHeaders.CONTENT_LENGTH);
                builderNewBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.request().url(), httpUrlResolve)) {
            builderNewBuilder.removeHeader(ApiHeadersProvider.AUTHORIZATION);
        }
        return builderNewBuilder.url(httpUrlResolve).build();
    }

    private final Request followUpRequest(Response userResponse, Exchange exchange) throws IOException {
        RealConnection connection;
        Route route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int iCode = userResponse.code();
        String strMethod = userResponse.request().method();
        if (iCode != 307 && iCode != 308) {
            if (iCode == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (iCode == 421) {
                RequestBody requestBodyBody = userResponse.request().body();
                if ((requestBodyBody != null && requestBodyBody.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (iCode == 503) {
                Response responsePriorResponse = userResponse.priorResponse();
                if ((responsePriorResponse == null || responsePriorResponse.code() != 503) && retryAfter(userResponse, f.API_PRIORITY_OTHER) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (iCode == 407) {
                AbstractC3340k.b(route);
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iCode == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                RequestBody requestBodyBody2 = userResponse.request().body();
                if (requestBodyBody2 != null && requestBodyBody2.isOneShot()) {
                    return null;
                }
                Response responsePriorResponse2 = userResponse.priorResponse();
                if ((responsePriorResponse2 == null || responsePriorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (iCode) {
                case 300:
                case MRAID_ERROR_VALUE:
                case INVALID_IFA_STATUS_VALUE:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, strMethod);
    }

    private final boolean isRecoverable(IOException e7, boolean requestSendStarted) {
        if (e7 instanceof ProtocolException) {
            return false;
        }
        return e7 instanceof InterruptedIOException ? (e7 instanceof SocketTimeoutException) && !requestSendStarted : (((e7 instanceof SSLHandshakeException) && (e7.getCause() instanceof CertificateException)) || (e7 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException e7, RealCall call, Request userRequest, boolean requestSendStarted) {
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e7, userRequest)) && isRecoverable(e7, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e7, Request userRequest) {
        RequestBody requestBodyBody = userRequest.body();
        return (requestBodyBody != null && requestBodyBody.isOneShot()) || (e7 instanceof FileNotFoundException);
    }

    private final int retryAfter(Response userResponse, int defaultDelay) throws NumberFormatException {
        String strHeader$default = Response.header$default(userResponse, CommonGatewayClient.HEADER_RETRY_AFTER, null, 2, null);
        if (strHeader$default == null) {
            return defaultDelay;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        AbstractC3340k.d(patternCompile, "compile(...)");
        if (!patternCompile.matcher(strHeader$default).matches()) {
            return f.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strHeader$default);
        AbstractC3340k.d(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r6 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r0.getIsDuplex() == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r0.isOneShot() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        com.applovin.shadow.okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (r8 > 20) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    @Override // com.applovin.shadow.okhttp3.Interceptor
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.shadow.okhttp3.Response intercept(@org.jetbrains.annotations.NotNull com.applovin.shadow.okhttp3.Interceptor.Chain r11) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.AbstractC3340k.e(r11, r0)
            com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain r11 = (com.applovin.shadow.okhttp3.internal.http.RealInterceptorChain) r11
            com.applovin.shadow.okhttp3.Request r0 = r11.getRequest()
            com.applovin.shadow.okhttp3.internal.connection.RealCall r1 = r11.getCall()
            ff.v r2 = ff.v.f35432a
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L16:
            r6 = r5
        L17:
            r1.enterNetworkInterceptorExchange(r0, r6)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto Ld1
            com.applovin.shadow.okhttp3.Response r0 = r11.proceed(r0)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L97 com.applovin.shadow.okhttp3.internal.connection.RouteException -> Lb2
            if (r7 == 0) goto L3e
            com.applovin.shadow.okhttp3.Response$Builder r0 = r0.newBuilder()     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Response$Builder r6 = r7.newBuilder()     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Response$Builder r6 = r6.body(r4)     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Response r6 = r6.build()     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Response$Builder r0 = r0.priorResponse(r6)     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Response r0 = r0.build()     // Catch: java.lang.Throwable -> L40
        L3e:
            r7 = r0
            goto L43
        L40:
            r11 = move-exception
            goto Ld9
        L43:
            com.applovin.shadow.okhttp3.internal.connection.Exchange r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L40
            com.applovin.shadow.okhttp3.Request r6 = r10.followUpRequest(r7, r0)     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L5c
            if (r0 == 0) goto L58
            boolean r11 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L58
            r1.timeoutEarlyExit()     // Catch: java.lang.Throwable -> L40
        L58:
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L5c:
            com.applovin.shadow.okhttp3.RequestBody r0 = r6.body()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L6c
            r1.exitNetworkInterceptorExchange$okhttp(r3)
            return r7
        L6c:
            com.applovin.shadow.okhttp3.ResponseBody r0 = r7.body()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L75
            com.applovin.shadow.okhttp3.internal.Util.closeQuietly(r0)     // Catch: java.lang.Throwable -> L40
        L75:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L80
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r0 = r6
            goto L16
        L80:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L40
            r0.append(r8)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        L97:
            r6 = move-exception
            boolean r9 = r6 instanceof com.applovin.shadow.okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L40
            r9 = r9 ^ r5
            boolean r9 = r10.recover(r6, r1, r0, r9)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto Lad
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = ff.o.F0(r2, r6)     // Catch: java.lang.Throwable -> L40
        La7:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            r6 = r3
            goto L17
        Lad:
            java.lang.Throwable r11 = com.applovin.shadow.okhttp3.internal.Util.withSuppressed(r6, r2)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Lb2:
            r6 = move-exception
            java.io.IOException r9 = r6.getLastConnectException()     // Catch: java.lang.Throwable -> L40
            boolean r9 = r10.recover(r9, r1, r0, r3)     // Catch: java.lang.Throwable -> L40
            if (r9 == 0) goto Lc8
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L40
            java.io.IOException r6 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L40
            java.util.ArrayList r2 = ff.o.F0(r2, r6)     // Catch: java.lang.Throwable -> L40
            goto La7
        Lc8:
            java.io.IOException r11 = r6.getFirstConnectException()     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r11 = com.applovin.shadow.okhttp3.internal.Util.withSuppressed(r11, r2)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Ld1:
            java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r11     // Catch: java.lang.Throwable -> L40
        Ld9:
            r1.exitNetworkInterceptorExchange$okhttp(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(com.applovin.shadow.okhttp3.Interceptor$Chain):com.applovin.shadow.okhttp3.Response");
    }
}
