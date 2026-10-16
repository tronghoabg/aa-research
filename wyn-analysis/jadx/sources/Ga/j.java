package ga;

import W9.p;
import ac.C1346a;
import android.content.Context;
import android.os.Bundle;
import ea.AbstractC2505u;
import ea.C2483G;
import ea.C2487b;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import u1.InterfaceC4220i;
import w1.C4351b;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final h f35808c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final C4351b f35809d = tg.b.M(AbstractC2505u.f34585b, new C1346a(g.f35802i), 12);

    /* renamed from: a, reason: collision with root package name */
    public final p f35810a;

    /* renamed from: b, reason: collision with root package name */
    public final C2718d f35811b;

    public j(s8.g gVar, InterfaceC3108h interfaceC3108h, InterfaceC3108h interfaceC3108h2, P9.d dVar) {
        gVar.a();
        Context context = gVar.f45328a;
        AbstractC3340k.d(context, "firebaseApp.applicationContext");
        C2483G c2483g = C2483G.f34460a;
        C2487b c2487bA = C2483G.a(gVar);
        p pVar = new p(context);
        G9.e eVar = new G9.e(c2487bA, interfaceC3108h);
        f35808c.getClass();
        C2718d c2718d = new C2718d(interfaceC3108h2, dVar, c2487bA, eVar, (InterfaceC4220i) f35809d.getValue(context, h.f35803a[0]));
        this.f35810a = pVar;
        this.f35811b = c2718d;
    }

    public final double a() {
        Bundle bundle = this.f35810a.f15362a;
        Double dValueOf = bundle.containsKey("firebase_sessions_sampling_rate") ? Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate")) : null;
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        f fVar = this.f35811b.b().f35828b;
        if (fVar == null) {
            AbstractC3340k.m("sessionConfigs");
            throw null;
        }
        Double d3 = fVar.f35798b;
        if (d3 != null) {
            double dDoubleValue2 = d3.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lf.AbstractC3464c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ga.i
            if (r0 == 0) goto L13
            r0 = r7
            ga.i r0 = (ga.i) r0
            int r1 = r0.f35807d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35807d = r1
            goto L18
        L13:
            ga.i r0 = new ga.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f35805b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f35807d
            ef.C r3 = ef.C2515C.f34653a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            Fe.e.U(r7)
            goto L58
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            ga.j r2 = r0.f35804a
            Fe.e.U(r7)
            goto L4a
        L3a:
            Fe.e.U(r7)
            r0.f35804a = r6
            r0.f35807d = r5
            W9.p r7 = r6.f35810a
            r7.getClass()
            if (r3 != r1) goto L49
            goto L57
        L49:
            r2 = r6
        L4a:
            ga.d r7 = r2.f35811b
            r2 = 0
            r0.f35804a = r2
            r0.f35807d = r4
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.j.b(lf.c):java.lang.Object");
    }
}
