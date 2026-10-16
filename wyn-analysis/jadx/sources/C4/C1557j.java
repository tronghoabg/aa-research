package c4;

import android.content.Context;
import i4.C2849f;
import java.util.ArrayList;

/* renamed from: c4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1557j {

    /* renamed from: a, reason: collision with root package name */
    public final h4.h f19647a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f19648b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19649c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.h f19650d;

    /* renamed from: e, reason: collision with root package name */
    public final C2849f f19651e;

    /* renamed from: f, reason: collision with root package name */
    public final X3.c f19652f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19653g;

    public C1557j(h4.h hVar, ArrayList arrayList, int i5, h4.h hVar2, C2849f c2849f, X3.c cVar, boolean z2) {
        this.f19647a = hVar;
        this.f19648b = arrayList;
        this.f19649c = i5;
        this.f19650d = hVar2;
        this.f19651e = c2849f;
        this.f19652f = cVar;
        this.f19653g = z2;
    }

    public final void a(h4.h hVar, C1555h c1555h) {
        Context context = hVar.f36092a;
        h4.h hVar2 = this.f19647a;
        if (context != hVar2.f36092a) {
            throw new IllegalStateException(("Interceptor '" + c1555h + "' cannot modify the request's context.").toString());
        }
        if (hVar.f36093b == h4.j.f36117a) {
            throw new IllegalStateException(("Interceptor '" + c1555h + "' cannot set the request's data to null.").toString());
        }
        if (hVar.f36094c != hVar2.f36094c) {
            throw new IllegalStateException(("Interceptor '" + c1555h + "' cannot modify the request's target.").toString());
        }
        if (hVar.f36107q != hVar2.f36107q) {
            throw new IllegalStateException(("Interceptor '" + c1555h + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.f36108r == hVar2.f36108r) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c1555h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h4.h r13, lf.AbstractC3464c r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof c4.C1556i
            if (r0 == 0) goto L13
            r0 = r14
            c4.i r0 = (c4.C1556i) r0
            int r1 = r0.f19646e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19646e = r1
            goto L18
        L13:
            c4.i r0 = new c4.i
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f19644c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f19646e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            c4.h r13 = r0.f19643b
            c4.j r0 = r0.f19642a
            Fe.e.U(r14)
            goto L6c
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            Fe.e.U(r14)
            java.util.ArrayList r6 = r12.f19648b
            int r14 = r12.f19649c
            if (r14 <= 0) goto L47
            int r2 = r14 + (-1)
            java.lang.Object r2 = r6.get(r2)
            c4.h r2 = (c4.C1555h) r2
            r12.a(r13, r2)
        L47:
            java.lang.Object r2 = r6.get(r14)
            c4.h r2 = (c4.C1555h) r2
            int r7 = r14 + 1
            c4.j r4 = new c4.j
            h4.h r5 = r12.f19647a
            X3.c r10 = r12.f19652f
            i4.f r9 = r12.f19651e
            boolean r11 = r12.f19653g
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f19642a = r12
            r0.f19643b = r2
            r0.f19646e = r3
            java.lang.Object r14 = r2.d(r4, r0)
            if (r14 != r1) goto L6a
            return r1
        L6a:
            r0 = r12
            r13 = r2
        L6c:
            h4.i r14 = (h4.i) r14
            h4.h r1 = r14.a()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.C1557j.b(h4.h, lf.c):java.lang.Object");
    }
}
