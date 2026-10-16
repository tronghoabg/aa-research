package zg;

import A7.AbstractC0279p0;
import cg.C1618g;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import u0.w0;

/* renamed from: zg.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4683w implements InterfaceC4664c {

    /* renamed from: a, reason: collision with root package name */
    public final P f48647a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f48648b;

    /* renamed from: c, reason: collision with root package name */
    public final Call.Factory f48649c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4671j f48650d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f48651e;

    /* renamed from: f, reason: collision with root package name */
    public Call f48652f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f48653g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48654h;

    public C4683w(P p10, Object[] objArr, Call.Factory factory, InterfaceC4671j interfaceC4671j) {
        this.f48647a = p10;
        this.f48648b = objArr;
        this.f48649c = factory;
        this.f48650d = interfaceC4671j;
    }

    public final Call a() {
        HttpUrl httpUrlA;
        P p10 = this.f48647a;
        Object[] objArr = this.f48648b;
        int length = objArr.length;
        a0[] a0VarArr = p10.f48594j;
        if (length != a0VarArr.length) {
            throw new IllegalArgumentException(AbstractC0279p0.j(a0VarArr.length, ")", pd.f.l(length, "Argument count (", ") doesn't match expected count (")));
        }
        N n10 = new N(p10.f48587c, p10.f48586b, p10.f48588d, p10.f48589e, p10.f48590f, p10.f48591g, p10.f48592h, p10.f48593i);
        if (p10.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(objArr[i5]);
            a0VarArr[i5].a(n10, objArr[i5]);
        }
        HttpUrl.Builder builder = n10.f48554d;
        if (builder != null) {
            httpUrlA = builder.a();
        } else {
            String link = n10.f48553c;
            HttpUrl httpUrl = n10.f48552b;
            httpUrl.getClass();
            AbstractC3340k.e(link, "link");
            HttpUrl.Builder builderG = httpUrl.g(link);
            httpUrlA = builderG == null ? null : builderG.a();
            if (httpUrlA == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + n10.f48553c);
            }
        }
        RequestBody m10 = n10.k;
        if (m10 == null) {
            FormBody.Builder builder2 = n10.f48560j;
            if (builder2 != null) {
                m10 = new FormBody(builder2.f42259a, builder2.f42260b);
            } else {
                MultipartBody.Builder builder3 = n10.f48559i;
                if (builder3 != null) {
                    ArrayList arrayList2 = builder3.f42308c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    m10 = new MultipartBody(builder3.f42306a, builder3.f42307b, Util.x(arrayList2));
                } else if (n10.f48558h) {
                    m10 = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = n10.f48557g;
        Headers.Builder builder4 = n10.f48556f;
        if (mediaType != null) {
            if (m10 != null) {
                m10 = new M(m10, mediaType);
            } else {
                builder4.a("Content-Type", mediaType.f42295a);
            }
        }
        Request.Builder builder5 = n10.f48555e;
        builder5.getClass();
        builder5.f42382a = httpUrlA;
        builder5.e(builder4.d());
        builder5.f(n10.f48551a, m10);
        builder5.g(r.class, new r(p10.f48585a, arrayList));
        return this.f48649c.a(builder5.b());
    }

    public final Call b() throws IOException {
        Call call = this.f48652f;
        if (call != null) {
            return call;
        }
        Throwable th = this.f48653g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callA = a();
            this.f48652f = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e7) {
            a0.o(e7);
            this.f48653g = e7;
            throw e7;
        }
    }

    public final Q c(Response response) throws IOException {
        Response.Builder builderH = response.h();
        ResponseBody responseBody = response.f42401g;
        builderH.f42414g = new C4682v(responseBody.getF42424d(), responseBody.getF42425e());
        Response responseA = builderH.a();
        int i5 = responseA.f42398d;
        if (i5 < 200 || i5 >= 300) {
            try {
                C1618g c1618g = new C1618g();
                responseBody.getF42426f().F(c1618g);
                ResponseBody responseBodyCreate = ResponseBody.create(responseBody.getF42424d(), responseBody.getF42425e(), c1618g);
                Objects.requireNonNull(responseBodyCreate, "body == null");
                if (responseA.d()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new Q(responseA, null, responseBodyCreate);
            } finally {
                responseBody.close();
            }
        }
        if (i5 == 204 || i5 == 205) {
            responseBody.close();
            if (responseA.d()) {
                return new Q(responseA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        C4681u c4681u = new C4681u(responseBody);
        try {
            Object objConvert = this.f48650d.convert(c4681u);
            if (responseA.d()) {
                return new Q(responseA, objConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e7) {
            IOException iOException = c4681u.f48644f;
            if (iOException == null) {
                throw e7;
            }
            throw iOException;
        }
    }

    @Override // zg.InterfaceC4664c
    public final void cancel() {
        Call call;
        this.f48651e = true;
        synchronized (this) {
            call = this.f48652f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new C4683w(this.f48647a, this.f48648b, this.f48649c, this.f48650d);
    }

    @Override // zg.InterfaceC4664c
    public final void i(InterfaceC4667f interfaceC4667f) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.f48654h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f48654h = true;
                call = this.f48652f;
                th = this.f48653g;
                if (call == null && th == null) {
                    try {
                        Call callA = a();
                        this.f48652f = callA;
                        call = callA;
                    } catch (Throwable th2) {
                        th = th2;
                        a0.o(th);
                        this.f48653g = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            interfaceC4667f.onFailure(this, th);
            return;
        }
        if (this.f48651e) {
            call.cancel();
        }
        call.B(new w0(this, interfaceC4667f));
    }

    @Override // zg.InterfaceC4664c
    public final boolean isCanceled() {
        boolean z2 = true;
        if (this.f48651e) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f48652f;
                if (call == null || !call.getF42590o()) {
                    z2 = false;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // zg.InterfaceC4664c
    public final synchronized Request request() {
        try {
        } catch (IOException e7) {
            throw new RuntimeException("Unable to create request.", e7);
        }
        return b().getF42578b();
    }

    @Override // zg.InterfaceC4664c
    public final InterfaceC4664c clone() {
        return new C4683w(this.f48647a, this.f48648b, this.f48649c, this.f48650d);
    }
}
