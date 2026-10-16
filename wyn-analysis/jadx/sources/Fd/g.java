package Fd;

import Jd.o;
import Jd.u;
import Jd.v;
import io.ktor.utils.io.InterfaceC2886t;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final v f4070a;

    /* renamed from: b, reason: collision with root package name */
    public final Qd.d f4071b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4072c;

    /* renamed from: d, reason: collision with root package name */
    public final u f4073d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2886t f4074e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC3108h f4075f;

    /* renamed from: g, reason: collision with root package name */
    public final Qd.d f4076g;

    public g(v vVar, Qd.d requestTime, o oVar, u version, InterfaceC2886t body, InterfaceC3108h callContext) {
        AbstractC3340k.e(requestTime, "requestTime");
        AbstractC3340k.e(version, "version");
        AbstractC3340k.e(body, "body");
        AbstractC3340k.e(callContext, "callContext");
        this.f4070a = vVar;
        this.f4071b = requestTime;
        this.f4072c = oVar;
        this.f4073d = version;
        this.f4074e = body;
        this.f4075f = callContext;
        this.f4076g = Qd.a.a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f4070a + ')';
    }
}
