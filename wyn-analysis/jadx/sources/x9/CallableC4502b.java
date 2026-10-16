package x9;

import android.util.Base64OutputStream;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: x9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class CallableC4502b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4503c f47863b;

    public /* synthetic */ CallableC4502b(C4503c c4503c, int i5) {
        this.f47862a = i5;
        this.f47863b = c4503c;
    }

    private final Object a() {
        String string;
        C4503c c4503c = this.f47863b;
        synchronized (c4503c) {
            try {
                g gVar = (g) c4503c.f47864a.get();
                ArrayList arrayListC = gVar.c();
                gVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i5 = 0; i5 < arrayListC.size(); i5++) {
                    C4501a c4501a = (C4501a) arrayListC.get(i5);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", c4501a.f47860a);
                    jSONObject.put("dates", new JSONArray((Collection) c4501a.f47861b));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f47862a) {
            case 0:
                return a();
            default:
                C4503c c4503c = this.f47863b;
                synchronized (c4503c) {
                    ((g) c4503c.f47864a.get()).k(System.currentTimeMillis(), ((Y9.b) c4503c.f47866c.get()).a());
                }
                return null;
        }
    }
}
