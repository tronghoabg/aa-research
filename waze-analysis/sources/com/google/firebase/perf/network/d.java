package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d extends HttpsURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final e f10543a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f10544b;

    d(HttpsURLConnection httpsURLConnection, m mVar, com.google.firebase.perf.metrics.f fVar) {
        super(httpsURLConnection.getURL());
        this.f10544b = httpsURLConnection;
        this.f10543a = new e(httpsURLConnection, mVar, fVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f10543a.D(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f10543a.E();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.f10543a.F();
    }

    public final boolean equals(Object obj) {
        return this.f10543a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f10543a.U();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f10544b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f10543a.a();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f10543a.p();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.f10543a.r();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.f10543a.b();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return this.f10543a.f();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.f10543a.s();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.f10543a.g();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f10543a.V();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f10543a.W();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f10543a.X();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f10543a.m();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.f10543a.h();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i2) {
        return this.f10543a.t(i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j2) {
        return this.f10543a.i(str, j2);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i2) {
        return this.f10543a.c(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i2) {
        return this.f10543a.v(i2);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j2) {
        return this.f10543a.j(str, j2);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.f10543a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f10544b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f10543a.k();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f10543a.n();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f10543a.Y();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.f10543a.l();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f10544b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f10544b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f10543a.o();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f10544b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f10543a.A();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f10543a.d();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f10543a.w();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f10543a.C();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f10543a.x(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f10543a.e();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f10543a.y();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f10544b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f10544b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f10543a.z();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f10543a.Z();
    }

    public final int hashCode() {
        return this.f10543a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f10543a.G(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i2) {
        this.f10543a.H(i2);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i2) {
        this.f10543a.I(i2);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f10543a.J(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f10543a.K(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f10543a.L(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i2) {
        this.f10543a.M(i2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f10544b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        this.f10543a.O(j2);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f10543a.P(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i2) {
        this.f10543a.Q(i2);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f10543a.R(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.f10543a.S(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f10544b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f10543a.T(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f10543a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f10543a.aa();
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        this.f10543a.N(j2);
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f10543a.q(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.f10543a.u(str);
    }
}
