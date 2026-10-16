package Fd;

import Ef.I0;
import Jd.H;
import Jd.o;
import Jd.s;
import ff.x;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final H f4051a;

    /* renamed from: b, reason: collision with root package name */
    public final s f4052b;

    /* renamed from: c, reason: collision with root package name */
    public final o f4053c;

    /* renamed from: d, reason: collision with root package name */
    public final Md.c f4054d;

    /* renamed from: e, reason: collision with root package name */
    public final I0 f4055e;

    /* renamed from: f, reason: collision with root package name */
    public final Nd.d f4056f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f4057g;

    public d(H h10, s method, o oVar, Md.c cVar, I0 executionContext, Nd.d attributes) {
        Set setKeySet;
        AbstractC3340k.e(method, "method");
        AbstractC3340k.e(executionContext, "executionContext");
        AbstractC3340k.e(attributes, "attributes");
        this.f4051a = h10;
        this.f4052b = method;
        this.f4053c = oVar;
        this.f4054d = cVar;
        this.f4055e = executionContext;
        this.f4056f = attributes;
        Map map = (Map) attributes.d(zd.g.f48487a);
        this.f4057g = (map == null || (setKeySet = map.keySet()) == null) ? x.f35434a : setKeySet;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f4051a + ", method=" + this.f4052b + ')';
    }
}
