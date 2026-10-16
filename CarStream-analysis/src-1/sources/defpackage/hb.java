package defpackage;

import android.os.Handler;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class hb implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ z d;

    public hb(z zVar, String str, int i, c1 c1Var) {
        this.d = zVar;
        this.a = str;
        this.b = i;
        this.c = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        List listE;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL("https://suggestqueries.google.com/complete/search?client=firefox&ds=yt&oe=utf-8&q=" + URLEncoder.encode(this.a, "UTF-8")).openConnection();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setConnectTimeout(4000);
            httpURLConnection.setReadTimeout(4000);
            httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
            if (httpURLConnection.getResponseCode() != 200) {
                listE = Collections.EMPTY_LIST;
            } else {
                InputStream inputStream = httpURLConnection.getInputStream();
                String strB = z.b(httpURLConnection);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                }
                inputStream.close();
                listE = z.e(byteArrayOutputStream.toString(strB));
            }
            httpURLConnection.disconnect();
        } catch (Exception unused2) {
            httpURLConnection2 = httpURLConnection;
            listE = Collections.EMPTY_LIST;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            ((Handler) this.d.a).post(new h(15, this, listE));
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
        ((Handler) this.d.a).post(new h(15, this, listE));
    }
}
