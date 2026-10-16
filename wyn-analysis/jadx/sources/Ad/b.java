package Ad;

import Bf.k;
import Jd.n;
import Jd.o;
import Jd.u;
import Jd.v;
import android.os.Build;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.services.F;
import com.moloco.sdk.internal.services.w;
import com.moloco.sdk.publisher.MediationInfo;
import ef.C2515C;
import ff.AbstractC2641B;
import io.ktor.utils.io.C2885s;
import io.ktor.utils.io.InterfaceC2886t;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import tf.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1260a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1263d;

    public /* synthetic */ b(com.moloco.sdk.internal.services.init.f fVar, F f10, MediationInfo mediationInfo, w wVar) {
        this.f1261b = f10;
        this.f1262c = mediationInfo;
        this.f1263d = wVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) throws IOException {
        v vVar;
        BufferedInputStream bufferedInputStream;
        InterfaceC2886t dVar;
        InputStream inputStream;
        String lowerCase;
        Object obj2 = this.f1263d;
        Object obj3 = this.f1262c;
        Object obj4 = this.f1261b;
        switch (this.f1260a) {
            case 0:
                HttpURLConnection current = (HttpURLConnection) obj;
                AbstractC3340k.e(current, "current");
                int responseCode = current.getResponseCode();
                String responseMessage = current.getResponseMessage();
                if (responseMessage != null) {
                    vVar = new v(responseCode, responseMessage);
                } else {
                    v vVar2 = (v) v.f6088p.get(Integer.valueOf(responseCode));
                    if (vVar2 == null) {
                        vVar2 = new v(responseCode, "Unknown Status Code");
                    }
                    vVar = vVar2;
                }
                v vVar3 = vVar;
                InterfaceC3108h callContext = (InterfaceC3108h) obj4;
                AbstractC3340k.e(callContext, "callContext");
                if (AbstractC3935e.D(Integer.valueOf(v.f6081h.f6089a), Integer.valueOf(v.f6077d.f6089a)).contains(Integer.valueOf(responseCode))) {
                    InterfaceC2886t.f37437a.getClass();
                    dVar = C2885s.f37436b;
                } else {
                    BufferedInputStream bufferedInputStream2 = null;
                    try {
                        inputStream = current.getInputStream();
                    } catch (IOException unused) {
                        InputStream errorStream = current.getErrorStream();
                        if (errorStream != null) {
                            if (errorStream instanceof BufferedInputStream) {
                                bufferedInputStream = (BufferedInputStream) errorStream;
                            } else {
                                bufferedInputStream2 = new BufferedInputStream(errorStream, Segment.SIZE);
                            }
                        }
                    }
                    if (inputStream != null) {
                        if (inputStream instanceof BufferedInputStream) {
                            bufferedInputStream = (BufferedInputStream) inputStream;
                            bufferedInputStream2 = bufferedInputStream;
                        } else {
                            bufferedInputStream2 = new BufferedInputStream(inputStream, Segment.SIZE);
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        Wd.b pool = Od.a.f8958a;
                        AbstractC3340k.e(pool, "pool");
                        dVar = new Vd.d(new Pf.b(bufferedInputStream2), callContext);
                    } else {
                        InterfaceC2886t.f37437a.getClass();
                        dVar = C2885s.f37436b;
                    }
                }
                InterfaceC2886t interfaceC2886t = dVar;
                Map<String, List<String>> headerFields = current.getHeaderFields();
                AbstractC3340k.d(headerFields, "getHeaderFields(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2641B.D(headerFields.size()));
                Iterator<T> it = headerFields.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Locale locale = Locale.getDefault();
                        AbstractC3340k.d(locale, "getDefault(...)");
                        lowerCase = str.toLowerCase(locale);
                        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = "";
                    }
                    linkedHashMap.put(lowerCase, entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!k.y0((CharSequence) entry2.getKey())) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                o oVar = new o(linkedHashMap2);
                if (((Fd.d) obj3).f4056f.d(Fd.e.f4058a) == null) {
                    return new Fd.g(vVar3, (Qd.d) obj2, oVar, u.f6072d, interfaceC2886t, callContext);
                }
                throw new ClassCastException();
            default:
                n headers = (n) obj;
                AbstractC3340k.e(headers, "$this$headers");
                ((F) obj4).getClass();
                String str2 = Build.VERSION.RELEASE;
                AbstractC2641B.d(headers, (MediationInfo) obj3);
                String str3 = ((w) obj2).f29734a;
                if (str3.equals("com.example.demo2")) {
                    str3 = "com.trickytribe.penetrator";
                }
                headers.z("X-Moloco-App-Bundle", str3);
                return C2515C.f34653a;
        }
    }

    public /* synthetic */ b(InterfaceC3108h interfaceC3108h, Fd.d dVar, Md.c cVar, Qd.d dVar2) {
        this.f1261b = interfaceC3108h;
        this.f1262c = dVar;
        this.f1263d = dVar2;
    }
}
