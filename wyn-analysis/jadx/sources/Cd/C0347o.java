package Cd;

import Jd.AbstractC0669c;
import Jd.C0672f;
import io.ktor.utils.io.InterfaceC2886t;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.metadata.HttpHeaders;

/* renamed from: Cd.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0347o extends Md.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2145a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2146b;

    /* renamed from: c, reason: collision with root package name */
    public final C0672f f2147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2148d;

    public C0347o(Fd.c cVar, C0672f c0672f, Object obj) {
        this.f2148d = obj;
        Jd.n nVar = cVar.f4047c;
        List list = Jd.p.f6064a;
        String strE = nVar.E(HttpHeaders.CONTENT_LENGTH);
        this.f2146b = strE != null ? Long.valueOf(Long.parseLong(strE)) : null;
        if (c0672f == null) {
            C0672f c0672f2 = AbstractC0669c.f6047a;
            c0672f = AbstractC0669c.f6047a;
        }
        this.f2147c = c0672f;
    }

    @Override // Md.c
    public final Long a() {
        switch (this.f2145a) {
        }
        return this.f2146b;
    }

    @Override // Md.c
    public final C0672f b() {
        switch (this.f2145a) {
        }
        return this.f2147c;
    }

    public final InterfaceC2886t d() {
        Object obj = this.f2148d;
        switch (this.f2145a) {
            case 0:
                return (InterfaceC2886t) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                Lf.e eVar = Ef.S.f3698a;
                Lf.d context = Lf.d.f7120b;
                Kd.e pool = Wd.a.f15458a;
                AbstractC3340k.e(inputStream, "<this>");
                AbstractC3340k.e(context, "context");
                AbstractC3340k.e(pool, "pool");
                return new Vd.d(new Pf.b(inputStream), context);
        }
    }

    public C0347o(Rd.e eVar, C0672f c0672f, Object obj) {
        this.f2148d = obj;
        Jd.n nVar = ((Fd.c) eVar.f10601a).f4047c;
        List list = Jd.p.f6064a;
        String strE = nVar.E(HttpHeaders.CONTENT_LENGTH);
        this.f2146b = strE != null ? Long.valueOf(Long.parseLong(strE)) : null;
        if (c0672f == null) {
            C0672f c0672f2 = AbstractC0669c.f6047a;
            c0672f = AbstractC0669c.f6047a;
        }
        this.f2147c = c0672f;
    }
}
