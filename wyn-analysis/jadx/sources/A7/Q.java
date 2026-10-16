package A7;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.measurement.zzfy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Q extends G1 {
    public static byte[] l0(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            while (true) {
                int i5 = inputStream.read(bArr);
                if (i5 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i5);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final void k0(String str, M1 m12, zzfy.zzj zzjVar, T t10) throws MalformedURLException {
        String str2;
        URL url;
        byte[] bArrZzca;
        C0264k0 c0264k0Zzl;
        Map map;
        c0();
        h0();
        try {
            url = new URI(m12.f599a).toURL();
            e0();
            bArrZzca = zzjVar.zzca();
            c0264k0Zzl = zzl();
            map = m12.f600b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            c0264k0Zzl.k0(new U(this, str2, url, bArrZzca, map, t10));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            N nZzj = zzj();
            nZzj.f605f.b(N.h0(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", m12.f599a);
        }
    }

    public final boolean m0() {
        h0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C0273n0) this.f421a).f973a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
