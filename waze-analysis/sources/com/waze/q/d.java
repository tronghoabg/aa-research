package com.waze.q;

import com.waze.R;
import h.ab;
import h.g.a.s;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.g implements s {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33457a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f33458b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f33459c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ boolean f33460d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f33461e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.o.a f33462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(com.waze.shared_infra.i.e eVar, com.waze.shared_infra.o.a aVar, h.c.e eVar2) {
        super(5, eVar2);
        this.f33461e = eVar;
        this.f33462f = aVar;
    }

    @Override // h.g.a.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        d dVar = new d(this.f33461e, this.f33462f, (h.c.e) obj5);
        dVar.f33457a = (String) obj;
        dVar.f33458b = (String) obj2;
        dVar.f33459c = zBooleanValue;
        dVar.f33460d = zBooleanValue2;
        return dVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String str = (String) this.f33457a;
        String str2 = (String) this.f33458b;
        boolean z = this.f33459c;
        boolean z2 = this.f33460d;
        if (!z) {
            this.f33461e.a("not checking requirements before the user is logged in");
            return null;
        }
        if (!z2) {
            this.f33461e.a("not checking requirements before lang file is loaded");
            return null;
        }
        boolean z3 = false;
        String str3 = str;
        boolean zF = o.F(this.f33462f.c(R.string.CONSENT_BUMP_MOBILE_BODY_HTML, new Object[0]), str3, false);
        if (str3.length() > 0 && !x.n(str2, str) && zF) {
            z3 = true;
        }
        this.f33461e.a("requiredId=" + str + ", acceptedId=" + str2 + ", copyContainsId=" + zF + ", result=" + z3);
        return Boolean.valueOf(z3);
    }
}
