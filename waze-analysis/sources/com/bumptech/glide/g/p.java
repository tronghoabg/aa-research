package com.bumptech.glide.g;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.identity.x;
import com.google.android.gms.common.api.internal.av;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p {
    public static void a(boolean z) {
        b(z, "");
    }

    public static void b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void d(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void f(Object obj) {
        e(obj, "Argument must not be null");
    }

    public static j g(j jVar) {
        return new i(jVar);
    }

    public static com.google.android.gms.auth.api.identity.a.n h(Context context) {
        av.m(context);
        return new com.google.android.gms.auth.api.identity.a.n(context, new x());
    }

    public static final void i(String str) {
        try {
            try {
                com.google.android.gms.k.e.a.c.b();
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        Log.w("HttpUrlPinger", "Received non-success response code " + responseCode + " from pinging URL: " + str);
                    }
                    com.google.android.gms.k.e.a.c.a();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                e = e2;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                com.google.android.gms.k.e.a.c.a();
            } catch (IndexOutOfBoundsException e3) {
                Log.w("HttpUrlPinger", "Error while parsing ping URL: " + str + ". " + e3.getMessage(), e3);
                com.google.android.gms.k.e.a.c.a();
            } catch (RuntimeException e4) {
                e = e4;
                Log.w("HttpUrlPinger", "Error while pinging URL: " + str + ". " + e.getMessage(), e);
                com.google.android.gms.k.e.a.c.a();
            }
        } catch (Throwable th) {
            com.google.android.gms.k.e.a.c.a();
            throw th;
        }
    }
}
