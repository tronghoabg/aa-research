package com.google.android.gms.auth.api.signin.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.ab;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.api.internal.bk;
import com.google.android.gms.common.api.v;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.a.a f4615a = new com.google.android.gms.common.a.a("RevokeAccessOperation");

    /* renamed from: b, reason: collision with root package name */
    private final String f4616b;

    /* renamed from: c, reason: collision with root package name */
    private final bk f4617c;

    public a(String str) {
        av.k(str);
        this.f4616b = str;
        this.f4617c = new bk(null);
    }

    public static v a(String str) {
        if (str == null) {
            return ab.a(new Status(4));
        }
        a aVar = new a(str);
        new Thread(aVar).start();
        return aVar.f4617c;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Status status = Status.f4688c;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f4616b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f4686a;
            } else {
                f4615a.c("Unable to revoke access!");
            }
            f4615a.b("Response Code: " + responseCode);
        } catch (IOException e2) {
            f4615a.c("IOException when revoking access: ".concat(String.valueOf(e2.toString())));
        } catch (Exception e3) {
            f4615a.c("Exception when revoking access: ".concat(String.valueOf(e3.toString())));
        }
        this.f4617c.j(status);
    }
}
