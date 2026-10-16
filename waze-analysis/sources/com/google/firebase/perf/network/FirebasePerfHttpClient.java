package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVarB.f(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest);
            fVarB.n(mVar.b());
            fVarB.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                fVarB.l(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                fVarB.k(strB);
            }
            fVarB.e();
            return httpResponseExecute;
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVarB.f(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, mVar, fVarB));
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVarB.f(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, mVar, fVarB), httpContext);
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            fVarB.f(httpRequest.getRequestLine().getMethod());
            Long lA = h.a(httpRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            HttpResponse httpResponseExecute = httpClient.execute(httpHost, httpRequest, httpContext);
            fVarB.n(mVar.b());
            fVarB.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                fVarB.l(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                fVarB.k(strB);
            }
            fVarB.e();
            return httpResponseExecute;
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpUriRequest.getURI().toString());
            fVarB.f(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest);
            fVarB.n(mVar.b());
            fVarB.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                fVarB.l(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                fVarB.k(strB);
            }
            fVarB.e();
            return httpResponseExecute;
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpUriRequest.getURI().toString());
            fVarB.f(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, mVar, fVarB));
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpUriRequest.getURI().toString());
            fVarB.f(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, mVar, fVarB), httpContext);
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        m mVar = new m();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a());
        try {
            fVarB.p(httpUriRequest.getURI().toString());
            fVarB.f(httpUriRequest.getMethod());
            Long lA = h.a(httpUriRequest);
            if (lA != null) {
                fVarB.i(lA.longValue());
            }
            mVar.f();
            fVarB.j(mVar.d());
            HttpResponse httpResponseExecute = httpClient.execute(httpUriRequest, httpContext);
            fVarB.n(mVar.b());
            fVarB.g(httpResponseExecute.getStatusLine().getStatusCode());
            Long lA2 = h.a(httpResponseExecute);
            if (lA2 != null) {
                fVarB.l(lA2.longValue());
            }
            String strB = h.b(httpResponseExecute);
            if (strB != null) {
                fVarB.k(strB);
            }
            fVarB.e();
            return httpResponseExecute;
        } catch (IOException e2) {
            fVarB.n(mVar.b());
            h.c(fVarB);
            throw e2;
        }
    }
}
