package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends HttpURLConnection {

    /* renamed from: a, reason: collision with root package name */
    private final e f10542a;

    c(HttpURLConnection httpURLConnection, m mVar, com.google.firebase.perf.metrics.f fVar) {
        super(httpURLConnection.getURL());
        this.f10542a = new e(httpURLConnection, mVar, fVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f10542a.D(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        this.f10542a.E();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.f10542a.F();
    }

    public final boolean equals(Object obj) {
        return this.f10542a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f10542a.U();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f10542a.a();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f10542a.p();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        return this.f10542a.r();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        return this.f10542a.b();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        return this.f10542a.f();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        return this.f10542a.s();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        return this.f10542a.g();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f10542a.V();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f10542a.W();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f10542a.X();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f10542a.m();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        return this.f10542a.h();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i2) {
        return this.f10542a.t(i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j2) {
        return this.f10542a.i(str, j2);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i2) {
        return this.f10542a.c(str, i2);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i2) {
        return this.f10542a.v(i2);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j2) {
        return this.f10542a.j(str, j2);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        return this.f10542a.B();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f10542a.k();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f10542a.n();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f10542a.Y();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        return this.f10542a.l();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f10542a.o();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.f10542a.A();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f10542a.d();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f10542a.w();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f10542a.C();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f10542a.x(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f10542a.e();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f10542a.y();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f10542a.z();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f10542a.Z();
    }

    public final int hashCode() {
        return this.f10542a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f10542a.G(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i2) {
        this.f10542a.H(i2);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i2) {
        this.f10542a.I(i2);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f10542a.J(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f10542a.K(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f10542a.L(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i2) {
        this.f10542a.M(i2);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        this.f10542a.O(j2);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f10542a.P(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i2) {
        this.f10542a.Q(i2);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f10542a.R(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.f10542a.S(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f10542a.T(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f10542a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f10542a.aa();
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        this.f10542a.N(j2);
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f10542a.q(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        return this.f10542a.u(str);
    }
}
