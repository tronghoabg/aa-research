package com.google.android.gms.common.api;

import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class x extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26565a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26566b;

    public x(d7.d dVar) {
        this.f26566b = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f26565a) {
            case 0:
                return "Missing ".concat(String.valueOf((d7.d) this.f26566b));
            default:
                return (String) this.f26566b;
        }
    }

    public x(Gd.a aVar, KClass from, KClass to) {
        AbstractC3340k.e(from, "from");
        AbstractC3340k.e(to, "to");
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(to);
        sb2.append("' but was '");
        sb2.append(from);
        sb2.append("'\n        In response from `");
        sb2.append(gc.b.u(aVar).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(aVar.e());
        sb2.append("`\n        Response header `ContentType: ");
        Jd.m mVarA = aVar.a();
        List list = Jd.p.f6064a;
        sb2.append(mVarA.get("Content-Type"));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(gc.b.u(aVar).a().get("Accept"));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f26566b = Bf.l.V(sb2.toString());
    }
}
