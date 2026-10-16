package b7;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1711z;
import com.google.android.gms.common.internal.AbstractC1732v;
import h7.C2793a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final C2793a f19373c = new C2793a("RevokeAccessOperation", new String[0]);

    /* renamed from: a, reason: collision with root package name */
    public final String f19374a;

    /* renamed from: b, reason: collision with root package name */
    public final C1711z f19375b;

    public c(String str) {
        AbstractC1732v.f(str);
        this.f19374a = str;
        this.f19375b = new C1711z(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        C2793a c2793a = f19373c;
        Status status = Status.f26426g;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f19374a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f26424e;
            } else {
                c2793a.c("Unable to revoke access!", new Object[0]);
            }
            c2793a.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            c2793a.c("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e10) {
            c2793a.c("Exception when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        }
        this.f19375b.setResult((C1711z) status);
    }
}
