package xe;

import A7.AbstractC0279p0;
import Ba.c;
import Ef.E;
import Fe.e;
import androidx.fragment.app.X;
import be.EnumC1525a;
import be.b;
import com.moloco.sdk.internal.publisher.nativead.model.g;
import ef.C2515C;
import ff.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;
import v6.l;
import ve.C4343a;
import ve.EnumC4344b;

/* renamed from: xe.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4512a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f47894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f47895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4512a(l lVar, g gVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f47894a = lVar;
        this.f47895b = gVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C4512a(this.f47894a, this.f47895b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4512a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.Map] */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objJ;
        kf.a aVar = kf.a.f39711a;
        e.U(obj);
        g gVar = this.f47895b;
        String str = gVar.f29186a;
        l lVar = this.f47894a;
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC3340k.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                EnumC4344b[] enumC4344bArr = EnumC4344b.f47239a;
                httpURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : gVar.f29187b.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.addRequestProperty("Content-Type", "application/json");
                httpURLConnection.addRequestProperty("Accept", "application/json");
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                if (500 > responseCode || responseCode >= 600) {
                    AbstractC3340k.b(errorStream);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "utf-8"));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                int length = line.length() - 1;
                                int i5 = 0;
                                boolean z2 = false;
                                while (i5 <= length) {
                                    boolean z10 = AbstractC3340k.g(line.charAt(!z2 ? i5 : length), 32) <= 0;
                                    if (z2) {
                                        if (!z10) {
                                            break;
                                        }
                                        length--;
                                    } else if (z10) {
                                        i5++;
                                    } else {
                                        z2 = true;
                                    }
                                }
                                sb2.append(line.subSequence(i5, length + 1).toString());
                            } catch (IOException e7) {
                                throw new b(EnumC1525a.f19461d, "Failed to read response", e7);
                            }
                        }
                        String string = sb2.toString();
                        AbstractC3340k.d(string, "toString(...)");
                        bufferedReader.close();
                        ((X) lVar.f46890a).getClass();
                        objJ = X.j(string);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            c.n(bufferedReader, th);
                            throw th2;
                        }
                    }
                } else {
                    objJ = w.f35433a;
                }
                return new C4343a(responseCode, objJ);
            } catch (Exception e10) {
                if ((e10 instanceof IOException) || (e10 instanceof ClassCastException) || (e10 instanceof NullPointerException)) {
                    throw new b(EnumC1525a.f19461d, "Connection opening failed", e10);
                }
                throw e10;
            }
        } catch (MalformedURLException e11) {
            throw new b(EnumC1525a.f19460c, AbstractC0279p0.l("Wrong url - \"", str, "\""), e11);
        }
    }
}
