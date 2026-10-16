package ga;

import Ef.E;
import ef.C2515C;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.json.JSONObject;
import tf.p;

/* renamed from: ga.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2719e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f35792a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G9.e f35793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f35794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2716b f35795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2717c f35796e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2719e(G9.e eVar, Map map, C2716b c2716b, C2717c c2717c, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35793b = eVar;
        this.f35794c = map;
        this.f35795d = c2716b;
        this.f35796e = c2717c;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2719e(this.f35793b, this.f35794c, this.f35795d, this.f35796e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2719e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws IOException {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35792a;
        C2717c c2717c = this.f35796e;
        C2515C c2515c = C2515C.f34653a;
        try {
        } catch (Exception e7) {
            String message = e7.getMessage();
            if (message == null) {
                message = e7.toString();
            }
            this.f35792a = 3;
            c2717c.invoke(message, this);
            if (c2515c == aVar) {
            }
        }
        if (i5 == 0) {
            Fe.e.U(obj);
            URLConnection uRLConnectionOpenConnection = G9.e.r(this.f35793b).openConnection();
            AbstractC3340k.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept", "application/json");
            for (Map.Entry entry : this.f35794c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                }
                bufferedReader.close();
                inputStream.close();
                JSONObject jSONObject = new JSONObject(sb2.toString());
                C2716b c2716b = this.f35795d;
                this.f35792a = 1;
                if (c2716b.invoke(jSONObject, this) == aVar) {
                    return aVar;
                }
            } else {
                this.f35792a = 2;
                c2717c.invoke("Bad response code: " + responseCode, this);
                if (c2515c == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i5 != 1 && i5 != 2 && i5 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return c2515c;
    }
}
