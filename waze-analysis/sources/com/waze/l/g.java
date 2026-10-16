package com.waze.l;

import com.waze.main_screen.t.al;
import com.waze.ui.af.ap;
import com.waze.ui.m.ad;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements com.waze.z.a.c.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25085a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25086b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f25087c;

    public /* synthetic */ g(Object obj, Object obj2, int i2) {
        this.f25087c = i2;
        this.f25085a = obj;
        this.f25086b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v34, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v39, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25087c) {
            case 0:
                ?? r0 = this.f25086b;
                return m.q(this.f25085a, r0, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 1:
                ?? r02 = this.f25086b;
                return m.q(this.f25085a, r02, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 2:
                ?? r03 = this.f25086b;
                return m.q(this.f25085a, r03, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 3:
                com.waze.z.a.c.c cVar = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar = (com.waze.z.a.c.d) obj2;
                x.f(cVar, "actions");
                x.f(dVar, "cta");
                boolean z = cVar instanceof com.waze.z.a.c.a;
                ?? r1 = this.f25086b;
                if (z) {
                    if (x.n(dVar, ((com.waze.z.a.c.a) cVar).a())) {
                        this.f25085a.invoke();
                    } else {
                        r1.invoke();
                    }
                } else {
                    if (!(cVar instanceof com.waze.z.a.c.b)) {
                        throw new h.i();
                    }
                    r1.invoke();
                }
                return ab.f48028a;
            case 4:
                com.waze.z.a.c.c cVar2 = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar2 = (com.waze.z.a.c.d) obj2;
                x.f(cVar2, "dialogActions");
                x.f(dVar2, "cta");
                if (x.n(((com.waze.z.a.c.a) cVar2).a(), dVar2)) {
                    this.f25085a.invoke();
                } else {
                    this.f25086b.invoke();
                }
                return ab.f48028a;
            case 5:
                com.waze.z.a.c.c cVar3 = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar3 = (com.waze.z.a.c.d) obj2;
                int i2 = al.f27484a;
                x.f(cVar3, "dialogActions");
                x.f(dVar3, "dialogCta");
                boolean zN = x.n(((com.waze.z.a.c.a) cVar3).a(), dVar3);
                Object obj3 = this.f25086b;
                if (zN) {
                    Object obj4 = this.f25085a;
                    ((com.waze.ao.b.f) obj3).c();
                    com.waze.bs.a.f(((com.waze.ao.b.b) obj4).c(), "INSIGHT_FEEDBACK", false);
                } else {
                    ((com.waze.ao.b.f) obj3).d();
                }
                return ab.f48028a;
            case 6:
                ?? r04 = this.f25086b;
                return a.a.o(this.f25085a, r04, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 7:
                com.waze.z.a.c.c cVar4 = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar4 = (com.waze.z.a.c.d) obj2;
                x.f(cVar4, "actions");
                x.f(dVar4, "cta");
                com.waze.z.a.c.a aVar = (com.waze.z.a.c.a) cVar4;
                if (x.n(dVar4, aVar.a())) {
                    a.a.t(this.f25085a).invoke();
                } else if (x.n(dVar4, aVar.b())) {
                    a.a.t(this.f25086b).invoke();
                }
                return ab.f48028a;
            case 8:
                ?? r05 = this.f25086b;
                return a.a.o(this.f25085a, r05, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 9:
                com.waze.z.a.c.c cVar5 = (com.waze.z.a.c.c) obj;
                com.waze.z.a.c.d dVar5 = (com.waze.z.a.c.d) obj2;
                x.f(cVar5, "dialogActions");
                x.f(dVar5, "dialogCta");
                boolean zN2 = x.n(((com.waze.z.a.c.a) cVar5).a(), dVar5);
                Object obj5 = this.f25086b;
                if (zN2) {
                    ((ad) obj5).f().invoke(a.a.i(this.f25085a));
                } else {
                    ((ad) obj5).c().invoke();
                }
                return ab.f48028a;
            case 10:
                ?? r06 = this.f25086b;
                return a.a.o(this.f25085a, r06, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 11:
                com.waze.z.a.c.d dVar6 = (com.waze.z.a.c.d) obj2;
                x.f((com.waze.z.a.c.c) obj, "<unused var>");
                x.f(dVar6, "cta");
                if (x.n(dVar6, this.f25085a)) {
                    this.f25086b.invoke();
                }
                return ab.f48028a;
            case 12:
                ?? r07 = this.f25086b;
                return a.a.o(this.f25085a, r07, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            case 13:
                ?? r08 = this.f25086b;
                return ap.L(this.f25085a, r08, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
            default:
                ?? r09 = this.f25086b;
                return ap.L(this.f25085a, r09, (com.waze.z.a.c.c) obj, (com.waze.z.a.c.d) obj2);
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f25087c = i2;
        this.f25086b = obj;
        this.f25085a = obj2;
    }
}
