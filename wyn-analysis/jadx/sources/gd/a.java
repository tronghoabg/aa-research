package Gd;

import Ef.E;
import Jd.m;
import Jd.o;
import Jd.q;
import Jd.u;
import Jd.v;
import io.ktor.utils.io.C2885s;
import io.ktor.utils.io.InterfaceC2886t;
import io.ktor.utils.io.N;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import xd.C4511c;

/* loaded from: classes5.dex */
public final class a implements q, E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4703a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final v f4704b;

    /* renamed from: c, reason: collision with root package name */
    public final u f4705c;

    /* renamed from: d, reason: collision with root package name */
    public final Qd.d f4706d;

    /* renamed from: e, reason: collision with root package name */
    public final Qd.d f4707e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3108h f4708f;

    /* renamed from: g, reason: collision with root package name */
    public final C4511c f4709g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4710h;

    /* renamed from: i, reason: collision with root package name */
    public final m f4711i;

    public a(C4511c c4511c, Fd.g gVar) {
        this.f4709g = c4511c;
        this.f4708f = gVar.f4075f;
        this.f4704b = gVar.f4070a;
        this.f4705c = gVar.f4073d;
        this.f4706d = gVar.f4071b;
        this.f4707e = gVar.f4076g;
        InterfaceC2886t interfaceC2886t = gVar.f4074e;
        interfaceC2886t = interfaceC2886t instanceof InterfaceC2886t ? interfaceC2886t : null;
        if (interfaceC2886t == null) {
            InterfaceC2886t.f37437a.getClass();
            interfaceC2886t = C2885s.f37436b;
        }
        this.f4710h = interfaceC2886t;
        this.f4711i = gVar.f4072c;
    }

    @Override // Jd.q
    public final m a() {
        switch (this.f4703a) {
            case 0:
                return (o) this.f4711i;
            default:
                return this.f4711i;
        }
    }

    public final C4511c c() {
        switch (this.f4703a) {
            case 0:
                return this.f4709g;
            default:
                return (xd.e) this.f4709g;
        }
    }

    public final InterfaceC2886t d() {
        switch (this.f4703a) {
            case 0:
                return (InterfaceC2886t) this.f4710h;
            default:
                return N.a((byte[]) this.f4710h);
        }
    }

    public final v e() {
        switch (this.f4703a) {
        }
        return this.f4704b;
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        switch (this.f4703a) {
        }
        return this.f4708f;
    }

    public final String toString() {
        return "HttpResponse[" + gc.b.u(this).getUrl() + ", " + e() + ']';
    }

    public a(xd.e call, byte[] bArr, a aVar) {
        u uVar;
        Qd.d dVar;
        Qd.d dVar2;
        AbstractC3340k.e(call, "call");
        this.f4709g = call;
        this.f4710h = bArr;
        this.f4704b = aVar.e();
        switch (aVar.f4703a) {
            case 0:
                uVar = aVar.f4705c;
                break;
            default:
                uVar = aVar.f4705c;
                break;
        }
        this.f4705c = uVar;
        switch (aVar.f4703a) {
            case 0:
                dVar = aVar.f4706d;
                break;
            default:
                dVar = aVar.f4706d;
                break;
        }
        this.f4706d = dVar;
        switch (aVar.f4703a) {
            case 0:
                dVar2 = aVar.f4707e;
                break;
            default:
                dVar2 = aVar.f4707e;
                break;
        }
        this.f4707e = dVar2;
        this.f4711i = aVar.a();
        this.f4708f = aVar.getCoroutineContext();
    }
}
