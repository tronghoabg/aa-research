package com.google.android.libraries.handwriting.networkrecognizer;

import defpackage.ahgm;
import defpackage.ajpj;
import defpackage.ajso;
import defpackage.ajss;
import defpackage.ajto;
import defpackage.ajtp;
import defpackage.ajtt;
import defpackage.ajub;
import defpackage.ajuc;
import defpackage.ajuf;
import defpackage.ajwi;
import defpackage.ajxw;
import defpackage.akar;
import defpackage.akas;
import defpackage.akba;

/* loaded from: classes3.dex */
public class HandwritingHttpClient extends ajwi {
    protected static final long CONNECTION_REUSE_MILLISECONDS = 100000;
    public static int connectionTimeoutMillis = 10000;
    public static int socketTimeoutMillis = 10000;
    protected String status;

    public interface RunAfterAuthentication {
        void onAuthenticated();

        void onAuthenticationFailed(String str);
    }

    protected HandwritingHttpClient(ajso ajsoVar, akas akasVar) {
        super(ajsoVar, akasVar);
        setKeepAliveStrategy(new ajss(this) { // from class: com.google.android.libraries.handwriting.networkrecognizer.HandwritingHttpClient.1
            {
                this.getClass();
            }

            @Override // defpackage.ajss
            public long getKeepAliveDuration(ajpj ajpjVar, akba akbaVar) {
                return HandwritingHttpClient.CONNECTION_REUSE_MILLISECONDS;
            }
        });
    }

    public static HandwritingHttpClient getNewHttpClient() throws ajub {
        ajtt ajttVar = new ajtt();
        ajttVar.b(new ajtp("http", new ajto(), 80));
        ajuc ajucVarG = ajuc.g();
        ajuf ajufVar = ajuc.b;
        ahgm.e(ajufVar, "Hostname verifier");
        ajucVarG.c = ajufVar;
        ajttVar.b(new ajtp("https", ajuc.g(), 443));
        akar akarVar = new akar();
        akarVar.i("http.connection.timeout", connectionTimeoutMillis);
        akarVar.i("http.socket.timeout", socketTimeoutMillis);
        return new HandwritingHttpClient(new ajxw(akarVar, ajttVar), akarVar);
    }
}
