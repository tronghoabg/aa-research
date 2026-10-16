package com.google.firebase.perf.network;

import androidx.browser.trusted.sharing.ShareTarget;
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
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10545a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final HttpURLConnection f10546b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.metrics.f f10547c;

    /* renamed from: d, reason: collision with root package name */
    private long f10548d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f10549e = -1;

    /* renamed from: f, reason: collision with root package name */
    private final m f10550f;

    public e(HttpURLConnection httpURLConnection, m mVar, com.google.firebase.perf.metrics.f fVar) {
        this.f10546b = httpURLConnection;
        this.f10547c = fVar;
        this.f10550f = mVar;
        fVar.p(httpURLConnection.getURL().toString());
    }

    private final void ab() {
        if (this.f10548d == -1) {
            m mVar = this.f10550f;
            mVar.f();
            long jD = mVar.d();
            this.f10548d = jD;
            this.f10547c.j(jD);
        }
        String strW = w();
        if (strW != null) {
            this.f10547c.f(strW);
            return;
        }
        boolean zX = X();
        com.google.firebase.perf.metrics.f fVar = this.f10547c;
        if (zX) {
            fVar.f(ShareTarget.METHOD_POST);
        } else {
            fVar.f(ShareTarget.METHOD_GET);
        }
    }

    public final Permission A() throws IOException {
        try {
            return this.f10546b.getPermission();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            fVar.n(this.f10550f.b());
            h.c(fVar);
            throw e2;
        }
    }

    public final Map B() {
        ab();
        return this.f10546b.getHeaderFields();
    }

    public final Map C() {
        return this.f10546b.getRequestProperties();
    }

    public final void D(String str, String str2) {
        this.f10546b.addRequestProperty(str, str2);
    }

    public final void E() throws IOException {
        if (this.f10548d == -1) {
            m mVar = this.f10550f;
            mVar.f();
            long jD = mVar.d();
            this.f10548d = jD;
            this.f10547c.j(jD);
        }
        try {
            this.f10546b.connect();
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            fVar.n(this.f10550f.b());
            h.c(fVar);
            throw e2;
        }
    }

    public final void F() {
        m mVar = this.f10550f;
        com.google.firebase.perf.metrics.f fVar = this.f10547c;
        fVar.n(mVar.b());
        fVar.e();
        this.f10546b.disconnect();
    }

    public final void G(boolean z) {
        this.f10546b.setAllowUserInteraction(z);
    }

    public final void H(int i2) {
        this.f10546b.setChunkedStreamingMode(i2);
    }

    public final void I(int i2) {
        this.f10546b.setConnectTimeout(i2);
    }

    public final void J(boolean z) {
        this.f10546b.setDefaultUseCaches(z);
    }

    public final void K(boolean z) {
        this.f10546b.setDoInput(z);
    }

    public final void L(boolean z) {
        this.f10546b.setDoOutput(z);
    }

    public final void M(int i2) {
        this.f10546b.setFixedLengthStreamingMode(i2);
    }

    public final void N(long j2) {
        this.f10546b.setFixedLengthStreamingMode(j2);
    }

    public final void O(long j2) {
        this.f10546b.setIfModifiedSince(j2);
    }

    public final void P(boolean z) {
        this.f10546b.setInstanceFollowRedirects(z);
    }

    public final void Q(int i2) {
        this.f10546b.setReadTimeout(i2);
    }

    public final void R(String str) throws ProtocolException {
        this.f10546b.setRequestMethod(str);
    }

    public final void S(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f10547c.q(str2);
        }
        this.f10546b.setRequestProperty(str, str2);
    }

    public final void T(boolean z) {
        this.f10546b.setUseCaches(z);
    }

    public final boolean U() {
        return this.f10546b.getAllowUserInteraction();
    }

    public final boolean V() {
        return this.f10546b.getDefaultUseCaches();
    }

    public final boolean W() {
        return this.f10546b.getDoInput();
    }

    public final boolean X() {
        return this.f10546b.getDoOutput();
    }

    public final boolean Y() {
        return this.f10546b.getInstanceFollowRedirects();
    }

    public final boolean Z() {
        return this.f10546b.getUseCaches();
    }

    public final int a() {
        return this.f10546b.getConnectTimeout();
    }

    public final boolean aa() {
        return this.f10546b.usingProxy();
    }

    public final int b() {
        ab();
        return this.f10546b.getContentLength();
    }

    public final int c(String str, int i2) {
        ab();
        return this.f10546b.getHeaderFieldInt(str, i2);
    }

    public final int d() {
        return this.f10546b.getReadTimeout();
    }

    public final int e() throws IOException {
        ab();
        if (this.f10549e == -1) {
            long jB = this.f10550f.b();
            this.f10549e = jB;
            this.f10547c.o(jB);
        }
        try {
            int responseCode = this.f10546b.getResponseCode();
            this.f10547c.g(responseCode);
            return responseCode;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            fVar.n(this.f10550f.b());
            h.c(fVar);
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        return this.f10546b.equals(obj);
    }

    public final long f() {
        ab();
        return this.f10546b.getContentLengthLong();
    }

    public final long g() {
        ab();
        return this.f10546b.getDate();
    }

    public final long h() {
        ab();
        return this.f10546b.getExpiration();
    }

    public final int hashCode() {
        return this.f10546b.hashCode();
    }

    public final long i(String str, long j2) {
        ab();
        return this.f10546b.getHeaderFieldDate(str, j2);
    }

    public final long j(String str, long j2) {
        ab();
        return this.f10546b.getHeaderFieldLong(str, j2);
    }

    public final long k() {
        return this.f10546b.getIfModifiedSince();
    }

    public final long l() {
        ab();
        return this.f10546b.getLastModified();
    }

    public final InputStream m() {
        ab();
        try {
            this.f10547c.g(this.f10546b.getResponseCode());
        } catch (IOException unused) {
            f10545a.b("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f10546b.getErrorStream();
        if (errorStream != null) {
            return new a(errorStream, this.f10547c, this.f10550f);
        }
        return null;
    }

    public final InputStream n() throws IOException {
        ab();
        HttpURLConnection httpURLConnection = this.f10546b;
        com.google.firebase.perf.metrics.f fVar = this.f10547c;
        fVar.g(httpURLConnection.getResponseCode());
        fVar.k(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new a(inputStream, fVar, this.f10550f);
            }
            return null;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10547c;
            fVar2.n(this.f10550f.b());
            h.c(fVar2);
            throw e2;
        }
    }

    public final OutputStream o() throws IOException {
        try {
            OutputStream outputStream = this.f10546b.getOutputStream();
            if (outputStream != null) {
                return new b(outputStream, this.f10547c, this.f10550f);
            }
            return null;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            fVar.n(this.f10550f.b());
            h.c(fVar);
            throw e2;
        }
    }

    public final Object p() throws IOException {
        ab();
        HttpURLConnection httpURLConnection = this.f10546b;
        this.f10547c.g(httpURLConnection.getResponseCode());
        try {
            Object content = httpURLConnection.getContent();
            boolean z = content instanceof InputStream;
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            if (z) {
                fVar.k(this.f10546b.getContentType());
                return new a((InputStream) content, fVar, this.f10550f);
            }
            fVar.k(this.f10546b.getContentType());
            fVar.l(r1.getContentLength());
            fVar.n(this.f10550f.b());
            fVar.e();
            return content;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10547c;
            fVar2.n(this.f10550f.b());
            h.c(fVar2);
            throw e2;
        }
    }

    public final Object q(Class[] clsArr) throws IOException {
        ab();
        HttpURLConnection httpURLConnection = this.f10546b;
        this.f10547c.g(httpURLConnection.getResponseCode());
        try {
            Object content = httpURLConnection.getContent(clsArr);
            boolean z = content instanceof InputStream;
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            if (z) {
                fVar.k(this.f10546b.getContentType());
                return new a((InputStream) content, fVar, this.f10550f);
            }
            fVar.k(this.f10546b.getContentType());
            fVar.l(r0.getContentLength());
            fVar.n(this.f10550f.b());
            fVar.e();
            return content;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar2 = this.f10547c;
            fVar2.n(this.f10550f.b());
            h.c(fVar2);
            throw e2;
        }
    }

    public final String r() {
        ab();
        return this.f10546b.getContentEncoding();
    }

    public final String s() {
        ab();
        return this.f10546b.getContentType();
    }

    public final String t(int i2) {
        ab();
        return this.f10546b.getHeaderField(i2);
    }

    public final String toString() {
        return this.f10546b.toString();
    }

    public final String u(String str) {
        ab();
        return this.f10546b.getHeaderField(str);
    }

    public final String v(int i2) {
        ab();
        return this.f10546b.getHeaderFieldKey(i2);
    }

    public final String w() {
        return this.f10546b.getRequestMethod();
    }

    public final String x(String str) {
        return this.f10546b.getRequestProperty(str);
    }

    public final String y() throws IOException {
        ab();
        if (this.f10549e == -1) {
            long jB = this.f10550f.b();
            this.f10549e = jB;
            this.f10547c.o(jB);
        }
        try {
            HttpURLConnection httpURLConnection = this.f10546b;
            String responseMessage = httpURLConnection.getResponseMessage();
            this.f10547c.g(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e2) {
            com.google.firebase.perf.metrics.f fVar = this.f10547c;
            fVar.n(this.f10550f.b());
            h.c(fVar);
            throw e2;
        }
    }

    public final URL z() {
        return this.f10546b.getURL();
    }
}
