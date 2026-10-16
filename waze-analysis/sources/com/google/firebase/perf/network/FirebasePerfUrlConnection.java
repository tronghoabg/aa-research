package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    public static Object getContent(URL url) throws IOException {
        com.google.firebase.perf.d.f fVarA = com.google.firebase.perf.d.f.a();
        m mVar = new m();
        mVar.f();
        long jD = mVar.d();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(fVarA);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new d((HttpsURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getContent() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getContent() : uRLConnectionOpenConnection.getContent();
        } catch (IOException e2) {
            fVarB.j(jD);
            fVarB.n(mVar.b());
            fVarB.p(url.toString());
            h.c(fVarB);
            throw e2;
        }
    }

    public static Object instrument(Object obj) {
        return obj instanceof HttpsURLConnection ? new d((HttpsURLConnection) obj, new m(), com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a())) : obj instanceof HttpURLConnection ? new c((HttpURLConnection) obj, new m(), com.google.firebase.perf.metrics.f.b(com.google.firebase.perf.d.f.a())) : obj;
    }

    public static InputStream openStream(URL url) throws IOException {
        com.google.firebase.perf.d.f fVarA = com.google.firebase.perf.d.f.a();
        m mVar = new m();
        if (!com.google.firebase.perf.d.f.a().l()) {
            return url.openConnection().getInputStream();
        }
        mVar.f();
        long jD = mVar.d();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(fVarA);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            return uRLConnectionOpenConnection instanceof HttpsURLConnection ? new d((HttpsURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getInputStream() : uRLConnectionOpenConnection instanceof HttpURLConnection ? new c((HttpURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getInputStream() : uRLConnectionOpenConnection.getInputStream();
        } catch (IOException e2) {
            fVarB.j(jD);
            fVarB.n(mVar.b());
            fVarB.p(url.toString());
            h.c(fVarB);
            throw e2;
        }
    }

    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        com.google.firebase.perf.d.f fVarA = com.google.firebase.perf.d.f.a();
        m mVar = new m();
        mVar.f();
        long jD = mVar.d();
        com.google.firebase.perf.metrics.f fVarB = com.google.firebase.perf.metrics.f.b(fVarA);
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return new d((HttpsURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getContent(clsArr);
            }
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) uRLConnectionOpenConnection, mVar, fVarB).getContent(clsArr);
            }
            return uRLConnectionOpenConnection.getContent(clsArr);
        } catch (IOException e2) {
            fVarB.j(jD);
            fVarB.n(mVar.b());
            fVarB.p(url.toString());
            h.c(fVarB);
            throw e2;
        }
    }
}
