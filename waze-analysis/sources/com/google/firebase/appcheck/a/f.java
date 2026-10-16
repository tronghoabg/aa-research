package com.google.firebase.appcheck.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.o.ag;
import com.google.e.a.e.ai;
import com.google.firebase.remoteconfig.internal.u;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8858a = "com.google.firebase.appcheck.a.f";

    /* renamed from: b, reason: collision with root package name */
    private final Context f8859b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8860c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8861d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8862e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.g.c f8863f;

    public f(com.google.firebase.e eVar) {
        Context contextA = eVar.a();
        com.google.firebase.i iVarD = eVar.d();
        com.google.firebase.g.c cVarF = ((d) com.google.firebase.appcheck.d.c(eVar)).f();
        av.m(cVarF);
        this.f8859b = contextA;
        this.f8860c = iVarD.b();
        this.f8861d = iVarD.c();
        String strE = iVarD.e();
        this.f8862e = strE;
        if (strE == null) {
            throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
        }
        this.f8863f = cVarF;
    }

    private final String c(URL url, byte[] bArr, g gVar, boolean z) {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            com.google.firebase.f.g gVar2 = (com.google.firebase.f.g) this.f8863f.a();
            String strB = null;
            if (gVar2 != null) {
                try {
                    str = (String) ag.f(gVar2.a());
                } catch (Exception unused) {
                    Log.w(f8858a, "Unable to get heartbeats!");
                }
            } else {
                str = null;
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            Context context = this.f8859b;
            httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
            try {
                byte[] bArrB = com.google.android.gms.common.util.a.b(context, context.getPackageName());
                if (bArrB == null) {
                    Log.e(f8858a, "Could not get fingerprint hash for package: " + context.getPackageName());
                } else {
                    strB = com.google.android.gms.common.util.d.b(bArrB);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f8858a, "No such package: ".concat(String.valueOf(this.f8859b.getPackageName())), e2);
            }
            httpURLConnection.setRequestProperty("X-Android-Cert", strB);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            int length = bArr.length;
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, length);
            try {
                bufferedOutputStream.write(bArr, 0, length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = d(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                String string = sb.toString();
                if (d(responseCode)) {
                    if (z) {
                        gVar.a();
                    }
                    return string;
                }
                gVar.b(responseCode);
                u uVarG = u.g(string);
                throw new com.google.firebase.h("Error returned from API. code: " + uVarG.e() + " body: " + uVarG.f());
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private static final boolean d(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    public final String a(byte[] bArr, g gVar) throws com.google.firebase.h {
        if (gVar.c()) {
            return c(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", this.f8862e, this.f8861d, this.f8860c)), bArr, gVar, false);
        }
        throw new com.google.firebase.h("Too many attempts.");
    }

    public final ai b(byte[] bArr, int i2, g gVar) throws com.google.firebase.h {
        if (gVar.c()) {
            return ai.h(c(new URL(String.format(i2 != 2 ? "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s" : "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s", this.f8862e, this.f8861d, this.f8860c)), bArr, gVar, true));
        }
        throw new com.google.firebase.h("Too many attempts.");
    }
}
