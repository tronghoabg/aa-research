package H6;

import A.C0230x;
import android.util.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f4949c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f4950d = false;

    /* renamed from: a, reason: collision with root package name */
    public final List f4952a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4948b = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final HashSet f4951e = new HashSet(Arrays.asList(new String[0]));

    public i() {
        this.f4952a = !c() ? new ArrayList() : Arrays.asList("network_request_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public static boolean c() {
        boolean z2;
        synchronized (f4948b) {
            try {
                z2 = false;
                if (f4949c && f4950d) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    public static void d(JsonWriter jsonWriter, Map map) {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (!f4951e.contains(str)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        l.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                    jsonWriter.name(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str2 : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name(MediationMetaData.KEY_NAME).value(str);
                        jsonWriter.name(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR).value(str2);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        if (c()) {
            e("onNetworkRequest", new S3.n(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    public final void b(HttpURLConnection httpURLConnection, int i5) throws IOException {
        if (c()) {
            String responseMessage = null;
            e("onNetworkResponse", new C0230x(i5, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), 3));
            if (i5 < 200 || i5 >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e7) {
                    l.f("Can not get error message from error HttpURLConnection\n".concat(String.valueOf(e7.getMessage())));
                }
                e("onNetworkRequestError", new g(responseMessage, 0));
            }
        }
    }

    public final void e(String str, h hVar) throws IOException {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator it = this.f4952a.iterator();
            while (it.hasNext()) {
                jsonWriter.value((String) it.next());
            }
            jsonWriter.endArray();
            hVar.o(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e7) {
            l.d("unable to log", e7);
        }
        String string = stringWriter.toString();
        synchronized (i.class) {
            try {
                l.e("GMA Debug BEGIN");
                int i5 = 0;
                while (i5 < string.length()) {
                    int i10 = i5 + 4000;
                    l.e("GMA Debug CONTENT ".concat(String.valueOf(string.substring(i5, Math.min(i10, string.length())))));
                    i5 = i10;
                }
                l.e("GMA Debug FINISH");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
